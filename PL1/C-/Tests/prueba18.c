/* Errores flagantes de Lexico */

void main(void)
{
    
    int a; int b;

    /*Error lexico. Asignacion incorrecta.*/
    a -> 10;
    b => 3;

    /*Error lexico. No existe definicion de tipo float en el lenguaje.*/
    float result;

    /*Error lexico. Se usa una letra en lugar de un simbolo de operacion valido.*/
    result = a x b;

    /*Error lexico. El simbolo ; no es un semicolon, es un simbolo de interrogación en griego.*/
    b = b + 1;

    output(result);
}