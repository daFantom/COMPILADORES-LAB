grammar CminusParser;

import CminusLexer;

/*  Cuerpo del programa */

prog:  declaration_list+ ;

/*  Todos los programas deben estar formados por declaraciones. */

declaration_list: declaration+ ;

declaration: var_declaration | func_declaration ;

/*  Las variables se declaran con su tipo e identificador.
    "int a = 0;" No está soportado en la especificación orignal de C-*/

var_declaration:    ( (INT_TYPE | CHAR_TYPE | BOOL_TYPE)  ID
                |   (INT_TYPE   ID'['INT']') )
                    ';'
                ;
/*  Las funciones deben ser declaradas con su cuerpo.
    Prototipos de funciones no está soportado en la especificación de C-*/
func_declaration:   (INT_TYPE | CHAR_TYPE | BOOL_TYPE | VOID_TYPE) 
                    ID '(' params ')' compound_stmt ;

params: param_list | VOID_TYPE ;

param_list: param_list',' param | param ;

/* Parametros permitdos en las funciones. */
param: (INT_TYPE | CHAR_TYPE | BOOL_TYPE | VOID_TYPE) ID | INT_TYPE ID'['']' ;

/*  Cuerpo de una función. Notese que unicamente se permite declaración de variables y no de funciones.
    Funciones anidadas no está soportado en la especificación de C- */
compound_stmt: '{' (local_declarations | statment_list)* '}' ;

/*  Declaración de variables dentro de una función. */
local_declarations: var_declaration+;

/*  Declaración de lineas de instrucciones. */
statment_list: statment+ ;

/*  Tipos de instrucciones aceptadas. */
statment: expression_stmt 
        | compound_stmt 
        | selection_stmt 
        | iteration_stmt 
        | return_stmt 
        ;

/*  Instrucción común de expresión.
    Ej: "x = 1 + y;"
        "x = i && j;"
        "x = x * y + z;" 
*/
expression_stmt: (expression ';') | ';' ;

/*  Instrucción if.
*/
selection_stmt:     (IF '(' simple_expression ')' statment ELSE statment) 
                |   (IF '(' simple_expression ')' statment) ;

/*  Instrucción de iteración (For o While).
*/
iteration_stmt: (FOR for_cond | WHILE while_cond) (compound_stmt | statment) ;

for_cond: '(' expression? ';' expression? ';' expression? ')' ;

while_cond: '(' expression ')' ;

/*  Instrucción "return".
*/
return_stmt: RET expression ';' | RET ';' ;

/*  Expresión que define una asignación, una operación o un valor. */
expression: ( (var ASSIGN)+ expression | simple_expression) ;

var: ID | (ID '[' expression ']') ;

simple_expression: simple_expression COMP logical_expression | logical_expression;

logical_expression:     logical_expression AND additive_expression
                    |   logical_expression OR additive_expression
                    |   additive_expression
                    ;

additive_expression:    additive_expression (PLUS|MINUS) factor_expression 
                    |   factor_expression
                    ;

factor_expression:      
                        factor_expression (MUL|DIV|MOD) unary_expression
                    |   unary_expression
                    ;

unary_expression:       PLUS unary_expression
                    |   MINUS unary_expression
                    |   NOT unary_expression
                    |   value
                    ;

value:      '(' simple_expression ')'
        |   INT
        |   BOOL
        |   CHAR
        |   var
        |   call
        ;

/*  LLamadas a función. */
call: ID '(' args ')' ;

args: args_list* ;

args_list: args_list ',' expression | expression ;