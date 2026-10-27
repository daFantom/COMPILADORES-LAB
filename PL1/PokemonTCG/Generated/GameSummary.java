public class GameSummary {
    public Player[] players = new Player[2]; //Guarda Pokemons puestos K.O. , Cartas de premio restantes, cartas en mano, daño total inflingido.
    public int winnerPlayer = -1;
    public String endReason = "";
    public int[] turnsAmount = new int[3];

    public GameSummary() {
        players[0] = new Player();
        players[1] = new Player();
    }

    void playerStatGen(int id){
        
        System.out.printf("Jugador %d: %s ", id+1, players[id].name);
        System.out.println("\tDaño total infligido: " + players[id].totalDamage);
        System.out.println("\tCartas de premio restantes: " + players[id].remainingPrizeCards);
        System.out.println("\tCartas derribadas:");
        
        //Para mostrar que no hubo cartas derribadas.
        if(players[id].kOCards.isEmpty())
            System.out.println("\t\t- (NINGUNA)");

        for(int i = 0; i < players[id].kOCards.size() ; i++)
        {
            System.out.println("\t\t- "+players[id].kOCards.get(i));
        }
    }


    public void playerStatGenerator()
    {
        System.out.println("=============== Estadísticas de los jugadores ===============");

        // Estadísticas Jugador 1
        playerStatGen(0);
        // Estadísticas Jugador 2
        playerStatGen(1);
    }

    public void showGameStats()
    {
        System.out.println("=============== Estadísticas de la partida ===============");
        System.out.println("Total de turnos: "+turnsAmount[2]+"\n");
        System.out.println("Condición de triunfo: '"+endReason+"'\n");
    }
}