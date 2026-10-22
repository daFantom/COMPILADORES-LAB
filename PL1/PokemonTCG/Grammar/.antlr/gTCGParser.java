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
		THE=9, OPENING=10, COIN=11, FLIP=12, FLIPPED=13, WON=14, TOSS=15, DECIDED=16, 
		TO=17, GO=18, FIRST=19, DREW=20, DRAWN=21, CARDS=22, CARD_WORD=23, ABILITY_WORD=24, 
		ATTACK_WORD=25, POKEMON_TOOL=26, HAND=27, PLAYED=28, ATTACHED=29, EVOLVED=30, 
		USED=31, OF=32, ON=33, IN=34, IT=35, WITH=36, WAS=37, WERE=38, IS=39, 
		NOW=40, BECOME=41, LANDED=42, ACTIVE=43, ACTIVATED=44, SPOT=45, BENCH=46, 
		STADIUM=47, DAMAGE=48, DISCARDED=49, DISCARDS=50, SHUFFLED=51, DECK=52, 
		INTO=53, THEIR=54, FROM=55, MOVED=56, TAKE=57, PRIZE=58, PRIZE_CARDS=59, 
		KNOCKED=60, OUT=61, SWITCHED=62, RETIRED=63, ENDED=64, OPPONENT=65, CONCEDED=66, 
		WINS=67, ALL=68, TAKEN=69, A_SOMETHING=70, AND=71, THEM=72, ENERGY=73, 
		SELECTED=74, DAMAGE_BREAKDOWN=75, BASE_DAMAGE=76, TOTAL_DAMAGE=77, ITEM=78, 
		POSSESSIVE=79, CARD=80, ATTACK=81, ABILITY=82, SPECIAL_CONDITION=83, NUMBER=84, 
		PLAYER=85, DOT=86, COMMA=87, COLON=88, EXCLAMATION=89, LPAREN=90, RPAREN=91, 
		BULLET=92, HYPHEN=93, NEWLINE=94, WS=95;
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
		RULE_flippedAction = 30, RULE_choiceAction = 31, RULE_specialConditionAction = 32, 
		RULE_activateAction = 33, RULE_endTurn = 34, RULE_gameEnd = 35, RULE_cardList = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"log", "setup", "setupAction", "coinChoice", "coinToss", "firstPlayer", 
			"openingHand", "drawnCards", "initialPokemon", "turn", "mainTurnAction", 
			"subTurnAction", "turnActionBody", "drawAction", "playAction", "attachAction", 
			"evolveAction", "attackAction", "damageBreakdown", "damageBonusLine", 
			"retreatAction", "shuffleAction", "discardAction", "prizeAction", "moveToHandAction", 
			"activeSpotAction", "knockoutAction", "cardMovedAction", "switchAction", 
			"damagedAction", "flippedAction", "choiceAction", "specialConditionAction", 
			"activateAction", "endTurn", "gameEnd", "cardList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Pok\\u00E9mon'", "'added'", "'Setup'", "'chose'", "'heads'", 
			"'tails'", "'for'", "'the'", "'opening'", "'coin'", "'flip'", "'flipped'", 
			"'won'", "'toss'", "'decided'", "'to'", "'go'", "'first'", "'drew'", 
			"'drawn'", "'cards'", "'card'", "'Ability'", "'Attack'", "'Pok\\u00E9mon Tool'", 
			"'hand'", "'played'", "'attached'", "'evolved'", "'used'", "'of'", "'on'", 
			"'in'", "'it'", "'with'", "'was'", "'were'", "'is'", "'now'", "'become'", 
			"'landed'", "'Active'", "'activated'", null, "'Bench'", "'Stadium'", 
			"'damage'", "'discarded'", "'discard'", "'shuffled'", "'deck'", "'into'", 
			"'their'", "'from'", "'moved'", "'took'", "'Prize'", "'Prize cards'", 
			"'Knocked'", "'Out'", "'switched'", "'retreated'", "'ended'", "'Opponent'", 
			"'conceded'", "'wins'", "'All'", "'taken'", null, "'and'", "'them'", 
			"'Energy'", "'selected'", "'Damage breakdown'", "'Base damage'", "'Total damage'", 
			"'Item'", null, null, null, null, null, null, null, "'.'", "','", "':'", 
			"'!'", "'('", "')'", "'\\u2022'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TURN", "POKEMON", "ADDED", "SETUP", "CHOSE", "HEADS", "TAILS", 
			"FOR", "THE", "OPENING", "COIN", "FLIP", "FLIPPED", "WON", "TOSS", "DECIDED", 
			"TO", "GO", "FIRST", "DREW", "DRAWN", "CARDS", "CARD_WORD", "ABILITY_WORD", 
			"ATTACK_WORD", "POKEMON_TOOL", "HAND", "PLAYED", "ATTACHED", "EVOLVED", 
			"USED", "OF", "ON", "IN", "IT", "WITH", "WAS", "WERE", "IS", "NOW", "BECOME", 
			"LANDED", "ACTIVE", "ACTIVATED", "SPOT", "BENCH", "STADIUM", "DAMAGE", 
			"DISCARDED", "DISCARDS", "SHUFFLED", "DECK", "INTO", "THEIR", "FROM", 
			"MOVED", "TAKE", "PRIZE", "PRIZE_CARDS", "KNOCKED", "OUT", "SWITCHED", 
			"RETIRED", "ENDED", "OPPONENT", "CONCEDED", "WINS", "ALL", "TAKEN", "A_SOMETHING", 
			"AND", "THEM", "ENERGY", "SELECTED", "DAMAGE_BREAKDOWN", "BASE_DAMAGE", 
			"TOTAL_DAMAGE", "ITEM", "POSSESSIVE", "CARD", "ATTACK", "ABILITY", "SPECIAL_CONDITION", 
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
			setState(74);
			setup();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(75);
				match(NEWLINE);
				setState(76);
				turn();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			gameEnd();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(83);
				match(NEWLINE);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(SETUP);
			setState(92);
			match(NEWLINE);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					setupAction();
					}
					} 
				}
				setState(98);
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
		public SetupActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setupAction; }
	}

	public final SetupActionContext setupAction() throws RecognitionException {
		SetupActionContext _localctx = new SetupActionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setupAction);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				coinChoice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				coinToss();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				firstPlayer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				openingHand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
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
		public TerminalNode CHOSE() { return getToken(gTCGParser.CHOSE, 0); }
		public TerminalNode FOR() { return getToken(gTCGParser.FOR, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode OPENING() { return getToken(gTCGParser.OPENING, 0); }
		public TerminalNode COIN() { return getToken(gTCGParser.COIN, 0); }
		public TerminalNode FLIP() { return getToken(gTCGParser.FLIP, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(107);
			match(CHOSE);
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
			match(FOR);
			setState(110);
			match(THE);
			setState(111);
			match(OPENING);
			setState(112);
			match(COIN);
			setState(113);
			match(FLIP);
			setState(114);
			match(DOT);
			setState(115);
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
		public TerminalNode WON() { return getToken(gTCGParser.WON, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode COIN() { return getToken(gTCGParser.COIN, 0); }
		public TerminalNode TOSS() { return getToken(gTCGParser.TOSS, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public CoinTossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coinToss; }
	}

	public final CoinTossContext coinToss() throws RecognitionException {
		CoinTossContext _localctx = new CoinTossContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_coinToss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(118);
			match(WON);
			setState(119);
			match(THE);
			setState(120);
			match(COIN);
			setState(121);
			match(TOSS);
			setState(122);
			match(DOT);
			setState(123);
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
		public TerminalNode DECIDED() { return getToken(gTCGParser.DECIDED, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode GO() { return getToken(gTCGParser.GO, 0); }
		public TerminalNode FIRST() { return getToken(gTCGParser.FIRST, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public FirstPlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstPlayer; }
	}

	public final FirstPlayerContext firstPlayer() throws RecognitionException {
		FirstPlayerContext _localctx = new FirstPlayerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_firstPlayer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			match(DECIDED);
			setState(127);
			match(TO);
			setState(128);
			match(GO);
			setState(129);
			match(FIRST);
			setState(130);
			match(DOT);
			setState(131);
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
		public TerminalNode DREW() { return getToken(gTCGParser.DREW, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode CARDS() { return getToken(gTCGParser.CARDS, 0); }
		public TerminalNode FOR() { return getToken(gTCGParser.FOR, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode OPENING() { return getToken(gTCGParser.OPENING, 0); }
		public TerminalNode HAND() { return getToken(gTCGParser.HAND, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			match(DREW);
			setState(135);
			match(NUMBER);
			setState(136);
			match(CARDS);
			setState(137);
			match(FOR);
			setState(138);
			match(THE);
			setState(139);
			match(OPENING);
			setState(140);
			match(HAND);
			setState(141);
			match(DOT);
			setState(142);
			match(NEWLINE);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HYPHEN) {
				{
				setState(143);
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
			setState(146);
			match(HYPHEN);
			setState(147);
			match(NUMBER);
			setState(148);
			match(DRAWN);
			setState(149);
			match(CARDS);
			setState(150);
			match(DOT);
			setState(151);
			match(NEWLINE);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(152);
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
		public TerminalNode PLAYED() { return getToken(gTCGParser.PLAYED, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(156);
			match(PLAYED);
			setState(157);
			match(CARD);
			setState(158);
			match(TO);
			setState(159);
			match(THE);
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIVE:
				{
				setState(160);
				match(ACTIVE);
				setState(161);
				match(SPOT);
				}
				break;
			case BENCH:
				{
				setState(162);
				match(BENCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(165);
			match(DOT);
			setState(166);
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
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode TURN() { return getToken(gTCGParser.TURN, 0); }
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			match(POSSESSIVE);
			setState(170);
			match(TURN);
			setState(171);
			match(NEWLINE);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					mainTurnAction();
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(178);
			turnActionBody();
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==EXCLAMATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(180);
			match(NEWLINE);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYPHEN) {
				{
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(181);
					subTurnAction();
					}
					break;
				case 2:
					{
					setState(182);
					damageBreakdown();
					}
					break;
				}
				}
				setState(187);
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
		enterRule(_localctx, 22, RULE_subTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(HYPHEN);
			setState(189);
			turnActionBody();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(190);
				match(DOT);
				}
			}

			setState(193);
			match(NEWLINE);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BULLET) {
				{
				{
				setState(194);
				cardList();
				}
				}
				setState(199);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				drawAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				playAction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				attachAction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				evolveAction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				attackAction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				retreatAction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				shuffleAction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				cardMovedAction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				discardAction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(209);
				prizeAction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(210);
				moveToHandAction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(211);
				activeSpotAction();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(212);
				switchAction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(213);
				knockoutAction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(214);
				damagedAction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(215);
				flippedAction();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(216);
				choiceAction();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(217);
				specialConditionAction();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(218);
				activateAction();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(219);
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
		public TerminalNode DREW() { return getToken(gTCGParser.DREW, 0); }
		public TerminalNode CARD_WORD() { return getToken(gTCGParser.CARD_WORD, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				match(DREW);
				setState(224);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				match(DREW);
				setState(227);
				match(A_SOMETHING);
				setState(228);
				match(CARD_WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				match(DREW);
				setState(231);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				match(DREW);
				setState(234);
				match(NUMBER);
				setState(235);
				match(CARD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				match(DREW);
				setState(238);
				match(NUMBER);
				setState(239);
				match(CARDS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(241);
				match(DREW);
				setState(242);
				match(NUMBER);
				setState(243);
				match(CARDS);
				setState(244);
				match(AND);
				setState(245);
				match(PLAYED);
				setState(246);
				match(THEM);
				setState(247);
				match(TO);
				setState(248);
				match(THE);
				setState(249);
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
		public TerminalNode PLAYED() { return getToken(gTCGParser.PLAYED, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		enterRule(_localctx, 28, RULE_playAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(253);
			match(PLAYED);
			setState(254);
			match(CARD);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(255);
				match(TO);
				setState(256);
				match(THE);
				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(257);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(258);
					match(ACTIVE);
					setState(259);
					match(SPOT);
					}
					break;
				case STADIUM:
					{
					setState(260);
					match(STADIUM);
					setState(261);
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
		public TerminalNode ATTACHED() { return getToken(gTCGParser.ATTACHED, 0); }
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
			match(ATTACHED);
			setState(268);
			match(CARD);
			setState(269);
			match(TO);
			setState(270);
			match(CARD);
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(271);
				match(ON);
				setState(272);
				match(THE);
				setState(273);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(274);
				match(IN);
				setState(275);
				match(THE);
				setState(276);
				match(ACTIVE);
				setState(277);
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
		public TerminalNode EVOLVED() { return getToken(gTCGParser.EVOLVED, 0); }
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(281);
			match(EVOLVED);
			setState(282);
			match(CARD);
			setState(283);
			match(TO);
			setState(284);
			match(CARD);
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(285);
				match(ON);
				setState(286);
				match(THE);
				setState(287);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(288);
				match(IN);
				setState(289);
				match(THE);
				setState(290);
				match(ACTIVE);
				setState(291);
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
		public List<TerminalNode> OPPONENT() { return getTokens(gTCGParser.OPPONENT); }
		public TerminalNode OPPONENT(int i) {
			return getToken(gTCGParser.OPPONENT, i);
		}
		public List<TerminalNode> PLAYER() { return getTokens(gTCGParser.PLAYER); }
		public TerminalNode PLAYER(int i) {
			return getToken(gTCGParser.PLAYER, i);
		}
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
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(295);
			match(POSSESSIVE);
			setState(296);
			match(CARD);
			setState(297);
			match(USED);
			setState(298);
			match(ATTACK);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(299);
				match(ON);
				setState(300);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(301);
				match(POSSESSIVE);
				setState(302);
				match(CARD);
				setState(303);
				match(FOR);
				setState(304);
				match(NUMBER);
				setState(305);
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
	}

	public final DamageBreakdownContext damageBreakdown() throws RecognitionException {
		DamageBreakdownContext _localctx = new DamageBreakdownContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_damageBreakdown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(HYPHEN);
			setState(309);
			match(DAMAGE_BREAKDOWN);
			setState(310);
			match(COLON);
			setState(311);
			match(NEWLINE);
			setState(312);
			match(BULLET);
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(313);
				match(NUMBER);
				setState(314);
				match(ATTACHED);
				setState(315);
				match(ENERGY);
				setState(316);
				match(COLON);
				setState(317);
				match(NUMBER);
				setState(318);
				match(DAMAGE);
				setState(319);
				match(NEWLINE);
				}
				break;
			case 2:
				{
				setState(320);
				match(NUMBER);
				setState(321);
				match(SELECTED);
				setState(322);
				match(ENERGY);
				setState(323);
				match(COLON);
				setState(324);
				match(NUMBER);
				setState(325);
				match(DAMAGE);
				setState(326);
				match(NEWLINE);
				}
				break;
			case 3:
				{
				{
				setState(327);
				match(BASE_DAMAGE);
				setState(328);
				match(COLON);
				setState(329);
				match(NUMBER);
				setState(330);
				match(DAMAGE);
				setState(331);
				match(NEWLINE);
				setState(332);
				damageBonusLine();
				setState(333);
				match(BULLET);
				setState(334);
				match(TOTAL_DAMAGE);
				setState(335);
				match(COLON);
				setState(336);
				match(NUMBER);
				setState(337);
				match(DAMAGE);
				setState(338);
				match(NEWLINE);
				}
				}
				break;
			}
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(342);
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
	}

	public final DamageBonusLineContext damageBonusLine() throws RecognitionException {
		DamageBonusLineContext _localctx = new DamageBonusLineContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_damageBonusLine);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(BULLET);
				setState(346);
				match(LPAREN);
				setState(347);
				match(ITEM);
				setState(348);
				match(RPAREN);
				setState(349);
				match(CARD);
				setState(350);
				match(COLON);
				setState(351);
				match(NUMBER);
				setState(352);
				match(DAMAGE);
				setState(353);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(BULLET);
				setState(355);
				match(NUMBER);
				setState(356);
				_la = _input.LA(1);
				if ( !(_la==ATTACHED || _la==SELECTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(357);
				match(ENERGY);
				setState(358);
				match(COLON);
				setState(359);
				match(NUMBER);
				setState(360);
				match(DAMAGE);
				setState(361);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(362);
				match(BULLET);
				setState(363);
				match(LPAREN);
				setState(364);
				match(ABILITY_WORD);
				setState(365);
				match(RPAREN);
				setState(366);
				match(ABILITY);
				setState(367);
				match(COLON);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(368);
					match(HYPHEN);
					}
				}

				setState(371);
				match(NUMBER);
				setState(372);
				match(DAMAGE);
				setState(373);
				match(NEWLINE);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(374);
				match(BULLET);
				setState(375);
				match(LPAREN);
				setState(376);
				match(ABILITY_WORD);
				setState(377);
				match(RPAREN);
				setState(378);
				match(ABILITY);
				setState(379);
				match(COLON);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(380);
					match(HYPHEN);
					}
				}

				setState(383);
				match(NUMBER);
				setState(384);
				match(DAMAGE);
				setState(385);
				match(NEWLINE);
				setState(386);
				match(BULLET);
				setState(387);
				match(NUMBER);
				setState(388);
				match(ATTACHED);
				setState(389);
				match(ENERGY);
				setState(390);
				match(COLON);
				setState(391);
				match(NUMBER);
				setState(392);
				match(DAMAGE);
				setState(393);
				match(NEWLINE);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(394);
				match(BULLET);
				setState(395);
				match(LPAREN);
				setState(396);
				match(POKEMON_TOOL);
				setState(397);
				match(RPAREN);
				setState(398);
				match(CARD);
				setState(399);
				match(COLON);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(400);
					match(HYPHEN);
					}
				}

				setState(403);
				match(NUMBER);
				setState(404);
				match(DAMAGE);
				setState(405);
				match(NEWLINE);
				setState(406);
				match(BULLET);
				setState(407);
				match(LPAREN);
				setState(408);
				match(ATTACK_WORD);
				setState(409);
				match(RPAREN);
				setState(410);
				match(ATTACK);
				setState(411);
				match(COLON);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(412);
					match(HYPHEN);
					}
				}

				setState(415);
				match(NUMBER);
				setState(416);
				match(DAMAGE);
				setState(417);
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
		public TerminalNode RETIRED() { return getToken(gTCGParser.RETIRED, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode BENCH() { return getToken(gTCGParser.BENCH, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public RetreatActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retreatAction; }
	}

	public final RetreatActionContext retreatAction() throws RecognitionException {
		RetreatActionContext _localctx = new RetreatActionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_retreatAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(421);
			match(RETIRED);
			setState(422);
			match(CARD);
			setState(423);
			match(TO);
			setState(424);
			match(THE);
			setState(425);
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
		public TerminalNode SHUFFLED() { return getToken(gTCGParser.SHUFFLED, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public TerminalNode DECK() { return getToken(gTCGParser.DECK, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(428);
				match(SHUFFLED);
				setState(429);
				match(THEIR);
				setState(430);
				match(DECK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(432);
				match(SHUFFLED);
				setState(433);
				match(NUMBER);
				setState(434);
				match(CARDS);
				setState(435);
				match(INTO);
				setState(436);
				match(THEIR);
				setState(437);
				match(DECK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(439);
				match(SHUFFLED);
				setState(440);
				match(CARD);
				setState(441);
				match(INTO);
				setState(442);
				match(THEIR);
				setState(443);
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
		public TerminalNode DISCARDED() { return getToken(gTCGParser.DISCARDED, 0); }
		public List<TerminalNode> CARD() { return getTokens(gTCGParser.CARD); }
		public TerminalNode CARD(int i) {
			return getToken(gTCGParser.CARD, i);
		}
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
		int _la;
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(447);
				match(DISCARDED);
				setState(448);
				match(CARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(450);
				match(DISCARDED);
				setState(451);
				match(NUMBER);
				setState(452);
				match(CARDS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(NUMBER);
				setState(454);
				match(CARDS);
				setState(455);
				match(WERE);
				setState(456);
				match(DISCARDED);
				setState(457);
				match(FROM);
				setState(458);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(459);
				match(POSSESSIVE);
				setState(460);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				match(CARD);
				setState(462);
				match(WAS);
				setState(463);
				match(DISCARDED);
				setState(464);
				match(FROM);
				setState(465);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(466);
				match(POSSESSIVE);
				setState(467);
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
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public TerminalNode PRIZE() { return getToken(gTCGParser.PRIZE, 0); }
		public TerminalNode CARD_WORD() { return getToken(gTCGParser.CARD_WORD, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
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
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(471);
				match(TAKE);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==A_SOMETHING) {
					{
					setState(472);
					match(A_SOMETHING);
					}
				}

				setState(475);
				match(PRIZE);
				setState(476);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(478);
				match(TAKE);
				setState(479);
				match(NUMBER);
				setState(480);
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
		public TerminalNode MOVED() { return getToken(gTCGParser.MOVED, 0); }
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode TO() { return getToken(gTCGParser.TO, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public TerminalNode HAND() { return getToken(gTCGParser.HAND, 0); }
		public List<TerminalNode> OPPONENT() { return getTokens(gTCGParser.OPPONENT); }
		public TerminalNode OPPONENT(int i) {
			return getToken(gTCGParser.OPPONENT, i);
		}
		public List<TerminalNode> PLAYER() { return getTokens(gTCGParser.PLAYER); }
		public TerminalNode PLAYER(int i) {
			return getToken(gTCGParser.PLAYER, i);
		}
		public MoveToHandActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveToHandAction; }
	}

	public final MoveToHandActionContext moveToHandAction() throws RecognitionException {
		MoveToHandActionContext _localctx = new MoveToHandActionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_moveToHandAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(484);
			match(MOVED);
			setState(485);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(486);
			match(POSSESSIVE);
			setState(487);
			match(CARD);
			setState(488);
			match(TO);
			setState(489);
			match(THEIR);
			setState(490);
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
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode IS() { return getToken(gTCGParser.IS, 0); }
		public TerminalNode NOW() { return getToken(gTCGParser.NOW, 0); }
		public TerminalNode IN() { return getToken(gTCGParser.IN, 0); }
		public TerminalNode THE() { return getToken(gTCGParser.THE, 0); }
		public TerminalNode ACTIVE() { return getToken(gTCGParser.ACTIVE, 0); }
		public TerminalNode SPOT() { return getToken(gTCGParser.SPOT, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public ActiveSpotActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activeSpotAction; }
	}

	public final ActiveSpotActionContext activeSpotAction() throws RecognitionException {
		ActiveSpotActionContext _localctx = new ActiveSpotActionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_activeSpotAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(493);
			match(POSSESSIVE);
			setState(494);
			match(CARD);
			setState(495);
			match(IS);
			setState(496);
			match(NOW);
			setState(497);
			match(IN);
			setState(498);
			match(THE);
			setState(499);
			match(ACTIVE);
			setState(500);
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
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode WAS() { return getToken(gTCGParser.WAS, 0); }
		public TerminalNode KNOCKED() { return getToken(gTCGParser.KNOCKED, 0); }
		public TerminalNode OUT() { return getToken(gTCGParser.OUT, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public KnockoutActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knockoutAction; }
	}

	public final KnockoutActionContext knockoutAction() throws RecognitionException {
		KnockoutActionContext _localctx = new KnockoutActionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_knockoutAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(503);
			match(POSSESSIVE);
			setState(504);
			match(CARD);
			setState(505);
			match(WAS);
			setState(506);
			match(KNOCKED);
			setState(507);
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
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode HAND() { return getToken(gTCGParser.HAND, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
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
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_SOMETHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(A_SOMETHING);
				setState(510);
				match(CARD_WORD);
				setState(511);
				match(WAS);
				setState(512);
				match(ADDED);
				setState(513);
				match(TO);
				setState(514);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(515);
				match(POSSESSIVE);
				setState(516);
				match(HAND);
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(CARD);
				setState(518);
				match(WAS);
				setState(519);
				match(ADDED);
				setState(520);
				match(TO);
				setState(521);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(522);
				match(POSSESSIVE);
				setState(523);
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
		public List<TerminalNode> OPPONENT() { return getTokens(gTCGParser.OPPONENT); }
		public TerminalNode OPPONENT(int i) {
			return getToken(gTCGParser.OPPONENT, i);
		}
		public List<TerminalNode> PLAYER() { return getTokens(gTCGParser.PLAYER); }
		public TerminalNode PLAYER(int i) {
			return getToken(gTCGParser.PLAYER, i);
		}
		public SwitchActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchAction; }
	}

	public final SwitchActionContext switchAction() throws RecognitionException {
		SwitchActionContext _localctx = new SwitchActionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_switchAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(527);
			match(POSSESSIVE);
			setState(528);
			match(CARD);
			setState(529);
			match(WAS);
			setState(530);
			match(SWITCHED);
			setState(531);
			match(WITH);
			setState(532);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(533);
			match(POSSESSIVE);
			setState(534);
			match(CARD);
			setState(535);
			match(TO);
			setState(536);
			match(BECOME);
			setState(537);
			match(THE);
			setState(538);
			match(ACTIVE);
			setState(539);
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
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public DamagedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damagedAction; }
	}

	public final DamagedActionContext damagedAction() throws RecognitionException {
		DamagedActionContext _localctx = new DamagedActionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_damagedAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(542);
			match(POSSESSIVE);
			setState(543);
			match(CARD);
			setState(544);
			match(TAKE);
			setState(545);
			match(NUMBER);
			setState(546);
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
		public TerminalNode FLIPPED() { return getToken(gTCGParser.FLIPPED, 0); }
		public TerminalNode A_SOMETHING() { return getToken(gTCGParser.A_SOMETHING, 0); }
		public TerminalNode COIN() { return getToken(gTCGParser.COIN, 0); }
		public TerminalNode AND() { return getToken(gTCGParser.AND, 0); }
		public TerminalNode IT() { return getToken(gTCGParser.IT, 0); }
		public TerminalNode LANDED() { return getToken(gTCGParser.LANDED, 0); }
		public TerminalNode ON() { return getToken(gTCGParser.ON, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode TAILS() { return getToken(gTCGParser.TAILS, 0); }
		public TerminalNode HEADS() { return getToken(gTCGParser.HEADS, 0); }
		public FlippedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flippedAction; }
	}

	public final FlippedActionContext flippedAction() throws RecognitionException {
		FlippedActionContext _localctx = new FlippedActionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_flippedAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(549);
			match(FLIPPED);
			setState(550);
			match(A_SOMETHING);
			setState(551);
			match(COIN);
			setState(552);
			match(AND);
			setState(553);
			match(IT);
			setState(554);
			match(LANDED);
			setState(555);
			match(ON);
			setState(556);
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
		public TerminalNode CHOSE() { return getToken(gTCGParser.CHOSE, 0); }
		public TerminalNode ATTACK() { return getToken(gTCGParser.ATTACK, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public ChoiceActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceAction; }
	}

	public final ChoiceActionContext choiceAction() throws RecognitionException {
		ChoiceActionContext _localctx = new ChoiceActionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_choiceAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(559);
			match(CHOSE);
			setState(560);
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
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public TerminalNode IS() { return getToken(gTCGParser.IS, 0); }
		public TerminalNode NOW() { return getToken(gTCGParser.NOW, 0); }
		public TerminalNode SPECIAL_CONDITION() { return getToken(gTCGParser.SPECIAL_CONDITION, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public SpecialConditionActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialConditionAction; }
	}

	public final SpecialConditionActionContext specialConditionAction() throws RecognitionException {
		SpecialConditionActionContext _localctx = new SpecialConditionActionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_specialConditionAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(563);
			match(POSSESSIVE);
			setState(564);
			match(CARD);
			setState(565);
			match(IS);
			setState(566);
			match(NOW);
			setState(567);
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
		enterRule(_localctx, 66, RULE_activateAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(CARD);
			setState(570);
			match(WAS);
			setState(571);
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
	public static class EndTurnContext extends ParserRuleContext {
		public TerminalNode ENDED() { return getToken(gTCGParser.ENDED, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public TerminalNode TURN() { return getToken(gTCGParser.TURN, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public EndTurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTurn; }
	}

	public final EndTurnContext endTurn() throws RecognitionException {
		EndTurnContext _localctx = new EndTurnContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_endTurn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(574);
			match(ENDED);
			setState(575);
			match(THEIR);
			setState(576);
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
		public TerminalNode WINS() { return getToken(gTCGParser.WINS, 0); }
		public List<TerminalNode> OPPONENT() { return getTokens(gTCGParser.OPPONENT); }
		public TerminalNode OPPONENT(int i) {
			return getToken(gTCGParser.OPPONENT, i);
		}
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public TerminalNode CONCEDED() { return getToken(gTCGParser.CONCEDED, 0); }
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public TerminalNode OF() { return getToken(gTCGParser.OF, 0); }
		public TerminalNode THEIR() { return getToken(gTCGParser.THEIR, 0); }
		public GameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameEnd; }
	}

	public final GameEndContext gameEnd() throws RecognitionException {
		GameEndContext _localctx = new GameEndContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_gameEnd);
		int _la;
		try {
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(ALL);
				setState(579);
				match(PRIZE_CARDS);
				setState(580);
				match(TAKEN);
				setState(581);
				match(DOT);
				setState(582);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(583);
				match(WINS);
				setState(584);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(OPPONENT);
				setState(586);
				match(CONCEDED);
				setState(587);
				match(DOT);
				setState(588);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(589);
				match(WINS);
				setState(590);
				match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				match(OPPONENT);
				setState(592);
				match(TAKE);
				setState(593);
				match(ALL);
				setState(594);
				match(OF);
				setState(595);
				match(THEIR);
				setState(596);
				match(PRIZE_CARDS);
				setState(597);
				match(DOT);
				setState(598);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(599);
				match(WINS);
				setState(600);
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
		enterRule(_localctx, 72, RULE_cardList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(BULLET);
			setState(604);
			match(CARD);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(605);
				match(COMMA);
				setState(606);
				match(CARD);
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
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
		"\u0004\u0001_\u0267\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"N\b\u0000\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"U\b\u0000\n\u0000\f\u0000X\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001_\b\u0001\n\u0001\f\u0001b\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"i\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0091\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u009a\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00a4\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ae\b\t\n\t\f\t\u00b1\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b8\b\n\n\n\f\n\u00bb\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c0\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00c4\b\u000b\n\u000b\f\u000b\u00c7\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00dd\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00fb\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0107\b\u000e\u0003\u000e\u0109"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0117\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0125\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0133"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0155\b\u0012\u0001\u0012\u0003"+
		"\u0012\u0158\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0172\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u017e\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0192\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u019e\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01a3\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01bd"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01d5"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01da\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u01e2\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u020d\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u025a\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0005$\u0260\b$\n$\f$\u0263\t$\u0001$\u0001$\u0001$\u0000\u0000%\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFH\u0000\u0004\u0002\u0000AAUU\u0001\u0000\u0006"+
		"\u0007\u0002\u0000VVYY\u0002\u0000\u001d\u001dJJ\u0284\u0000J\u0001\u0000"+
		"\u0000\u0000\u0002[\u0001\u0000\u0000\u0000\u0004h\u0001\u0000\u0000\u0000"+
		"\u0006j\u0001\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000\n}\u0001\u0000"+
		"\u0000\u0000\f\u0085\u0001\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000"+
		"\u0000\u0010\u009b\u0001\u0000\u0000\u0000\u0012\u00a8\u0001\u0000\u0000"+
		"\u0000\u0014\u00b2\u0001\u0000\u0000\u0000\u0016\u00bc\u0001\u0000\u0000"+
		"\u0000\u0018\u00dc\u0001\u0000\u0000\u0000\u001a\u00fa\u0001\u0000\u0000"+
		"\u0000\u001c\u00fc\u0001\u0000\u0000\u0000\u001e\u010a\u0001\u0000\u0000"+
		"\u0000 \u0118\u0001\u0000\u0000\u0000\"\u0126\u0001\u0000\u0000\u0000"+
		"$\u0134\u0001\u0000\u0000\u0000&\u01a2\u0001\u0000\u0000\u0000(\u01a4"+
		"\u0001\u0000\u0000\u0000*\u01bc\u0001\u0000\u0000\u0000,\u01d4\u0001\u0000"+
		"\u0000\u0000.\u01e1\u0001\u0000\u0000\u00000\u01e3\u0001\u0000\u0000\u0000"+
		"2\u01ec\u0001\u0000\u0000\u00004\u01f6\u0001\u0000\u0000\u00006\u020c"+
		"\u0001\u0000\u0000\u00008\u020e\u0001\u0000\u0000\u0000:\u021d\u0001\u0000"+
		"\u0000\u0000<\u0224\u0001\u0000\u0000\u0000>\u022e\u0001\u0000\u0000\u0000"+
		"@\u0232\u0001\u0000\u0000\u0000B\u0239\u0001\u0000\u0000\u0000D\u023d"+
		"\u0001\u0000\u0000\u0000F\u0259\u0001\u0000\u0000\u0000H\u025b\u0001\u0000"+
		"\u0000\u0000JO\u0003\u0002\u0001\u0000KL\u0005^\u0000\u0000LN\u0003\u0012"+
		"\t\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RV\u0003F#\u0000SU\u0005^\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"YZ\u0005\u0000\u0000\u0001Z\u0001\u0001\u0000\u0000\u0000[\\\u0005\u0004"+
		"\u0000\u0000\\`\u0005^\u0000\u0000]_\u0003\u0004\u0002\u0000^]\u0001\u0000"+
		"\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a\u0003\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000ci\u0003\u0006\u0003\u0000di\u0003\b\u0004\u0000ei\u0003\n\u0005"+
		"\u0000fi\u0003\f\u0006\u0000gi\u0003\u0010\b\u0000hc\u0001\u0000\u0000"+
		"\u0000hd\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000i\u0005\u0001\u0000\u0000\u0000"+
		"jk\u0007\u0000\u0000\u0000kl\u0005\u0005\u0000\u0000lm\u0007\u0001\u0000"+
		"\u0000mn\u0005\b\u0000\u0000no\u0005\t\u0000\u0000op\u0005\n\u0000\u0000"+
		"pq\u0005\u000b\u0000\u0000qr\u0005\f\u0000\u0000rs\u0005V\u0000\u0000"+
		"st\u0005^\u0000\u0000t\u0007\u0001\u0000\u0000\u0000uv\u0007\u0000\u0000"+
		"\u0000vw\u0005\u000e\u0000\u0000wx\u0005\t\u0000\u0000xy\u0005\u000b\u0000"+
		"\u0000yz\u0005\u000f\u0000\u0000z{\u0005V\u0000\u0000{|\u0005^\u0000\u0000"+
		"|\t\u0001\u0000\u0000\u0000}~\u0007\u0000\u0000\u0000~\u007f\u0005\u0010"+
		"\u0000\u0000\u007f\u0080\u0005\u0011\u0000\u0000\u0080\u0081\u0005\u0012"+
		"\u0000\u0000\u0081\u0082\u0005\u0013\u0000\u0000\u0082\u0083\u0005V\u0000"+
		"\u0000\u0083\u0084\u0005^\u0000\u0000\u0084\u000b\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0007\u0000\u0000\u0000\u0086\u0087\u0005\u0014\u0000\u0000"+
		"\u0087\u0088\u0005T\u0000\u0000\u0088\u0089\u0005\u0016\u0000\u0000\u0089"+
		"\u008a\u0005\b\u0000\u0000\u008a\u008b\u0005\t\u0000\u0000\u008b\u008c"+
		"\u0005\n\u0000\u0000\u008c\u008d\u0005\u001b\u0000\u0000\u008d\u008e\u0005"+
		"V\u0000\u0000\u008e\u0090\u0005^\u0000\u0000\u008f\u0091\u0003\u000e\u0007"+
		"\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092\u0093\u0005]\u0000\u0000"+
		"\u0093\u0094\u0005T\u0000\u0000\u0094\u0095\u0005\u0015\u0000\u0000\u0095"+
		"\u0096\u0005\u0016\u0000\u0000\u0096\u0097\u0005V\u0000\u0000\u0097\u0099"+
		"\u0005^\u0000\u0000\u0098\u009a\u0003H$\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u000f\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0007\u0000\u0000\u0000\u009c\u009d\u0005\u001c"+
		"\u0000\u0000\u009d\u009e\u0005P\u0000\u0000\u009e\u009f\u0005\u0011\u0000"+
		"\u0000\u009f\u00a3\u0005\t\u0000\u0000\u00a0\u00a1\u0005+\u0000\u0000"+
		"\u00a1\u00a4\u0005-\u0000\u0000\u00a2\u00a4\u0005.\u0000\u0000\u00a3\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005V\u0000\u0000\u00a6\u00a7\u0005"+
		"^\u0000\u0000\u00a7\u0011\u0001\u0000\u0000\u0000\u00a8\u00a9\u0007\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005O\u0000\u0000\u00aa\u00ab\u0005\u0001\u0000"+
		"\u0000\u00ab\u00af\u0005^\u0000\u0000\u00ac\u00ae\u0003\u0014\n\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u0013\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0003\u0018\f\u0000\u00b3\u00b4\u0007\u0002\u0000\u0000\u00b4"+
		"\u00b9\u0005^\u0000\u0000\u00b5\u00b8\u0003\u0016\u000b\u0000\u00b6\u00b8"+
		"\u0003$\u0012\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u0015\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"]\u0000\u0000\u00bd\u00bf\u0003\u0018\f\u0000\u00be\u00c0\u0005V\u0000"+
		"\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c5\u0005^\u0000\u0000"+
		"\u00c2\u00c4\u0003H$\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u0017\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c8\u00dd\u0003\u001a\r\u0000\u00c9\u00dd\u0003"+
		"\u001c\u000e\u0000\u00ca\u00dd\u0003\u001e\u000f\u0000\u00cb\u00dd\u0003"+
		" \u0010\u0000\u00cc\u00dd\u0003\"\u0011\u0000\u00cd\u00dd\u0003(\u0014"+
		"\u0000\u00ce\u00dd\u0003*\u0015\u0000\u00cf\u00dd\u00036\u001b\u0000\u00d0"+
		"\u00dd\u0003,\u0016\u0000\u00d1\u00dd\u0003.\u0017\u0000\u00d2\u00dd\u0003"+
		"0\u0018\u0000\u00d3\u00dd\u00032\u0019\u0000\u00d4\u00dd\u00038\u001c"+
		"\u0000\u00d5\u00dd\u00034\u001a\u0000\u00d6\u00dd\u0003:\u001d\u0000\u00d7"+
		"\u00dd\u0003<\u001e\u0000\u00d8\u00dd\u0003>\u001f\u0000\u00d9\u00dd\u0003"+
		"@ \u0000\u00da\u00dd\u0003B!\u0000\u00db\u00dd\u0003D\"\u0000\u00dc\u00c8"+
		"\u0001\u0000\u0000\u0000\u00dc\u00c9\u0001\u0000\u0000\u0000\u00dc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00dc\u00cb\u0001\u0000\u0000\u0000\u00dc\u00cc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00cd\u0001\u0000\u0000\u0000\u00dc\u00ce"+
		"\u0001\u0000\u0000\u0000\u00dc\u00cf\u0001\u0000\u0000\u0000\u00dc\u00d0"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d1\u0001\u0000\u0000\u0000\u00dc\u00d2"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d3\u0001\u0000\u0000\u0000\u00dc\u00d4"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d5\u0001\u0000\u0000\u0000\u00dc\u00d6"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000\u00dc\u00d8"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u0019"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005\u0014\u0000\u0000\u00e0\u00fb\u0005\u0017\u0000\u0000\u00e1\u00e2"+
		"\u0007\u0000\u0000\u0000\u00e2\u00e3\u0005\u0014\u0000\u0000\u00e3\u00e4"+
		"\u0005F\u0000\u0000\u00e4\u00fb\u0005\u0017\u0000\u0000\u00e5\u00e6\u0007"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0005\u0014\u0000\u0000\u00e7\u00fb\u0005"+
		"P\u0000\u0000\u00e8\u00e9\u0007\u0000\u0000\u0000\u00e9\u00ea\u0005\u0014"+
		"\u0000\u0000\u00ea\u00eb\u0005T\u0000\u0000\u00eb\u00fb\u0005P\u0000\u0000"+
		"\u00ec\u00ed\u0007\u0000\u0000\u0000\u00ed\u00ee\u0005\u0014\u0000\u0000"+
		"\u00ee\u00ef\u0005T\u0000\u0000\u00ef\u00fb\u0005\u0016\u0000\u0000\u00f0"+
		"\u00f1\u0007\u0000\u0000\u0000\u00f1\u00f2\u0005\u0014\u0000\u0000\u00f2"+
		"\u00f3\u0005T\u0000\u0000\u00f3\u00f4\u0005\u0016\u0000\u0000\u00f4\u00f5"+
		"\u0005G\u0000\u0000\u00f5\u00f6\u0005\u001c\u0000\u0000\u00f6\u00f7\u0005"+
		"H\u0000\u0000\u00f7\u00f8\u0005\u0011\u0000\u0000\u00f8\u00f9\u0005\t"+
		"\u0000\u0000\u00f9\u00fb\u0005.\u0000\u0000\u00fa\u00de\u0001\u0000\u0000"+
		"\u0000\u00fa\u00e1\u0001\u0000\u0000\u0000\u00fa\u00e5\u0001\u0000\u0000"+
		"\u0000\u00fa\u00e8\u0001\u0000\u0000\u0000\u00fa\u00ec\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f0\u0001\u0000\u0000\u0000\u00fb\u001b\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0007\u0000\u0000\u0000\u00fd\u00fe\u0005\u001c\u0000"+
		"\u0000\u00fe\u0108\u0005P\u0000\u0000\u00ff\u0100\u0005\u0011\u0000\u0000"+
		"\u0100\u0106\u0005\t\u0000\u0000\u0101\u0107\u0005.\u0000\u0000\u0102"+
		"\u0103\u0005+\u0000\u0000\u0103\u0107\u0005-\u0000\u0000\u0104\u0105\u0005"+
		"/\u0000\u0000\u0105\u0107\u0005-\u0000\u0000\u0106\u0101\u0001\u0000\u0000"+
		"\u0000\u0106\u0102\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u00ff\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u001d\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0007\u0000\u0000\u0000\u010b\u010c\u0005\u001d\u0000"+
		"\u0000\u010c\u010d\u0005P\u0000\u0000\u010d\u010e\u0005\u0011\u0000\u0000"+
		"\u010e\u0116\u0005P\u0000\u0000\u010f\u0110\u0005!\u0000\u0000\u0110\u0111"+
		"\u0005\t\u0000\u0000\u0111\u0117\u0005.\u0000\u0000\u0112\u0113\u0005"+
		"\"\u0000\u0000\u0113\u0114\u0005\t\u0000\u0000\u0114\u0115\u0005+\u0000"+
		"\u0000\u0115\u0117\u0005-\u0000\u0000\u0116\u010f\u0001\u0000\u0000\u0000"+
		"\u0116\u0112\u0001\u0000\u0000\u0000\u0117\u001f\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0007\u0000\u0000\u0000\u0119\u011a\u0005\u001e\u0000\u0000"+
		"\u011a\u011b\u0005P\u0000\u0000\u011b\u011c\u0005\u0011\u0000\u0000\u011c"+
		"\u0124\u0005P\u0000\u0000\u011d\u011e\u0005!\u0000\u0000\u011e\u011f\u0005"+
		"\t\u0000\u0000\u011f\u0125\u0005.\u0000\u0000\u0120\u0121\u0005\"\u0000"+
		"\u0000\u0121\u0122\u0005\t\u0000\u0000\u0122\u0123\u0005+\u0000\u0000"+
		"\u0123\u0125\u0005-\u0000\u0000\u0124\u011d\u0001\u0000\u0000\u0000\u0124"+
		"\u0120\u0001\u0000\u0000\u0000\u0125!\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0007\u0000\u0000\u0000\u0127\u0128\u0005O\u0000\u0000\u0128\u0129\u0005"+
		"P\u0000\u0000\u0129\u012a\u0005\u001f\u0000\u0000\u012a\u0132\u0005Q\u0000"+
		"\u0000\u012b\u012c\u0005!\u0000\u0000\u012c\u012d\u0007\u0000\u0000\u0000"+
		"\u012d\u012e\u0005O\u0000\u0000\u012e\u012f\u0005P\u0000\u0000\u012f\u0130"+
		"\u0005\b\u0000\u0000\u0130\u0131\u0005T\u0000\u0000\u0131\u0133\u0005"+
		"0\u0000\u0000\u0132\u012b\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133#\u0001\u0000\u0000\u0000\u0134\u0135\u0005]\u0000\u0000"+
		"\u0135\u0136\u0005K\u0000\u0000\u0136\u0137\u0005X\u0000\u0000\u0137\u0138"+
		"\u0005^\u0000\u0000\u0138\u0154\u0005\\\u0000\u0000\u0139\u013a\u0005"+
		"T\u0000\u0000\u013a\u013b\u0005\u001d\u0000\u0000\u013b\u013c\u0005I\u0000"+
		"\u0000\u013c\u013d\u0005X\u0000\u0000\u013d\u013e\u0005T\u0000\u0000\u013e"+
		"\u013f\u00050\u0000\u0000\u013f\u0155\u0005^\u0000\u0000\u0140\u0141\u0005"+
		"T\u0000\u0000\u0141\u0142\u0005J\u0000\u0000\u0142\u0143\u0005I\u0000"+
		"\u0000\u0143\u0144\u0005X\u0000\u0000\u0144\u0145\u0005T\u0000\u0000\u0145"+
		"\u0146\u00050\u0000\u0000\u0146\u0155\u0005^\u0000\u0000\u0147\u0148\u0005"+
		"L\u0000\u0000\u0148\u0149\u0005X\u0000\u0000\u0149\u014a\u0005T\u0000"+
		"\u0000\u014a\u014b\u00050\u0000\u0000\u014b\u014c\u0005^\u0000\u0000\u014c"+
		"\u014d\u0003&\u0013\u0000\u014d\u014e\u0005\\\u0000\u0000\u014e\u014f"+
		"\u0005M\u0000\u0000\u014f\u0150\u0005X\u0000\u0000\u0150\u0151\u0005T"+
		"\u0000\u0000\u0151\u0152\u00050\u0000\u0000\u0152\u0153\u0005^\u0000\u0000"+
		"\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0139\u0001\u0000\u0000\u0000"+
		"\u0154\u0140\u0001\u0000\u0000\u0000\u0154\u0147\u0001\u0000\u0000\u0000"+
		"\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0158\u0005^\u0000\u0000\u0157"+
		"\u0156\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158"+
		"%\u0001\u0000\u0000\u0000\u0159\u015a\u0005\\\u0000\u0000\u015a\u015b"+
		"\u0005Z\u0000\u0000\u015b\u015c\u0005N\u0000\u0000\u015c\u015d\u0005["+
		"\u0000\u0000\u015d\u015e\u0005P\u0000\u0000\u015e\u015f\u0005X\u0000\u0000"+
		"\u015f\u0160\u0005T\u0000\u0000\u0160\u0161\u00050\u0000\u0000\u0161\u01a3"+
		"\u0005^\u0000\u0000\u0162\u0163\u0005\\\u0000\u0000\u0163\u0164\u0005"+
		"T\u0000\u0000\u0164\u0165\u0007\u0003\u0000\u0000\u0165\u0166\u0005I\u0000"+
		"\u0000\u0166\u0167\u0005X\u0000\u0000\u0167\u0168\u0005T\u0000\u0000\u0168"+
		"\u0169\u00050\u0000\u0000\u0169\u01a3\u0005^\u0000\u0000\u016a\u016b\u0005"+
		"\\\u0000\u0000\u016b\u016c\u0005Z\u0000\u0000\u016c\u016d\u0005\u0018"+
		"\u0000\u0000\u016d\u016e\u0005[\u0000\u0000\u016e\u016f\u0005R\u0000\u0000"+
		"\u016f\u0171\u0005X\u0000\u0000\u0170\u0172\u0005]\u0000\u0000\u0171\u0170"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0005T\u0000\u0000\u0174\u0175\u0005"+
		"0\u0000\u0000\u0175\u01a3\u0005^\u0000\u0000\u0176\u0177\u0005\\\u0000"+
		"\u0000\u0177\u0178\u0005Z\u0000\u0000\u0178\u0179\u0005\u0018\u0000\u0000"+
		"\u0179\u017a\u0005[\u0000\u0000\u017a\u017b\u0005R\u0000\u0000\u017b\u017d"+
		"\u0005X\u0000\u0000\u017c\u017e\u0005]\u0000\u0000\u017d\u017c\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0005T\u0000\u0000\u0180\u0181\u00050\u0000\u0000"+
		"\u0181\u0182\u0005^\u0000\u0000\u0182\u0183\u0005\\\u0000\u0000\u0183"+
		"\u0184\u0005T\u0000\u0000\u0184\u0185\u0005\u001d\u0000\u0000\u0185\u0186"+
		"\u0005I\u0000\u0000\u0186\u0187\u0005X\u0000\u0000\u0187\u0188\u0005T"+
		"\u0000\u0000\u0188\u0189\u00050\u0000\u0000\u0189\u01a3\u0005^\u0000\u0000"+
		"\u018a\u018b\u0005\\\u0000\u0000\u018b\u018c\u0005Z\u0000\u0000\u018c"+
		"\u018d\u0005\u001a\u0000\u0000\u018d\u018e\u0005[\u0000\u0000\u018e\u018f"+
		"\u0005P\u0000\u0000\u018f\u0191\u0005X\u0000\u0000\u0190\u0192\u0005]"+
		"\u0000\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0005T\u0000"+
		"\u0000\u0194\u0195\u00050\u0000\u0000\u0195\u0196\u0005^\u0000\u0000\u0196"+
		"\u0197\u0005\\\u0000\u0000\u0197\u0198\u0005Z\u0000\u0000\u0198\u0199"+
		"\u0005\u0019\u0000\u0000\u0199\u019a\u0005[\u0000\u0000\u019a\u019b\u0005"+
		"Q\u0000\u0000\u019b\u019d\u0005X\u0000\u0000\u019c\u019e\u0005]\u0000"+
		"\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0005T\u0000\u0000"+
		"\u01a0\u01a1\u00050\u0000\u0000\u01a1\u01a3\u0005^\u0000\u0000\u01a2\u0159"+
		"\u0001\u0000\u0000\u0000\u01a2\u0162\u0001\u0000\u0000\u0000\u01a2\u016a"+
		"\u0001\u0000\u0000\u0000\u01a2\u0176\u0001\u0000\u0000\u0000\u01a2\u018a"+
		"\u0001\u0000\u0000\u0000\u01a3\'\u0001\u0000\u0000\u0000\u01a4\u01a5\u0007"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0005?\u0000\u0000\u01a6\u01a7\u0005P\u0000"+
		"\u0000\u01a7\u01a8\u0005\u0011\u0000\u0000\u01a8\u01a9\u0005\t\u0000\u0000"+
		"\u01a9\u01aa\u0005.\u0000\u0000\u01aa)\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0007\u0000\u0000\u0000\u01ac\u01ad\u00053\u0000\u0000\u01ad\u01ae\u0005"+
		"6\u0000\u0000\u01ae\u01bd\u00054\u0000\u0000\u01af\u01b0\u0007\u0000\u0000"+
		"\u0000\u01b0\u01b1\u00053\u0000\u0000\u01b1\u01b2\u0005T\u0000\u0000\u01b2"+
		"\u01b3\u0005\u0016\u0000\u0000\u01b3\u01b4\u00055\u0000\u0000\u01b4\u01b5"+
		"\u00056\u0000\u0000\u01b5\u01bd\u00054\u0000\u0000\u01b6\u01b7\u0007\u0000"+
		"\u0000\u0000\u01b7\u01b8\u00053\u0000\u0000\u01b8\u01b9\u0005P\u0000\u0000"+
		"\u01b9\u01ba\u00055\u0000\u0000\u01ba\u01bb\u00056\u0000\u0000\u01bb\u01bd"+
		"\u00054\u0000\u0000\u01bc\u01ab\u0001\u0000\u0000\u0000\u01bc\u01af\u0001"+
		"\u0000\u0000\u0000\u01bc\u01b6\u0001\u0000\u0000\u0000\u01bd+\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0007\u0000\u0000\u0000\u01bf\u01c0\u00051\u0000"+
		"\u0000\u01c0\u01d5\u0005P\u0000\u0000\u01c1\u01c2\u0007\u0000\u0000\u0000"+
		"\u01c2\u01c3\u00051\u0000\u0000\u01c3\u01c4\u0005T\u0000\u0000\u01c4\u01d5"+
		"\u0005\u0016\u0000\u0000\u01c5\u01c6\u0005T\u0000\u0000\u01c6\u01c7\u0005"+
		"\u0016\u0000\u0000\u01c7\u01c8\u0005&\u0000\u0000\u01c8\u01c9\u00051\u0000"+
		"\u0000\u01c9\u01ca\u00057\u0000\u0000\u01ca\u01cb\u0007\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0005O\u0000\u0000\u01cc\u01d5\u0005P\u0000\u0000\u01cd\u01ce"+
		"\u0005P\u0000\u0000\u01ce\u01cf\u0005%\u0000\u0000\u01cf\u01d0\u00051"+
		"\u0000\u0000\u01d0\u01d1\u00057\u0000\u0000\u01d1\u01d2\u0007\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0005O\u0000\u0000\u01d3\u01d5\u0005P\u0000\u0000\u01d4"+
		"\u01be\u0001\u0000\u0000\u0000\u01d4\u01c1\u0001\u0000\u0000\u0000\u01d4"+
		"\u01c5\u0001\u0000\u0000\u0000\u01d4\u01cd\u0001\u0000\u0000\u0000\u01d5"+
		"-\u0001\u0000\u0000\u0000\u01d6\u01d7\u0007\u0000\u0000\u0000\u01d7\u01d9"+
		"\u00059\u0000\u0000\u01d8\u01da\u0005F\u0000\u0000\u01d9\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0005:\u0000\u0000\u01dc\u01e2\u0005\u0017\u0000"+
		"\u0000\u01dd\u01de\u0007\u0000\u0000\u0000\u01de\u01df\u00059\u0000\u0000"+
		"\u01df\u01e0\u0005T\u0000\u0000\u01e0\u01e2\u0005;\u0000\u0000\u01e1\u01d6"+
		"\u0001\u0000\u0000\u0000\u01e1\u01dd\u0001\u0000\u0000\u0000\u01e2/\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0007\u0000\u0000\u0000\u01e4\u01e5\u0005"+
		"8\u0000\u0000\u01e5\u01e6\u0007\u0000\u0000\u0000\u01e6\u01e7\u0005O\u0000"+
		"\u0000\u01e7\u01e8\u0005P\u0000\u0000\u01e8\u01e9\u0005\u0011\u0000\u0000"+
		"\u01e9\u01ea\u00056\u0000\u0000\u01ea\u01eb\u0005\u001b\u0000\u0000\u01eb"+
		"1\u0001\u0000\u0000\u0000\u01ec\u01ed\u0007\u0000\u0000\u0000\u01ed\u01ee"+
		"\u0005O\u0000\u0000\u01ee\u01ef\u0005P\u0000\u0000\u01ef\u01f0\u0005\'"+
		"\u0000\u0000\u01f0\u01f1\u0005(\u0000\u0000\u01f1\u01f2\u0005\"\u0000"+
		"\u0000\u01f2\u01f3\u0005\t\u0000\u0000\u01f3\u01f4\u0005+\u0000\u0000"+
		"\u01f4\u01f5\u0005-\u0000\u0000\u01f53\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0007\u0000\u0000\u0000\u01f7\u01f8\u0005O\u0000\u0000\u01f8\u01f9\u0005"+
		"P\u0000\u0000\u01f9\u01fa\u0005%\u0000\u0000\u01fa\u01fb\u0005<\u0000"+
		"\u0000\u01fb\u01fc\u0005=\u0000\u0000\u01fc5\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0005F\u0000\u0000\u01fe\u01ff\u0005\u0017\u0000\u0000\u01ff\u0200"+
		"\u0005%\u0000\u0000\u0200\u0201\u0005\u0003\u0000\u0000\u0201\u0202\u0005"+
		"\u0011\u0000\u0000\u0202\u0203\u0007\u0000\u0000\u0000\u0203\u0204\u0005"+
		"O\u0000\u0000\u0204\u020d\u0005\u001b\u0000\u0000\u0205\u0206\u0005P\u0000"+
		"\u0000\u0206\u0207\u0005%\u0000\u0000\u0207\u0208\u0005\u0003\u0000\u0000"+
		"\u0208\u0209\u0005\u0011\u0000\u0000\u0209\u020a\u0007\u0000\u0000\u0000"+
		"\u020a\u020b\u0005O\u0000\u0000\u020b\u020d\u0005\u001b\u0000\u0000\u020c"+
		"\u01fd\u0001\u0000\u0000\u0000\u020c\u0205\u0001\u0000\u0000\u0000\u020d"+
		"7\u0001\u0000\u0000\u0000\u020e\u020f\u0007\u0000\u0000\u0000\u020f\u0210"+
		"\u0005O\u0000\u0000\u0210\u0211\u0005P\u0000\u0000\u0211\u0212\u0005%"+
		"\u0000\u0000\u0212\u0213\u0005>\u0000\u0000\u0213\u0214\u0005$\u0000\u0000"+
		"\u0214\u0215\u0007\u0000\u0000\u0000\u0215\u0216\u0005O\u0000\u0000\u0216"+
		"\u0217\u0005P\u0000\u0000\u0217\u0218\u0005\u0011\u0000\u0000\u0218\u0219"+
		"\u0005)\u0000\u0000\u0219\u021a\u0005\t\u0000\u0000\u021a\u021b\u0005"+
		"+\u0000\u0000\u021b\u021c\u0005\u0002\u0000\u0000\u021c9\u0001\u0000\u0000"+
		"\u0000\u021d\u021e\u0007\u0000\u0000\u0000\u021e\u021f\u0005O\u0000\u0000"+
		"\u021f\u0220\u0005P\u0000\u0000\u0220\u0221\u00059\u0000\u0000\u0221\u0222"+
		"\u0005T\u0000\u0000\u0222\u0223\u00050\u0000\u0000\u0223;\u0001\u0000"+
		"\u0000\u0000\u0224\u0225\u0007\u0000\u0000\u0000\u0225\u0226\u0005\r\u0000"+
		"\u0000\u0226\u0227\u0005F\u0000\u0000\u0227\u0228\u0005\u000b\u0000\u0000"+
		"\u0228\u0229\u0005G\u0000\u0000\u0229\u022a\u0005#\u0000\u0000\u022a\u022b"+
		"\u0005*\u0000\u0000\u022b\u022c\u0005!\u0000\u0000\u022c\u022d\u0007\u0001"+
		"\u0000\u0000\u022d=\u0001\u0000\u0000\u0000\u022e\u022f\u0007\u0000\u0000"+
		"\u0000\u022f\u0230\u0005\u0005\u0000\u0000\u0230\u0231\u0005Q\u0000\u0000"+
		"\u0231?\u0001\u0000\u0000\u0000\u0232\u0233\u0007\u0000\u0000\u0000\u0233"+
		"\u0234\u0005O\u0000\u0000\u0234\u0235\u0005P\u0000\u0000\u0235\u0236\u0005"+
		"\'\u0000\u0000\u0236\u0237\u0005(\u0000\u0000\u0237\u0238\u0005S\u0000"+
		"\u0000\u0238A\u0001\u0000\u0000\u0000\u0239\u023a\u0005P\u0000\u0000\u023a"+
		"\u023b\u0005%\u0000\u0000\u023b\u023c\u0005,\u0000\u0000\u023cC\u0001"+
		"\u0000\u0000\u0000\u023d\u023e\u0007\u0000\u0000\u0000\u023e\u023f\u0005"+
		"@\u0000\u0000\u023f\u0240\u00056\u0000\u0000\u0240\u0241\u0005\u0001\u0000"+
		"\u0000\u0241E\u0001\u0000\u0000\u0000\u0242\u0243\u0005D\u0000\u0000\u0243"+
		"\u0244\u0005;\u0000\u0000\u0244\u0245\u0005E\u0000\u0000\u0245\u0246\u0005"+
		"V\u0000\u0000\u0246\u0247\u0007\u0000\u0000\u0000\u0247\u0248\u0005C\u0000"+
		"\u0000\u0248\u025a\u0005V\u0000\u0000\u0249\u024a\u0005A\u0000\u0000\u024a"+
		"\u024b\u0005B\u0000\u0000\u024b\u024c\u0005V\u0000\u0000\u024c\u024d\u0007"+
		"\u0000\u0000\u0000\u024d\u024e\u0005C\u0000\u0000\u024e\u025a\u0005V\u0000"+
		"\u0000\u024f\u0250\u0005A\u0000\u0000\u0250\u0251\u00059\u0000\u0000\u0251"+
		"\u0252\u0005D\u0000\u0000\u0252\u0253\u0005 \u0000\u0000\u0253\u0254\u0005"+
		"6\u0000\u0000\u0254\u0255\u0005;\u0000\u0000\u0255\u0256\u0005V\u0000"+
		"\u0000\u0256\u0257\u0007\u0000\u0000\u0000\u0257\u0258\u0005C\u0000\u0000"+
		"\u0258\u025a\u0005V\u0000\u0000\u0259\u0242\u0001\u0000\u0000\u0000\u0259"+
		"\u0249\u0001\u0000\u0000\u0000\u0259\u024f\u0001\u0000\u0000\u0000\u025a"+
		"G\u0001\u0000\u0000\u0000\u025b\u025c\u0005\\\u0000\u0000\u025c\u0261"+
		"\u0005P\u0000\u0000\u025d\u025e\u0005W\u0000\u0000\u025e\u0260\u0005P"+
		"\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u0260\u0263\u0001\u0000"+
		"\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000"+
		"\u0000\u0000\u0262\u0264\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u0005^\u0000\u0000\u0265I\u0001\u0000\u0000\u0000"+
		"!OV`h\u0090\u0099\u00a3\u00af\u00b7\u00b9\u00bf\u00c5\u00dc\u00fa\u0106"+
		"\u0108\u0116\u0124\u0132\u0154\u0157\u0171\u017d\u0191\u019d\u01a2\u01bc"+
		"\u01d4\u01d9\u01e1\u020c\u0259\u0261";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}