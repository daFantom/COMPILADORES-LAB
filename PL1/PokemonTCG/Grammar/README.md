# Gramática ANTLR para logs de Pokémon TCG Live (branch `pokemon-grammar`)

## Qué incluye

- Gramática del lexer (`gTCGLexer.g4`) y del parser (`gTCGParser.g4`) de los logs de Pokémon TCG Live.
- Corrige que ANTLR no compilara: `cardAddedToHand` estaba definida como regla de lexer dentro del parser.
- Alinea los tokens que el parser usaba y el lexer no tenía (`TAKE`, `RETIRED`, `BASE_DAMAGE`, `TOTAL_DAMAGE`, `TURN`, `POKEMON`, `ADDED`).
- Añade `THE` en played / attach / evolve / retreat ("to the Bench", "on the Bench", "in the Active Spot").
- `Switch` ahora se acepta como carta (a revisar).

## Estado actual

- Compila sin errores ni avisos.
- El bloque `Setup` de `DrCompiler_Log_1` y `DrCompiler_Log_2` se reconoce completo.
- **Los logs completos todavía NO se reconocen.** Falla dentro de los turnos.

## Fallos conocidos

Son los que he visto probando con los dos logs de ejemplo:

- `drew a card.`: el parser espera `CARD_WORD` y la `a` llega como otro token.
- `ended their turn.`: `endTurn` no reconoce la frase.
- Listas con `•` (cartas separadas por comas): `cardList` existe, pero ninguna regla la usa después de una línea `- ...`.
- `attackAction`: no acepta `for N damage.` ni ataques sin objetivo ("used Last-Ditch Catch.").
- Puede haber más errores detrás de estos que aún no han salido.

## Cómo probarlo

Desde la carpeta `Grammar`:

```
antlr4 -encoding UTF-8 gTCGLexer.g4
antlr4 -encoding UTF-8 gTCGParser.g4
javac -encoding UTF-8 *.java
grun gTCG log -tree -encoding UTF-8 ../Tests/DrCompiler_Log_1.txt
```

La regla de inicio del parser es `log`.
