public class GameSummary {
    public Player[] players = new Player[2]; //Guarda Pokemons puestos K.O. , Cartas de premio restantes, cartas en mano, daño total inflingido.
    public int winnerPlayer = -1;
    public String endReason = "";
    public int[] turnsAmount = new int[3];

    public GameSummary() {
        players[0] = new Player();
        players[1] = new Player();
    }


    public void playerStatGenerator()
    {
        System.out.println("=============== Estadísticas de los jugadores ===============");

        // Estadísticas Jugador 1
        System.out.println("Jugador 1: "+players[0].name);
        System.out.println("\tDaño total infligido: "+players[0].totalDamage);
        System.out.println("\tCartas de premio restantes: "+players[0].remainingPrizeCards);
        System.out.println("\tCartas derribadas:");

        for(int i = 0; i < players[0].kOCards.size() ;i++)
        {
            System.out.println("\t\t- "+players[0].kOCards.get(i));
        }

        // Estadísticas Jugador 2
        System.out.println("Jugador 2: "+players[1].name);
        System.out.println("\tDaño total infligido: "+players[1].totalDamage);
        System.out.println("\tCartas de premio restantes: "+players[1].remainingPrizeCards);
        System.out.println("\tCartas derribadas:");
        for(int i = 0; i< players[1].kOCards.size();i++)
        {
            System.out.println("\t\t- "+players[1].kOCards.get(i));
        }
    }

    public void showGameStats()
    {
        System.out.println("=============== Estadísticas de la partida ===============");
        System.out.println("Total de turnos: "+turnsAmount[2]+"\n");
        System.out.println("Condición de triunfo: '"+endReason+"'\n");
    }
}