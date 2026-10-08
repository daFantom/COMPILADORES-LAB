grammar CminusParser;

import CminusLexer;

/*  Cuerpo del programa */

prog: declaration_list EOF ;

/*  Todos los programas deben estar formados por declaraciones. */

declaration_list: declaration+ ;

declaration: var_declaration | func_declaration ;

/*  Las variables se declaran con su tipo e identificador.
    "int a = 0;" No está soportado en la especificación orignal de C-*/

var_declaration:    ( (INT_TYPE | CHAR_TYPE | BOOL_TYPE)  ID
                |   (INT_TYPE   ID OBRACKETS INT CBRACKETS) )
                    SC
                ;
/*  Las funciones deben ser declaradas con su cuerpo.
    Prototipos de funciones no está soportado en la especificación de C-*/
func_declaration:   (INT_TYPE | CHAR_TYPE | BOOL_TYPE | VOID_TYPE) 
                    ID OPAREN params CPAREN compound_stmt ;

params: param_list | VOID_TYPE ;

param_list: param (COMMA param)* ;

/* Parametros permitdos en las funciones. */
param: (INT_TYPE | CHAR_TYPE | BOOL_TYPE | VOID_TYPE) ID | INT_TYPE ID OBRACKETS CBRACKETS ;

/*  Cuerpo de una función. Notese que unicamente se permite declaración de variables y no de funciones.
    Funciones anidadas no está soportado en la especificación de C- */
compound_stmt
    : OBRACES local_declarations? statment_list? CBRACES
    ;

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
expression_stmt: (expression SC) | SC ;

/*  Instrucción if.
*/
selection_stmt
    : IF OPAREN expression CPAREN statment (ELSE statment)?
    ;

/*  Instrucción de iteración (For o While).
*/
iteration_stmt: (FOR for_cond | WHILE while_cond) (compound_stmt | statment) ;

for_cond: OPAREN expression? SC expression? SC expression? CPAREN ;

while_cond: OPAREN expression CPAREN ;

/*  Instrucción "return".
*/
return_stmt: RET expression SC | RET SC ;

/*  Expresión que define una asignación, una operación o un valor. */
expression: var ASSIGN expression | simple_expression ;

var: ID | (ID OBRACKETS expression CBRACKETS) ;

simple_expression
    : logical_or_expression
    ;

logical_or_expression
    : logical_and_expression (OR logical_and_expression)*
    ;

logical_and_expression
    : relational_expression (AND relational_expression)*
    ;

relational_expression
    : additive_expression (COMP additive_expression)?
    ;

additive_expression
    : factor_expression ((PLUS | MINUS) factor_expression)*
    ;

factor_expression
    : unary_expression ((MUL | DIV | MOD) unary_expression)*
    ;

unary_expression:       PLUS unary_expression
                    |   MINUS unary_expression
                    |   NOT unary_expression
                    |   value
                    ;

value:      OPAREN expression CPAREN
        |   INT
        |   BOOL
        |   CHAR
        |   var
        |   call
        ;

/*  LLamadas a función. */
call: ID OPAREN args CPAREN ;

args: args_list? ;
args_list: expression (COMMA expression)* ;