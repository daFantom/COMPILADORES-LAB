
import org.antlr.v4.runtime.tree.TerminalNode;

public class AnalyzerListener extends gTCGParserBaseListener {

    GameSummary game = new GameSummary(); // Clase auxiliar para guardar los datos.
    private java.util.Set<String> openingHandProcessed = new java.util.HashSet<>();
    private static final java.util.Set<String> CARTAS_ADMITIDAS =
        java.util.Set.of(
            // Mega Venusaur ex
            "Meowth ex", "Bayleef", "Chikorita", "Bulbasaur",
            "Mega Venusaur ex", "Ivysaur", "Teal Mask Ogerpon ex",
            "Fezandipiti ex", "Meganium",

            // Steven's Metagross ex
            "Mega Mawile ex", "Jellicent ex", "Mega Skarmory ex",
            "Genesect ex", "Steven's Metang", "Steven's Beldum",
            "Frillish", "Steven's Metagross ex",

            // N's Zoroark ex
            "N's Zekrom", "N's Zorua", "N's Darmanitan",
            "N's Zoroark ex", "N's Darumaka", "Pecharunt ex",
            "N's Reshiram",

            // Mew ex
            "Hydreigon ex", "Zweilous", "Deino", "Mega Latias ex",
            "Latios", "Lillie's Clefairy ex", "Mew ex",

            // Mega Sharpedo ex
            "Mega Sharpedo ex", "Munkidori", "Carvanha",
            "Toxtricity", "Seviper", "Toxel",

            // Mega Manectric ex
            "Mega Eelektross ex", "Zekrom ex", "Eelektrik",
            "Electrike", "Tynamo", "Zeraora", "Mega Manectric ex",

            // Mega Charizard X/Y ex
            "Mega Charizard Y ex", "Mega Charizard X ex",
            "Oricorio ex", "Charmeleon", "Reshiram", "Charmander",

            // Dragapult ex
            "Drakloak", "Dreepy", "Dragapult ex",
            "Dusclops", "Duskull", "Dusknoir",

            // Mega Lucario ex
            "Solrock", "Makuhita", "Okidogi", "Mega Lucario ex",
            "Lunatone", "Riolu", "Hariyama",

            // Entrenadores
            "Lillie's Determination", "Grand Tree", "Poké Pad",
            "Lana's Aid", "Boss's Orders", "Forest of Vitality",
            "Night Stretcher", "Ultra Ball", "Wally's Compassion",
            "Colress's Tenacity", "Judge", "Dawn",
            "Team Rocket's Petrel", "Bug Catching Set",
            "Unfair Stamp", "Energy Recycler", "Rare Candy",
            "Buddy-Buddy Poffin", "Full Metal Lab", "Cyrano",
            "Hero's Cape", "Air Balloon", "Powerglass",
            "Binding Mochi", "Redeemable Ticket", "N's Castle",
            "N's PP Up", "Janine's Secret Art", "Scramble Switch",
            "Black Belt's Training", "Hilda", "Academy at Night",
            "Grimsley's Move", "Energy Search", "Canari",
            "Iris's Fighting Spirit", "Gravity Mountain",
            "Secret Box", "Carmine", "Energy Retrieval",
            "Battle Cage", "Precious Trolley", "Firebreather",
            "Mega Signal", "Crispin", "Jamming Tower",
            "Salvatore", "Fighting Gong", "Maximum Belt",
            "Tarragon", "Premium Power Pro",

            // Energías
            "Basic Grass Energy", "Basic Metal Energy",
            "Basic Psychic Energy", "Basic Darkness Energy",
            "Basic Lightning Energy", "Basic Fire Energy",
            "Basic Fighting Energy", "Prism Energy",
            "Neo Upper Energy"
        );

    private boolean esCartaAdmitida(String nombre) {
        return nombre != null && CARTAS_ADMITIDAS.contains(nombre);
    }

    private void addCardToHand(int player, String cardName) {
        if (player == -1 || !esCartaAdmitida(cardName)) return;
        game.players[player].cardsOnHand.add(cardName);
    }

    private void removeCardFromHand(int player, String cardName) {
    if (player == -1 || !esCartaAdmitida(cardName)) return;
    boolean removed = game.players[player].cardsOnHand.remove(cardName);
    if (!removed && game.players[player].unknownCardsInHand > 0) {
        // No la teníamos por nombre: debía ser una de las desconocidas
        game.players[player].unknownCardsInHand--;
    }
    }

