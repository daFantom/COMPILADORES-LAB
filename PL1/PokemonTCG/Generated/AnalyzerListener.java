
import org.antlr.v4.runtime.tree.TerminalNode;

public class AnalyzerListener extends gTCGParserBaseListener {

    GameSummary game = new GameSummary(); // Clase auxiliar para guardar los datos.

    boolean firstTurn = true;   //Guarda si es el primer turno tras el setup.
    boolean isSetup = false;    //Guarda si estamos dentro del nodo "Setup".
    
    /*  Cantidad de jugadores cuyos nombres faltan por registrar.
        Se utiliza al visitar los nodos relacionados a nombres de jugador.
    */
    int playersRemainingToRegister = 2;
    
    /*  Estado del recorrido.
        La informacion se actualiza conforme se visitan ciertos nodos.
    */
    int currentPlayer = -1;         //Id del jugador que esta jugando actualmente.
    boolean readingAttack = false;  //Guarda si se encuentra en un nodo "attackAction".
    boolean readingDamaged = false; //Guarda si se encuentra en un nodo de "damagedAction"
    int attacker = -1;              //Id del jugador que esta atacando.
    int damaged = -1;               //Id del jugador que esta siendo atacado.

    /* ======= Acceso a nodo Setup =======
        Cada vez que se accede y se sale de un nodo "Setup" se activa o
        desactiva una variable isSetup como flag de comprobación.
    */
    @Override 
    public void enterSetup(gTCGParser.SetupContext ctx){
        isSetup = true;
    }
    @Override 
    public void exitSetup(gTCGParser.SetupContext ctx){
        isSetup = false;
    }

    /* ======= Acceso a nodo Turn =======
        Cada vez que se accede al nodo "Turn" se suma 
        al número total de turnos.
        
        Cada vez que se sale del nodo "Turn" se actualiza 
        el jugador que se encuentra jugando en este momento.
        Como solo hay dos jugadores y se intercambian entre turnos
        solo hace falta cambiar el id de 0 a 1 y viceversa.
    */
    @Override 
    public void enterTurn(gTCGParser.TurnContext ctx){
        game.turnsAmount[2]++;
    }

    @Override 
    public void exitTurn(gTCGParser.TurnContext ctx){
        currentPlayer ^= 1; //XOR. Cambia de 1 a 0 y viceversa.
    }

    /* ======= Acceso a nodo acción principal de turno ======= 
        Cada vez que se accede al nodo "Main Turn Action" 
        se quita el id del jugador que esta de atacante actual.
    */
    @Override 
    public void enterMainTurnAction(gTCGParser.MainTurnActionContext ctx){
        attacker = -1;
    }

    /* ======= Acceso a nodo de acción de ataque =======
        Cada vez que se accede al nodo "Attack Action" se identifica 
        la accion actual como un ataque y se fija al jugador en la accion 
        como el atacante.

        Cada vez que se sale del nodo "Attack Action", se desactiva el flag
        para representar que la accion ha terminado.
    */
    @Override 
    public void enterAttackAction(gTCGParser.AttackActionContext ctx){
        readingAttack = true;
        attacker = getPlayer(ctx.player(0).getText());
    }

    @Override 
    public void exitAttackAction(gTCGParser.AttackActionContext ctx){
        readingAttack = false;
    }

    /* ======= Acceso a nodo de acción de daño =======
        Cada vez que se accede del nodo "Damaged Action" se dentifica 
        la accion actual como una de daño y fija al jugador en la accion 
        como el que esta siendo atacado.

        Cada vez que se sale del nodo "Damaged Action", se desactiva el flag
        para representar que la accion ha terminado y se quita al jugador
        atacado.
    */
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

    /* ======= Acceso a nodo cantidad de ataque =======
        Cada vez que se accede del nodo "Damage Amount" se identifica
        quien es el jugador que esta atacando para sumarle daño inflingido.
    */
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

    /* ======= Acceso a nodo de Player (nombre jugador) =======
        Cada vez que se accede del nodo "Player" se identifica
        si faltan jugadores cuyos nombres hay que registrar,
        de ser asi, se registran los nombres donde corresponda.

        Tambien se verifica que jugador tiene el primer turno.
    */
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

    //Obtiene nombre de jugador en la lista.
    int getPlayer(String name){
        if(name.equals(game.players[0].name)) return 0;
        if(name.equals(game.players[1].name)) return 1;
        return -1;
    }

    //Obtiene resumen del juego.
    public GameSummary getGameSummary(){
        return game;
    }
}
