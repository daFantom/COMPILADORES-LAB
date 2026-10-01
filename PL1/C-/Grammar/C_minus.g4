grammar C_minus;

prog:  declaration_list+ ;

declaration_list: declaration+ ;

declaration: var_declaration | func_declaration ;

var_declaration:    (INT_TYPE | CHAR_TYPE | BOOL_TYPE)  ID
                |   (INT_TYPE   ID'['NUM']') 
                    ';'
                ;

func_declaration:   (INT_TYPE | CHAR_TYPE | BOOL_TYPE | VOID_TYPE) 
                    ID '(' params ')' compound_stmt ;

params: param_list | VOID_TYPE ;

param_list: param_list',' param | param ;

param: (INT_TYPE | CHAR_TYPE | BOOL_TYPE | VOID_TYPE) ID | INT_TYPE ID'['']' ;

compound_stmt: '{' (local_declarations | statment_list)* '}' ;

local_declarations: var_declaration+;

statment_list: statment+ ;

statment: expression_stmt | compound_stmt | selection_stmt | iteration_stmt | return_stmt | inputfun | outputfun ;

expression_stmt: (expression ';') | ';' ;

selection_stmt: (IF '(' simple_expression ')' statment ELSE statment) | (IF '(' simple_expression ')' statment) ;

iteration_stmt: (FOR for_cond | WHILE while_cond) (compound_stmt | statment) ;

for_cond: '(' expression? ';' expression? ';' expression? ')' ;

while_cond: '(' expression ')' ;

return_stmt: RET expression ';' | RET ';' ;

expression: ( (var EQUAL)+ expression | simple_expression) ;

var: ID | (ID '[' expression ']') ;

simple_expression: (additive_expression COMP simple_expression) | additive_expression ;

additive_expression: (term ADDOP additive_expression) | (MINUS? | NEG*) term ;

term: (value MULOP term) | value ;

value: BOOL | NUM | CHAR | var | call | '(' simple_expression ')' ;

call: ID '(' args ')' ;

args: args_list* ;

args_list: args_list ',' expression | expression ;

inputfun: 'input' '(' ')' ';';
outputfun: 'output' '(' (var | NUM | CHAR | BOOL | simple_expression) ')' ';' ;

SINGLE_QUOTES: '\'';

IF: 'if';
ELSE: 'else';

FOR: 'for';
WHILE: 'while';

BOOL: (BOOL_TRUE | BOOL_FALSE) ;

RET         : 'return';
INT_TYPE    : 'int';
CHAR_TYPE   : 'char';
BOOL_TYPE   : 'bool';
BOOL_TRUE   : 'true';
BOOL_FALSE  : 'false';
VOID_TYPE   : 'void';

CHAR: SINGLE_QUOTES (LETRA|DIGIT|'\\n')? SINGLE_QUOTES;
ID: LETRA(LETRA|NUM)*;
NUM: DIGIT+;

EQUAL:  '=';
COMP:   ( '<' |'>' | '<='  |'>=' |'==' |'!=' | '&&' | '||');
NEG:    ('!');
MINUS:  ('-');
ADDOP:  ('+' | '-');
MULOP:  ('*' | '/' | '%');

fragment LETRA: [a-zA-Z];
fragment DIGIT: [0-9];

COMMENT: '/*' .*? '*/' -> skip ;
WS: [ \r\n\t]->skip;