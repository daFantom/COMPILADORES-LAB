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
    | mulligan
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

mulligan
    : ( (OPPONENT | PLAYER) TAKE A_SOMETHING MULLIGAN DOT
    | (OPPONENT | PLAYER) TAKE NUMBER MULLIGAN DOT )
    NEWLINE
    mulliganCards
    ;

mulliganCards
    : HYPHEN CARDS REVEALED FROM MULLIGAN NUMBER NEWLINE
    cardList
    ;


// ------------------------------------------------------------
// Mano inicial
// ------------------------------------------------------------

openingHand
    : ( (OPPONENT | PLAYER) DREW NUMBER CARDS FOR THE OPENING HAND DOT NEWLINE
    |
      (OPPONENT | PLAYER) DREW NUMBER MORE_WORD CARDS BECAUSE (OPPONENT | PLAYER) TAKE AT LEAST NUMBER MULLIGAN DOT NEWLINE)
      drawnCards?
    ;

drawnCards
    : (HYPHEN NUMBER DRAWN CARDS DOT NEWLINE
    |
      HYPHEN (OPPONENT|PLAYER) DREW NUMBER CARDS DOT NEWLINE)
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
    | activateAction
    | putAction
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
    (DOT (OPPONENT | PLAYER) POSSESSIVE CARD TAKE NUMBER MORE_WORD DAMAGE BECAUSE OF POKEMON_TYPE WEAKNESS )?
    ;

// ------------------------------------------------------------
// Desglose de daño
// ------------------------------------------------------------

damageBreakdown
    : HYPHEN DAMAGE_BREAKDOWN COLON NEWLINE
    (damageBreakdownLine)+
    NEWLINE?
    ;

damageBreakdownLine
    : BULLET
    ( BASE_DAMAGE COLON NUMBER DAMAGE
    | TOTAL_DAMAGE COLON NUMBER DAMAGE
    | NUMBER POKEMON COLON NUMBER DAMAGE
    | LPAREN ITEM RPAREN CARD COLON NUMBER DAMAGE
    | NUMBER (ATTACHED | SELECTED) ENERGY COLON NUMBER DAMAGE
    | WEAKNESS TO POKEMON_TYPE COLON NUMBER DAMAGE
    | LPAREN ABILITY_WORD RPAREN ABILITY COLON '-'? NUMBER DAMAGE
    | LPAREN SUPPORTER_WORD RPAREN CARD COLON '-'? NUMBER DAMAGE
    | LPAREN ABILITY_WORD RPAREN ABILITY COLON '-'? NUMBER DAMAGE
    | LPAREN POKEMON_TOOL RPAREN CARD COLON '-'? NUMBER DAMAGE
    | LPAREN ATTACK_WORD RPAREN ATTACK COLON '-'? NUMBER DAMAGE
    )
    NEWLINE
    
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
    | (OPPONENT | PLAYER) MOVED (OPPONENT | PLAYER) POSSESSIVE NUMBER CARDS TO THEIR HAND
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
activateAction
    : CARD WAS ACTIVATED
    ;
putAction
    : (OPPONENT | PLAYER) PUT NUMBER DAMAGE COUNTERS ON (OPPONENT | PLAYER) POSSESSIVE CARD
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
    | OPPONENT TAKE ALL OF THEIR PRIZE_CARDS DOT (OPPONENT | PLAYER) WINS DOT
    | YOU CONCEDED DOT (OPPONENT | PLAYER) WINS DOT
    ;


// ============================================================
// LISTAS DE CARTAS
// ============================================================

cardList
    : BULLET CARD
      (COMMA CARD)*
      NEWLINE
    ;