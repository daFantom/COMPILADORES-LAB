public class VisitorNuestro extends gTCGParserBaseVisitor<Integer>{

    int turn_count = 0; // Contador para los turnos totales de una partida.

    // Método que devuelve la cantidad de turnos que se realizan en una partida.
    public int getTurnCount()
    {
        return turn_count;
    }

    // Método que se ejecuta cuando se visita un nodo Setup.
    @Override
    public Integer visitSetup(gTCGParser.SetupContext ctx) {
        turn_count++;
        return super.visitSetup(ctx);
    }

    // Método que se ejecuta cuando se visita un nodo Turn.
    @Override
    public Integer visitTurn(gTCGParser.TurnContext ctx) {
        turn_count++;
        return super.visitTurn(ctx);
    }
}


    
    
    

