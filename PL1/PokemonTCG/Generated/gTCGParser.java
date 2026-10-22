// Generated from ./gTCGParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gTCGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TURN=1, POKEMON=2, ADDED=3, SETUP=4, CHOSE=5, HEADS=6, TAILS=7, FOR=8, 
		THE=9, OPENING=10, COIN=11, FLIP=12, FLIPPED=13, WON=14, TOSS=15, DECIDED=16, 
		TO=17, GO=18, FIRST=19, DREW=20, DRAWN=21, CARDS=22, CARD_WORD=23, ABILITY_WORD=24, 
		ATTACK_WORD=25, POKEMON_TOOL=26, HAND=27, PLAYED=28, ATTACHED=29, EVOLVED=30, 
		USED=31, ON=32, IN=33, IT=34, WITH=35, WAS=36, WERE=37, IS=38, NOW=39, 
		BECOME=40, LANDED=41, ACTIVE=42, SPOT=43, BENCH=44, STADIUM=45, DAMAGE=46, 
		DISCARDED=47, DISCARDS=48, SHUFFLED=49, DECK=50, INTO=51, THEIR=52, FROM=53, 
		MOVED=54, TAKE=55, PRIZE=56, PRIZE_CARDS=57, KNOCKED=58, OUT=59, SWITCHED=60, 
		RETIRED=61, ENDED=62, OPPONENT=63, CONCEDED=64, WINS=65, ALL=66, TAKEN=67, 
		A_SOMETHING=68, AND=69, THEM=70, ENERGY=71, SELECTED=72, DAMAGE_BREAKDOWN=73, 
		BASE_DAMAGE=74, TOTAL_DAMAGE=75, ITEM=76, POSSESSIVE=77, CARD=78, ATTACK=79, 
		ABILITY=80, NUMBER=81, PLAYER=82, DOT=83, COMMA=84, COLON=85, EXCLAMATION=86, 
		LPAREN=87, RPAREN=88, BULLET=89, HYPHEN=90, NEWLINE=91, WS=92;
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
		RULE_flippedAction = 30, RULE_endTurn = 31, RULE_gameEnd = 32, RULE_cardList = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"log", "setup", "setupAction", "coinChoice", "coinToss", "firstPlayer", 
			"openingHand", "drawnCards", "initialPokemon", "turn", "mainTurnAction", 
			"subTurnAction", "turnActionBody", "drawAction", "playAction", "attachAction", 
			"evolveAction", "attackAction", "damageBreakdown", "damageBonusLine", 
			"retreatAction", "shuffleAction", "discardAction", "prizeAction", "moveToHandAction", 
			"activeSpotAction", "knockoutAction", "cardMovedAction", "switchAction", 
			"damagedAction", "flippedAction", "endTurn", "gameEnd", "cardList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Pok\\u00E9mon'", "'added'", "'Setup'", "'chose'", "'heads'", 
			"'tails'", "'for'", "'the'", "'opening'", "'coin'", "'flip'", "'flipped'", 
			"'won'", "'toss'", "'decided'", "'to'", "'go'", "'first'", "'drew'", 
			"'drawn'", "'cards'", "'card'", "'Ability'", "'Attack'", "'Pok\\u00E9mon Tool'", 
			"'hand'", "'played'", "'attached'", "'evolved'", "'used'", "'on'", "'in'", 
			"'it'", "'with'", "'was'", "'were'", "'is'", "'now'", "'become'", "'landed'", 
			"'Active'", null, "'Bench'", "'Stadium'", "'damage'", "'discarded'", 
			"'discard'", "'shuffled'", "'deck'", "'into'", "'their'", "'from'", "'moved'", 
			"'took'", "'Prize'", "'Prize cards'", "'Knocked'", "'Out'", "'switched'", 
			"'retreated'", "'ended'", "'Opponent'", "'conceded'", "'wins'", "'All'", 
			"'taken'", null, "'and'", "'them'", "'Energy'", "'selected'", "'Damage breakdown'", 
			"'Base damage'", "'Total damage'", "'Item'", null, null, null, "'Diamond Coat'", 
			null, null, "'.'", "','", "':'", "'!'", "'('", "')'", "'\\u2022'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TURN", "POKEMON", "ADDED", "SETUP", "CHOSE", "HEADS", "TAILS", 
			"FOR", "THE", "OPENING", "COIN", "FLIP", "FLIPPED", "WON", "TOSS", "DECIDED", 
			"TO", "GO", "FIRST", "DREW", "DRAWN", "CARDS", "CARD_WORD", "ABILITY_WORD", 
			"ATTACK_WORD", "POKEMON_TOOL", "HAND", "PLAYED", "ATTACHED", "EVOLVED", 
			"USED", "ON", "IN", "IT", "WITH", "WAS", "WERE", "IS", "NOW", "BECOME", 
			"LANDED", "ACTIVE", "SPOT", "BENCH", "STADIUM", "DAMAGE", "DISCARDED", 
			"DISCARDS", "SHUFFLED", "DECK", "INTO", "THEIR", "FROM", "MOVED", "TAKE", 
			"PRIZE", "PRIZE_CARDS", "KNOCKED", "OUT", "SWITCHED", "RETIRED", "ENDED", 
			"OPPONENT", "CONCEDED", "WINS", "ALL", "TAKEN", "A_SOMETHING", "AND", 
			"THEM", "ENERGY", "SELECTED", "DAMAGE_BREAKDOWN", "BASE_DAMAGE", "TOTAL_DAMAGE", 
			"ITEM", "POSSESSIVE", "CARD", "ATTACK", "ABILITY", "NUMBER", "PLAYER", 
			"DOT", "COMMA", "COLON", "EXCLAMATION", "LPAREN", "RPAREN", "BULLET", 
			"HYPHEN", "NEWLINE", "WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(77);
				match(NEWLINE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterSetup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitSetup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitSetup(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterSetupAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitSetupAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitSetupAction(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterCoinChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitCoinChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitCoinChoice(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterCoinToss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitCoinToss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitCoinToss(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterFirstPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitFirstPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitFirstPlayer(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterOpeningHand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitOpeningHand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitOpeningHand(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDrawnCards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDrawnCards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitDrawnCards(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitInitialPokemon(this);
			else return visitor.visitChildren(this);
		}
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
			match(CARD);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitTurn(this);
			else return visitor.visitChildren(this);
		}
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
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 25601L) != 0)) {
				{
				{
				setState(166);
				mainTurnAction();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitMainTurnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainTurnActionContext mainTurnAction() throws RecognitionException {
		MainTurnActionContext _localctx = new MainTurnActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mainTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			turnActionBody();
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==EXCLAMATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174);
			match(NEWLINE);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYPHEN) {
				{
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(175);
					subTurnAction();
					}
					break;
				case 2:
					{
					setState(176);
					damageBreakdown();
					}
					break;
				}
				}
				setState(181);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterSubTurnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitSubTurnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitSubTurnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubTurnActionContext subTurnAction() throws RecognitionException {
		SubTurnActionContext _localctx = new SubTurnActionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(HYPHEN);
			setState(183);
			turnActionBody();
			setState(184);
			match(DOT);
			setState(185);
			match(NEWLINE);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BULLET) {
				{
				{
				setState(186);
				cardList();
				}
				}
				setState(191);
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
		public EndTurnContext endTurn() {
			return getRuleContext(EndTurnContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitTurnActionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnActionBodyContext turnActionBody() throws RecognitionException {
		TurnActionBodyContext _localctx = new TurnActionBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_turnActionBody);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				drawAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				playAction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				attachAction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				evolveAction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				attackAction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				retreatAction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				shuffleAction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				cardMovedAction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				discardAction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(201);
				prizeAction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(202);
				moveToHandAction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(203);
				activeSpotAction();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(204);
				switchAction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(205);
				knockoutAction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(206);
				damagedAction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(207);
				flippedAction();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(208);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDrawAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDrawAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitDrawAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawActionContext drawAction() throws RecognitionException {
		DrawActionContext _localctx = new DrawActionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_drawAction);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(PLAYER);
				setState(212);
				match(DREW);
				setState(213);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(PLAYER);
				setState(215);
				match(DREW);
				setState(216);
				match(A_SOMETHING);
				setState(217);
				match(CARD_WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(PLAYER);
				setState(219);
				match(DREW);
				setState(220);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(PLAYER);
				setState(222);
				match(DREW);
				setState(223);
				match(NUMBER);
				setState(224);
				match(CARD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(PLAYER);
				setState(226);
				match(DREW);
				setState(227);
				match(NUMBER);
				setState(228);
				match(CARDS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				match(PLAYER);
				setState(230);
				match(DREW);
				setState(231);
				match(NUMBER);
				setState(232);
				match(CARDS);
				setState(233);
				match(AND);
				setState(234);
				match(PLAYED);
				setState(235);
				match(THEM);
				setState(236);
				match(TO);
				setState(237);
				match(THE);
				setState(238);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitPlayAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayActionContext playAction() throws RecognitionException {
		PlayActionContext _localctx = new PlayActionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_playAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(PLAYER);
			setState(242);
			match(PLAYED);
			setState(243);
			match(CARD);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(244);
				match(TO);
				setState(245);
				match(THE);
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(246);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(247);
					match(ACTIVE);
					setState(248);
					match(SPOT);
					}
					break;
				case STADIUM:
					{
					setState(249);
					match(STADIUM);
					setState(250);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterAttachAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitAttachAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitAttachAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttachActionContext attachAction() throws RecognitionException {
		AttachActionContext _localctx = new AttachActionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attachAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(PLAYER);
			setState(256);
			match(ATTACHED);
			setState(257);
			match(CARD);
			setState(258);
			match(TO);
			setState(259);
			match(CARD);
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(260);
				match(ON);
				setState(261);
				match(THE);
				setState(262);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(263);
				match(IN);
				setState(264);
				match(THE);
				setState(265);
				match(ACTIVE);
				setState(266);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterEvolveAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitEvolveAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitEvolveAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvolveActionContext evolveAction() throws RecognitionException {
		EvolveActionContext _localctx = new EvolveActionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_evolveAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(PLAYER);
			setState(270);
			match(EVOLVED);
			setState(271);
			match(CARD);
			setState(272);
			match(TO);
			setState(273);
			match(CARD);
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(274);
				match(ON);
				setState(275);
				match(THE);
				setState(276);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(277);
				match(IN);
				setState(278);
				match(THE);
				setState(279);
				match(ACTIVE);
				setState(280);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterAttackAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitAttackAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitAttackAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttackActionContext attackAction() throws RecognitionException {
		AttackActionContext _localctx = new AttackActionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attackAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(PLAYER);
			setState(284);
			match(POSSESSIVE);
			setState(285);
			match(CARD);
			setState(286);
			match(USED);
			setState(287);
			match(ATTACK);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(288);
				match(ON);
				setState(289);
				match(PLAYER);
				setState(290);
				match(POSSESSIVE);
				setState(291);
				match(CARD);
				setState(292);
				match(FOR);
				setState(293);
				match(NUMBER);
				setState(294);
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
		public List<TerminalNode> NUMBER() { return getTokens(gTCGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gTCGParser.NUMBER, i);
		}
		public TerminalNode ATTACHED() { return getToken(gTCGParser.ATTACHED, 0); }
		public TerminalNode ENERGY() { return getToken(gTCGParser.ENERGY, 0); }
		public List<TerminalNode> DAMAGE() { return getTokens(gTCGParser.DAMAGE); }
		public TerminalNode DAMAGE(int i) {
			return getToken(gTCGParser.DAMAGE, i);
		}
		public TerminalNode SELECTED() { return getToken(gTCGParser.SELECTED, 0); }
		public TerminalNode BASE_DAMAGE() { return getToken(gTCGParser.BASE_DAMAGE, 0); }
		public DamageBonusLineContext damageBonusLine() {
			return getRuleContext(DamageBonusLineContext.class,0);
		}
		public TerminalNode TOTAL_DAMAGE() { return getToken(gTCGParser.TOTAL_DAMAGE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitDamageBreakdown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DamageBreakdownContext damageBreakdown() throws RecognitionException {
		DamageBreakdownContext _localctx = new DamageBreakdownContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_damageBreakdown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(HYPHEN);
			setState(298);
			match(DAMAGE_BREAKDOWN);
			setState(299);
			match(COLON);
			setState(300);
			match(NEWLINE);
			setState(301);
			match(BULLET);
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(302);
				match(NUMBER);
				setState(303);
				match(ATTACHED);
				setState(304);
				match(ENERGY);
				setState(305);
				match(COLON);
				setState(306);
				match(NUMBER);
				setState(307);
				match(DAMAGE);
				setState(308);
				match(NEWLINE);
				}
				break;
			case 2:
				{
				setState(309);
				match(NUMBER);
				setState(310);
				match(SELECTED);
				setState(311);
				match(ENERGY);
				setState(312);
				match(COLON);
				setState(313);
				match(NUMBER);
				setState(314);
				match(DAMAGE);
				setState(315);
				match(NEWLINE);
				}
				break;
			case 3:
				{
				{
				setState(316);
				match(BASE_DAMAGE);
				setState(317);
				match(COLON);
				setState(318);
				match(NUMBER);
				setState(319);
				match(DAMAGE);
				setState(320);
				match(NEWLINE);
				setState(321);
				damageBonusLine();
				setState(322);
				match(BULLET);
				setState(323);
				match(TOTAL_DAMAGE);
				setState(324);
				match(COLON);
				setState(325);
				match(NUMBER);
				setState(326);
				match(DAMAGE);
				setState(327);
				match(NEWLINE);
				}
				}
				break;
			}
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(331);
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
	public static class DamageBonusLineContext extends ParserRuleContext {
		public List<TerminalNode> BULLET() { return getTokens(gTCGParser.BULLET); }
		public TerminalNode BULLET(int i) {
			return getToken(gTCGParser.BULLET, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(gTCGParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(gTCGParser.LPAREN, i);
		}
		public TerminalNode ITEM() { return getToken(gTCGParser.ITEM, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(gTCGParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(gTCGParser.RPAREN, i);
		}
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public List<TerminalNode> COLON() { return getTokens(gTCGParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(gTCGParser.COLON, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(gTCGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gTCGParser.NUMBER, i);
		}
		public List<TerminalNode> DAMAGE() { return getTokens(gTCGParser.DAMAGE); }
		public TerminalNode DAMAGE(int i) {
			return getToken(gTCGParser.DAMAGE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(gTCGParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gTCGParser.NEWLINE, i);
		}
		public TerminalNode ENERGY() { return getToken(gTCGParser.ENERGY, 0); }
		public TerminalNode ATTACHED() { return getToken(gTCGParser.ATTACHED, 0); }
		public TerminalNode SELECTED() { return getToken(gTCGParser.SELECTED, 0); }
		public TerminalNode ABILITY_WORD() { return getToken(gTCGParser.ABILITY_WORD, 0); }
		public TerminalNode ABILITY() { return getToken(gTCGParser.ABILITY, 0); }
		public List<TerminalNode> HYPHEN() { return getTokens(gTCGParser.HYPHEN); }
		public TerminalNode HYPHEN(int i) {
			return getToken(gTCGParser.HYPHEN, i);
		}
		public TerminalNode POKEMON_TOOL() { return getToken(gTCGParser.POKEMON_TOOL, 0); }
		public TerminalNode ATTACK_WORD() { return getToken(gTCGParser.ATTACK_WORD, 0); }
		public TerminalNode ATTACK() { return getToken(gTCGParser.ATTACK, 0); }
		public DamageBonusLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damageBonusLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDamageBonusLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDamageBonusLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitDamageBonusLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DamageBonusLineContext damageBonusLine() throws RecognitionException {
		DamageBonusLineContext _localctx = new DamageBonusLineContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_damageBonusLine);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(BULLET);
				setState(335);
				match(LPAREN);
				setState(336);
				match(ITEM);
				setState(337);
				match(RPAREN);
				setState(338);
				match(CARD);
				setState(339);
				match(COLON);
				setState(340);
				match(NUMBER);
				setState(341);
				match(DAMAGE);
				setState(342);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(BULLET);
				setState(344);
				match(NUMBER);
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==ATTACHED || _la==SELECTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				match(ENERGY);
				setState(347);
				match(COLON);
				setState(348);
				match(NUMBER);
				setState(349);
				match(DAMAGE);
				setState(350);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(351);
				match(BULLET);
				setState(352);
				match(LPAREN);
				setState(353);
				match(ABILITY_WORD);
				setState(354);
				match(RPAREN);
				setState(355);
				match(ABILITY);
				setState(356);
				match(COLON);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(357);
					match(HYPHEN);
					}
				}

				setState(360);
				match(NUMBER);
				setState(361);
				match(DAMAGE);
				setState(362);
				match(NEWLINE);
				setState(363);
				match(BULLET);
				setState(364);
				match(NUMBER);
				setState(365);
				match(ATTACHED);
				setState(366);
				match(ENERGY);
				setState(367);
				match(COLON);
				setState(368);
				match(NUMBER);
				setState(369);
				match(DAMAGE);
				setState(370);
				match(NEWLINE);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(371);
				match(BULLET);
				setState(372);
				match(LPAREN);
				setState(373);
				match(POKEMON_TOOL);
				setState(374);
				match(RPAREN);
				setState(375);
				match(CARD);
				setState(376);
				match(COLON);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(377);
					match(HYPHEN);
					}
				}

				setState(380);
				match(NUMBER);
				setState(381);
				match(DAMAGE);
				setState(382);
				match(NEWLINE);
				setState(383);
				match(BULLET);
				setState(384);
				match(LPAREN);
				setState(385);
				match(ATTACK_WORD);
				setState(386);
				match(RPAREN);
				setState(387);
				match(ATTACK);
				setState(388);
				match(COLON);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(389);
					match(HYPHEN);
					}
				}

				setState(392);
				match(NUMBER);
				setState(393);
				match(DAMAGE);
				setState(394);
				match(NEWLINE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterRetreatAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitRetreatAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitRetreatAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetreatActionContext retreatAction() throws RecognitionException {
		RetreatActionContext _localctx = new RetreatActionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_retreatAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(PLAYER);
			setState(398);
			match(RETIRED);
			setState(399);
			match(CARD);
			setState(400);
			match(TO);
			setState(401);
			match(THE);
			setState(402);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterShuffleAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitShuffleAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitShuffleAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShuffleActionContext shuffleAction() throws RecognitionException {
		ShuffleActionContext _localctx = new ShuffleActionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_shuffleAction);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(PLAYER);
				setState(405);
				match(SHUFFLED);
				setState(406);
				match(THEIR);
				setState(407);
				match(DECK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(PLAYER);
				setState(409);
				match(SHUFFLED);
				setState(410);
				match(NUMBER);
				setState(411);
				match(CARDS);
				setState(412);
				match(INTO);
				setState(413);
				match(THEIR);
				setState(414);
				match(DECK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				match(PLAYER);
				setState(416);
				match(SHUFFLED);
				setState(417);
				match(CARD);
				setState(418);
				match(INTO);
				setState(419);
				match(THEIR);
				setState(420);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDiscardAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDiscardAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitDiscardAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiscardActionContext discardAction() throws RecognitionException {
		DiscardActionContext _localctx = new DiscardActionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_discardAction);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(PLAYER);
				setState(424);
				match(DISCARDED);
				setState(425);
				match(CARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(PLAYER);
				setState(427);
				match(DISCARDED);
				setState(428);
				match(NUMBER);
				setState(429);
				match(CARDS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				match(NUMBER);
				setState(431);
				match(CARDS);
				setState(432);
				match(WERE);
				setState(433);
				match(DISCARDED);
				setState(434);
				match(FROM);
				setState(435);
				match(PLAYER);
				setState(436);
				match(POSSESSIVE);
				setState(437);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(CARD);
				setState(439);
				match(WAS);
				setState(440);
				match(DISCARDED);
				setState(441);
				match(FROM);
				setState(442);
				match(PLAYER);
				setState(443);
				match(POSSESSIVE);
				setState(444);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterPrizeAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitPrizeAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitPrizeAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrizeActionContext prizeAction() throws RecognitionException {
		PrizeActionContext _localctx = new PrizeActionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_prizeAction);
		int _la;
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(PLAYER);
				setState(448);
				match(TAKE);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==A_SOMETHING) {
					{
					setState(449);
					match(A_SOMETHING);
					}
				}

				setState(452);
				match(PRIZE);
				setState(453);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(PLAYER);
				setState(455);
				match(TAKE);
				setState(456);
				match(NUMBER);
				setState(457);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterMoveToHandAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitMoveToHandAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitMoveToHandAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveToHandActionContext moveToHandAction() throws RecognitionException {
		MoveToHandActionContext _localctx = new MoveToHandActionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_moveToHandAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(PLAYER);
			setState(461);
			match(MOVED);
			setState(462);
			match(PLAYER);
			setState(463);
			match(POSSESSIVE);
			setState(464);
			match(CARD);
			setState(465);
			match(TO);
			setState(466);
			match(THEIR);
			setState(467);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterActiveSpotAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitActiveSpotAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitActiveSpotAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActiveSpotActionContext activeSpotAction() throws RecognitionException {
		ActiveSpotActionContext _localctx = new ActiveSpotActionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_activeSpotAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(PLAYER);
			setState(470);
			match(POSSESSIVE);
			setState(471);
			match(CARD);
			setState(472);
			match(IS);
			setState(473);
			match(NOW);
			setState(474);
			match(IN);
			setState(475);
			match(THE);
			setState(476);
			match(ACTIVE);
			setState(477);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterKnockoutAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitKnockoutAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitKnockoutAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnockoutActionContext knockoutAction() throws RecognitionException {
		KnockoutActionContext _localctx = new KnockoutActionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_knockoutAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(PLAYER);
			setState(480);
			match(POSSESSIVE);
			setState(481);
			match(CARD);
			setState(482);
			match(WAS);
			setState(483);
			match(KNOCKED);
			setState(484);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterCardMovedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitCardMovedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitCardMovedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardMovedActionContext cardMovedAction() throws RecognitionException {
		CardMovedActionContext _localctx = new CardMovedActionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cardMovedAction);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_SOMETHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(A_SOMETHING);
				setState(487);
				match(CARD_WORD);
				setState(488);
				match(WAS);
				setState(489);
				match(ADDED);
				setState(490);
				match(TO);
				setState(491);
				match(PLAYER);
				setState(492);
				match(POSSESSIVE);
				setState(493);
				match(HAND);
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(CARD);
				setState(495);
				match(WAS);
				setState(496);
				match(ADDED);
				setState(497);
				match(TO);
				setState(498);
				match(PLAYER);
				setState(499);
				match(POSSESSIVE);
				setState(500);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterSwitchAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitSwitchAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitSwitchAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchActionContext switchAction() throws RecognitionException {
		SwitchActionContext _localctx = new SwitchActionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_switchAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(PLAYER);
			setState(504);
			match(POSSESSIVE);
			setState(505);
			match(CARD);
			setState(506);
			match(WAS);
			setState(507);
			match(SWITCHED);
			setState(508);
			match(WITH);
			setState(509);
			match(PLAYER);
			setState(510);
			match(POSSESSIVE);
			setState(511);
			match(CARD);
			setState(512);
			match(TO);
			setState(513);
			match(BECOME);
			setState(514);
			match(THE);
			setState(515);
			match(ACTIVE);
			setState(516);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterDamagedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitDamagedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitDamagedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DamagedActionContext damagedAction() throws RecognitionException {
		DamagedActionContext _localctx = new DamagedActionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_damagedAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(PLAYER);
			setState(519);
			match(POSSESSIVE);
			setState(520);
			match(CARD);
			setState(521);
			match(TAKE);
			setState(522);
			match(NUMBER);
			setState(523);
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
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitFlippedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlippedActionContext flippedAction() throws RecognitionException {
		FlippedActionContext _localctx = new FlippedActionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_flippedAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(PLAYER);
			setState(526);
			match(FLIPPED);
			setState(527);
			match(A_SOMETHING);
			setState(528);
			match(COIN);
			setState(529);
			match(AND);
			setState(530);
			match(IT);
			setState(531);
			match(LANDED);
			setState(532);
			match(ON);
			setState(533);
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
	public static class EndTurnContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitEndTurn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndTurnContext endTurn() throws RecognitionException {
		EndTurnContext _localctx = new EndTurnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_endTurn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(PLAYER);
			setState(536);
			match(ENDED);
			setState(537);
			match(THEIR);
			setState(538);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterGameEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitGameEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitGameEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameEndContext gameEnd() throws RecognitionException {
		GameEndContext _localctx = new GameEndContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_gameEnd);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(ALL);
				setState(541);
				match(PRIZE_CARDS);
				setState(542);
				match(TAKEN);
				setState(543);
				match(DOT);
				setState(544);
				match(PLAYER);
				setState(545);
				match(WINS);
				setState(546);
				match(DOT);
				}
				break;
			case OPPONENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(OPPONENT);
				setState(548);
				match(CONCEDED);
				setState(549);
				match(DOT);
				setState(550);
				match(PLAYER);
				setState(551);
				match(WINS);
				setState(552);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).enterCardList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gTCGParserListener ) ((gTCGParserListener)listener).exitCardList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gTCGParserVisitor ) return ((gTCGParserVisitor<? extends T>)visitor).visitCardList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardListContext cardList() throws RecognitionException {
		CardListContext _localctx = new CardListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cardList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(BULLET);
			setState(556);
			match(CARD);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(557);
				match(COMMA);
				setState(558);
				match(CARD);
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564);
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
		"\u0004\u0001\\\u0237\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0000\u0001\u0000\u0005\u0000O\b\u0000\n\u0000\f\u0000R\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001Y\b"+
		"\u0001\n\u0001\f\u0001\\\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002c\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u008b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0094\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009e\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a8"+
		"\b\t\n\t\f\t\u00ab\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n"+
		"\u00b2\b\n\n\n\f\n\u00b5\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00bc\b\u000b\n\u000b\f\u000b\u00bf\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00d2\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00f0\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00fc\b\u000e\u0003\u000e\u00fe\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u010c\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u011a\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0128\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u014a\b\u0012\u0001\u0012\u0003\u0012\u014d"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0167\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u017b\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0187\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u018c\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01a6\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01be\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01c3\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01cb"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u01f6\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u022a\b \u0001"+
		"!\u0001!\u0001!\u0001!\u0005!\u0230\b!\n!\f!\u0233\t!\u0001!\u0001!\u0001"+
		"!\u0000\u0000\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0003\u0001\u0000"+
		"\u0006\u0007\u0002\u0000SSVV\u0002\u0000\u001d\u001dHH\u0250\u0000D\u0001"+
		"\u0000\u0000\u0000\u0002U\u0001\u0000\u0000\u0000\u0004b\u0001\u0000\u0000"+
		"\u0000\u0006d\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\nw\u0001"+
		"\u0000\u0000\u0000\f\u007f\u0001\u0000\u0000\u0000\u000e\u008c\u0001\u0000"+
		"\u0000\u0000\u0010\u0095\u0001\u0000\u0000\u0000\u0012\u00a2\u0001\u0000"+
		"\u0000\u0000\u0014\u00ac\u0001\u0000\u0000\u0000\u0016\u00b6\u0001\u0000"+
		"\u0000\u0000\u0018\u00d1\u0001\u0000\u0000\u0000\u001a\u00ef\u0001\u0000"+
		"\u0000\u0000\u001c\u00f1\u0001\u0000\u0000\u0000\u001e\u00ff\u0001\u0000"+
		"\u0000\u0000 \u010d\u0001\u0000\u0000\u0000\"\u011b\u0001\u0000\u0000"+
		"\u0000$\u0129\u0001\u0000\u0000\u0000&\u018b\u0001\u0000\u0000\u0000("+
		"\u018d\u0001\u0000\u0000\u0000*\u01a5\u0001\u0000\u0000\u0000,\u01bd\u0001"+
		"\u0000\u0000\u0000.\u01ca\u0001\u0000\u0000\u00000\u01cc\u0001\u0000\u0000"+
		"\u00002\u01d5\u0001\u0000\u0000\u00004\u01df\u0001\u0000\u0000\u00006"+
		"\u01f5\u0001\u0000\u0000\u00008\u01f7\u0001\u0000\u0000\u0000:\u0206\u0001"+
		"\u0000\u0000\u0000<\u020d\u0001\u0000\u0000\u0000>\u0217\u0001\u0000\u0000"+
		"\u0000@\u0229\u0001\u0000\u0000\u0000B\u022b\u0001\u0000\u0000\u0000D"+
		"I\u0003\u0002\u0001\u0000EF\u0005[\u0000\u0000FH\u0003\u0012\t\u0000G"+
		"E\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000LP\u0003@ \u0000MO\u0005[\u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005"+
		"\u0000\u0000\u0001T\u0001\u0001\u0000\u0000\u0000UV\u0005\u0004\u0000"+
		"\u0000VZ\u0005[\u0000\u0000WY\u0003\u0004\u0002\u0000XW\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\u0003\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]c\u0003\u0006\u0003\u0000^c\u0003\b\u0004\u0000_c\u0003\n\u0005\u0000"+
		"`c\u0003\f\u0006\u0000ac\u0003\u0010\b\u0000b]\u0001\u0000\u0000\u0000"+
		"b^\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000ba\u0001\u0000\u0000\u0000c\u0005\u0001\u0000\u0000\u0000de\u0005"+
		"R\u0000\u0000ef\u0005\u0005\u0000\u0000fg\u0007\u0000\u0000\u0000gh\u0005"+
		"\b\u0000\u0000hi\u0005\t\u0000\u0000ij\u0005\n\u0000\u0000jk\u0005\u000b"+
		"\u0000\u0000kl\u0005\f\u0000\u0000lm\u0005S\u0000\u0000mn\u0005[\u0000"+
		"\u0000n\u0007\u0001\u0000\u0000\u0000op\u0005R\u0000\u0000pq\u0005\u000e"+
		"\u0000\u0000qr\u0005\t\u0000\u0000rs\u0005\u000b\u0000\u0000st\u0005\u000f"+
		"\u0000\u0000tu\u0005S\u0000\u0000uv\u0005[\u0000\u0000v\t\u0001\u0000"+
		"\u0000\u0000wx\u0005R\u0000\u0000xy\u0005\u0010\u0000\u0000yz\u0005\u0011"+
		"\u0000\u0000z{\u0005\u0012\u0000\u0000{|\u0005\u0013\u0000\u0000|}\u0005"+
		"S\u0000\u0000}~\u0005[\u0000\u0000~\u000b\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005R\u0000\u0000\u0080\u0081\u0005\u0014\u0000\u0000\u0081\u0082"+
		"\u0005Q\u0000\u0000\u0082\u0083\u0005\u0016\u0000\u0000\u0083\u0084\u0005"+
		"\b\u0000\u0000\u0084\u0085\u0005\t\u0000\u0000\u0085\u0086\u0005\n\u0000"+
		"\u0000\u0086\u0087\u0005\u001b\u0000\u0000\u0087\u0088\u0005S\u0000\u0000"+
		"\u0088\u008a\u0005[\u0000\u0000\u0089\u008b\u0003\u000e\u0007\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\r\u0001\u0000\u0000\u0000\u008c\u008d\u0005Z\u0000\u0000\u008d\u008e"+
		"\u0005Q\u0000\u0000\u008e\u008f\u0005\u0015\u0000\u0000\u008f\u0090\u0005"+
		"\u0016\u0000\u0000\u0090\u0091\u0005S\u0000\u0000\u0091\u0093\u0005[\u0000"+
		"\u0000\u0092\u0094\u0003B!\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u000f\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005R\u0000\u0000\u0096\u0097\u0005\u001c\u0000\u0000\u0097\u0098"+
		"\u0005N\u0000\u0000\u0098\u0099\u0005\u0011\u0000\u0000\u0099\u009d\u0005"+
		"\t\u0000\u0000\u009a\u009b\u0005*\u0000\u0000\u009b\u009e\u0005+\u0000"+
		"\u0000\u009c\u009e\u0005,\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005S\u0000\u0000\u00a0\u00a1\u0005[\u0000\u0000\u00a1\u0011"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005R\u0000\u0000\u00a3\u00a4\u0005"+
		"M\u0000\u0000\u00a4\u00a5\u0005\u0001\u0000\u0000\u00a5\u00a9\u0005[\u0000"+
		"\u0000\u00a6\u00a8\u0003\u0014\n\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u0013\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u0018\f\u0000\u00ad"+
		"\u00ae\u0007\u0001\u0000\u0000\u00ae\u00b3\u0005[\u0000\u0000\u00af\u00b2"+
		"\u0003\u0016\u000b\u0000\u00b0\u00b2\u0003$\u0012\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u0015\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005Z\u0000\u0000\u00b7\u00b8\u0003\u0018"+
		"\f\u0000\u00b8\u00b9\u0005S\u0000\u0000\u00b9\u00bd\u0005[\u0000\u0000"+
		"\u00ba\u00bc\u0003B!\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u0017\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0\u00d2\u0003\u001a\r\u0000\u00c1\u00d2\u0003"+
		"\u001c\u000e\u0000\u00c2\u00d2\u0003\u001e\u000f\u0000\u00c3\u00d2\u0003"+
		" \u0010\u0000\u00c4\u00d2\u0003\"\u0011\u0000\u00c5\u00d2\u0003(\u0014"+
		"\u0000\u00c6\u00d2\u0003*\u0015\u0000\u00c7\u00d2\u00036\u001b\u0000\u00c8"+
		"\u00d2\u0003,\u0016\u0000\u00c9\u00d2\u0003.\u0017\u0000\u00ca\u00d2\u0003"+
		"0\u0018\u0000\u00cb\u00d2\u00032\u0019\u0000\u00cc\u00d2\u00038\u001c"+
		"\u0000\u00cd\u00d2\u00034\u001a\u0000\u00ce\u00d2\u0003:\u001d\u0000\u00cf"+
		"\u00d2\u0003<\u001e\u0000\u00d0\u00d2\u0003>\u001f\u0000\u00d1\u00c0\u0001"+
		"\u0000\u0000\u0000\u00d1\u00c1\u0001\u0000\u0000\u0000\u00d1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00d1\u00c3\u0001\u0000\u0000\u0000\u00d1\u00c4\u0001"+
		"\u0000\u0000\u0000\u00d1\u00c5\u0001\u0000\u0000\u0000\u00d1\u00c6\u0001"+
		"\u0000\u0000\u0000\u00d1\u00c7\u0001\u0000\u0000\u0000\u00d1\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d1\u00c9\u0001\u0000\u0000\u0000\u00d1\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cb\u0001\u0000\u0000\u0000\u00d1\u00cc\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u0019\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"R\u0000\u0000\u00d4\u00d5\u0005\u0014\u0000\u0000\u00d5\u00f0\u0005\u0017"+
		"\u0000\u0000\u00d6\u00d7\u0005R\u0000\u0000\u00d7\u00d8\u0005\u0014\u0000"+
		"\u0000\u00d8\u00d9\u0005D\u0000\u0000\u00d9\u00f0\u0005\u0017\u0000\u0000"+
		"\u00da\u00db\u0005R\u0000\u0000\u00db\u00dc\u0005\u0014\u0000\u0000\u00dc"+
		"\u00f0\u0005N\u0000\u0000\u00dd\u00de\u0005R\u0000\u0000\u00de\u00df\u0005"+
		"\u0014\u0000\u0000\u00df\u00e0\u0005Q\u0000\u0000\u00e0\u00f0\u0005N\u0000"+
		"\u0000\u00e1\u00e2\u0005R\u0000\u0000\u00e2\u00e3\u0005\u0014\u0000\u0000"+
		"\u00e3\u00e4\u0005Q\u0000\u0000\u00e4\u00f0\u0005\u0016\u0000\u0000\u00e5"+
		"\u00e6\u0005R\u0000\u0000\u00e6\u00e7\u0005\u0014\u0000\u0000\u00e7\u00e8"+
		"\u0005Q\u0000\u0000\u00e8\u00e9\u0005\u0016\u0000\u0000\u00e9\u00ea\u0005"+
		"E\u0000\u0000\u00ea\u00eb\u0005\u001c\u0000\u0000\u00eb\u00ec\u0005F\u0000"+
		"\u0000\u00ec\u00ed\u0005\u0011\u0000\u0000\u00ed\u00ee\u0005\t\u0000\u0000"+
		"\u00ee\u00f0\u0005,\u0000\u0000\u00ef\u00d3\u0001\u0000\u0000\u0000\u00ef"+
		"\u00d6\u0001\u0000\u0000\u0000\u00ef\u00da\u0001\u0000\u0000\u0000\u00ef"+
		"\u00dd\u0001\u0000\u0000\u0000\u00ef\u00e1\u0001\u0000\u0000\u0000\u00ef"+
		"\u00e5\u0001\u0000\u0000\u0000\u00f0\u001b\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0005R\u0000\u0000\u00f2\u00f3\u0005\u001c\u0000\u0000\u00f3\u00fd"+
		"\u0005N\u0000\u0000\u00f4\u00f5\u0005\u0011\u0000\u0000\u00f5\u00fb\u0005"+
		"\t\u0000\u0000\u00f6\u00fc\u0005,\u0000\u0000\u00f7\u00f8\u0005*\u0000"+
		"\u0000\u00f8\u00fc\u0005+\u0000\u0000\u00f9\u00fa\u0005-\u0000\u0000\u00fa"+
		"\u00fc\u0005+\u0000\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00f7"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fd\u00f4\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u001d\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005R\u0000\u0000\u0100\u0101\u0005\u001d\u0000\u0000\u0101\u0102\u0005"+
		"N\u0000\u0000\u0102\u0103\u0005\u0011\u0000\u0000\u0103\u010b\u0005N\u0000"+
		"\u0000\u0104\u0105\u0005 \u0000\u0000\u0105\u0106\u0005\t\u0000\u0000"+
		"\u0106\u010c\u0005,\u0000\u0000\u0107\u0108\u0005!\u0000\u0000\u0108\u0109"+
		"\u0005\t\u0000\u0000\u0109\u010a\u0005*\u0000\u0000\u010a\u010c\u0005"+
		"+\u0000\u0000\u010b\u0104\u0001\u0000\u0000\u0000\u010b\u0107\u0001\u0000"+
		"\u0000\u0000\u010c\u001f\u0001\u0000\u0000\u0000\u010d\u010e\u0005R\u0000"+
		"\u0000\u010e\u010f\u0005\u001e\u0000\u0000\u010f\u0110\u0005N\u0000\u0000"+
		"\u0110\u0111\u0005\u0011\u0000\u0000\u0111\u0119\u0005N\u0000\u0000\u0112"+
		"\u0113\u0005 \u0000\u0000\u0113\u0114\u0005\t\u0000\u0000\u0114\u011a"+
		"\u0005,\u0000\u0000\u0115\u0116\u0005!\u0000\u0000\u0116\u0117\u0005\t"+
		"\u0000\u0000\u0117\u0118\u0005*\u0000\u0000\u0118\u011a\u0005+\u0000\u0000"+
		"\u0119\u0112\u0001\u0000\u0000\u0000\u0119\u0115\u0001\u0000\u0000\u0000"+
		"\u011a!\u0001\u0000\u0000\u0000\u011b\u011c\u0005R\u0000\u0000\u011c\u011d"+
		"\u0005M\u0000\u0000\u011d\u011e\u0005N\u0000\u0000\u011e\u011f\u0005\u001f"+
		"\u0000\u0000\u011f\u0127\u0005O\u0000\u0000\u0120\u0121\u0005 \u0000\u0000"+
		"\u0121\u0122\u0005R\u0000\u0000\u0122\u0123\u0005M\u0000\u0000\u0123\u0124"+
		"\u0005N\u0000\u0000\u0124\u0125\u0005\b\u0000\u0000\u0125\u0126\u0005"+
		"Q\u0000\u0000\u0126\u0128\u0005.\u0000\u0000\u0127\u0120\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128#\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0005Z\u0000\u0000\u012a\u012b\u0005I\u0000\u0000\u012b\u012c"+
		"\u0005U\u0000\u0000\u012c\u012d\u0005[\u0000\u0000\u012d\u0149\u0005Y"+
		"\u0000\u0000\u012e\u012f\u0005Q\u0000\u0000\u012f\u0130\u0005\u001d\u0000"+
		"\u0000\u0130\u0131\u0005G\u0000\u0000\u0131\u0132\u0005U\u0000\u0000\u0132"+
		"\u0133\u0005Q\u0000\u0000\u0133\u0134\u0005.\u0000\u0000\u0134\u014a\u0005"+
		"[\u0000\u0000\u0135\u0136\u0005Q\u0000\u0000\u0136\u0137\u0005H\u0000"+
		"\u0000\u0137\u0138\u0005G\u0000\u0000\u0138\u0139\u0005U\u0000\u0000\u0139"+
		"\u013a\u0005Q\u0000\u0000\u013a\u013b\u0005.\u0000\u0000\u013b\u014a\u0005"+
		"[\u0000\u0000\u013c\u013d\u0005J\u0000\u0000\u013d\u013e\u0005U\u0000"+
		"\u0000\u013e\u013f\u0005Q\u0000\u0000\u013f\u0140\u0005.\u0000\u0000\u0140"+
		"\u0141\u0005[\u0000\u0000\u0141\u0142\u0003&\u0013\u0000\u0142\u0143\u0005"+
		"Y\u0000\u0000\u0143\u0144\u0005K\u0000\u0000\u0144\u0145\u0005U\u0000"+
		"\u0000\u0145\u0146\u0005Q\u0000\u0000\u0146\u0147\u0005.\u0000\u0000\u0147"+
		"\u0148\u0005[\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u012e"+
		"\u0001\u0000\u0000\u0000\u0149\u0135\u0001\u0000\u0000\u0000\u0149\u013c"+
		"\u0001\u0000\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u014d"+
		"\u0005[\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d%\u0001\u0000\u0000\u0000\u014e\u014f\u0005Y\u0000"+
		"\u0000\u014f\u0150\u0005W\u0000\u0000\u0150\u0151\u0005L\u0000\u0000\u0151"+
		"\u0152\u0005X\u0000\u0000\u0152\u0153\u0005N\u0000\u0000\u0153\u0154\u0005"+
		"U\u0000\u0000\u0154\u0155\u0005Q\u0000\u0000\u0155\u0156\u0005.\u0000"+
		"\u0000\u0156\u018c\u0005[\u0000\u0000\u0157\u0158\u0005Y\u0000\u0000\u0158"+
		"\u0159\u0005Q\u0000\u0000\u0159\u015a\u0007\u0002\u0000\u0000\u015a\u015b"+
		"\u0005G\u0000\u0000\u015b\u015c\u0005U\u0000\u0000\u015c\u015d\u0005Q"+
		"\u0000\u0000\u015d\u015e\u0005.\u0000\u0000\u015e\u018c\u0005[\u0000\u0000"+
		"\u015f\u0160\u0005Y\u0000\u0000\u0160\u0161\u0005W\u0000\u0000\u0161\u0162"+
		"\u0005\u0018\u0000\u0000\u0162\u0163\u0005X\u0000\u0000\u0163\u0164\u0005"+
		"P\u0000\u0000\u0164\u0166\u0005U\u0000\u0000\u0165\u0167\u0005Z\u0000"+
		"\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005Q\u0000\u0000"+
		"\u0169\u016a\u0005.\u0000\u0000\u016a\u016b\u0005[\u0000\u0000\u016b\u016c"+
		"\u0005Y\u0000\u0000\u016c\u016d\u0005Q\u0000\u0000\u016d\u016e\u0005\u001d"+
		"\u0000\u0000\u016e\u016f\u0005G\u0000\u0000\u016f\u0170\u0005U\u0000\u0000"+
		"\u0170\u0171\u0005Q\u0000\u0000\u0171\u0172\u0005.\u0000\u0000\u0172\u018c"+
		"\u0005[\u0000\u0000\u0173\u0174\u0005Y\u0000\u0000\u0174\u0175\u0005W"+
		"\u0000\u0000\u0175\u0176\u0005\u001a\u0000\u0000\u0176\u0177\u0005X\u0000"+
		"\u0000\u0177\u0178\u0005N\u0000\u0000\u0178\u017a\u0005U\u0000\u0000\u0179"+
		"\u017b\u0005Z\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0005Q\u0000\u0000\u017d\u017e\u0005.\u0000\u0000\u017e\u017f\u0005["+
		"\u0000\u0000\u017f\u0180\u0005Y\u0000\u0000\u0180\u0181\u0005W\u0000\u0000"+
		"\u0181\u0182\u0005\u0019\u0000\u0000\u0182\u0183\u0005X\u0000\u0000\u0183"+
		"\u0184\u0005O\u0000\u0000\u0184\u0186\u0005U\u0000\u0000\u0185\u0187\u0005"+
		"Z\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0005Q\u0000"+
		"\u0000\u0189\u018a\u0005.\u0000\u0000\u018a\u018c\u0005[\u0000\u0000\u018b"+
		"\u014e\u0001\u0000\u0000\u0000\u018b\u0157\u0001\u0000\u0000\u0000\u018b"+
		"\u015f\u0001\u0000\u0000\u0000\u018b\u0173\u0001\u0000\u0000\u0000\u018c"+
		"\'\u0001\u0000\u0000\u0000\u018d\u018e\u0005R\u0000\u0000\u018e\u018f"+
		"\u0005=\u0000\u0000\u018f\u0190\u0005N\u0000\u0000\u0190\u0191\u0005\u0011"+
		"\u0000\u0000\u0191\u0192\u0005\t\u0000\u0000\u0192\u0193\u0005,\u0000"+
		"\u0000\u0193)\u0001\u0000\u0000\u0000\u0194\u0195\u0005R\u0000\u0000\u0195"+
		"\u0196\u00051\u0000\u0000\u0196\u0197\u00054\u0000\u0000\u0197\u01a6\u0005"+
		"2\u0000\u0000\u0198\u0199\u0005R\u0000\u0000\u0199\u019a\u00051\u0000"+
		"\u0000\u019a\u019b\u0005Q\u0000\u0000\u019b\u019c\u0005\u0016\u0000\u0000"+
		"\u019c\u019d\u00053\u0000\u0000\u019d\u019e\u00054\u0000\u0000\u019e\u01a6"+
		"\u00052\u0000\u0000\u019f\u01a0\u0005R\u0000\u0000\u01a0\u01a1\u00051"+
		"\u0000\u0000\u01a1\u01a2\u0005N\u0000\u0000\u01a2\u01a3\u00053\u0000\u0000"+
		"\u01a3\u01a4\u00054\u0000\u0000\u01a4\u01a6\u00052\u0000\u0000\u01a5\u0194"+
		"\u0001\u0000\u0000\u0000\u01a5\u0198\u0001\u0000\u0000\u0000\u01a5\u019f"+
		"\u0001\u0000\u0000\u0000\u01a6+\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005"+
		"R\u0000\u0000\u01a8\u01a9\u0005/\u0000\u0000\u01a9\u01be\u0005N\u0000"+
		"\u0000\u01aa\u01ab\u0005R\u0000\u0000\u01ab\u01ac\u0005/\u0000\u0000\u01ac"+
		"\u01ad\u0005Q\u0000\u0000\u01ad\u01be\u0005\u0016\u0000\u0000\u01ae\u01af"+
		"\u0005Q\u0000\u0000\u01af\u01b0\u0005\u0016\u0000\u0000\u01b0\u01b1\u0005"+
		"%\u0000\u0000\u01b1\u01b2\u0005/\u0000\u0000\u01b2\u01b3\u00055\u0000"+
		"\u0000\u01b3\u01b4\u0005R\u0000\u0000\u01b4\u01b5\u0005M\u0000\u0000\u01b5"+
		"\u01be\u0005N\u0000\u0000\u01b6\u01b7\u0005N\u0000\u0000\u01b7\u01b8\u0005"+
		"$\u0000\u0000\u01b8\u01b9\u0005/\u0000\u0000\u01b9\u01ba\u00055\u0000"+
		"\u0000\u01ba\u01bb\u0005R\u0000\u0000\u01bb\u01bc\u0005M\u0000\u0000\u01bc"+
		"\u01be\u0005N\u0000\u0000\u01bd\u01a7\u0001\u0000\u0000\u0000\u01bd\u01aa"+
		"\u0001\u0000\u0000\u0000\u01bd\u01ae\u0001\u0000\u0000\u0000\u01bd\u01b6"+
		"\u0001\u0000\u0000\u0000\u01be-\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"R\u0000\u0000\u01c0\u01c2\u00057\u0000\u0000\u01c1\u01c3\u0005D\u0000"+
		"\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u00058\u0000\u0000"+
		"\u01c5\u01cb\u0005\u0017\u0000\u0000\u01c6\u01c7\u0005R\u0000\u0000\u01c7"+
		"\u01c8\u00057\u0000\u0000\u01c8\u01c9\u0005Q\u0000\u0000\u01c9\u01cb\u0005"+
		"9\u0000\u0000\u01ca\u01bf\u0001\u0000\u0000\u0000\u01ca\u01c6\u0001\u0000"+
		"\u0000\u0000\u01cb/\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005R\u0000\u0000"+
		"\u01cd\u01ce\u00056\u0000\u0000\u01ce\u01cf\u0005R\u0000\u0000\u01cf\u01d0"+
		"\u0005M\u0000\u0000\u01d0\u01d1\u0005N\u0000\u0000\u01d1\u01d2\u0005\u0011"+
		"\u0000\u0000\u01d2\u01d3\u00054\u0000\u0000\u01d3\u01d4\u0005\u001b\u0000"+
		"\u0000\u01d41\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005R\u0000\u0000\u01d6"+
		"\u01d7\u0005M\u0000\u0000\u01d7\u01d8\u0005N\u0000\u0000\u01d8\u01d9\u0005"+
		"&\u0000\u0000\u01d9\u01da\u0005\'\u0000\u0000\u01da\u01db\u0005!\u0000"+
		"\u0000\u01db\u01dc\u0005\t\u0000\u0000\u01dc\u01dd\u0005*\u0000\u0000"+
		"\u01dd\u01de\u0005+\u0000\u0000\u01de3\u0001\u0000\u0000\u0000\u01df\u01e0"+
		"\u0005R\u0000\u0000\u01e0\u01e1\u0005M\u0000\u0000\u01e1\u01e2\u0005N"+
		"\u0000\u0000\u01e2\u01e3\u0005$\u0000\u0000\u01e3\u01e4\u0005:\u0000\u0000"+
		"\u01e4\u01e5\u0005;\u0000\u0000\u01e55\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0005D\u0000\u0000\u01e7\u01e8\u0005\u0017\u0000\u0000\u01e8\u01e9\u0005"+
		"$\u0000\u0000\u01e9\u01ea\u0005\u0003\u0000\u0000\u01ea\u01eb\u0005\u0011"+
		"\u0000\u0000\u01eb\u01ec\u0005R\u0000\u0000\u01ec\u01ed\u0005M\u0000\u0000"+
		"\u01ed\u01f6\u0005\u001b\u0000\u0000\u01ee\u01ef\u0005N\u0000\u0000\u01ef"+
		"\u01f0\u0005$\u0000\u0000\u01f0\u01f1\u0005\u0003\u0000\u0000\u01f1\u01f2"+
		"\u0005\u0011\u0000\u0000\u01f2\u01f3\u0005R\u0000\u0000\u01f3\u01f4\u0005"+
		"M\u0000\u0000\u01f4\u01f6\u0005\u001b\u0000\u0000\u01f5\u01e6\u0001\u0000"+
		"\u0000\u0000\u01f5\u01ee\u0001\u0000\u0000\u0000\u01f67\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0005R\u0000\u0000\u01f8\u01f9\u0005M\u0000\u0000\u01f9"+
		"\u01fa\u0005N\u0000\u0000\u01fa\u01fb\u0005$\u0000\u0000\u01fb\u01fc\u0005"+
		"<\u0000\u0000\u01fc\u01fd\u0005#\u0000\u0000\u01fd\u01fe\u0005R\u0000"+
		"\u0000\u01fe\u01ff\u0005M\u0000\u0000\u01ff\u0200\u0005N\u0000\u0000\u0200"+
		"\u0201\u0005\u0011\u0000\u0000\u0201\u0202\u0005(\u0000\u0000\u0202\u0203"+
		"\u0005\t\u0000\u0000\u0203\u0204\u0005*\u0000\u0000\u0204\u0205\u0005"+
		"\u0002\u0000\u0000\u02059\u0001\u0000\u0000\u0000\u0206\u0207\u0005R\u0000"+
		"\u0000\u0207\u0208\u0005M\u0000\u0000\u0208\u0209\u0005N\u0000\u0000\u0209"+
		"\u020a\u00057\u0000\u0000\u020a\u020b\u0005Q\u0000\u0000\u020b\u020c\u0005"+
		".\u0000\u0000\u020c;\u0001\u0000\u0000\u0000\u020d\u020e\u0005R\u0000"+
		"\u0000\u020e\u020f\u0005\r\u0000\u0000\u020f\u0210\u0005D\u0000\u0000"+
		"\u0210\u0211\u0005\u000b\u0000\u0000\u0211\u0212\u0005E\u0000\u0000\u0212"+
		"\u0213\u0005\"\u0000\u0000\u0213\u0214\u0005)\u0000\u0000\u0214\u0215"+
		"\u0005 \u0000\u0000\u0215\u0216\u0007\u0000\u0000\u0000\u0216=\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0005R\u0000\u0000\u0218\u0219\u0005>\u0000\u0000"+
		"\u0219\u021a\u00054\u0000\u0000\u021a\u021b\u0005\u0001\u0000\u0000\u021b"+
		"?\u0001\u0000\u0000\u0000\u021c\u021d\u0005B\u0000\u0000\u021d\u021e\u0005"+
		"9\u0000\u0000\u021e\u021f\u0005C\u0000\u0000\u021f\u0220\u0005S\u0000"+
		"\u0000\u0220\u0221\u0005R\u0000\u0000\u0221\u0222\u0005A\u0000\u0000\u0222"+
		"\u022a\u0005S\u0000\u0000\u0223\u0224\u0005?\u0000\u0000\u0224\u0225\u0005"+
		"@\u0000\u0000\u0225\u0226\u0005S\u0000\u0000\u0226\u0227\u0005R\u0000"+
		"\u0000\u0227\u0228\u0005A\u0000\u0000\u0228\u022a\u0005S\u0000\u0000\u0229"+
		"\u021c\u0001\u0000\u0000\u0000\u0229\u0223\u0001\u0000\u0000\u0000\u022a"+
		"A\u0001\u0000\u0000\u0000\u022b\u022c\u0005Y\u0000\u0000\u022c\u0231\u0005"+
		"N\u0000\u0000\u022d\u022e\u0005T\u0000\u0000\u022e\u0230\u0005N\u0000"+
		"\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000"+
		"\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000"+
		"\u0000\u0232\u0234\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0005[\u0000\u0000\u0235C\u0001\u0000\u0000\u0000\u001f"+
		"IPZb\u008a\u0093\u009d\u00a9\u00b1\u00b3\u00bd\u00d1\u00ef\u00fb\u00fd"+
		"\u010b\u0119\u0127\u0149\u014c\u0166\u017a\u0186\u018b\u01a5\u01bd\u01c2"+
		"\u01ca\u01f5\u0229\u0231";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}