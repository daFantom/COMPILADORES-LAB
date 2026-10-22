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
    : (OPPONENT | PLAYER) CHOSE (HEADS | TAILS)
      FOR THE OPENING COIN FLIP DOT NEWLINE
    ;


coinToss
    : (OPPONENT | PLAYER) WON THE COIN TOSS DOT NEWLINE
    ;

firstPlayer
    : (OPPONENT | PLAYER) DECIDED TO GO FIRST DOT NEWLINE
    ;


// ------------------------------------------------------------
// Mano inicial
// ------------------------------------------------------------

openingHand
    : (OPPONENT | PLAYER) DREW NUMBER CARDS FOR THE OPENING HAND DOT NEWLINE
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
    : (OPPONENT | PLAYER) PLAYED CARD TO THE (ACTIVE SPOT | BENCH) DOT NEWLINE
    ;


// ============================================================
// TURNOS
// ============================================================

turn
    : (OPPONENT | PLAYER) POSSESSIVE TURN NEWLINE
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
    : HYPHEN turnActionBody DOT? NEWLINE
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
    | choiceAction
    | specialConditionAction
    | endTurn
    ;


// ============================================================
// ROBAR CARTAS
// ============================================================

drawAction
    : (OPPONENT | PLAYER) DREW CARD_WORD
    | (OPPONENT | PLAYER) DREW A_SOMETHING CARD_WORD
    | (OPPONENT | PLAYER) DREW CARD
    | (OPPONENT | PLAYER) DREW NUMBER CARD
    | (OPPONENT | PLAYER) DREW NUMBER CARDS
    | (OPPONENT | PLAYER) DREW NUMBER CARDS AND PLAYED THEM TO THE BENCH
    ;


// ============================================================
// JUGAR CARTAS
// ============================================================

playAction
    : (OPPONENT | PLAYER) PLAYED CARD (TO THE (BENCH | ACTIVE SPOT | STADIUM SPOT))?
    ;


// ============================================================
// UNIR ENERGÍA
// ============================================================

attachAction
    : (OPPONENT | PLAYER) ATTACHED CARD TO CARD (ON THE BENCH | IN THE ACTIVE SPOT)
    ;


// ============================================================
// EVOLUCIONAR
// ============================================================

evolveAction
    : (OPPONENT | PLAYER) EVOLVED CARD TO CARD (ON THE BENCH | IN THE ACTIVE SPOT)
    ;


// ============================================================
// ATAQUES
// ============================================================

attackAction
    : (OPPONENT | PLAYER) POSSESSIVE CARD USED ATTACK (ON (OPPONENT | PLAYER) POSSESSIVE CARD FOR NUMBER DAMAGE)?
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
    : (OPPONENT | PLAYER) RETIRED CARD TO THE BENCH
    ;


// ============================================================
// BARAJAR
// ============================================================

shuffleAction
    : (OPPONENT | PLAYER) SHUFFLED THEIR DECK
    | (OPPONENT | PLAYER) SHUFFLED NUMBER CARDS INTO THEIR DECK
    | (OPPONENT | PLAYER) SHUFFLED CARD INTO THEIR DECK
    ;


// ============================================================
// DESCARTAR
// ============================================================

discardAction
    : (OPPONENT | PLAYER) DISCARDED CARD
    | (OPPONENT | PLAYER) DISCARDED NUMBER CARDS
    | NUMBER CARDS WERE DISCARDED FROM (OPPONENT | PLAYER) POSSESSIVE CARD
    | CARD WAS DISCARDED FROM (OPPONENT | PLAYER) POSSESSIVE CARD
    ;


// ============================================================
// PREMIOS
// ============================================================

prizeAction
    : (OPPONENT | PLAYER) TAKE A_SOMETHING? PRIZE CARD_WORD
    | (OPPONENT | PLAYER) TAKE NUMBER PRIZE_CARDS
    ;


// ============================================================
// MOVER CARTA A LA MANO
// ============================================================

moveToHandAction
    : (OPPONENT | PLAYER) MOVED
      (OPPONENT | PLAYER) POSSESSIVE CARD
      TO THEIR HAND
    ;


// ============================================================
// POKÉMON ACTIVO
// ============================================================

activeSpotAction
    : (OPPONENT | PLAYER) POSSESSIVE CARD
      IS NOW IN THE ACTIVE SPOT
    ;


// ============================================================
// KNOCK OUT
// ============================================================

knockoutAction
    : (OPPONENT | PLAYER) POSSESSIVE CARD WAS KNOCKED OUT
    ;

cardMovedAction
    : A_SOMETHING CARD_WORD WAS ADDED TO (OPPONENT | PLAYER) POSSESSIVE HAND
    | CARD WAS ADDED TO (OPPONENT | PLAYER) POSSESSIVE HAND
    ;

switchAction
    : (OPPONENT | PLAYER) POSSESSIVE CARD WAS SWITCHED WITH (OPPONENT | PLAYER) POSSESSIVE CARD TO BECOME THE ACTIVE POKEMON
    ;

damagedAction
    : (OPPONENT | PLAYER) POSSESSIVE CARD TAKE NUMBER DAMAGE
    ;

flippedAction
    : (OPPONENT | PLAYER) FLIPPED A_SOMETHING COIN AND IT LANDED ON (TAILS|HEADS)
    ;
choiceAction
    : (OPPONENT | PLAYER) CHOSE ATTACK
    ;
specialConditionAction
    : (OPPONENT | PLAYER) POSSESSIVE CARD IS NOW SPECIAL_CONDITION
    ;

// ============================================================
// FIN DE TURNO
// ============================================================

endTurn
    : (OPPONENT | PLAYER) ENDED THEIR TURN
    ;


// ============================================================
// FIN DE PARTIDA
// ============================================================

gameEnd
    : ALL PRIZE_CARDS TAKEN DOT (OPPONENT | PLAYER) WINS DOT
    | OPPONENT CONCEDED DOT (OPPONENT | PLAYER) WINS DOT
    ;


// ============================================================
// LISTAS DE CARTAS
// ============================================================

cardList
    : BULLET CARD
      (COMMA CARD)*
      NEWLINE
    ;