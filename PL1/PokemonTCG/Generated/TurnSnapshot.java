import java.util.ArrayList;
import java.util.List;

public class TurnSnapshot {
    public int turnNumber;
    public String playerName;                  // quién juega este turno
    public String[] playerNames = new String[2];
    public String[] activePokemon = new String[2];
    public List<String>[] benchPokemons = new List[2];
    public int[] remainingPrizeCards = new int[2];
    public List<String>[] cardsOnHand = new List[2];
    public int[] unknownCardsInHand = new int[2];
    public List<String>[] kOCards = new List[2];
    public int[] totalDamage = new int[2];

    @SuppressWarnings("unchecked")
    public TurnSnapshot() {
        for (int i = 0; i < 2; i++) {
            benchPokemons[i] = new ArrayList<>();
            cardsOnHand[i] = new ArrayList<>();
            kOCards[i] = new ArrayList<>();
        }
    }

    public static TurnSnapshot capture(int turnNumber, String playerName, Player[] players) {
        TurnSnapshot s = new TurnSnapshot();
        s.turnNumber = turnNumber;
        s.playerName = playerName;
        for (int i = 0; i < 2; i++) {
            s.playerNames[i] = players[i].name;
            s.activePokemon[i] = players[i].activePokemon;
            s.benchPokemons[i] = new ArrayList<>(players[i].benchPokemons);
            s.remainingPrizeCards[i] = players[i].remainingPrizeCards;
            s.cardsOnHand[i] = new ArrayList<>(players[i].cardsOnHand);
            s.unknownCardsInHand[i] = players[i].unknownCardsInHand;
            s.kOCards[i] = new ArrayList<>(players[i].kOCards);
            s.totalDamage[i] = players[i].totalDamage;
        }
        return s;
    }

    public void print() {
        System.out.println("--- Turno " + turnNumber + " (juega " + playerName + ") ---");
        for (int i = 0; i < 2; i++) {
            String active = activePokemon[i] != null ? activePokemon[i] : "(ninguno)";
            String mano = cardsOnHand[i].size() + " (" + unknownCardsInHand[i] + " desc.)";
            System.out.println("  " + playerNames[i]
                + ": activo=" + active
                + ", banca=" + benchPokemons[i].size()
                + ", premios=" + remainingPrizeCards[i]
                + ", mano=" + mano
                + ", KOs=" + kOCards[i].size()
                + ", daño=" + totalDamage[i]);
        }
    }
}