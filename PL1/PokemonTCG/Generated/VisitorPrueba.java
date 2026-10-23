import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class VisitorPrueba {
    public static void main(String[] args) throws Exception
    {
        // Gestión de parámetros
        String inputFile=null;
        if(args.length>0) inputFile=args[0];
        InputStream is = System.in;
        if(inputFile!=null) is = new FileInputStream(inputFile);
        
        ANTLRInputStream input = new ANTLRInputStream(is);

        // Preparamos el lexer
        gTCGLexer lexer = new gTCGLexer(input);

        // La lista de tokens para el parser.
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Vinculamos el lexer y el parser mediante la lista de tokens.
        gTCGParser parser = new gTCGParser(tokens);

        // Creamos el árbol utilizando la regla general como entrada (log).
        parser.setBuildParseTree(true);
        ParseTree tree = parser.log();

        // Opcional: mostar el árbol.
        //System.out.println(tree.toStringTree(parser));

        // Inicialización del visitor personalizado y que recorra el árbol.
        VisitorNuestro vn = new VisitorNuestro();
        vn.visit(tree);

        // Llamamos al método para recoger la cantidad de turnos y lo mostramos por pantalla.
        int resultado  = vn.getTurnCount();
        System.out.println("La cantidad de turnos que hay es de: "+resultado);
    }
}
