parser grammar gTCGParser;

// Vinculacion Parser-Lexer
options
{
    tokenVocab = gTCGLexer; // Utiliza los tokens del fichero llamado gTCGLexer -> Tiene "lexer grammar" en el tipo de archivo.
    language = Java;        // Compilado en lenguaje java, para cuando lo necesitemos.
}

log_line: (log_info|INTRO)*;

log_info: PRUEBA+;