parser grammar gTCGParser;

options {
    tokenVocab = gTCGLexer;
}

player : (OPPONENT | PLAYER) ;
damageAmount : NUMBER ;


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
    : player CHOSE (HEADS | TAILS)
      FOR THE OPENING COIN FLIP DOT NEWLINE
    ;

coinToss
    : player WON THE COIN TOSS DOT NEWLINE
    ;

firstPlayer
    : player DECIDED TO GO FIRST DOT NEWLINE
    ;

mulligan
    : ( player TAKE A_SOMETHING MULLIGAN DOT
    | player TAKE NUMBER MULLIGAN DOT )
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
    : ( player DREW NUMBER CARDS FOR THE OPENING HAND DOT NEWLINE
    |
      player DREW NUMBER MORE_WORD (CARD_WORD | CARDS) BECAUSE player TAKE AT LEAST NUMBER MULLIGAN DOT NEWLINE)
      drawnCards?
    ;

drawnCards
    : (
      HYPHEN NUMBER DRAWN CARDS DOT NEWLINE
      |
      HYPHEN (OPPONENT|PLAYER) DREW NUMBER CARDS DOT NEWLINE
      |
      HYPHEN (OPPONENT|PLAYER) DREW CARD DOT NEWLINE
      )
      cardList?
    ;


// ------------------------------------------------------------
// Pokémon iniciales
// ------------------------------------------------------------

initialPokemon
    : player PLAYED CARD TO THE (ACTIVE SPOT | BENCH) DOT NEWLINE
    ;


// ============================================================
// TURNOS
// ============================================================

turn
    : player POSSESSIVE TURN NEWLINE
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
    | noAction
    ;


// ============================================================
// ROBAR CARTAS
// ============================================================

drawAction
    : player DREW CARD_WORD
    | player DREW A_SOMETHING CARD_WORD
    | player DREW CARD
    | player DREW NUMBER CARD
    | player DREW NUMBER CARDS
    | player DREW NUMBER CARDS AND PLAYED THEM TO THE BENCH
    ;


// ============================================================
// JUGAR CARTAS
// ============================================================

playAction
    : player PLAYED CARD (TO THE (BENCH | ACTIVE SPOT | STADIUM SPOT))?
    ;


// ============================================================
// UNIR ENERGÍA
// ============================================================

attachAction
    : player ATTACHED CARD TO CARD (ON THE BENCH | IN THE ACTIVE SPOT)
    ;


// ============================================================
// EVOLUCIONAR
// ============================================================

evolveAction
    : player EVOLVED CARD TO CARD (ON THE BENCH | IN THE ACTIVE SPOT)
    ;


// ============================================================
// ATAQUES
// ============================================================

attackAction
    : player POSSESSIVE CARD USED ATTACK (ON player POSSESSIVE CARD FOR damageAmount DAMAGE)?
    (DOT player POSSESSIVE CARD TAKE NUMBER MORE_WORD DAMAGE BECAUSE OF POKEMON_TYPE WEAKNESS )?
    ;

// ------------------------------------------------------------
// Desglose de daño
// ------------------------------------------------------------

damageBreakdown
    : HYPHEN DAMAGE_BREAKDOWN COLON? NEWLINE
    (damageBreakdownLine)+
    NEWLINE?
    ;

damageBreakdownLine
    : BULLET
    ( BASE_DAMAGE COLON? damageAmount DAMAGE
    | TOTAL_DAMAGE COLON? damageAmount DAMAGE
    | NUMBER POKEMON COLON? damageAmount DAMAGE
    | LPAREN ITEM RPAREN CARD COLON? damageAmount DAMAGE
    | NUMBER (ATTACHED | SELECTED) ENERGY COLON? damageAmount DAMAGE
    | WEAKNESS TO POKEMON_TYPE COLON? damageAmount DAMAGE
    | LPAREN ABILITY_WORD RPAREN ABILITY COLON? '-'? damageAmount DAMAGE
    | LPAREN SUPPORTER_WORD RPAREN CARD COLON? '-'? damageAmount DAMAGE
    | LPAREN ABILITY_WORD RPAREN ABILITY COLON? '-'? damageAmount DAMAGE
    | LPAREN POKEMON_TOOL RPAREN CARD COLON? '-'? damageAmount DAMAGE
    | LPAREN ATTACK_WORD RPAREN ATTACK COLON? '-'? damageAmount DAMAGE
    )
    NEWLINE
    
    ;

// ============================================================
// RETIRADA
// ============================================================

retreatAction
    : player RETIRED CARD TO THE BENCH
    ;


// ============================================================
// BARAJAR
// ============================================================

shuffleAction
    : player SHUFFLED THEIR DECK
    | player SHUFFLED NUMBER CARDS INTO THEIR DECK
    | player SHUFFLED CARD INTO THEIR DECK
    ;


// ============================================================
// DESCARTAR
// ============================================================

discardAction
    : player DISCARDED CARD
    | player DISCARDED NUMBER CARDS
    | NUMBER CARDS WERE DISCARDED FROM player POSSESSIVE CARD
    | CARD WAS DISCARDED FROM player POSSESSIVE CARD
    ;


// ============================================================
// PREMIOS
// ============================================================

prizeAction
    : player TAKE A_SOMETHING? PRIZE CARD_WORD
    | player TAKE NUMBER PRIZE_CARDS
    ;


// ============================================================
// MOVER CARTA A LA MANO
// ============================================================

moveToHandAction
    : player MOVED
      player POSSESSIVE CARD
      TO THEIR HAND
    ;


// ============================================================
// POKÉMON ACTIVO
// ============================================================

activeSpotAction
    : player POSSESSIVE CARD
      IS NOW IN THE ACTIVE SPOT
    ;


// ============================================================
// KNOCK OUT
// ============================================================

knockoutAction
    : player POSSESSIVE CARD WAS KNOCKED OUT
    ;

cardMovedAction
    : A_SOMETHING CARD_WORD WAS ADDED TO player POSSESSIVE HAND
    | CARD WAS ADDED TO player POSSESSIVE HAND
    | player MOVED player POSSESSIVE NUMBER CARDS TO THEIR HAND
    ;

switchAction
    : player POSSESSIVE CARD WAS SWITCHED WITH player POSSESSIVE CARD TO BECOME THE ACTIVE POKEMON
    ;

damagedAction
    : player POSSESSIVE CARD TAKE damageAmount DAMAGE
    ;

flippedAction
    : player FLIPPED A_SOMETHING COIN AND IT LANDED ON (TAILS|HEADS)
    ;
choiceAction
    : player CHOSE ATTACK
    ;
specialConditionAction
    : player POSSESSIVE CARD IS NOW SPECIAL_CONDITION
    ;
activateAction
    : CARD WAS ACTIVATED
    ;
putAction
    : player PUT damageAmount DAMAGE COUNTERS ON player POSSESSIVE CARD
    ;

// ============================================================
// FIN DE TURNO
// ============================================================

endTurn
    : player ENDED THEIR TURN
    ;

noAction
    : player NO_ACTION
    ;


// ============================================================
// FIN DE PARTIDA
// ============================================================

gameEnd
    : ALL PRIZE_CARDS TAKEN DOT player WINS DOT
    | OPPONENT CONCEDED DOT player WINS DOT
    | OPPONENT TAKE ALL OF THEIR PRIZE_CARDS DOT player WINS DOT
    | YOU CONCEDED DOT player WINS DOT
    ;


// ============================================================
// LISTAS DE CARTAS
// ============================================================

cardList
    : BULLET CARD
      (COMMA CARD)*
      NEWLINE
    ;