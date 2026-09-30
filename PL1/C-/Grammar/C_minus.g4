grammar C_minus;

prog:  declaration_list+ ;

declaration_list: declaration+ ;

declaration: var_declaration | func_declaration ;

var_declaration: (INT_VAR ID ';') | (INT_VAR ID'['NUM']' ';') ;

func_declaration: (INT_VAR | VOID_TYPE) ID '(' params ')' compound_stmt ;

params: param_list | VOID_TYPE ;

param_list: param_list',' param | param ;

param: (INT_VAR | VOID_TYPE) ID | INT_VAR ID'['']' ;

compound_stmt: '{' (local_declarations | statment_list)* '}' ;

local_declarations: var_declaration+;

statment_list: statment+ ;

statment: expression_stmt | compound_stmt | selection_stmt | iteration_stmt | return_stmt | inputfun | outputfun ;

expression_stmt: (expression ';') | ';' ;

selection_stmt: (IF '(' simple_expression ')' statment ELSE statment) | (IF '(' simple_expression ')' statment) ;

iteration_stmt: WHILE '(' simple_expression ')' statment ;

return_stmt: RET expression ';' | RET ';' ;

expression: ( (var EQUAL)+ expression | simple_expression) ;

var: ID | (ID '[' expression ']') ;

simple_expression: (additive_expression COMP additive_expression) | additive_expression ;

additive_expression: (term ADDOP additive_expression) | term ;

term: (value MULOP term) | value ;

value: '(' simple_expression ')' | var | call | NUM ;

call: ID '(' args ')' ;

args: args_list* ;

args_list: args_list ',' expression | expression ;

inputfun: 'input' '(' VOID_TYPE ')' ';';
outputfun: 'output' '(' (var | NUM | additive_expression+) ')' ';' ;

IF: 'if';
ELSE: 'else';

WHILE: 'while';

RET         : 'return';
INT_VAR     : 'int';
VOID_TYPE   : 'void';

fragment LETRA: [a-zA-Z];
fragment DIGIT: [0-9];

ID: LETRA+;
NUM: DIGIT+;

EQUAL : '=';
COMP: ( '<' |'>' | '<='  |'>=' |'==' |'!=');
ADDOP: ('+' | '-');
MULOP: ('*' | '/');

COMMENT: '/*' .*? '*/' -> skip ;
WS: [ \r\n\t]->skip;