// Generated from gTCGParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gTCGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MULLIGAN=1, TURN=2, POKEMON=3, ADDED=4, REVEALED=5, AT=6, LEAST=7, PUT=8, 
		COUNTERS=9, SETUP=10, CHOSE=11, HEADS=12, TAILS=13, FOR=14, THE=15, OPENING=16, 
		COIN=17, FLIP=18, FLIPPED=19, WON=20, TOSS=21, DECIDED=22, TO=23, GO=24, 
		FIRST=25, DREW=26, DRAWN=27, CARDS=28, CARD_WORD=29, ABILITY_WORD=30, 
		SUPPORTER_WORD=31, ATTACK_WORD=32, POKEMON_TOOL=33, HAND=34, PLAYED=35, 
		ATTACHED=36, EVOLVED=37, USED=38, OF=39, ON=40, IN=41, IT=42, WITH=43, 
		WAS=44, WERE=45, IS=46, NOW=47, BECOME=48, LANDED=49, ACTIVE=50, ACTIVATED=51, 
		SPOT=52, BENCH=53, STADIUM=54, DAMAGE=55, DISCARDED=56, DISCARDS=57, SHUFFLED=58, 
		DECK=59, INTO=60, THEIR=61, FROM=62, MOVED=63, TAKE=64, PRIZE=65, PRIZE_CARDS=66, 
		KNOCKED=67, OUT=68, SWITCHED=69, RETIRED=70, ENDED=71, OPPONENT=72, CONCEDED=73, 
		WINS=74, ALL=75, TAKEN=76, A_SOMETHING=77, AND=78, THEM=79, ENERGY=80, 
		SELECTED=81, YOU=82, MORE_WORD=83, BECAUSE=84, WEAKNESS=85, DAMAGE_BREAKDOWN=86, 
		BASE_DAMAGE=87, TOTAL_DAMAGE=88, ITEM=89, POSSESSIVE=90, CARD=91, ATTACK=92, 
		ABILITY=93, SPECIAL_CONDITION=94, POKEMON_TYPE=95, NUMBER=96, NO_ACTION=97, 
		NO_BENCHED=98, PLAYER=99, DOT=100, COMMA=101, COLON=102, EXCLAMATION=103, 
		LPAREN=104, RPAREN=105, BULLET=106, HYPHEN=107, NEWLINE=108, WS=109;
	public static final int
		RULE_player = 0, RULE_damageAmount = 1, RULE_log = 2, RULE_setup = 3, 
		RULE_setupAction = 4, RULE_coinChoice = 5, RULE_coinToss = 6, RULE_firstPlayer = 7, 
		RULE_mulligan = 8, RULE_mulliganCards = 9, RULE_openingHand = 10, RULE_drawnCards = 11, 
		RULE_initialPokemon = 12, RULE_turn = 13, RULE_mainTurnAction = 14, RULE_subTurnAction = 15, 
		RULE_turnActionBody = 16, RULE_drawAction = 17, RULE_playAction = 18, 
		RULE_attachAction = 19, RULE_evolveAction = 20, RULE_attackAction = 21, 
		RULE_damageBreakdown = 22, RULE_damageBreakdownLine = 23, RULE_retreatAction = 24, 
		RULE_shuffleAction = 25, RULE_discardAction = 26, RULE_prizeAction = 27, 
		RULE_moveToHandAction = 28, RULE_activeSpotAction = 29, RULE_knockoutAction = 30, 
		RULE_cardMovedAction = 31, RULE_switchAction = 32, RULE_damagedAction = 33, 
		RULE_flippedAction = 34, RULE_choiceAction = 35, RULE_specialConditionAction = 36, 
		RULE_activateAction = 37, RULE_putAction = 38, RULE_endTurn = 39, RULE_noAction = 40, 
		RULE_gameEnd = 41, RULE_cardList = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"player", "damageAmount", "log", "setup", "setupAction", "coinChoice", 
			"coinToss", "firstPlayer", "mulligan", "mulliganCards", "openingHand", 
			"drawnCards", "initialPokemon", "turn", "mainTurnAction", "subTurnAction", 
			"turnActionBody", "drawAction", "playAction", "attachAction", "evolveAction", 
			"attackAction", "damageBreakdown", "damageBreakdownLine", "retreatAction", 
			"shuffleAction", "discardAction", "prizeAction", "moveToHandAction", 
			"activeSpotAction", "knockoutAction", "cardMovedAction", "switchAction", 
			"damagedAction", "flippedAction", "choiceAction", "specialConditionAction", 
			"activateAction", "putAction", "endTurn", "noAction", "gameEnd", "cardList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'Pok\\u00E9mon'", "'added'", "'revealed'", "'at'", 
			"'least'", "'put'", "'counters'", "'Setup'", "'chose'", "'heads'", "'tails'", 
			"'for'", "'the'", "'opening'", "'coin'", "'flip'", "'flipped'", "'won'", 
			"'toss'", "'decided'", "'to'", "'go'", "'first'", "'drew'", "'drawn'", 
			null, "'card'", "'Ability'", "'Supporter'", "'Attack'", "'Pok\\u00E9mon Tool'", 
			"'hand'", "'played'", "'attached'", "'evolved'", "'used'", "'of'", "'on'", 
			"'in'", "'it'", "'with'", "'was'", "'were'", "'is'", "'now'", "'become'", 
			"'landed'", "'Active'", "'activated'", null, "'Bench'", "'Stadium'", 
			"'damage'", "'discarded'", "'discard'", "'shuffled'", "'deck'", "'into'", 
			"'their'", "'from'", "'moved'", "'took'", "'Prize'", "'Prize cards'", 
			"'Knocked'", "'Out'", "'switched'", "'retreated'", "'ended'", "'Opponent'", 
			"'conceded'", "'wins'", null, "'taken'", null, "'and'", "'them'", "'Energy'", 
			"'selected'", null, "'more'", "'because'", "'Weakness'", "'Damage breakdown'", 
			"'Base damage'", "'Total damage'", "'Item'", null, null, null, null, 
			null, null, null, null, "'with no Benched Pok\\u00E9mon'", null, "'.'", 
			"','", "':'", "'!'", "'('", "')'", "'\\u2022'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MULLIGAN", "TURN", "POKEMON", "ADDED", "REVEALED", "AT", "LEAST", 
			"PUT", "COUNTERS", "SETUP", "CHOSE", "HEADS", "TAILS", "FOR", "THE", 
			"OPENING", "COIN", "FLIP", "FLIPPED", "WON", "TOSS", "DECIDED", "TO", 
			"GO", "FIRST", "DREW", "DRAWN", "CARDS", "CARD_WORD", "ABILITY_WORD", 
			"SUPPORTER_WORD", "ATTACK_WORD", "POKEMON_TOOL", "HAND", "PLAYED", "ATTACHED", 
			"EVOLVED", "USED", "OF", "ON", "IN", "IT", "WITH", "WAS", "WERE", "IS", 
			"NOW", "BECOME", "LANDED", "ACTIVE", "ACTIVATED", "SPOT", "BENCH", "STADIUM", 
			"DAMAGE", "DISCARDED", "DISCARDS", "SHUFFLED", "DECK", "INTO", "THEIR", 
			"FROM", "MOVED", "TAKE", "PRIZE", "PRIZE_CARDS", "KNOCKED", "OUT", "SWITCHED", 
			"RETIRED", "ENDED", "OPPONENT", "CONCEDED", "WINS", "ALL", "TAKEN", "A_SOMETHING", 
			"AND", "THEM", "ENERGY", "SELECTED", "YOU", "MORE_WORD", "BECAUSE", "WEAKNESS", 
			"DAMAGE_BREAKDOWN", "BASE_DAMAGE", "TOTAL_DAMAGE", "ITEM", "POSSESSIVE", 
			"CARD", "ATTACK", "ABILITY", "SPECIAL_CONDITION", "POKEMON_TYPE", "NUMBER", 
			"NO_ACTION", "NO_BENCHED", "PLAYER", "DOT", "COMMA", "COLON", "EXCLAMATION", 
			"LPAREN", "RPAREN", "BULLET", "HYPHEN", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gTCGParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gTCGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlayerContext extends ParserRuleContext {
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitPlayer(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_player);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DamageAmountContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public DamageAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damageAmount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDamageAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDamageAmount(this);
		}
	}

	public final DamageAmountContext damageAmount() throws RecognitionException {
		DamageAmountContext _localctx = new DamageAmountContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_damageAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogContext extends ParserRuleContext {
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
		}
		public GameEndContext gameEnd() {
			return getRuleContext(GameEndContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gTCGParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(gTCGParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gTCGParser.NEWLINE, i);
		}
		public List<TurnContext> turn() {
			return getRuleContexts(TurnContext.class);
		}
		public TurnContext turn(int i) {
			return getRuleContext(TurnContext.class,i);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitLog(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			setup();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(91);
				match(NEWLINE);
				setState(92);
				turn();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			gameEnd();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(99);
				match(NEWLINE);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetupContext extends ParserRuleContext {
		public TerminalNode SETUP() { return getToken(gTCGParser.SETUP, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public List<SetupActionContext> setupAction() {
			return getRuleContexts(SetupActionContext.class);
		}
		public SetupActionContext setupAction(int i) {
			return getRuleContext(SetupActionContext.class,i);
		}
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterSetup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitSetup(this);
		}
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(SETUP);
			setState(108);
			match(NEWLINE);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					setupAction();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetupActionContext extends ParserRuleContext {
		public CoinChoiceContext coinChoice() {
			return getRuleContext(CoinChoiceContext.class,0);
		}
		public CoinTossContext coinToss() {
			return getRuleContext(CoinTossContext.class,0);
		}
		public FirstPlayerContext firstPlayer() {
			return getRuleContext(FirstPlayerContext.class,0);
		}
		public OpeningHandContext openingHand() {
			return getRuleContext(OpeningHandContext.class,0);
		}
		public InitialPokemonContext initialPokemon() {
			return getRuleContext(InitialPokemonContext.class,0);
		}
		public MulliganContext mulligan() {
			return getRuleContext(MulliganContext.class,0);
		}
		public SetupActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setupAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterSetupAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitSetupAction(this);
		}
	}

	public final SetupActionContext setupAction() throws RecognitionException {
		SetupActionContext _localctx = new SetupActionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_setupAction);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				coinChoice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				coinToss();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				firstPlayer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				openingHand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				initialPokemon();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				mulligan();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoinChoiceContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode CHOSE() { return getToken(gTCGParser.CHOSE, 0); }
		public TerminalNode FOR() { return getToken(gTCGParser.FOR, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode OPENING() { return getToken(gTCGParser.OPENING, 0); }
		public TerminalNode COIN() { return getToken(gTCGParser.COIN, 0); }
		public TerminalNode FLIP() { return getToken(gTCGParser.FLIP, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode HEADS() { return getToken(gTCGParser.HEADS, 0); }
		public TerminalNode TAILS() { return getToken(gTCGParser.TAILS, 0); }
		public CoinChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coinChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterCoinChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitCoinChoice(this);
		}
	}

	public final CoinChoiceContext coinChoice() throws RecognitionException {
		CoinChoiceContext _localctx = new CoinChoiceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_coinChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			player();
			setState(124);
			match(CHOSE);
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			match(FOR);
			setState(127);
			match(THE);
			setState(128);
			match(OPENING);
			setState(129);
			match(COIN);
			setState(130);
			match(FLIP);
			setState(131);
			match(DOT);
			setState(132);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoinTossContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode WON() { return getToken(gTCGParser.WON, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode COIN() { return getToken(gTCGParser.COIN, 0); }
		public TerminalNode TOSS() { return getToken(gTCGParser.TOSS, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public CoinTossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coinToss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterCoinToss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitCoinToss(this);
		}
	}

	public final CoinTossContext coinToss() throws RecognitionException {
		CoinTossContext _localctx = new CoinTossContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_coinToss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			player();
			setState(135);
			match(WON);
			setState(136);
			match(THE);
			setState(137);
			match(COIN);
			setState(138);
			match(TOSS);
			setState(139);
			match(DOT);
			setState(140);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FirstPlayerContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode DECIDED() { return getToken(gTCGParser.DECIDED, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode GO() { return getToken(gTCGParser.GO, 0); }
		public TerminalNode FIRST() { return getToken(gTCGParser.FIRST, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public FirstPlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstPlayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterFirstPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitFirstPlayer(this);
		}
	}

	public final FirstPlayerContext firstPlayer() throws RecognitionException {
		FirstPlayerContext _localctx = new FirstPlayerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_firstPlayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			player();
			setState(143);
			match(DECIDED);
			setState(144);
			match(TO);
			setState(145);
			match(GO);
			setState(146);
			match(FIRST);
			setState(147);
			match(DOT);
			setState(148);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulliganContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public MulliganCardsContext mulliganCards() {
			return getRuleContext(MulliganCardsContext.class,0);
		}
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public TerminalNode A_SOMETHING() { return getToken(gTCGParser.A_SOMETHING, 0); }
		public TerminalNode MULLIGAN() { return getToken(gTCGParser.MULLIGAN, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public MulliganContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulligan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterMulligan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitMulligan(this);
		}
	}

	public final MulliganContext mulligan() throws RecognitionException {
		MulliganContext _localctx = new MulliganContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mulligan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(150);
				player();
				setState(151);
				match(TAKE);
				setState(152);
				match(A_SOMETHING);
				setState(153);
				match(MULLIGAN);
				setState(154);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(156);
				player();
				setState(157);
				match(TAKE);
				setState(158);
				match(NUMBER);
				setState(159);
				match(MULLIGAN);
				setState(160);
				match(DOT);
				}
				break;
			}
			setState(164);
			match(NEWLINE);
			setState(165);
			mulliganCards();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulliganCardsContext extends ParserRuleContext {
		public TerminalNode HYPHEN() { return getToken(gTCGParser.HYPHEN, 0); }
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public TerminalNode REVEALED() { return getToken(gTCGParser.REVEALED, 0); }
		public TerminalNode FROM() { return getToken(gTCGParser.FROM, 0); }
		public TerminalNode MULLIGAN() { return getToken(gTCGParser.MULLIGAN, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public CardListContext cardList() {
			return getRuleContext(CardListContext.class,0);
		}
		public MulliganCardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulliganCards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterMulliganCards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitMulliganCards(this);
		}
	}

	public final MulliganCardsContext mulliganCards() throws RecognitionException {
		MulliganCardsContext _localctx = new MulliganCardsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mulliganCards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(HYPHEN);
			setState(168);
			match(CARDS);
			setState(169);
			match(REVEALED);
			setState(170);
			match(FROM);
			setState(171);
			match(MULLIGAN);
			setState(172);
			match(NUMBER);
			setState(173);
			match(NEWLINE);
			setState(174);
			cardList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpeningHandContext extends ParserRuleContext {
		public List<PlayerContext> player() {
			return getRuleContexts(PlayerContext.class);
		}
		public PlayerContext player(int i) {
			return getRuleContext(PlayerContext.class,i);
		}
		public TerminalNode DREW() { return getToken(gTCGParser.DREW, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(gTCGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gTCGParser.NUMBER, i);
		}
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public TerminalNode FOR() { return getToken(gTCGParser.FOR, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode OPENING() { return getToken(gTCGParser.OPENING, 0); }
		public TerminalNode HAND() { return getToken(gTCGParser.HAND, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode MORE_WORD() { return getToken(gTCGParser.MORE_WORD, 0); }
		public TerminalNode BECAUSE() { return getToken(gTCGParser.BECAUSE, 0); }
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public TerminalNode AT() { return getToken(gTCGParser.AT, 0); }
		public TerminalNode LEAST() { return getToken(gTCGParser.LEAST, 0); }
		public TerminalNode MULLIGAN() { return getToken(gTCGParser.MULLIGAN, 0); }
		public TerminalNode CARD_WORD() { return getToken(gTCGParser.CARD_WORD, 0); }
		public DrawnCardsContext drawnCards() {
			return getRuleContext(DrawnCardsContext.class,0);
		}
		public OpeningHandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openingHand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterOpeningHand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitOpeningHand(this);
		}
	}

	public final OpeningHandContext openingHand() throws RecognitionException {
		OpeningHandContext _localctx = new OpeningHandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_openingHand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(176);
				player();
				setState(177);
				match(DREW);
				setState(178);
				match(NUMBER);
				setState(179);
				match(CARDS);
				setState(180);
				match(FOR);
				setState(181);
				match(THE);
				setState(182);
				match(OPENING);
				setState(183);
				match(HAND);
				setState(184);
				match(DOT);
				setState(185);
				match(NEWLINE);
				}
				break;
			case 2:
				{
				setState(187);
				player();
				setState(188);
				match(DREW);
				setState(189);
				match(NUMBER);
				setState(190);
				match(MORE_WORD);
				setState(191);
				_la = _input.LA(1);
				if ( !(_la==CARDS || _la==CARD_WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				match(BECAUSE);
				setState(193);
				player();
				setState(194);
				match(TAKE);
				setState(195);
				match(AT);
				setState(196);
				match(LEAST);
				setState(197);
				match(NUMBER);
				setState(198);
				match(MULLIGAN);
				setState(199);
				match(DOT);
				setState(200);
				match(NEWLINE);
				}
				break;
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HYPHEN) {
				{
				setState(204);
				drawnCards();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DrawnCardsContext extends ParserRuleContext {
		public TerminalNode HYPHEN() { return getToken(gTCGParser.HYPHEN, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode DRAWN() { return getToken(gTCGParser.DRAWN, 0); }
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode DREW() { return getToken(gTCGParser.DREW, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public CardListContext cardList() {
			return getRuleContext(CardListContext.class,0);
		}
		public DrawnCardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawnCards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDrawnCards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDrawnCards(this);
		}
	}

	public final DrawnCardsContext drawnCards() throws RecognitionException {
		DrawnCardsContext _localctx = new DrawnCardsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_drawnCards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(207);
				match(HYPHEN);
				setState(208);
				match(NUMBER);
				setState(209);
				match(DRAWN);
				setState(210);
				match(CARDS);
				setState(211);
				match(DOT);
				setState(212);
				match(NEWLINE);
				}
				break;
			case 2:
				{
				setState(213);
				match(HYPHEN);
				setState(214);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				match(DREW);
				setState(216);
				match(NUMBER);
				setState(217);
				match(CARDS);
				setState(218);
				match(DOT);
				setState(219);
				match(NEWLINE);
				}
				break;
			case 3:
				{
				setState(220);
				match(HYPHEN);
				setState(221);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(222);
				match(DREW);
				setState(223);
				match(CARD);
				setState(224);
				match(DOT);
				setState(225);
				match(NEWLINE);
				}
				break;
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(228);
				cardList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitialPokemonContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode PLAYED() { return getToken(gTCGParser.PLAYED, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode ACTIVE() { return getToken(gTCGParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(gTCGParser.SPOT, 0); }
		public TerminalNode BENCH() { return getToken(gTCGParser.BENCH, 0); }
		public InitialPokemonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialPokemon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterInitialPokemon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitInitialPokemon(this);
		}
	}

	public final InitialPokemonContext initialPokemon() throws RecognitionException {
		InitialPokemonContext _localctx = new InitialPokemonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_initialPokemon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			player();
			setState(232);
			match(PLAYED);
			setState(233);
			match(CARD);
			setState(234);
			match(TO);
			setState(235);
			match(THE);
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIVE:
				{
				setState(236);
				match(ACTIVE);
				setState(237);
				match(SPOT);
				}
				break;
			case BENCH:
				{
				setState(238);
				match(BENCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(241);
			match(DOT);
			setState(242);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TurnContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode TURN() { return getToken(gTCGParser.TURN, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public List<MainTurnActionContext> mainTurnAction() {
			return getRuleContexts(MainTurnActionContext.class);
		}
		public MainTurnActionContext mainTurnAction(int i) {
			return getRuleContext(MainTurnActionContext.class,i);
		}
		public TurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterTurn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitTurn(this);
		}
	}

	public final TurnContext turn() throws RecognitionException {
		TurnContext _localctx = new TurnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_turn);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			player();
			setState(245);
			match(POSSESSIVE);
			setState(246);
			match(TURN);
			setState(247);
			match(NEWLINE);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					mainTurnAction();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainTurnActionContext extends ParserRuleContext {
		public TurnActionBodyContext turnActionBody() {
			return getRuleContext(TurnActionBodyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode EXCLAMATION() { return getToken(gTCGParser.EXCLAMATION, 0); }
		public List<SubTurnActionContext> subTurnAction() {
			return getRuleContexts(SubTurnActionContext.class);
		}
		public SubTurnActionContext subTurnAction(int i) {
			return getRuleContext(SubTurnActionContext.class,i);
		}
		public List<DamageBreakdownContext> damageBreakdown() {
			return getRuleContexts(DamageBreakdownContext.class);
		}
		public DamageBreakdownContext damageBreakdown(int i) {
			return getRuleContext(DamageBreakdownContext.class,i);
		}
		public MainTurnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainTurnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterMainTurnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitMainTurnAction(this);
		}
	}

	public final MainTurnActionContext mainTurnAction() throws RecognitionException {
		MainTurnActionContext _localctx = new MainTurnActionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mainTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			turnActionBody();
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==EXCLAMATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(256);
			match(NEWLINE);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYPHEN) {
				{
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(257);
					subTurnAction();
					}
					break;
				case 2:
					{
					setState(258);
					damageBreakdown();
					}
					break;
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubTurnActionContext extends ParserRuleContext {
		public TerminalNode HYPHEN() { return getToken(gTCGParser.HYPHEN, 0); }
		public TurnActionBodyContext turnActionBody() {
			return getRuleContext(TurnActionBodyContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public List<CardListContext> cardList() {
			return getRuleContexts(CardListContext.class);
		}
		public CardListContext cardList(int i) {
			return getRuleContext(CardListContext.class,i);
		}
		public SubTurnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subTurnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterSubTurnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitSubTurnAction(this);
		}
	}

	public final SubTurnActionContext subTurnAction() throws RecognitionException {
		SubTurnActionContext _localctx = new SubTurnActionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(HYPHEN);
			setState(265);
			turnActionBody();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(266);
				match(DOT);
				}
			}

			setState(269);
			match(NEWLINE);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BULLET) {
				{
				{
				setState(270);
				cardList();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TurnActionBodyContext extends ParserRuleContext {
		public DrawActionContext drawAction() {
			return getRuleContext(DrawActionContext.class,0);
		}
		public PlayActionContext playAction() {
			return getRuleContext(PlayActionContext.class,0);
		}
		public AttachActionContext attachAction() {
			return getRuleContext(AttachActionContext.class,0);
		}
		public EvolveActionContext evolveAction() {
			return getRuleContext(EvolveActionContext.class,0);
		}
		public AttackActionContext attackAction() {
			return getRuleContext(AttackActionContext.class,0);
		}
		public RetreatActionContext retreatAction() {
			return getRuleContext(RetreatActionContext.class,0);
		}
		public ShuffleActionContext shuffleAction() {
			return getRuleContext(ShuffleActionContext.class,0);
		}
		public CardMovedActionContext cardMovedAction() {
			return getRuleContext(CardMovedActionContext.class,0);
		}
		public DiscardActionContext discardAction() {
			return getRuleContext(DiscardActionContext.class,0);
		}
		public PrizeActionContext prizeAction() {
			return getRuleContext(PrizeActionContext.class,0);
		}
		public MoveToHandActionContext moveToHandAction() {
			return getRuleContext(MoveToHandActionContext.class,0);
		}
		public ActiveSpotActionContext activeSpotAction() {
			return getRuleContext(ActiveSpotActionContext.class,0);
		}
		public SwitchActionContext switchAction() {
			return getRuleContext(SwitchActionContext.class,0);
		}
		public KnockoutActionContext knockoutAction() {
			return getRuleContext(KnockoutActionContext.class,0);
		}
		public DamagedActionContext damagedAction() {
			return getRuleContext(DamagedActionContext.class,0);
		}
		public FlippedActionContext flippedAction() {
			return getRuleContext(FlippedActionContext.class,0);
		}
		public ChoiceActionContext choiceAction() {
			return getRuleContext(ChoiceActionContext.class,0);
		}
		public SpecialConditionActionContext specialConditionAction() {
			return getRuleContext(SpecialConditionActionContext.class,0);
		}
		public ActivateActionContext activateAction() {
			return getRuleContext(ActivateActionContext.class,0);
		}
		public PutActionContext putAction() {
			return getRuleContext(PutActionContext.class,0);
		}
		public EndTurnContext endTurn() {
			return getRuleContext(EndTurnContext.class,0);
		}
		public NoActionContext noAction() {
			return getRuleContext(NoActionContext.class,0);
		}
		public TurnActionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnActionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterTurnActionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitTurnActionBody(this);
		}
	}

	public final TurnActionBodyContext turnActionBody() throws RecognitionException {
		TurnActionBodyContext _localctx = new TurnActionBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_turnActionBody);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				drawAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				playAction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				attachAction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				evolveAction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				attackAction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				retreatAction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(282);
				shuffleAction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(283);
				cardMovedAction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(284);
				discardAction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(285);
				prizeAction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(286);
				moveToHandAction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(287);
				activeSpotAction();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(288);
				switchAction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(289);
				knockoutAction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(290);
				damagedAction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(291);
				flippedAction();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(292);
				choiceAction();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(293);
				specialConditionAction();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(294);
				activateAction();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(295);
				putAction();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(296);
				endTurn();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(297);
				noAction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DrawActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode DREW() { return getToken(gTCGParser.DREW, 0); }
		public TerminalNode CARD_WORD() { return getToken(gTCGParser.CARD_WORD, 0); }
		public TerminalNode A_SOMETHING() { return getToken(gTCGParser.A_SOMETHING, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public TerminalNode AND() { return getToken(gTCGParser.AND, 0); }
		public TerminalNode PLAYED() { return getToken(gTCGParser.PLAYED, 0); }
		public TerminalNode THEM() { return getToken(gTCGParser.THEM, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(gTCGParser.BENCH, 0); }
		public DrawActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDrawAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDrawAction(this);
		}
	}

	public final DrawActionContext drawAction() throws RecognitionException {
		DrawActionContext _localctx = new DrawActionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_drawAction);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				player();
				setState(301);
				match(DREW);
				setState(302);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				player();
				setState(305);
				match(DREW);
				setState(306);
				match(A_SOMETHING);
				setState(307);
				match(CARD_WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				player();
				setState(310);
				match(DREW);
				setState(311);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				player();
				setState(314);
				match(DREW);
				setState(315);
				match(NUMBER);
				setState(316);
				match(CARD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				player();
				setState(319);
				match(DREW);
				setState(320);
				match(NUMBER);
				setState(321);
				match(CARDS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
				player();
				setState(324);
				match(DREW);
				setState(325);
				match(NUMBER);
				setState(326);
				match(CARDS);
				setState(327);
				match(AND);
				setState(328);
				match(PLAYED);
				setState(329);
				match(THEM);
				setState(330);
				match(TO);
				setState(331);
				match(THE);
				setState(332);
				match(BENCH);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlayActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode PLAYED() { return getToken(gTCGParser.PLAYED, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(gTCGParser.BENCH, 0); }
		public TerminalNode ACTIVE() { return getToken(gTCGParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(gTCGParser.SPOT, 0); }
		public TerminalNode STADIUM() { return getToken(gTCGParser.STADIUM, 0); }
		public PlayActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterPlayAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitPlayAction(this);
		}
	}

	public final PlayActionContext playAction() throws RecognitionException {
		PlayActionContext _localctx = new PlayActionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_playAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			player();
			setState(337);
			match(PLAYED);
			setState(338);
			match(CARD);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(339);
				match(TO);
				setState(340);
				match(THE);
				setState(346);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(341);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(342);
					match(ACTIVE);
					setState(343);
					match(SPOT);
					}
					break;
				case STADIUM:
					{
					setState(344);
					match(STADIUM);
					setState(345);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttachActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode ATTACHED() { return getToken(gTCGParser.ATTACHED, 0); }
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode ON() { return getToken(gTCGParser.ON, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(gTCGParser.BENCH, 0); }
		public TerminalNode IN() { return getToken(gTCGParser.IN, 0); }
		public TerminalNode ACTIVE() { return getToken(gTCGParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(gTCGParser.SPOT, 0); }
		public AttachActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attachAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterAttachAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitAttachAction(this);
		}
	}

	public final AttachActionContext attachAction() throws RecognitionException {
		AttachActionContext _localctx = new AttachActionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attachAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			player();
			setState(351);
			match(ATTACHED);
			setState(352);
			match(CARD);
			setState(353);
			match(TO);
			setState(354);
			match(CARD);
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(355);
				match(ON);
				setState(356);
				match(THE);
				setState(357);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(358);
				match(IN);
				setState(359);
				match(THE);
				setState(360);
				match(ACTIVE);
				setState(361);
				match(SPOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EvolveActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode EVOLVED() { return getToken(gTCGParser.EVOLVED, 0); }
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode ON() { return getToken(gTCGParser.ON, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(gTCGParser.BENCH, 0); }
		public TerminalNode IN() { return getToken(gTCGParser.IN, 0); }
		public TerminalNode ACTIVE() { return getToken(gTCGParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(gTCGParser.SPOT, 0); }
		public EvolveActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evolveAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterEvolveAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitEvolveAction(this);
		}
	}

	public final EvolveActionContext evolveAction() throws RecognitionException {
		EvolveActionContext _localctx = new EvolveActionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_evolveAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			player();
			setState(365);
			match(EVOLVED);
			setState(366);
			match(CARD);
			setState(367);
			match(TO);
			setState(368);
			match(CARD);
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(369);
				match(ON);
				setState(370);
				match(THE);
				setState(371);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(372);
				match(IN);
				setState(373);
				match(THE);
				setState(374);
				match(ACTIVE);
				setState(375);
				match(SPOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttackActionContext extends ParserRuleContext {
		public List<PlayerContext> player() {
			return getRuleContexts(PlayerContext.class);
		}
		public PlayerContext player(int i) {
			return getRuleContext(PlayerContext.class,i);
		}
		public List<TerminalNode> POSSESSIVE() { return getTokens(gTCGParser.POSSESSIVE); }
		public TerminalNode POSSESSIVE(int i) {
			return getToken(gTCGParser.POSSESSIVE, i);
		}
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
		public TerminalNode USED() { return getToken(gTCGParser.USED, 0); }
		public TerminalNode ATTACK() { return getToken(gTCGParser.ATTACK, 0); }
		public TerminalNode ON() { return getToken(gTCGParser.ON, 0); }
		public TerminalNode FOR() { return getToken(gTCGParser.FOR, 0); }
		public DamageAmountContext damageAmount() {
			return getRuleContext(DamageAmountContext.class,0);
		}
		public List<TerminalNode> DAMAGE() { return getTokens(gTCGParser.DAMAGE); }
		public TerminalNode DAMAGE(int i) {
			return getToken(gTCGParser.DAMAGE, i);
		}
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode MORE_WORD() { return getToken(gTCGParser.MORE_WORD, 0); }
		public TerminalNode BECAUSE() { return getToken(gTCGParser.BECAUSE, 0); }
		public TerminalNode OF() { return getToken(gTCGParser.OF, 0); }
		public TerminalNode POKEMON_TYPE() { return getToken(gTCGParser.POKEMON_TYPE, 0); }
		public TerminalNode WEAKNESS() { return getToken(gTCGParser.WEAKNESS, 0); }
		public AttackActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attackAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterAttackAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitAttackAction(this);
		}
	}

	public final AttackActionContext attackAction() throws RecognitionException {
		AttackActionContext _localctx = new AttackActionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attackAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			player();
			setState(379);
			match(POSSESSIVE);
			setState(380);
			match(CARD);
			setState(381);
			match(USED);
			setState(382);
			match(ATTACK);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(383);
				match(ON);
				setState(384);
				player();
				setState(385);
				match(POSSESSIVE);
				setState(386);
				match(CARD);
				setState(387);
				match(FOR);
				setState(388);
				damageAmount();
				setState(389);
				match(DAMAGE);
				}
			}

			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(393);
				match(DOT);
				setState(394);
				player();
				setState(395);
				match(POSSESSIVE);
				setState(396);
				match(CARD);
				setState(397);
				match(TAKE);
				setState(398);
				match(NUMBER);
				setState(399);
				match(MORE_WORD);
				setState(400);
				match(DAMAGE);
				setState(401);
				match(BECAUSE);
				setState(402);
				match(OF);
				setState(403);
				match(POKEMON_TYPE);
				setState(404);
				match(WEAKNESS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DamageBreakdownContext extends ParserRuleContext {
		public TerminalNode HYPHEN() { return getToken(gTCGParser.HYPHEN, 0); }
		public TerminalNode DAMAGE_BREAKDOWN() { return getToken(gTCGParser.DAMAGE_BREAKDOWN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(gTCGParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gTCGParser.NEWLINE, i);
		}
		public TerminalNode COLON() { return getToken(gTCGParser.COLON, 0); }
		public List<DamageBreakdownLineContext> damageBreakdownLine() {
			return getRuleContexts(DamageBreakdownLineContext.class);
		}
		public DamageBreakdownLineContext damageBreakdownLine(int i) {
			return getRuleContext(DamageBreakdownLineContext.class,i);
		}
		public DamageBreakdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damageBreakdown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDamageBreakdown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDamageBreakdown(this);
		}
	}

	public final DamageBreakdownContext damageBreakdown() throws RecognitionException {
		DamageBreakdownContext _localctx = new DamageBreakdownContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_damageBreakdown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(HYPHEN);
			setState(409);
			match(DAMAGE_BREAKDOWN);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(410);
				match(COLON);
				}
			}

			setState(413);
			match(NEWLINE);
			setState(415); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(414);
				damageBreakdownLine();
				}
				}
				setState(417); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BULLET );
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(419);
				match(NEWLINE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DamageBreakdownLineContext extends ParserRuleContext {
		public TerminalNode BULLET() { return getToken(gTCGParser.BULLET, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode BASE_DAMAGE() { return getToken(gTCGParser.BASE_DAMAGE, 0); }
		public DamageAmountContext damageAmount() {
			return getRuleContext(DamageAmountContext.class,0);
		}
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public TerminalNode TOTAL_DAMAGE() { return getToken(gTCGParser.TOTAL_DAMAGE, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode POKEMON() { return getToken(gTCGParser.POKEMON, 0); }
		public TerminalNode LPAREN() { return getToken(gTCGParser.LPAREN, 0); }
		public TerminalNode ITEM() { return getToken(gTCGParser.ITEM, 0); }
		public TerminalNode RPAREN() { return getToken(gTCGParser.RPAREN, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode ENERGY() { return getToken(gTCGParser.ENERGY, 0); }
		public TerminalNode WEAKNESS() { return getToken(gTCGParser.WEAKNESS, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode POKEMON_TYPE() { return getToken(gTCGParser.POKEMON_TYPE, 0); }
		public TerminalNode ABILITY_WORD() { return getToken(gTCGParser.ABILITY_WORD, 0); }
		public TerminalNode ABILITY() { return getToken(gTCGParser.ABILITY, 0); }
		public TerminalNode SUPPORTER_WORD() { return getToken(gTCGParser.SUPPORTER_WORD, 0); }
		public TerminalNode POKEMON_TOOL() { return getToken(gTCGParser.POKEMON_TOOL, 0); }
		public TerminalNode ATTACK_WORD() { return getToken(gTCGParser.ATTACK_WORD, 0); }
		public TerminalNode ATTACK() { return getToken(gTCGParser.ATTACK, 0); }
		public TerminalNode ATTACHED() { return getToken(gTCGParser.ATTACHED, 0); }
		public TerminalNode SELECTED() { return getToken(gTCGParser.SELECTED, 0); }
		public TerminalNode COLON() { return getToken(gTCGParser.COLON, 0); }
		public TerminalNode HYPHEN() { return getToken(gTCGParser.HYPHEN, 0); }
		public DamageBreakdownLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damageBreakdownLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDamageBreakdownLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDamageBreakdownLine(this);
		}
	}

	public final DamageBreakdownLineContext damageBreakdownLine() throws RecognitionException {
		DamageBreakdownLineContext _localctx = new DamageBreakdownLineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_damageBreakdownLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(BULLET);
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(423);
				match(BASE_DAMAGE);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(424);
					match(COLON);
					}
				}

				setState(427);
				damageAmount();
				setState(428);
				match(DAMAGE);
				}
				break;
			case 2:
				{
				setState(430);
				match(TOTAL_DAMAGE);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(431);
					match(COLON);
					}
				}

				setState(434);
				damageAmount();
				setState(435);
				match(DAMAGE);
				}
				break;
			case 3:
				{
				setState(437);
				match(NUMBER);
				setState(438);
				match(POKEMON);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(439);
					match(COLON);
					}
				}

				setState(442);
				damageAmount();
				setState(443);
				match(DAMAGE);
				}
				break;
			case 4:
				{
				setState(445);
				match(LPAREN);
				setState(446);
				match(ITEM);
				setState(447);
				match(RPAREN);
				setState(448);
				match(CARD);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(449);
					match(COLON);
					}
				}

				setState(452);
				damageAmount();
				setState(453);
				match(DAMAGE);
				}
				break;
			case 5:
				{
				setState(455);
				match(NUMBER);
				setState(456);
				_la = _input.LA(1);
				if ( !(_la==ATTACHED || _la==SELECTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(457);
				match(ENERGY);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(458);
					match(COLON);
					}
				}

				setState(461);
				damageAmount();
				setState(462);
				match(DAMAGE);
				}
				break;
			case 6:
				{
				setState(464);
				match(WEAKNESS);
				setState(465);
				match(TO);
				setState(466);
				match(POKEMON_TYPE);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(467);
					match(COLON);
					}
				}

				setState(470);
				damageAmount();
				setState(471);
				match(DAMAGE);
				}
				break;
			case 7:
				{
				setState(473);
				match(LPAREN);
				setState(474);
				match(ABILITY_WORD);
				setState(475);
				match(RPAREN);
				setState(476);
				match(ABILITY);
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(477);
					match(COLON);
					}
				}

				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(480);
					match(HYPHEN);
					}
				}

				setState(483);
				damageAmount();
				setState(484);
				match(DAMAGE);
				}
				break;
			case 8:
				{
				setState(486);
				match(LPAREN);
				setState(487);
				match(SUPPORTER_WORD);
				setState(488);
				match(RPAREN);
				setState(489);
				match(CARD);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(490);
					match(COLON);
					}
				}

				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(493);
					match(HYPHEN);
					}
				}

				setState(496);
				damageAmount();
				setState(497);
				match(DAMAGE);
				}
				break;
			case 9:
				{
				setState(499);
				match(LPAREN);
				setState(500);
				match(ABILITY_WORD);
				setState(501);
				match(RPAREN);
				setState(502);
				match(ABILITY);
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(503);
					match(COLON);
					}
				}

				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(506);
					match(HYPHEN);
					}
				}

				setState(509);
				damageAmount();
				setState(510);
				match(DAMAGE);
				}
				break;
			case 10:
				{
				setState(512);
				match(LPAREN);
				setState(513);
				match(POKEMON_TOOL);
				setState(514);
				match(RPAREN);
				setState(515);
				match(CARD);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(516);
					match(COLON);
					}
				}

				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(519);
					match(HYPHEN);
					}
				}

				setState(522);
				damageAmount();
				setState(523);
				match(DAMAGE);
				}
				break;
			case 11:
				{
				setState(525);
				match(LPAREN);
				setState(526);
				match(ATTACK_WORD);
				setState(527);
				match(RPAREN);
				setState(528);
				match(ATTACK);
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(529);
					match(COLON);
					}
				}

				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(532);
					match(HYPHEN);
					}
				}

				setState(535);
				damageAmount();
				setState(536);
				match(DAMAGE);
				}
				break;
			}
			setState(540);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetreatActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode RETIRED() { return getToken(gTCGParser.RETIRED, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(gTCGParser.BENCH, 0); }
		public RetreatActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retreatAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterRetreatAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitRetreatAction(this);
		}
	}

	public final RetreatActionContext retreatAction() throws RecognitionException {
		RetreatActionContext _localctx = new RetreatActionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_retreatAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			player();
			setState(543);
			match(RETIRED);
			setState(544);
			match(CARD);
			setState(545);
			match(TO);
			setState(546);
			match(THE);
			setState(547);
			match(BENCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShuffleActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode SHUFFLED() { return getToken(gTCGParser.SHUFFLED, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public TerminalNode DECK() { return getToken(gTCGParser.DECK, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public TerminalNode INTO() { return getToken(gTCGParser.INTO, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public ShuffleActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffleAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterShuffleAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitShuffleAction(this);
		}
	}

	public final ShuffleActionContext shuffleAction() throws RecognitionException {
		ShuffleActionContext _localctx = new ShuffleActionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_shuffleAction);
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				player();
				setState(550);
				match(SHUFFLED);
				setState(551);
				match(THEIR);
				setState(552);
				match(DECK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				player();
				setState(555);
				match(SHUFFLED);
				setState(556);
				match(NUMBER);
				setState(557);
				match(CARDS);
				setState(558);
				match(INTO);
				setState(559);
				match(THEIR);
				setState(560);
				match(DECK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				player();
				setState(563);
				match(SHUFFLED);
				setState(564);
				match(CARD);
				setState(565);
				match(INTO);
				setState(566);
				match(THEIR);
				setState(567);
				match(DECK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiscardActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode DISCARDED() { return getToken(gTCGParser.DISCARDED, 0); }
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public TerminalNode WERE() { return getToken(gTCGParser.WERE, 0); }
		public TerminalNode FROM() { return getToken(gTCGParser.FROM, 0); }
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode WAS() { return getToken(gTCGParser.WAS, 0); }
		public DiscardActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discardAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDiscardAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDiscardAction(this);
		}
	}

	public final DiscardActionContext discardAction() throws RecognitionException {
		DiscardActionContext _localctx = new DiscardActionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_discardAction);
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				player();
				setState(572);
				match(DISCARDED);
				setState(573);
				match(CARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				player();
				setState(576);
				match(DISCARDED);
				setState(577);
				match(NUMBER);
				setState(578);
				match(CARDS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				match(NUMBER);
				setState(581);
				match(CARDS);
				setState(582);
				match(WERE);
				setState(583);
				match(DISCARDED);
				setState(584);
				match(FROM);
				setState(585);
				player();
				setState(586);
				match(POSSESSIVE);
				setState(587);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(589);
				match(CARD);
				setState(590);
				match(WAS);
				setState(591);
				match(DISCARDED);
				setState(592);
				match(FROM);
				setState(593);
				player();
				setState(594);
				match(POSSESSIVE);
				setState(595);
				match(CARD);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrizeActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public TerminalNode PRIZE() { return getToken(gTCGParser.PRIZE, 0); }
		public TerminalNode CARD_WORD() { return getToken(gTCGParser.CARD_WORD, 0); }
		public TerminalNode A_SOMETHING() { return getToken(gTCGParser.A_SOMETHING, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode PRIZE_CARDS() { return getToken(gTCGParser.PRIZE_CARDS, 0); }
		public PrizeActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prizeAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterPrizeAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitPrizeAction(this);
		}
	}

	public final PrizeActionContext prizeAction() throws RecognitionException {
		PrizeActionContext _localctx = new PrizeActionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_prizeAction);
		int _la;
		try {
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				player();
				setState(600);
				match(TAKE);
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==A_SOMETHING) {
					{
					setState(601);
					match(A_SOMETHING);
					}
				}

				setState(604);
				match(PRIZE);
				setState(605);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				player();
				setState(608);
				match(TAKE);
				setState(609);
				match(NUMBER);
				setState(610);
				match(PRIZE_CARDS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveToHandActionContext extends ParserRuleContext {
		public List<PlayerContext> player() {
			return getRuleContexts(PlayerContext.class);
		}
		public PlayerContext player(int i) {
			return getRuleContext(PlayerContext.class,i);
		}
		public TerminalNode MOVED() { return getToken(gTCGParser.MOVED, 0); }
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public TerminalNode HAND() { return getToken(gTCGParser.HAND, 0); }
		public MoveToHandActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveToHandAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterMoveToHandAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitMoveToHandAction(this);
		}
	}

	public final MoveToHandActionContext moveToHandAction() throws RecognitionException {
		MoveToHandActionContext _localctx = new MoveToHandActionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_moveToHandAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			player();
			setState(615);
			match(MOVED);
			setState(616);
			player();
			setState(617);
			match(POSSESSIVE);
			setState(618);
			match(CARD);
			setState(619);
			match(TO);
			setState(620);
			match(THEIR);
			setState(621);
			match(HAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActiveSpotActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode IS() { return getToken(gTCGParser.IS, 0); }
		public TerminalNode NOW() { return getToken(gTCGParser.NOW, 0); }
		public TerminalNode IN() { return getToken(gTCGParser.IN, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode ACTIVE() { return getToken(gTCGParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(gTCGParser.SPOT, 0); }
		public ActiveSpotActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activeSpotAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterActiveSpotAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitActiveSpotAction(this);
		}
	}

	public final ActiveSpotActionContext activeSpotAction() throws RecognitionException {
		ActiveSpotActionContext _localctx = new ActiveSpotActionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_activeSpotAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			player();
			setState(624);
			match(POSSESSIVE);
			setState(625);
			match(CARD);
			setState(626);
			match(IS);
			setState(627);
			match(NOW);
			setState(628);
			match(IN);
			setState(629);
			match(THE);
			setState(630);
			match(ACTIVE);
			setState(631);
			match(SPOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KnockoutActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode WAS() { return getToken(gTCGParser.WAS, 0); }
		public TerminalNode KNOCKED() { return getToken(gTCGParser.KNOCKED, 0); }
		public TerminalNode OUT() { return getToken(gTCGParser.OUT, 0); }
		public KnockoutActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knockoutAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterKnockoutAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitKnockoutAction(this);
		}
	}

	public final KnockoutActionContext knockoutAction() throws RecognitionException {
		KnockoutActionContext _localctx = new KnockoutActionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_knockoutAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			player();
			setState(634);
			match(POSSESSIVE);
			setState(635);
			match(CARD);
			setState(636);
			match(WAS);
			setState(637);
			match(KNOCKED);
			setState(638);
			match(OUT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CardMovedActionContext extends ParserRuleContext {
		public TerminalNode A_SOMETHING() { return getToken(gTCGParser.A_SOMETHING, 0); }
		public TerminalNode CARD_WORD() { return getToken(gTCGParser.CARD_WORD, 0); }
		public TerminalNode WAS() { return getToken(gTCGParser.WAS, 0); }
		public TerminalNode ADDED() { return getToken(gTCGParser.ADDED, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public List<PlayerContext> player() {
			return getRuleContexts(PlayerContext.class);
		}
		public PlayerContext player(int i) {
			return getRuleContext(PlayerContext.class,i);
		}
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode HAND() { return getToken(gTCGParser.HAND, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode MOVED() { return getToken(gTCGParser.MOVED, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public CardMovedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardMovedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterCardMovedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitCardMovedAction(this);
		}
	}

	public final CardMovedActionContext cardMovedAction() throws RecognitionException {
		CardMovedActionContext _localctx = new CardMovedActionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cardMovedAction);
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_SOMETHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(A_SOMETHING);
				setState(641);
				match(CARD_WORD);
				setState(642);
				match(WAS);
				setState(643);
				match(ADDED);
				setState(644);
				match(TO);
				setState(645);
				player();
				setState(646);
				match(POSSESSIVE);
				setState(647);
				match(HAND);
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				match(CARD);
				setState(650);
				match(WAS);
				setState(651);
				match(ADDED);
				setState(652);
				match(TO);
				setState(653);
				player();
				setState(654);
				match(POSSESSIVE);
				setState(655);
				match(HAND);
				}
				break;
			case OPPONENT:
			case PLAYER:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				player();
				setState(658);
				match(MOVED);
				setState(659);
				player();
				setState(660);
				match(POSSESSIVE);
				setState(661);
				match(NUMBER);
				setState(662);
				match(CARDS);
				setState(663);
				match(TO);
				setState(664);
				match(THEIR);
				setState(665);
				match(HAND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchActionContext extends ParserRuleContext {
		public List<PlayerContext> player() {
			return getRuleContexts(PlayerContext.class);
		}
		public PlayerContext player(int i) {
			return getRuleContext(PlayerContext.class,i);
		}
		public List<TerminalNode> POSSESSIVE() { return getTokens(gTCGParser.POSSESSIVE); }
		public TerminalNode POSSESSIVE(int i) {
			return getToken(gTCGParser.POSSESSIVE, i);
		}
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
		public TerminalNode WAS() { return getToken(gTCGParser.WAS, 0); }
		public TerminalNode SWITCHED() { return getToken(gTCGParser.SWITCHED, 0); }
		public TerminalNode WITH() { return getToken(gTCGParser.WITH, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode BECOME() { return getToken(gTCGParser.BECOME, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode ACTIVE() { return getToken(gTCGParser.ACTIVE, 0); }
		public TerminalNode POKEMON() { return getToken(gTCGParser.POKEMON, 0); }
		public SwitchActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterSwitchAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitSwitchAction(this);
		}
	}

	public final SwitchActionContext switchAction() throws RecognitionException {
		SwitchActionContext _localctx = new SwitchActionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switchAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			player();
			setState(670);
			match(POSSESSIVE);
			setState(671);
			match(CARD);
			setState(672);
			match(WAS);
			setState(673);
			match(SWITCHED);
			setState(674);
			match(WITH);
			setState(675);
			player();
			setState(676);
			match(POSSESSIVE);
			setState(677);
			match(CARD);
			setState(678);
			match(TO);
			setState(679);
			match(BECOME);
			setState(680);
			match(THE);
			setState(681);
			match(ACTIVE);
			setState(682);
			match(POKEMON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DamagedActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public DamageAmountContext damageAmount() {
			return getRuleContext(DamageAmountContext.class,0);
		}
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public DamagedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damagedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDamagedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDamagedAction(this);
		}
	}

	public final DamagedActionContext damagedAction() throws RecognitionException {
		DamagedActionContext _localctx = new DamagedActionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_damagedAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			player();
			setState(685);
			match(POSSESSIVE);
			setState(686);
			match(CARD);
			setState(687);
			match(TAKE);
			setState(688);
			damageAmount();
			setState(689);
			match(DAMAGE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlippedActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode FLIPPED() { return getToken(gTCGParser.FLIPPED, 0); }
		public TerminalNode A_SOMETHING() { return getToken(gTCGParser.A_SOMETHING, 0); }
		public TerminalNode COIN() { return getToken(gTCGParser.COIN, 0); }
		public TerminalNode AND() { return getToken(gTCGParser.AND, 0); }
		public TerminalNode IT() { return getToken(gTCGParser.IT, 0); }
		public TerminalNode LANDED() { return getToken(gTCGParser.LANDED, 0); }
		public TerminalNode ON() { return getToken(gTCGParser.ON, 0); }
		public TerminalNode TAILS() { return getToken(gTCGParser.TAILS, 0); }
		public TerminalNode HEADS() { return getToken(gTCGParser.HEADS, 0); }
		public FlippedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flippedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterFlippedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitFlippedAction(this);
		}
	}

	public final FlippedActionContext flippedAction() throws RecognitionException {
		FlippedActionContext _localctx = new FlippedActionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_flippedAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			player();
			setState(692);
			match(FLIPPED);
			setState(693);
			match(A_SOMETHING);
			setState(694);
			match(COIN);
			setState(695);
			match(AND);
			setState(696);
			match(IT);
			setState(697);
			match(LANDED);
			setState(698);
			match(ON);
			setState(699);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChoiceActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode CHOSE() { return getToken(gTCGParser.CHOSE, 0); }
		public TerminalNode ATTACK() { return getToken(gTCGParser.ATTACK, 0); }
		public ChoiceActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterChoiceAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitChoiceAction(this);
		}
	}

	public final ChoiceActionContext choiceAction() throws RecognitionException {
		ChoiceActionContext _localctx = new ChoiceActionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_choiceAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			player();
			setState(702);
			match(CHOSE);
			setState(703);
			match(ATTACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialConditionActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode IS() { return getToken(gTCGParser.IS, 0); }
		public TerminalNode NOW() { return getToken(gTCGParser.NOW, 0); }
		public TerminalNode SPECIAL_CONDITION() { return getToken(gTCGParser.SPECIAL_CONDITION, 0); }
		public SpecialConditionActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialConditionAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterSpecialConditionAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitSpecialConditionAction(this);
		}
	}

	public final SpecialConditionActionContext specialConditionAction() throws RecognitionException {
		SpecialConditionActionContext _localctx = new SpecialConditionActionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_specialConditionAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			player();
			setState(706);
			match(POSSESSIVE);
			setState(707);
			match(CARD);
			setState(708);
			match(IS);
			setState(709);
			match(NOW);
			setState(710);
			match(SPECIAL_CONDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActivateActionContext extends ParserRuleContext {
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode WAS() { return getToken(gTCGParser.WAS, 0); }
		public TerminalNode ACTIVATED() { return getToken(gTCGParser.ACTIVATED, 0); }
		public ActivateActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activateAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterActivateAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitActivateAction(this);
		}
	}

	public final ActivateActionContext activateAction() throws RecognitionException {
		ActivateActionContext _localctx = new ActivateActionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_activateAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(CARD);
			setState(713);
			match(WAS);
			setState(714);
			match(ACTIVATED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PutActionContext extends ParserRuleContext {
		public List<PlayerContext> player() {
			return getRuleContexts(PlayerContext.class);
		}
		public PlayerContext player(int i) {
			return getRuleContext(PlayerContext.class,i);
		}
		public TerminalNode PUT() { return getToken(gTCGParser.PUT, 0); }
		public DamageAmountContext damageAmount() {
			return getRuleContext(DamageAmountContext.class,0);
		}
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public TerminalNode COUNTERS() { return getToken(gTCGParser.COUNTERS, 0); }
		public TerminalNode ON() { return getToken(gTCGParser.ON, 0); }
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public PutActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterPutAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitPutAction(this);
		}
	}

	public final PutActionContext putAction() throws RecognitionException {
		PutActionContext _localctx = new PutActionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_putAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			player();
			setState(717);
			match(PUT);
			setState(718);
			damageAmount();
			setState(719);
			match(DAMAGE);
			setState(720);
			match(COUNTERS);
			setState(721);
			match(ON);
			setState(722);
			player();
			setState(723);
			match(POSSESSIVE);
			setState(724);
			match(CARD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndTurnContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode ENDED() { return getToken(gTCGParser.ENDED, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public TerminalNode TURN() { return getToken(gTCGParser.TURN, 0); }
		public EndTurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTurn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterEndTurn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitEndTurn(this);
		}
	}

	public final EndTurnContext endTurn() throws RecognitionException {
		EndTurnContext _localctx = new EndTurnContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_endTurn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			player();
			setState(727);
			match(ENDED);
			setState(728);
			match(THEIR);
			setState(729);
			match(TURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoActionContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode NO_ACTION() { return getToken(gTCGParser.NO_ACTION, 0); }
		public NoActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterNoAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitNoAction(this);
		}
	}

	public final NoActionContext noAction() throws RecognitionException {
		NoActionContext _localctx = new NoActionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_noAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			player();
			setState(732);
			match(NO_ACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GameEndContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(gTCGParser.ALL, 0); }
		public TerminalNode PRIZE_CARDS() { return getToken(gTCGParser.PRIZE_CARDS, 0); }
		public TerminalNode TAKEN() { return getToken(gTCGParser.TAKEN, 0); }
		public List<TerminalNode> DOT() { return getTokens(gTCGParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(gTCGParser.DOT, i);
		}
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public TerminalNode WINS() { return getToken(gTCGParser.WINS, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode CONCEDED() { return getToken(gTCGParser.CONCEDED, 0); }
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public TerminalNode OF() { return getToken(gTCGParser.OF, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public TerminalNode YOU() { return getToken(gTCGParser.YOU, 0); }
		public TerminalNode KNOCKED() { return getToken(gTCGParser.KNOCKED, 0); }
		public TerminalNode OUT() { return getToken(gTCGParser.OUT, 0); }
		public TerminalNode NO_BENCHED() { return getToken(gTCGParser.NO_BENCHED, 0); }
		public GameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterGameEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitGameEnd(this);
		}
	}

	public final GameEndContext gameEnd() throws RecognitionException {
		GameEndContext _localctx = new GameEndContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_gameEnd);
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(ALL);
				setState(735);
				match(PRIZE_CARDS);
				setState(736);
				match(TAKEN);
				setState(737);
				match(DOT);
				setState(738);
				player();
				setState(739);
				match(WINS);
				setState(740);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				match(OPPONENT);
				setState(743);
				match(CONCEDED);
				setState(744);
				match(DOT);
				setState(745);
				player();
				setState(746);
				match(WINS);
				setState(747);
				match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				match(OPPONENT);
				setState(750);
				match(TAKE);
				setState(751);
				match(ALL);
				setState(752);
				match(OF);
				setState(753);
				match(THEIR);
				setState(754);
				match(PRIZE_CARDS);
				setState(755);
				match(DOT);
				setState(756);
				player();
				setState(757);
				match(WINS);
				setState(758);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(760);
				match(YOU);
				setState(761);
				match(CONCEDED);
				setState(762);
				match(DOT);
				setState(763);
				player();
				setState(764);
				match(WINS);
				setState(765);
				match(DOT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(767);
				match(KNOCKED);
				setState(768);
				match(OUT);
				setState(769);
				match(NO_BENCHED);
				setState(770);
				match(DOT);
				setState(771);
				player();
				setState(772);
				match(WINS);
				setState(773);
				match(DOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CardListContext extends ParserRuleContext {
		public TerminalNode BULLET() { return getToken(gTCGParser.BULLET, 0); }
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(gTCGParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gTCGParser.COMMA, i);
		}
		public CardListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterCardList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitCardList(this);
		}
	}

	public final CardListContext cardList() throws RecognitionException {
		CardListContext _localctx = new CardListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cardList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(BULLET);
			setState(778);
			match(CARD);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(779);
				match(COMMA);
				setState(780);
				match(CARD);
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(786);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001m\u0315\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002^\b\u0002"+
		"\n\u0002\f\u0002a\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002e\b\u0002"+
		"\n\u0002\f\u0002h\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003o\b\u0003\n\u0003\f\u0003r\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"z\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00a3\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00cb\b\n\u0001\n\u0003\n\u00ce"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00e3\b\u000b\u0001\u000b\u0003\u000b\u00e6"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00f0\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00fa\b\r\n\r\f\r\u00fd\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0104\b\u000e\n\u000e"+
		"\f\u000e\u0107\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u010c\b\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0110\b\u000f\n\u000f"+
		"\f\u000f\u0113\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u012b\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u014f\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u015b\b\u0012\u0003\u0012\u015d\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u016b"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0179\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0188\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0197\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u019c\b\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u01a0\b\u0016"+
		"\u000b\u0016\f\u0016\u01a1\u0001\u0016\u0003\u0016\u01a5\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01aa\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01b1\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01b9\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01c3\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u01cc\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01d5\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01df\b\u0017\u0001\u0017\u0003\u0017\u01e2"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01ec\b\u0017\u0001\u0017\u0003"+
		"\u0017\u01ef\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01f9\b\u0017\u0001"+
		"\u0017\u0003\u0017\u01fc\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0206"+
		"\b\u0017\u0001\u0017\u0003\u0017\u0209\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0213\b\u0017\u0001\u0017\u0003\u0017\u0216\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u021b\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u023a\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0256\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u025b\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0265"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u029c\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001("+
		"\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0308\b)\u0001*\u0001*\u0001*\u0001*\u0005*\u030e\b*\n"+
		"*\f*\u0311\t*\u0001*\u0001*\u0001*\u0000\u0000+\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRT\u0000\u0005\u0002\u0000HHcc\u0001\u0000\f\r\u0001"+
		"\u0000\u001c\u001d\u0002\u0000ddgg\u0002\u0000$$QQ\u0349\u0000V\u0001"+
		"\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004Z\u0001\u0000\u0000"+
		"\u0000\u0006k\u0001\u0000\u0000\u0000\by\u0001\u0000\u0000\u0000\n{\u0001"+
		"\u0000\u0000\u0000\f\u0086\u0001\u0000\u0000\u0000\u000e\u008e\u0001\u0000"+
		"\u0000\u0000\u0010\u00a2\u0001\u0000\u0000\u0000\u0012\u00a7\u0001\u0000"+
		"\u0000\u0000\u0014\u00ca\u0001\u0000\u0000\u0000\u0016\u00e2\u0001\u0000"+
		"\u0000\u0000\u0018\u00e7\u0001\u0000\u0000\u0000\u001a\u00f4\u0001\u0000"+
		"\u0000\u0000\u001c\u00fe\u0001\u0000\u0000\u0000\u001e\u0108\u0001\u0000"+
		"\u0000\u0000 \u012a\u0001\u0000\u0000\u0000\"\u014e\u0001\u0000\u0000"+
		"\u0000$\u0150\u0001\u0000\u0000\u0000&\u015e\u0001\u0000\u0000\u0000("+
		"\u016c\u0001\u0000\u0000\u0000*\u017a\u0001\u0000\u0000\u0000,\u0198\u0001"+
		"\u0000\u0000\u0000.\u01a6\u0001\u0000\u0000\u00000\u021e\u0001\u0000\u0000"+
		"\u00002\u0239\u0001\u0000\u0000\u00004\u0255\u0001\u0000\u0000\u00006"+
		"\u0264\u0001\u0000\u0000\u00008\u0266\u0001\u0000\u0000\u0000:\u026f\u0001"+
		"\u0000\u0000\u0000<\u0279\u0001\u0000\u0000\u0000>\u029b\u0001\u0000\u0000"+
		"\u0000@\u029d\u0001\u0000\u0000\u0000B\u02ac\u0001\u0000\u0000\u0000D"+
		"\u02b3\u0001\u0000\u0000\u0000F\u02bd\u0001\u0000\u0000\u0000H\u02c1\u0001"+
		"\u0000\u0000\u0000J\u02c8\u0001\u0000\u0000\u0000L\u02cc\u0001\u0000\u0000"+
		"\u0000N\u02d6\u0001\u0000\u0000\u0000P\u02db\u0001\u0000\u0000\u0000R"+
		"\u0307\u0001\u0000\u0000\u0000T\u0309\u0001\u0000\u0000\u0000VW\u0007"+
		"\u0000\u0000\u0000W\u0001\u0001\u0000\u0000\u0000XY\u0005`\u0000\u0000"+
		"Y\u0003\u0001\u0000\u0000\u0000Z_\u0003\u0006\u0003\u0000[\\\u0005l\u0000"+
		"\u0000\\^\u0003\u001a\r\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bf\u0003R)\u0000ce\u0005l"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000ij\u0005\u0000\u0000\u0001j\u0005\u0001\u0000"+
		"\u0000\u0000kl\u0005\n\u0000\u0000lp\u0005l\u0000\u0000mo\u0003\b\u0004"+
		"\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000q\u0007\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000sz\u0003\n\u0005\u0000tz\u0003\f\u0006\u0000"+
		"uz\u0003\u000e\u0007\u0000vz\u0003\u0014\n\u0000wz\u0003\u0018\f\u0000"+
		"xz\u0003\u0010\b\u0000ys\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000"+
		"yu\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yx\u0001\u0000\u0000\u0000z\t\u0001\u0000\u0000\u0000{|\u0003\u0000"+
		"\u0000\u0000|}\u0005\u000b\u0000\u0000}~\u0007\u0001\u0000\u0000~\u007f"+
		"\u0005\u000e\u0000\u0000\u007f\u0080\u0005\u000f\u0000\u0000\u0080\u0081"+
		"\u0005\u0010\u0000\u0000\u0081\u0082\u0005\u0011\u0000\u0000\u0082\u0083"+
		"\u0005\u0012\u0000\u0000\u0083\u0084\u0005d\u0000\u0000\u0084\u0085\u0005"+
		"l\u0000\u0000\u0085\u000b\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\u0014\u0000\u0000\u0088\u0089\u0005\u000f"+
		"\u0000\u0000\u0089\u008a\u0005\u0011\u0000\u0000\u008a\u008b\u0005\u0015"+
		"\u0000\u0000\u008b\u008c\u0005d\u0000\u0000\u008c\u008d\u0005l\u0000\u0000"+
		"\u008d\r\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u0016\u0000\u0000\u0090\u0091\u0005\u0017\u0000\u0000\u0091"+
		"\u0092\u0005\u0018\u0000\u0000\u0092\u0093\u0005\u0019\u0000\u0000\u0093"+
		"\u0094\u0005d\u0000\u0000\u0094\u0095\u0005l\u0000\u0000\u0095\u000f\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0003\u0000\u0000\u0000\u0097\u0098\u0005"+
		"@\u0000\u0000\u0098\u0099\u0005M\u0000\u0000\u0099\u009a\u0005\u0001\u0000"+
		"\u0000\u009a\u009b\u0005d\u0000\u0000\u009b\u00a3\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0003\u0000\u0000\u0000\u009d\u009e\u0005@\u0000\u0000\u009e"+
		"\u009f\u0005`\u0000\u0000\u009f\u00a0\u0005\u0001\u0000\u0000\u00a0\u00a1"+
		"\u0005d\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u0096\u0001"+
		"\u0000\u0000\u0000\u00a2\u009c\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005l\u0000\u0000\u00a5\u00a6\u0003\u0012"+
		"\t\u0000\u00a6\u0011\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005k\u0000"+
		"\u0000\u00a8\u00a9\u0005\u001c\u0000\u0000\u00a9\u00aa\u0005\u0005\u0000"+
		"\u0000\u00aa\u00ab\u0005>\u0000\u0000\u00ab\u00ac\u0005\u0001\u0000\u0000"+
		"\u00ac\u00ad\u0005`\u0000\u0000\u00ad\u00ae\u0005l\u0000\u0000\u00ae\u00af"+
		"\u0003T*\u0000\u00af\u0013\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\u001a\u0000\u0000\u00b2\u00b3\u0005`\u0000"+
		"\u0000\u00b3\u00b4\u0005\u001c\u0000\u0000\u00b4\u00b5\u0005\u000e\u0000"+
		"\u0000\u00b5\u00b6\u0005\u000f\u0000\u0000\u00b6\u00b7\u0005\u0010\u0000"+
		"\u0000\u00b7\u00b8\u0005\"\u0000\u0000\u00b8\u00b9\u0005d\u0000\u0000"+
		"\u00b9\u00ba\u0005l\u0000\u0000\u00ba\u00cb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0003\u0000\u0000\u0000\u00bc\u00bd\u0005\u001a\u0000\u0000\u00bd"+
		"\u00be\u0005`\u0000\u0000\u00be\u00bf\u0005S\u0000\u0000\u00bf\u00c0\u0007"+
		"\u0002\u0000\u0000\u00c0\u00c1\u0005T\u0000\u0000\u00c1\u00c2\u0003\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005@\u0000\u0000\u00c3\u00c4\u0005\u0006\u0000"+
		"\u0000\u00c4\u00c5\u0005\u0007\u0000\u0000\u00c5\u00c6\u0005`\u0000\u0000"+
		"\u00c6\u00c7\u0005\u0001\u0000\u0000\u00c7\u00c8\u0005d\u0000\u0000\u00c8"+
		"\u00c9\u0005l\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ca\u00bb\u0001\u0000\u0000\u0000\u00cb\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ce\u0003\u0016\u000b\u0000\u00cd\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u0015"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005k\u0000\u0000\u00d0\u00d1\u0005"+
		"`\u0000\u0000\u00d1\u00d2\u0005\u001b\u0000\u0000\u00d2\u00d3\u0005\u001c"+
		"\u0000\u0000\u00d3\u00d4\u0005d\u0000\u0000\u00d4\u00e3\u0005l\u0000\u0000"+
		"\u00d5\u00d6\u0005k\u0000\u0000\u00d6\u00d7\u0007\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005\u001a\u0000\u0000\u00d8\u00d9\u0005`\u0000\u0000\u00d9\u00da"+
		"\u0005\u001c\u0000\u0000\u00da\u00db\u0005d\u0000\u0000\u00db\u00e3\u0005"+
		"l\u0000\u0000\u00dc\u00dd\u0005k\u0000\u0000\u00dd\u00de\u0007\u0000\u0000"+
		"\u0000\u00de\u00df\u0005\u001a\u0000\u0000\u00df\u00e0\u0005[\u0000\u0000"+
		"\u00e0\u00e1\u0005d\u0000\u0000\u00e1\u00e3\u0005l\u0000\u0000\u00e2\u00cf"+
		"\u0001\u0000\u0000\u0000\u00e2\u00d5\u0001\u0000\u0000\u0000\u00e2\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e6"+
		"\u0003T*\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u0017\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005#\u0000\u0000\u00e9\u00ea\u0005[\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0017\u0000\u0000\u00eb\u00ef\u0005\u000f\u0000\u0000"+
		"\u00ec\u00ed\u00052\u0000\u0000\u00ed\u00f0\u00054\u0000\u0000\u00ee\u00f0"+
		"\u00055\u0000\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"d\u0000\u0000\u00f2\u00f3\u0005l\u0000\u0000\u00f3\u0019\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0003\u0000\u0000\u0000\u00f5\u00f6\u0005Z\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0002\u0000\u0000\u00f7\u00fb\u0005l\u0000\u0000\u00f8"+
		"\u00fa\u0003\u001c\u000e\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u001b\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003 \u0010\u0000\u00ff\u0100"+
		"\u0007\u0003\u0000\u0000\u0100\u0105\u0005l\u0000\u0000\u0101\u0104\u0003"+
		"\u001e\u000f\u0000\u0102\u0104\u0003,\u0016\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\u001d\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0005k\u0000\u0000\u0109\u010b\u0003 \u0010\u0000"+
		"\u010a\u010c\u0005d\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u0111\u0005l\u0000\u0000\u010e\u0110\u0003T*\u0000\u010f\u010e\u0001"+
		"\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u001f\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u012b\u0003"+
		"\"\u0011\u0000\u0115\u012b\u0003$\u0012\u0000\u0116\u012b\u0003&\u0013"+
		"\u0000\u0117\u012b\u0003(\u0014\u0000\u0118\u012b\u0003*\u0015\u0000\u0119"+
		"\u012b\u00030\u0018\u0000\u011a\u012b\u00032\u0019\u0000\u011b\u012b\u0003"+
		">\u001f\u0000\u011c\u012b\u00034\u001a\u0000\u011d\u012b\u00036\u001b"+
		"\u0000\u011e\u012b\u00038\u001c\u0000\u011f\u012b\u0003:\u001d\u0000\u0120"+
		"\u012b\u0003@ \u0000\u0121\u012b\u0003<\u001e\u0000\u0122\u012b\u0003"+
		"B!\u0000\u0123\u012b\u0003D\"\u0000\u0124\u012b\u0003F#\u0000\u0125\u012b"+
		"\u0003H$\u0000\u0126\u012b\u0003J%\u0000\u0127\u012b\u0003L&\u0000\u0128"+
		"\u012b\u0003N\'\u0000\u0129\u012b\u0003P(\u0000\u012a\u0114\u0001\u0000"+
		"\u0000\u0000\u012a\u0115\u0001\u0000\u0000\u0000\u012a\u0116\u0001\u0000"+
		"\u0000\u0000\u012a\u0117\u0001\u0000\u0000\u0000\u012a\u0118\u0001\u0000"+
		"\u0000\u0000\u012a\u0119\u0001\u0000\u0000\u0000\u012a\u011a\u0001\u0000"+
		"\u0000\u0000\u012a\u011b\u0001\u0000\u0000\u0000\u012a\u011c\u0001\u0000"+
		"\u0000\u0000\u012a\u011d\u0001\u0000\u0000\u0000\u012a\u011e\u0001\u0000"+
		"\u0000\u0000\u012a\u011f\u0001\u0000\u0000\u0000\u012a\u0120\u0001\u0000"+
		"\u0000\u0000\u012a\u0121\u0001\u0000\u0000\u0000\u012a\u0122\u0001\u0000"+
		"\u0000\u0000\u012a\u0123\u0001\u0000\u0000\u0000\u012a\u0124\u0001\u0000"+
		"\u0000\u0000\u012a\u0125\u0001\u0000\u0000\u0000\u012a\u0126\u0001\u0000"+
		"\u0000\u0000\u012a\u0127\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000"+
		"\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b!\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0003\u0000\u0000\u0000\u012d\u012e\u0005\u001a\u0000"+
		"\u0000\u012e\u012f\u0005\u001d\u0000\u0000\u012f\u014f\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0003\u0000\u0000\u0000\u0131\u0132\u0005\u001a\u0000"+
		"\u0000\u0132\u0133\u0005M\u0000\u0000\u0133\u0134\u0005\u001d\u0000\u0000"+
		"\u0134\u014f\u0001\u0000\u0000\u0000\u0135\u0136\u0003\u0000\u0000\u0000"+
		"\u0136\u0137\u0005\u001a\u0000\u0000\u0137\u0138\u0005[\u0000\u0000\u0138"+
		"\u014f\u0001\u0000\u0000\u0000\u0139\u013a\u0003\u0000\u0000\u0000\u013a"+
		"\u013b\u0005\u001a\u0000\u0000\u013b\u013c\u0005`\u0000\u0000\u013c\u013d"+
		"\u0005[\u0000\u0000\u013d\u014f\u0001\u0000\u0000\u0000\u013e\u013f\u0003"+
		"\u0000\u0000\u0000\u013f\u0140\u0005\u001a\u0000\u0000\u0140\u0141\u0005"+
		"`\u0000\u0000\u0141\u0142\u0005\u001c\u0000\u0000\u0142\u014f\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0003\u0000\u0000\u0000\u0144\u0145\u0005\u001a"+
		"\u0000\u0000\u0145\u0146\u0005`\u0000\u0000\u0146\u0147\u0005\u001c\u0000"+
		"\u0000\u0147\u0148\u0005N\u0000\u0000\u0148\u0149\u0005#\u0000\u0000\u0149"+
		"\u014a\u0005O\u0000\u0000\u014a\u014b\u0005\u0017\u0000\u0000\u014b\u014c"+
		"\u0005\u000f\u0000\u0000\u014c\u014d\u00055\u0000\u0000\u014d\u014f\u0001"+
		"\u0000\u0000\u0000\u014e\u012c\u0001\u0000\u0000\u0000\u014e\u0130\u0001"+
		"\u0000\u0000\u0000\u014e\u0135\u0001\u0000\u0000\u0000\u014e\u0139\u0001"+
		"\u0000\u0000\u0000\u014e\u013e\u0001\u0000\u0000\u0000\u014e\u0143\u0001"+
		"\u0000\u0000\u0000\u014f#\u0001\u0000\u0000\u0000\u0150\u0151\u0003\u0000"+
		"\u0000\u0000\u0151\u0152\u0005#\u0000\u0000\u0152\u015c\u0005[\u0000\u0000"+
		"\u0153\u0154\u0005\u0017\u0000\u0000\u0154\u015a\u0005\u000f\u0000\u0000"+
		"\u0155\u015b\u00055\u0000\u0000\u0156\u0157\u00052\u0000\u0000\u0157\u015b"+
		"\u00054\u0000\u0000\u0158\u0159\u00056\u0000\u0000\u0159\u015b\u00054"+
		"\u0000\u0000\u015a\u0155\u0001\u0000\u0000\u0000\u015a\u0156\u0001\u0000"+
		"\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015d\u0001\u0000"+
		"\u0000\u0000\u015c\u0153\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000"+
		"\u0000\u0000\u015d%\u0001\u0000\u0000\u0000\u015e\u015f\u0003\u0000\u0000"+
		"\u0000\u015f\u0160\u0005$\u0000\u0000\u0160\u0161\u0005[\u0000\u0000\u0161"+
		"\u0162\u0005\u0017\u0000\u0000\u0162\u016a\u0005[\u0000\u0000\u0163\u0164"+
		"\u0005(\u0000\u0000\u0164\u0165\u0005\u000f\u0000\u0000\u0165\u016b\u0005"+
		"5\u0000\u0000\u0166\u0167\u0005)\u0000\u0000\u0167\u0168\u0005\u000f\u0000"+
		"\u0000\u0168\u0169\u00052\u0000\u0000\u0169\u016b\u00054\u0000\u0000\u016a"+
		"\u0163\u0001\u0000\u0000\u0000\u016a\u0166\u0001\u0000\u0000\u0000\u016b"+
		"\'\u0001\u0000\u0000\u0000\u016c\u016d\u0003\u0000\u0000\u0000\u016d\u016e"+
		"\u0005%\u0000\u0000\u016e\u016f\u0005[\u0000\u0000\u016f\u0170\u0005\u0017"+
		"\u0000\u0000\u0170\u0178\u0005[\u0000\u0000\u0171\u0172\u0005(\u0000\u0000"+
		"\u0172\u0173\u0005\u000f\u0000\u0000\u0173\u0179\u00055\u0000\u0000\u0174"+
		"\u0175\u0005)\u0000\u0000\u0175\u0176\u0005\u000f\u0000\u0000\u0176\u0177"+
		"\u00052\u0000\u0000\u0177\u0179\u00054\u0000\u0000\u0178\u0171\u0001\u0000"+
		"\u0000\u0000\u0178\u0174\u0001\u0000\u0000\u0000\u0179)\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0003\u0000\u0000\u0000\u017b\u017c\u0005Z\u0000\u0000"+
		"\u017c\u017d\u0005[\u0000\u0000\u017d\u017e\u0005&\u0000\u0000\u017e\u0187"+
		"\u0005\\\u0000\u0000\u017f\u0180\u0005(\u0000\u0000\u0180\u0181\u0003"+
		"\u0000\u0000\u0000\u0181\u0182\u0005Z\u0000\u0000\u0182\u0183\u0005[\u0000"+
		"\u0000\u0183\u0184\u0005\u000e\u0000\u0000\u0184\u0185\u0003\u0002\u0001"+
		"\u0000\u0185\u0186\u00057\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000"+
		"\u0187\u017f\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000"+
		"\u0188\u0196\u0001\u0000\u0000\u0000\u0189\u018a\u0005d\u0000\u0000\u018a"+
		"\u018b\u0003\u0000\u0000\u0000\u018b\u018c\u0005Z\u0000\u0000\u018c\u018d"+
		"\u0005[\u0000\u0000\u018d\u018e\u0005@\u0000\u0000\u018e\u018f\u0005`"+
		"\u0000\u0000\u018f\u0190\u0005S\u0000\u0000\u0190\u0191\u00057\u0000\u0000"+
		"\u0191\u0192\u0005T\u0000\u0000\u0192\u0193\u0005\'\u0000\u0000\u0193"+
		"\u0194\u0005_\u0000\u0000\u0194\u0195\u0005U\u0000\u0000\u0195\u0197\u0001"+
		"\u0000\u0000\u0000\u0196\u0189\u0001\u0000\u0000\u0000\u0196\u0197\u0001"+
		"\u0000\u0000\u0000\u0197+\u0001\u0000\u0000\u0000\u0198\u0199\u0005k\u0000"+
		"\u0000\u0199\u019b\u0005V\u0000\u0000\u019a\u019c\u0005f\u0000\u0000\u019b"+
		"\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0001\u0000\u0000\u0000\u019d\u019f\u0005l\u0000\u0000\u019e\u01a0"+
		"\u0003.\u0017\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a5\u0005"+
		"l\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5-\u0001\u0000\u0000\u0000\u01a6\u021a\u0005j\u0000\u0000"+
		"\u01a7\u01a9\u0005W\u0000\u0000\u01a8\u01aa\u0005f\u0000\u0000\u01a9\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ac\u0003\u0002\u0001\u0000\u01ac\u01ad"+
		"\u00057\u0000\u0000\u01ad\u021b\u0001\u0000\u0000\u0000\u01ae\u01b0\u0005"+
		"X\u0000\u0000\u01af\u01b1\u0005f\u0000\u0000\u01b0\u01af\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0003\u0002\u0001\u0000\u01b3\u01b4\u00057\u0000\u0000"+
		"\u01b4\u021b\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005`\u0000\u0000\u01b6"+
		"\u01b8\u0005\u0003\u0000\u0000\u01b7\u01b9\u0005f\u0000\u0000\u01b8\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u0003\u0002\u0001\u0000\u01bb\u01bc"+
		"\u00057\u0000\u0000\u01bc\u021b\u0001\u0000\u0000\u0000\u01bd\u01be\u0005"+
		"h\u0000\u0000\u01be\u01bf\u0005Y\u0000\u0000\u01bf\u01c0\u0005i\u0000"+
		"\u0000\u01c0\u01c2\u0005[\u0000\u0000\u01c1\u01c3\u0005f\u0000\u0000\u01c2"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0003\u0002\u0001\u0000\u01c5"+
		"\u01c6\u00057\u0000\u0000\u01c6\u021b\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0005`\u0000\u0000\u01c8\u01c9\u0007\u0004\u0000\u0000\u01c9\u01cb\u0005"+
		"P\u0000\u0000\u01ca\u01cc\u0005f\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0003\u0002\u0001\u0000\u01ce\u01cf\u00057\u0000\u0000"+
		"\u01cf\u021b\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005U\u0000\u0000\u01d1"+
		"\u01d2\u0005\u0017\u0000\u0000\u01d2\u01d4\u0005_\u0000\u0000\u01d3\u01d5"+
		"\u0005f\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003"+
		"\u0002\u0001\u0000\u01d7\u01d8\u00057\u0000\u0000\u01d8\u021b\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0005h\u0000\u0000\u01da\u01db\u0005\u001e\u0000"+
		"\u0000\u01db\u01dc\u0005i\u0000\u0000\u01dc\u01de\u0005]\u0000\u0000\u01dd"+
		"\u01df\u0005f\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0001\u0000\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01e2"+
		"\u0005k\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0003"+
		"\u0002\u0001\u0000\u01e4\u01e5\u00057\u0000\u0000\u01e5\u021b\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0005h\u0000\u0000\u01e7\u01e8\u0005\u001f\u0000"+
		"\u0000\u01e8\u01e9\u0005i\u0000\u0000\u01e9\u01eb\u0005[\u0000\u0000\u01ea"+
		"\u01ec\u0005f\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ee\u0001\u0000\u0000\u0000\u01ed\u01ef"+
		"\u0005k\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0003"+
		"\u0002\u0001\u0000\u01f1\u01f2\u00057\u0000\u0000\u01f2\u021b\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0005h\u0000\u0000\u01f4\u01f5\u0005\u001e\u0000"+
		"\u0000\u01f5\u01f6\u0005i\u0000\u0000\u01f6\u01f8\u0005]\u0000\u0000\u01f7"+
		"\u01f9\u0005f\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa\u01fc"+
		"\u0005k\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0003"+
		"\u0002\u0001\u0000\u01fe\u01ff\u00057\u0000\u0000\u01ff\u021b\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0005h\u0000\u0000\u0201\u0202\u0005!\u0000\u0000"+
		"\u0202\u0203\u0005i\u0000\u0000\u0203\u0205\u0005[\u0000\u0000\u0204\u0206"+
		"\u0005f\u0000\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001"+
		"\u0000\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0209\u0005"+
		"k\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0003\u0002"+
		"\u0001\u0000\u020b\u020c\u00057\u0000\u0000\u020c\u021b\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0005h\u0000\u0000\u020e\u020f\u0005 \u0000\u0000\u020f"+
		"\u0210\u0005i\u0000\u0000\u0210\u0212\u0005\\\u0000\u0000\u0211\u0213"+
		"\u0005f\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0212\u0213\u0001"+
		"\u0000\u0000\u0000\u0213\u0215\u0001\u0000\u0000\u0000\u0214\u0216\u0005"+
		"k\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0003\u0002"+
		"\u0001\u0000\u0218\u0219\u00057\u0000\u0000\u0219\u021b\u0001\u0000\u0000"+
		"\u0000\u021a\u01a7\u0001\u0000\u0000\u0000\u021a\u01ae\u0001\u0000\u0000"+
		"\u0000\u021a\u01b5\u0001\u0000\u0000\u0000\u021a\u01bd\u0001\u0000\u0000"+
		"\u0000\u021a\u01c7\u0001\u0000\u0000\u0000\u021a\u01d0\u0001\u0000\u0000"+
		"\u0000\u021a\u01d9\u0001\u0000\u0000\u0000\u021a\u01e6\u0001\u0000\u0000"+
		"\u0000\u021a\u01f3\u0001\u0000\u0000\u0000\u021a\u0200\u0001\u0000\u0000"+
		"\u0000\u021a\u020d\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0005l\u0000\u0000\u021d/\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u0003\u0000\u0000\u0000\u021f\u0220\u0005F\u0000\u0000\u0220\u0221"+
		"\u0005[\u0000\u0000\u0221\u0222\u0005\u0017\u0000\u0000\u0222\u0223\u0005"+
		"\u000f\u0000\u0000\u0223\u0224\u00055\u0000\u0000\u02241\u0001\u0000\u0000"+
		"\u0000\u0225\u0226\u0003\u0000\u0000\u0000\u0226\u0227\u0005:\u0000\u0000"+
		"\u0227\u0228\u0005=\u0000\u0000\u0228\u0229\u0005;\u0000\u0000\u0229\u023a"+
		"\u0001\u0000\u0000\u0000\u022a\u022b\u0003\u0000\u0000\u0000\u022b\u022c"+
		"\u0005:\u0000\u0000\u022c\u022d\u0005`\u0000\u0000\u022d\u022e\u0005\u001c"+
		"\u0000\u0000\u022e\u022f\u0005<\u0000\u0000\u022f\u0230\u0005=\u0000\u0000"+
		"\u0230\u0231\u0005;\u0000\u0000\u0231\u023a\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0003\u0000\u0000\u0000\u0233\u0234\u0005:\u0000\u0000\u0234\u0235"+
		"\u0005[\u0000\u0000\u0235\u0236\u0005<\u0000\u0000\u0236\u0237\u0005="+
		"\u0000\u0000\u0237\u0238\u0005;\u0000\u0000\u0238\u023a\u0001\u0000\u0000"+
		"\u0000\u0239\u0225\u0001\u0000\u0000\u0000\u0239\u022a\u0001\u0000\u0000"+
		"\u0000\u0239\u0232\u0001\u0000\u0000\u0000\u023a3\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0003\u0000\u0000\u0000\u023c\u023d\u00058\u0000\u0000\u023d"+
		"\u023e\u0005[\u0000\u0000\u023e\u0256\u0001\u0000\u0000\u0000\u023f\u0240"+
		"\u0003\u0000\u0000\u0000\u0240\u0241\u00058\u0000\u0000\u0241\u0242\u0005"+
		"`\u0000\u0000\u0242\u0243\u0005\u001c\u0000\u0000\u0243\u0256\u0001\u0000"+
		"\u0000\u0000\u0244\u0245\u0005`\u0000\u0000\u0245\u0246\u0005\u001c\u0000"+
		"\u0000\u0246\u0247\u0005-\u0000\u0000\u0247\u0248\u00058\u0000\u0000\u0248"+
		"\u0249\u0005>\u0000\u0000\u0249\u024a\u0003\u0000\u0000\u0000\u024a\u024b"+
		"\u0005Z\u0000\u0000\u024b\u024c\u0005[\u0000\u0000\u024c\u0256\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0005[\u0000\u0000\u024e\u024f\u0005,\u0000\u0000"+
		"\u024f\u0250\u00058\u0000\u0000\u0250\u0251\u0005>\u0000\u0000\u0251\u0252"+
		"\u0003\u0000\u0000\u0000\u0252\u0253\u0005Z\u0000\u0000\u0253\u0254\u0005"+
		"[\u0000\u0000\u0254\u0256\u0001\u0000\u0000\u0000\u0255\u023b\u0001\u0000"+
		"\u0000\u0000\u0255\u023f\u0001\u0000\u0000\u0000\u0255\u0244\u0001\u0000"+
		"\u0000\u0000\u0255\u024d\u0001\u0000\u0000\u0000\u02565\u0001\u0000\u0000"+
		"\u0000\u0257\u0258\u0003\u0000\u0000\u0000\u0258\u025a\u0005@\u0000\u0000"+
		"\u0259\u025b\u0005M\u0000\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025a"+
		"\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c"+
		"\u025d\u0005A\u0000\u0000\u025d\u025e\u0005\u001d\u0000\u0000\u025e\u0265"+
		"\u0001\u0000\u0000\u0000\u025f\u0260\u0003\u0000\u0000\u0000\u0260\u0261"+
		"\u0005@\u0000\u0000\u0261\u0262\u0005`\u0000\u0000\u0262\u0263\u0005B"+
		"\u0000\u0000\u0263\u0265\u0001\u0000\u0000\u0000\u0264\u0257\u0001\u0000"+
		"\u0000\u0000\u0264\u025f\u0001\u0000\u0000\u0000\u02657\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0003\u0000\u0000\u0000\u0267\u0268\u0005?\u0000\u0000"+
		"\u0268\u0269\u0003\u0000\u0000\u0000\u0269\u026a\u0005Z\u0000\u0000\u026a"+
		"\u026b\u0005[\u0000\u0000\u026b\u026c\u0005\u0017\u0000\u0000\u026c\u026d"+
		"\u0005=\u0000\u0000\u026d\u026e\u0005\"\u0000\u0000\u026e9\u0001\u0000"+
		"\u0000\u0000\u026f\u0270\u0003\u0000\u0000\u0000\u0270\u0271\u0005Z\u0000"+
		"\u0000\u0271\u0272\u0005[\u0000\u0000\u0272\u0273\u0005.\u0000\u0000\u0273"+
		"\u0274\u0005/\u0000\u0000\u0274\u0275\u0005)\u0000\u0000\u0275\u0276\u0005"+
		"\u000f\u0000\u0000\u0276\u0277\u00052\u0000\u0000\u0277\u0278\u00054\u0000"+
		"\u0000\u0278;\u0001\u0000\u0000\u0000\u0279\u027a\u0003\u0000\u0000\u0000"+
		"\u027a\u027b\u0005Z\u0000\u0000\u027b\u027c\u0005[\u0000\u0000\u027c\u027d"+
		"\u0005,\u0000\u0000\u027d\u027e\u0005C\u0000\u0000\u027e\u027f\u0005D"+
		"\u0000\u0000\u027f=\u0001\u0000\u0000\u0000\u0280\u0281\u0005M\u0000\u0000"+
		"\u0281\u0282\u0005\u001d\u0000\u0000\u0282\u0283\u0005,\u0000\u0000\u0283"+
		"\u0284\u0005\u0004\u0000\u0000\u0284\u0285\u0005\u0017\u0000\u0000\u0285"+
		"\u0286\u0003\u0000\u0000\u0000\u0286\u0287\u0005Z\u0000\u0000\u0287\u0288"+
		"\u0005\"\u0000\u0000\u0288\u029c\u0001\u0000\u0000\u0000\u0289\u028a\u0005"+
		"[\u0000\u0000\u028a\u028b\u0005,\u0000\u0000\u028b\u028c\u0005\u0004\u0000"+
		"\u0000\u028c\u028d\u0005\u0017\u0000\u0000\u028d\u028e\u0003\u0000\u0000"+
		"\u0000\u028e\u028f\u0005Z\u0000\u0000\u028f\u0290\u0005\"\u0000\u0000"+
		"\u0290\u029c\u0001\u0000\u0000\u0000\u0291\u0292\u0003\u0000\u0000\u0000"+
		"\u0292\u0293\u0005?\u0000\u0000\u0293\u0294\u0003\u0000\u0000\u0000\u0294"+
		"\u0295\u0005Z\u0000\u0000\u0295\u0296\u0005`\u0000\u0000\u0296\u0297\u0005"+
		"\u001c\u0000\u0000\u0297\u0298\u0005\u0017\u0000\u0000\u0298\u0299\u0005"+
		"=\u0000\u0000\u0299\u029a\u0005\"\u0000\u0000\u029a\u029c\u0001\u0000"+
		"\u0000\u0000\u029b\u0280\u0001\u0000\u0000\u0000\u029b\u0289\u0001\u0000"+
		"\u0000\u0000\u029b\u0291\u0001\u0000\u0000\u0000\u029c?\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0003\u0000\u0000\u0000\u029e\u029f\u0005Z\u0000\u0000"+
		"\u029f\u02a0\u0005[\u0000\u0000\u02a0\u02a1\u0005,\u0000\u0000\u02a1\u02a2"+
		"\u0005E\u0000\u0000\u02a2\u02a3\u0005+\u0000\u0000\u02a3\u02a4\u0003\u0000"+
		"\u0000\u0000\u02a4\u02a5\u0005Z\u0000\u0000\u02a5\u02a6\u0005[\u0000\u0000"+
		"\u02a6\u02a7\u0005\u0017\u0000\u0000\u02a7\u02a8\u00050\u0000\u0000\u02a8"+
		"\u02a9\u0005\u000f\u0000\u0000\u02a9\u02aa\u00052\u0000\u0000\u02aa\u02ab"+
		"\u0005\u0003\u0000\u0000\u02abA\u0001\u0000\u0000\u0000\u02ac\u02ad\u0003"+
		"\u0000\u0000\u0000\u02ad\u02ae\u0005Z\u0000\u0000\u02ae\u02af\u0005[\u0000"+
		"\u0000\u02af\u02b0\u0005@\u0000\u0000\u02b0\u02b1\u0003\u0002\u0001\u0000"+
		"\u02b1\u02b2\u00057\u0000\u0000\u02b2C\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0003\u0000\u0000\u0000\u02b4\u02b5\u0005\u0013\u0000\u0000\u02b5\u02b6"+
		"\u0005M\u0000\u0000\u02b6\u02b7\u0005\u0011\u0000\u0000\u02b7\u02b8\u0005"+
		"N\u0000\u0000\u02b8\u02b9\u0005*\u0000\u0000\u02b9\u02ba\u00051\u0000"+
		"\u0000\u02ba\u02bb\u0005(\u0000\u0000\u02bb\u02bc\u0007\u0001\u0000\u0000"+
		"\u02bcE\u0001\u0000\u0000\u0000\u02bd\u02be\u0003\u0000\u0000\u0000\u02be"+
		"\u02bf\u0005\u000b\u0000\u0000\u02bf\u02c0\u0005\\\u0000\u0000\u02c0G"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c2\u0003\u0000\u0000\u0000\u02c2\u02c3"+
		"\u0005Z\u0000\u0000\u02c3\u02c4\u0005[\u0000\u0000\u02c4\u02c5\u0005."+
		"\u0000\u0000\u02c5\u02c6\u0005/\u0000\u0000\u02c6\u02c7\u0005^\u0000\u0000"+
		"\u02c7I\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005[\u0000\u0000\u02c9\u02ca"+
		"\u0005,\u0000\u0000\u02ca\u02cb\u00053\u0000\u0000\u02cbK\u0001\u0000"+
		"\u0000\u0000\u02cc\u02cd\u0003\u0000\u0000\u0000\u02cd\u02ce\u0005\b\u0000"+
		"\u0000\u02ce\u02cf\u0003\u0002\u0001\u0000\u02cf\u02d0\u00057\u0000\u0000"+
		"\u02d0\u02d1\u0005\t\u0000\u0000\u02d1\u02d2\u0005(\u0000\u0000\u02d2"+
		"\u02d3\u0003\u0000\u0000\u0000\u02d3\u02d4\u0005Z\u0000\u0000\u02d4\u02d5"+
		"\u0005[\u0000\u0000\u02d5M\u0001\u0000\u0000\u0000\u02d6\u02d7\u0003\u0000"+
		"\u0000\u0000\u02d7\u02d8\u0005G\u0000\u0000\u02d8\u02d9\u0005=\u0000\u0000"+
		"\u02d9\u02da\u0005\u0002\u0000\u0000\u02daO\u0001\u0000\u0000\u0000\u02db"+
		"\u02dc\u0003\u0000\u0000\u0000\u02dc\u02dd\u0005a\u0000\u0000\u02ddQ\u0001"+
		"\u0000\u0000\u0000\u02de\u02df\u0005K\u0000\u0000\u02df\u02e0\u0005B\u0000"+
		"\u0000\u02e0\u02e1\u0005L\u0000\u0000\u02e1\u02e2\u0005d\u0000\u0000\u02e2"+
		"\u02e3\u0003\u0000\u0000\u0000\u02e3\u02e4\u0005J\u0000\u0000\u02e4\u02e5"+
		"\u0005d\u0000\u0000\u02e5\u0308\u0001\u0000\u0000\u0000\u02e6\u02e7\u0005"+
		"H\u0000\u0000\u02e7\u02e8\u0005I\u0000\u0000\u02e8\u02e9\u0005d\u0000"+
		"\u0000\u02e9\u02ea\u0003\u0000\u0000\u0000\u02ea\u02eb\u0005J\u0000\u0000"+
		"\u02eb\u02ec\u0005d\u0000\u0000\u02ec\u0308\u0001\u0000\u0000\u0000\u02ed"+
		"\u02ee\u0005H\u0000\u0000\u02ee\u02ef\u0005@\u0000\u0000\u02ef\u02f0\u0005"+
		"K\u0000\u0000\u02f0\u02f1\u0005\'\u0000\u0000\u02f1\u02f2\u0005=\u0000"+
		"\u0000\u02f2\u02f3\u0005B\u0000\u0000\u02f3\u02f4\u0005d\u0000\u0000\u02f4"+
		"\u02f5\u0003\u0000\u0000\u0000\u02f5\u02f6\u0005J\u0000\u0000\u02f6\u02f7"+
		"\u0005d\u0000\u0000\u02f7\u0308\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005"+
		"R\u0000\u0000\u02f9\u02fa\u0005I\u0000\u0000\u02fa\u02fb\u0005d\u0000"+
		"\u0000\u02fb\u02fc\u0003\u0000\u0000\u0000\u02fc\u02fd\u0005J\u0000\u0000"+
		"\u02fd\u02fe\u0005d\u0000\u0000\u02fe\u0308\u0001\u0000\u0000\u0000\u02ff"+
		"\u0300\u0005C\u0000\u0000\u0300\u0301\u0005D\u0000\u0000\u0301\u0302\u0005"+
		"b\u0000\u0000\u0302\u0303\u0005d\u0000\u0000\u0303\u0304\u0003\u0000\u0000"+
		"\u0000\u0304\u0305\u0005J\u0000\u0000\u0305\u0306\u0005d\u0000\u0000\u0306"+
		"\u0308\u0001\u0000\u0000\u0000\u0307\u02de\u0001\u0000\u0000\u0000\u0307"+
		"\u02e6\u0001\u0000\u0000\u0000\u0307\u02ed\u0001\u0000\u0000\u0000\u0307"+
		"\u02f8\u0001\u0000\u0000\u0000\u0307\u02ff\u0001\u0000\u0000\u0000\u0308"+
		"S\u0001\u0000\u0000\u0000\u0309\u030a\u0005j\u0000\u0000\u030a\u030f\u0005"+
		"[\u0000\u0000\u030b\u030c\u0005e\u0000\u0000\u030c\u030e\u0005[\u0000"+
		"\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030e\u0311\u0001\u0000\u0000"+
		"\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000"+
		"\u0000\u0310\u0312\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000\u0000"+
		"\u0000\u0312\u0313\u0005l\u0000\u0000\u0313U\u0001\u0000\u0000\u00002"+
		"_fpy\u00a2\u00ca\u00cd\u00e2\u00e5\u00ef\u00fb\u0103\u0105\u010b\u0111"+
		"\u012a\u014e\u015a\u015c\u016a\u0178\u0187\u0196\u019b\u01a1\u01a4\u01a9"+
		"\u01b0\u01b8\u01c2\u01cb\u01d4\u01de\u01e1\u01eb\u01ee\u01f8\u01fb\u0205"+
		"\u0208\u0212\u0215\u021a\u0239\u0255\u025a\u0264\u029b\u0307\u030f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}