import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



public class GameAnalyzer {
    public static void main(String[] args) throws Exception{
        
        if(args.length < 1) throw new Exception("No specified file");

        String inputFilename = args[0];
        CharStream inputStream = CharStreams.fromFileName(inputFilename);

        // Conectamos con el lexer
        gTCGLexer lexer = new gTCGLexer(inputStream);

        // Inicializamos el canal de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Preparamos el parser
        gTCGParser parser = new gTCGParser(tokens);

        ParseTree tree = parser.log();

        AnalyzerListener listener = new AnalyzerListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        
        GameSummary summ = listener.getGameSummary();

        System.out.println("Número total de turnos: " + summ.turnsAmount[2]);
        System.out.println("Jugador 1: " + summ.players[0].name);
        System.out.println("Jugador 2: " + summ.players[1].name);
        System.out.println("Daño Total Jugador 1: " + summ.players[0].totalDamage);
        System.out.println("Daño Total Jugador 2: " + summ.players[1].totalDamage);

    }
}
