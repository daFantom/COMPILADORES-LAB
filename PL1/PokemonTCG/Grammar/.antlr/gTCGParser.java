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
		RULE_initialPokemon = 8, RULE_turn = 9, RULE_turnAction = 10, RULE_drawAction = 11, 
		RULE_playAction = 12, RULE_attachAction = 13, RULE_evolveAction = 14, 
		RULE_attackAction = 15, RULE_damageBreakdown = 16, RULE_damageBonusLine = 17, 
		RULE_retreatAction = 18, RULE_shuffleAction = 19, RULE_discardAction = 20, 
		RULE_prizeAction = 21, RULE_moveToHandAction = 22, RULE_activeSpotAction = 23, 
		RULE_knockoutAction = 24, RULE_cardMovedAction = 25, RULE_subAction = 26, 
		RULE_subActionBody = 27, RULE_endTurn = 28, RULE_gameEnd = 29, RULE_cardList = 30, 
		RULE_cardListItem = 31, RULE_attack = 32, RULE_cardAddedToHand = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"log", "setup", "setupAction", "coinChoice", "coinToss", "firstPlayer", 
			"openingHand", "drawnCards", "initialPokemon", "turn", "turnAction", 
			"drawAction", "playAction", "attachAction", "evolveAction", "attackAction", 
			"damageBreakdown", "damageBonusLine", "retreatAction", "shuffleAction", 
			"discardAction", "prizeAction", "moveToHandAction", "activeSpotAction", 
			"knockoutAction", "cardMovedAction", "subAction", "subActionBody", "endTurn", 
			"gameEnd", "cardList", "cardListItem", "attack", "cardAddedToHand"
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
			setState(68);
			setup();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(69);
				match(NEWLINE);
				setState(70);
				turn();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			gameEnd();
			setState(77);
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
			setState(79);
			match(SETUP);
			setState(80);
			match(NEWLINE);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLAYER) {
				{
				{
				setState(81);
				setupAction();
				}
				}
				setState(86);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				coinChoice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				coinToss();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				firstPlayer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				openingHand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
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
			setState(94);
			match(PLAYER);
			setState(95);
			match(CHOSE);
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(97);
			match(FOR);
			setState(98);
			match(THE);
			setState(99);
			match(OPENING);
			setState(100);
			match(COIN);
			setState(101);
			match(FLIP);
			setState(102);
			match(DOT);
			setState(103);
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
			setState(105);
			match(PLAYER);
			setState(106);
			match(WON);
			setState(107);
			match(THE);
			setState(108);
			match(COIN);
			setState(109);
			match(TOSS);
			setState(110);
			match(DOT);
			setState(111);
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
			setState(113);
			match(PLAYER);
			setState(114);
			match(DECIDED);
			setState(115);
			match(TO);
			setState(116);
			match(GO);
			setState(117);
			match(FIRST);
			setState(118);
			match(DOT);
			setState(119);
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
			setState(121);
			match(PLAYER);
			setState(122);
			match(DREW);
			setState(123);
			match(NUMBER);
			setState(124);
			match(CARDS);
			setState(125);
			match(FOR);
			setState(126);
			match(THE);
			setState(127);
			match(OPENING);
			setState(128);
			match(HAND);
			setState(129);
			match(DOT);
			setState(130);
			match(NEWLINE);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HYPHEN) {
				{
				setState(131);
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
			setState(134);
			match(HYPHEN);
			setState(135);
			match(NUMBER);
			setState(136);
			match(DRAWN);
			setState(137);
			match(CARDS);
			setState(138);
			match(DOT);
			setState(139);
			match(NEWLINE);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(140);
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
			setState(143);
			match(PLAYER);
			setState(144);
			match(PLAYED);
			setState(145);
			match(CARD);
			setState(146);
			match(TO);
			setState(147);
			match(THE);
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIVE:
				{
				setState(148);
				match(ACTIVE);
				setState(149);
				match(SPOT);
				}
				break;
			case BENCH:
				{
				setState(150);
				match(BENCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(153);
			match(DOT);
			setState(154);
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
		public List<TurnActionContext> turnAction() {
			return getRuleContexts(TurnActionContext.class);
		}
		public TurnActionContext turnAction(int i) {
			return getRuleContext(TurnActionContext.class,i);
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
			setState(156);
			match(PLAYER);
			setState(157);
			match(POSSESSIVE);
			setState(158);
			match(TURN);
			setState(159);
			match(NEWLINE);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 527617L) != 0)) {
				{
				{
				setState(160);
				turnAction();
				}
				}
				setState(165);
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
	public static class TurnActionContext extends ParserRuleContext {
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
		public KnockoutActionContext knockoutAction() {
			return getRuleContext(KnockoutActionContext.class,0);
		}
		public SubActionContext subAction() {
			return getRuleContext(SubActionContext.class,0);
		}
		public EndTurnContext endTurn() {
			return getRuleContext(EndTurnContext.class,0);
		}
		public TurnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnAction; }
	}

	public final TurnActionContext turnAction() throws RecognitionException {
		TurnActionContext _localctx = new TurnActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_turnAction);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				drawAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				playAction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				attachAction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				evolveAction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				attackAction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				retreatAction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				shuffleAction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				cardMovedAction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(174);
				discardAction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(175);
				prizeAction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(176);
				moveToHandAction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(177);
				activeSpotAction();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(178);
				knockoutAction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(179);
				subAction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(180);
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
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode A_SOMETHING() { return getToken(gTCGParser.A_SOMETHING, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public List<SubActionContext> subAction() {
			return getRuleContexts(SubActionContext.class);
		}
		public SubActionContext subAction(int i) {
			return getRuleContext(SubActionContext.class,i);
		}
		public DrawActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawAction; }
	}

	public final DrawActionContext drawAction() throws RecognitionException {
		DrawActionContext _localctx = new DrawActionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_drawAction);
		try {
			int _alt;
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(PLAYER);
				setState(184);
				match(DREW);
				setState(185);
				match(CARD_WORD);
				setState(186);
				match(DOT);
				setState(187);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(PLAYER);
				setState(189);
				match(DREW);
				setState(190);
				match(A_SOMETHING);
				setState(191);
				match(CARD_WORD);
				setState(192);
				match(DOT);
				setState(193);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(PLAYER);
				setState(195);
				match(DREW);
				setState(196);
				match(CARD);
				setState(197);
				match(DOT);
				setState(198);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(PLAYER);
				setState(200);
				match(DREW);
				setState(201);
				match(NUMBER);
				setState(202);
				match(CARDS);
				setState(203);
				match(DOT);
				setState(204);
				match(NEWLINE);
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(205);
						subAction();
						}
						} 
					}
					setState(210);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
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
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public List<SubActionContext> subAction() {
			return getRuleContexts(SubActionContext.class);
		}
		public SubActionContext subAction(int i) {
			return getRuleContext(SubActionContext.class,i);
		}
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
		enterRule(_localctx, 24, RULE_playAction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(PLAYER);
			setState(214);
			match(PLAYED);
			setState(215);
			match(CARD);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(216);
				match(TO);
				setState(217);
				match(THE);
				setState(221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(218);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(219);
					match(ACTIVE);
					setState(220);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(225);
			match(DOT);
			setState(226);
			match(NEWLINE);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					subAction();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
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
		enterRule(_localctx, 26, RULE_attachAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(PLAYER);
			setState(234);
			match(ATTACHED);
			setState(235);
			match(CARD);
			setState(236);
			match(TO);
			setState(237);
			match(CARD);
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(238);
				match(ON);
				setState(239);
				match(THE);
				setState(240);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(241);
				match(IN);
				setState(242);
				match(THE);
				setState(243);
				match(ACTIVE);
				setState(244);
				match(SPOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(247);
			match(DOT);
			setState(248);
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
	public static class EvolveActionContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode EVOLVED() { return getToken(gTCGParser.EVOLVED, 0); }
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
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
		enterRule(_localctx, 28, RULE_evolveAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(PLAYER);
			setState(251);
			match(EVOLVED);
			setState(252);
			match(CARD);
			setState(253);
			match(TO);
			setState(254);
			match(CARD);
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(255);
				match(ON);
				setState(256);
				match(THE);
				setState(257);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(258);
				match(IN);
				setState(259);
				match(THE);
				setState(260);
				match(ACTIVE);
				setState(261);
				match(SPOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264);
			match(DOT);
			setState(265);
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
		public AttackContext attack() {
			return getRuleContext(AttackContext.class,0);
		}
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode ON() { return getToken(gTCGParser.ON, 0); }
		public TerminalNode FOR() { return getToken(gTCGParser.FOR, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public DamageBreakdownContext damageBreakdown() {
			return getRuleContext(DamageBreakdownContext.class,0);
		}
		public List<SubActionContext> subAction() {
			return getRuleContexts(SubActionContext.class);
		}
		public SubActionContext subAction(int i) {
			return getRuleContext(SubActionContext.class,i);
		}
		public AttackActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attackAction; }
	}

	public final AttackActionContext attackAction() throws RecognitionException {
		AttackActionContext _localctx = new AttackActionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attackAction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(PLAYER);
			setState(268);
			match(POSSESSIVE);
			setState(269);
			match(CARD);
			setState(270);
			match(USED);
			setState(271);
			attack();
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(272);
				match(DOT);
				setState(273);
				match(NEWLINE);
				}
				break;
			case ON:
				{
				setState(274);
				match(ON);
				setState(275);
				match(PLAYER);
				setState(276);
				match(POSSESSIVE);
				setState(277);
				match(CARD);
				setState(278);
				match(FOR);
				setState(279);
				match(NUMBER);
				setState(280);
				match(DAMAGE);
				setState(281);
				match(DOT);
				setState(282);
				match(NEWLINE);
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(283);
					damageBreakdown();
					}
					break;
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(286);
						subAction();
						}
						} 
					}
					setState(291);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
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
		enterRule(_localctx, 32, RULE_damageBreakdown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(HYPHEN);
			setState(295);
			match(DAMAGE_BREAKDOWN);
			setState(296);
			match(COLON);
			setState(297);
			match(NEWLINE);
			setState(298);
			match(BULLET);
			setState(299);
			match(BASE_DAMAGE);
			setState(300);
			match(COLON);
			setState(301);
			match(NUMBER);
			setState(302);
			match(DAMAGE);
			setState(303);
			match(NEWLINE);
			setState(304);
			damageBonusLine();
			setState(305);
			match(BULLET);
			setState(306);
			match(TOTAL_DAMAGE);
			setState(307);
			match(COLON);
			setState(308);
			match(NUMBER);
			setState(309);
			match(DAMAGE);
			setState(310);
			match(NEWLINE);
			setState(311);
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
		enterRule(_localctx, 34, RULE_damageBonusLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(BULLET);
			setState(314);
			match(LPAREN);
			setState(315);
			match(ITEM);
			setState(316);
			match(RPAREN);
			setState(317);
			match(CARD);
			setState(318);
			match(COLON);
			setState(319);
			match(NUMBER);
			setState(320);
			match(DAMAGE);
			setState(321);
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
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public List<SubActionContext> subAction() {
			return getRuleContexts(SubActionContext.class);
		}
		public SubActionContext subAction(int i) {
			return getRuleContext(SubActionContext.class,i);
		}
		public RetreatActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retreatAction; }
	}

	public final RetreatActionContext retreatAction() throws RecognitionException {
		RetreatActionContext _localctx = new RetreatActionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_retreatAction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(PLAYER);
			setState(324);
			match(RETIRED);
			setState(325);
			match(CARD);
			setState(326);
			match(TO);
			setState(327);
			match(THE);
			setState(328);
			match(BENCH);
			setState(329);
			match(DOT);
			setState(330);
			match(NEWLINE);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331);
					subAction();
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
	public static class ShuffleActionContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode SHUFFLED() { return getToken(gTCGParser.SHUFFLED, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public TerminalNode DECK() { return getToken(gTCGParser.DECK, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
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
		enterRule(_localctx, 38, RULE_shuffleAction);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(PLAYER);
				setState(338);
				match(SHUFFLED);
				setState(339);
				match(THEIR);
				setState(340);
				match(DECK);
				setState(341);
				match(DOT);
				setState(342);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(PLAYER);
				setState(344);
				match(SHUFFLED);
				setState(345);
				match(NUMBER);
				setState(346);
				match(CARDS);
				setState(347);
				match(INTO);
				setState(348);
				match(THEIR);
				setState(349);
				match(DECK);
				setState(350);
				match(DOT);
				setState(351);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(PLAYER);
				setState(353);
				match(SHUFFLED);
				setState(354);
				match(CARD);
				setState(355);
				match(INTO);
				setState(356);
				match(THEIR);
				setState(357);
				match(DECK);
				setState(358);
				match(DOT);
				setState(359);
				match(NEWLINE);
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
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public CardListContext cardList() {
			return getRuleContext(CardListContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_discardAction);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(PLAYER);
				setState(363);
				match(DISCARDED);
				setState(364);
				match(CARD);
				setState(365);
				match(DOT);
				setState(366);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(PLAYER);
				setState(368);
				match(DISCARDED);
				setState(369);
				match(NUMBER);
				setState(370);
				match(CARDS);
				setState(371);
				match(DOT);
				setState(372);
				match(NEWLINE);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BULLET) {
					{
					setState(373);
					cardList();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(NUMBER);
				setState(377);
				match(CARDS);
				setState(378);
				match(WERE);
				setState(379);
				match(DISCARDED);
				setState(380);
				match(FROM);
				setState(381);
				match(PLAYER);
				setState(382);
				match(POSSESSIVE);
				setState(383);
				match(CARD);
				setState(384);
				match(DOT);
				setState(385);
				match(NEWLINE);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BULLET) {
					{
					setState(386);
					cardList();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				match(CARD);
				setState(390);
				match(WAS);
				setState(391);
				match(DISCARDED);
				setState(392);
				match(FROM);
				setState(393);
				match(PLAYER);
				setState(394);
				match(POSSESSIVE);
				setState(395);
				match(CARD);
				setState(396);
				match(DOT);
				setState(397);
				match(NEWLINE);
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
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
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
		enterRule(_localctx, 42, RULE_prizeAction);
		int _la;
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(PLAYER);
				setState(401);
				match(TAKE);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==A_SOMETHING) {
					{
					setState(402);
					match(A_SOMETHING);
					}
				}

				setState(405);
				match(PRIZE);
				setState(406);
				match(CARD_WORD);
				setState(407);
				match(DOT);
				setState(408);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(PLAYER);
				setState(410);
				match(TAKE);
				setState(411);
				match(NUMBER);
				setState(412);
				match(PRIZE_CARDS);
				setState(413);
				match(DOT);
				setState(414);
				match(NEWLINE);
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
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public MoveToHandActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveToHandAction; }
	}

	public final MoveToHandActionContext moveToHandAction() throws RecognitionException {
		MoveToHandActionContext _localctx = new MoveToHandActionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_moveToHandAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(PLAYER);
			setState(418);
			match(MOVED);
			setState(419);
			match(PLAYER);
			setState(420);
			match(POSSESSIVE);
			setState(421);
			match(CARD);
			setState(422);
			match(TO);
			setState(423);
			match(THEIR);
			setState(424);
			match(HAND);
			setState(425);
			match(DOT);
			setState(426);
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
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public ActiveSpotActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activeSpotAction; }
	}

	public final ActiveSpotActionContext activeSpotAction() throws RecognitionException {
		ActiveSpotActionContext _localctx = new ActiveSpotActionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_activeSpotAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(PLAYER);
			setState(429);
			match(POSSESSIVE);
			setState(430);
			match(CARD);
			setState(431);
			match(IS);
			setState(432);
			match(NOW);
			setState(433);
			match(IN);
			setState(434);
			match(THE);
			setState(435);
			match(ACTIVE);
			setState(436);
			match(SPOT);
			setState(437);
			match(DOT);
			setState(438);
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
	public static class KnockoutActionContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode WAS() { return getToken(gTCGParser.WAS, 0); }
		public TerminalNode KNOCKED() { return getToken(gTCGParser.KNOCKED, 0); }
		public TerminalNode OUT() { return getToken(gTCGParser.OUT, 0); }
		public TerminalNode EXCLAMATION() { return getToken(gTCGParser.EXCLAMATION, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public KnockoutActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knockoutAction; }
	}

	public final KnockoutActionContext knockoutAction() throws RecognitionException {
		KnockoutActionContext _localctx = new KnockoutActionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_knockoutAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(PLAYER);
			setState(441);
			match(POSSESSIVE);
			setState(442);
			match(CARD);
			setState(443);
			match(WAS);
			setState(444);
			match(KNOCKED);
			setState(445);
			match(OUT);
			setState(446);
			match(EXCLAMATION);
			setState(447);
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
	public static class CardMovedActionContext extends ParserRuleContext {
		public TerminalNode A_SOMETHING() { return getToken(gTCGParser.A_SOMETHING, 0); }
		public TerminalNode CARD_WORD() { return getToken(gTCGParser.CARD_WORD, 0); }
		public TerminalNode WAS() { return getToken(gTCGParser.WAS, 0); }
		public TerminalNode ADDED() { return getToken(gTCGParser.ADDED, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode HAND() { return getToken(gTCGParser.HAND, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public CardMovedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardMovedAction; }
	}

	public final CardMovedActionContext cardMovedAction() throws RecognitionException {
		CardMovedActionContext _localctx = new CardMovedActionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cardMovedAction);
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_SOMETHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(A_SOMETHING);
				setState(450);
				match(CARD_WORD);
				setState(451);
				match(WAS);
				setState(452);
				match(ADDED);
				setState(453);
				match(TO);
				setState(454);
				match(PLAYER);
				setState(455);
				match(POSSESSIVE);
				setState(456);
				match(HAND);
				setState(457);
				match(DOT);
				setState(458);
				match(NEWLINE);
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(CARD);
				setState(460);
				match(WAS);
				setState(461);
				match(ADDED);
				setState(462);
				match(TO);
				setState(463);
				match(PLAYER);
				setState(464);
				match(POSSESSIVE);
				setState(465);
				match(HAND);
				setState(466);
				match(DOT);
				setState(467);
				match(NEWLINE);
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
	public static class SubActionContext extends ParserRuleContext {
		public TerminalNode HYPHEN() { return getToken(gTCGParser.HYPHEN, 0); }
		public SubActionBodyContext subActionBody() {
			return getRuleContext(SubActionBodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public List<CardListContext> cardList() {
			return getRuleContexts(CardListContext.class);
		}
		public CardListContext cardList(int i) {
			return getRuleContext(CardListContext.class,i);
		}
		public SubActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAction; }
	}

	public final SubActionContext subAction() throws RecognitionException {
		SubActionContext _localctx = new SubActionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_subAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(HYPHEN);
			setState(471);
			subActionBody();
			setState(472);
			match(DOT);
			setState(473);
			match(NEWLINE);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BULLET) {
				{
				{
				setState(474);
				cardList();
				}
				}
				setState(479);
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
	public static class SubActionBodyContext extends ParserRuleContext {
		public List<TerminalNode> PLAYER() { return getTokens(gTCGParser.PLAYER); }
		public TerminalNode PLAYER(int i) {
			return getToken(gTCGParser.PLAYER, i);
		}
		public TerminalNode DREW() { return getToken(gTCGParser.DREW, 0); }
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
		public TerminalNode A_SOMETHING() { return getToken(gTCGParser.A_SOMETHING, 0); }
		public TerminalNode CARD_WORD() { return getToken(gTCGParser.CARD_WORD, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public TerminalNode AND() { return getToken(gTCGParser.AND, 0); }
		public TerminalNode PLAYED() { return getToken(gTCGParser.PLAYED, 0); }
		public TerminalNode THEM() { return getToken(gTCGParser.THEM, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(gTCGParser.BENCH, 0); }
		public TerminalNode SHUFFLED() { return getToken(gTCGParser.SHUFFLED, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public TerminalNode DECK() { return getToken(gTCGParser.DECK, 0); }
		public TerminalNode INTO() { return getToken(gTCGParser.INTO, 0); }
		public TerminalNode DISCARDED() { return getToken(gTCGParser.DISCARDED, 0); }
		public TerminalNode WERE() { return getToken(gTCGParser.WERE, 0); }
		public TerminalNode FROM() { return getToken(gTCGParser.FROM, 0); }
		public List<TerminalNode> POSSESSIVE() { return getTokens(gTCGParser.POSSESSIVE); }
		public TerminalNode POSSESSIVE(int i) {
			return getToken(gTCGParser.POSSESSIVE, i);
		}
		public TerminalNode WAS() { return getToken(gTCGParser.WAS, 0); }
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public TerminalNode PRIZE() { return getToken(gTCGParser.PRIZE, 0); }
		public TerminalNode MOVED() { return getToken(gTCGParser.MOVED, 0); }
		public TerminalNode HAND() { return getToken(gTCGParser.HAND, 0); }
		public TerminalNode SWITCHED() { return getToken(gTCGParser.SWITCHED, 0); }
		public TerminalNode WITH() { return getToken(gTCGParser.WITH, 0); }
		public TerminalNode BECOME() { return getToken(gTCGParser.BECOME, 0); }
		public TerminalNode ACTIVE() { return getToken(gTCGParser.ACTIVE, 0); }
		public TerminalNode POKEMON() { return getToken(gTCGParser.POKEMON, 0); }
		public TerminalNode ATTACHED() { return getToken(gTCGParser.ATTACHED, 0); }
		public TerminalNode ON() { return getToken(gTCGParser.ON, 0); }
		public TerminalNode IN() { return getToken(gTCGParser.IN, 0); }
		public TerminalNode SPOT() { return getToken(gTCGParser.SPOT, 0); }
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public TerminalNode EVOLVED() { return getToken(gTCGParser.EVOLVED, 0); }
		public CardAddedToHandContext cardAddedToHand() {
			return getRuleContext(CardAddedToHandContext.class,0);
		}
		public SubActionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subActionBody; }
	}

	public final SubActionBodyContext subActionBody() throws RecognitionException {
		SubActionBodyContext _localctx = new SubActionBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_subActionBody);
		try {
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(PLAYER);
				setState(481);
				match(DREW);
				setState(482);
				match(CARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				match(PLAYER);
				setState(484);
				match(DREW);
				setState(485);
				match(A_SOMETHING);
				setState(486);
				match(CARD_WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(PLAYER);
				setState(488);
				match(DREW);
				setState(489);
				match(NUMBER);
				setState(490);
				match(CARDS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				match(PLAYER);
				setState(492);
				match(DREW);
				setState(493);
				match(NUMBER);
				setState(494);
				match(CARDS);
				setState(495);
				match(AND);
				setState(496);
				match(PLAYED);
				setState(497);
				match(THEM);
				setState(498);
				match(TO);
				setState(499);
				match(THE);
				setState(500);
				match(BENCH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				match(PLAYER);
				setState(502);
				match(SHUFFLED);
				setState(503);
				match(THEIR);
				setState(504);
				match(DECK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(505);
				match(PLAYER);
				setState(506);
				match(SHUFFLED);
				setState(507);
				match(NUMBER);
				setState(508);
				match(CARDS);
				setState(509);
				match(INTO);
				setState(510);
				match(THEIR);
				setState(511);
				match(DECK);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(512);
				match(PLAYER);
				setState(513);
				match(SHUFFLED);
				setState(514);
				match(CARD);
				setState(515);
				match(INTO);
				setState(516);
				match(THEIR);
				setState(517);
				match(DECK);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(518);
				match(PLAYER);
				setState(519);
				match(DISCARDED);
				setState(520);
				match(CARD);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(521);
				match(PLAYER);
				setState(522);
				match(DISCARDED);
				setState(523);
				match(NUMBER);
				setState(524);
				match(CARDS);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(525);
				match(NUMBER);
				setState(526);
				match(CARDS);
				setState(527);
				match(WERE);
				setState(528);
				match(DISCARDED);
				setState(529);
				match(FROM);
				setState(530);
				match(PLAYER);
				setState(531);
				match(POSSESSIVE);
				setState(532);
				match(CARD);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(533);
				match(CARD);
				setState(534);
				match(WAS);
				setState(535);
				match(DISCARDED);
				setState(536);
				match(FROM);
				setState(537);
				match(PLAYER);
				setState(538);
				match(POSSESSIVE);
				setState(539);
				match(CARD);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(540);
				match(PLAYER);
				setState(541);
				match(TAKE);
				setState(542);
				match(PRIZE);
				setState(543);
				match(CARD);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(544);
				match(PLAYER);
				setState(545);
				match(TAKE);
				setState(546);
				match(NUMBER);
				setState(547);
				match(PRIZE);
				setState(548);
				match(CARDS);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(549);
				match(PLAYER);
				setState(550);
				match(MOVED);
				setState(551);
				match(PLAYER);
				setState(552);
				match(POSSESSIVE);
				setState(553);
				match(CARD);
				setState(554);
				match(TO);
				setState(555);
				match(THEIR);
				setState(556);
				match(HAND);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(557);
				match(PLAYER);
				setState(558);
				match(POSSESSIVE);
				setState(559);
				match(CARD);
				setState(560);
				match(WAS);
				setState(561);
				match(SWITCHED);
				setState(562);
				match(WITH);
				setState(563);
				match(PLAYER);
				setState(564);
				match(POSSESSIVE);
				setState(565);
				match(CARD);
				setState(566);
				match(TO);
				setState(567);
				match(BECOME);
				setState(568);
				match(THE);
				setState(569);
				match(ACTIVE);
				setState(570);
				match(POKEMON);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(571);
				match(PLAYER);
				setState(572);
				match(ATTACHED);
				setState(573);
				match(CARD);
				setState(574);
				match(TO);
				setState(575);
				match(CARD);
				setState(576);
				match(ON);
				setState(577);
				match(THE);
				setState(578);
				match(BENCH);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(579);
				match(PLAYER);
				setState(580);
				match(ATTACHED);
				setState(581);
				match(CARD);
				setState(582);
				match(TO);
				setState(583);
				match(CARD);
				setState(584);
				match(IN);
				setState(585);
				match(THE);
				setState(586);
				match(ACTIVE);
				setState(587);
				match(SPOT);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(588);
				match(PLAYER);
				setState(589);
				match(POSSESSIVE);
				setState(590);
				match(CARD);
				setState(591);
				match(TAKE);
				setState(592);
				match(NUMBER);
				setState(593);
				match(DAMAGE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(594);
				match(PLAYER);
				setState(595);
				match(EVOLVED);
				setState(596);
				match(CARD);
				setState(597);
				match(TO);
				setState(598);
				match(CARD);
				setState(599);
				match(IN);
				setState(600);
				match(THE);
				setState(601);
				match(ACTIVE);
				setState(602);
				match(SPOT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(603);
				cardAddedToHand();
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
	public static class EndTurnContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode ENDED() { return getToken(gTCGParser.ENDED, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public TerminalNode TURN() { return getToken(gTCGParser.TURN, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public EndTurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTurn; }
	}

	public final EndTurnContext endTurn() throws RecognitionException {
		EndTurnContext _localctx = new EndTurnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_endTurn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(PLAYER);
			setState(607);
			match(ENDED);
			setState(608);
			match(THEIR);
			setState(609);
			match(TURN);
			setState(610);
			match(DOT);
			setState(611);
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
		enterRule(_localctx, 58, RULE_gameEnd);
		try {
			setState(626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				match(ALL);
				setState(614);
				match(PRIZE_CARDS);
				setState(615);
				match(TAKEN);
				setState(616);
				match(DOT);
				setState(617);
				match(PLAYER);
				setState(618);
				match(WINS);
				setState(619);
				match(DOT);
				}
				break;
			case OPPONENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				match(OPPONENT);
				setState(621);
				match(CONCEDED);
				setState(622);
				match(DOT);
				setState(623);
				match(PLAYER);
				setState(624);
				match(WINS);
				setState(625);
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
		public List<CardListItemContext> cardListItem() {
			return getRuleContexts(CardListItemContext.class);
		}
		public CardListItemContext cardListItem(int i) {
			return getRuleContext(CardListItemContext.class,i);
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
		enterRule(_localctx, 60, RULE_cardList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(BULLET);
			setState(629);
			cardListItem();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(630);
				match(COMMA);
				setState(631);
				cardListItem();
				}
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(637);
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
	public static class CardListItemContext extends ParserRuleContext {
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public CardListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardListItem; }
	}

	public final CardListItemContext cardListItem() throws RecognitionException {
		CardListItemContext _localctx = new CardListItemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cardListItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
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
	public static class AttackContext extends ParserRuleContext {
		public TerminalNode ATTACK() { return getToken(gTCGParser.ATTACK, 0); }
		public AttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attack; }
	}

	public final AttackContext attack() throws RecognitionException {
		AttackContext _localctx = new AttackContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_attack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
	public static class CardAddedToHandContext extends ParserRuleContext {
		public TerminalNode ADDED() { return getToken(gTCGParser.ADDED, 0); }
		public CardAddedToHandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardAddedToHand; }
	}

	public final CardAddedToHandContext cardAddedToHand() throws RecognitionException {
		CardAddedToHandContext _localctx = new CardAddedToHandContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cardAddedToHand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(ADDED);
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
		"\u0004\u0001R\u0286\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001S\b\u0001\n\u0001\f\u0001V\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002]\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0085\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008e\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0098"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00a2\b\t\n\t\f\t\u00a5\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00b6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00cf\b\u000b\n\u000b\f\u000b\u00d2\t\u000b"+
		"\u0003\u000b\u00d4\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00de\b\f\u0003\f\u00e0\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u00e5\b\f\n\f\f\f\u00e8\t\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00f6\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0107\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u011d\b\u000f\u0001\u000f\u0005\u000f\u0120\b"+
		"\u000f\n\u000f\f\u000f\u0123\t\u000f\u0003\u000f\u0125\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u014d\b\u0012\n\u0012\f\u0012\u0150\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0169"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0177\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0184\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u018f\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0194\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01a0\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01d5"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u01dc\b\u001a\n\u001a\f\u001a\u01df\t\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u025d\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0273\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u0279\b\u001e\n\u001e\f\u001e\u027c\t\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0000"+
		"\u0000\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0001\u0001\u0000\u0006\u0007"+
		"\u02a8\u0000D\u0001\u0000\u0000\u0000\u0002O\u0001\u0000\u0000\u0000\u0004"+
		"\\\u0001\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000\bi\u0001\u0000"+
		"\u0000\u0000\nq\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000\u000e"+
		"\u0086\u0001\u0000\u0000\u0000\u0010\u008f\u0001\u0000\u0000\u0000\u0012"+
		"\u009c\u0001\u0000\u0000\u0000\u0014\u00b5\u0001\u0000\u0000\u0000\u0016"+
		"\u00d3\u0001\u0000\u0000\u0000\u0018\u00d5\u0001\u0000\u0000\u0000\u001a"+
		"\u00e9\u0001\u0000\u0000\u0000\u001c\u00fa\u0001\u0000\u0000\u0000\u001e"+
		"\u010b\u0001\u0000\u0000\u0000 \u0126\u0001\u0000\u0000\u0000\"\u0139"+
		"\u0001\u0000\u0000\u0000$\u0143\u0001\u0000\u0000\u0000&\u0168\u0001\u0000"+
		"\u0000\u0000(\u018e\u0001\u0000\u0000\u0000*\u019f\u0001\u0000\u0000\u0000"+
		",\u01a1\u0001\u0000\u0000\u0000.\u01ac\u0001\u0000\u0000\u00000\u01b8"+
		"\u0001\u0000\u0000\u00002\u01d4\u0001\u0000\u0000\u00004\u01d6\u0001\u0000"+
		"\u0000\u00006\u025c\u0001\u0000\u0000\u00008\u025e\u0001\u0000\u0000\u0000"+
		":\u0272\u0001\u0000\u0000\u0000<\u0274\u0001\u0000\u0000\u0000>\u027f"+
		"\u0001\u0000\u0000\u0000@\u0281\u0001\u0000\u0000\u0000B\u0283\u0001\u0000"+
		"\u0000\u0000DI\u0003\u0002\u0001\u0000EF\u0005Q\u0000\u0000FH\u0003\u0012"+
		"\t\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LM\u0003:\u001d\u0000MN\u0005\u0000\u0000\u0001N\u0001"+
		"\u0001\u0000\u0000\u0000OP\u0005\u0004\u0000\u0000PT\u0005Q\u0000\u0000"+
		"QS\u0003\u0004\u0002\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0003\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000W]\u0003\u0006\u0003\u0000"+
		"X]\u0003\b\u0004\u0000Y]\u0003\n\u0005\u0000Z]\u0003\f\u0006\u0000[]\u0003"+
		"\u0010\b\u0000\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000\\"+
		"Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]\u0005\u0001\u0000\u0000\u0000^_\u0005H\u0000\u0000_`\u0005\u0005"+
		"\u0000\u0000`a\u0007\u0000\u0000\u0000ab\u0005\b\u0000\u0000bc\u0005\t"+
		"\u0000\u0000cd\u0005\n\u0000\u0000de\u0005\u000b\u0000\u0000ef\u0005\f"+
		"\u0000\u0000fg\u0005I\u0000\u0000gh\u0005Q\u0000\u0000h\u0007\u0001\u0000"+
		"\u0000\u0000ij\u0005H\u0000\u0000jk\u0005\r\u0000\u0000kl\u0005\t\u0000"+
		"\u0000lm\u0005\u000b\u0000\u0000mn\u0005\u000e\u0000\u0000no\u0005I\u0000"+
		"\u0000op\u0005Q\u0000\u0000p\t\u0001\u0000\u0000\u0000qr\u0005H\u0000"+
		"\u0000rs\u0005\u000f\u0000\u0000st\u0005\u0010\u0000\u0000tu\u0005\u0011"+
		"\u0000\u0000uv\u0005\u0012\u0000\u0000vw\u0005I\u0000\u0000wx\u0005Q\u0000"+
		"\u0000x\u000b\u0001\u0000\u0000\u0000yz\u0005H\u0000\u0000z{\u0005\u0013"+
		"\u0000\u0000{|\u0005G\u0000\u0000|}\u0005\u0015\u0000\u0000}~\u0005\b"+
		"\u0000\u0000~\u007f\u0005\t\u0000\u0000\u007f\u0080\u0005\n\u0000\u0000"+
		"\u0080\u0081\u0005\u0017\u0000\u0000\u0081\u0082\u0005I\u0000\u0000\u0082"+
		"\u0084\u0005Q\u0000\u0000\u0083\u0085\u0003\u000e\u0007\u0000\u0084\u0083"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\r\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005P\u0000\u0000\u0087\u0088\u0005G\u0000"+
		"\u0000\u0088\u0089\u0005\u0014\u0000\u0000\u0089\u008a\u0005\u0015\u0000"+
		"\u0000\u008a\u008b\u0005I\u0000\u0000\u008b\u008d\u0005Q\u0000\u0000\u008c"+
		"\u008e\u0003<\u001e\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005H\u0000\u0000\u0090\u0091\u0005\u0018\u0000\u0000\u0091\u0092\u0005"+
		"E\u0000\u0000\u0092\u0093\u0005\u0010\u0000\u0000\u0093\u0097\u0005\t"+
		"\u0000\u0000\u0094\u0095\u0005$\u0000\u0000\u0095\u0098\u0005%\u0000\u0000"+
		"\u0096\u0098\u0005&\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005I\u0000\u0000\u009a\u009b\u0005Q\u0000\u0000\u009b\u0011\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0005H\u0000\u0000\u009d\u009e\u0005D\u0000"+
		"\u0000\u009e\u009f\u0005\u0001\u0000\u0000\u009f\u00a3\u0005Q\u0000\u0000"+
		"\u00a0\u00a2\u0003\u0014\n\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u0013\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00b6\u0003\u0016\u000b\u0000\u00a7"+
		"\u00b6\u0003\u0018\f\u0000\u00a8\u00b6\u0003\u001a\r\u0000\u00a9\u00b6"+
		"\u0003\u001c\u000e\u0000\u00aa\u00b6\u0003\u001e\u000f\u0000\u00ab\u00b6"+
		"\u0003$\u0012\u0000\u00ac\u00b6\u0003&\u0013\u0000\u00ad\u00b6\u00032"+
		"\u0019\u0000\u00ae\u00b6\u0003(\u0014\u0000\u00af\u00b6\u0003*\u0015\u0000"+
		"\u00b0\u00b6\u0003,\u0016\u0000\u00b1\u00b6\u0003.\u0017\u0000\u00b2\u00b6"+
		"\u00030\u0018\u0000\u00b3\u00b6\u00034\u001a\u0000\u00b4\u00b6\u00038"+
		"\u001c\u0000\u00b5\u00a6\u0001\u0000\u0000\u0000\u00b5\u00a7\u0001\u0000"+
		"\u0000\u0000\u00b5\u00a8\u0001\u0000\u0000\u0000\u00b5\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b5\u00aa\u0001\u0000\u0000\u0000\u00b5\u00ab\u0001\u0000"+
		"\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000\u00b5\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b5\u00ae\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u0015\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005H\u0000\u0000\u00b8\u00b9\u0005\u0013\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0016\u0000\u0000\u00ba\u00bb\u0005I\u0000\u0000"+
		"\u00bb\u00d4\u0005Q\u0000\u0000\u00bc\u00bd\u0005H\u0000\u0000\u00bd\u00be"+
		"\u0005\u0013\u0000\u0000\u00be\u00bf\u0005=\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0016\u0000\u0000\u00c0\u00c1\u0005I\u0000\u0000\u00c1\u00d4\u0005Q\u0000"+
		"\u0000\u00c2\u00c3\u0005H\u0000\u0000\u00c3\u00c4\u0005\u0013\u0000\u0000"+
		"\u00c4\u00c5\u0005E\u0000\u0000\u00c5\u00c6\u0005I\u0000\u0000\u00c6\u00d4"+
		"\u0005Q\u0000\u0000\u00c7\u00c8\u0005H\u0000\u0000\u00c8\u00c9\u0005\u0013"+
		"\u0000\u0000\u00c9\u00ca\u0005G\u0000\u0000\u00ca\u00cb\u0005\u0015\u0000"+
		"\u0000\u00cb\u00cc\u0005I\u0000\u0000\u00cc\u00d0\u0005Q\u0000\u0000\u00cd"+
		"\u00cf\u00034\u001a\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d3\u00b7\u0001\u0000\u0000\u0000\u00d3\u00bc"+
		"\u0001\u0000\u0000\u0000\u00d3\u00c2\u0001\u0000\u0000\u0000\u00d3\u00c7"+
		"\u0001\u0000\u0000\u0000\u00d4\u0017\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005H\u0000\u0000\u00d6\u00d7\u0005\u0018\u0000\u0000\u00d7\u00df\u0005"+
		"E\u0000\u0000\u00d8\u00d9\u0005\u0010\u0000\u0000\u00d9\u00dd\u0005\t"+
		"\u0000\u0000\u00da\u00de\u0005&\u0000\u0000\u00db\u00dc\u0005$\u0000\u0000"+
		"\u00dc\u00de\u0005%\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df"+
		"\u00d8\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005I\u0000\u0000\u00e2\u00e6"+
		"\u0005Q\u0000\u0000\u00e3\u00e5\u00034\u001a\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u0019\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005H\u0000"+
		"\u0000\u00ea\u00eb\u0005\u0019\u0000\u0000\u00eb\u00ec\u0005E\u0000\u0000"+
		"\u00ec\u00ed\u0005\u0010\u0000\u0000\u00ed\u00f5\u0005E\u0000\u0000\u00ee"+
		"\u00ef\u0005\u001c\u0000\u0000\u00ef\u00f0\u0005\t\u0000\u0000\u00f0\u00f6"+
		"\u0005&\u0000\u0000\u00f1\u00f2\u0005\u001d\u0000\u0000\u00f2\u00f3\u0005"+
		"\t\u0000\u0000\u00f3\u00f4\u0005$\u0000\u0000\u00f4\u00f6\u0005%\u0000"+
		"\u0000\u00f5\u00ee\u0001\u0000\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005I\u0000\u0000"+
		"\u00f8\u00f9\u0005Q\u0000\u0000\u00f9\u001b\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005H\u0000\u0000\u00fb\u00fc\u0005\u001a\u0000\u0000\u00fc\u00fd"+
		"\u0005E\u0000\u0000\u00fd\u00fe\u0005\u0010\u0000\u0000\u00fe\u0106\u0005"+
		"E\u0000\u0000\u00ff\u0100\u0005\u001c\u0000\u0000\u0100\u0101\u0005\t"+
		"\u0000\u0000\u0101\u0107\u0005&\u0000\u0000\u0102\u0103\u0005\u001d\u0000"+
		"\u0000\u0103\u0104\u0005\t\u0000\u0000\u0104\u0105\u0005$\u0000\u0000"+
		"\u0105\u0107\u0005%\u0000\u0000\u0106\u00ff\u0001\u0000\u0000\u0000\u0106"+
		"\u0102\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0005I\u0000\u0000\u0109\u010a\u0005Q\u0000\u0000\u010a\u001d\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005H\u0000\u0000\u010c\u010d\u0005D\u0000"+
		"\u0000\u010d\u010e\u0005E\u0000\u0000\u010e\u010f\u0005\u001b\u0000\u0000"+
		"\u010f\u0124\u0003@ \u0000\u0110\u0111\u0005I\u0000\u0000\u0111\u0125"+
		"\u0005Q\u0000\u0000\u0112\u0113\u0005\u001c\u0000\u0000\u0113\u0114\u0005"+
		"H\u0000\u0000\u0114\u0115\u0005D\u0000\u0000\u0115\u0116\u0005E\u0000"+
		"\u0000\u0116\u0117\u0005\b\u0000\u0000\u0117\u0118\u0005G\u0000\u0000"+
		"\u0118\u0119\u0005\'\u0000\u0000\u0119\u011a\u0005I\u0000\u0000\u011a"+
		"\u011c\u0005Q\u0000\u0000\u011b\u011d\u0003 \u0010\u0000\u011c\u011b\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0121\u0001"+
		"\u0000\u0000\u0000\u011e\u0120\u00034\u001a\u0000\u011f\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000"+
		"\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0110\u0001\u0000"+
		"\u0000\u0000\u0124\u0112\u0001\u0000\u0000\u0000\u0125\u001f\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005P\u0000\u0000\u0127\u0128\u0005@\u0000\u0000"+
		"\u0128\u0129\u0005K\u0000\u0000\u0129\u012a\u0005Q\u0000\u0000\u012a\u012b"+
		"\u0005O\u0000\u0000\u012b\u012c\u0005A\u0000\u0000\u012c\u012d\u0005K"+
		"\u0000\u0000\u012d\u012e\u0005G\u0000\u0000\u012e\u012f\u0005\'\u0000"+
		"\u0000\u012f\u0130\u0005Q\u0000\u0000\u0130\u0131\u0003\"\u0011\u0000"+
		"\u0131\u0132\u0005O\u0000\u0000\u0132\u0133\u0005B\u0000\u0000\u0133\u0134"+
		"\u0005K\u0000\u0000\u0134\u0135\u0005G\u0000\u0000\u0135\u0136\u0005\'"+
		"\u0000\u0000\u0136\u0137\u0005Q\u0000\u0000\u0137\u0138\u0005Q\u0000\u0000"+
		"\u0138!\u0001\u0000\u0000\u0000\u0139\u013a\u0005O\u0000\u0000\u013a\u013b"+
		"\u0005M\u0000\u0000\u013b\u013c\u0005C\u0000\u0000\u013c\u013d\u0005N"+
		"\u0000\u0000\u013d\u013e\u0005E\u0000\u0000\u013e\u013f\u0005K\u0000\u0000"+
		"\u013f\u0140\u0005G\u0000\u0000\u0140\u0141\u0005\'\u0000\u0000\u0141"+
		"\u0142\u0005Q\u0000\u0000\u0142#\u0001\u0000\u0000\u0000\u0143\u0144\u0005"+
		"H\u0000\u0000\u0144\u0145\u00056\u0000\u0000\u0145\u0146\u0005E\u0000"+
		"\u0000\u0146\u0147\u0005\u0010\u0000\u0000\u0147\u0148\u0005\t\u0000\u0000"+
		"\u0148\u0149\u0005&\u0000\u0000\u0149\u014a\u0005I\u0000\u0000\u014a\u014e"+
		"\u0005Q\u0000\u0000\u014b\u014d\u00034\u001a\u0000\u014c\u014b\u0001\u0000"+
		"\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f%\u0001\u0000\u0000"+
		"\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0152\u0005H\u0000\u0000"+
		"\u0152\u0153\u0005*\u0000\u0000\u0153\u0154\u0005-\u0000\u0000\u0154\u0155"+
		"\u0005+\u0000\u0000\u0155\u0156\u0005I\u0000\u0000\u0156\u0169\u0005Q"+
		"\u0000\u0000\u0157\u0158\u0005H\u0000\u0000\u0158\u0159\u0005*\u0000\u0000"+
		"\u0159\u015a\u0005G\u0000\u0000\u015a\u015b\u0005\u0015\u0000\u0000\u015b"+
		"\u015c\u0005,\u0000\u0000\u015c\u015d\u0005-\u0000\u0000\u015d\u015e\u0005"+
		"+\u0000\u0000\u015e\u015f\u0005I\u0000\u0000\u015f\u0169\u0005Q\u0000"+
		"\u0000\u0160\u0161\u0005H\u0000\u0000\u0161\u0162\u0005*\u0000\u0000\u0162"+
		"\u0163\u0005E\u0000\u0000\u0163\u0164\u0005,\u0000\u0000\u0164\u0165\u0005"+
		"-\u0000\u0000\u0165\u0166\u0005+\u0000\u0000\u0166\u0167\u0005I\u0000"+
		"\u0000\u0167\u0169\u0005Q\u0000\u0000\u0168\u0151\u0001\u0000\u0000\u0000"+
		"\u0168\u0157\u0001\u0000\u0000\u0000\u0168\u0160\u0001\u0000\u0000\u0000"+
		"\u0169\'\u0001\u0000\u0000\u0000\u016a\u016b\u0005H\u0000\u0000\u016b"+
		"\u016c\u0005(\u0000\u0000\u016c\u016d\u0005E\u0000\u0000\u016d\u016e\u0005"+
		"I\u0000\u0000\u016e\u018f\u0005Q\u0000\u0000\u016f\u0170\u0005H\u0000"+
		"\u0000\u0170\u0171\u0005(\u0000\u0000\u0171\u0172\u0005G\u0000\u0000\u0172"+
		"\u0173\u0005\u0015\u0000\u0000\u0173\u0174\u0005I\u0000\u0000\u0174\u0176"+
		"\u0005Q\u0000\u0000\u0175\u0177\u0003<\u001e\u0000\u0176\u0175\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u018f\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0005G\u0000\u0000\u0179\u017a\u0005\u0015\u0000"+
		"\u0000\u017a\u017b\u0005 \u0000\u0000\u017b\u017c\u0005(\u0000\u0000\u017c"+
		"\u017d\u0005.\u0000\u0000\u017d\u017e\u0005H\u0000\u0000\u017e\u017f\u0005"+
		"D\u0000\u0000\u017f\u0180\u0005E\u0000\u0000\u0180\u0181\u0005I\u0000"+
		"\u0000\u0181\u0183\u0005Q\u0000\u0000\u0182\u0184\u0003<\u001e\u0000\u0183"+
		"\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"\u018f\u0001\u0000\u0000\u0000\u0185\u0186\u0005E\u0000\u0000\u0186\u0187"+
		"\u0005\u001f\u0000\u0000\u0187\u0188\u0005(\u0000\u0000\u0188\u0189\u0005"+
		".\u0000\u0000\u0189\u018a\u0005H\u0000\u0000\u018a\u018b\u0005D\u0000"+
		"\u0000\u018b\u018c\u0005E\u0000\u0000\u018c\u018d\u0005I\u0000\u0000\u018d"+
		"\u018f\u0005Q\u0000\u0000\u018e\u016a\u0001\u0000\u0000\u0000\u018e\u016f"+
		"\u0001\u0000\u0000\u0000\u018e\u0178\u0001\u0000\u0000\u0000\u018e\u0185"+
		"\u0001\u0000\u0000\u0000\u018f)\u0001\u0000\u0000\u0000\u0190\u0191\u0005"+
		"H\u0000\u0000\u0191\u0193\u00050\u0000\u0000\u0192\u0194\u0005=\u0000"+
		"\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u00051\u0000\u0000"+
		"\u0196\u0197\u0005\u0016\u0000\u0000\u0197\u0198\u0005I\u0000\u0000\u0198"+
		"\u01a0\u0005Q\u0000\u0000\u0199\u019a\u0005H\u0000\u0000\u019a\u019b\u0005"+
		"0\u0000\u0000\u019b\u019c\u0005G\u0000\u0000\u019c\u019d\u00052\u0000"+
		"\u0000\u019d\u019e\u0005I\u0000\u0000\u019e\u01a0\u0005Q\u0000\u0000\u019f"+
		"\u0190\u0001\u0000\u0000\u0000\u019f\u0199\u0001\u0000\u0000\u0000\u01a0"+
		"+\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005H\u0000\u0000\u01a2\u01a3\u0005"+
		"/\u0000\u0000\u01a3\u01a4\u0005H\u0000\u0000\u01a4\u01a5\u0005D\u0000"+
		"\u0000\u01a5\u01a6\u0005E\u0000\u0000\u01a6\u01a7\u0005\u0010\u0000\u0000"+
		"\u01a7\u01a8\u0005-\u0000\u0000\u01a8\u01a9\u0005\u0017\u0000\u0000\u01a9"+
		"\u01aa\u0005I\u0000\u0000\u01aa\u01ab\u0005Q\u0000\u0000\u01ab-\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0005H\u0000\u0000\u01ad\u01ae\u0005D\u0000"+
		"\u0000\u01ae\u01af\u0005E\u0000\u0000\u01af\u01b0\u0005!\u0000\u0000\u01b0"+
		"\u01b1\u0005\"\u0000\u0000\u01b1\u01b2\u0005\u001d\u0000\u0000\u01b2\u01b3"+
		"\u0005\t\u0000\u0000\u01b3\u01b4\u0005$\u0000\u0000\u01b4\u01b5\u0005"+
		"%\u0000\u0000\u01b5\u01b6\u0005I\u0000\u0000\u01b6\u01b7\u0005Q\u0000"+
		"\u0000\u01b7/\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005H\u0000\u0000\u01b9"+
		"\u01ba\u0005D\u0000\u0000\u01ba\u01bb\u0005E\u0000\u0000\u01bb\u01bc\u0005"+
		"\u001f\u0000\u0000\u01bc\u01bd\u00053\u0000\u0000\u01bd\u01be\u00054\u0000"+
		"\u0000\u01be\u01bf\u0005L\u0000\u0000\u01bf\u01c0\u0005Q\u0000\u0000\u01c0"+
		"1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005=\u0000\u0000\u01c2\u01c3\u0005"+
		"\u0016\u0000\u0000\u01c3\u01c4\u0005\u001f\u0000\u0000\u01c4\u01c5\u0005"+
		"\u0003\u0000\u0000\u01c5\u01c6\u0005\u0010\u0000\u0000\u01c6\u01c7\u0005"+
		"H\u0000\u0000\u01c7\u01c8\u0005D\u0000\u0000\u01c8\u01c9\u0005\u0017\u0000"+
		"\u0000\u01c9\u01ca\u0005I\u0000\u0000\u01ca\u01d5\u0005Q\u0000\u0000\u01cb"+
		"\u01cc\u0005E\u0000\u0000\u01cc\u01cd\u0005\u001f\u0000\u0000\u01cd\u01ce"+
		"\u0005\u0003\u0000\u0000\u01ce\u01cf\u0005\u0010\u0000\u0000\u01cf\u01d0"+
		"\u0005H\u0000\u0000\u01d0\u01d1\u0005D\u0000\u0000\u01d1\u01d2\u0005\u0017"+
		"\u0000\u0000\u01d2\u01d3\u0005I\u0000\u0000\u01d3\u01d5\u0005Q\u0000\u0000"+
		"\u01d4\u01c1\u0001\u0000\u0000\u0000\u01d4\u01cb\u0001\u0000\u0000\u0000"+
		"\u01d53\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005P\u0000\u0000\u01d7\u01d8"+
		"\u00036\u001b\u0000\u01d8\u01d9\u0005I\u0000\u0000\u01d9\u01dd\u0005Q"+
		"\u0000\u0000\u01da\u01dc\u0003<\u001e\u0000\u01db\u01da\u0001\u0000\u0000"+
		"\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000"+
		"\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de5\u0001\u0000\u0000\u0000"+
		"\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005H\u0000\u0000\u01e1"+
		"\u01e2\u0005\u0013\u0000\u0000\u01e2\u025d\u0005E\u0000\u0000\u01e3\u01e4"+
		"\u0005H\u0000\u0000\u01e4\u01e5\u0005\u0013\u0000\u0000\u01e5\u01e6\u0005"+
		"=\u0000\u0000\u01e6\u025d\u0005\u0016\u0000\u0000\u01e7\u01e8\u0005H\u0000"+
		"\u0000\u01e8\u01e9\u0005\u0013\u0000\u0000\u01e9\u01ea\u0005G\u0000\u0000"+
		"\u01ea\u025d\u0005\u0015\u0000\u0000\u01eb\u01ec\u0005H\u0000\u0000\u01ec"+
		"\u01ed\u0005\u0013\u0000\u0000\u01ed\u01ee\u0005G\u0000\u0000\u01ee\u01ef"+
		"\u0005\u0015\u0000\u0000\u01ef\u01f0\u0005>\u0000\u0000\u01f0\u01f1\u0005"+
		"\u0018\u0000\u0000\u01f1\u01f2\u0005?\u0000\u0000\u01f2\u01f3\u0005\u0010"+
		"\u0000\u0000\u01f3\u01f4\u0005\t\u0000\u0000\u01f4\u025d\u0005&\u0000"+
		"\u0000\u01f5\u01f6\u0005H\u0000\u0000\u01f6\u01f7\u0005*\u0000\u0000\u01f7"+
		"\u01f8\u0005-\u0000\u0000\u01f8\u025d\u0005+\u0000\u0000\u01f9\u01fa\u0005"+
		"H\u0000\u0000\u01fa\u01fb\u0005*\u0000\u0000\u01fb\u01fc\u0005G\u0000"+
		"\u0000\u01fc\u01fd\u0005\u0015\u0000\u0000\u01fd\u01fe\u0005,\u0000\u0000"+
		"\u01fe\u01ff\u0005-\u0000\u0000\u01ff\u025d\u0005+\u0000\u0000\u0200\u0201"+
		"\u0005H\u0000\u0000\u0201\u0202\u0005*\u0000\u0000\u0202\u0203\u0005E"+
		"\u0000\u0000\u0203\u0204\u0005,\u0000\u0000\u0204\u0205\u0005-\u0000\u0000"+
		"\u0205\u025d\u0005+\u0000\u0000\u0206\u0207\u0005H\u0000\u0000\u0207\u0208"+
		"\u0005(\u0000\u0000\u0208\u025d\u0005E\u0000\u0000\u0209\u020a\u0005H"+
		"\u0000\u0000\u020a\u020b\u0005(\u0000\u0000\u020b\u020c\u0005G\u0000\u0000"+
		"\u020c\u025d\u0005\u0015\u0000\u0000\u020d\u020e\u0005G\u0000\u0000\u020e"+
		"\u020f\u0005\u0015\u0000\u0000\u020f\u0210\u0005 \u0000\u0000\u0210\u0211"+
		"\u0005(\u0000\u0000\u0211\u0212\u0005.\u0000\u0000\u0212\u0213\u0005H"+
		"\u0000\u0000\u0213\u0214\u0005D\u0000\u0000\u0214\u025d\u0005E\u0000\u0000"+
		"\u0215\u0216\u0005E\u0000\u0000\u0216\u0217\u0005\u001f\u0000\u0000\u0217"+
		"\u0218\u0005(\u0000\u0000\u0218\u0219\u0005.\u0000\u0000\u0219\u021a\u0005"+
		"H\u0000\u0000\u021a\u021b\u0005D\u0000\u0000\u021b\u025d\u0005E\u0000"+
		"\u0000\u021c\u021d\u0005H\u0000\u0000\u021d\u021e\u00050\u0000\u0000\u021e"+
		"\u021f\u00051\u0000\u0000\u021f\u025d\u0005E\u0000\u0000\u0220\u0221\u0005"+
		"H\u0000\u0000\u0221\u0222\u00050\u0000\u0000\u0222\u0223\u0005G\u0000"+
		"\u0000\u0223\u0224\u00051\u0000\u0000\u0224\u025d\u0005\u0015\u0000\u0000"+
		"\u0225\u0226\u0005H\u0000\u0000\u0226\u0227\u0005/\u0000\u0000\u0227\u0228"+
		"\u0005H\u0000\u0000\u0228\u0229\u0005D\u0000\u0000\u0229\u022a\u0005E"+
		"\u0000\u0000\u022a\u022b\u0005\u0010\u0000\u0000\u022b\u022c\u0005-\u0000"+
		"\u0000\u022c\u025d\u0005\u0017\u0000\u0000\u022d\u022e\u0005H\u0000\u0000"+
		"\u022e\u022f\u0005D\u0000\u0000\u022f\u0230\u0005E\u0000\u0000\u0230\u0231"+
		"\u0005\u001f\u0000\u0000\u0231\u0232\u00055\u0000\u0000\u0232\u0233\u0005"+
		"\u001e\u0000\u0000\u0233\u0234\u0005H\u0000\u0000\u0234\u0235\u0005D\u0000"+
		"\u0000\u0235\u0236\u0005E\u0000\u0000\u0236\u0237\u0005\u0010\u0000\u0000"+
		"\u0237\u0238\u0005#\u0000\u0000\u0238\u0239\u0005\t\u0000\u0000\u0239"+
		"\u023a\u0005$\u0000\u0000\u023a\u025d\u0005\u0002\u0000\u0000\u023b\u023c"+
		"\u0005H\u0000\u0000\u023c\u023d\u0005\u0019\u0000\u0000\u023d\u023e\u0005"+
		"E\u0000\u0000\u023e\u023f\u0005\u0010\u0000\u0000\u023f\u0240\u0005E\u0000"+
		"\u0000\u0240\u0241\u0005\u001c\u0000\u0000\u0241\u0242\u0005\t\u0000\u0000"+
		"\u0242\u025d\u0005&\u0000\u0000\u0243\u0244\u0005H\u0000\u0000\u0244\u0245"+
		"\u0005\u0019\u0000\u0000\u0245\u0246\u0005E\u0000\u0000\u0246\u0247\u0005"+
		"\u0010\u0000\u0000\u0247\u0248\u0005E\u0000\u0000\u0248\u0249\u0005\u001d"+
		"\u0000\u0000\u0249\u024a\u0005\t\u0000\u0000\u024a\u024b\u0005$\u0000"+
		"\u0000\u024b\u025d\u0005%\u0000\u0000\u024c\u024d\u0005H\u0000\u0000\u024d"+
		"\u024e\u0005D\u0000\u0000\u024e\u024f\u0005E\u0000\u0000\u024f\u0250\u0005"+
		"0\u0000\u0000\u0250\u0251\u0005G\u0000\u0000\u0251\u025d\u0005\'\u0000"+
		"\u0000\u0252\u0253\u0005H\u0000\u0000\u0253\u0254\u0005\u001a\u0000\u0000"+
		"\u0254\u0255\u0005E\u0000\u0000\u0255\u0256\u0005\u0010\u0000\u0000\u0256"+
		"\u0257\u0005E\u0000\u0000\u0257\u0258\u0005\u001d\u0000\u0000\u0258\u0259"+
		"\u0005\t\u0000\u0000\u0259\u025a\u0005$\u0000\u0000\u025a\u025d\u0005"+
		"%\u0000\u0000\u025b\u025d\u0003B!\u0000\u025c\u01e0\u0001\u0000\u0000"+
		"\u0000\u025c\u01e3\u0001\u0000\u0000\u0000\u025c\u01e7\u0001\u0000\u0000"+
		"\u0000\u025c\u01eb\u0001\u0000\u0000\u0000\u025c\u01f5\u0001\u0000\u0000"+
		"\u0000\u025c\u01f9\u0001\u0000\u0000\u0000\u025c\u0200\u0001\u0000\u0000"+
		"\u0000\u025c\u0206\u0001\u0000\u0000\u0000\u025c\u0209\u0001\u0000\u0000"+
		"\u0000\u025c\u020d\u0001\u0000\u0000\u0000\u025c\u0215\u0001\u0000\u0000"+
		"\u0000\u025c\u021c\u0001\u0000\u0000\u0000\u025c\u0220\u0001\u0000\u0000"+
		"\u0000\u025c\u0225\u0001\u0000\u0000\u0000\u025c\u022d\u0001\u0000\u0000"+
		"\u0000\u025c\u023b\u0001\u0000\u0000\u0000\u025c\u0243\u0001\u0000\u0000"+
		"\u0000\u025c\u024c\u0001\u0000\u0000\u0000\u025c\u0252\u0001\u0000\u0000"+
		"\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025d7\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0005H\u0000\u0000\u025f\u0260\u00057\u0000\u0000\u0260\u0261"+
		"\u0005-\u0000\u0000\u0261\u0262\u0005\u0001\u0000\u0000\u0262\u0263\u0005"+
		"I\u0000\u0000\u0263\u0264\u0005Q\u0000\u0000\u02649\u0001\u0000\u0000"+
		"\u0000\u0265\u0266\u0005;\u0000\u0000\u0266\u0267\u00052\u0000\u0000\u0267"+
		"\u0268\u0005<\u0000\u0000\u0268\u0269\u0005I\u0000\u0000\u0269\u026a\u0005"+
		"H\u0000\u0000\u026a\u026b\u0005:\u0000\u0000\u026b\u0273\u0005I\u0000"+
		"\u0000\u026c\u026d\u00058\u0000\u0000\u026d\u026e\u00059\u0000\u0000\u026e"+
		"\u026f\u0005I\u0000\u0000\u026f\u0270\u0005H\u0000\u0000\u0270\u0271\u0005"+
		":\u0000\u0000\u0271\u0273\u0005I\u0000\u0000\u0272\u0265\u0001\u0000\u0000"+
		"\u0000\u0272\u026c\u0001\u0000\u0000\u0000\u0273;\u0001\u0000\u0000\u0000"+
		"\u0274\u0275\u0005O\u0000\u0000\u0275\u027a\u0003>\u001f\u0000\u0276\u0277"+
		"\u0005J\u0000\u0000\u0277\u0279\u0003>\u001f\u0000\u0278\u0276\u0001\u0000"+
		"\u0000\u0000\u0279\u027c\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000"+
		"\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027d\u0001\u0000"+
		"\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027d\u027e\u0005Q\u0000"+
		"\u0000\u027e=\u0001\u0000\u0000\u0000\u027f\u0280\u0005E\u0000\u0000\u0280"+
		"?\u0001\u0000\u0000\u0000\u0281\u0282\u0005F\u0000\u0000\u0282A\u0001"+
		"\u0000\u0000\u0000\u0283\u0284\u0005\u0003\u0000\u0000\u0284C\u0001\u0000"+
		"\u0000\u0000\u001eIT\\\u0084\u008d\u0097\u00a3\u00b5\u00d0\u00d3\u00dd"+
		"\u00df\u00e6\u00f5\u0106\u011c\u0121\u0124\u014e\u0168\u0176\u0183\u018e"+
		"\u0193\u019f\u01d4\u01dd\u025c\u0272\u027a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}