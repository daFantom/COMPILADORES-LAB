// Generated from CminusParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CminusParserParser}.
 */
public interface CminusParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CminusParserParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CminusParserParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(CminusParserParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(CminusParserParser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CminusParserParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CminusParserParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(CminusParserParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(CminusParserParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declaration(CminusParserParser.Func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declaration(CminusParserParser.Func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CminusParserParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CminusParserParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(CminusParserParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(CminusParserParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CminusParserParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CminusParserParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(CminusParserParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(CminusParserParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations(CminusParserParser.Local_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations(CminusParserParser.Local_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#statment_list}.
	 * @param ctx the parse tree
	 */
	void enterStatment_list(CminusParserParser.Statment_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#statment_list}.
	 * @param ctx the parse tree
	 */
	void exitStatment_list(CminusParserParser.Statment_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(CminusParserParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(CminusParserParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpression_stmt(CminusParserParser.Expression_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpression_stmt(CminusParserParser.Expression_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelection_stmt(CminusParserParser.Selection_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelection_stmt(CminusParserParser.Selection_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIteration_stmt(CminusParserParser.Iteration_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIteration_stmt(CminusParserParser.Iteration_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#for_cond}.
	 * @param ctx the parse tree
	 */
	void enterFor_cond(CminusParserParser.For_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#for_cond}.
	 * @param ctx the parse tree
	 */
	void exitFor_cond(CminusParserParser.For_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#while_cond}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cond(CminusParserParser.While_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#while_cond}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cond(CminusParserParser.While_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(CminusParserParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(CminusParserParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CminusParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CminusParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CminusParserParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CminusParserParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(CminusParserParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(CminusParserParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(CminusParserParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(CminusParserParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(CminusParserParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(CminusParserParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#factor_expression}.
	 * @param ctx the parse tree
	 */
	void enterFactor_expression(CminusParserParser.Factor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#factor_expression}.
	 * @param ctx the parse tree
	 */
	void exitFactor_expression(CminusParserParser.Factor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(CminusParserParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(CminusParserParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CminusParserParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CminusParserParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CminusParserParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CminusParserParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CminusParserParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CminusParserParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParserParser#args_list}.
	 * @param ctx the parse tree
	 */
	void enterArgs_list(CminusParserParser.Args_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParserParser#args_list}.
	 * @param ctx the parse tree
	 */
	void exitArgs_list(CminusParserParser.Args_listContext ctx);
}