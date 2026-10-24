// Generated from gTCGParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gTCGParser}.
 */
public interface gTCGParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gTCGParser#player}.
	 * @param ctx the parse tree
	 */
	void enterPlayer(gTCGParser.PlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#player}.
	 * @param ctx the parse tree
	 */
	void exitPlayer(gTCGParser.PlayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#damageAmount}.
	 * @param ctx the parse tree
	 */
	void enterDamageAmount(gTCGParser.DamageAmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#damageAmount}.
	 * @param ctx the parse tree
	 */
	void exitDamageAmount(gTCGParser.DamageAmountContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(gTCGParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(gTCGParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#setup}.
	 * @param ctx the parse tree
	 */
	void enterSetup(gTCGParser.SetupContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#setup}.
	 * @param ctx the parse tree
	 */
	void exitSetup(gTCGParser.SetupContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#setupAction}.
	 * @param ctx the parse tree
	 */
	void enterSetupAction(gTCGParser.SetupActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#setupAction}.
	 * @param ctx the parse tree
	 */
	void exitSetupAction(gTCGParser.SetupActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#coinChoice}.
	 * @param ctx the parse tree
	 */
	void enterCoinChoice(gTCGParser.CoinChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#coinChoice}.
	 * @param ctx the parse tree
	 */
	void exitCoinChoice(gTCGParser.CoinChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#coinToss}.
	 * @param ctx the parse tree
	 */
	void enterCoinToss(gTCGParser.CoinTossContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#coinToss}.
	 * @param ctx the parse tree
	 */
	void exitCoinToss(gTCGParser.CoinTossContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#firstPlayer}.
	 * @param ctx the parse tree
	 */
	void enterFirstPlayer(gTCGParser.FirstPlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#firstPlayer}.
	 * @param ctx the parse tree
	 */
	void exitFirstPlayer(gTCGParser.FirstPlayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#mulligan}.
	 * @param ctx the parse tree
	 */
	void enterMulligan(gTCGParser.MulliganContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#mulligan}.
	 * @param ctx the parse tree
	 */
	void exitMulligan(gTCGParser.MulliganContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#mulliganCards}.
	 * @param ctx the parse tree
	 */
	void enterMulliganCards(gTCGParser.MulliganCardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#mulliganCards}.
	 * @param ctx the parse tree
	 */
	void exitMulliganCards(gTCGParser.MulliganCardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#openingHand}.
	 * @param ctx the parse tree
	 */
	void enterOpeningHand(gTCGParser.OpeningHandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#openingHand}.
	 * @param ctx the parse tree
	 */
	void exitOpeningHand(gTCGParser.OpeningHandContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#drawnCards}.
	 * @param ctx the parse tree
	 */
	void enterDrawnCards(gTCGParser.DrawnCardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#drawnCards}.
	 * @param ctx the parse tree
	 */
	void exitDrawnCards(gTCGParser.DrawnCardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#initialPokemon}.
	 * @param ctx the parse tree
	 */
	void enterInitialPokemon(gTCGParser.InitialPokemonContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#initialPokemon}.
	 * @param ctx the parse tree
	 */
	void exitInitialPokemon(gTCGParser.InitialPokemonContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#turn}.
	 * @param ctx the parse tree
	 */
	void enterTurn(gTCGParser.TurnContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#turn}.
	 * @param ctx the parse tree
	 */
	void exitTurn(gTCGParser.TurnContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#mainTurnAction}.
	 * @param ctx the parse tree
	 */
	void enterMainTurnAction(gTCGParser.MainTurnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#mainTurnAction}.
	 * @param ctx the parse tree
	 */
	void exitMainTurnAction(gTCGParser.MainTurnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#subTurnAction}.
	 * @param ctx the parse tree
	 */
	void enterSubTurnAction(gTCGParser.SubTurnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#subTurnAction}.
	 * @param ctx the parse tree
	 */
	void exitSubTurnAction(gTCGParser.SubTurnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#turnActionBody}.
	 * @param ctx the parse tree
	 */
	void enterTurnActionBody(gTCGParser.TurnActionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#turnActionBody}.
	 * @param ctx the parse tree
	 */
	void exitTurnActionBody(gTCGParser.TurnActionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#drawAction}.
	 * @param ctx the parse tree
	 */
	void enterDrawAction(gTCGParser.DrawActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#drawAction}.
	 * @param ctx the parse tree
	 */
	void exitDrawAction(gTCGParser.DrawActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#playAction}.
	 * @param ctx the parse tree
	 */
	void enterPlayAction(gTCGParser.PlayActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#playAction}.
	 * @param ctx the parse tree
	 */
	void exitPlayAction(gTCGParser.PlayActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#attachAction}.
	 * @param ctx the parse tree
	 */
	void enterAttachAction(gTCGParser.AttachActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#attachAction}.
	 * @param ctx the parse tree
	 */
	void exitAttachAction(gTCGParser.AttachActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#evolveAction}.
	 * @param ctx the parse tree
	 */
	void enterEvolveAction(gTCGParser.EvolveActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#evolveAction}.
	 * @param ctx the parse tree
	 */
	void exitEvolveAction(gTCGParser.EvolveActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#attackAction}.
	 * @param ctx the parse tree
	 */
	void enterAttackAction(gTCGParser.AttackActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#attackAction}.
	 * @param ctx the parse tree
	 */
	void exitAttackAction(gTCGParser.AttackActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#damageBreakdown}.
	 * @param ctx the parse tree
	 */
	void enterDamageBreakdown(gTCGParser.DamageBreakdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#damageBreakdown}.
	 * @param ctx the parse tree
	 */
	void exitDamageBreakdown(gTCGParser.DamageBreakdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#damageBreakdownLine}.
	 * @param ctx the parse tree
	 */
	void enterDamageBreakdownLine(gTCGParser.DamageBreakdownLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#damageBreakdownLine}.
	 * @param ctx the parse tree
	 */
	void exitDamageBreakdownLine(gTCGParser.DamageBreakdownLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#retreatAction}.
	 * @param ctx the parse tree
	 */
	void enterRetreatAction(gTCGParser.RetreatActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#retreatAction}.
	 * @param ctx the parse tree
	 */
	void exitRetreatAction(gTCGParser.RetreatActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#shuffleAction}.
	 * @param ctx the parse tree
	 */
	void enterShuffleAction(gTCGParser.ShuffleActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#shuffleAction}.
	 * @param ctx the parse tree
	 */
	void exitShuffleAction(gTCGParser.ShuffleActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#discardAction}.
	 * @param ctx the parse tree
	 */
	void enterDiscardAction(gTCGParser.DiscardActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#discardAction}.
	 * @param ctx the parse tree
	 */
	void exitDiscardAction(gTCGParser.DiscardActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#prizeAction}.
	 * @param ctx the parse tree
	 */
	void enterPrizeAction(gTCGParser.PrizeActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#prizeAction}.
	 * @param ctx the parse tree
	 */
	void exitPrizeAction(gTCGParser.PrizeActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#moveToHandAction}.
	 * @param ctx the parse tree
	 */
	void enterMoveToHandAction(gTCGParser.MoveToHandActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#moveToHandAction}.
	 * @param ctx the parse tree
	 */
	void exitMoveToHandAction(gTCGParser.MoveToHandActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#activeSpotAction}.
	 * @param ctx the parse tree
	 */
	void enterActiveSpotAction(gTCGParser.ActiveSpotActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#activeSpotAction}.
	 * @param ctx the parse tree
	 */
	void exitActiveSpotAction(gTCGParser.ActiveSpotActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#knockoutAction}.
	 * @param ctx the parse tree
	 */
	void enterKnockoutAction(gTCGParser.KnockoutActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#knockoutAction}.
	 * @param ctx the parse tree
	 */
	void exitKnockoutAction(gTCGParser.KnockoutActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#cardMovedAction}.
	 * @param ctx the parse tree
	 */
	void enterCardMovedAction(gTCGParser.CardMovedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#cardMovedAction}.
	 * @param ctx the parse tree
	 */
	void exitCardMovedAction(gTCGParser.CardMovedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#switchAction}.
	 * @param ctx the parse tree
	 */
	void enterSwitchAction(gTCGParser.SwitchActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#switchAction}.
	 * @param ctx the parse tree
	 */
	void exitSwitchAction(gTCGParser.SwitchActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#damagedAction}.
	 * @param ctx the parse tree
	 */
	void enterDamagedAction(gTCGParser.DamagedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#damagedAction}.
	 * @param ctx the parse tree
	 */
	void exitDamagedAction(gTCGParser.DamagedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#flippedAction}.
	 * @param ctx the parse tree
	 */
	void enterFlippedAction(gTCGParser.FlippedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#flippedAction}.
	 * @param ctx the parse tree
	 */
	void exitFlippedAction(gTCGParser.FlippedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#choiceAction}.
	 * @param ctx the parse tree
	 */
	void enterChoiceAction(gTCGParser.ChoiceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#choiceAction}.
	 * @param ctx the parse tree
	 */
	void exitChoiceAction(gTCGParser.ChoiceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#specialConditionAction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialConditionAction(gTCGParser.SpecialConditionActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#specialConditionAction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialConditionAction(gTCGParser.SpecialConditionActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#activateAction}.
	 * @param ctx the parse tree
	 */
	void enterActivateAction(gTCGParser.ActivateActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#activateAction}.
	 * @param ctx the parse tree
	 */
	void exitActivateAction(gTCGParser.ActivateActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#putAction}.
	 * @param ctx the parse tree
	 */
	void enterPutAction(gTCGParser.PutActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#putAction}.
	 * @param ctx the parse tree
	 */
	void exitPutAction(gTCGParser.PutActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#endTurn}.
	 * @param ctx the parse tree
	 */
	void enterEndTurn(gTCGParser.EndTurnContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#endTurn}.
	 * @param ctx the parse tree
	 */
	void exitEndTurn(gTCGParser.EndTurnContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#gameEnd}.
	 * @param ctx the parse tree
	 */
	void enterGameEnd(gTCGParser.GameEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#gameEnd}.
	 * @param ctx the parse tree
	 */
	void exitGameEnd(gTCGParser.GameEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link gTCGParser#cardList}.
	 * @param ctx the parse tree
	 */
	void enterCardList(gTCGParser.CardListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gTCGParser#cardList}.
	 * @param ctx the parse tree
	 */
	void exitCardList(gTCGParser.CardListContext ctx);
}