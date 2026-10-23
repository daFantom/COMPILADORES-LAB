// Generated from gTCGParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gTCGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gTCGParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gTCGParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(gTCGParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#setup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetup(gTCGParser.SetupContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#setupAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetupAction(gTCGParser.SetupActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#coinChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoinChoice(gTCGParser.CoinChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#coinToss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoinToss(gTCGParser.CoinTossContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#firstPlayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstPlayer(gTCGParser.FirstPlayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#mulligan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulligan(gTCGParser.MulliganContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#mulliganCards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulliganCards(gTCGParser.MulliganCardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#openingHand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpeningHand(gTCGParser.OpeningHandContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#drawnCards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawnCards(gTCGParser.DrawnCardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#initialPokemon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialPokemon(gTCGParser.InitialPokemonContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#turn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurn(gTCGParser.TurnContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#mainTurnAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainTurnAction(gTCGParser.MainTurnActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#subTurnAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubTurnAction(gTCGParser.SubTurnActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#turnActionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnActionBody(gTCGParser.TurnActionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#drawAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawAction(gTCGParser.DrawActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#playAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayAction(gTCGParser.PlayActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#attachAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttachAction(gTCGParser.AttachActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#evolveAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvolveAction(gTCGParser.EvolveActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#attackAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttackAction(gTCGParser.AttackActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#damageBreakdown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDamageBreakdown(gTCGParser.DamageBreakdownContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#damageBreakdownLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDamageBreakdownLine(gTCGParser.DamageBreakdownLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#retreatAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetreatAction(gTCGParser.RetreatActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#shuffleAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShuffleAction(gTCGParser.ShuffleActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#discardAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscardAction(gTCGParser.DiscardActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#prizeAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrizeAction(gTCGParser.PrizeActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#moveToHandAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveToHandAction(gTCGParser.MoveToHandActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#activeSpotAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActiveSpotAction(gTCGParser.ActiveSpotActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#knockoutAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnockoutAction(gTCGParser.KnockoutActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#cardMovedAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardMovedAction(gTCGParser.CardMovedActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#switchAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchAction(gTCGParser.SwitchActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#damagedAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDamagedAction(gTCGParser.DamagedActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#flippedAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlippedAction(gTCGParser.FlippedActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#choiceAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceAction(gTCGParser.ChoiceActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#specialConditionAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialConditionAction(gTCGParser.SpecialConditionActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#activateAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivateAction(gTCGParser.ActivateActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#putAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutAction(gTCGParser.PutActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#endTurn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndTurn(gTCGParser.EndTurnContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#gameEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameEnd(gTCGParser.GameEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link gTCGParser#cardList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardList(gTCGParser.CardListContext ctx);
}