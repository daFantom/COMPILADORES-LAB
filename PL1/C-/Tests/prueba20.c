/* Errores flagantes de Sintaxis */

/*  Error sintactico. Faltan los brackes { } para definir el cuerpo de la funcion. */
void function(void) output(1);

void main(void)
{
    /*  Error sintactico. Falta simbolo ; para declarar a1 */
    int a1 int a2;
    a1 = 0;
    a2 = 1;

    /*  Error sintactico.
        Declaracion de sentencia condicional sin parentesis.
    */
    if false == 99 function();

    /*Error sintactico.*/
    a1 = ;a1 + 1

    /*Error sintactico. No se puede definir una variable en su declaracion.*/
    char sigma = 'b';
}