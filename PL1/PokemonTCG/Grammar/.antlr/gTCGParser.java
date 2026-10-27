// Generated from c:/Users/pavei/Desktop/Git/COMPILADORES-LAB/PL1/PokemonTCG/Grammar/gTCGParser.g4 by ANTLR 4.13.1
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
		ABILITY=93, SPECIAL_CONDITION=94, POKEMON_TYPE=95, NUMBER=96, PLAYER=97, 
		DOT=98, COMMA=99, COLON=100, EXCLAMATION=101, LPAREN=102, RPAREN=103, 
		BULLET=104, HYPHEN=105, NEWLINE=106, WS=107;
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
		RULE_activateAction = 37, RULE_putAction = 38, RULE_endTurn = 39, RULE_gameEnd = 40, 
		RULE_cardList = 41;
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
			"activateAction", "putAction", "endTurn", "gameEnd", "cardList"
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
			null, null, null, null, "'.'", "','", "':'", "'!'", "'('", "')'", "'\\u2022'", 
			"'-'"
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
			"PLAYER", "DOT", "COMMA", "COLON", "EXCLAMATION", "LPAREN", "RPAREN", 
			"BULLET", "HYPHEN", "NEWLINE", "WS"
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
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_player);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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
	}

	public final DamageAmountContext damageAmount() throws RecognitionException {
		DamageAmountContext _localctx = new DamageAmountContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_damageAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			setup();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(89);
				match(NEWLINE);
				setState(90);
				turn();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			gameEnd();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(97);
				match(NEWLINE);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(SETUP);
			setState(106);
			match(NEWLINE);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					setupAction();
					}
					} 
				}
				setState(112);
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
	}

	public final SetupActionContext setupAction() throws RecognitionException {
		SetupActionContext _localctx = new SetupActionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_setupAction);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				coinChoice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				coinToss();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				firstPlayer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				openingHand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				initialPokemon();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
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
	}

	public final CoinChoiceContext coinChoice() throws RecognitionException {
		CoinChoiceContext _localctx = new CoinChoiceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_coinChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			player();
			setState(122);
			match(CHOSE);
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			match(FOR);
			setState(125);
			match(THE);
			setState(126);
			match(OPENING);
			setState(127);
			match(COIN);
			setState(128);
			match(FLIP);
			setState(129);
			match(DOT);
			setState(130);
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
	}

	public final CoinTossContext coinToss() throws RecognitionException {
		CoinTossContext _localctx = new CoinTossContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_coinToss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			player();
			setState(133);
			match(WON);
			setState(134);
			match(THE);
			setState(135);
			match(COIN);
			setState(136);
			match(TOSS);
			setState(137);
			match(DOT);
			setState(138);
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
	}

	public final FirstPlayerContext firstPlayer() throws RecognitionException {
		FirstPlayerContext _localctx = new FirstPlayerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_firstPlayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			player();
			setState(141);
			match(DECIDED);
			setState(142);
			match(TO);
			setState(143);
			match(GO);
			setState(144);
			match(FIRST);
			setState(145);
			match(DOT);
			setState(146);
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
	}

	public final MulliganContext mulligan() throws RecognitionException {
		MulliganContext _localctx = new MulliganContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mulligan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(148);
				player();
				setState(149);
				match(TAKE);
				setState(150);
				match(A_SOMETHING);
				setState(151);
				match(MULLIGAN);
				setState(152);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(154);
				player();
				setState(155);
				match(TAKE);
				setState(156);
				match(NUMBER);
				setState(157);
				match(MULLIGAN);
				setState(158);
				match(DOT);
				}
				break;
			}
			setState(162);
			match(NEWLINE);
			setState(163);
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
	}

	public final MulliganCardsContext mulliganCards() throws RecognitionException {
		MulliganCardsContext _localctx = new MulliganCardsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mulliganCards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(HYPHEN);
			setState(166);
			match(CARDS);
			setState(167);
			match(REVEALED);
			setState(168);
			match(FROM);
			setState(169);
			match(MULLIGAN);
			setState(170);
			match(NUMBER);
			setState(171);
			match(NEWLINE);
			setState(172);
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
	}

	public final OpeningHandContext openingHand() throws RecognitionException {
		OpeningHandContext _localctx = new OpeningHandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_openingHand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(174);
				player();
				setState(175);
				match(DREW);
				setState(176);
				match(NUMBER);
				setState(177);
				match(CARDS);
				setState(178);
				match(FOR);
				setState(179);
				match(THE);
				setState(180);
				match(OPENING);
				setState(181);
				match(HAND);
				setState(182);
				match(DOT);
				setState(183);
				match(NEWLINE);
				}
				break;
			case 2:
				{
				setState(185);
				player();
				setState(186);
				match(DREW);
				setState(187);
				match(NUMBER);
				setState(188);
				match(MORE_WORD);
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==CARDS || _la==CARD_WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				match(BECAUSE);
				setState(191);
				player();
				setState(192);
				match(TAKE);
				setState(193);
				match(AT);
				setState(194);
				match(LEAST);
				setState(195);
				match(NUMBER);
				setState(196);
				match(MULLIGAN);
				setState(197);
				match(DOT);
				setState(198);
				match(NEWLINE);
				}
				break;
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HYPHEN) {
				{
				setState(202);
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
	}

	public final DrawnCardsContext drawnCards() throws RecognitionException {
		DrawnCardsContext _localctx = new DrawnCardsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_drawnCards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(205);
				match(HYPHEN);
				setState(206);
				match(NUMBER);
				setState(207);
				match(DRAWN);
				setState(208);
				match(CARDS);
				setState(209);
				match(DOT);
				setState(210);
				match(NEWLINE);
				}
				break;
			case 2:
				{
				setState(211);
				match(HYPHEN);
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
				match(DREW);
				setState(214);
				match(NUMBER);
				setState(215);
				match(CARDS);
				setState(216);
				match(DOT);
				setState(217);
				match(NEWLINE);
				}
				break;
			case 3:
				{
				setState(218);
				match(HYPHEN);
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(220);
				match(DREW);
				setState(221);
				match(CARD);
				setState(222);
				match(DOT);
				setState(223);
				match(NEWLINE);
				}
				break;
			}
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(226);
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
	}

	public final InitialPokemonContext initialPokemon() throws RecognitionException {
		InitialPokemonContext _localctx = new InitialPokemonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_initialPokemon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			player();
			setState(230);
			match(PLAYED);
			setState(231);
			match(CARD);
			setState(232);
			match(TO);
			setState(233);
			match(THE);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIVE:
				{
				setState(234);
				match(ACTIVE);
				setState(235);
				match(SPOT);
				}
				break;
			case BENCH:
				{
				setState(236);
				match(BENCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239);
			match(DOT);
			setState(240);
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
	}

	public final TurnContext turn() throws RecognitionException {
		TurnContext _localctx = new TurnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_turn);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			player();
			setState(243);
			match(POSSESSIVE);
			setState(244);
			match(TURN);
			setState(245);
			match(NEWLINE);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					mainTurnAction();
					}
					} 
				}
				setState(251);
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
	}

	public final MainTurnActionContext mainTurnAction() throws RecognitionException {
		MainTurnActionContext _localctx = new MainTurnActionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mainTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			turnActionBody();
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==EXCLAMATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(254);
			match(NEWLINE);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYPHEN) {
				{
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(255);
					subTurnAction();
					}
					break;
				case 2:
					{
					setState(256);
					damageBreakdown();
					}
					break;
				}
				}
				setState(261);
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
	}

	public final SubTurnActionContext subTurnAction() throws RecognitionException {
		SubTurnActionContext _localctx = new SubTurnActionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(HYPHEN);
			setState(263);
			turnActionBody();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(264);
				match(DOT);
				}
			}

			setState(267);
			match(NEWLINE);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BULLET) {
				{
				{
				setState(268);
				cardList();
				}
				}
				setState(273);
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
		public TurnActionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnActionBody; }
	}

	public final TurnActionBodyContext turnActionBody() throws RecognitionException {
		TurnActionBodyContext _localctx = new TurnActionBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_turnActionBody);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				drawAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				playAction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				attachAction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				evolveAction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				attackAction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				retreatAction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(280);
				shuffleAction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(281);
				cardMovedAction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(282);
				discardAction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(283);
				prizeAction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(284);
				moveToHandAction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(285);
				activeSpotAction();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(286);
				switchAction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(287);
				knockoutAction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(288);
				damagedAction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(289);
				flippedAction();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(290);
				choiceAction();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(291);
				specialConditionAction();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(292);
				activateAction();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(293);
				putAction();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(294);
				endTurn();
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
	}

	public final DrawActionContext drawAction() throws RecognitionException {
		DrawActionContext _localctx = new DrawActionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_drawAction);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				player();
				setState(298);
				match(DREW);
				setState(299);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				player();
				setState(302);
				match(DREW);
				setState(303);
				match(A_SOMETHING);
				setState(304);
				match(CARD_WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				player();
				setState(307);
				match(DREW);
				setState(308);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				player();
				setState(311);
				match(DREW);
				setState(312);
				match(NUMBER);
				setState(313);
				match(CARD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				player();
				setState(316);
				match(DREW);
				setState(317);
				match(NUMBER);
				setState(318);
				match(CARDS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				player();
				setState(321);
				match(DREW);
				setState(322);
				match(NUMBER);
				setState(323);
				match(CARDS);
				setState(324);
				match(AND);
				setState(325);
				match(PLAYED);
				setState(326);
				match(THEM);
				setState(327);
				match(TO);
				setState(328);
				match(THE);
				setState(329);
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
	}

	public final PlayActionContext playAction() throws RecognitionException {
		PlayActionContext _localctx = new PlayActionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_playAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			player();
			setState(334);
			match(PLAYED);
			setState(335);
			match(CARD);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(336);
				match(TO);
				setState(337);
				match(THE);
				setState(343);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(338);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(339);
					match(ACTIVE);
					setState(340);
					match(SPOT);
					}
					break;
				case STADIUM:
					{
					setState(341);
					match(STADIUM);
					setState(342);
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
	}

	public final AttachActionContext attachAction() throws RecognitionException {
		AttachActionContext _localctx = new AttachActionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attachAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			player();
			setState(348);
			match(ATTACHED);
			setState(349);
			match(CARD);
			setState(350);
			match(TO);
			setState(351);
			match(CARD);
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(352);
				match(ON);
				setState(353);
				match(THE);
				setState(354);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(355);
				match(IN);
				setState(356);
				match(THE);
				setState(357);
				match(ACTIVE);
				setState(358);
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
	}

	public final EvolveActionContext evolveAction() throws RecognitionException {
		EvolveActionContext _localctx = new EvolveActionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_evolveAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			player();
			setState(362);
			match(EVOLVED);
			setState(363);
			match(CARD);
			setState(364);
			match(TO);
			setState(365);
			match(CARD);
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(366);
				match(ON);
				setState(367);
				match(THE);
				setState(368);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(369);
				match(IN);
				setState(370);
				match(THE);
				setState(371);
				match(ACTIVE);
				setState(372);
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
	}

	public final AttackActionContext attackAction() throws RecognitionException {
		AttackActionContext _localctx = new AttackActionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attackAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			player();
			setState(376);
			match(POSSESSIVE);
			setState(377);
			match(CARD);
			setState(378);
			match(USED);
			setState(379);
			match(ATTACK);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(380);
				match(ON);
				setState(381);
				player();
				setState(382);
				match(POSSESSIVE);
				setState(383);
				match(CARD);
				setState(384);
				match(FOR);
				setState(385);
				damageAmount();
				setState(386);
				match(DAMAGE);
				}
			}

			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(390);
				match(DOT);
				setState(391);
				player();
				setState(392);
				match(POSSESSIVE);
				setState(393);
				match(CARD);
				setState(394);
				match(TAKE);
				setState(395);
				match(NUMBER);
				setState(396);
				match(MORE_WORD);
				setState(397);
				match(DAMAGE);
				setState(398);
				match(BECAUSE);
				setState(399);
				match(OF);
				setState(400);
				match(POKEMON_TYPE);
				setState(401);
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
	}

	public final DamageBreakdownContext damageBreakdown() throws RecognitionException {
		DamageBreakdownContext _localctx = new DamageBreakdownContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_damageBreakdown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(HYPHEN);
			setState(406);
			match(DAMAGE_BREAKDOWN);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(407);
				match(COLON);
				}
			}

			setState(410);
			match(NEWLINE);
			setState(412); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(411);
				damageBreakdownLine();
				}
				}
				setState(414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BULLET );
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(416);
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
	}

	public final DamageBreakdownLineContext damageBreakdownLine() throws RecognitionException {
		DamageBreakdownLineContext _localctx = new DamageBreakdownLineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_damageBreakdownLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(BULLET);
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(420);
				match(BASE_DAMAGE);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(421);
					match(COLON);
					}
				}

				setState(424);
				damageAmount();
				setState(425);
				match(DAMAGE);
				}
				break;
			case 2:
				{
				setState(427);
				match(TOTAL_DAMAGE);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(428);
					match(COLON);
					}
				}

				setState(431);
				damageAmount();
				setState(432);
				match(DAMAGE);
				}
				break;
			case 3:
				{
				setState(434);
				match(NUMBER);
				setState(435);
				match(POKEMON);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(436);
					match(COLON);
					}
				}

				setState(439);
				damageAmount();
				setState(440);
				match(DAMAGE);
				}
				break;
			case 4:
				{
				setState(442);
				match(LPAREN);
				setState(443);
				match(ITEM);
				setState(444);
				match(RPAREN);
				setState(445);
				match(CARD);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(446);
					match(COLON);
					}
				}

				setState(449);
				damageAmount();
				setState(450);
				match(DAMAGE);
				}
				break;
			case 5:
				{
				setState(452);
				match(NUMBER);
				setState(453);
				_la = _input.LA(1);
				if ( !(_la==ATTACHED || _la==SELECTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(454);
				match(ENERGY);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(455);
					match(COLON);
					}
				}

				setState(458);
				damageAmount();
				setState(459);
				match(DAMAGE);
				}
				break;
			case 6:
				{
				setState(461);
				match(WEAKNESS);
				setState(462);
				match(TO);
				setState(463);
				match(POKEMON_TYPE);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(464);
					match(COLON);
					}
				}

				setState(467);
				damageAmount();
				setState(468);
				match(DAMAGE);
				}
				break;
			case 7:
				{
				setState(470);
				match(LPAREN);
				setState(471);
				match(ABILITY_WORD);
				setState(472);
				match(RPAREN);
				setState(473);
				match(ABILITY);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(474);
					match(COLON);
					}
				}

				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(477);
					match(HYPHEN);
					}
				}

				setState(480);
				damageAmount();
				setState(481);
				match(DAMAGE);
				}
				break;
			case 8:
				{
				setState(483);
				match(LPAREN);
				setState(484);
				match(SUPPORTER_WORD);
				setState(485);
				match(RPAREN);
				setState(486);
				match(CARD);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(487);
					match(COLON);
					}
				}

				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(490);
					match(HYPHEN);
					}
				}

				setState(493);
				damageAmount();
				setState(494);
				match(DAMAGE);
				}
				break;
			case 9:
				{
				setState(496);
				match(LPAREN);
				setState(497);
				match(ABILITY_WORD);
				setState(498);
				match(RPAREN);
				setState(499);
				match(ABILITY);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(500);
					match(COLON);
					}
				}

				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(503);
					match(HYPHEN);
					}
				}

				setState(506);
				damageAmount();
				setState(507);
				match(DAMAGE);
				}
				break;
			case 10:
				{
				setState(509);
				match(LPAREN);
				setState(510);
				match(POKEMON_TOOL);
				setState(511);
				match(RPAREN);
				setState(512);
				match(CARD);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(513);
					match(COLON);
					}
				}

				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(516);
					match(HYPHEN);
					}
				}

				setState(519);
				damageAmount();
				setState(520);
				match(DAMAGE);
				}
				break;
			case 11:
				{
				setState(522);
				match(LPAREN);
				setState(523);
				match(ATTACK_WORD);
				setState(524);
				match(RPAREN);
				setState(525);
				match(ATTACK);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(526);
					match(COLON);
					}
				}

				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(529);
					match(HYPHEN);
					}
				}

				setState(532);
				damageAmount();
				setState(533);
				match(DAMAGE);
				}
				break;
			}
			setState(537);
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
	}

	public final RetreatActionContext retreatAction() throws RecognitionException {
		RetreatActionContext _localctx = new RetreatActionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_retreatAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			player();
			setState(540);
			match(RETIRED);
			setState(541);
			match(CARD);
			setState(542);
			match(TO);
			setState(543);
			match(THE);
			setState(544);
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
	}

	public final ShuffleActionContext shuffleAction() throws RecognitionException {
		ShuffleActionContext _localctx = new ShuffleActionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_shuffleAction);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				player();
				setState(547);
				match(SHUFFLED);
				setState(548);
				match(THEIR);
				setState(549);
				match(DECK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				player();
				setState(552);
				match(SHUFFLED);
				setState(553);
				match(NUMBER);
				setState(554);
				match(CARDS);
				setState(555);
				match(INTO);
				setState(556);
				match(THEIR);
				setState(557);
				match(DECK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				player();
				setState(560);
				match(SHUFFLED);
				setState(561);
				match(CARD);
				setState(562);
				match(INTO);
				setState(563);
				match(THEIR);
				setState(564);
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
	}

	public final DiscardActionContext discardAction() throws RecognitionException {
		DiscardActionContext _localctx = new DiscardActionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_discardAction);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				player();
				setState(569);
				match(DISCARDED);
				setState(570);
				match(CARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				player();
				setState(573);
				match(DISCARDED);
				setState(574);
				match(NUMBER);
				setState(575);
				match(CARDS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				match(NUMBER);
				setState(578);
				match(CARDS);
				setState(579);
				match(WERE);
				setState(580);
				match(DISCARDED);
				setState(581);
				match(FROM);
				setState(582);
				player();
				setState(583);
				match(POSSESSIVE);
				setState(584);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				match(CARD);
				setState(587);
				match(WAS);
				setState(588);
				match(DISCARDED);
				setState(589);
				match(FROM);
				setState(590);
				player();
				setState(591);
				match(POSSESSIVE);
				setState(592);
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
	}

	public final PrizeActionContext prizeAction() throws RecognitionException {
		PrizeActionContext _localctx = new PrizeActionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_prizeAction);
		int _la;
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				player();
				setState(597);
				match(TAKE);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==A_SOMETHING) {
					{
					setState(598);
					match(A_SOMETHING);
					}
				}

				setState(601);
				match(PRIZE);
				setState(602);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				player();
				setState(605);
				match(TAKE);
				setState(606);
				match(NUMBER);
				setState(607);
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
	}

	public final MoveToHandActionContext moveToHandAction() throws RecognitionException {
		MoveToHandActionContext _localctx = new MoveToHandActionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_moveToHandAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			player();
			setState(612);
			match(MOVED);
			setState(613);
			player();
			setState(614);
			match(POSSESSIVE);
			setState(615);
			match(CARD);
			setState(616);
			match(TO);
			setState(617);
			match(THEIR);
			setState(618);
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
	}

	public final ActiveSpotActionContext activeSpotAction() throws RecognitionException {
		ActiveSpotActionContext _localctx = new ActiveSpotActionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_activeSpotAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			player();
			setState(621);
			match(POSSESSIVE);
			setState(622);
			match(CARD);
			setState(623);
			match(IS);
			setState(624);
			match(NOW);
			setState(625);
			match(IN);
			setState(626);
			match(THE);
			setState(627);
			match(ACTIVE);
			setState(628);
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
	}

	public final KnockoutActionContext knockoutAction() throws RecognitionException {
		KnockoutActionContext _localctx = new KnockoutActionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_knockoutAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			player();
			setState(631);
			match(POSSESSIVE);
			setState(632);
			match(CARD);
			setState(633);
			match(WAS);
			setState(634);
			match(KNOCKED);
			setState(635);
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
	}

	public final CardMovedActionContext cardMovedAction() throws RecognitionException {
		CardMovedActionContext _localctx = new CardMovedActionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cardMovedAction);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_SOMETHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(A_SOMETHING);
				setState(638);
				match(CARD_WORD);
				setState(639);
				match(WAS);
				setState(640);
				match(ADDED);
				setState(641);
				match(TO);
				setState(642);
				player();
				setState(643);
				match(POSSESSIVE);
				setState(644);
				match(HAND);
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(CARD);
				setState(647);
				match(WAS);
				setState(648);
				match(ADDED);
				setState(649);
				match(TO);
				setState(650);
				player();
				setState(651);
				match(POSSESSIVE);
				setState(652);
				match(HAND);
				}
				break;
			case OPPONENT:
			case PLAYER:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				player();
				setState(655);
				match(MOVED);
				setState(656);
				player();
				setState(657);
				match(POSSESSIVE);
				setState(658);
				match(NUMBER);
				setState(659);
				match(CARDS);
				setState(660);
				match(TO);
				setState(661);
				match(THEIR);
				setState(662);
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
	}

	public final SwitchActionContext switchAction() throws RecognitionException {
		SwitchActionContext _localctx = new SwitchActionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switchAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			player();
			setState(667);
			match(POSSESSIVE);
			setState(668);
			match(CARD);
			setState(669);
			match(WAS);
			setState(670);
			match(SWITCHED);
			setState(671);
			match(WITH);
			setState(672);
			player();
			setState(673);
			match(POSSESSIVE);
			setState(674);
			match(CARD);
			setState(675);
			match(TO);
			setState(676);
			match(BECOME);
			setState(677);
			match(THE);
			setState(678);
			match(ACTIVE);
			setState(679);
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
	}

	public final DamagedActionContext damagedAction() throws RecognitionException {
		DamagedActionContext _localctx = new DamagedActionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_damagedAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			player();
			setState(682);
			match(POSSESSIVE);
			setState(683);
			match(CARD);
			setState(684);
			match(TAKE);
			setState(685);
			damageAmount();
			setState(686);
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
	}

	public final FlippedActionContext flippedAction() throws RecognitionException {
		FlippedActionContext _localctx = new FlippedActionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_flippedAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			player();
			setState(689);
			match(FLIPPED);
			setState(690);
			match(A_SOMETHING);
			setState(691);
			match(COIN);
			setState(692);
			match(AND);
			setState(693);
			match(IT);
			setState(694);
			match(LANDED);
			setState(695);
			match(ON);
			setState(696);
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
	}

	public final ChoiceActionContext choiceAction() throws RecognitionException {
		ChoiceActionContext _localctx = new ChoiceActionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_choiceAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			player();
			setState(699);
			match(CHOSE);
			setState(700);
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
	}

	public final SpecialConditionActionContext specialConditionAction() throws RecognitionException {
		SpecialConditionActionContext _localctx = new SpecialConditionActionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_specialConditionAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			player();
			setState(703);
			match(POSSESSIVE);
			setState(704);
			match(CARD);
			setState(705);
			match(IS);
			setState(706);
			match(NOW);
			setState(707);
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
	}

	public final ActivateActionContext activateAction() throws RecognitionException {
		ActivateActionContext _localctx = new ActivateActionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_activateAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(CARD);
			setState(710);
			match(WAS);
			setState(711);
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
	}

	public final PutActionContext putAction() throws RecognitionException {
		PutActionContext _localctx = new PutActionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_putAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			player();
			setState(714);
			match(PUT);
			setState(715);
			damageAmount();
			setState(716);
			match(DAMAGE);
			setState(717);
			match(COUNTERS);
			setState(718);
			match(ON);
			setState(719);
			player();
			setState(720);
			match(POSSESSIVE);
			setState(721);
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
	}

	public final EndTurnContext endTurn() throws RecognitionException {
		EndTurnContext _localctx = new EndTurnContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_endTurn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			player();
			setState(724);
			match(ENDED);
			setState(725);
			match(THEIR);
			setState(726);
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
		public GameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameEnd; }
	}

	public final GameEndContext gameEnd() throws RecognitionException {
		GameEndContext _localctx = new GameEndContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_gameEnd);
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				match(ALL);
				setState(729);
				match(PRIZE_CARDS);
				setState(730);
				match(TAKEN);
				setState(731);
				match(DOT);
				setState(732);
				player();
				setState(733);
				match(WINS);
				setState(734);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				match(OPPONENT);
				setState(737);
				match(CONCEDED);
				setState(738);
				match(DOT);
				setState(739);
				player();
				setState(740);
				match(WINS);
				setState(741);
				match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				match(OPPONENT);
				setState(744);
				match(TAKE);
				setState(745);
				match(ALL);
				setState(746);
				match(OF);
				setState(747);
				match(THEIR);
				setState(748);
				match(PRIZE_CARDS);
				setState(749);
				match(DOT);
				setState(750);
				player();
				setState(751);
				match(WINS);
				setState(752);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(754);
				match(YOU);
				setState(755);
				match(CONCEDED);
				setState(756);
				match(DOT);
				setState(757);
				player();
				setState(758);
				match(WINS);
				setState(759);
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
	}

	public final CardListContext cardList() throws RecognitionException {
		CardListContext _localctx = new CardListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_cardList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(BULLET);
			setState(764);
			match(CARD);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(765);
				match(COMMA);
				setState(766);
				match(CARD);
				}
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(772);
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
		"\u0004\u0001k\u0307\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\\\b\u0002\n\u0002\f\u0002"+
		"_\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002c\b\u0002\n\u0002\f\u0002"+
		"f\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003m\b\u0003\n\u0003\f\u0003p\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004x\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a1"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00c9\b\n\u0001\n\u0003\n\u00cc\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00e1\b\u000b\u0001\u000b\u0003\u000b\u00e4\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ee"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00f8\b\r\n\r\f\r\u00fb\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0102\b\u000e\n\u000e\f\u000e\u0105\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u010a\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u010e\b\u000f\n\u000f\f\u000f\u0111\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0128\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u014c\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0158\b\u0012\u0003\u0012\u015a"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0168\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0176\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0185\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0194\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0199\b\u0016\u0001\u0016\u0001\u0016\u0004"+
		"\u0016\u019d\b\u0016\u000b\u0016\f\u0016\u019e\u0001\u0016\u0003\u0016"+
		"\u01a2\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01a7\b"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01ae\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01b6\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01c0\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01c9\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01d2\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01dc\b\u0017\u0001"+
		"\u0017\u0003\u0017\u01df\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01e9"+
		"\b\u0017\u0001\u0017\u0003\u0017\u01ec\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u01f6\b\u0017\u0001\u0017\u0003\u0017\u01f9\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0203\b\u0017\u0001\u0017\u0003\u0017\u0206"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0210\b\u0017\u0001\u0017\u0003"+
		"\u0017\u0213\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0218"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0237\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0253\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0258\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0262\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0299\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u02fa\b(\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u0300\b)\n)\f)\u0303\t)\u0001)\u0001)\u0001)\u0000\u0000*\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPR\u0000\u0005\u0002\u0000HHaa\u0001\u0000\f"+
		"\r\u0001\u0000\u001c\u001d\u0002\u0000bbee\u0002\u0000$$QQ\u033a\u0000"+
		"T\u0001\u0000\u0000\u0000\u0002V\u0001\u0000\u0000\u0000\u0004X\u0001"+
		"\u0000\u0000\u0000\u0006i\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000"+
		"\u0000\ny\u0001\u0000\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e"+
		"\u008c\u0001\u0000\u0000\u0000\u0010\u00a0\u0001\u0000\u0000\u0000\u0012"+
		"\u00a5\u0001\u0000\u0000\u0000\u0014\u00c8\u0001\u0000\u0000\u0000\u0016"+
		"\u00e0\u0001\u0000\u0000\u0000\u0018\u00e5\u0001\u0000\u0000\u0000\u001a"+
		"\u00f2\u0001\u0000\u0000\u0000\u001c\u00fc\u0001\u0000\u0000\u0000\u001e"+
		"\u0106\u0001\u0000\u0000\u0000 \u0127\u0001\u0000\u0000\u0000\"\u014b"+
		"\u0001\u0000\u0000\u0000$\u014d\u0001\u0000\u0000\u0000&\u015b\u0001\u0000"+
		"\u0000\u0000(\u0169\u0001\u0000\u0000\u0000*\u0177\u0001\u0000\u0000\u0000"+
		",\u0195\u0001\u0000\u0000\u0000.\u01a3\u0001\u0000\u0000\u00000\u021b"+
		"\u0001\u0000\u0000\u00002\u0236\u0001\u0000\u0000\u00004\u0252\u0001\u0000"+
		"\u0000\u00006\u0261\u0001\u0000\u0000\u00008\u0263\u0001\u0000\u0000\u0000"+
		":\u026c\u0001\u0000\u0000\u0000<\u0276\u0001\u0000\u0000\u0000>\u0298"+
		"\u0001\u0000\u0000\u0000@\u029a\u0001\u0000\u0000\u0000B\u02a9\u0001\u0000"+
		"\u0000\u0000D\u02b0\u0001\u0000\u0000\u0000F\u02ba\u0001\u0000\u0000\u0000"+
		"H\u02be\u0001\u0000\u0000\u0000J\u02c5\u0001\u0000\u0000\u0000L\u02c9"+
		"\u0001\u0000\u0000\u0000N\u02d3\u0001\u0000\u0000\u0000P\u02f9\u0001\u0000"+
		"\u0000\u0000R\u02fb\u0001\u0000\u0000\u0000TU\u0007\u0000\u0000\u0000"+
		"U\u0001\u0001\u0000\u0000\u0000VW\u0005`\u0000\u0000W\u0003\u0001\u0000"+
		"\u0000\u0000X]\u0003\u0006\u0003\u0000YZ\u0005j\u0000\u0000Z\\\u0003\u001a"+
		"\r\u0000[Y\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`d\u0003P(\u0000ac\u0005j\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000gh\u0005\u0000\u0000\u0001h\u0005\u0001\u0000\u0000\u0000ij\u0005"+
		"\n\u0000\u0000jn\u0005j\u0000\u0000km\u0003\b\u0004\u0000lk\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000o\u0007\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000qx\u0003\n\u0005\u0000rx\u0003\f\u0006\u0000sx\u0003\u000e\u0007"+
		"\u0000tx\u0003\u0014\n\u0000ux\u0003\u0018\f\u0000vx\u0003\u0010\b\u0000"+
		"wq\u0001\u0000\u0000\u0000wr\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000"+
		"\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000x\t\u0001\u0000\u0000\u0000yz\u0003\u0000\u0000\u0000z{\u0005"+
		"\u000b\u0000\u0000{|\u0007\u0001\u0000\u0000|}\u0005\u000e\u0000\u0000"+
		"}~\u0005\u000f\u0000\u0000~\u007f\u0005\u0010\u0000\u0000\u007f\u0080"+
		"\u0005\u0011\u0000\u0000\u0080\u0081\u0005\u0012\u0000\u0000\u0081\u0082"+
		"\u0005b\u0000\u0000\u0082\u0083\u0005j\u0000\u0000\u0083\u000b\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0003\u0000\u0000\u0000\u0085\u0086\u0005\u0014"+
		"\u0000\u0000\u0086\u0087\u0005\u000f\u0000\u0000\u0087\u0088\u0005\u0011"+
		"\u0000\u0000\u0088\u0089\u0005\u0015\u0000\u0000\u0089\u008a\u0005b\u0000"+
		"\u0000\u008a\u008b\u0005j\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0003\u0000\u0000\u0000\u008d\u008e\u0005\u0016\u0000\u0000"+
		"\u008e\u008f\u0005\u0017\u0000\u0000\u008f\u0090\u0005\u0018\u0000\u0000"+
		"\u0090\u0091\u0005\u0019\u0000\u0000\u0091\u0092\u0005b\u0000\u0000\u0092"+
		"\u0093\u0005j\u0000\u0000\u0093\u000f\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0003\u0000\u0000\u0000\u0095\u0096\u0005@\u0000\u0000\u0096\u0097\u0005"+
		"M\u0000\u0000\u0097\u0098\u0005\u0001\u0000\u0000\u0098\u0099\u0005b\u0000"+
		"\u0000\u0099\u00a1\u0001\u0000\u0000\u0000\u009a\u009b\u0003\u0000\u0000"+
		"\u0000\u009b\u009c\u0005@\u0000\u0000\u009c\u009d\u0005`\u0000\u0000\u009d"+
		"\u009e\u0005\u0001\u0000\u0000\u009e\u009f\u0005b\u0000\u0000\u009f\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a0\u0094\u0001\u0000\u0000\u0000\u00a0\u009a"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005j\u0000\u0000\u00a3\u00a4\u0003\u0012\t\u0000\u00a4\u0011\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005i\u0000\u0000\u00a6\u00a7\u0005\u001c"+
		"\u0000\u0000\u00a7\u00a8\u0005\u0005\u0000\u0000\u00a8\u00a9\u0005>\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0001\u0000\u0000\u00aa\u00ab\u0005`\u0000\u0000"+
		"\u00ab\u00ac\u0005j\u0000\u0000\u00ac\u00ad\u0003R)\u0000\u00ad\u0013"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u001a\u0000\u0000\u00b0\u00b1\u0005`\u0000\u0000\u00b1\u00b2\u0005"+
		"\u001c\u0000\u0000\u00b2\u00b3\u0005\u000e\u0000\u0000\u00b3\u00b4\u0005"+
		"\u000f\u0000\u0000\u00b4\u00b5\u0005\u0010\u0000\u0000\u00b5\u00b6\u0005"+
		"\"\u0000\u0000\u00b6\u00b7\u0005b\u0000\u0000\u00b7\u00b8\u0005j\u0000"+
		"\u0000\u00b8\u00c9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005\u001a\u0000\u0000\u00bb\u00bc\u0005`\u0000\u0000"+
		"\u00bc\u00bd\u0005S\u0000\u0000\u00bd\u00be\u0007\u0002\u0000\u0000\u00be"+
		"\u00bf\u0005T\u0000\u0000\u00bf\u00c0\u0003\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005@\u0000\u0000\u00c1\u00c2\u0005\u0006\u0000\u0000\u00c2\u00c3\u0005"+
		"\u0007\u0000\u0000\u00c3\u00c4\u0005`\u0000\u0000\u00c4\u00c5\u0005\u0001"+
		"\u0000\u0000\u00c5\u00c6\u0005b\u0000\u0000\u00c6\u00c7\u0005j\u0000\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00ae\u0001\u0000\u0000\u0000"+
		"\u00c8\u00b9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cc\u0003\u0016\u000b\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u0015\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0005i\u0000\u0000\u00ce\u00cf\u0005`\u0000\u0000\u00cf\u00d0"+
		"\u0005\u001b\u0000\u0000\u00d0\u00d1\u0005\u001c\u0000\u0000\u00d1\u00d2"+
		"\u0005b\u0000\u0000\u00d2\u00e1\u0005j\u0000\u0000\u00d3\u00d4\u0005i"+
		"\u0000\u0000\u00d4\u00d5\u0007\u0000\u0000\u0000\u00d5\u00d6\u0005\u001a"+
		"\u0000\u0000\u00d6\u00d7\u0005`\u0000\u0000\u00d7\u00d8\u0005\u001c\u0000"+
		"\u0000\u00d8\u00d9\u0005b\u0000\u0000\u00d9\u00e1\u0005j\u0000\u0000\u00da"+
		"\u00db\u0005i\u0000\u0000\u00db\u00dc\u0007\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005\u001a\u0000\u0000\u00dd\u00de\u0005[\u0000\u0000\u00de\u00df\u0005"+
		"b\u0000\u0000\u00df\u00e1\u0005j\u0000\u0000\u00e0\u00cd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00d3\u0001\u0000\u0000\u0000\u00e0\u00da\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003R)\u0000\u00e3"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u0017\u0001\u0000\u0000\u0000\u00e5\u00e6\u0003\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005#\u0000\u0000\u00e7\u00e8\u0005[\u0000\u0000\u00e8\u00e9\u0005"+
		"\u0017\u0000\u0000\u00e9\u00ed\u0005\u000f\u0000\u0000\u00ea\u00eb\u0005"+
		"2\u0000\u0000\u00eb\u00ee\u00054\u0000\u0000\u00ec\u00ee\u00055\u0000"+
		"\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005b\u0000\u0000"+
		"\u00f0\u00f1\u0005j\u0000\u0000\u00f1\u0019\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0003\u0000\u0000\u0000\u00f3\u00f4\u0005Z\u0000\u0000\u00f4\u00f5"+
		"\u0005\u0002\u0000\u0000\u00f5\u00f9\u0005j\u0000\u0000\u00f6\u00f8\u0003"+
		"\u001c\u000e\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u001b\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0003 \u0010\u0000\u00fd\u00fe\u0007\u0003"+
		"\u0000\u0000\u00fe\u0103\u0005j\u0000\u0000\u00ff\u0102\u0003\u001e\u000f"+
		"\u0000\u0100\u0102\u0003,\u0016\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u001d\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0005i\u0000\u0000\u0107\u0109\u0003 \u0010\u0000\u0108\u010a"+
		"\u0005b\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010f\u0005"+
		"j\u0000\u0000\u010c\u010e\u0003R)\u0000\u010d\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u001f\u0001\u0000\u0000"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0128\u0003\"\u0011\u0000"+
		"\u0113\u0128\u0003$\u0012\u0000\u0114\u0128\u0003&\u0013\u0000\u0115\u0128"+
		"\u0003(\u0014\u0000\u0116\u0128\u0003*\u0015\u0000\u0117\u0128\u00030"+
		"\u0018\u0000\u0118\u0128\u00032\u0019\u0000\u0119\u0128\u0003>\u001f\u0000"+
		"\u011a\u0128\u00034\u001a\u0000\u011b\u0128\u00036\u001b\u0000\u011c\u0128"+
		"\u00038\u001c\u0000\u011d\u0128\u0003:\u001d\u0000\u011e\u0128\u0003@"+
		" \u0000\u011f\u0128\u0003<\u001e\u0000\u0120\u0128\u0003B!\u0000\u0121"+
		"\u0128\u0003D\"\u0000\u0122\u0128\u0003F#\u0000\u0123\u0128\u0003H$\u0000"+
		"\u0124\u0128\u0003J%\u0000\u0125\u0128\u0003L&\u0000\u0126\u0128\u0003"+
		"N\'\u0000\u0127\u0112\u0001\u0000\u0000\u0000\u0127\u0113\u0001\u0000"+
		"\u0000\u0000\u0127\u0114\u0001\u0000\u0000\u0000\u0127\u0115\u0001\u0000"+
		"\u0000\u0000\u0127\u0116\u0001\u0000\u0000\u0000\u0127\u0117\u0001\u0000"+
		"\u0000\u0000\u0127\u0118\u0001\u0000\u0000\u0000\u0127\u0119\u0001\u0000"+
		"\u0000\u0000\u0127\u011a\u0001\u0000\u0000\u0000\u0127\u011b\u0001\u0000"+
		"\u0000\u0000\u0127\u011c\u0001\u0000\u0000\u0000\u0127\u011d\u0001\u0000"+
		"\u0000\u0000\u0127\u011e\u0001\u0000\u0000\u0000\u0127\u011f\u0001\u0000"+
		"\u0000\u0000\u0127\u0120\u0001\u0000\u0000\u0000\u0127\u0121\u0001\u0000"+
		"\u0000\u0000\u0127\u0122\u0001\u0000\u0000\u0000\u0127\u0123\u0001\u0000"+
		"\u0000\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128!\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0003\u0000\u0000\u0000\u012a\u012b\u0005\u001a\u0000"+
		"\u0000\u012b\u012c\u0005\u001d\u0000\u0000\u012c\u014c\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0003\u0000\u0000\u0000\u012e\u012f\u0005\u001a\u0000"+
		"\u0000\u012f\u0130\u0005M\u0000\u0000\u0130\u0131\u0005\u001d\u0000\u0000"+
		"\u0131\u014c\u0001\u0000\u0000\u0000\u0132\u0133\u0003\u0000\u0000\u0000"+
		"\u0133\u0134\u0005\u001a\u0000\u0000\u0134\u0135\u0005[\u0000\u0000\u0135"+
		"\u014c\u0001\u0000\u0000\u0000\u0136\u0137\u0003\u0000\u0000\u0000\u0137"+
		"\u0138\u0005\u001a\u0000\u0000\u0138\u0139\u0005`\u0000\u0000\u0139\u013a"+
		"\u0005[\u0000\u0000\u013a\u014c\u0001\u0000\u0000\u0000\u013b\u013c\u0003"+
		"\u0000\u0000\u0000\u013c\u013d\u0005\u001a\u0000\u0000\u013d\u013e\u0005"+
		"`\u0000\u0000\u013e\u013f\u0005\u001c\u0000\u0000\u013f\u014c\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0003\u0000\u0000\u0000\u0141\u0142\u0005\u001a"+
		"\u0000\u0000\u0142\u0143\u0005`\u0000\u0000\u0143\u0144\u0005\u001c\u0000"+
		"\u0000\u0144\u0145\u0005N\u0000\u0000\u0145\u0146\u0005#\u0000\u0000\u0146"+
		"\u0147\u0005O\u0000\u0000\u0147\u0148\u0005\u0017\u0000\u0000\u0148\u0149"+
		"\u0005\u000f\u0000\u0000\u0149\u014a\u00055\u0000\u0000\u014a\u014c\u0001"+
		"\u0000\u0000\u0000\u014b\u0129\u0001\u0000\u0000\u0000\u014b\u012d\u0001"+
		"\u0000\u0000\u0000\u014b\u0132\u0001\u0000\u0000\u0000\u014b\u0136\u0001"+
		"\u0000\u0000\u0000\u014b\u013b\u0001\u0000\u0000\u0000\u014b\u0140\u0001"+
		"\u0000\u0000\u0000\u014c#\u0001\u0000\u0000\u0000\u014d\u014e\u0003\u0000"+
		"\u0000\u0000\u014e\u014f\u0005#\u0000\u0000\u014f\u0159\u0005[\u0000\u0000"+
		"\u0150\u0151\u0005\u0017\u0000\u0000\u0151\u0157\u0005\u000f\u0000\u0000"+
		"\u0152\u0158\u00055\u0000\u0000\u0153\u0154\u00052\u0000\u0000\u0154\u0158"+
		"\u00054\u0000\u0000\u0155\u0156\u00056\u0000\u0000\u0156\u0158\u00054"+
		"\u0000\u0000\u0157\u0152\u0001\u0000\u0000\u0000\u0157\u0153\u0001\u0000"+
		"\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015a\u0001\u0000"+
		"\u0000\u0000\u0159\u0150\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a%\u0001\u0000\u0000\u0000\u015b\u015c\u0003\u0000\u0000"+
		"\u0000\u015c\u015d\u0005$\u0000\u0000\u015d\u015e\u0005[\u0000\u0000\u015e"+
		"\u015f\u0005\u0017\u0000\u0000\u015f\u0167\u0005[\u0000\u0000\u0160\u0161"+
		"\u0005(\u0000\u0000\u0161\u0162\u0005\u000f\u0000\u0000\u0162\u0168\u0005"+
		"5\u0000\u0000\u0163\u0164\u0005)\u0000\u0000\u0164\u0165\u0005\u000f\u0000"+
		"\u0000\u0165\u0166\u00052\u0000\u0000\u0166\u0168\u00054\u0000\u0000\u0167"+
		"\u0160\u0001\u0000\u0000\u0000\u0167\u0163\u0001\u0000\u0000\u0000\u0168"+
		"\'\u0001\u0000\u0000\u0000\u0169\u016a\u0003\u0000\u0000\u0000\u016a\u016b"+
		"\u0005%\u0000\u0000\u016b\u016c\u0005[\u0000\u0000\u016c\u016d\u0005\u0017"+
		"\u0000\u0000\u016d\u0175\u0005[\u0000\u0000\u016e\u016f\u0005(\u0000\u0000"+
		"\u016f\u0170\u0005\u000f\u0000\u0000\u0170\u0176\u00055\u0000\u0000\u0171"+
		"\u0172\u0005)\u0000\u0000\u0172\u0173\u0005\u000f\u0000\u0000\u0173\u0174"+
		"\u00052\u0000\u0000\u0174\u0176\u00054\u0000\u0000\u0175\u016e\u0001\u0000"+
		"\u0000\u0000\u0175\u0171\u0001\u0000\u0000\u0000\u0176)\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0003\u0000\u0000\u0000\u0178\u0179\u0005Z\u0000\u0000"+
		"\u0179\u017a\u0005[\u0000\u0000\u017a\u017b\u0005&\u0000\u0000\u017b\u0184"+
		"\u0005\\\u0000\u0000\u017c\u017d\u0005(\u0000\u0000\u017d\u017e\u0003"+
		"\u0000\u0000\u0000\u017e\u017f\u0005Z\u0000\u0000\u017f\u0180\u0005[\u0000"+
		"\u0000\u0180\u0181\u0005\u000e\u0000\u0000\u0181\u0182\u0003\u0002\u0001"+
		"\u0000\u0182\u0183\u00057\u0000\u0000\u0183\u0185\u0001\u0000\u0000\u0000"+
		"\u0184\u017c\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185\u0193\u0001\u0000\u0000\u0000\u0186\u0187\u0005b\u0000\u0000\u0187"+
		"\u0188\u0003\u0000\u0000\u0000\u0188\u0189\u0005Z\u0000\u0000\u0189\u018a"+
		"\u0005[\u0000\u0000\u018a\u018b\u0005@\u0000\u0000\u018b\u018c\u0005`"+
		"\u0000\u0000\u018c\u018d\u0005S\u0000\u0000\u018d\u018e\u00057\u0000\u0000"+
		"\u018e\u018f\u0005T\u0000\u0000\u018f\u0190\u0005\'\u0000\u0000\u0190"+
		"\u0191\u0005_\u0000\u0000\u0191\u0192\u0005U\u0000\u0000\u0192\u0194\u0001"+
		"\u0000\u0000\u0000\u0193\u0186\u0001\u0000\u0000\u0000\u0193\u0194\u0001"+
		"\u0000\u0000\u0000\u0194+\u0001\u0000\u0000\u0000\u0195\u0196\u0005i\u0000"+
		"\u0000\u0196\u0198\u0005V\u0000\u0000\u0197\u0199\u0005d\u0000\u0000\u0198"+
		"\u0197\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0001\u0000\u0000\u0000\u019a\u019c\u0005j\u0000\u0000\u019b\u019d"+
		"\u0003.\u0017\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
		"\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001"+
		"\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u01a2\u0005"+
		"j\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2-\u0001\u0000\u0000\u0000\u01a3\u0217\u0005h\u0000\u0000"+
		"\u01a4\u01a6\u0005W\u0000\u0000\u01a5\u01a7\u0005d\u0000\u0000\u01a6\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003\u0002\u0001\u0000\u01a9\u01aa"+
		"\u00057\u0000\u0000\u01aa\u0218\u0001\u0000\u0000\u0000\u01ab\u01ad\u0005"+
		"X\u0000\u0000\u01ac\u01ae\u0005d\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0003\u0002\u0001\u0000\u01b0\u01b1\u00057\u0000\u0000"+
		"\u01b1\u0218\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005`\u0000\u0000\u01b3"+
		"\u01b5\u0005\u0003\u0000\u0000\u01b4\u01b6\u0005d\u0000\u0000\u01b5\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0003\u0002\u0001\u0000\u01b8\u01b9"+
		"\u00057\u0000\u0000\u01b9\u0218\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005"+
		"f\u0000\u0000\u01bb\u01bc\u0005Y\u0000\u0000\u01bc\u01bd\u0005g\u0000"+
		"\u0000\u01bd\u01bf\u0005[\u0000\u0000\u01be\u01c0\u0005d\u0000\u0000\u01bf"+
		"\u01be\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0003\u0002\u0001\u0000\u01c2"+
		"\u01c3\u00057\u0000\u0000\u01c3\u0218\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0005`\u0000\u0000\u01c5\u01c6\u0007\u0004\u0000\u0000\u01c6\u01c8\u0005"+
		"P\u0000\u0000\u01c7\u01c9\u0005d\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0003\u0002\u0001\u0000\u01cb\u01cc\u00057\u0000\u0000"+
		"\u01cc\u0218\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005U\u0000\u0000\u01ce"+
		"\u01cf\u0005\u0017\u0000\u0000\u01cf\u01d1\u0005_\u0000\u0000\u01d0\u01d2"+
		"\u0005d\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003"+
		"\u0002\u0001\u0000\u01d4\u01d5\u00057\u0000\u0000\u01d5\u0218\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d7\u0005f\u0000\u0000\u01d7\u01d8\u0005\u001e\u0000"+
		"\u0000\u01d8\u01d9\u0005g\u0000\u0000\u01d9\u01db\u0005]\u0000\u0000\u01da"+
		"\u01dc\u0005d\u0000\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0001\u0000\u0000\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u01df"+
		"\u0005i\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u0003"+
		"\u0002\u0001\u0000\u01e1\u01e2\u00057\u0000\u0000\u01e2\u0218\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0005f\u0000\u0000\u01e4\u01e5\u0005\u001f\u0000"+
		"\u0000\u01e5\u01e6\u0005g\u0000\u0000\u01e6\u01e8\u0005[\u0000\u0000\u01e7"+
		"\u01e9\u0005d\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0001\u0000\u0000\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01ec"+
		"\u0005i\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003"+
		"\u0002\u0001\u0000\u01ee\u01ef\u00057\u0000\u0000\u01ef\u0218\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0005f\u0000\u0000\u01f1\u01f2\u0005\u001e\u0000"+
		"\u0000\u01f2\u01f3\u0005g\u0000\u0000\u01f3\u01f5\u0005]\u0000\u0000\u01f4"+
		"\u01f6\u0005d\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f9"+
		"\u0005i\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0003"+
		"\u0002\u0001\u0000\u01fb\u01fc\u00057\u0000\u0000\u01fc\u0218\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fe\u0005f\u0000\u0000\u01fe\u01ff\u0005!\u0000\u0000"+
		"\u01ff\u0200\u0005g\u0000\u0000\u0200\u0202\u0005[\u0000\u0000\u0201\u0203"+
		"\u0005d\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0202\u0203\u0001"+
		"\u0000\u0000\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u0206\u0005"+
		"i\u0000\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0208\u0003\u0002"+
		"\u0001\u0000\u0208\u0209\u00057\u0000\u0000\u0209\u0218\u0001\u0000\u0000"+
		"\u0000\u020a\u020b\u0005f\u0000\u0000\u020b\u020c\u0005 \u0000\u0000\u020c"+
		"\u020d\u0005g\u0000\u0000\u020d\u020f\u0005\\\u0000\u0000\u020e\u0210"+
		"\u0005d\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001"+
		"\u0000\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u0213\u0005"+
		"i\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0215\u0003\u0002"+
		"\u0001\u0000\u0215\u0216\u00057\u0000\u0000\u0216\u0218\u0001\u0000\u0000"+
		"\u0000\u0217\u01a4\u0001\u0000\u0000\u0000\u0217\u01ab\u0001\u0000\u0000"+
		"\u0000\u0217\u01b2\u0001\u0000\u0000\u0000\u0217\u01ba\u0001\u0000\u0000"+
		"\u0000\u0217\u01c4\u0001\u0000\u0000\u0000\u0217\u01cd\u0001\u0000\u0000"+
		"\u0000\u0217\u01d6\u0001\u0000\u0000\u0000\u0217\u01e3\u0001\u0000\u0000"+
		"\u0000\u0217\u01f0\u0001\u0000\u0000\u0000\u0217\u01fd\u0001\u0000\u0000"+
		"\u0000\u0217\u020a\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0005j\u0000\u0000\u021a/\u0001\u0000\u0000\u0000\u021b"+
		"\u021c\u0003\u0000\u0000\u0000\u021c\u021d\u0005F\u0000\u0000\u021d\u021e"+
		"\u0005[\u0000\u0000\u021e\u021f\u0005\u0017\u0000\u0000\u021f\u0220\u0005"+
		"\u000f\u0000\u0000\u0220\u0221\u00055\u0000\u0000\u02211\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0003\u0000\u0000\u0000\u0223\u0224\u0005:\u0000\u0000"+
		"\u0224\u0225\u0005=\u0000\u0000\u0225\u0226\u0005;\u0000\u0000\u0226\u0237"+
		"\u0001\u0000\u0000\u0000\u0227\u0228\u0003\u0000\u0000\u0000\u0228\u0229"+
		"\u0005:\u0000\u0000\u0229\u022a\u0005`\u0000\u0000\u022a\u022b\u0005\u001c"+
		"\u0000\u0000\u022b\u022c\u0005<\u0000\u0000\u022c\u022d\u0005=\u0000\u0000"+
		"\u022d\u022e\u0005;\u0000\u0000\u022e\u0237\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0003\u0000\u0000\u0000\u0230\u0231\u0005:\u0000\u0000\u0231\u0232"+
		"\u0005[\u0000\u0000\u0232\u0233\u0005<\u0000\u0000\u0233\u0234\u0005="+
		"\u0000\u0000\u0234\u0235\u0005;\u0000\u0000\u0235\u0237\u0001\u0000\u0000"+
		"\u0000\u0236\u0222\u0001\u0000\u0000\u0000\u0236\u0227\u0001\u0000\u0000"+
		"\u0000\u0236\u022f\u0001\u0000\u0000\u0000\u02373\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0003\u0000\u0000\u0000\u0239\u023a\u00058\u0000\u0000\u023a"+
		"\u023b\u0005[\u0000\u0000\u023b\u0253\u0001\u0000\u0000\u0000\u023c\u023d"+
		"\u0003\u0000\u0000\u0000\u023d\u023e\u00058\u0000\u0000\u023e\u023f\u0005"+
		"`\u0000\u0000\u023f\u0240\u0005\u001c\u0000\u0000\u0240\u0253\u0001\u0000"+
		"\u0000\u0000\u0241\u0242\u0005`\u0000\u0000\u0242\u0243\u0005\u001c\u0000"+
		"\u0000\u0243\u0244\u0005-\u0000\u0000\u0244\u0245\u00058\u0000\u0000\u0245"+
		"\u0246\u0005>\u0000\u0000\u0246\u0247\u0003\u0000\u0000\u0000\u0247\u0248"+
		"\u0005Z\u0000\u0000\u0248\u0249\u0005[\u0000\u0000\u0249\u0253\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0005[\u0000\u0000\u024b\u024c\u0005,\u0000\u0000"+
		"\u024c\u024d\u00058\u0000\u0000\u024d\u024e\u0005>\u0000\u0000\u024e\u024f"+
		"\u0003\u0000\u0000\u0000\u024f\u0250\u0005Z\u0000\u0000\u0250\u0251\u0005"+
		"[\u0000\u0000\u0251\u0253\u0001\u0000\u0000\u0000\u0252\u0238\u0001\u0000"+
		"\u0000\u0000\u0252\u023c\u0001\u0000\u0000\u0000\u0252\u0241\u0001\u0000"+
		"\u0000\u0000\u0252\u024a\u0001\u0000\u0000\u0000\u02535\u0001\u0000\u0000"+
		"\u0000\u0254\u0255\u0003\u0000\u0000\u0000\u0255\u0257\u0005@\u0000\u0000"+
		"\u0256\u0258\u0005M\u0000\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0257"+
		"\u0258\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259"+
		"\u025a\u0005A\u0000\u0000\u025a\u025b\u0005\u001d\u0000\u0000\u025b\u0262"+
		"\u0001\u0000\u0000\u0000\u025c\u025d\u0003\u0000\u0000\u0000\u025d\u025e"+
		"\u0005@\u0000\u0000\u025e\u025f\u0005`\u0000\u0000\u025f\u0260\u0005B"+
		"\u0000\u0000\u0260\u0262\u0001\u0000\u0000\u0000\u0261\u0254\u0001\u0000"+
		"\u0000\u0000\u0261\u025c\u0001\u0000\u0000\u0000\u02627\u0001\u0000\u0000"+
		"\u0000\u0263\u0264\u0003\u0000\u0000\u0000\u0264\u0265\u0005?\u0000\u0000"+
		"\u0265\u0266\u0003\u0000\u0000\u0000\u0266\u0267\u0005Z\u0000\u0000\u0267"+
		"\u0268\u0005[\u0000\u0000\u0268\u0269\u0005\u0017\u0000\u0000\u0269\u026a"+
		"\u0005=\u0000\u0000\u026a\u026b\u0005\"\u0000\u0000\u026b9\u0001\u0000"+
		"\u0000\u0000\u026c\u026d\u0003\u0000\u0000\u0000\u026d\u026e\u0005Z\u0000"+
		"\u0000\u026e\u026f\u0005[\u0000\u0000\u026f\u0270\u0005.\u0000\u0000\u0270"+
		"\u0271\u0005/\u0000\u0000\u0271\u0272\u0005)\u0000\u0000\u0272\u0273\u0005"+
		"\u000f\u0000\u0000\u0273\u0274\u00052\u0000\u0000\u0274\u0275\u00054\u0000"+
		"\u0000\u0275;\u0001\u0000\u0000\u0000\u0276\u0277\u0003\u0000\u0000\u0000"+
		"\u0277\u0278\u0005Z\u0000\u0000\u0278\u0279\u0005[\u0000\u0000\u0279\u027a"+
		"\u0005,\u0000\u0000\u027a\u027b\u0005C\u0000\u0000\u027b\u027c\u0005D"+
		"\u0000\u0000\u027c=\u0001\u0000\u0000\u0000\u027d\u027e\u0005M\u0000\u0000"+
		"\u027e\u027f\u0005\u001d\u0000\u0000\u027f\u0280\u0005,\u0000\u0000\u0280"+
		"\u0281\u0005\u0004\u0000\u0000\u0281\u0282\u0005\u0017\u0000\u0000\u0282"+
		"\u0283\u0003\u0000\u0000\u0000\u0283\u0284\u0005Z\u0000\u0000\u0284\u0285"+
		"\u0005\"\u0000\u0000\u0285\u0299\u0001\u0000\u0000\u0000\u0286\u0287\u0005"+
		"[\u0000\u0000\u0287\u0288\u0005,\u0000\u0000\u0288\u0289\u0005\u0004\u0000"+
		"\u0000\u0289\u028a\u0005\u0017\u0000\u0000\u028a\u028b\u0003\u0000\u0000"+
		"\u0000\u028b\u028c\u0005Z\u0000\u0000\u028c\u028d\u0005\"\u0000\u0000"+
		"\u028d\u0299\u0001\u0000\u0000\u0000\u028e\u028f\u0003\u0000\u0000\u0000"+
		"\u028f\u0290\u0005?\u0000\u0000\u0290\u0291\u0003\u0000\u0000\u0000\u0291"+
		"\u0292\u0005Z\u0000\u0000\u0292\u0293\u0005`\u0000\u0000\u0293\u0294\u0005"+
		"\u001c\u0000\u0000\u0294\u0295\u0005\u0017\u0000\u0000\u0295\u0296\u0005"+
		"=\u0000\u0000\u0296\u0297\u0005\"\u0000\u0000\u0297\u0299\u0001\u0000"+
		"\u0000\u0000\u0298\u027d\u0001\u0000\u0000\u0000\u0298\u0286\u0001\u0000"+
		"\u0000\u0000\u0298\u028e\u0001\u0000\u0000\u0000\u0299?\u0001\u0000\u0000"+
		"\u0000\u029a\u029b\u0003\u0000\u0000\u0000\u029b\u029c\u0005Z\u0000\u0000"+
		"\u029c\u029d\u0005[\u0000\u0000\u029d\u029e\u0005,\u0000\u0000\u029e\u029f"+
		"\u0005E\u0000\u0000\u029f\u02a0\u0005+\u0000\u0000\u02a0\u02a1\u0003\u0000"+
		"\u0000\u0000\u02a1\u02a2\u0005Z\u0000\u0000\u02a2\u02a3\u0005[\u0000\u0000"+
		"\u02a3\u02a4\u0005\u0017\u0000\u0000\u02a4\u02a5\u00050\u0000\u0000\u02a5"+
		"\u02a6\u0005\u000f\u0000\u0000\u02a6\u02a7\u00052\u0000\u0000\u02a7\u02a8"+
		"\u0005\u0003\u0000\u0000\u02a8A\u0001\u0000\u0000\u0000\u02a9\u02aa\u0003"+
		"\u0000\u0000\u0000\u02aa\u02ab\u0005Z\u0000\u0000\u02ab\u02ac\u0005[\u0000"+
		"\u0000\u02ac\u02ad\u0005@\u0000\u0000\u02ad\u02ae\u0003\u0002\u0001\u0000"+
		"\u02ae\u02af\u00057\u0000\u0000\u02afC\u0001\u0000\u0000\u0000\u02b0\u02b1"+
		"\u0003\u0000\u0000\u0000\u02b1\u02b2\u0005\u0013\u0000\u0000\u02b2\u02b3"+
		"\u0005M\u0000\u0000\u02b3\u02b4\u0005\u0011\u0000\u0000\u02b4\u02b5\u0005"+
		"N\u0000\u0000\u02b5\u02b6\u0005*\u0000\u0000\u02b6\u02b7\u00051\u0000"+
		"\u0000\u02b7\u02b8\u0005(\u0000\u0000\u02b8\u02b9\u0007\u0001\u0000\u0000"+
		"\u02b9E\u0001\u0000\u0000\u0000\u02ba\u02bb\u0003\u0000\u0000\u0000\u02bb"+
		"\u02bc\u0005\u000b\u0000\u0000\u02bc\u02bd\u0005\\\u0000\u0000\u02bdG"+
		"\u0001\u0000\u0000\u0000\u02be\u02bf\u0003\u0000\u0000\u0000\u02bf\u02c0"+
		"\u0005Z\u0000\u0000\u02c0\u02c1\u0005[\u0000\u0000\u02c1\u02c2\u0005."+
		"\u0000\u0000\u02c2\u02c3\u0005/\u0000\u0000\u02c3\u02c4\u0005^\u0000\u0000"+
		"\u02c4I\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005[\u0000\u0000\u02c6\u02c7"+
		"\u0005,\u0000\u0000\u02c7\u02c8\u00053\u0000\u0000\u02c8K\u0001\u0000"+
		"\u0000\u0000\u02c9\u02ca\u0003\u0000\u0000\u0000\u02ca\u02cb\u0005\b\u0000"+
		"\u0000\u02cb\u02cc\u0003\u0002\u0001\u0000\u02cc\u02cd\u00057\u0000\u0000"+
		"\u02cd\u02ce\u0005\t\u0000\u0000\u02ce\u02cf\u0005(\u0000\u0000\u02cf"+
		"\u02d0\u0003\u0000\u0000\u0000\u02d0\u02d1\u0005Z\u0000\u0000\u02d1\u02d2"+
		"\u0005[\u0000\u0000\u02d2M\u0001\u0000\u0000\u0000\u02d3\u02d4\u0003\u0000"+
		"\u0000\u0000\u02d4\u02d5\u0005G\u0000\u0000\u02d5\u02d6\u0005=\u0000\u0000"+
		"\u02d6\u02d7\u0005\u0002\u0000\u0000\u02d7O\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d9\u0005K\u0000\u0000\u02d9\u02da\u0005B\u0000\u0000\u02da\u02db\u0005"+
		"L\u0000\u0000\u02db\u02dc\u0005b\u0000\u0000\u02dc\u02dd\u0003\u0000\u0000"+
		"\u0000\u02dd\u02de\u0005J\u0000\u0000\u02de\u02df\u0005b\u0000\u0000\u02df"+
		"\u02fa\u0001\u0000\u0000\u0000\u02e0\u02e1\u0005H\u0000\u0000\u02e1\u02e2"+
		"\u0005I\u0000\u0000\u02e2\u02e3\u0005b\u0000\u0000\u02e3\u02e4\u0003\u0000"+
		"\u0000\u0000\u02e4\u02e5\u0005J\u0000\u0000\u02e5\u02e6\u0005b\u0000\u0000"+
		"\u02e6\u02fa\u0001\u0000\u0000\u0000\u02e7\u02e8\u0005H\u0000\u0000\u02e8"+
		"\u02e9\u0005@\u0000\u0000\u02e9\u02ea\u0005K\u0000\u0000\u02ea\u02eb\u0005"+
		"\'\u0000\u0000\u02eb\u02ec\u0005=\u0000\u0000\u02ec\u02ed\u0005B\u0000"+
		"\u0000\u02ed\u02ee\u0005b\u0000\u0000\u02ee\u02ef\u0003\u0000\u0000\u0000"+
		"\u02ef\u02f0\u0005J\u0000\u0000\u02f0\u02f1\u0005b\u0000\u0000\u02f1\u02fa"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f3\u0005R\u0000\u0000\u02f3\u02f4\u0005"+
		"I\u0000\u0000\u02f4\u02f5\u0005b\u0000\u0000\u02f5\u02f6\u0003\u0000\u0000"+
		"\u0000\u02f6\u02f7\u0005J\u0000\u0000\u02f7\u02f8\u0005b\u0000\u0000\u02f8"+
		"\u02fa\u0001\u0000\u0000\u0000\u02f9\u02d8\u0001\u0000\u0000\u0000\u02f9"+
		"\u02e0\u0001\u0000\u0000\u0000\u02f9\u02e7\u0001\u0000\u0000\u0000\u02f9"+
		"\u02f2\u0001\u0000\u0000\u0000\u02faQ\u0001\u0000\u0000\u0000\u02fb\u02fc"+
		"\u0005h\u0000\u0000\u02fc\u0301\u0005[\u0000\u0000\u02fd\u02fe\u0005c"+
		"\u0000\u0000\u02fe\u0300\u0005[\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000"+
		"\u0000\u0300\u0303\u0001\u0000\u0000\u0000\u0301\u02ff\u0001\u0000\u0000"+
		"\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0304\u0001\u0000\u0000"+
		"\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0304\u0305\u0005j\u0000\u0000"+
		"\u0305S\u0001\u0000\u0000\u00002]dnw\u00a0\u00c8\u00cb\u00e0\u00e3\u00ed"+
		"\u00f9\u0101\u0103\u0109\u010f\u0127\u014b\u0157\u0159\u0167\u0175\u0184"+
		"\u0193\u0198\u019e\u01a1\u01a6\u01ad\u01b5\u01bf\u01c8\u01d1\u01db\u01de"+
		"\u01e8\u01eb\u01f5\u01f8\u0202\u0205\u020f\u0212\u0217\u0236\u0252\u0257"+
		"\u0261\u0298\u02f9\u0301";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}