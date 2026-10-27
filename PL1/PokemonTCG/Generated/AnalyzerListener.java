
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
    String damagedPokemon = "";

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

    
    /* ======= Acceso a nodo CoinChoice =======
        Cada vez que se accede al nodo "CoinChoice" se muestra un
        mensaje por pantalla que identifica al usuario que hará
        el lanzamiento de moneda para decidir quién recibe el primer turno.
    */
    @Override
    public void enterCoinChoice(gTCGParser.CoinChoiceContext ctx) {
        System.out.println(ctx.player().getText()+" comienza con el tiro de moneda.");
    }

     /* ======= Acceso a nodo CoinToss =======
        Cada vez que se accede al nodo "CoinToss" se comprueba que
        si estamos en un nodo Setup, pues hay otros tipos de nodos "CoinToss"
        que sirven para otras cosas. Este nodo en concreto sirve para informar quién
        es el usuario que ha ganado el lanzamiento de moneda.
    */
    @Override
    public void enterCoinToss(gTCGParser.CoinTossContext ctx) {
        if(isSetup)
        {
            System.out.println(ctx.player().getText()+" ha ganado el tiro de moneda. Será el que comienza.\n");
        }
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
        System.out.println("====== Turno de: "+ctx.player().getText()+" =======");
    }

    @Override 
    public void exitTurn(gTCGParser.TurnContext ctx){

        System.out.println("======= Fin de turno de : "+ctx.player().getText()+" =======\n");

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
        como el atacante. La identificación sirve para los subnnodos posteriores.

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
        //System.out.println("Prueba carta: "+ctx.CARD().getText());
        damagedPokemon = ctx.CARD().getText();
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
        String currentAttacker;
        int damageDealt;

        // Si estamos en un nodo de Ataque y comprobamos el daño infligido por el atacante.
        if(readingAttack){
            currentAttacker = game.players[currentPlayer].name; // Se guarda el nombre de usuario del atacante.
            damageDealt = Integer.parseInt(ctx.getText());         // Se guarda la cantidad del daño producido, que se guarda en este nodo.
            System.out.println(currentAttacker+" ha atacado con un total de "+damageDealt+ " DMG.");
            game.players[currentPlayer].totalDamage += damageDealt;    // Se incrementa el valor del daño total del atacante correspondiente.
        }

        // Si estamos en un nodo de "Daño recibido" y comprobamos el daño que el contrincante recibe por otros factores que no son un ataque básico.
        if(readingDamaged && attacker != -1 && damaged != -1 && attacker != damaged){
            damageDealt = Integer.parseInt(ctx.getText());
            //System.out.println("\tTest de readingDamaged\n");
            System.out.println("El "+damagedPokemon+" de "+game.players[damaged].name+" ha recibido un total de "+damageDealt+ " DMG.");
            game.players[attacker].totalDamage += damageDealt;
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


        // Nódulo de registro de jugadores.
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

        // Módulo de asignación del primer jugador en base al primer turno no Setup.
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
    public void enterNoAction(gTCGParser.NoActionContext ctx){
        int p = getPlayer(ctx.player().getText());
        if(p != -1){
            game.players[p].turnsWithoutAction++;
        }
        System.out.println(ctx.player().getText()+" no ha hecho nada a tiempo.");
    }

    @Override
    public void enterGameEnd(gTCGParser.GameEndContext ctx){
        if(ctx.player() == null){
            return;
        }
        game.winnerPlayer = getPlayer(ctx.player().getText());
        if(ctx.CONCEDED() != null){
            game.endReason = "El oponente se ha rendido.";
        }
        else{
            game.endReason = "Todas las Cartas de Premio han sido recogidas.";
        }
    }

    /* ======= Acceso a nodo knockoutAction =======
        Se guarda el nombre del jugador al que se le ha derribado la carta, se muestra un mensaje
        de notificación y se guarda en la lista de Pokémons derribados del jugador actual que está
        produciendo dicha acción de KO.
     */

    @Override
    public void enterKnockoutAction(gTCGParser.KnockoutActionContext ctx) {
        int p = getPlayer(ctx.player().getText());
        System.out.println("La carta "+ctx.CARD().getText()+" de "+ctx.player().getText()+" ha sido derribada!");
        game.players[currentPlayer].kOCards.add(game.players[p].name+"'s"+" '"+ctx.CARD().getText()+"'.");
    }

    /* ======= Acceso a nodo drawnCards =======*/
    // TODO
    @Override
    public void enterDrawnCards(gTCGParser.DrawnCardsContext ctx) {
        super.enterDrawnCards(ctx);
    }

    /* ======= Acceso a nodo drawnAction =======
        Se muestra por pantalla si el usuario actual ha tomado una carta cualquiera o
        una carta en concreto.

        Si ctx.CARD() es null, nos encontramos en un nodo que tiene "drew a card.".
        De otro modo, nos encontramos en un nodo que contiene el nombre de una carta en concreto.
        TODO: El caso de que se recojan más de una carta (comprobar valores y luego mostrar las cartas
        que ha tomado.)
    */
    @Override
    public void enterDrawAction(gTCGParser.DrawActionContext ctx) {
        //String test = ctx.getText(); Debug
        //System.out.println(test); // Debug
        String currentPlayerName = ctx.player().getText();
        if(ctx.CARD() == null)
        {
            System.out.println(currentPlayerName+" ha tomado una carta.");
        }
        else
        {
            System.out.println(currentPlayerName+" ha tomado una carta: "+ctx.CARD());
        }
    }

    /* ======= Acceso a nodo shuffleAction =======
        Se muestra por pantalla que el jugador ha barajado
        las cartas que tiene.
    */
    
    @Override
    public void enterShuffleAction(gTCGParser.ShuffleActionContext ctx) {
        System.out.println(ctx.player().getText()+" ha barajado sus cartas.");
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
