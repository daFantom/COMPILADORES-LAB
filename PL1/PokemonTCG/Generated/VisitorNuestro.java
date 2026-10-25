public class VisitorNuestro extends gTCGParserBaseVisitor<Integer>{

    int turn_count = 0; // Contador para los turnos totales de una partida.

    // ========== Método que devuelve la cantidad de turnos que se realizan en una partida. ==========
    public int getTurnCount()
    {
        return turn_count;
    }

    // Método que se ejecuta cuando se visita un nodo Setup.
    //@Override
    //public Integer visitSetup(gTCGParser.SetupContext ctx) {
    //    turn_count++;
    //    return super.visitSetup(ctx);
    //}


    /* ========== Método que se ejecuta cuando se visita un nodo Turn. ==========

    - Cada vez que accede a un nodo Turn en concreto, incrementa el contador de turnos.
    - Se establece que el turno de Setup, a pesar de que el jugador que empieza
    puede hacer acciones en dicho turno, no cuenta como un turno normal de la 
    partida.
    */
    @Override
    public Integer visitTurn(gTCGParser.TurnContext ctx) {
        turn_count++;
        return super.visitTurn(ctx);
    }

    /* ========== Método que se ejecuta cuando se visita un nodo Damage Breakdown. ========== */
    @Override
    public Integer visitDamageBreakdown(gTCGParser.DamageBreakdownContext ctx) {
        System.out.println(ctx.DAMAGE_BREAKDOWN().getText());
        return super.visitDamageBreakdown(ctx);
    }
}


    
    
    

