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
    NEWLINE*
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
      mainTurnAction*
    ;


// ============================================================
// ACCIONES DE UN TURNO
// ============================================================

mainTurnAction
    :   turnActionBody (DOT|EXCLAMATION) NEWLINE
        (subTurnAction | damageBreakdown)*
    ;

subTurnAction
    : HYPHEN turnActionBody DOT NEWLINE
    (cardList)*
    ;

turnActionBody
    : drawAction
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
    | switchAction
    | knockoutAction
    | damagedAction
    | flippedAction
    | endTurn
    ;


// ============================================================
// ROBAR CARTAS
// ============================================================

drawAction
    : PLAYER DREW CARD_WORD
    | PLAYER DREW A_SOMETHING CARD_WORD
    | PLAYER DREW CARD
    | PLAYER DREW NUMBER CARD
    | PLAYER DREW NUMBER CARDS
    | PLAYER DREW NUMBER CARDS AND PLAYED THEM TO THE BENCH
    ;


// ============================================================
// JUGAR CARTAS
// ============================================================

playAction
    : PLAYER PLAYED CARD (TO THE (BENCH | ACTIVE SPOT | STADIUM SPOT))?
    ;


// ============================================================
// UNIR ENERGÍA
// ============================================================

attachAction
    : PLAYER ATTACHED CARD TO CARD (ON THE BENCH | IN THE ACTIVE SPOT)
    ;


// ============================================================
// EVOLUCIONAR
// ============================================================

evolveAction
    : PLAYER EVOLVED CARD TO CARD (ON THE BENCH | IN THE ACTIVE SPOT)
    ;


// ============================================================
// ATAQUES
// ============================================================

attackAction
    : PLAYER POSSESSIVE CARD USED ATTACK (ON PLAYER POSSESSIVE CARD FOR NUMBER DAMAGE)?
    ;

// ------------------------------------------------------------
// Desglose de daño
// ------------------------------------------------------------

damageBreakdown
    : HYPHEN DAMAGE_BREAKDOWN COLON NEWLINE 
    BULLET
    (
    NUMBER ATTACHED ENERGY COLON NUMBER DAMAGE NEWLINE
    | NUMBER SELECTED ENERGY COLON NUMBER DAMAGE NEWLINE
    |
    ( 
    BASE_DAMAGE COLON NUMBER DAMAGE NEWLINE
    damageBonusLine
    BULLET TOTAL_DAMAGE COLON NUMBER DAMAGE NEWLINE
    )

    )

    NEWLINE?
    ;

damageBonusLine
    : BULLET LPAREN ITEM RPAREN CARD COLON NUMBER DAMAGE NEWLINE
    | BULLET NUMBER (ATTACHED | SELECTED) ENERGY COLON NUMBER DAMAGE NEWLINE
    | ( BULLET LPAREN ABILITY_WORD RPAREN ABILITY COLON '-'? NUMBER DAMAGE NEWLINE
        BULLET NUMBER ATTACHED ENERGY COLON NUMBER DAMAGE NEWLINE)
    | ( BULLET LPAREN POKEMON_TOOL RPAREN CARD COLON '-'? NUMBER DAMAGE NEWLINE
        BULLET LPAREN ATTACK_WORD RPAREN ATTACK COLON '-'? NUMBER DAMAGE NEWLINE)
    ;

// ============================================================
// RETIRADA
// ============================================================

retreatAction
    : PLAYER RETIRED CARD TO THE BENCH
    ;


// ============================================================
// BARAJAR
// ============================================================

shuffleAction
    : PLAYER SHUFFLED THEIR DECK
    | PLAYER SHUFFLED NUMBER CARDS INTO THEIR DECK
    | PLAYER SHUFFLED CARD INTO THEIR DECK
    ;


// ============================================================
// DESCARTAR
// ============================================================

discardAction
    : PLAYER DISCARDED CARD
    | PLAYER DISCARDED NUMBER CARDS
    | NUMBER CARDS WERE DISCARDED FROM PLAYER POSSESSIVE CARD
    | CARD WAS DISCARDED FROM PLAYER POSSESSIVE CARD
    ;


// ============================================================
// PREMIOS
// ============================================================

prizeAction
    : PLAYER TAKE A_SOMETHING? PRIZE CARD_WORD
    | PLAYER TAKE NUMBER PRIZE_CARDS
    ;


// ============================================================
// MOVER CARTA A LA MANO
// ============================================================

moveToHandAction
    : PLAYER MOVED
      PLAYER POSSESSIVE CARD
      TO THEIR HAND
    ;


// ============================================================
// POKÉMON ACTIVO
// ============================================================

activeSpotAction
    : PLAYER POSSESSIVE CARD
      IS NOW IN THE ACTIVE SPOT
    ;


// ============================================================
// KNOCK OUT
// ============================================================

knockoutAction
    : PLAYER POSSESSIVE CARD WAS KNOCKED OUT
    ;

cardMovedAction
    : A_SOMETHING CARD_WORD WAS ADDED TO PLAYER POSSESSIVE HAND
    | CARD WAS ADDED TO PLAYER POSSESSIVE HAND
    ;

switchAction
    : PLAYER POSSESSIVE CARD WAS SWITCHED WITH PLAYER POSSESSIVE CARD TO BECOME THE ACTIVE POKEMON
    ;

damagedAction
    : PLAYER POSSESSIVE CARD TAKE NUMBER DAMAGE
    ;

flippedAction
    : PLAYER FLIPPED A_SOMETHING COIN AND IT LANDED ON (TAILS|HEADS)
    ;

// ============================================================
// FIN DE TURNO
// ============================================================

endTurn
    : PLAYER ENDED THEIR TURN
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