
import org.antlr.v4.runtime.tree.TerminalNode;

public class AnalyzerListener extends gTCGParserBaseListener {
    GameSummary game = new GameSummary();

    int playersRemainingToRegister = 2;
    boolean isSetup = false;
    boolean firstPlayerName = false;
    
    //Game State
    int currentPlayer = -1;
    

    
    @Override 
    public void enterSetup(gTCGParser.SetupContext ctx){
        isSetup = true;
    }
    @Override 
    public void exitSetup(gTCGParser.SetupContext ctx){
        isSetup = false;
    }

    @Override 
    public void enterTurn(gTCGParser.TurnContext ctx){
        game.turnsAmount[2]++;
    }


    @Override 
    public void enterPlayer(gTCGParser.PlayerContext ctx){
        if(isSetup){
            firstPlayerName = true;
        }
    }


    @Override 
    public void visitTerminal(TerminalNode ctx){
        System.out.println(ctx.getText());

        if(isSetup){

            if(firstPlayerName){
                if(playersRemainingToRegister == 2){
                    game.players[0].name = ctx.getText();
                }

                if(playersRemainingToRegister == 1){
                    game.players[1].name = ctx.getText();
                }

                firstPlayerName = false;
                playersRemainingToRegister--;
            }
                
        }
    }

    public GameSummary getGameSummary(){
        return game;
    }
}
