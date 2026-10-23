import org.antlr.v4.runtime.tree.TerminalNode;

public class AnalizadorListener extends gTCGParserBaseListener{

    // Método para llamar cuando se visite un nodo terminal, es decir, las hojas del árbol sintáctico.
    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
        //System.out.print(node);
    }
    
    /* 
    ============ Métodos para llamar cuando se visite  un nodo intermedio, elementos que NO son terminales. ============
    */

    // Cuando llegamos a un nodo de fin de partida.
    @Override
    public void enterGameEnd(gTCGParser.GameEndContext ctx) {

        // Se muestra el ganador de la partida.
        super.enterGameEnd(ctx);
        System.out.println("Estamos en un nodo de fin de partida.");
        System.out.println(ctx.getText());
    }
}
