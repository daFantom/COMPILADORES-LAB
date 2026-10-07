parser grammar gTCGParser;

// Vinculacion Parser-Lexer
options
{
    tokenVocab = gTCGLexer; // Utiliza los tokens del fichero llamado gTCGLexer -> Tiene "lexer grammar" en el tipo de archivo.
    language = Java;        // Compilado en lenguaje java, para cuando lo necesitemos.
}

log_line: (log_info|INTRO)*;

/* E.g: DudeJaden chose heads for the opening coin flip. -> Sería válido.
    E.g: DudeJaden's Turn -> También sería válido.
    Recomiendo separarlos ya que uno es para elegir quién empieza y
    el otro es un mensaje de selección de turno.
    Lo mismo con jugadas de Active Spot y Bench, recolecta de  cartas y final de turno.
*/
log_info: play_card
        | (text_info ENDLINE INTRO)
        | (text_info INTRO)
        | start_turn
        | end_turn
        | draw_card_action
        | mult_card_draw
        ;

// ===================== Expresiones no terminales =====================

// Información del log
text_info: (TEXT|INT)+;
// Principio y fin de un turno. REVISAR PQ NO SALE COMO SE DEBE.
start_turn: TEXT START_TURN;
end_turn: TEXT END_TURN; 


// Acciones
play_card: bench_action | active_spot_action;
bench_action: TEXT BENCH ENDLINE INTRO;
active_spot_action: TEXT ACTIVESPOT ENDLINE INTRO;
draw_card_action: DASH? TEXT DREW_ACTION TEXT ENDLINE? INTRO; // El segundo TEXT cambiarlo por algo que haga referencia a las cartas.
mult_card_draw: BULLET_POINT TEXT(COMMA? TEXT)+ ENDLINE? INTRO;