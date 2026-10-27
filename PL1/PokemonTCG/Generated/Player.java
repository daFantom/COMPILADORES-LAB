import java.util.ArrayList;

/* ========== Clase auxiliar de jugador ========== 
    Se utiliza para almacenar ciertos datos que nos interesan
    para la sección avanzada de la parte del analizador PokemonTCG.
    Se compone de los siguientes valores:
    
    - String Name: Nombre de un jugador, cada partida guarda 2 jugadores,
    asignando a cada uno el correspondiente.

    -  ArrayList<String> fallenCards: Lista de las cartas de Pokémon KO
    de un jugador en concreto. Es decir, de aquellas que ha perdido.

    - int remainingPrizeCards: cantidad de cartas de premio
    que le faltaban al jugador correspondiente en caso de que haya terminado
    la partida por otra condición de triunfo. Los nombres de estas cartas no se muestran a
    priori en los logs, pero el jugador sí que la conoce en la partida y la puede jugar posteriormente.

    - ArrayList<String> cardsOnHand: Lista de cartas que el jugador correspondiente
    tenía en mano al finalizar la partida.

    - int totalDamage: Cantidad de daño total producido en la partida por un
    jugador en concreto.
*/

public class Player {

    String name = "";
    ArrayList<String> kOCards = new ArrayList<>();
    int remainingPrizeCards = 6;
    ArrayList<String> cardsOnHand = new ArrayList<>();
    int totalDamage = 0;
    int turnsWithoutAction = 0;
}