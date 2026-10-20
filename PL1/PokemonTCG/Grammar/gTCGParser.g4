parser grammar gTCGParser;

options {
    tokenVocab = gTCGLexer;
}


// ============================================================
// REGLA PRINCIPAL
// ============================================================

log
    : setup 
    (NEWLINE turn)*
    gameEnd

    EOF
    ;


// ============================================================
// SETUP
// ============================================================

setup
    : SETUP NEWLINE
      setupAction*
    ;


setupAction
    : coinChoice
    | coinToss
    | firstPlayer
    | openingHand
    | initialPokemon
    ;

// ------------------------------------------------------------
// Moneda
// ------------------------------------------------------------

coinChoice
    : PLAYER CHOSE (HEADS | TAILS)
      FOR THE OPENING COIN FLIP DOT NEWLINE
    ;


coinToss
    : PLAYER WON THE COIN TOSS DOT NEWLINE
    ;

firstPlayer
    : PLAYER DECIDED TO GO FIRST DOT NEWLINE
    ;


// ------------------------------------------------------------
// Mano inicial
// ------------------------------------------------------------

openingHand
    : PLAYER DREW NUMBER CARDS FOR THE OPENING HAND DOT NEWLINE
      drawnCards?
    ;

drawnCards
    : HYPHEN NUMBER DRAWN CARDS DOT NEWLINE
      cardList?
    ;


// ------------------------------------------------------------
// Pokémon iniciales
// ------------------------------------------------------------

initialPokemon
    : PLAYER PLAYED CARD TO THE (ACTIVE SPOT | BENCH) DOT NEWLINE
    ;


// ============================================================
// TURNOS
// ============================================================

turn
    : PLAYER POSSESSIVE TURN NEWLINE
      turnAction*
    ;


// ============================================================
// ACCIONES DE UN TURNO
// ============================================================

turnAction
    : (drawAction
    | playAction
    | attachAction
    | evolveAction
    | attackAction
    | retreatAction
    | shuffleAction
    | cardMovedAction
    | discardAction
    | prizeAction
    | moveToHandAction
    | activeSpotAction
    | knockoutAction
    | endTurn)
    subAction*
    ;


// ============================================================
// ROBAR CARTAS
// ============================================================

drawAction
    : PLAYER DREW CARD_WORD DOT NEWLINE
    | PLAYER DREW A_SOMETHING CARD_WORD DOT NEWLINE
    | PLAYER DREW CARD DOT NEWLINE
    | PLAYER DREW NUMBER CARDS DOT NEWLINE
    ;


// ============================================================
// JUGAR CARTAS
// ============================================================

playAction
    : PLAYER PLAYED CARD (TO THE (BENCH | ACTIVE SPOT))? DOT NEWLINE
    ;


// ============================================================
// UNIR ENERGÍA
// ============================================================

attachAction
    : PLAYER ATTACHED CARD TO CARD
      (ON THE BENCH | IN THE ACTIVE SPOT)
      DOT NEWLINE
    ;


// ============================================================
// EVOLUCIONAR
// ============================================================

evolveAction
    : PLAYER EVOLVED CARD TO CARD
      (ON THE BENCH | IN THE ACTIVE SPOT)
      DOT NEWLINE
    ;


// ============================================================
// ATAQUES
// ============================================================

attackAction
    : PLAYER POSSESSIVE CARD
      USED ATTACK ( 
        DOT NEWLINE
        | 
        ON PLAYER POSSESSIVE CARD FOR NUMBER DAMAGE DOT NEWLINE
        damageBreakdown?
         )
    ;

// ------------------------------------------------------------
// Desglose de daño
// ------------------------------------------------------------

damageBreakdown
    : HYPHEN 
    DAMAGE_BREAKDOWN 
    COLON 
    NEWLINE
    BULLET BASE_DAMAGE COLON NUMBER DAMAGE NEWLINE
    damageBonusLine
    BULLET TOTAL_DAMAGE COLON NUMBER DAMAGE NEWLINE
    NEWLINE
    ;

damageBonusLine
    : BULLET LPAREN ITEM RPAREN CARD COLON NUMBER DAMAGE NEWLINE
    ;

// ============================================================
// RETIRADA
// ============================================================

retreatAction
    : PLAYER RETIRED CARD TO THE BENCH DOT NEWLINE
    ;


// ============================================================
// BARAJAR
// ============================================================

