parser grammar gTCGParser;

options {
    tokenVocab = gTCGLexer;
}


// ============================================================
// REGLA PRINCIPAL
// ============================================================

log
    : setup (NEWLINE
        turn
    |   gameEnd
    )*

    EOF
    ;


// ============================================================
// ENTRADAS PRINCIPALES
// ============================================================
    


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
    : PLAYER PLAYED card TO THE (ACTIVE SPOT | BENCH) DOT NEWLINE
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
    : drawAction
    | playAction
    | attachAction
    | evolveAction
    | attackAction
    | switchAction
    | retreatAction
    | shuffleAction
    | cardMovedAction
    | discardAction
    | prizeAction
    | moveToHandAction
    | activeSpotAction
    | knockoutAction
    | subAction
    | endTurn
    ;


// ============================================================
// ROBAR CARTAS
// ============================================================

drawAction
    : PLAYER DREW CARD_WORD DOT NEWLINE
    | PLAYER DREW A_SOMETHING CARD_WORD DOT NEWLINE
    | PLAYER DREW card DOT NEWLINE
    | PLAYER DREW NUMBER CARDS DOT NEWLINE
      subAction*
    ;


// ============================================================
// JUGAR CARTAS
// ============================================================

playAction
    : PLAYER PLAYED card (TO THE (BENCH | ACTIVE SPOT))? DOT NEWLINE
      subAction*
    ;


// ============================================================
// UNIR ENERGÍA
// ============================================================

attachAction
    : PLAYER ATTACHED card TO card
      (ON THE BENCH | IN THE ACTIVE SPOT)
      DOT NEWLINE
    ;


// ============================================================
// EVOLUCIONAR
// ============================================================

evolveAction
    : PLAYER EVOLVED card TO card
      (ON THE BENCH | IN THE ACTIVE SPOT)
      DOT NEWLINE
    ;


// ============================================================
// ATAQUES
// ============================================================

attackAction
    : PLAYER POSSESSIVE card
      USED attack DOT? NEWLINE?
      (ON PLAYER POSSESSIVE card
      FOR NUMBER DAMAGE DOT NEWLINE
      damageBreakdown?
      subAction*)?
    ;


// ------------------------------------------------------------
// Desglose de daño
// ------------------------------------------------------------

damageBreakdown
    : HYPHEN DAMAGE_BREAKDOWN COLON NEWLINE
      damageLine+ NEWLINE
    ;

damageLine
    : BULLET BASE_DAMAGE COLON NUMBER DAMAGE DOT? NEWLINE
    | BULLET LPAREN ITEM RPAREN card COLON NUMBER DAMAGE DOT? NEWLINE
    | BULLET TOTAL_DAMAGE COLON NUMBER DAMAGE DOT? NEWLINE
    ;


// ============================================================
// CAMBIAR POKÉMON ACTIVO
// ============================================================

switchAction
    : PLAYER PLAYED SWITCH DOT NEWLINE
      switchResult
      activeSpotAction?
    ;

switchResult
    : HYPHEN
      PLAYER POSSESSIVE card
      WAS? SWITCHED WITH
      PLAYER POSSESSIVE card
      TO BECOME THE ACTIVE POKEMON
      DOT NEWLINE
    ;


// ============================================================
// RETIRADA
// ============================================================

retreatAction
    : PLAYER RETIRED card TO THE BENCH DOT NEWLINE
      subAction*
    ;


// ============================================================
// BARAJAR
// ============================================================

shuffleAction
    : PLAYER SHUFFLED THEIR DECK DOT NEWLINE
    | PLAYER SHUFFLED NUMBER CARDS INTO THEIR DECK DOT NEWLINE
    | PLAYER SHUFFLED card INTO THEIR DECK DOT NEWLINE
    ;


// ============================================================
// DESCARTAR
// ============================================================

discardAction
    : PLAYER DISCARDED CARD DOT NEWLINE
    | PLAYER DISCARDED NUMBER CARDS DOT NEWLINE
      cardList?
    | NUMBER CARDS WERE DISCARDED FROM
      PLAYER POSSESSIVE card DOT NEWLINE
      cardList?
    | card WAS DISCARDED FROM
      PLAYER POSSESSIVE card DOT NEWLINE
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
      PLAYER POSSESSIVE card
      TO THEIR HAND DOT NEWLINE
    ;


// ============================================================
// POKÉMON ACTIVO
// ============================================================

activeSpotAction
    : PLAYER POSSESSIVE card
      IS NOW IN THE ACTIVE SPOT DOT NEWLINE
    ;


// ============================================================
// KNOCK OUT
// ============================================================

knockoutAction
    : PLAYER POSSESSIVE card
      WAS KNOCKED OUT EXCLAMATION NEWLINE
    ;

cardMovedAction
    : A_SOMETHING CARD_WORD WAS ADDED TO PLAYER POSSESSIVE HAND DOT NEWLINE
    | (CARD | SWITCH) WAS ADDED TO PLAYER POSSESSIVE HAND DOT NEWLINE
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
// - A card was added to DudeJaden's hand.
// ============================================================

subAction
    : HYPHEN subActionBody DOT NEWLINE
    (cardList | damageLine)*
    ;

subActionBody
    : PLAYER DREW card
    | PLAYER DREW A_SOMETHING CARD_WORD
    | PLAYER DREW NUMBER CARDS
    | PLAYER DREW NUMBER CARDS AND PLAYED THEM TO THE BENCH
    | PLAYER SHUFFLED THEIR DECK
    | PLAYER SHUFFLED NUMBER CARDS INTO THEIR DECK
    | PLAYER SHUFFLED card INTO THEIR DECK
    | PLAYER DISCARDED CARD
    | PLAYER DISCARDED NUMBER CARDS
    | NUMBER CARDS WERE DISCARDED FROM PLAYER POSSESSIVE card
    | card WAS DISCARDED FROM PLAYER POSSESSIVE card

    | PLAYER TAKE PRIZE CARD
    | PLAYER TAKE NUMBER PRIZE CARDS

    | PLAYER MOVED PLAYER POSSESSIVE card TO THEIR HAND

    | PLAYER POSSESSIVE CARD WAS SWITCHED WITH PLAYER POSSESSIVE CARD TO BECOME THE ACTIVE POKEMON
    | PLAYER ATTACHED CARD TO CARD ON THE BENCH
    | PLAYER ATTACHED CARD TO CARD IN THE ACTIVE SPOT
    | PLAYER POSSESSIVE CARD TAKE NUMBER DAMAGE
    | PLAYER EVOLVED CARD TO CARD IN THE ACTIVE SPOT

    | cardAddedToHand
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
    : BULLET cardListItem
      (COMMA cardListItem)*
      NEWLINE
    ;

cardListItem
    : card
    ;


// ============================================================
// VOCABULARIO
// ============================================================

card
    : CARD | SWITCH
    ;
// ============================================================
// ATAQUES
// ============================================================

attack
    : ATTACK
    ;


// ============================================================
// TOKEN AUXILIAR PARA "A card was added..."
// ============================================================

cardAddedToHand
    : ADDED
    ;