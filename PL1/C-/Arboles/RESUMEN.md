# Árboles sintácticos de las pruebas de C-

Generados con ANTLR 4.9.2 a partir de `Grammar/CminusParser.g4` (regla inicial `prog`).
Por cada prueba hay tres ficheros:

- `pruebaXX_arbol.png`: árbol de análisis (mismo dibujo que `antlr4-parse ... -gui`). Los nodos de error aparecen resaltados en rojo.
- `pruebaXX_consola.png`: salida de consola con los errores léxicos y sintácticos.
- `pruebaXX_salida.txt`: la misma salida en texto y el árbol en formato LISP.

| Prueba | Contenido | Resultado | Motivo |
|---|---|---|---|
| 01 | Fibonacci (while) | Aceptado | C- básico |
| 02 | Operaciones aritméticas, `a = b = 7` | Aceptado | C- básico |
| 03 | if/else anidados | Aceptado | El else se asocia al if más cercano |
| 04 | Funciones con return, variable global, sentencia vacía `;` | Aceptado | C- básico |
| 05 | Arrays globales, locales y como parámetro | Aceptado | C- básico |
| 06 | Recursividad | Aceptado | C- básico |
| 07 | Ordenación por burbuja | Aceptado | C- básico |
| 08 | Media de tres notas | Aceptado | C- básico |
| 09 | Declaración `int paso;` después de instrucciones | Aceptado | Ampliación propia: declaraciones intercaladas (C- estándar lo rechaza) |
| 10 | `10 < x < 20` | Aceptado | Ampliación propia: comparaciones encadenadas (C- estándar lo rechaza) |
| 11 | Bucle for | Aceptado | Ampliación for |
| 12 | `+1`, `-10` y for | Aceptado | Menos/más unario |
| 13 | Operador `%` | Aceptado | Ampliación módulo |
| 14 | Tipo char, `'a'`, `'\n'` | Aceptado | Ampliación char |
| 15 | Tipo bool, `&&`, `\|\|`, `!!!b` | Aceptado | Ampliación bool y lógicos |
| 16 | `while`, `for ( ; ; )` | Aceptado | Campos del for opcionales |
| 17 | Función que devuelve char, varios if | Aceptado | Ampliación char |
| 18 | `5 * true`, `true && false` | Aceptado | Sintácticamente correcto; los tipos se comprueban en fases posteriores |
| 19 | Errores léxicos | Rechazado (12 errores) | `If` como ID, `;` griego (U+037E) en línea 11, `bool if(...)`, `'a;` sin cerrar, comillas dobles `"b"` |
| 20 | Errores sintácticos | Rechazado (11 errores) | Función sin llaves, `int a1 int a2`, `if` sin paréntesis, `a1 = ;`, `a1 x a2`, inicialización en declaración |
