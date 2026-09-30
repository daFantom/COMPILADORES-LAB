grammar C_minus;

ELSE : 'else';
IF: 'if';
INT_VAR : 'int';
RET: 'return';
VOID_TYPE: 'void';
WHILE: 'while';
ID: LETRA LETRA*;
NUM: DIGIT DIGIT*;
fragment LETRA: [a-zA-Z];
fragment DIGIT: [0-9];
WS: [ \n\t]->skip;