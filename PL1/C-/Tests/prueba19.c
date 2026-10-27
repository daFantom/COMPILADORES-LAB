/* Errores flagantes de Sintaxis y Semantica */

void main(void)
{
    int a1; int a2;
    a1 = 0;
    a2 = 1;

    /*
        Error semantico. Llamada a funcion (que parece un if) 
        no declarada previamente.

        Dos problemas dependiendo de lo que se haya querido hacer:

        Error sintactico. No semicolon tras llamada a funcion.
        Error lexico. Uso de If en lugar de if para declarar una sentencia condicional.
    */
    If(true == 1) output(5);

    /*
        Error sintactico. 
        Declaración de variable
        con sentencia condicional como nombre de variable
        seguido de una llamada a sistema
        para finalizar con una sentencia de asignacion.
    */
    bool if(a1 && a2) output(0) = true;

    /*Error sintactico. Falta el ' final. */
    char c = 'a;
    
}