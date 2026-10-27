/* Errores flagantes de Lexico y Semantica */

void main(void)
{
    bool a;
    char c;

    /*  Error lexico. No se puede definir un tipo char como vacio. */
    c = '';

    /*  Error semantico. El valor "True" se lee como una variable 
        con este nombre, pero no ha sido declarada previamente.
    */
    a = True;

}
