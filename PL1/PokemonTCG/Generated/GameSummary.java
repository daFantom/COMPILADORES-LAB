public class GameSummary {
    public Player[] players = new Player[2];
    public int winnerPlayer = -1;
    public String endReason = "";
    public int[] turnsAmount = new int[3];
    public java.util.List<TurnSnapshot> turnHistory = new java.util.ArrayList<>();

    public GameSummary() {
        players[0] = new Player();
        players[1] = new Player();
    }

    void playerStatGen(int id) {
        System.out.printf("Jugador %d: %s ", id + 1, players[id].name);
        System.out.println("\tDaño total infligido: " + players[id].totalDamage);
        System.out.println("\tTurnos jugados: " + turnsAmount[id]);
        System.out.println("\tTurnos sin acción a tiempo: " + players[id].turnsWithoutAction);
        System.out.println("\tCartas de premio restantes: " + players[id].remainingPrizeCards);
        System.out.println("\tCartas en mano: " + players[id].cardsOnHand.size());

        if (players[id].unknownCardsInHand > 0) {
            System.out.println("\tCartas en mano (desconocidas): " + players[id].unknownCardsInHand);
        }

        if (players[id].cardsOnHand.isEmpty()) {
            System.out.println("\t\t- (SIN DATOS)");
        } else {
            for (String card : players[id].cardsOnHand) {
                System.out.println("\t\t- " + card);
            }
        }

        System.out.println("\tPokémon activo: " +
            (players[id].activePokemon != null ? players[id].activePokemon : "(NINGUNO)"));

        System.out.println("\tBanca:");
        if (players[id].benchPokemons.isEmpty()) {
            System.out.println("\t\t- (VACÍA)");
        } else {
            for (String p : players[id].benchPokemons) {
                System.out.println("\t\t- " + p);
            }
        }

        System.out.println("\tCartas derribadas:");
        if (players[id].kOCards.isEmpty()) {
            System.out.println("\t\t- (NINGUNA)");
        } else {
            for (String ko : players[id].kOCards) {
                System.out.println("\t\t- " + ko);
            }
        }
    }

    public void playerStatGenerator() {
        System.out.println("=============== Estadísticas de los jugadores ===============");
        playerStatGen(0);
        playerStatGen(1);
    }

        public void showGameStats() {
        System.out.println("=============== Estadísticas de la partida ===============");
        System.out.println("Total de turnos: " + turnsAmount[2]);
        
        // Añadimos la impresión del ganador
        if (winnerPlayer != -1) {
            System.out.println("Ganador de la partida: " + players[winnerPlayer].name);
        } else {
            System.out.println("Ganador de la partida: (No determinado)");
        }
        
        System.out.println("Condición de triunfo: '" + endReason + "'\n");
    }

    public void printTurnHistory() {
        System.out.println("=============== Historial turno a turno ===============");
        if (turnHistory.isEmpty()) {
            System.out.println("(Sin turnos registrados)");
            return;
        }
        for (TurnSnapshot s : turnHistory) {
            s.print();
        }
        System.out.println();
    }
}