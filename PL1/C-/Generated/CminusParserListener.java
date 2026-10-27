// Generated from CminusParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CminusParser}.
 */
public interface CminusParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CminusParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CminusParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CminusParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(CminusParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(CminusParser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CminusParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CminusParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(CminusParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(CminusParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declaration(CminusParser.Func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declaration(CminusParser.Func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CminusParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CminusParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(CminusParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(CminusParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CminusParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CminusParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(CminusParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(CminusParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations(CminusParser.Local_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations(CminusParser.Local_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#statment_list}.
	 * @param ctx the parse tree
	 */
	void enterStatment_list(CminusParser.Statment_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#statment_list}.
	 * @param ctx the parse tree
	 */
	void exitStatment_list(CminusParser.Statment_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(CminusParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(CminusParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpression_stmt(CminusParser.Expression_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpression_stmt(CminusParser.Expression_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelection_stmt(CminusParser.Selection_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelection_stmt(CminusParser.Selection_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIteration_stmt(CminusParser.Iteration_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIteration_stmt(CminusParser.Iteration_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#for_cond}.
	 * @param ctx the parse tree
	 */
	void enterFor_cond(CminusParser.For_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#for_cond}.
	 * @param ctx the parse tree
	 */
	void exitFor_cond(CminusParser.For_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#while_cond}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cond(CminusParser.While_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#while_cond}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cond(CminusParser.While_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(CminusParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(CminusParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CminusParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CminusParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CminusParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CminusParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(CminusParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(CminusParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(CminusParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(CminusParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(CminusParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(CminusParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(CminusParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(CminusParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(CminusParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(CminusParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#factor_expression}.
	 * @param ctx the parse tree
	 */
	void enterFactor_expression(CminusParser.Factor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#factor_expression}.
	 * @param ctx the parse tree
	 */
	void exitFactor_expression(CminusParser.Factor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(CminusParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(CminusParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CminusParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CminusParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CminusParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CminusParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CminusParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CminusParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminusParser#args_list}.
	 * @param ctx the parse tree
	 */
	void enterArgs_list(CminusParser.Args_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminusParser#args_list}.
	 * @param ctx the parse tree
	 */
	void exitArgs_list(CminusParser.Args_listContext ctx);
}