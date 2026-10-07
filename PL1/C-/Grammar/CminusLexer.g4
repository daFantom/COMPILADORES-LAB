lexer grammar CminusLexer;

IF: 'if';
ELSE: 'else';

FOR: 'for';
WHILE: 'while';

RET         : 'return';

VOID_TYPE   : 'void';
INT_TYPE    : 'int';
CHAR_TYPE   : 'char';
BOOL_TYPE   : 'bool';

BOOL: (BOOL_TRUE | BOOL_FALSE) ;
BOOL_TRUE   : 'true';
BOOL_FALSE  : 'false';


CHAR: SINGLE_QUOTES (LETRA|DIGIT|'\\n')? SINGLE_QUOTES;
INT: DIGIT+;

ID: LETRA(LETRA|DIGIT)*;

ASSIGN: '=';

PLUS:   '+';
MINUS:  '-';
MUL:    '*';
DIV:    '/';
MOD:    '%';

LE      : '<=';
GE      : '>=';
LT      : '<';
GT      : '>';
EQUAL   : '==';
NEQUAL  : '!=';
COMP:   ( LE | LT | GE | GT | EQUAL | NEQUAL );
AND     :    '&&';
OR      :     '||';
NOT     :    '!';

COMMA       : ',';
SC          : ';';
OPAREN      : '(';
CPAREN      : ')';
OBRACKETS   : '[';
CBRACKETS   : ']';
OBRACES     : '{';
CBRACES     : '}';

fragment LETRA: [a-zA-Z];
fragment DIGIT: [0-9];
fragment SINGLE_QUOTES: '\'';

COMMENT: '/*' .*? '*/' -> skip ;
WS: [ \r\n\t]->skip;