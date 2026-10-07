// Generated from e:/School stuff/Universidad/3er Año/1er Cuatrimestre/Procesadores del Lenguaje/COMPILADORES-LAB/PL1/PokemonTCG/Grammar/gTCGParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gTCGParser}.
 */
public interface gTCGParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gTCGParser#log_line}.
	 * @param ctx the parse tree
	 */
	void enterLog_line(gTCGParser.Log_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#log_line}.
	 * @param ctx the parse tree
	 */
	void exitLog_line(gTCGParser.Log_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#log_info}.
	 * @param ctx the parse tree
	 */
	void enterLog_info(gTCGParser.Log_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#log_info}.
	 * @param ctx the parse tree
	 */
	void exitLog_info(gTCGParser.Log_infoContext ctx);
}