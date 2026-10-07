lexer grammar gTCGLexer;

/*  TOKENS: */

// Palabras reservadas
TEXT            : [a-zA-Z']+            ;
INT             : [0-9]+                ;
BENCH           : 'Bench'               ;
ACTIVESPOT      : 'Active Spot'         ;
DREW_ACTION     : 'drew'                ;
START_TURN      : 'Turn'                ;
END_TURN        : 'ended their turn.'   ;

// Símbolos

ENDLINE         : '.'                   ;
OPEN_PARENTH    : '('                   ;
CLOSE_PARENTH   : ')'                   ;
UNDERSCORE      : '_'                   ;
DASH            : '-'                   ;
COMMA           : ','                   ;
BULLET_POINT    : '\u2022'              ;  

// Espacios en blanco

INTRO           : [\r\n]+               ;
WS              : [ \t]+->skip          ;   // siempre último
