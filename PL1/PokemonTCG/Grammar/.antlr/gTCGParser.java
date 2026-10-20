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
		TURN=1, POKEMON=2, ADDED=3, SETUP=4, CHOSE=5, HEADS=6, TAILS=7, FOR=8, 
		THE=9, OPENING=10, COIN=11, FLIP=12, WON=13, TOSS=14, DECIDED=15, TO=16, 
		GO=17, FIRST=18, DREW=19, DRAWN=20, CARDS=21, CARD_WORD=22, HAND=23, PLAYED=24, 
		ATTACHED=25, EVOLVED=26, USED=27, ON=28, IN=29, WITH=30, WAS=31, WERE=32, 
		IS=33, NOW=34, BECOME=35, ACTIVE=36, SPOT=37, BENCH=38, DAMAGE=39, DISCARDED=40, 
		DISCARDS=41, SHUFFLED=42, DECK=43, INTO=44, THEIR=45, FROM=46, MOVED=47, 
		TAKE=48, PRIZE=49, PRIZE_CARDS=50, KNOCKED=51, OUT=52, SWITCHED=53, RETIRED=54, 
		ENDED=55, OPPONENT=56, CONCEDED=57, WINS=58, ALL=59, TAKEN=60, A_SOMETHING=61, 
		AND=62, THEM=63, DAMAGE_BREAKDOWN=64, BASE_DAMAGE=65, TOTAL_DAMAGE=66, 
		ITEM=67, POSSESSIVE=68, CARD=69, ATTACK=70, NUMBER=71, PLAYER=72, DOT=73, 
		COMMA=74, COLON=75, EXCLAMATION=76, LPAREN=77, RPAREN=78, BULLET=79, HYPHEN=80, 
		NEWLINE=81, WS=82;
	public static final int
		RULE_log = 0, RULE_setup = 1, RULE_setupAction = 2, RULE_coinChoice = 3, 
		RULE_coinToss = 4, RULE_firstPlayer = 5, RULE_openingHand = 6, RULE_drawnCards = 7, 
		RULE_initialPokemon = 8, RULE_turn = 9, RULE_mainTurnAction = 10, RULE_subTurnAction = 11, 
		RULE_turnActionBody = 12, RULE_drawAction = 13, RULE_playAction = 14, 
		RULE_attachAction = 15, RULE_evolveAction = 16, RULE_attackAction = 17, 
		RULE_damageBreakdown = 18, RULE_damageBonusLine = 19, RULE_retreatAction = 20, 
		RULE_shuffleAction = 21, RULE_discardAction = 22, RULE_prizeAction = 23, 
		RULE_moveToHandAction = 24, RULE_activeSpotAction = 25, RULE_knockoutAction = 26, 
		RULE_cardMovedAction = 27, RULE_switchAction = 28, RULE_damagedAction = 29, 
		RULE_endTurn = 30, RULE_gameEnd = 31, RULE_cardList = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"log", "setup", "setupAction", "coinChoice", "coinToss", "firstPlayer", 
			"openingHand", "drawnCards", "initialPokemon", "turn", "mainTurnAction", 
			"subTurnAction", "turnActionBody", "drawAction", "playAction", "attachAction", 
			"evolveAction", "attackAction", "damageBreakdown", "damageBonusLine", 
			"retreatAction", "shuffleAction", "discardAction", "prizeAction", "moveToHandAction", 
			"activeSpotAction", "knockoutAction", "cardMovedAction", "switchAction", 
			"damagedAction", "endTurn", "gameEnd", "cardList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Pok\\u00E9mon'", "'added'", "'Setup'", "'chose'", "'heads'", 
			"'tails'", "'for'", "'the'", "'opening'", "'coin'", "'flip'", "'won'", 
			"'toss'", "'decided'", "'to'", "'go'", "'first'", "'drew'", "'drawn'", 
			"'cards'", "'card'", "'hand'", "'played'", "'attached'", "'evolved'", 
			"'used'", "'on'", "'in'", "'with'", "'was'", "'were'", "'is'", "'now'", 
			"'become'", "'Active'", "'Spot'", "'Bench'", "'damage'", "'discarded'", 
			"'discard'", "'shuffled'", "'deck'", "'into'", "'their'", "'from'", "'moved'", 
			"'took'", "'Prize'", "'Prize cards'", "'Knocked'", "'Out'", "'switched'", 
			"'retreated'", "'ended'", "'Opponent'", "'conceded'", "'wins'", "'All'", 
			"'taken'", null, "'and'", "'them'", "'Damage breakdown'", "'Base damage'", 
			"'Total damage'", "'Item'", null, null, null, null, null, "'.'", "','", 
			"':'", "'!'", "'('", "')'", "'\\u2022'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TURN", "POKEMON", "ADDED", "SETUP", "CHOSE", "HEADS", "TAILS", 
			"FOR", "THE", "OPENING", "COIN", "FLIP", "WON", "TOSS", "DECIDED", "TO", 
			"GO", "FIRST", "DREW", "DRAWN", "CARDS", "CARD_WORD", "HAND", "PLAYED", 
			"ATTACHED", "EVOLVED", "USED", "ON", "IN", "WITH", "WAS", "WERE", "IS", 
			"NOW", "BECOME", "ACTIVE", "SPOT", "BENCH", "DAMAGE", "DISCARDED", "DISCARDS", 
			"SHUFFLED", "DECK", "INTO", "THEIR", "FROM", "MOVED", "TAKE", "PRIZE", 
			"PRIZE_CARDS", "KNOCKED", "OUT", "SWITCHED", "RETIRED", "ENDED", "OPPONENT", 
			"CONCEDED", "WINS", "ALL", "TAKEN", "A_SOMETHING", "AND", "THEM", "DAMAGE_BREAKDOWN", 
			"BASE_DAMAGE", "TOTAL_DAMAGE", "ITEM", "POSSESSIVE", "CARD", "ATTACK", 
			"NUMBER", "PLAYER", "DOT", "COMMA", "COLON", "EXCLAMATION", "LPAREN", 
			"RPAREN", "BULLET", "HYPHEN", "NEWLINE", "WS"
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
		enterRule(_localctx, 0, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			setup();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(67);
				match(NEWLINE);
				setState(68);
				turn();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			gameEnd();
			setState(75);
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
		enterRule(_localctx, 2, RULE_setup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(SETUP);
			setState(78);
			match(NEWLINE);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLAYER) {
				{
				{
				setState(79);
				setupAction();
				}
				}
				setState(84);
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
		public SetupActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setupAction; }
	}

	public final SetupActionContext setupAction() throws RecognitionException {
		SetupActionContext _localctx = new SetupActionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setupAction);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				coinChoice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				coinToss();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				firstPlayer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				openingHand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				initialPokemon();
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 6, RULE_coinChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(PLAYER);
			setState(93);
			match(CHOSE);
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(95);
			match(FOR);
			setState(96);
			match(THE);
			setState(97);
			match(OPENING);
			setState(98);
			match(COIN);
			setState(99);
			match(FLIP);
			setState(100);
			match(DOT);
			setState(101);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 8, RULE_coinToss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(PLAYER);
			setState(104);
			match(WON);
			setState(105);
			match(THE);
			setState(106);
			match(COIN);
			setState(107);
			match(TOSS);
			setState(108);
			match(DOT);
			setState(109);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 10, RULE_firstPlayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(PLAYER);
			setState(112);
			match(DECIDED);
			setState(113);
			match(TO);
			setState(114);
			match(GO);
			setState(115);
			match(FIRST);
			setState(116);
			match(DOT);
			setState(117);
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
	public static class OpeningHandContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode DREW() { return getToken(gTCGParser.DREW, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public TerminalNode FOR() { return getToken(gTCGParser.FOR, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode OPENING() { return getToken(gTCGParser.OPENING, 0); }
		public TerminalNode HAND() { return getToken(gTCGParser.HAND, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
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
		enterRule(_localctx, 12, RULE_openingHand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(PLAYER);
			setState(120);
			match(DREW);
			setState(121);
			match(NUMBER);
			setState(122);
			match(CARDS);
			setState(123);
			match(FOR);
			setState(124);
			match(THE);
			setState(125);
			match(OPENING);
			setState(126);
			match(HAND);
			setState(127);
			match(DOT);
			setState(128);
			match(NEWLINE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HYPHEN) {
				{
				setState(129);
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
		enterRule(_localctx, 14, RULE_drawnCards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(HYPHEN);
			setState(133);
			match(NUMBER);
			setState(134);
			match(DRAWN);
			setState(135);
			match(CARDS);
			setState(136);
			match(DOT);
			setState(137);
			match(NEWLINE);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(138);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 16, RULE_initialPokemon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(PLAYER);
			setState(142);
			match(PLAYED);
			setState(143);
			match(CARD);
			setState(144);
			match(TO);
			setState(145);
			match(THE);
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIVE:
				{
				setState(146);
				match(ACTIVE);
				setState(147);
				match(SPOT);
				}
				break;
			case BENCH:
				{
				setState(148);
				match(BENCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(151);
			match(DOT);
			setState(152);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 18, RULE_turn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(PLAYER);
			setState(155);
			match(POSSESSIVE);
			setState(156);
			match(TURN);
			setState(157);
			match(NEWLINE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 3329L) != 0)) {
				{
				{
				setState(158);
				mainTurnAction();
				}
				}
				setState(163);
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
		enterRule(_localctx, 20, RULE_mainTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			turnActionBody();
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==EXCLAMATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(166);
			match(NEWLINE);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYPHEN) {
				{
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(167);
					subTurnAction();
					}
					break;
				case 2:
					{
					setState(168);
					damageBreakdown();
					}
					break;
				}
				}
				setState(173);
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
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
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
		enterRule(_localctx, 22, RULE_subTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(HYPHEN);
			setState(175);
			turnActionBody();
			setState(176);
			match(DOT);
			setState(177);
			match(NEWLINE);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BULLET) {
				{
				{
				setState(178);
				cardList();
				}
				}
				setState(183);
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
		enterRule(_localctx, 24, RULE_turnActionBody);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				drawAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				playAction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				attachAction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				evolveAction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				attackAction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				retreatAction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				shuffleAction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(191);
				cardMovedAction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(192);
				discardAction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(193);
				prizeAction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(194);
				moveToHandAction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(195);
				activeSpotAction();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(196);
				switchAction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(197);
				knockoutAction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(198);
				damagedAction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(199);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 26, RULE_drawAction);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(PLAYER);
				setState(203);
				match(DREW);
				setState(204);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(PLAYER);
				setState(206);
				match(DREW);
				setState(207);
				match(A_SOMETHING);
				setState(208);
				match(CARD_WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(PLAYER);
				setState(210);
				match(DREW);
				setState(211);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(PLAYER);
				setState(213);
				match(DREW);
				setState(214);
				match(NUMBER);
				setState(215);
				match(CARD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(PLAYER);
				setState(217);
				match(DREW);
				setState(218);
				match(NUMBER);
				setState(219);
				match(CARDS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				match(PLAYER);
				setState(221);
				match(DREW);
				setState(222);
				match(NUMBER);
				setState(223);
				match(CARDS);
				setState(224);
				match(AND);
				setState(225);
				match(PLAYED);
				setState(226);
				match(THEM);
				setState(227);
				match(TO);
				setState(228);
				match(THE);
				setState(229);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode PLAYED() { return getToken(gTCGParser.PLAYED, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(gTCGParser.BENCH, 0); }
		public TerminalNode ACTIVE() { return getToken(gTCGParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(gTCGParser.SPOT, 0); }
		public PlayActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playAction; }
	}

	public final PlayActionContext playAction() throws RecognitionException {
		PlayActionContext _localctx = new PlayActionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_playAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(PLAYER);
			setState(233);
			match(PLAYED);
			setState(234);
			match(CARD);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(235);
				match(TO);
				setState(236);
				match(THE);
				setState(240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(237);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(238);
					match(ACTIVE);
					setState(239);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 30, RULE_attachAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(PLAYER);
			setState(245);
			match(ATTACHED);
			setState(246);
			match(CARD);
			setState(247);
			match(TO);
			setState(248);
			match(CARD);
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(249);
				match(ON);
				setState(250);
				match(THE);
				setState(251);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(252);
				match(IN);
				setState(253);
				match(THE);
				setState(254);
				match(ACTIVE);
				setState(255);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 32, RULE_evolveAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(PLAYER);
			setState(259);
			match(EVOLVED);
			setState(260);
			match(CARD);
			setState(261);
			match(TO);
			setState(262);
			match(CARD);
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(263);
				match(ON);
				setState(264);
				match(THE);
				setState(265);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(266);
				match(IN);
				setState(267);
				match(THE);
				setState(268);
				match(ACTIVE);
				setState(269);
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
		public List<TerminalNode> PLAYER() { return getTokens(gTCGParser.PLAYER); }
		public TerminalNode PLAYER(int i) {
			return getToken(gTCGParser.PLAYER, i);
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
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public AttackActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attackAction; }
	}

	public final AttackActionContext attackAction() throws RecognitionException {
		AttackActionContext _localctx = new AttackActionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attackAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(PLAYER);
			setState(273);
			match(POSSESSIVE);
			setState(274);
			match(CARD);
			setState(275);
			match(USED);
			setState(276);
			match(ATTACK);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(277);
				match(ON);
				setState(278);
				match(PLAYER);
				setState(279);
				match(POSSESSIVE);
				setState(280);
				match(CARD);
				setState(281);
				match(FOR);
				setState(282);
				match(NUMBER);
				setState(283);
				match(DAMAGE);
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
	public static class DamageBreakdownContext extends ParserRuleContext {
		public TerminalNode HYPHEN() { return getToken(gTCGParser.HYPHEN, 0); }
		public TerminalNode DAMAGE_BREAKDOWN() { return getToken(gTCGParser.DAMAGE_BREAKDOWN, 0); }
		public List<TerminalNode> COLON() { return getTokens(gTCGParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(gTCGParser.COLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gTCGParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gTCGParser.NEWLINE, i);
		}
		public List<TerminalNode> BULLET() { return getTokens(gTCGParser.BULLET); }
		public TerminalNode BULLET(int i) {
			return getToken(gTCGParser.BULLET, i);
		}
		public TerminalNode BASE_DAMAGE() { return getToken(gTCGParser.BASE_DAMAGE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(gTCGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gTCGParser.NUMBER, i);
		}
		public List<TerminalNode> DAMAGE() { return getTokens(gTCGParser.DAMAGE); }
		public TerminalNode DAMAGE(int i) {
			return getToken(gTCGParser.DAMAGE, i);
		}
		public DamageBonusLineContext damageBonusLine() {
			return getRuleContext(DamageBonusLineContext.class,0);
		}
		public TerminalNode TOTAL_DAMAGE() { return getToken(gTCGParser.TOTAL_DAMAGE, 0); }
		public DamageBreakdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damageBreakdown; }
	}

	public final DamageBreakdownContext damageBreakdown() throws RecognitionException {
		DamageBreakdownContext _localctx = new DamageBreakdownContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_damageBreakdown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(HYPHEN);
			setState(287);
			match(DAMAGE_BREAKDOWN);
			setState(288);
			match(COLON);
			setState(289);
			match(NEWLINE);
			setState(290);
			match(BULLET);
			setState(291);
			match(BASE_DAMAGE);
			setState(292);
			match(COLON);
			setState(293);
			match(NUMBER);
			setState(294);
			match(DAMAGE);
			setState(295);
			match(NEWLINE);
			setState(296);
			damageBonusLine();
			setState(297);
			match(BULLET);
			setState(298);
			match(TOTAL_DAMAGE);
			setState(299);
			match(COLON);
			setState(300);
			match(NUMBER);
			setState(301);
			match(DAMAGE);
			setState(302);
			match(NEWLINE);
			setState(303);
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
	public static class DamageBonusLineContext extends ParserRuleContext {
		public TerminalNode BULLET() { return getToken(gTCGParser.BULLET, 0); }
		public TerminalNode LPAREN() { return getToken(gTCGParser.LPAREN, 0); }
		public TerminalNode ITEM() { return getToken(gTCGParser.ITEM, 0); }
		public TerminalNode RPAREN() { return getToken(gTCGParser.RPAREN, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode COLON() { return getToken(gTCGParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public DamageBonusLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damageBonusLine; }
	}

	public final DamageBonusLineContext damageBonusLine() throws RecognitionException {
		DamageBonusLineContext _localctx = new DamageBonusLineContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_damageBonusLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(BULLET);
			setState(306);
			match(LPAREN);
			setState(307);
			match(ITEM);
			setState(308);
			match(RPAREN);
			setState(309);
			match(CARD);
			setState(310);
			match(COLON);
			setState(311);
			match(NUMBER);
			setState(312);
			match(DAMAGE);
			setState(313);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 40, RULE_retreatAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(PLAYER);
			setState(316);
			match(RETIRED);
			setState(317);
			match(CARD);
			setState(318);
			match(TO);
			setState(319);
			match(THE);
			setState(320);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 42, RULE_shuffleAction);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(PLAYER);
				setState(323);
				match(SHUFFLED);
				setState(324);
				match(THEIR);
				setState(325);
				match(DECK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(PLAYER);
				setState(327);
				match(SHUFFLED);
				setState(328);
				match(NUMBER);
				setState(329);
				match(CARDS);
				setState(330);
				match(INTO);
				setState(331);
				match(THEIR);
				setState(332);
				match(DECK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(PLAYER);
				setState(334);
				match(SHUFFLED);
				setState(335);
				match(CARD);
				setState(336);
				match(INTO);
				setState(337);
				match(THEIR);
				setState(338);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 44, RULE_discardAction);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(PLAYER);
				setState(342);
				match(DISCARDED);
				setState(343);
				match(CARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(PLAYER);
				setState(345);
				match(DISCARDED);
				setState(346);
				match(NUMBER);
				setState(347);
				match(CARDS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(NUMBER);
				setState(349);
				match(CARDS);
				setState(350);
				match(WERE);
				setState(351);
				match(DISCARDED);
				setState(352);
				match(FROM);
				setState(353);
				match(PLAYER);
				setState(354);
				match(POSSESSIVE);
				setState(355);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(CARD);
				setState(357);
				match(WAS);
				setState(358);
				match(DISCARDED);
				setState(359);
				match(FROM);
				setState(360);
				match(PLAYER);
				setState(361);
				match(POSSESSIVE);
				setState(362);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 46, RULE_prizeAction);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(PLAYER);
				setState(366);
				match(TAKE);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==A_SOMETHING) {
					{
					setState(367);
					match(A_SOMETHING);
					}
				}

				setState(370);
				match(PRIZE);
				setState(371);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(PLAYER);
				setState(373);
				match(TAKE);
				setState(374);
				match(NUMBER);
				setState(375);
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
		public List<TerminalNode> PLAYER() { return getTokens(gTCGParser.PLAYER); }
		public TerminalNode PLAYER(int i) {
			return getToken(gTCGParser.PLAYER, i);
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
		enterRule(_localctx, 48, RULE_moveToHandAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(PLAYER);
			setState(379);
			match(MOVED);
			setState(380);
			match(PLAYER);
			setState(381);
			match(POSSESSIVE);
			setState(382);
			match(CARD);
			setState(383);
			match(TO);
			setState(384);
			match(THEIR);
			setState(385);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 50, RULE_activeSpotAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(PLAYER);
			setState(388);
			match(POSSESSIVE);
			setState(389);
			match(CARD);
			setState(390);
			match(IS);
			setState(391);
			match(NOW);
			setState(392);
			match(IN);
			setState(393);
			match(THE);
			setState(394);
			match(ACTIVE);
			setState(395);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 52, RULE_knockoutAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(PLAYER);
			setState(398);
			match(POSSESSIVE);
			setState(399);
			match(CARD);
			setState(400);
			match(WAS);
			setState(401);
			match(KNOCKED);
			setState(402);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode HAND() { return getToken(gTCGParser.HAND, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public CardMovedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardMovedAction; }
	}

	public final CardMovedActionContext cardMovedAction() throws RecognitionException {
		CardMovedActionContext _localctx = new CardMovedActionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cardMovedAction);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_SOMETHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(A_SOMETHING);
				setState(405);
				match(CARD_WORD);
				setState(406);
				match(WAS);
				setState(407);
				match(ADDED);
				setState(408);
				match(TO);
				setState(409);
				match(PLAYER);
				setState(410);
				match(POSSESSIVE);
				setState(411);
				match(HAND);
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(CARD);
				setState(413);
				match(WAS);
				setState(414);
				match(ADDED);
				setState(415);
				match(TO);
				setState(416);
				match(PLAYER);
				setState(417);
				match(POSSESSIVE);
				setState(418);
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
		public List<TerminalNode> PLAYER() { return getTokens(gTCGParser.PLAYER); }
		public TerminalNode PLAYER(int i) {
			return getToken(gTCGParser.PLAYER, i);
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
		enterRule(_localctx, 56, RULE_switchAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(PLAYER);
			setState(422);
			match(POSSESSIVE);
			setState(423);
			match(CARD);
			setState(424);
			match(WAS);
			setState(425);
			match(SWITCHED);
			setState(426);
			match(WITH);
			setState(427);
			match(PLAYER);
			setState(428);
			match(POSSESSIVE);
			setState(429);
			match(CARD);
			setState(430);
			match(TO);
			setState(431);
			match(BECOME);
			setState(432);
			match(THE);
			setState(433);
			match(ACTIVE);
			setState(434);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public DamagedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damagedAction; }
	}

	public final DamagedActionContext damagedAction() throws RecognitionException {
		DamagedActionContext _localctx = new DamagedActionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_damagedAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(PLAYER);
			setState(437);
			match(POSSESSIVE);
			setState(438);
			match(CARD);
			setState(439);
			match(TAKE);
			setState(440);
			match(NUMBER);
			setState(441);
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
	public static class EndTurnContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 60, RULE_endTurn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(PLAYER);
			setState(444);
			match(ENDED);
			setState(445);
			match(THEIR);
			setState(446);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode WINS() { return getToken(gTCGParser.WINS, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode CONCEDED() { return getToken(gTCGParser.CONCEDED, 0); }
		public GameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameEnd; }
	}

	public final GameEndContext gameEnd() throws RecognitionException {
		GameEndContext _localctx = new GameEndContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_gameEnd);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(ALL);
				setState(449);
				match(PRIZE_CARDS);
				setState(450);
				match(TAKEN);
				setState(451);
				match(DOT);
				setState(452);
				match(PLAYER);
				setState(453);
				match(WINS);
				setState(454);
				match(DOT);
				}
				break;
			case OPPONENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(OPPONENT);
				setState(456);
				match(CONCEDED);
				setState(457);
				match(DOT);
				setState(458);
				match(PLAYER);
				setState(459);
				match(WINS);
				setState(460);
				match(DOT);
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
		enterRule(_localctx, 64, RULE_cardList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(BULLET);
			setState(464);
			match(CARD);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(465);
				match(COMMA);
				setState(466);
				match(CARD);
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
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
		"\u0004\u0001R\u01db\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001Q\b\u0001"+
		"\n\u0001\f\u0001T\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0083\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u008c\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0096\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a0\b\t\n"+
		"\t\f\t\u00a3\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00aa"+
		"\b\n\n\n\f\n\u00ad\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00b4\b\u000b\n\u000b\f\u000b\u00b7\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c9\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00e7\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f1\b\u000e\u0003"+
		"\u000e\u00f3\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0101\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u010f\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u011d\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0154\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u016c\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0171\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0179\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a4\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01ce\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0005 \u01d4\b \n \f \u01d7\t \u0001 \u0001 \u0001 \u0000"+
		"\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0002\u0001\u0000\u0006\u0007"+
		"\u0002\u0000IILL\u01e9\u0000B\u0001\u0000\u0000\u0000\u0002M\u0001\u0000"+
		"\u0000\u0000\u0004Z\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000"+
		"\u0000\bg\u0001\u0000\u0000\u0000\no\u0001\u0000\u0000\u0000\fw\u0001"+
		"\u0000\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010\u008d\u0001"+
		"\u0000\u0000\u0000\u0012\u009a\u0001\u0000\u0000\u0000\u0014\u00a4\u0001"+
		"\u0000\u0000\u0000\u0016\u00ae\u0001\u0000\u0000\u0000\u0018\u00c8\u0001"+
		"\u0000\u0000\u0000\u001a\u00e6\u0001\u0000\u0000\u0000\u001c\u00e8\u0001"+
		"\u0000\u0000\u0000\u001e\u00f4\u0001\u0000\u0000\u0000 \u0102\u0001\u0000"+
		"\u0000\u0000\"\u0110\u0001\u0000\u0000\u0000$\u011e\u0001\u0000\u0000"+
		"\u0000&\u0131\u0001\u0000\u0000\u0000(\u013b\u0001\u0000\u0000\u0000*"+
		"\u0153\u0001\u0000\u0000\u0000,\u016b\u0001\u0000\u0000\u0000.\u0178\u0001"+
		"\u0000\u0000\u00000\u017a\u0001\u0000\u0000\u00002\u0183\u0001\u0000\u0000"+
		"\u00004\u018d\u0001\u0000\u0000\u00006\u01a3\u0001\u0000\u0000\u00008"+
		"\u01a5\u0001\u0000\u0000\u0000:\u01b4\u0001\u0000\u0000\u0000<\u01bb\u0001"+
		"\u0000\u0000\u0000>\u01cd\u0001\u0000\u0000\u0000@\u01cf\u0001\u0000\u0000"+
		"\u0000BG\u0003\u0002\u0001\u0000CD\u0005Q\u0000\u0000DF\u0003\u0012\t"+
		"\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JK\u0003>\u001f\u0000KL\u0005\u0000\u0000\u0001L\u0001"+
		"\u0001\u0000\u0000\u0000MN\u0005\u0004\u0000\u0000NR\u0005Q\u0000\u0000"+
		"OQ\u0003\u0004\u0002\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u0003\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000U[\u0003\u0006\u0003\u0000"+
		"V[\u0003\b\u0004\u0000W[\u0003\n\u0005\u0000X[\u0003\f\u0006\u0000Y[\u0003"+
		"\u0010\b\u0000ZU\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000ZW\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[\u0005\u0001\u0000\u0000\u0000\\]\u0005H\u0000\u0000]^\u0005\u0005\u0000"+
		"\u0000^_\u0007\u0000\u0000\u0000_`\u0005\b\u0000\u0000`a\u0005\t\u0000"+
		"\u0000ab\u0005\n\u0000\u0000bc\u0005\u000b\u0000\u0000cd\u0005\f\u0000"+
		"\u0000de\u0005I\u0000\u0000ef\u0005Q\u0000\u0000f\u0007\u0001\u0000\u0000"+
		"\u0000gh\u0005H\u0000\u0000hi\u0005\r\u0000\u0000ij\u0005\t\u0000\u0000"+
		"jk\u0005\u000b\u0000\u0000kl\u0005\u000e\u0000\u0000lm\u0005I\u0000\u0000"+
		"mn\u0005Q\u0000\u0000n\t\u0001\u0000\u0000\u0000op\u0005H\u0000\u0000"+
		"pq\u0005\u000f\u0000\u0000qr\u0005\u0010\u0000\u0000rs\u0005\u0011\u0000"+
		"\u0000st\u0005\u0012\u0000\u0000tu\u0005I\u0000\u0000uv\u0005Q\u0000\u0000"+
		"v\u000b\u0001\u0000\u0000\u0000wx\u0005H\u0000\u0000xy\u0005\u0013\u0000"+
		"\u0000yz\u0005G\u0000\u0000z{\u0005\u0015\u0000\u0000{|\u0005\b\u0000"+
		"\u0000|}\u0005\t\u0000\u0000}~\u0005\n\u0000\u0000~\u007f\u0005\u0017"+
		"\u0000\u0000\u007f\u0080\u0005I\u0000\u0000\u0080\u0082\u0005Q\u0000\u0000"+
		"\u0081\u0083\u0003\u000e\u0007\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\r\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005P\u0000\u0000\u0085\u0086\u0005G\u0000\u0000\u0086\u0087\u0005"+
		"\u0014\u0000\u0000\u0087\u0088\u0005\u0015\u0000\u0000\u0088\u0089\u0005"+
		"I\u0000\u0000\u0089\u008b\u0005Q\u0000\u0000\u008a\u008c\u0003@ \u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u000f\u0001\u0000\u0000\u0000\u008d\u008e\u0005H\u0000\u0000\u008e"+
		"\u008f\u0005\u0018\u0000\u0000\u008f\u0090\u0005E\u0000\u0000\u0090\u0091"+
		"\u0005\u0010\u0000\u0000\u0091\u0095\u0005\t\u0000\u0000\u0092\u0093\u0005"+
		"$\u0000\u0000\u0093\u0096\u0005%\u0000\u0000\u0094\u0096\u0005&\u0000"+
		"\u0000\u0095\u0092\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0005I\u0000\u0000"+
		"\u0098\u0099\u0005Q\u0000\u0000\u0099\u0011\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005H\u0000\u0000\u009b\u009c\u0005D\u0000\u0000\u009c\u009d\u0005"+
		"\u0001\u0000\u0000\u009d\u00a1\u0005Q\u0000\u0000\u009e\u00a0\u0003\u0014"+
		"\n\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u0013\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0003\u0018\f\u0000\u00a5\u00a6\u0007\u0001\u0000\u0000"+
		"\u00a6\u00ab\u0005Q\u0000\u0000\u00a7\u00aa\u0003\u0016\u000b\u0000\u00a8"+
		"\u00aa\u0003$\u0012\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u0015"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005P\u0000\u0000\u00af\u00b0\u0003\u0018\f\u0000\u00b0\u00b1\u0005"+
		"I\u0000\u0000\u00b1\u00b5\u0005Q\u0000\u0000\u00b2\u00b4\u0003@ \u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u0017\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b8\u00c9\u0003\u001a\r\u0000\u00b9\u00c9\u0003\u001c\u000e\u0000\u00ba"+
		"\u00c9\u0003\u001e\u000f\u0000\u00bb\u00c9\u0003 \u0010\u0000\u00bc\u00c9"+
		"\u0003\"\u0011\u0000\u00bd\u00c9\u0003(\u0014\u0000\u00be\u00c9\u0003"+
		"*\u0015\u0000\u00bf\u00c9\u00036\u001b\u0000\u00c0\u00c9\u0003,\u0016"+
		"\u0000\u00c1\u00c9\u0003.\u0017\u0000\u00c2\u00c9\u00030\u0018\u0000\u00c3"+
		"\u00c9\u00032\u0019\u0000\u00c4\u00c9\u00038\u001c\u0000\u00c5\u00c9\u0003"+
		"4\u001a\u0000\u00c6\u00c9\u0003:\u001d\u0000\u00c7\u00c9\u0003<\u001e"+
		"\u0000\u00c8\u00b8\u0001\u0000\u0000\u0000\u00c8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00c8\u00ba\u0001\u0000\u0000\u0000\u00c8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00c8\u00bc\u0001\u0000\u0000\u0000\u00c8\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c8\u00be\u0001\u0000\u0000\u0000\u00c8\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c0\u0001\u0000\u0000\u0000\u00c8\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c8\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u0019\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005H\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0013\u0000\u0000\u00cc\u00e7\u0005\u0016\u0000\u0000"+
		"\u00cd\u00ce\u0005H\u0000\u0000\u00ce\u00cf\u0005\u0013\u0000\u0000\u00cf"+
		"\u00d0\u0005=\u0000\u0000\u00d0\u00e7\u0005\u0016\u0000\u0000\u00d1\u00d2"+
		"\u0005H\u0000\u0000\u00d2\u00d3\u0005\u0013\u0000\u0000\u00d3\u00e7\u0005"+
		"E\u0000\u0000\u00d4\u00d5\u0005H\u0000\u0000\u00d5\u00d6\u0005\u0013\u0000"+
		"\u0000\u00d6\u00d7\u0005G\u0000\u0000\u00d7\u00e7\u0005E\u0000\u0000\u00d8"+
		"\u00d9\u0005H\u0000\u0000\u00d9\u00da\u0005\u0013\u0000\u0000\u00da\u00db"+
		"\u0005G\u0000\u0000\u00db\u00e7\u0005\u0015\u0000\u0000\u00dc\u00dd\u0005"+
		"H\u0000\u0000\u00dd\u00de\u0005\u0013\u0000\u0000\u00de\u00df\u0005G\u0000"+
		"\u0000\u00df\u00e0\u0005\u0015\u0000\u0000\u00e0\u00e1\u0005>\u0000\u0000"+
		"\u00e1\u00e2\u0005\u0018\u0000\u0000\u00e2\u00e3\u0005?\u0000\u0000\u00e3"+
		"\u00e4\u0005\u0010\u0000\u0000\u00e4\u00e5\u0005\t\u0000\u0000\u00e5\u00e7"+
		"\u0005&\u0000\u0000\u00e6\u00ca\u0001\u0000\u0000\u0000\u00e6\u00cd\u0001"+
		"\u0000\u0000\u0000\u00e6\u00d1\u0001\u0000\u0000\u0000\u00e6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00d8\u0001\u0000\u0000\u0000\u00e6\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e7\u001b\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"H\u0000\u0000\u00e9\u00ea\u0005\u0018\u0000\u0000\u00ea\u00f2\u0005E\u0000"+
		"\u0000\u00eb\u00ec\u0005\u0010\u0000\u0000\u00ec\u00f0\u0005\t\u0000\u0000"+
		"\u00ed\u00f1\u0005&\u0000\u0000\u00ee\u00ef\u0005$\u0000\u0000\u00ef\u00f1"+
		"\u0005%\u0000\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00eb\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u001d\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005H\u0000\u0000\u00f5\u00f6\u0005\u0019"+
		"\u0000\u0000\u00f6\u00f7\u0005E\u0000\u0000\u00f7\u00f8\u0005\u0010\u0000"+
		"\u0000\u00f8\u0100\u0005E\u0000\u0000\u00f9\u00fa\u0005\u001c\u0000\u0000"+
		"\u00fa\u00fb\u0005\t\u0000\u0000\u00fb\u0101\u0005&\u0000\u0000\u00fc"+
		"\u00fd\u0005\u001d\u0000\u0000\u00fd\u00fe\u0005\t\u0000\u0000\u00fe\u00ff"+
		"\u0005$\u0000\u0000\u00ff\u0101\u0005%\u0000\u0000\u0100\u00f9\u0001\u0000"+
		"\u0000\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0101\u001f\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0005H\u0000\u0000\u0103\u0104\u0005\u001a\u0000"+
		"\u0000\u0104\u0105\u0005E\u0000\u0000\u0105\u0106\u0005\u0010\u0000\u0000"+
		"\u0106\u010e\u0005E\u0000\u0000\u0107\u0108\u0005\u001c\u0000\u0000\u0108"+
		"\u0109\u0005\t\u0000\u0000\u0109\u010f\u0005&\u0000\u0000\u010a\u010b"+
		"\u0005\u001d\u0000\u0000\u010b\u010c\u0005\t\u0000\u0000\u010c\u010d\u0005"+
		"$\u0000\u0000\u010d\u010f\u0005%\u0000\u0000\u010e\u0107\u0001\u0000\u0000"+
		"\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010f!\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005H\u0000\u0000\u0111\u0112\u0005D\u0000\u0000\u0112\u0113"+
		"\u0005E\u0000\u0000\u0113\u0114\u0005\u001b\u0000\u0000\u0114\u011c\u0005"+
		"F\u0000\u0000\u0115\u0116\u0005\u001c\u0000\u0000\u0116\u0117\u0005H\u0000"+
		"\u0000\u0117\u0118\u0005D\u0000\u0000\u0118\u0119\u0005E\u0000\u0000\u0119"+
		"\u011a\u0005\b\u0000\u0000\u011a\u011b\u0005G\u0000\u0000\u011b\u011d"+
		"\u0005\'\u0000\u0000\u011c\u0115\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d#\u0001\u0000\u0000\u0000\u011e\u011f\u0005P\u0000"+
		"\u0000\u011f\u0120\u0005@\u0000\u0000\u0120\u0121\u0005K\u0000\u0000\u0121"+
		"\u0122\u0005Q\u0000\u0000\u0122\u0123\u0005O\u0000\u0000\u0123\u0124\u0005"+
		"A\u0000\u0000\u0124\u0125\u0005K\u0000\u0000\u0125\u0126\u0005G\u0000"+
		"\u0000\u0126\u0127\u0005\'\u0000\u0000\u0127\u0128\u0005Q\u0000\u0000"+
		"\u0128\u0129\u0003&\u0013\u0000\u0129\u012a\u0005O\u0000\u0000\u012a\u012b"+
		"\u0005B\u0000\u0000\u012b\u012c\u0005K\u0000\u0000\u012c\u012d\u0005G"+
		"\u0000\u0000\u012d\u012e\u0005\'\u0000\u0000\u012e\u012f\u0005Q\u0000"+
		"\u0000\u012f\u0130\u0005Q\u0000\u0000\u0130%\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0005O\u0000\u0000\u0132\u0133\u0005M\u0000\u0000\u0133\u0134\u0005"+
		"C\u0000\u0000\u0134\u0135\u0005N\u0000\u0000\u0135\u0136\u0005E\u0000"+
		"\u0000\u0136\u0137\u0005K\u0000\u0000\u0137\u0138\u0005G\u0000\u0000\u0138"+
		"\u0139\u0005\'\u0000\u0000\u0139\u013a\u0005Q\u0000\u0000\u013a\'\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005H\u0000\u0000\u013c\u013d\u00056\u0000"+
		"\u0000\u013d\u013e\u0005E\u0000\u0000\u013e\u013f\u0005\u0010\u0000\u0000"+
		"\u013f\u0140\u0005\t\u0000\u0000\u0140\u0141\u0005&\u0000\u0000\u0141"+
		")\u0001\u0000\u0000\u0000\u0142\u0143\u0005H\u0000\u0000\u0143\u0144\u0005"+
		"*\u0000\u0000\u0144\u0145\u0005-\u0000\u0000\u0145\u0154\u0005+\u0000"+
		"\u0000\u0146\u0147\u0005H\u0000\u0000\u0147\u0148\u0005*\u0000\u0000\u0148"+
		"\u0149\u0005G\u0000\u0000\u0149\u014a\u0005\u0015\u0000\u0000\u014a\u014b"+
		"\u0005,\u0000\u0000\u014b\u014c\u0005-\u0000\u0000\u014c\u0154\u0005+"+
		"\u0000\u0000\u014d\u014e\u0005H\u0000\u0000\u014e\u014f\u0005*\u0000\u0000"+
		"\u014f\u0150\u0005E\u0000\u0000\u0150\u0151\u0005,\u0000\u0000\u0151\u0152"+
		"\u0005-\u0000\u0000\u0152\u0154\u0005+\u0000\u0000\u0153\u0142\u0001\u0000"+
		"\u0000\u0000\u0153\u0146\u0001\u0000\u0000\u0000\u0153\u014d\u0001\u0000"+
		"\u0000\u0000\u0154+\u0001\u0000\u0000\u0000\u0155\u0156\u0005H\u0000\u0000"+
		"\u0156\u0157\u0005(\u0000\u0000\u0157\u016c\u0005E\u0000\u0000\u0158\u0159"+
		"\u0005H\u0000\u0000\u0159\u015a\u0005(\u0000\u0000\u015a\u015b\u0005G"+
		"\u0000\u0000\u015b\u016c\u0005\u0015\u0000\u0000\u015c\u015d\u0005G\u0000"+
		"\u0000\u015d\u015e\u0005\u0015\u0000\u0000\u015e\u015f\u0005 \u0000\u0000"+
		"\u015f\u0160\u0005(\u0000\u0000\u0160\u0161\u0005.\u0000\u0000\u0161\u0162"+
		"\u0005H\u0000\u0000\u0162\u0163\u0005D\u0000\u0000\u0163\u016c\u0005E"+
		"\u0000\u0000\u0164\u0165\u0005E\u0000\u0000\u0165\u0166\u0005\u001f\u0000"+
		"\u0000\u0166\u0167\u0005(\u0000\u0000\u0167\u0168\u0005.\u0000\u0000\u0168"+
		"\u0169\u0005H\u0000\u0000\u0169\u016a\u0005D\u0000\u0000\u016a\u016c\u0005"+
		"E\u0000\u0000\u016b\u0155\u0001\u0000\u0000\u0000\u016b\u0158\u0001\u0000"+
		"\u0000\u0000\u016b\u015c\u0001\u0000\u0000\u0000\u016b\u0164\u0001\u0000"+
		"\u0000\u0000\u016c-\u0001\u0000\u0000\u0000\u016d\u016e\u0005H\u0000\u0000"+
		"\u016e\u0170\u00050\u0000\u0000\u016f\u0171\u0005=\u0000\u0000\u0170\u016f"+
		"\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u00051\u0000\u0000\u0173\u0179\u0005"+
		"\u0016\u0000\u0000\u0174\u0175\u0005H\u0000\u0000\u0175\u0176\u00050\u0000"+
		"\u0000\u0176\u0177\u0005G\u0000\u0000\u0177\u0179\u00052\u0000\u0000\u0178"+
		"\u016d\u0001\u0000\u0000\u0000\u0178\u0174\u0001\u0000\u0000\u0000\u0179"+
		"/\u0001\u0000\u0000\u0000\u017a\u017b\u0005H\u0000\u0000\u017b\u017c\u0005"+
		"/\u0000\u0000\u017c\u017d\u0005H\u0000\u0000\u017d\u017e\u0005D\u0000"+
		"\u0000\u017e\u017f\u0005E\u0000\u0000\u017f\u0180\u0005\u0010\u0000\u0000"+
		"\u0180\u0181\u0005-\u0000\u0000\u0181\u0182\u0005\u0017\u0000\u0000\u0182"+
		"1\u0001\u0000\u0000\u0000\u0183\u0184\u0005H\u0000\u0000\u0184\u0185\u0005"+
		"D\u0000\u0000\u0185\u0186\u0005E\u0000\u0000\u0186\u0187\u0005!\u0000"+
		"\u0000\u0187\u0188\u0005\"\u0000\u0000\u0188\u0189\u0005\u001d\u0000\u0000"+
		"\u0189\u018a\u0005\t\u0000\u0000\u018a\u018b\u0005$\u0000\u0000\u018b"+
		"\u018c\u0005%\u0000\u0000\u018c3\u0001\u0000\u0000\u0000\u018d\u018e\u0005"+
		"H\u0000\u0000\u018e\u018f\u0005D\u0000\u0000\u018f\u0190\u0005E\u0000"+
		"\u0000\u0190\u0191\u0005\u001f\u0000\u0000\u0191\u0192\u00053\u0000\u0000"+
		"\u0192\u0193\u00054\u0000\u0000\u01935\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0005=\u0000\u0000\u0195\u0196\u0005\u0016\u0000\u0000\u0196\u0197\u0005"+
		"\u001f\u0000\u0000\u0197\u0198\u0005\u0003\u0000\u0000\u0198\u0199\u0005"+
		"\u0010\u0000\u0000\u0199\u019a\u0005H\u0000\u0000\u019a\u019b\u0005D\u0000"+
		"\u0000\u019b\u01a4\u0005\u0017\u0000\u0000\u019c\u019d\u0005E\u0000\u0000"+
		"\u019d\u019e\u0005\u001f\u0000\u0000\u019e\u019f\u0005\u0003\u0000\u0000"+
		"\u019f\u01a0\u0005\u0010\u0000\u0000\u01a0\u01a1\u0005H\u0000\u0000\u01a1"+
		"\u01a2\u0005D\u0000\u0000\u01a2\u01a4\u0005\u0017\u0000\u0000\u01a3\u0194"+
		"\u0001\u0000\u0000\u0000\u01a3\u019c\u0001\u0000\u0000\u0000\u01a47\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0005H\u0000\u0000\u01a6\u01a7\u0005D\u0000"+
		"\u0000\u01a7\u01a8\u0005E\u0000\u0000\u01a8\u01a9\u0005\u001f\u0000\u0000"+
		"\u01a9\u01aa\u00055\u0000\u0000\u01aa\u01ab\u0005\u001e\u0000\u0000\u01ab"+
		"\u01ac\u0005H\u0000\u0000\u01ac\u01ad\u0005D\u0000\u0000\u01ad\u01ae\u0005"+
		"E\u0000\u0000\u01ae\u01af\u0005\u0010\u0000\u0000\u01af\u01b0\u0005#\u0000"+
		"\u0000\u01b0\u01b1\u0005\t\u0000\u0000\u01b1\u01b2\u0005$\u0000\u0000"+
		"\u01b2\u01b3\u0005\u0002\u0000\u0000\u01b39\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0005H\u0000\u0000\u01b5\u01b6\u0005D\u0000\u0000\u01b6\u01b7\u0005"+
		"E\u0000\u0000\u01b7\u01b8\u00050\u0000\u0000\u01b8\u01b9\u0005G\u0000"+
		"\u0000\u01b9\u01ba\u0005\'\u0000\u0000\u01ba;\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0005H\u0000\u0000\u01bc\u01bd\u00057\u0000\u0000\u01bd\u01be"+
		"\u0005-\u0000\u0000\u01be\u01bf\u0005\u0001\u0000\u0000\u01bf=\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0005;\u0000\u0000\u01c1\u01c2\u00052\u0000\u0000"+
		"\u01c2\u01c3\u0005<\u0000\u0000\u01c3\u01c4\u0005I\u0000\u0000\u01c4\u01c5"+
		"\u0005H\u0000\u0000\u01c5\u01c6\u0005:\u0000\u0000\u01c6\u01ce\u0005I"+
		"\u0000\u0000\u01c7\u01c8\u00058\u0000\u0000\u01c8\u01c9\u00059\u0000\u0000"+
		"\u01c9\u01ca\u0005I\u0000\u0000\u01ca\u01cb\u0005H\u0000\u0000\u01cb\u01cc"+
		"\u0005:\u0000\u0000\u01cc\u01ce\u0005I\u0000\u0000\u01cd\u01c0\u0001\u0000"+
		"\u0000\u0000\u01cd\u01c7\u0001\u0000\u0000\u0000\u01ce?\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d0\u0005O\u0000\u0000\u01d0\u01d5\u0005E\u0000\u0000\u01d1"+
		"\u01d2\u0005J\u0000\u0000\u01d2\u01d4\u0005E\u0000\u0000\u01d3\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005"+
		"Q\u0000\u0000\u01d9A\u0001\u0000\u0000\u0000\u0018GRZ\u0082\u008b\u0095"+
		"\u00a1\u00a9\u00ab\u00b5\u00c8\u00e6\u00f0\u00f2\u0100\u010e\u011c\u0153"+
		"\u016b\u0170\u0178\u01a3\u01cd\u01d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}