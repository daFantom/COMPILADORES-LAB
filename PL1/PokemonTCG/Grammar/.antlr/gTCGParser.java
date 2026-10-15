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
		TAKE=48, PRIZE=49, PRIZE_CARDS=50, KNOCKED=51, OUT=52, SWITCH=53, SWITCHED=54, 
		RETIRED=55, ENDED=56, OPPONENT=57, CONCEDED=58, WINS=59, ALL=60, TAKEN=61, 
		A_SOMETHING=62, AND=63, THEM=64, DAMAGE_BREAKDOWN=65, BASE_DAMAGE=66, 
		TOTAL_DAMAGE=67, ITEM=68, POSSESSIVE=69, CARD=70, ATTACK=71, NUMBER=72, 
		PLAYER=73, DOT=74, COMMA=75, COLON=76, EXCLAMATION=77, LPAREN=78, RPAREN=79, 
		BULLET=80, HYPHEN=81, NEWLINE=82, WS=83;
	public static final int
		RULE_log = 0, RULE_setup = 1, RULE_setupAction = 2, RULE_coinChoice = 3, 
		RULE_coinToss = 4, RULE_firstPlayer = 5, RULE_openingHand = 6, RULE_drawnCards = 7, 
		RULE_initialPokemon = 8, RULE_turn = 9, RULE_turnAction = 10, RULE_drawAction = 11, 
		RULE_playAction = 12, RULE_attachAction = 13, RULE_evolveAction = 14, 
		RULE_attackAction = 15, RULE_damageBreakdown = 16, RULE_damageLine = 17, 
		RULE_switchAction = 18, RULE_switchResult = 19, RULE_retreatAction = 20, 
		RULE_shuffleAction = 21, RULE_discardAction = 22, RULE_prizeAction = 23, 
		RULE_moveToHandAction = 24, RULE_activeSpotAction = 25, RULE_knockoutAction = 26, 
		RULE_cardMovedAction = 27, RULE_subAction = 28, RULE_subActionBody = 29, 
		RULE_endTurn = 30, RULE_gameEnd = 31, RULE_cardList = 32, RULE_cardListItem = 33, 
		RULE_card = 34, RULE_attack = 35, RULE_cardAddedToHand = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"log", "setup", "setupAction", "coinChoice", "coinToss", "firstPlayer", 
			"openingHand", "drawnCards", "initialPokemon", "turn", "turnAction", 
			"drawAction", "playAction", "attachAction", "evolveAction", "attackAction", 
			"damageBreakdown", "damageLine", "switchAction", "switchResult", "retreatAction", 
			"shuffleAction", "discardAction", "prizeAction", "moveToHandAction", 
			"activeSpotAction", "knockoutAction", "cardMovedAction", "subAction", 
			"subActionBody", "endTurn", "gameEnd", "cardList", "cardListItem", "card", 
			"attack", "cardAddedToHand"
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
			"'took'", "'Prize'", "'Prize cards'", "'Knocked'", "'Out'", "'Switch'", 
			"'switched'", "'retreated'", "'ended'", "'Opponent'", "'conceded'", "'wins'", 
			"'All'", "'taken'", null, "'and'", "'them'", "'Damage breakdown'", "'Base damage'", 
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
			"PRIZE_CARDS", "KNOCKED", "OUT", "SWITCH", "SWITCHED", "RETIRED", "ENDED", 
			"OPPONENT", "CONCEDED", "WINS", "ALL", "TAKEN", "A_SOMETHING", "AND", 
			"THEM", "DAMAGE_BREAKDOWN", "BASE_DAMAGE", "TOTAL_DAMAGE", "ITEM", "POSSESSIVE", 
			"CARD", "ATTACK", "NUMBER", "PLAYER", "DOT", "COMMA", "COLON", "EXCLAMATION", 
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
	public static class LogContext extends ParserRuleContext {
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
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
		public List<GameEndContext> gameEnd() {
			return getRuleContexts(GameEndContext.class);
		}
		public GameEndContext gameEnd(int i) {
			return getRuleContext(GameEndContext.class,i);
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
			setState(74);
			setup();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 33554441L) != 0)) {
				{
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(75);
					match(NEWLINE);
					setState(76);
					turn();
					}
					break;
				case OPPONENT:
				case ALL:
					{
					setState(77);
					gameEnd();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
			setState(85);
			match(SETUP);
			setState(86);
			match(NEWLINE);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLAYER) {
				{
				{
				setState(87);
				setupAction();
				}
				}
				setState(92);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				coinChoice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				coinToss();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				firstPlayer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				openingHand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
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
			setState(100);
			match(PLAYER);
			setState(101);
			match(CHOSE);
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(103);
			match(FOR);
			setState(104);
			match(THE);
			setState(105);
			match(OPENING);
			setState(106);
			match(COIN);
			setState(107);
			match(FLIP);
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
			setState(111);
			match(PLAYER);
			setState(112);
			match(WON);
			setState(113);
			match(THE);
			setState(114);
			match(COIN);
			setState(115);
			match(TOSS);
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
			setState(119);
			match(PLAYER);
			setState(120);
			match(DECIDED);
			setState(121);
			match(TO);
			setState(122);
			match(GO);
			setState(123);
			match(FIRST);
			setState(124);
			match(DOT);
			setState(125);
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
			setState(127);
			match(PLAYER);
			setState(128);
			match(DREW);
			setState(129);
			match(NUMBER);
			setState(130);
			match(CARDS);
			setState(131);
			match(FOR);
			setState(132);
			match(THE);
			setState(133);
			match(OPENING);
			setState(134);
			match(HAND);
			setState(135);
			match(DOT);
			setState(136);
			match(NEWLINE);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HYPHEN) {
				{
				setState(137);
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
			setState(140);
			match(HYPHEN);
			setState(141);
			match(NUMBER);
			setState(142);
			match(DRAWN);
			setState(143);
			match(CARDS);
			setState(144);
			match(DOT);
			setState(145);
			match(NEWLINE);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(146);
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
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
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
			setState(149);
			match(PLAYER);
			setState(150);
			match(PLAYED);
			setState(151);
			card();
			setState(152);
			match(TO);
			setState(153);
			match(THE);
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIVE:
				{
				setState(154);
				match(ACTIVE);
				setState(155);
				match(SPOT);
				}
				break;
			case BENCH:
				{
				setState(156);
				match(BENCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(159);
			match(DOT);
			setState(160);
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
			setState(162);
			match(PLAYER);
			setState(163);
			match(POSSESSIVE);
			setState(164);
			match(TURN);
			setState(165);
			match(NEWLINE);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 270139905L) != 0)) {
				{
				{
				setState(166);
				turnAction();
				}
				}
				setState(171);
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
		public SwitchActionContext switchAction() {
			return getRuleContext(SwitchActionContext.class,0);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				drawAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				playAction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				attachAction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				evolveAction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				attackAction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				switchAction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				retreatAction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				shuffleAction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(180);
				cardMovedAction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(181);
				discardAction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(182);
				prizeAction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(183);
				moveToHandAction();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(184);
				activeSpotAction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(185);
				knockoutAction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(186);
				subAction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(187);
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
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(PLAYER);
				setState(191);
				match(DREW);
				setState(192);
				match(CARD_WORD);
				setState(193);
				match(DOT);
				setState(194);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(PLAYER);
				setState(196);
				match(DREW);
				setState(197);
				match(A_SOMETHING);
				setState(198);
				match(CARD_WORD);
				setState(199);
				match(DOT);
				setState(200);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(PLAYER);
				setState(202);
				match(DREW);
				setState(203);
				card();
				setState(204);
				match(DOT);
				setState(205);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(PLAYER);
				setState(208);
				match(DREW);
				setState(209);
				match(NUMBER);
				setState(210);
				match(CARDS);
				setState(211);
				match(DOT);
				setState(212);
				match(NEWLINE);
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(213);
						subAction();
						}
						} 
					}
					setState(218);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
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
			setState(221);
			match(PLAYER);
			setState(222);
			match(PLAYED);
			setState(223);
			card();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(224);
				match(TO);
				setState(225);
				match(THE);
				setState(229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(226);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(227);
					match(ACTIVE);
					setState(228);
					match(SPOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(233);
			match(DOT);
			setState(234);
			match(NEWLINE);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					subAction();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public List<CardContext> card() {
			return getRuleContexts(CardContext.class);
		}
		public CardContext card(int i) {
			return getRuleContext(CardContext.class,i);
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
			setState(241);
			match(PLAYER);
			setState(242);
			match(ATTACHED);
			setState(243);
			card();
			setState(244);
			match(TO);
			setState(245);
			card();
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(246);
				match(ON);
				setState(247);
				match(THE);
				setState(248);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(249);
				match(IN);
				setState(250);
				match(THE);
				setState(251);
				match(ACTIVE);
				setState(252);
				match(SPOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(255);
			match(DOT);
			setState(256);
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
		public List<CardContext> card() {
			return getRuleContexts(CardContext.class);
		}
		public CardContext card(int i) {
			return getRuleContext(CardContext.class,i);
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
			setState(258);
			match(PLAYER);
			setState(259);
			match(EVOLVED);
			setState(260);
			card();
			setState(261);
			match(TO);
			setState(262);
			card();
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
			setState(272);
			match(DOT);
			setState(273);
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
		public List<CardContext> card() {
			return getRuleContexts(CardContext.class);
		}
		public CardContext card(int i) {
			return getRuleContext(CardContext.class,i);
		}
		public TerminalNode USED() { return getToken(gTCGParser.USED, 0); }
		public AttackContext attack() {
			return getRuleContext(AttackContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(gTCGParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(gTCGParser.DOT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gTCGParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gTCGParser.NEWLINE, i);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(PLAYER);
			setState(276);
			match(POSSESSIVE);
			setState(277);
			card();
			setState(278);
			match(USED);
			setState(279);
			attack();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(280);
				match(DOT);
				}
			}

			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(283);
				match(NEWLINE);
				}
				break;
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(286);
				match(ON);
				setState(287);
				match(PLAYER);
				setState(288);
				match(POSSESSIVE);
				setState(289);
				card();
				setState(290);
				match(FOR);
				setState(291);
				match(NUMBER);
				setState(292);
				match(DAMAGE);
				setState(293);
				match(DOT);
				setState(294);
				match(NEWLINE);
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(295);
					damageBreakdown();
					}
					break;
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						subAction();
						}
						} 
					}
					setState(303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class DamageBreakdownContext extends ParserRuleContext {
		public TerminalNode HYPHEN() { return getToken(gTCGParser.HYPHEN, 0); }
		public TerminalNode DAMAGE_BREAKDOWN() { return getToken(gTCGParser.DAMAGE_BREAKDOWN, 0); }
		public TerminalNode COLON() { return getToken(gTCGParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(gTCGParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gTCGParser.NEWLINE, i);
		}
		public List<DamageLineContext> damageLine() {
			return getRuleContexts(DamageLineContext.class);
		}
		public DamageLineContext damageLine(int i) {
			return getRuleContext(DamageLineContext.class,i);
		}
		public DamageBreakdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damageBreakdown; }
	}

	public final DamageBreakdownContext damageBreakdown() throws RecognitionException {
		DamageBreakdownContext _localctx = new DamageBreakdownContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_damageBreakdown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(HYPHEN);
			setState(307);
			match(DAMAGE_BREAKDOWN);
			setState(308);
			match(COLON);
			setState(309);
			match(NEWLINE);
			setState(311); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(310);
				damageLine();
				}
				}
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BULLET );
			setState(315);
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
	public static class DamageLineContext extends ParserRuleContext {
		public TerminalNode BULLET() { return getToken(gTCGParser.BULLET, 0); }
		public TerminalNode BASE_DAMAGE() { return getToken(gTCGParser.BASE_DAMAGE, 0); }
		public TerminalNode COLON() { return getToken(gTCGParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(gTCGParser.LPAREN, 0); }
		public TerminalNode ITEM() { return getToken(gTCGParser.ITEM, 0); }
		public TerminalNode RPAREN() { return getToken(gTCGParser.RPAREN, 0); }
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public TerminalNode TOTAL_DAMAGE() { return getToken(gTCGParser.TOTAL_DAMAGE, 0); }
		public DamageLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damageLine; }
	}

	public final DamageLineContext damageLine() throws RecognitionException {
		DamageLineContext _localctx = new DamageLineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_damageLine);
		int _la;
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(BULLET);
				setState(318);
				match(BASE_DAMAGE);
				setState(319);
				match(COLON);
				setState(320);
				match(NUMBER);
				setState(321);
				match(DAMAGE);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(322);
					match(DOT);
					}
				}

				setState(325);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(BULLET);
				setState(327);
				match(LPAREN);
				setState(328);
				match(ITEM);
				setState(329);
				match(RPAREN);
				setState(330);
				card();
				setState(331);
				match(COLON);
				setState(332);
				match(NUMBER);
				setState(333);
				match(DAMAGE);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(334);
					match(DOT);
					}
				}

				setState(337);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(BULLET);
				setState(340);
				match(TOTAL_DAMAGE);
				setState(341);
				match(COLON);
				setState(342);
				match(NUMBER);
				setState(343);
				match(DAMAGE);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(344);
					match(DOT);
					}
				}

				setState(347);
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
	public static class SwitchActionContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode PLAYED() { return getToken(gTCGParser.PLAYED, 0); }
		public TerminalNode SWITCH() { return getToken(gTCGParser.SWITCH, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public SwitchResultContext switchResult() {
			return getRuleContext(SwitchResultContext.class,0);
		}
		public ActiveSpotActionContext activeSpotAction() {
			return getRuleContext(ActiveSpotActionContext.class,0);
		}
		public SwitchActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchAction; }
	}

	public final SwitchActionContext switchAction() throws RecognitionException {
		SwitchActionContext _localctx = new SwitchActionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switchAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(PLAYER);
			setState(351);
			match(PLAYED);
			setState(352);
			match(SWITCH);
			setState(353);
			match(DOT);
			setState(354);
			match(NEWLINE);
			setState(355);
			switchResult();
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(356);
				activeSpotAction();
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
	public static class SwitchResultContext extends ParserRuleContext {
		public TerminalNode HYPHEN() { return getToken(gTCGParser.HYPHEN, 0); }
		public List<TerminalNode> PLAYER() { return getTokens(gTCGParser.PLAYER); }
		public TerminalNode PLAYER(int i) {
			return getToken(gTCGParser.PLAYER, i);
		}
		public List<TerminalNode> POSSESSIVE() { return getTokens(gTCGParser.POSSESSIVE); }
		public TerminalNode POSSESSIVE(int i) {
			return getToken(gTCGParser.POSSESSIVE, i);
		}
		public List<CardContext> card() {
			return getRuleContexts(CardContext.class);
		}
		public CardContext card(int i) {
			return getRuleContext(CardContext.class,i);
		}
		public TerminalNode SWITCHED() { return getToken(gTCGParser.SWITCHED, 0); }
		public TerminalNode WITH() { return getToken(gTCGParser.WITH, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode BECOME() { return getToken(gTCGParser.BECOME, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode ACTIVE() { return getToken(gTCGParser.ACTIVE, 0); }
		public TerminalNode POKEMON() { return getToken(gTCGParser.POKEMON, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode WAS() { return getToken(gTCGParser.WAS, 0); }
		public SwitchResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchResult; }
	}

	public final SwitchResultContext switchResult() throws RecognitionException {
		SwitchResultContext _localctx = new SwitchResultContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_switchResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(HYPHEN);
			setState(360);
			match(PLAYER);
			setState(361);
			match(POSSESSIVE);
			setState(362);
			card();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WAS) {
				{
				setState(363);
				match(WAS);
				}
			}

			setState(366);
			match(SWITCHED);
			setState(367);
			match(WITH);
			setState(368);
			match(PLAYER);
			setState(369);
			match(POSSESSIVE);
			setState(370);
			card();
			setState(371);
			match(TO);
			setState(372);
			match(BECOME);
			setState(373);
			match(THE);
			setState(374);
			match(ACTIVE);
			setState(375);
			match(POKEMON);
			setState(376);
			match(DOT);
			setState(377);
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
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_retreatAction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(PLAYER);
			setState(380);
			match(RETIRED);
			setState(381);
			card();
			setState(382);
			match(TO);
			setState(383);
			match(THE);
			setState(384);
			match(BENCH);
			setState(385);
			match(DOT);
			setState(386);
			match(NEWLINE);
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(387);
					subAction();
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public ShuffleActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffleAction; }
	}

	public final ShuffleActionContext shuffleAction() throws RecognitionException {
		ShuffleActionContext _localctx = new ShuffleActionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_shuffleAction);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(PLAYER);
				setState(394);
				match(SHUFFLED);
				setState(395);
				match(THEIR);
				setState(396);
				match(DECK);
				setState(397);
				match(DOT);
				setState(398);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(PLAYER);
				setState(400);
				match(SHUFFLED);
				setState(401);
				match(NUMBER);
				setState(402);
				match(CARDS);
				setState(403);
				match(INTO);
				setState(404);
				match(THEIR);
				setState(405);
				match(DECK);
				setState(406);
				match(DOT);
				setState(407);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(PLAYER);
				setState(409);
				match(SHUFFLED);
				setState(410);
				card();
				setState(411);
				match(INTO);
				setState(412);
				match(THEIR);
				setState(413);
				match(DECK);
				setState(414);
				match(DOT);
				setState(415);
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
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
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
		public List<CardContext> card() {
			return getRuleContexts(CardContext.class);
		}
		public CardContext card(int i) {
			return getRuleContext(CardContext.class,i);
		}
		public TerminalNode WAS() { return getToken(gTCGParser.WAS, 0); }
		public DiscardActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discardAction; }
	}

	public final DiscardActionContext discardAction() throws RecognitionException {
		DiscardActionContext _localctx = new DiscardActionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_discardAction);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(PLAYER);
				setState(420);
				match(DISCARDED);
				setState(421);
				match(CARD);
				setState(422);
				match(DOT);
				setState(423);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(PLAYER);
				setState(425);
				match(DISCARDED);
				setState(426);
				match(NUMBER);
				setState(427);
				match(CARDS);
				setState(428);
				match(DOT);
				setState(429);
				match(NEWLINE);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BULLET) {
					{
					setState(430);
					cardList();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(NUMBER);
				setState(434);
				match(CARDS);
				setState(435);
				match(WERE);
				setState(436);
				match(DISCARDED);
				setState(437);
				match(FROM);
				setState(438);
				match(PLAYER);
				setState(439);
				match(POSSESSIVE);
				setState(440);
				card();
				setState(441);
				match(DOT);
				setState(442);
				match(NEWLINE);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BULLET) {
					{
					setState(443);
					cardList();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				card();
				setState(447);
				match(WAS);
				setState(448);
				match(DISCARDED);
				setState(449);
				match(FROM);
				setState(450);
				match(PLAYER);
				setState(451);
				match(POSSESSIVE);
				setState(452);
				card();
				setState(453);
				match(DOT);
				setState(454);
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
		enterRule(_localctx, 46, RULE_prizeAction);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(PLAYER);
				setState(459);
				match(TAKE);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==A_SOMETHING) {
					{
					setState(460);
					match(A_SOMETHING);
					}
				}

				setState(463);
				match(PRIZE);
				setState(464);
				match(CARD_WORD);
				setState(465);
				match(DOT);
				setState(466);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(PLAYER);
				setState(468);
				match(TAKE);
				setState(469);
				match(NUMBER);
				setState(470);
				match(PRIZE_CARDS);
				setState(471);
				match(DOT);
				setState(472);
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
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_moveToHandAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(PLAYER);
			setState(476);
			match(MOVED);
			setState(477);
			match(PLAYER);
			setState(478);
			match(POSSESSIVE);
			setState(479);
			card();
			setState(480);
			match(TO);
			setState(481);
			match(THEIR);
			setState(482);
			match(HAND);
			setState(483);
			match(DOT);
			setState(484);
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
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_activeSpotAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(PLAYER);
			setState(487);
			match(POSSESSIVE);
			setState(488);
			card();
			setState(489);
			match(IS);
			setState(490);
			match(NOW);
			setState(491);
			match(IN);
			setState(492);
			match(THE);
			setState(493);
			match(ACTIVE);
			setState(494);
			match(SPOT);
			setState(495);
			match(DOT);
			setState(496);
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
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_knockoutAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(PLAYER);
			setState(499);
			match(POSSESSIVE);
			setState(500);
			card();
			setState(501);
			match(WAS);
			setState(502);
			match(KNOCKED);
			setState(503);
			match(OUT);
			setState(504);
			match(EXCLAMATION);
			setState(505);
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
		public TerminalNode SWITCH() { return getToken(gTCGParser.SWITCH, 0); }
		public CardMovedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardMovedAction; }
	}

	public final CardMovedActionContext cardMovedAction() throws RecognitionException {
		CardMovedActionContext _localctx = new CardMovedActionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cardMovedAction);
		int _la;
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_SOMETHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				match(A_SOMETHING);
				setState(508);
				match(CARD_WORD);
				setState(509);
				match(WAS);
				setState(510);
				match(ADDED);
				setState(511);
				match(TO);
				setState(512);
				match(PLAYER);
				setState(513);
				match(POSSESSIVE);
				setState(514);
				match(HAND);
				setState(515);
				match(DOT);
				setState(516);
				match(NEWLINE);
				}
				break;
			case SWITCH:
			case CARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				_la = _input.LA(1);
				if ( !(_la==SWITCH || _la==CARD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(518);
				match(WAS);
				setState(519);
				match(ADDED);
				setState(520);
				match(TO);
				setState(521);
				match(PLAYER);
				setState(522);
				match(POSSESSIVE);
				setState(523);
				match(HAND);
				setState(524);
				match(DOT);
				setState(525);
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
		public List<DamageLineContext> damageLine() {
			return getRuleContexts(DamageLineContext.class);
		}
		public DamageLineContext damageLine(int i) {
			return getRuleContext(DamageLineContext.class,i);
		}
		public SubActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAction; }
	}

	public final SubActionContext subAction() throws RecognitionException {
		SubActionContext _localctx = new SubActionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(HYPHEN);
			setState(529);
			subActionBody();
			setState(530);
			match(DOT);
			setState(531);
			match(NEWLINE);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BULLET) {
				{
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(532);
					cardList();
					}
					break;
				case 2:
					{
					setState(533);
					damageLine();
					}
					break;
				}
				}
				setState(538);
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
		public List<CardContext> card() {
			return getRuleContexts(CardContext.class);
		}
		public CardContext card(int i) {
			return getRuleContext(CardContext.class,i);
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
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
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
		enterRule(_localctx, 58, RULE_subActionBody);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(PLAYER);
				setState(540);
				match(DREW);
				setState(541);
				card();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(PLAYER);
				setState(543);
				match(DREW);
				setState(544);
				match(A_SOMETHING);
				setState(545);
				match(CARD_WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
				match(PLAYER);
				setState(547);
				match(DREW);
				setState(548);
				match(NUMBER);
				setState(549);
				match(CARDS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
				match(PLAYER);
				setState(551);
				match(DREW);
				setState(552);
				match(NUMBER);
				setState(553);
				match(CARDS);
				setState(554);
				match(AND);
				setState(555);
				match(PLAYED);
				setState(556);
				match(THEM);
				setState(557);
				match(TO);
				setState(558);
				match(THE);
				setState(559);
				match(BENCH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(560);
				match(PLAYER);
				setState(561);
				match(SHUFFLED);
				setState(562);
				match(THEIR);
				setState(563);
				match(DECK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(564);
				match(PLAYER);
				setState(565);
				match(SHUFFLED);
				setState(566);
				match(NUMBER);
				setState(567);
				match(CARDS);
				setState(568);
				match(INTO);
				setState(569);
				match(THEIR);
				setState(570);
				match(DECK);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(571);
				match(PLAYER);
				setState(572);
				match(SHUFFLED);
				setState(573);
				card();
				setState(574);
				match(INTO);
				setState(575);
				match(THEIR);
				setState(576);
				match(DECK);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(578);
				match(PLAYER);
				setState(579);
				match(DISCARDED);
				setState(580);
				match(CARD);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(581);
				match(PLAYER);
				setState(582);
				match(DISCARDED);
				setState(583);
				match(NUMBER);
				setState(584);
				match(CARDS);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(585);
				match(NUMBER);
				setState(586);
				match(CARDS);
				setState(587);
				match(WERE);
				setState(588);
				match(DISCARDED);
				setState(589);
				match(FROM);
				setState(590);
				match(PLAYER);
				setState(591);
				match(POSSESSIVE);
				setState(592);
				card();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(593);
				card();
				setState(594);
				match(WAS);
				setState(595);
				match(DISCARDED);
				setState(596);
				match(FROM);
				setState(597);
				match(PLAYER);
				setState(598);
				match(POSSESSIVE);
				setState(599);
				card();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(601);
				match(PLAYER);
				setState(602);
				match(TAKE);
				setState(603);
				match(PRIZE);
				setState(604);
				match(CARD);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(605);
				match(PLAYER);
				setState(606);
				match(TAKE);
				setState(607);
				match(NUMBER);
				setState(608);
				match(PRIZE);
				setState(609);
				match(CARDS);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(610);
				match(PLAYER);
				setState(611);
				match(MOVED);
				setState(612);
				match(PLAYER);
				setState(613);
				match(POSSESSIVE);
				setState(614);
				card();
				setState(615);
				match(TO);
				setState(616);
				match(THEIR);
				setState(617);
				match(HAND);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(619);
				match(PLAYER);
				setState(620);
				match(POSSESSIVE);
				setState(621);
				match(CARD);
				setState(622);
				match(WAS);
				setState(623);
				match(SWITCHED);
				setState(624);
				match(WITH);
				setState(625);
				match(PLAYER);
				setState(626);
				match(POSSESSIVE);
				setState(627);
				match(CARD);
				setState(628);
				match(TO);
				setState(629);
				match(BECOME);
				setState(630);
				match(THE);
				setState(631);
				match(ACTIVE);
				setState(632);
				match(POKEMON);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(633);
				match(PLAYER);
				setState(634);
				match(ATTACHED);
				setState(635);
				match(CARD);
				setState(636);
				match(TO);
				setState(637);
				match(CARD);
				setState(638);
				match(ON);
				setState(639);
				match(THE);
				setState(640);
				match(BENCH);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(641);
				match(PLAYER);
				setState(642);
				match(ATTACHED);
				setState(643);
				match(CARD);
				setState(644);
				match(TO);
				setState(645);
				match(CARD);
				setState(646);
				match(IN);
				setState(647);
				match(THE);
				setState(648);
				match(ACTIVE);
				setState(649);
				match(SPOT);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(650);
				match(PLAYER);
				setState(651);
				match(POSSESSIVE);
				setState(652);
				match(CARD);
				setState(653);
				match(TAKE);
				setState(654);
				match(NUMBER);
				setState(655);
				match(DAMAGE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(656);
				match(PLAYER);
				setState(657);
				match(EVOLVED);
				setState(658);
				match(CARD);
				setState(659);
				match(TO);
				setState(660);
				match(CARD);
				setState(661);
				match(IN);
				setState(662);
				match(THE);
				setState(663);
				match(ACTIVE);
				setState(664);
				match(SPOT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(665);
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
		enterRule(_localctx, 60, RULE_endTurn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(PLAYER);
			setState(669);
			match(ENDED);
			setState(670);
			match(THEIR);
			setState(671);
			match(TURN);
			setState(672);
			match(DOT);
			setState(673);
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
		enterRule(_localctx, 62, RULE_gameEnd);
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				match(ALL);
				setState(676);
				match(PRIZE_CARDS);
				setState(677);
				match(TAKEN);
				setState(678);
				match(DOT);
				setState(679);
				match(PLAYER);
				setState(680);
				match(WINS);
				setState(681);
				match(DOT);
				}
				break;
			case OPPONENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(OPPONENT);
				setState(683);
				match(CONCEDED);
				setState(684);
				match(DOT);
				setState(685);
				match(PLAYER);
				setState(686);
				match(WINS);
				setState(687);
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
		enterRule(_localctx, 64, RULE_cardList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(BULLET);
			setState(691);
			cardListItem();
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(692);
				match(COMMA);
				setState(693);
				cardListItem();
				}
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(699);
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
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public CardListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardListItem; }
	}

	public final CardListItemContext cardListItem() throws RecognitionException {
		CardListItemContext _localctx = new CardListItemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cardListItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			card();
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
	public static class CardContext extends ParserRuleContext {
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode SWITCH() { return getToken(gTCGParser.SWITCH, 0); }
		public CardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card; }
	}

	public final CardContext card() throws RecognitionException {
		CardContext _localctx = new CardContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_la = _input.LA(1);
			if ( !(_la==SWITCH || _la==CARD) ) {
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
	public static class AttackContext extends ParserRuleContext {
		public TerminalNode ATTACK() { return getToken(gTCGParser.ATTACK, 0); }
		public AttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attack; }
	}

	public final AttackContext attack() throws RecognitionException {
		AttackContext _localctx = new AttackContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_attack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
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
		enterRule(_localctx, 72, RULE_cardAddedToHand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
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
		"\u0004\u0001S\u02c6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000O\b\u0000\n\u0000\f\u0000R\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001Y\b\u0001\n\u0001\f\u0001"+
		"\\\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002c\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008b\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0094\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009e\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a8\b\t\n\t\f\t\u00ab"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00bd"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00d7\b\u000b\n\u000b\f\u000b\u00da\t\u000b\u0003\u000b"+
		"\u00dc\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00e6\b\f\u0003\f\u00e8\b\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00ed\b\f\n\f\f\f\u00f0\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00fe"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010f\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u011a\b\u000f\u0001\u000f\u0003\u000f\u011d"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0129"+
		"\b\u000f\u0001\u000f\u0005\u000f\u012c\b\u000f\n\u000f\f\u000f\u012f\t"+
		"\u000f\u0003\u000f\u0131\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0004\u0010\u0138\b\u0010\u000b\u0010\f\u0010\u0139"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0144\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0150\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u015a\b\u0011\u0001\u0011\u0003\u0011\u015d\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0166\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u016d\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0185\b\u0014\n\u0014\f\u0014\u0188\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u01a2\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01b0\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01bd\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01c9\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01ce\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01da\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u020f\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0217\b\u001c\n\u001c"+
		"\f\u001c\u021a\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u029b\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u02b1\b\u001f\u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u02b7\b \n \f \u02ba\t \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001$\u0001$\u0001$\u0000\u0000%\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFH\u0000\u0002\u0001\u0000\u0006\u0007\u0002\u000055FF\u02f2"+
		"\u0000J\u0001\u0000\u0000\u0000\u0002U\u0001\u0000\u0000\u0000\u0004b"+
		"\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bo\u0001\u0000"+
		"\u0000\u0000\nw\u0001\u0000\u0000\u0000\f\u007f\u0001\u0000\u0000\u0000"+
		"\u000e\u008c\u0001\u0000\u0000\u0000\u0010\u0095\u0001\u0000\u0000\u0000"+
		"\u0012\u00a2\u0001\u0000\u0000\u0000\u0014\u00bc\u0001\u0000\u0000\u0000"+
		"\u0016\u00db\u0001\u0000\u0000\u0000\u0018\u00dd\u0001\u0000\u0000\u0000"+
		"\u001a\u00f1\u0001\u0000\u0000\u0000\u001c\u0102\u0001\u0000\u0000\u0000"+
		"\u001e\u0113\u0001\u0000\u0000\u0000 \u0132\u0001\u0000\u0000\u0000\""+
		"\u015c\u0001\u0000\u0000\u0000$\u015e\u0001\u0000\u0000\u0000&\u0167\u0001"+
		"\u0000\u0000\u0000(\u017b\u0001\u0000\u0000\u0000*\u01a1\u0001\u0000\u0000"+
		"\u0000,\u01c8\u0001\u0000\u0000\u0000.\u01d9\u0001\u0000\u0000\u00000"+
		"\u01db\u0001\u0000\u0000\u00002\u01e6\u0001\u0000\u0000\u00004\u01f2\u0001"+
		"\u0000\u0000\u00006\u020e\u0001\u0000\u0000\u00008\u0210\u0001\u0000\u0000"+
		"\u0000:\u029a\u0001\u0000\u0000\u0000<\u029c\u0001\u0000\u0000\u0000>"+
		"\u02b0\u0001\u0000\u0000\u0000@\u02b2\u0001\u0000\u0000\u0000B\u02bd\u0001"+
		"\u0000\u0000\u0000D\u02bf\u0001\u0000\u0000\u0000F\u02c1\u0001\u0000\u0000"+
		"\u0000H\u02c3\u0001\u0000\u0000\u0000JP\u0003\u0002\u0001\u0000KL\u0005"+
		"R\u0000\u0000LO\u0003\u0012\t\u0000MO\u0003>\u001f\u0000NK\u0001\u0000"+
		"\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000ST\u0005\u0000\u0000\u0001T\u0001\u0001\u0000"+
		"\u0000\u0000UV\u0005\u0004\u0000\u0000VZ\u0005R\u0000\u0000WY\u0003\u0004"+
		"\u0002\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0003\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]c\u0003\u0006\u0003\u0000^c\u0003\b"+
		"\u0004\u0000_c\u0003\n\u0005\u0000`c\u0003\f\u0006\u0000ac\u0003\u0010"+
		"\b\u0000b]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000b_\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\u0005"+
		"\u0001\u0000\u0000\u0000de\u0005I\u0000\u0000ef\u0005\u0005\u0000\u0000"+
		"fg\u0007\u0000\u0000\u0000gh\u0005\b\u0000\u0000hi\u0005\t\u0000\u0000"+
		"ij\u0005\n\u0000\u0000jk\u0005\u000b\u0000\u0000kl\u0005\f\u0000\u0000"+
		"lm\u0005J\u0000\u0000mn\u0005R\u0000\u0000n\u0007\u0001\u0000\u0000\u0000"+
		"op\u0005I\u0000\u0000pq\u0005\r\u0000\u0000qr\u0005\t\u0000\u0000rs\u0005"+
		"\u000b\u0000\u0000st\u0005\u000e\u0000\u0000tu\u0005J\u0000\u0000uv\u0005"+
		"R\u0000\u0000v\t\u0001\u0000\u0000\u0000wx\u0005I\u0000\u0000xy\u0005"+
		"\u000f\u0000\u0000yz\u0005\u0010\u0000\u0000z{\u0005\u0011\u0000\u0000"+
		"{|\u0005\u0012\u0000\u0000|}\u0005J\u0000\u0000}~\u0005R\u0000\u0000~"+
		"\u000b\u0001\u0000\u0000\u0000\u007f\u0080\u0005I\u0000\u0000\u0080\u0081"+
		"\u0005\u0013\u0000\u0000\u0081\u0082\u0005H\u0000\u0000\u0082\u0083\u0005"+
		"\u0015\u0000\u0000\u0083\u0084\u0005\b\u0000\u0000\u0084\u0085\u0005\t"+
		"\u0000\u0000\u0085\u0086\u0005\n\u0000\u0000\u0086\u0087\u0005\u0017\u0000"+
		"\u0000\u0087\u0088\u0005J\u0000\u0000\u0088\u008a\u0005R\u0000\u0000\u0089"+
		"\u008b\u0003\u000e\u0007\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005Q\u0000\u0000\u008d\u008e\u0005H\u0000\u0000\u008e\u008f\u0005\u0014"+
		"\u0000\u0000\u008f\u0090\u0005\u0015\u0000\u0000\u0090\u0091\u0005J\u0000"+
		"\u0000\u0091\u0093\u0005R\u0000\u0000\u0092\u0094\u0003@ \u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u000f\u0001\u0000\u0000\u0000\u0095\u0096\u0005I\u0000\u0000\u0096\u0097"+
		"\u0005\u0018\u0000\u0000\u0097\u0098\u0003D\"\u0000\u0098\u0099\u0005"+
		"\u0010\u0000\u0000\u0099\u009d\u0005\t\u0000\u0000\u009a\u009b\u0005$"+
		"\u0000\u0000\u009b\u009e\u0005%\u0000\u0000\u009c\u009e\u0005&\u0000\u0000"+
		"\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005J\u0000\u0000\u00a0"+
		"\u00a1\u0005R\u0000\u0000\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005I\u0000\u0000\u00a3\u00a4\u0005E\u0000\u0000\u00a4\u00a5\u0005\u0001"+
		"\u0000\u0000\u00a5\u00a9\u0005R\u0000\u0000\u00a6\u00a8\u0003\u0014\n"+
		"\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00bd\u0003\u0016\u000b\u0000\u00ad\u00bd\u0003\u0018\f\u0000"+
		"\u00ae\u00bd\u0003\u001a\r\u0000\u00af\u00bd\u0003\u001c\u000e\u0000\u00b0"+
		"\u00bd\u0003\u001e\u000f\u0000\u00b1\u00bd\u0003$\u0012\u0000\u00b2\u00bd"+
		"\u0003(\u0014\u0000\u00b3\u00bd\u0003*\u0015\u0000\u00b4\u00bd\u00036"+
		"\u001b\u0000\u00b5\u00bd\u0003,\u0016\u0000\u00b6\u00bd\u0003.\u0017\u0000"+
		"\u00b7\u00bd\u00030\u0018\u0000\u00b8\u00bd\u00032\u0019\u0000\u00b9\u00bd"+
		"\u00034\u001a\u0000\u00ba\u00bd\u00038\u001c\u0000\u00bb\u00bd\u0003<"+
		"\u001e\u0000\u00bc\u00ac\u0001\u0000\u0000\u0000\u00bc\u00ad\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ae\u0001\u0000\u0000\u0000\u00bc\u00af\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b0\u0001\u0000\u0000\u0000\u00bc\u00b1\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b2\u0001\u0000\u0000\u0000\u00bc\u00b3\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc\u00b5\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001\u0000"+
		"\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u0015\u0001\u0000\u0000\u0000\u00be\u00bf\u0005I\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0013\u0000\u0000\u00c0\u00c1\u0005\u0016\u0000"+
		"\u0000\u00c1\u00c2\u0005J\u0000\u0000\u00c2\u00dc\u0005R\u0000\u0000\u00c3"+
		"\u00c4\u0005I\u0000\u0000\u00c4\u00c5\u0005\u0013\u0000\u0000\u00c5\u00c6"+
		"\u0005>\u0000\u0000\u00c6\u00c7\u0005\u0016\u0000\u0000\u00c7\u00c8\u0005"+
		"J\u0000\u0000\u00c8\u00dc\u0005R\u0000\u0000\u00c9\u00ca\u0005I\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0013\u0000\u0000\u00cb\u00cc\u0003D\"\u0000"+
		"\u00cc\u00cd\u0005J\u0000\u0000\u00cd\u00ce\u0005R\u0000\u0000\u00ce\u00dc"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005I\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0013\u0000\u0000\u00d1\u00d2\u0005H\u0000\u0000\u00d2\u00d3\u0005\u0015"+
		"\u0000\u0000\u00d3\u00d4\u0005J\u0000\u0000\u00d4\u00d8\u0005R\u0000\u0000"+
		"\u00d5\u00d7\u00038\u001c\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00db\u00be\u0001\u0000\u0000\u0000\u00db"+
		"\u00c3\u0001\u0000\u0000\u0000\u00db\u00c9\u0001\u0000\u0000\u0000\u00db"+
		"\u00cf\u0001\u0000\u0000\u0000\u00dc\u0017\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0005I\u0000\u0000\u00de\u00df\u0005\u0018\u0000\u0000\u00df\u00e7"+
		"\u0003D\"\u0000\u00e0\u00e1\u0005\u0010\u0000\u0000\u00e1\u00e5\u0005"+
		"\t\u0000\u0000\u00e2\u00e6\u0005&\u0000\u0000\u00e3\u00e4\u0005$\u0000"+
		"\u0000\u00e4\u00e6\u0005%\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e0\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005J\u0000\u0000\u00ea"+
		"\u00ee\u0005R\u0000\u0000\u00eb\u00ed\u00038\u001c\u0000\u00ec\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u0019\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"I\u0000\u0000\u00f2\u00f3\u0005\u0019\u0000\u0000\u00f3\u00f4\u0003D\""+
		"\u0000\u00f4\u00f5\u0005\u0010\u0000\u0000\u00f5\u00fd\u0003D\"\u0000"+
		"\u00f6\u00f7\u0005\u001c\u0000\u0000\u00f7\u00f8\u0005\t\u0000\u0000\u00f8"+
		"\u00fe\u0005&\u0000\u0000\u00f9\u00fa\u0005\u001d\u0000\u0000\u00fa\u00fb"+
		"\u0005\t\u0000\u0000\u00fb\u00fc\u0005$\u0000\u0000\u00fc\u00fe\u0005"+
		"%\u0000\u0000\u00fd\u00f6\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0005J\u0000"+
		"\u0000\u0100\u0101\u0005R\u0000\u0000\u0101\u001b\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0005I\u0000\u0000\u0103\u0104\u0005\u001a\u0000\u0000\u0104"+
		"\u0105\u0003D\"\u0000\u0105\u0106\u0005\u0010\u0000\u0000\u0106\u010e"+
		"\u0003D\"\u0000\u0107\u0108\u0005\u001c\u0000\u0000\u0108\u0109\u0005"+
		"\t\u0000\u0000\u0109\u010f\u0005&\u0000\u0000\u010a\u010b\u0005\u001d"+
		"\u0000\u0000\u010b\u010c\u0005\t\u0000\u0000\u010c\u010d\u0005$\u0000"+
		"\u0000\u010d\u010f\u0005%\u0000\u0000\u010e\u0107\u0001\u0000\u0000\u0000"+
		"\u010e\u010a\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0005J\u0000\u0000\u0111\u0112\u0005R\u0000\u0000\u0112\u001d"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0005I\u0000\u0000\u0114\u0115\u0005"+
		"E\u0000\u0000\u0115\u0116\u0003D\"\u0000\u0116\u0117\u0005\u001b\u0000"+
		"\u0000\u0117\u0119\u0003F#\u0000\u0118\u011a\u0005J\u0000\u0000\u0119"+
		"\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011c\u0001\u0000\u0000\u0000\u011b\u011d\u0005R\u0000\u0000\u011c\u011b"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0130"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u001c\u0000\u0000\u011f\u0120"+
		"\u0005I\u0000\u0000\u0120\u0121\u0005E\u0000\u0000\u0121\u0122\u0003D"+
		"\"\u0000\u0122\u0123\u0005\b\u0000\u0000\u0123\u0124\u0005H\u0000\u0000"+
		"\u0124\u0125\u0005\'\u0000\u0000\u0125\u0126\u0005J\u0000\u0000\u0126"+
		"\u0128\u0005R\u0000\u0000\u0127\u0129\u0003 \u0010\u0000\u0128\u0127\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012d\u0001"+
		"\u0000\u0000\u0000\u012a\u012c\u00038\u001c\u0000\u012b\u012a\u0001\u0000"+
		"\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0131\u0001\u0000"+
		"\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u011e\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u001f\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0005Q\u0000\u0000\u0133\u0134\u0005A\u0000\u0000"+
		"\u0134\u0135\u0005L\u0000\u0000\u0135\u0137\u0005R\u0000\u0000\u0136\u0138"+
		"\u0003\"\u0011\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001"+
		"\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0005"+
		"R\u0000\u0000\u013c!\u0001\u0000\u0000\u0000\u013d\u013e\u0005P\u0000"+
		"\u0000\u013e\u013f\u0005B\u0000\u0000\u013f\u0140\u0005L\u0000\u0000\u0140"+
		"\u0141\u0005H\u0000\u0000\u0141\u0143\u0005\'\u0000\u0000\u0142\u0144"+
		"\u0005J\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u015d\u0005"+
		"R\u0000\u0000\u0146\u0147\u0005P\u0000\u0000\u0147\u0148\u0005N\u0000"+
		"\u0000\u0148\u0149\u0005D\u0000\u0000\u0149\u014a\u0005O\u0000\u0000\u014a"+
		"\u014b\u0003D\"\u0000\u014b\u014c\u0005L\u0000\u0000\u014c\u014d\u0005"+
		"H\u0000\u0000\u014d\u014f\u0005\'\u0000\u0000\u014e\u0150\u0005J\u0000"+
		"\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0005R\u0000\u0000"+
		"\u0152\u015d\u0001\u0000\u0000\u0000\u0153\u0154\u0005P\u0000\u0000\u0154"+
		"\u0155\u0005C\u0000\u0000\u0155\u0156\u0005L\u0000\u0000\u0156\u0157\u0005"+
		"H\u0000\u0000\u0157\u0159\u0005\'\u0000\u0000\u0158\u015a\u0005J\u0000"+
		"\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0005R\u0000\u0000"+
		"\u015c\u013d\u0001\u0000\u0000\u0000\u015c\u0146\u0001\u0000\u0000\u0000"+
		"\u015c\u0153\u0001\u0000\u0000\u0000\u015d#\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u0005I\u0000\u0000\u015f\u0160\u0005\u0018\u0000\u0000\u0160\u0161"+
		"\u00055\u0000\u0000\u0161\u0162\u0005J\u0000\u0000\u0162\u0163\u0005R"+
		"\u0000\u0000\u0163\u0165\u0003&\u0013\u0000\u0164\u0166\u00032\u0019\u0000"+
		"\u0165\u0164\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000"+
		"\u0166%\u0001\u0000\u0000\u0000\u0167\u0168\u0005Q\u0000\u0000\u0168\u0169"+
		"\u0005I\u0000\u0000\u0169\u016a\u0005E\u0000\u0000\u016a\u016c\u0003D"+
		"\"\u0000\u016b\u016d\u0005\u001f\u0000\u0000\u016c\u016b\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u00056\u0000\u0000\u016f\u0170\u0005\u001e\u0000\u0000"+
		"\u0170\u0171\u0005I\u0000\u0000\u0171\u0172\u0005E\u0000\u0000\u0172\u0173"+
		"\u0003D\"\u0000\u0173\u0174\u0005\u0010\u0000\u0000\u0174\u0175\u0005"+
		"#\u0000\u0000\u0175\u0176\u0005\t\u0000\u0000\u0176\u0177\u0005$\u0000"+
		"\u0000\u0177\u0178\u0005\u0002\u0000\u0000\u0178\u0179\u0005J\u0000\u0000"+
		"\u0179\u017a\u0005R\u0000\u0000\u017a\'\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0005I\u0000\u0000\u017c\u017d\u00057\u0000\u0000\u017d\u017e\u0003"+
		"D\"\u0000\u017e\u017f\u0005\u0010\u0000\u0000\u017f\u0180\u0005\t\u0000"+
		"\u0000\u0180\u0181\u0005&\u0000\u0000\u0181\u0182\u0005J\u0000\u0000\u0182"+
		"\u0186\u0005R\u0000\u0000\u0183\u0185\u00038\u001c\u0000\u0184\u0183\u0001"+
		"\u0000\u0000\u0000\u0185\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187)\u0001\u0000"+
		"\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u018a\u0005I\u0000"+
		"\u0000\u018a\u018b\u0005*\u0000\u0000\u018b\u018c\u0005-\u0000\u0000\u018c"+
		"\u018d\u0005+\u0000\u0000\u018d\u018e\u0005J\u0000\u0000\u018e\u01a2\u0005"+
		"R\u0000\u0000\u018f\u0190\u0005I\u0000\u0000\u0190\u0191\u0005*\u0000"+
		"\u0000\u0191\u0192\u0005H\u0000\u0000\u0192\u0193\u0005\u0015\u0000\u0000"+
		"\u0193\u0194\u0005,\u0000\u0000\u0194\u0195\u0005-\u0000\u0000\u0195\u0196"+
		"\u0005+\u0000\u0000\u0196\u0197\u0005J\u0000\u0000\u0197\u01a2\u0005R"+
		"\u0000\u0000\u0198\u0199\u0005I\u0000\u0000\u0199\u019a\u0005*\u0000\u0000"+
		"\u019a\u019b\u0003D\"\u0000\u019b\u019c\u0005,\u0000\u0000\u019c\u019d"+
		"\u0005-\u0000\u0000\u019d\u019e\u0005+\u0000\u0000\u019e\u019f\u0005J"+
		"\u0000\u0000\u019f\u01a0\u0005R\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a1\u0189\u0001\u0000\u0000\u0000\u01a1\u018f\u0001\u0000\u0000"+
		"\u0000\u01a1\u0198\u0001\u0000\u0000\u0000\u01a2+\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0005I\u0000\u0000\u01a4\u01a5\u0005(\u0000\u0000\u01a5\u01a6"+
		"\u0005F\u0000\u0000\u01a6\u01a7\u0005J\u0000\u0000\u01a7\u01c9\u0005R"+
		"\u0000\u0000\u01a8\u01a9\u0005I\u0000\u0000\u01a9\u01aa\u0005(\u0000\u0000"+
		"\u01aa\u01ab\u0005H\u0000\u0000\u01ab\u01ac\u0005\u0015\u0000\u0000\u01ac"+
		"\u01ad\u0005J\u0000\u0000\u01ad\u01af\u0005R\u0000\u0000\u01ae\u01b0\u0003"+
		"@ \u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b0\u01c9\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005H\u0000\u0000"+
		"\u01b2\u01b3\u0005\u0015\u0000\u0000\u01b3\u01b4\u0005 \u0000\u0000\u01b4"+
		"\u01b5\u0005(\u0000\u0000\u01b5\u01b6\u0005.\u0000\u0000\u01b6\u01b7\u0005"+
		"I\u0000\u0000\u01b7\u01b8\u0005E\u0000\u0000\u01b8\u01b9\u0003D\"\u0000"+
		"\u01b9\u01ba\u0005J\u0000\u0000\u01ba\u01bc\u0005R\u0000\u0000\u01bb\u01bd"+
		"\u0003@ \u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bd\u01c9\u0001\u0000\u0000\u0000\u01be\u01bf\u0003D\""+
		"\u0000\u01bf\u01c0\u0005\u001f\u0000\u0000\u01c0\u01c1\u0005(\u0000\u0000"+
		"\u01c1\u01c2\u0005.\u0000\u0000\u01c2\u01c3\u0005I\u0000\u0000\u01c3\u01c4"+
		"\u0005E\u0000\u0000\u01c4\u01c5\u0003D\"\u0000\u01c5\u01c6\u0005J\u0000"+
		"\u0000\u01c6\u01c7\u0005R\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c8\u01a3\u0001\u0000\u0000\u0000\u01c8\u01a8\u0001\u0000\u0000\u0000"+
		"\u01c8\u01b1\u0001\u0000\u0000\u0000\u01c8\u01be\u0001\u0000\u0000\u0000"+
		"\u01c9-\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005I\u0000\u0000\u01cb\u01cd"+
		"\u00050\u0000\u0000\u01cc\u01ce\u0005>\u0000\u0000\u01cd\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u00051\u0000\u0000\u01d0\u01d1\u0005\u0016\u0000"+
		"\u0000\u01d1\u01d2\u0005J\u0000\u0000\u01d2\u01da\u0005R\u0000\u0000\u01d3"+
		"\u01d4\u0005I\u0000\u0000\u01d4\u01d5\u00050\u0000\u0000\u01d5\u01d6\u0005"+
		"H\u0000\u0000\u01d6\u01d7\u00052\u0000\u0000\u01d7\u01d8\u0005J\u0000"+
		"\u0000\u01d8\u01da\u0005R\u0000\u0000\u01d9\u01ca\u0001\u0000\u0000\u0000"+
		"\u01d9\u01d3\u0001\u0000\u0000\u0000\u01da/\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0005I\u0000\u0000\u01dc\u01dd\u0005/\u0000\u0000\u01dd\u01de\u0005"+
		"I\u0000\u0000\u01de\u01df\u0005E\u0000\u0000\u01df\u01e0\u0003D\"\u0000"+
		"\u01e0\u01e1\u0005\u0010\u0000\u0000\u01e1\u01e2\u0005-\u0000\u0000\u01e2"+
		"\u01e3\u0005\u0017\u0000\u0000\u01e3\u01e4\u0005J\u0000\u0000\u01e4\u01e5"+
		"\u0005R\u0000\u0000\u01e51\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005I"+
		"\u0000\u0000\u01e7\u01e8\u0005E\u0000\u0000\u01e8\u01e9\u0003D\"\u0000"+
		"\u01e9\u01ea\u0005!\u0000\u0000\u01ea\u01eb\u0005\"\u0000\u0000\u01eb"+
		"\u01ec\u0005\u001d\u0000\u0000\u01ec\u01ed\u0005\t\u0000\u0000\u01ed\u01ee"+
		"\u0005$\u0000\u0000\u01ee\u01ef\u0005%\u0000\u0000\u01ef\u01f0\u0005J"+
		"\u0000\u0000\u01f0\u01f1\u0005R\u0000\u0000\u01f13\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f3\u0005I\u0000\u0000\u01f3\u01f4\u0005E\u0000\u0000\u01f4\u01f5"+
		"\u0003D\"\u0000\u01f5\u01f6\u0005\u001f\u0000\u0000\u01f6\u01f7\u0005"+
		"3\u0000\u0000\u01f7\u01f8\u00054\u0000\u0000\u01f8\u01f9\u0005M\u0000"+
		"\u0000\u01f9\u01fa\u0005R\u0000\u0000\u01fa5\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0005>\u0000\u0000\u01fc\u01fd\u0005\u0016\u0000\u0000\u01fd\u01fe"+
		"\u0005\u001f\u0000\u0000\u01fe\u01ff\u0005\u0003\u0000\u0000\u01ff\u0200"+
		"\u0005\u0010\u0000\u0000\u0200\u0201\u0005I\u0000\u0000\u0201\u0202\u0005"+
		"E\u0000\u0000\u0202\u0203\u0005\u0017\u0000\u0000\u0203\u0204\u0005J\u0000"+
		"\u0000\u0204\u020f\u0005R\u0000\u0000\u0205\u0206\u0007\u0001\u0000\u0000"+
		"\u0206\u0207\u0005\u001f\u0000\u0000\u0207\u0208\u0005\u0003\u0000\u0000"+
		"\u0208\u0209\u0005\u0010\u0000\u0000\u0209\u020a\u0005I\u0000\u0000\u020a"+
		"\u020b\u0005E\u0000\u0000\u020b\u020c\u0005\u0017\u0000\u0000\u020c\u020d"+
		"\u0005J\u0000\u0000\u020d\u020f\u0005R\u0000\u0000\u020e\u01fb\u0001\u0000"+
		"\u0000\u0000\u020e\u0205\u0001\u0000\u0000\u0000\u020f7\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0005Q\u0000\u0000\u0211\u0212\u0003:\u001d\u0000\u0212"+
		"\u0213\u0005J\u0000\u0000\u0213\u0218\u0005R\u0000\u0000\u0214\u0217\u0003"+
		"@ \u0000\u0215\u0217\u0003\"\u0011\u0000\u0216\u0214\u0001\u0000\u0000"+
		"\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0217\u021a\u0001\u0000\u0000"+
		"\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000"+
		"\u0000\u02199\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000"+
		"\u021b\u021c\u0005I\u0000\u0000\u021c\u021d\u0005\u0013\u0000\u0000\u021d"+
		"\u029b\u0003D\"\u0000\u021e\u021f\u0005I\u0000\u0000\u021f\u0220\u0005"+
		"\u0013\u0000\u0000\u0220\u0221\u0005>\u0000\u0000\u0221\u029b\u0005\u0016"+
		"\u0000\u0000\u0222\u0223\u0005I\u0000\u0000\u0223\u0224\u0005\u0013\u0000"+
		"\u0000\u0224\u0225\u0005H\u0000\u0000\u0225\u029b\u0005\u0015\u0000\u0000"+
		"\u0226\u0227\u0005I\u0000\u0000\u0227\u0228\u0005\u0013\u0000\u0000\u0228"+
		"\u0229\u0005H\u0000\u0000\u0229\u022a\u0005\u0015\u0000\u0000\u022a\u022b"+
		"\u0005?\u0000\u0000\u022b\u022c\u0005\u0018\u0000\u0000\u022c\u022d\u0005"+
		"@\u0000\u0000\u022d\u022e\u0005\u0010\u0000\u0000\u022e\u022f\u0005\t"+
		"\u0000\u0000\u022f\u029b\u0005&\u0000\u0000\u0230\u0231\u0005I\u0000\u0000"+
		"\u0231\u0232\u0005*\u0000\u0000\u0232\u0233\u0005-\u0000\u0000\u0233\u029b"+
		"\u0005+\u0000\u0000\u0234\u0235\u0005I\u0000\u0000\u0235\u0236\u0005*"+
		"\u0000\u0000\u0236\u0237\u0005H\u0000\u0000\u0237\u0238\u0005\u0015\u0000"+
		"\u0000\u0238\u0239\u0005,\u0000\u0000\u0239\u023a\u0005-\u0000\u0000\u023a"+
		"\u029b\u0005+\u0000\u0000\u023b\u023c\u0005I\u0000\u0000\u023c\u023d\u0005"+
		"*\u0000\u0000\u023d\u023e\u0003D\"\u0000\u023e\u023f\u0005,\u0000\u0000"+
		"\u023f\u0240\u0005-\u0000\u0000\u0240\u0241\u0005+\u0000\u0000\u0241\u029b"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0005I\u0000\u0000\u0243\u0244\u0005"+
		"(\u0000\u0000\u0244\u029b\u0005F\u0000\u0000\u0245\u0246\u0005I\u0000"+
		"\u0000\u0246\u0247\u0005(\u0000\u0000\u0247\u0248\u0005H\u0000\u0000\u0248"+
		"\u029b\u0005\u0015\u0000\u0000\u0249\u024a\u0005H\u0000\u0000\u024a\u024b"+
		"\u0005\u0015\u0000\u0000\u024b\u024c\u0005 \u0000\u0000\u024c\u024d\u0005"+
		"(\u0000\u0000\u024d\u024e\u0005.\u0000\u0000\u024e\u024f\u0005I\u0000"+
		"\u0000\u024f\u0250\u0005E\u0000\u0000\u0250\u029b\u0003D\"\u0000\u0251"+
		"\u0252\u0003D\"\u0000\u0252\u0253\u0005\u001f\u0000\u0000\u0253\u0254"+
		"\u0005(\u0000\u0000\u0254\u0255\u0005.\u0000\u0000\u0255\u0256\u0005I"+
		"\u0000\u0000\u0256\u0257\u0005E\u0000\u0000\u0257\u0258\u0003D\"\u0000"+
		"\u0258\u029b\u0001\u0000\u0000\u0000\u0259\u025a\u0005I\u0000\u0000\u025a"+
		"\u025b\u00050\u0000\u0000\u025b\u025c\u00051\u0000\u0000\u025c\u029b\u0005"+
		"F\u0000\u0000\u025d\u025e\u0005I\u0000\u0000\u025e\u025f\u00050\u0000"+
		"\u0000\u025f\u0260\u0005H\u0000\u0000\u0260\u0261\u00051\u0000\u0000\u0261"+
		"\u029b\u0005\u0015\u0000\u0000\u0262\u0263\u0005I\u0000\u0000\u0263\u0264"+
		"\u0005/\u0000\u0000\u0264\u0265\u0005I\u0000\u0000\u0265\u0266\u0005E"+
		"\u0000\u0000\u0266\u0267\u0003D\"\u0000\u0267\u0268\u0005\u0010\u0000"+
		"\u0000\u0268\u0269\u0005-\u0000\u0000\u0269\u026a\u0005\u0017\u0000\u0000"+
		"\u026a\u029b\u0001\u0000\u0000\u0000\u026b\u026c\u0005I\u0000\u0000\u026c"+
		"\u026d\u0005E\u0000\u0000\u026d\u026e\u0005F\u0000\u0000\u026e\u026f\u0005"+
		"\u001f\u0000\u0000\u026f\u0270\u00056\u0000\u0000\u0270\u0271\u0005\u001e"+
		"\u0000\u0000\u0271\u0272\u0005I\u0000\u0000\u0272\u0273\u0005E\u0000\u0000"+
		"\u0273\u0274\u0005F\u0000\u0000\u0274\u0275\u0005\u0010\u0000\u0000\u0275"+
		"\u0276\u0005#\u0000\u0000\u0276\u0277\u0005\t\u0000\u0000\u0277\u0278"+
		"\u0005$\u0000\u0000\u0278\u029b\u0005\u0002\u0000\u0000\u0279\u027a\u0005"+
		"I\u0000\u0000\u027a\u027b\u0005\u0019\u0000\u0000\u027b\u027c\u0005F\u0000"+
		"\u0000\u027c\u027d\u0005\u0010\u0000\u0000\u027d\u027e\u0005F\u0000\u0000"+
		"\u027e\u027f\u0005\u001c\u0000\u0000\u027f\u0280\u0005\t\u0000\u0000\u0280"+
		"\u029b\u0005&\u0000\u0000\u0281\u0282\u0005I\u0000\u0000\u0282\u0283\u0005"+
		"\u0019\u0000\u0000\u0283\u0284\u0005F\u0000\u0000\u0284\u0285\u0005\u0010"+
		"\u0000\u0000\u0285\u0286\u0005F\u0000\u0000\u0286\u0287\u0005\u001d\u0000"+
		"\u0000\u0287\u0288\u0005\t\u0000\u0000\u0288\u0289\u0005$\u0000\u0000"+
		"\u0289\u029b\u0005%\u0000\u0000\u028a\u028b\u0005I\u0000\u0000\u028b\u028c"+
		"\u0005E\u0000\u0000\u028c\u028d\u0005F\u0000\u0000\u028d\u028e\u00050"+
		"\u0000\u0000\u028e\u028f\u0005H\u0000\u0000\u028f\u029b\u0005\'\u0000"+
		"\u0000\u0290\u0291\u0005I\u0000\u0000\u0291\u0292\u0005\u001a\u0000\u0000"+
		"\u0292\u0293\u0005F\u0000\u0000\u0293\u0294\u0005\u0010\u0000\u0000\u0294"+
		"\u0295\u0005F\u0000\u0000\u0295\u0296\u0005\u001d\u0000\u0000\u0296\u0297"+
		"\u0005\t\u0000\u0000\u0297\u0298\u0005$\u0000\u0000\u0298\u029b\u0005"+
		"%\u0000\u0000\u0299\u029b\u0003H$\u0000\u029a\u021b\u0001\u0000\u0000"+
		"\u0000\u029a\u021e\u0001\u0000\u0000\u0000\u029a\u0222\u0001\u0000\u0000"+
		"\u0000\u029a\u0226\u0001\u0000\u0000\u0000\u029a\u0230\u0001\u0000\u0000"+
		"\u0000\u029a\u0234\u0001\u0000\u0000\u0000\u029a\u023b\u0001\u0000\u0000"+
		"\u0000\u029a\u0242\u0001\u0000\u0000\u0000\u029a\u0245\u0001\u0000\u0000"+
		"\u0000\u029a\u0249\u0001\u0000\u0000\u0000\u029a\u0251\u0001\u0000\u0000"+
		"\u0000\u029a\u0259\u0001\u0000\u0000\u0000\u029a\u025d\u0001\u0000\u0000"+
		"\u0000\u029a\u0262\u0001\u0000\u0000\u0000\u029a\u026b\u0001\u0000\u0000"+
		"\u0000\u029a\u0279\u0001\u0000\u0000\u0000\u029a\u0281\u0001\u0000\u0000"+
		"\u0000\u029a\u028a\u0001\u0000\u0000\u0000\u029a\u0290\u0001\u0000\u0000"+
		"\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029b;\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u0005I\u0000\u0000\u029d\u029e\u00058\u0000\u0000\u029e\u029f"+
		"\u0005-\u0000\u0000\u029f\u02a0\u0005\u0001\u0000\u0000\u02a0\u02a1\u0005"+
		"J\u0000\u0000\u02a1\u02a2\u0005R\u0000\u0000\u02a2=\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a4\u0005<\u0000\u0000\u02a4\u02a5\u00052\u0000\u0000\u02a5"+
		"\u02a6\u0005=\u0000\u0000\u02a6\u02a7\u0005J\u0000\u0000\u02a7\u02a8\u0005"+
		"I\u0000\u0000\u02a8\u02a9\u0005;\u0000\u0000\u02a9\u02b1\u0005J\u0000"+
		"\u0000\u02aa\u02ab\u00059\u0000\u0000\u02ab\u02ac\u0005:\u0000\u0000\u02ac"+
		"\u02ad\u0005J\u0000\u0000\u02ad\u02ae\u0005I\u0000\u0000\u02ae\u02af\u0005"+
		";\u0000\u0000\u02af\u02b1\u0005J\u0000\u0000\u02b0\u02a3\u0001\u0000\u0000"+
		"\u0000\u02b0\u02aa\u0001\u0000\u0000\u0000\u02b1?\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b3\u0005P\u0000\u0000\u02b3\u02b8\u0003B!\u0000\u02b4\u02b5"+
		"\u0005K\u0000\u0000\u02b5\u02b7\u0003B!\u0000\u02b6\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b7\u02ba\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02bb\u0001\u0000"+
		"\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02bb\u02bc\u0005R\u0000"+
		"\u0000\u02bcA\u0001\u0000\u0000\u0000\u02bd\u02be\u0003D\"\u0000\u02be"+
		"C\u0001\u0000\u0000\u0000\u02bf\u02c0\u0007\u0001\u0000\u0000\u02c0E\u0001"+
		"\u0000\u0000\u0000\u02c1\u02c2\u0005G\u0000\u0000\u02c2G\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c4\u0005\u0003\u0000\u0000\u02c4I\u0001\u0000\u0000\u0000"+
		")NPZb\u008a\u0093\u009d\u00a9\u00bc\u00d8\u00db\u00e5\u00e7\u00ee\u00fd"+
		"\u010e\u0119\u011c\u0128\u012d\u0130\u0139\u0143\u014f\u0159\u015c\u0165"+
		"\u016c\u0186\u01a1\u01af\u01bc\u01c8\u01cd\u01d9\u020e\u0216\u0218\u029a"+
		"\u02b0\u02b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}