shuffleAction
    : PLAYER SHUFFLED THEIR DECK DOT NEWLINE
    | PLAYER SHUFFLED NUMBER CARDS INTO THEIR DECK DOT NEWLINE
    | PLAYER SHUFFLED CARD INTO THEIR DECK DOT NEWLINE
    ;


// ============================================================
// DESCARTAR
// ============================================================

discardAction
    : PLAYER DISCARDED CARD DOT NEWLINE
    | PLAYER DISCARDED NUMBER CARDS DOT NEWLINE
      cardList?
    | NUMBER CARDS WERE DISCARDED FROM
      PLAYER POSSESSIVE CARD DOT NEWLINE
      cardList?
    | CARD WAS DISCARDED FROM
      PLAYER POSSESSIVE CARD DOT NEWLINE
    ;


// ============================================================
// PREMIOS
// ============================================================

prizeAction
    : PLAYER TAKE A_SOMETHING? PRIZE CARD_WORD DOT NEWLINE
    | PLAYER TAKE NUMBER PRIZE_CARDS DOT NEWLINE
    ;


// ============================================================
// MOVER CARTA A LA MANO
// ============================================================

moveToHandAction
    : PLAYER MOVED
      PLAYER POSSESSIVE CARD
      TO THEIR HAND DOT NEWLINE
    ;


// ============================================================
// POKÉMON ACTIVO
// ============================================================

activeSpotAction
    : PLAYER POSSESSIVE CARD
      IS NOW IN THE ACTIVE SPOT DOT NEWLINE
    ;


// ============================================================
// KNOCK OUT
// ============================================================

knockoutAction
    : PLAYER POSSESSIVE CARD WAS KNOCKED OUT EXCLAMATION NEWLINE
    ;

cardMovedAction
    : A_SOMETHING CARD_WORD WAS ADDED TO PLAYER POSSESSIVE HAND DOT NEWLINE
    | CARD WAS ADDED TO PLAYER POSSESSIVE HAND DOT NEWLINE
    ;


// ============================================================
// SUBACCIONES
// ============================================================
//
// Ejemplos:
//
// - DudeJaden drew Riolu.
// - DudeJaden shuffled their deck.
// - 2 cards were discarded...
// - DudeJaden took 3 Prize cards.
// - A CARD was added to DudeJaden's hand.
// ============================================================

subAction
    : HYPHEN subActionBody DOT NEWLINE
    (cardList)*
    ;

subActionBody
    : PLAYER DREW CARD
    | PLAYER DREW A_SOMETHING CARD_WORD
    | PLAYER DREW NUMBER CARDS
    | PLAYER DREW NUMBER CARDS AND PLAYED THEM TO THE BENCH
    | PLAYER SHUFFLED THEIR DECK
    | PLAYER SHUFFLED NUMBER CARDS INTO THEIR DECK
    | PLAYER SHUFFLED CARD INTO THEIR DECK
    | PLAYER DISCARDED CARD
    | PLAYER DISCARDED NUMBER CARDS
    | NUMBER CARDS WERE DISCARDED FROM PLAYER POSSESSIVE CARD
    | CARD WAS DISCARDED FROM PLAYER POSSESSIVE CARD

    | PLAYER TAKE PRIZE CARD
    | PLAYER TAKE NUMBER PRIZE CARDS

    | PLAYER MOVED PLAYER POSSESSIVE CARD TO THEIR HAND

    | PLAYER POSSESSIVE CARD WAS SWITCHED WITH PLAYER POSSESSIVE CARD TO BECOME THE ACTIVE POKEMON
    | PLAYER ATTACHED CARD TO CARD ON THE BENCH
    | PLAYER ATTACHED CARD TO CARD IN THE ACTIVE SPOT
    | PLAYER POSSESSIVE CARD TAKE NUMBER DAMAGE
    | PLAYER EVOLVED CARD TO CARD IN THE ACTIVE SPOT
    ;


// ============================================================
// FIN DE TURNO
// ============================================================

endTurn
    : PLAYER ENDED THEIR TURN DOT NEWLINE
    ;


// ============================================================
// FIN DE PARTIDA
// ============================================================

gameEnd
    : ALL PRIZE_CARDS TAKEN DOT PLAYER WINS DOT
    | OPPONENT CONCEDED DOT PLAYER WINS DOT
    ;


// ============================================================
// LISTAS DE CARTAS
// ============================================================

cardList
    : BULLET CARD
      (COMMA CARD)*
      NEWLINE
    ;