
import org.antlr.v4.runtime.tree.TerminalNode;

public class AnalyzerListener extends gTCGParserBaseListener {
    GameSummary game = new GameSummary();

    boolean firstTurn = true;
    boolean isSetup = false;
    
    int playersRemainingToRegister = 2;
    
    //Game State
    int currentPlayer = -1;
    boolean readingAttack = false;
    boolean readingDamaged = false; //Daño recibido.
    int attacker = -1;
    int damaged = -1;

    
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
    public void exitTurn(gTCGParser.TurnContext ctx){
        currentPlayer ^= 1; //Cambia de 1 a 0 y viceversa.
    }

    @Override 
    public void enterMainTurnAction(gTCGParser.MainTurnActionContext ctx){
        attacker = -1;
    }

    @Override 
    public void enterAttackAction(gTCGParser.AttackActionContext ctx){
        readingAttack = true;
        attacker = getPlayer(ctx.player(0).getText());
    }

    @Override 
    public void exitAttackAction(gTCGParser.AttackActionContext ctx){
        readingAttack = false;
    }

    @Override 
    public void enterDamagedAction(gTCGParser.DamagedActionContext ctx){
        readingDamaged = true;
        damaged = getPlayer(ctx.player().getText());
    }

    @Override 
    public void exitDamagedAction(gTCGParser.DamagedActionContext ctx){
        readingDamaged = false;
        damaged = -1;
    }

    @Override 
    public void enterDamageAmount(gTCGParser.DamageAmountContext ctx){
        if(readingAttack){
            System.out.println(game.players[currentPlayer].name);
            System.out.println(ctx.getText());
            game.players[currentPlayer].totalDamage += Integer.parseInt(ctx.getText());
        }

        if(readingDamaged && attacker != -1 && damaged != -1 && attacker != damaged){
            System.out.println(game.players[attacker].name);
            System.out.println(ctx.getText());
            game.players[attacker].totalDamage += Integer.parseInt(ctx.getText());
        }
    }


    @Override 
    public void enterPlayer(gTCGParser.PlayerContext ctx){

        if(playersRemainingToRegister > 0){
                if(playersRemainingToRegister == 2){
                    game.players[0].name = ctx.getText();
                    playersRemainingToRegister--;
                }

                if(playersRemainingToRegister == 1 && !(ctx.getText().equals(game.players[0].name)) ){
                    game.players[1].name = ctx.getText();
                    playersRemainingToRegister--;
                }
        }

        if(firstTurn && !isSetup){
                
            if(ctx.getText().equals(game.players[0].name) ){
                    currentPlayer = 0;
                }

                else{
                    currentPlayer = 1;
                }

                firstTurn = false;
        }
    }

    @Override 
    public void visitTerminal(TerminalNode ctx){

        
    }

    public int getPlayer(String name){
        if(name.equals(game.players[0].name)) return 0;
        if(name.equals(game.players[1].name)) return 1;
        return -1;
    }

    public GameSummary getGameSummary(){
        return game;
    }
}
