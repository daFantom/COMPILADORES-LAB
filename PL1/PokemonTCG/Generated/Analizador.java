import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Analizador
{
    public static void main(String[] args) throws Exception {
        
        //Inicializamos la entrada de datos
        String inputFile=null;
        if(args.length>0) inputFile = args[0];

        // Inicializamos los streams de datos
        InputStream is = System.in;
        if (inputFile!=null) is = new FileInputStream(inputFile);

        // Inicilizo ANTRL con el fichero
        ANTLRInputStream input = new ANTLRInputStream(is);

        // Conectamos con el lexer
        gTCGLexer lexer = new gTCGLexer(input);

        // Inicializamos el canal de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Preparamos el parser
        gTCGParser parser = new gTCGParser(tokens);

        // Generar árbol a partir del axioma de la gramática.
        ParseTree tree = parser.log();

        // Recorrer el árbol
        // 1- Inicializar un recorredor
        // 2- Inicializar un escuchador
        // 3- Recorrer el árbol.

        // ======== Paso 1: Preparar un recorredor ========
        ParseTreeWalker walker = new ParseTreeWalker();

        // ======== Paso 2: Inicializar el escuchador ========
        AnalizadorListener escuchador = new AnalizadorListener();

        // ======== Paso 3: Conectar ambos elementos y recorrer el árbol ========
        // - Recorre el árbol utilizando el listener que hemos creado.
        walker.walk(escuchador, tree);

        // Mostrar el árbol por consola
        System.out.println(tree.toStringTree(parser));
    }
}