public class GameSummary {
    public Player[] players = new Player[2]; //Guarda Pokemons puestos K.O. , Cartas de premio restantes, cartas en mano, daño total inflingido.
    public int winnerPlayer = -1;
    public int[] turnsAmount = new int[3];

    public GameSummary() {
        players[0] = new Player();
        players[1] = new Player();
    }

}