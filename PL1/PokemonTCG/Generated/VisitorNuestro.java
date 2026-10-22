public class VisitorNuestro extends gTCGParserBaseVisitor<Integer>{

    int turn_count = 0;

    public int getTurnCount()
    {
        return turn_count;
    }

    @Override
    public Integer visitSetup(gTCGParser.SetupContext ctx) {
        turn_count++;
        return super.visitSetup(ctx);
    }

    @Override
    public Integer visitTurn(gTCGParser.TurnContext ctx) {
        turn_count++;
        return super.visitTurn(ctx);
    }
    

    
    }


    
    
    

