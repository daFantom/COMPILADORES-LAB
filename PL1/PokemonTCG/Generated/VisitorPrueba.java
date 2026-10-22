import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class VisitorPrueba {
    public static void main(String[] args) throws Exception
    {
        String inputFile=null;
        if(args.length>0) inputFile=args[0];
        InputStream is = System.in;
        if(inputFile!=null) is = new FileInputStream(inputFile);
        
        ANTLRInputStream input = new ANTLRInputStream(is);

        gTCGLexer lexer = new gTCGLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        gTCGParser parser = new gTCGParser(tokens);

        parser.setBuildParseTree(true);
        ParseTree tree = parser.log();

        //System.out.println(tree.toStringTree(parser));

        VisitorNuestro vn = new VisitorNuestro();
        vn.visit(tree);
        int resultado  = vn.getTurnCount();
        System.out.println("La cantidad de turnos que hay es de: "+resultado);
    }
}
