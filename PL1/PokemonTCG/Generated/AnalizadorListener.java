import org.antlr.v4.runtime.tree.TerminalNode;

public class AnalizadorListener extends gTCGParserBaseListener{

    // Método para llamar cuando se visite un nodo terminal, es decir, las hojas del árbol sintáctico.
    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
        //System.out.print(node);
    }
    
    // Métodos para llamar cuando se visite  un nodo intermedio, elementos que NO son elementos terminales.
    @Override
    public void enterDrawAction(gTCGParser.DrawActionContext ctx) {
        super.enterDrawAction(ctx);
        //System.out.println("Estamos en un nodo de acción de recogida de carta");
        //System.out.println(ctx.getText());
    }

    @Override
    public void enterGameEnd(gTCGParser.GameEndContext ctx) {
        super.enterGameEnd(ctx);
        System.out.println("Estamos en un nodo de fin de partida.");
        System.out.println(ctx.getText());
    }
}
