
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
    public void enterAttackAction(gTCGParser.AttackActionContext ctx){
        readingAttack = true;
    }

    @Override 
    public void exitAttackAction(gTCGParser.AttackActionContext ctx){
        readingAttack = false;
    }

    @Override 
    public void enterDamagedAction(gTCGParser.DamagedActionContext ctx){
        readingDamaged = true;
    }

    @Override 
    public void exitDamagedAction(gTCGParser.DamagedActionContext ctx){
        readingDamaged = false;
    }

    @Override 
    public void enterDamageAmount(gTCGParser.DamageAmountContext ctx){
        if(readingAttack){
            System.out.println(game.players[currentPlayer].name);
            System.out.println(ctx.getText());
            game.players[currentPlayer].totalDamage += Integer.parseInt(ctx.getText());
        }

        /*  En este tipo de acciones, el daño descrito lo recibe el "sujeto" del log.
            Ej: " - DudeJaden's Hariyama took 70 damage. "
            
            Por eso se registra como daño inflingido por el jugador contrario.
        */
        if(readingDamaged){
            System.out.println(game.players[currentPlayer^1].name);
            System.out.println(ctx.getText());
            game.players[currentPlayer^1].totalDamage += Integer.parseInt(ctx.getText());
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

    public GameSummary getGameSummary(){
        return game;
    }
}
