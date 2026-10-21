package PL1.PokemonTCG.Generated;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree;

import java.io.FileInputStream;
import java.io.InputStream;

public class Analizador 
{
    // Método de entrada por defecto
    public static void main(String[] args) throws Exception
    {
        // Inicializar entrada
        String inputFile = null;
        if(args.length>0)
        {
            inputFile = args[0];
        }

        // Inicializamos los streams de datos.
        InputStream is = System.in; // Por consola
        if(inputFile!=null)
        {
            is = new FileInputStream(inputFile);
        }

        // Inicializamos ANTLR con el fichero
        ANTLRInputStream input = new ANTLRInputStream(is); // Conexión fichero -> lexer -> parser -> árbol.

        // Conexión con el lexer
        gTCGLexer lexer = new gTCGLexer(input); 
        
        // Preparamos el canal de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Preparamos el parser
        gTCGParser parser = new gTCGParser(tokens);
    }
}