    boolean firstTurn = true;   //Guarda si es el primer turno tras el setup.
    boolean isSetup = false;    //Guarda si estamos dentro del nodo "Setup".
    private boolean readingInitialHand = false; 
    private int initialHandPlayer = -1;
    private int pendingDrawPlayer = -1;
    private int pendingDrawCount = 0;
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
    public void enterTurn(gTCGParser.TurnContext ctx) {
        String playerName = ctx.player().getText();
        int p = getPlayer(playerName);

        game.turnsAmount[2]++;

        if (p != -1) {
            game.turnsAmount[p]++;
        }

        System.out.println("====== Turno de: " + playerName + " =======");
    }

    @Override
    public void exitTurn(gTCGParser.TurnContext ctx) {
    System.out.println("======= Fin de turno de : " + ctx.player().getText() + " =======\n");

    game.turnHistory.add(TurnSnapshot.capture(
        game.turnHistory.size() + 1,
        ctx.player().getText(),
        game.players
    ));

    currentPlayer ^= 1;
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

    
    @Override
    public void enterPrizeAction(gTCGParser.PrizeActionContext ctx) {
        String playerName = ctx.player().getText();
        int p = getPlayer(playerName);

        if (p == -1) {
            return;
        }

        int prizesTaken = 1;

        if (ctx.NUMBER() != null) {
            prizesTaken = Integer.parseInt(ctx.NUMBER().getText());
        }

        game.players[p].remainingPrizeCards -= prizesTaken;

        if (game.players[p].remainingPrizeCards < 0) {
            game.players[p].remainingPrizeCards = 0;
        }

        System.out.println(
            playerName + " ha tomado " + prizesTaken + " carta(s) de premio."
        );
    }


    /* ======= Acceso a nodo knockoutAction =======
        Se guarda el nombre del jugador al que se le ha derribado la carta, se muestra un mensaje
        de notificación y se guarda en la lista de Pokémons derribados del jugador actual que está
        produciendo dicha acción de KO.
     */


     /* ===== Knockout ===== */
    @Override
    public void enterKnockoutAction(gTCGParser.KnockoutActionContext ctx) {
        String playerName = ctx.player().getText();
        String pokemon = ctx.CARD().getText();
        int p = getPlayer(playerName);

        System.out.println("La carta " + pokemon + " de " + playerName + " ha sido derribada.");

        // Comportamiento anterior: registrar KO
        if (p != -1 && currentPlayer != -1 && p != currentPlayer) {
            game.players[currentPlayer].kOCards.add(playerName + " - " + pokemon);
        }

        // Nuevo: eliminar del estado activo/banca
        if (p != -1) {
            if (pokemon.equals(game.players[p].activePokemon)) {
                game.players[p].activePokemon = null;
            } else {
                game.players[p].benchPokemons.remove(pokemon);
            }
        }
    }


    /* ======= Acceso a nodo drawnCards =======*/
    // TODO

        @Override
    public void enterDrawnCards(gTCGParser.DrawnCardsContext ctx) {
        if (ctx.cardList() != null) return;
        if (!(ctx.getParent() instanceof gTCGParser.OpeningHandContext)) return;
        if (ctx.NUMBER() == null) return;

        gTCGParser.OpeningHandContext oh = (gTCGParser.OpeningHandContext) ctx.getParent();
        int p = getPlayer(oh.player(0).getText());
        if (p != -1) {
            game.players[p].unknownCardsInHand += Integer.parseInt(ctx.NUMBER().getText());
        }
    }

    
    /* ======= Acceso a nodo shuffleAction =======
        Se muestra por pantalla que el jugador ha barajado
        las cartas que tiene.
    */
    
        @Override
    public void enterShuffleAction(gTCGParser.ShuffleActionContext ctx) {
        String playerName = ctx.player().getText();
        int p = getPlayer(playerName);

        if (p != -1 && ctx.NUMBER() != null) {
            boolean handled = false;

            // ShuffleAction -> TurnActionBody -> SubTurnAction (con cardList?)
            if (ctx.getParent() instanceof gTCGParser.TurnActionBodyContext) {
                org.antlr.v4.runtime.tree.ParseTree gp = ctx.getParent().getParent();
                if (gp instanceof gTCGParser.SubTurnActionContext) {
                    gTCGParser.SubTurnActionContext st = (gTCGParser.SubTurnActionContext) gp;
                    if (!st.cardList().isEmpty()) {
                        for (gTCGParser.CardListContext cl : st.cardList()) {
                            for (TerminalNode cardNode : cl.CARD()) {
                                removeCardFromHand(p, cardNode.getText());
                            }
                        }
                        handled = true;
                    }
                }
            }

            if (!handled) {
                int num = Integer.parseInt(ctx.NUMBER().getText());
                int fromUnknown = Math.min(num, game.players[p].unknownCardsInHand);
                game.players[p].unknownCardsInHand -= fromUnknown;
                num -= fromUnknown;
                while (num > 0 && !game.players[p].cardsOnHand.isEmpty()) {
                    game.players[p].cardsOnHand.remove(0);
                    num--;
                }
            }
        }
        System.out.println(playerName + " ha barajado sus cartas.");
    }

        /* ======= Acceso a nodo openingHand =======
        Limpiamos la mano del jugador que va a robar su mano inicial.
    */
        /* ======= Acceso a nodo openingHand ======= */

    @Override
    public void enterOpeningHand(gTCGParser.OpeningHandContext ctx) {
    String playerName = ctx.player(0).getText();
    if (openingHandProcessed.contains(playerName)) return;

    int p = getPlayer(playerName);
    if (p != -1) {
        game.players[p].cardsOnHand.clear();
        game.players[p].unknownCardsInHand = 0;
    }
    // Añadimos al Set incluso si p == -1: así el segundo openingHand
    // del mismo jugador no volverá a limpiar cuando ya esté registrado.
    openingHandProcessed.add(playerName);
}
     /* ===== Retirada ===== */
    @Override
    public void enterRetreatAction(gTCGParser.RetreatActionContext ctx) {
        String playerName = ctx.player().getText();
        int p = getPlayer(playerName);
        if (p == -1 || ctx.CARD() == null) return;

        String cardName = ctx.CARD().getText();

        if (cardName.equals(game.players[p].activePokemon)) {
            game.players[p].activePokemon = null;
            game.players[p].benchPokemons.add(cardName);
        }
    }

    /* ======= Acceso a nodo CardList ======= */
    @Override
    public void enterCardList(gTCGParser.CardListContext ctx) {
        // 1. ¿Es parte de la mano inicial?
        if (ctx.getParent() instanceof gTCGParser.DrawnCardsContext) {
            gTCGParser.DrawnCardsContext dc = (gTCGParser.DrawnCardsContext) ctx.getParent();
            if (dc.getParent() instanceof gTCGParser.OpeningHandContext) {
                gTCGParser.OpeningHandContext oh = (gTCGParser.OpeningHandContext) dc.getParent();
                String playerName = oh.player(0).getText();
                int p = getPlayer(playerName);
                if (p != -1) {
                    for (TerminalNode cardNode : ctx.CARD()) {
                        addCardToHand(p, cardNode.getText());
                    }
                }
                return;
            }
        }

        // 2. ¿Es parte de una sub-acción?
        if (ctx.getParent() instanceof gTCGParser.SubTurnActionContext) {
            gTCGParser.SubTurnActionContext st = (gTCGParser.SubTurnActionContext) ctx.getParent();
            gTCGParser.TurnActionBodyContext body = st.turnActionBody();

            if (body.drawAction() != null) {
    gTCGParser.DrawActionContext da = body.drawAction();
    String playerName = da.player().getText();
    int p = getPlayer(playerName);
    if (p == -1) return;

    if (da.AND() != null) {
        // "drew N cards and played them to the Bench" (Buddy-Buddy Poffin)
        for (TerminalNode cardNode : ctx.CARD()) {
            game.players[p].benchPokemons.add(cardNode.getText());
        }
    } else {
        // "drew N cards" → van a la mano
        for (TerminalNode cardNode : ctx.CARD()) {
            addCardToHand(p, cardNode.getText());
        }
    }
    } else if (body.discardAction() != null) {
                gTCGParser.DiscardActionContext da = body.discardAction();
                // Solo si el descarte es desde la mano
                if (da.WERE() == null && da.WAS() == null && da.player() != null) {
                    String playerName = da.player().getText();
                    int p = getPlayer(playerName);
                    if (p != -1) {
                        for (TerminalNode cardNode : ctx.CARD()) {
                            removeCardFromHand(p, cardNode.getText());
                        }
                    }
                }
            }
        }
    }

    /* ======= Acceso a nodo DrawAction ======= */
    @Override
    public void enterDrawAction(gTCGParser.DrawActionContext ctx) {
        String playerName = ctx.player().getText();
        int p = getPlayer(playerName);
        if (p == -1) return;

        if (ctx.CARD_WORD() != null) {
            game.players[p].unknownCardsInHand++;
        } else if (ctx.CARD() != null) {
            addCardToHand(p, ctx.CARD().getText());
        }
    }

    /* ======= Salida de DrawAction ======= */
    @Override
    public void exitDrawAction(gTCGParser.DrawActionContext ctx) {
    if (ctx.NUMBER() != null && ctx.CARDS() != null) {
        int numCards = Integer.parseInt(ctx.NUMBER().getText());
        boolean hasList = false;

        // DrawAction -> TurnActionBody -> SubTurnAction (con cardList?)
        if (ctx.getParent() instanceof gTCGParser.TurnActionBodyContext) {
            org.antlr.v4.runtime.tree.ParseTree gp = ctx.getParent().getParent();
            if (gp instanceof gTCGParser.SubTurnActionContext) {
                gTCGParser.SubTurnActionContext st = (gTCGParser.SubTurnActionContext) gp;
                if (!st.cardList().isEmpty()) {
                    hasList = true;
                }
            }
        }

        if (!hasList) {
            String playerName = ctx.player().getText();
            int p = getPlayer(playerName);
            if (p != -1) {
                game.players[p].unknownCardsInHand += numCards;
            }
        }
    }
}

    /* ===== Turno: jugar una carta ===== */
        @Override
        public void enterPlayAction(gTCGParser.PlayActionContext ctx) {
            String playerName = ctx.player().getText();
            int p = getPlayer(playerName);
            if (p == -1 || ctx.CARD() == null) return;

            String cardName = ctx.CARD().getText();

            // Quitar de la mano (comportamiento anterior)
            removeCardFromHand(p, cardName);

            // Nuevo: si va a Bench o Active Spot es un Pokémon
            if (ctx.ACTIVE() != null) {
                game.players[p].activePokemon = cardName;
            } else if (ctx.BENCH() != null) {
                game.players[p].benchPokemons.add(cardName);
            }
            // Si STADIUM o sin destino, no es Pokémon: no se toca el estado
        }
    @Override
    public void enterAttachAction(gTCGParser.AttachActionContext ctx) {
        String playerName = ctx.player().getText();
        int p = getPlayer(playerName);
        if (p != -1 && !ctx.CARD().isEmpty()) {
            removeCardFromHand(p, ctx.CARD(0).getText());
        }
    }
     /* ===== Evolución ===== */
    @Override
    public void enterEvolveAction(gTCGParser.EvolveActionContext ctx) {
        String playerName = ctx.player().getText();
        int p = getPlayer(playerName);
        if (p == -1 || ctx.CARD().size() < 2) return;

        String preEvo = ctx.CARD(0).getText();
        String evo = ctx.CARD(1).getText();

        // Quitar la evolución de la mano (CARD(1), no CARD(0))
        removeCardFromHand(p, evo);

        // Nuevo: actualizar activo/banca
        if (ctx.ACTIVE() != null) {
            game.players[p].activePokemon = evo;
        } else if (ctx.BENCH() != null) {
            java.util.List<String> bench = game.players[p].benchPokemons;
            int idx = bench.indexOf(preEvo);
            if (idx >= 0) {
                bench.set(idx, evo);
            } else {
                // No estaba en banca: lo añadimos para no perderlo
                bench.add(evo);
            }
        }
    }
     /* ===== Switch ===== */
    @Override
    public void enterSwitchAction(gTCGParser.SwitchActionContext ctx) {
        if (ctx.player().size() < 2 || ctx.CARD().size() < 2) return;

        int pNew = getPlayer(ctx.player(0).getText()); // dueño del nuevo activo
        int pOld = getPlayer(ctx.player(1).getText()); // dueño del que sale
        if (pNew == -1 || pOld == -1) return;

        String newActive = ctx.CARD(0).getText(); // el que entra
        String oldActive = ctx.CARD(1).getText(); // el que sale

        // El nuevo activo deja de estar en banca (si estaba)
        game.players[pNew].benchPokemons.remove(newActive);
        game.players[pNew].activePokemon = newActive;

        // El antiguo activo pasa a la banca
        if (!game.players[pOld].benchPokemons.contains(oldActive)) {
            game.players[pOld].benchPokemons.add(oldActive);
        }
        // Si pOld == pNew, acabamos de sobreescribir activePokemon con newActive,
        // así que no hay que limpiar nada más.
    }
     /* ===== Active Spot (confirmación) ===== */
    @Override
    public void enterActiveSpotAction(gTCGParser.ActiveSpotActionContext ctx) {
        String playerName = ctx.player().getText();
        int p = getPlayer(playerName);
        if (p == -1 || ctx.CARD() == null) return;

        String cardName = ctx.CARD().getText();

        // Quitar de banca si estaba (puede venir de un switch o retreat)
        game.players[p].benchPokemons.remove(cardName);
        game.players[p].activePokemon = cardName;
    }
    /* ======= Acciones que añaden cartas a la mano ======= */
    @Override
    public void enterMoveToHandAction(gTCGParser.MoveToHandActionContext ctx) {
        if (ctx.player().isEmpty() || ctx.CARD() == null) return;

        String playerName = ctx.player(0).getText();
        int p = getPlayer(playerName);
        if (p != -1) {
            addCardToHand(p, ctx.CARD().getText());
        }
    }

    @Override
    public void enterCardMovedAction(gTCGParser.CardMovedActionContext ctx) {
        if (ctx.player().isEmpty()) return;
        String playerName = ctx.player(0).getText();
        int p = getPlayer(playerName);
        if (p == -1) return;

        if (ctx.A_SOMETHING() != null && ctx.CARD_WORD() != null) {
            // "A card was added..." → desconocida
            game.players[p].unknownCardsInHand++;
        } else if (ctx.CARD() != null) {
            // "CARD was added..." → conocida
            addCardToHand(p, ctx.CARD().getText());
        } else if (ctx.NUMBER() != null) {
            // "Moved NUMBER cards to their hand" → desconocidas
            int num = Integer.parseInt(ctx.NUMBER().getText());
            game.players[p].unknownCardsInHand += num;
        }
    }
    @Override
public void enterDiscardAction(gTCGParser.DiscardActionContext ctx) {
    // Solo descartes desde la mano: "player DISCARDED CARD" o "player DISCARDED NUMBER CARDS"
    // Ignoramos descartes desde Pokémon: "NUMBER CARDS WERE DISCARDED FROM..." o "CARD WAS DISCARDED FROM..."
    if (ctx.WERE() != null || ctx.WAS() != null) return;
    if (ctx.player() == null) return;

    String playerName = ctx.player().getText();
    int p = getPlayer(playerName);
    if (p == -1) return;

    if (!ctx.CARD().isEmpty()) {
        // Descarte individual con nombre (ej: "discarded Basic Fire Energy")
        for (TerminalNode cardNode : ctx.CARD()) {
            removeCardFromHand(p, cardNode.getText());
        }
    } else if (ctx.NUMBER() != null) {
        // "discarded N cards" sin lista
        int num = Integer.parseInt(ctx.NUMBER().getText());

        // Si tiene lista asociada, enterCardList ya las habrá eliminado
        boolean hasList = false;
        if (ctx.getParent() instanceof gTCGParser.TurnActionBodyContext) {
            org.antlr.v4.runtime.tree.ParseTree gp = ctx.getParent().getParent();
            if (gp instanceof gTCGParser.SubTurnActionContext) {
                gTCGParser.SubTurnActionContext st = (gTCGParser.SubTurnActionContext) gp;
                if (!st.cardList().isEmpty()) {
                    hasList = true;
                }
            }
        }

        if (!hasList) {
            int fromUnknown = Math.min(num, game.players[p].unknownCardsInHand);
            game.players[p].unknownCardsInHand -= fromUnknown;
            num -= fromUnknown;
            while (num > 0 && !game.players[p].cardsOnHand.isEmpty()) {
                game.players[p].cardsOnHand.remove(0);
                num--;
            }
        }
    }
}    /* ===== Setup: Pokémon iniciales ===== */
    @Override
    public void enterInitialPokemon(gTCGParser.InitialPokemonContext ctx) {
        String playerName = ctx.player().getText();
        int p = getPlayer(playerName);
        if (p == -1 || ctx.CARD() == null) return;

        String cardName = ctx.CARD().getText();

        // Quitar de la mano (comportamiento anterior)
        removeCardFromHand(p, cardName);

        // Nuevo: registrar en activo o banca
        if (ctx.ACTIVE() != null) {
            game.players[p].activePokemon = cardName;
        } else if (ctx.BENCH() != null) {
            game.players[p].benchPokemons.add(cardName);
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


