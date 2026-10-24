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
		RULE_player = 0, RULE_log = 1, RULE_setup = 2, RULE_setupAction = 3, RULE_coinChoice = 4, 
		RULE_coinToss = 5, RULE_firstPlayer = 6, RULE_mulligan = 7, RULE_mulliganCards = 8, 
		RULE_openingHand = 9, RULE_drawnCards = 10, RULE_initialPokemon = 11, 
		RULE_turn = 12, RULE_mainTurnAction = 13, RULE_subTurnAction = 14, RULE_turnActionBody = 15, 
		RULE_drawAction = 16, RULE_playAction = 17, RULE_attachAction = 18, RULE_evolveAction = 19, 
		RULE_attackAction = 20, RULE_damageBreakdown = 21, RULE_damageBreakdownLine = 22, 
		RULE_retreatAction = 23, RULE_shuffleAction = 24, RULE_discardAction = 25, 
		RULE_prizeAction = 26, RULE_moveToHandAction = 27, RULE_activeSpotAction = 28, 
		RULE_knockoutAction = 29, RULE_cardMovedAction = 30, RULE_switchAction = 31, 
		RULE_damagedAction = 32, RULE_flippedAction = 33, RULE_choiceAction = 34, 
		RULE_specialConditionAction = 35, RULE_activateAction = 36, RULE_putAction = 37, 
		RULE_endTurn = 38, RULE_gameEnd = 39, RULE_cardList = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"player", "log", "setup", "setupAction", "coinChoice", "coinToss", "firstPlayer", 
			"mulligan", "mulliganCards", "openingHand", "drawnCards", "initialPokemon", 
			"turn", "mainTurnAction", "subTurnAction", "turnActionBody", "drawAction", 
			"playAction", "attachAction", "evolveAction", "attackAction", "damageBreakdown", 
			"damageBreakdownLine", "retreatAction", "shuffleAction", "discardAction", 
			"prizeAction", "moveToHandAction", "activeSpotAction", "knockoutAction", 
			"cardMovedAction", "switchAction", "damagedAction", "flippedAction", 
			"choiceAction", "specialConditionAction", "activateAction", "putAction", 
			"endTurn", "gameEnd", "cardList"
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
			setState(82);
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
		enterRule(_localctx, 2, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			setup();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(85);
				match(NEWLINE);
				setState(86);
				turn();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			gameEnd();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(93);
				match(NEWLINE);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
		enterRule(_localctx, 4, RULE_setup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(SETUP);
			setState(102);
			match(NEWLINE);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					setupAction();
					}
					} 
				}
				setState(108);
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
		enterRule(_localctx, 6, RULE_setupAction);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				coinChoice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				coinToss();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				firstPlayer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				openingHand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				initialPokemon();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
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
		enterRule(_localctx, 8, RULE_coinChoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			player();
			setState(118);
			match(CHOSE);
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			match(FOR);
			setState(121);
			match(THE);
			setState(122);
			match(OPENING);
			setState(123);
			match(COIN);
			setState(124);
			match(FLIP);
			setState(125);
			match(DOT);
			setState(126);
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
		enterRule(_localctx, 10, RULE_coinToss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			player();
			setState(129);
			match(WON);
			setState(130);
			match(THE);
			setState(131);
			match(COIN);
			setState(132);
			match(TOSS);
			setState(133);
			match(DOT);
			setState(134);
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
		enterRule(_localctx, 12, RULE_firstPlayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			player();
			setState(137);
			match(DECIDED);
			setState(138);
			match(TO);
			setState(139);
			match(GO);
			setState(140);
			match(FIRST);
			setState(141);
			match(DOT);
			setState(142);
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
		enterRule(_localctx, 14, RULE_mulligan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(144);
				player();
				setState(145);
				match(TAKE);
				setState(146);
				match(A_SOMETHING);
				setState(147);
				match(MULLIGAN);
				setState(148);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(150);
				player();
				setState(151);
				match(TAKE);
				setState(152);
				match(NUMBER);
				setState(153);
				match(MULLIGAN);
				setState(154);
				match(DOT);
				}
				break;
			}
			setState(158);
			match(NEWLINE);
			setState(159);
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
		enterRule(_localctx, 16, RULE_mulliganCards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(HYPHEN);
			setState(162);
			match(CARDS);
			setState(163);
			match(REVEALED);
			setState(164);
			match(FROM);
			setState(165);
			match(MULLIGAN);
			setState(166);
			match(NUMBER);
			setState(167);
			match(NEWLINE);
			setState(168);
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
		enterRule(_localctx, 18, RULE_openingHand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(170);
				player();
				setState(171);
				match(DREW);
				setState(172);
				match(NUMBER);
				setState(173);
				match(CARDS);
				setState(174);
				match(FOR);
				setState(175);
				match(THE);
				setState(176);
				match(OPENING);
				setState(177);
				match(HAND);
				setState(178);
				match(DOT);
				setState(179);
				match(NEWLINE);
				}
				break;
			case 2:
				{
				setState(181);
				player();
				setState(182);
				match(DREW);
				setState(183);
				match(NUMBER);
				setState(184);
				match(MORE_WORD);
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==CARDS || _la==CARD_WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				match(BECAUSE);
				setState(187);
				player();
				setState(188);
				match(TAKE);
				setState(189);
				match(AT);
				setState(190);
				match(LEAST);
				setState(191);
				match(NUMBER);
				setState(192);
				match(MULLIGAN);
				setState(193);
				match(DOT);
				setState(194);
				match(NEWLINE);
				}
				break;
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HYPHEN) {
				{
				setState(198);
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
		enterRule(_localctx, 20, RULE_drawnCards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(201);
				match(HYPHEN);
				setState(202);
				match(NUMBER);
				setState(203);
				match(DRAWN);
				setState(204);
				match(CARDS);
				setState(205);
				match(DOT);
				setState(206);
				match(NEWLINE);
				}
				break;
			case 2:
				{
				setState(207);
				match(HYPHEN);
				setState(208);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(209);
				match(DREW);
				setState(210);
				match(NUMBER);
				setState(211);
				match(CARDS);
				setState(212);
				match(DOT);
				setState(213);
				match(NEWLINE);
				}
				break;
			case 3:
				{
				setState(214);
				match(HYPHEN);
				setState(215);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(216);
				match(DREW);
				setState(217);
				match(CARD);
				setState(218);
				match(DOT);
				setState(219);
				match(NEWLINE);
				}
				break;
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(222);
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
		enterRule(_localctx, 22, RULE_initialPokemon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			player();
			setState(226);
			match(PLAYED);
			setState(227);
			match(CARD);
			setState(228);
			match(TO);
			setState(229);
			match(THE);
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIVE:
				{
				setState(230);
				match(ACTIVE);
				setState(231);
				match(SPOT);
				}
				break;
			case BENCH:
				{
				setState(232);
				match(BENCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(235);
			match(DOT);
			setState(236);
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
		enterRule(_localctx, 24, RULE_turn);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			player();
			setState(239);
			match(POSSESSIVE);
			setState(240);
			match(TURN);
			setState(241);
			match(NEWLINE);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					mainTurnAction();
					}
					} 
				}
				setState(247);
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
		enterRule(_localctx, 26, RULE_mainTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			turnActionBody();
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==EXCLAMATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(250);
			match(NEWLINE);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYPHEN) {
				{
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(251);
					subTurnAction();
					}
					break;
				case 2:
					{
					setState(252);
					damageBreakdown();
					}
					break;
				}
				}
				setState(257);
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
		enterRule(_localctx, 28, RULE_subTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(HYPHEN);
			setState(259);
			turnActionBody();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(260);
				match(DOT);
				}
			}

			setState(263);
			match(NEWLINE);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BULLET) {
				{
				{
				setState(264);
				cardList();
				}
				}
				setState(269);
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
		enterRule(_localctx, 30, RULE_turnActionBody);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				drawAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				playAction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				attachAction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				evolveAction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				attackAction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				retreatAction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				shuffleAction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
				cardMovedAction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(278);
				discardAction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(279);
				prizeAction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(280);
				moveToHandAction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(281);
				activeSpotAction();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(282);
				switchAction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(283);
				knockoutAction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(284);
				damagedAction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(285);
				flippedAction();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(286);
				choiceAction();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(287);
				specialConditionAction();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(288);
				activateAction();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(289);
				putAction();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(290);
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
		enterRule(_localctx, 32, RULE_drawAction);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				player();
				setState(294);
				match(DREW);
				setState(295);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				player();
				setState(298);
				match(DREW);
				setState(299);
				match(A_SOMETHING);
				setState(300);
				match(CARD_WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				player();
				setState(303);
				match(DREW);
				setState(304);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				player();
				setState(307);
				match(DREW);
				setState(308);
				match(NUMBER);
				setState(309);
				match(CARD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				player();
				setState(312);
				match(DREW);
				setState(313);
				match(NUMBER);
				setState(314);
				match(CARDS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				player();
				setState(317);
				match(DREW);
				setState(318);
				match(NUMBER);
				setState(319);
				match(CARDS);
				setState(320);
				match(AND);
				setState(321);
				match(PLAYED);
				setState(322);
				match(THEM);
				setState(323);
				match(TO);
				setState(324);
				match(THE);
				setState(325);
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
		enterRule(_localctx, 34, RULE_playAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			player();
			setState(330);
			match(PLAYED);
			setState(331);
			match(CARD);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(332);
				match(TO);
				setState(333);
				match(THE);
				setState(339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(334);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(335);
					match(ACTIVE);
					setState(336);
					match(SPOT);
					}
					break;
				case STADIUM:
					{
					setState(337);
					match(STADIUM);
					setState(338);
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
		enterRule(_localctx, 36, RULE_attachAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			player();
			setState(344);
			match(ATTACHED);
			setState(345);
			match(CARD);
			setState(346);
			match(TO);
			setState(347);
			match(CARD);
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(348);
				match(ON);
				setState(349);
				match(THE);
				setState(350);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(351);
				match(IN);
				setState(352);
				match(THE);
				setState(353);
				match(ACTIVE);
				setState(354);
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
		enterRule(_localctx, 38, RULE_evolveAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			player();
			setState(358);
			match(EVOLVED);
			setState(359);
			match(CARD);
			setState(360);
			match(TO);
			setState(361);
			match(CARD);
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(362);
				match(ON);
				setState(363);
				match(THE);
				setState(364);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(365);
				match(IN);
				setState(366);
				match(THE);
				setState(367);
				match(ACTIVE);
				setState(368);
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
		public List<TerminalNode> NUMBER() { return getTokens(gTCGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gTCGParser.NUMBER, i);
		}
		public List<TerminalNode> DAMAGE() { return getTokens(gTCGParser.DAMAGE); }
		public TerminalNode DAMAGE(int i) {
			return getToken(gTCGParser.DAMAGE, i);
		}
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
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
		enterRule(_localctx, 40, RULE_attackAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			player();
			setState(372);
			match(POSSESSIVE);
			setState(373);
			match(CARD);
			setState(374);
			match(USED);
			setState(375);
			match(ATTACK);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(376);
				match(ON);
				setState(377);
				player();
				setState(378);
				match(POSSESSIVE);
				setState(379);
				match(CARD);
				setState(380);
				match(FOR);
				setState(381);
				match(NUMBER);
				setState(382);
				match(DAMAGE);
				}
			}

			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(386);
				match(DOT);
				setState(387);
				player();
				setState(388);
				match(POSSESSIVE);
				setState(389);
				match(CARD);
				setState(390);
				match(TAKE);
				setState(391);
				match(NUMBER);
				setState(392);
				match(MORE_WORD);
				setState(393);
				match(DAMAGE);
				setState(394);
				match(BECAUSE);
				setState(395);
				match(OF);
				setState(396);
				match(POKEMON_TYPE);
				setState(397);
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
		enterRule(_localctx, 42, RULE_damageBreakdown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(HYPHEN);
			setState(402);
			match(DAMAGE_BREAKDOWN);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(403);
				match(COLON);
				}
			}

			setState(406);
			match(NEWLINE);
			setState(408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(407);
				damageBreakdownLine();
				}
				}
				setState(410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BULLET );
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(412);
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
		public List<TerminalNode> NUMBER() { return getTokens(gTCGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gTCGParser.NUMBER, i);
		}
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public TerminalNode TOTAL_DAMAGE() { return getToken(gTCGParser.TOTAL_DAMAGE, 0); }
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
		enterRule(_localctx, 44, RULE_damageBreakdownLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(BULLET);
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(416);
				match(BASE_DAMAGE);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(417);
					match(COLON);
					}
				}

				setState(420);
				match(NUMBER);
				setState(421);
				match(DAMAGE);
				}
				break;
			case 2:
				{
				setState(422);
				match(TOTAL_DAMAGE);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(423);
					match(COLON);
					}
				}

				setState(426);
				match(NUMBER);
				setState(427);
				match(DAMAGE);
				}
				break;
			case 3:
				{
				setState(428);
				match(NUMBER);
				setState(429);
				match(POKEMON);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(430);
					match(COLON);
					}
				}

				setState(433);
				match(NUMBER);
				setState(434);
				match(DAMAGE);
				}
				break;
			case 4:
				{
				setState(435);
				match(LPAREN);
				setState(436);
				match(ITEM);
				setState(437);
				match(RPAREN);
				setState(438);
				match(CARD);
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
				match(NUMBER);
				setState(443);
				match(DAMAGE);
				}
				break;
			case 5:
				{
				setState(444);
				match(NUMBER);
				setState(445);
				_la = _input.LA(1);
				if ( !(_la==ATTACHED || _la==SELECTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(446);
				match(ENERGY);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(447);
					match(COLON);
					}
				}

				setState(450);
				match(NUMBER);
				setState(451);
				match(DAMAGE);
				}
				break;
			case 6:
				{
				setState(452);
				match(WEAKNESS);
				setState(453);
				match(TO);
				setState(454);
				match(POKEMON_TYPE);
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
				match(NUMBER);
				setState(459);
				match(DAMAGE);
				}
				break;
			case 7:
				{
				setState(460);
				match(LPAREN);
				setState(461);
				match(ABILITY_WORD);
				setState(462);
				match(RPAREN);
				setState(463);
				match(ABILITY);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(464);
					match(COLON);
					}
				}

				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(467);
					match(HYPHEN);
					}
				}

				setState(470);
				match(NUMBER);
				setState(471);
				match(DAMAGE);
				}
				break;
			case 8:
				{
				setState(472);
				match(LPAREN);
				setState(473);
				match(SUPPORTER_WORD);
				setState(474);
				match(RPAREN);
				setState(475);
				match(CARD);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(476);
					match(COLON);
					}
				}

				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(479);
					match(HYPHEN);
					}
				}

				setState(482);
				match(NUMBER);
				setState(483);
				match(DAMAGE);
				}
				break;
			case 9:
				{
				setState(484);
				match(LPAREN);
				setState(485);
				match(ABILITY_WORD);
				setState(486);
				match(RPAREN);
				setState(487);
				match(ABILITY);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(488);
					match(COLON);
					}
				}

				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(491);
					match(HYPHEN);
					}
				}

				setState(494);
				match(NUMBER);
				setState(495);
				match(DAMAGE);
				}
				break;
			case 10:
				{
				setState(496);
				match(LPAREN);
				setState(497);
				match(POKEMON_TOOL);
				setState(498);
				match(RPAREN);
				setState(499);
				match(CARD);
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
				match(NUMBER);
				setState(507);
				match(DAMAGE);
				}
				break;
			case 11:
				{
				setState(508);
				match(LPAREN);
				setState(509);
				match(ATTACK_WORD);
				setState(510);
				match(RPAREN);
				setState(511);
				match(ATTACK);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(512);
					match(COLON);
					}
				}

				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(515);
					match(HYPHEN);
					}
				}

				setState(518);
				match(NUMBER);
				setState(519);
				match(DAMAGE);
				}
				break;
			}
			setState(522);
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
		enterRule(_localctx, 46, RULE_retreatAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			player();
			setState(525);
			match(RETIRED);
			setState(526);
			match(CARD);
			setState(527);
			match(TO);
			setState(528);
			match(THE);
			setState(529);
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
		enterRule(_localctx, 48, RULE_shuffleAction);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				player();
				setState(532);
				match(SHUFFLED);
				setState(533);
				match(THEIR);
				setState(534);
				match(DECK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				player();
				setState(537);
				match(SHUFFLED);
				setState(538);
				match(NUMBER);
				setState(539);
				match(CARDS);
				setState(540);
				match(INTO);
				setState(541);
				match(THEIR);
				setState(542);
				match(DECK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				player();
				setState(545);
				match(SHUFFLED);
				setState(546);
				match(CARD);
				setState(547);
				match(INTO);
				setState(548);
				match(THEIR);
				setState(549);
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
		enterRule(_localctx, 50, RULE_discardAction);
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				player();
				setState(554);
				match(DISCARDED);
				setState(555);
				match(CARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				player();
				setState(558);
				match(DISCARDED);
				setState(559);
				match(NUMBER);
				setState(560);
				match(CARDS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				match(NUMBER);
				setState(563);
				match(CARDS);
				setState(564);
				match(WERE);
				setState(565);
				match(DISCARDED);
				setState(566);
				match(FROM);
				setState(567);
				player();
				setState(568);
				match(POSSESSIVE);
				setState(569);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(571);
				match(CARD);
				setState(572);
				match(WAS);
				setState(573);
				match(DISCARDED);
				setState(574);
				match(FROM);
				setState(575);
				player();
				setState(576);
				match(POSSESSIVE);
				setState(577);
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
		enterRule(_localctx, 52, RULE_prizeAction);
		int _la;
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				player();
				setState(582);
				match(TAKE);
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==A_SOMETHING) {
					{
					setState(583);
					match(A_SOMETHING);
					}
				}

				setState(586);
				match(PRIZE);
				setState(587);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				player();
				setState(590);
				match(TAKE);
				setState(591);
				match(NUMBER);
				setState(592);
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
		enterRule(_localctx, 54, RULE_moveToHandAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			player();
			setState(597);
			match(MOVED);
			setState(598);
			player();
			setState(599);
			match(POSSESSIVE);
			setState(600);
			match(CARD);
			setState(601);
			match(TO);
			setState(602);
			match(THEIR);
			setState(603);
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
		enterRule(_localctx, 56, RULE_activeSpotAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			player();
			setState(606);
			match(POSSESSIVE);
			setState(607);
			match(CARD);
			setState(608);
			match(IS);
			setState(609);
			match(NOW);
			setState(610);
			match(IN);
			setState(611);
			match(THE);
			setState(612);
			match(ACTIVE);
			setState(613);
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
		enterRule(_localctx, 58, RULE_knockoutAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			player();
			setState(616);
			match(POSSESSIVE);
			setState(617);
			match(CARD);
			setState(618);
			match(WAS);
			setState(619);
			match(KNOCKED);
			setState(620);
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
		enterRule(_localctx, 60, RULE_cardMovedAction);
		try {
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_SOMETHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(A_SOMETHING);
				setState(623);
				match(CARD_WORD);
				setState(624);
				match(WAS);
				setState(625);
				match(ADDED);
				setState(626);
				match(TO);
				setState(627);
				player();
				setState(628);
				match(POSSESSIVE);
				setState(629);
				match(HAND);
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(CARD);
				setState(632);
				match(WAS);
				setState(633);
				match(ADDED);
				setState(634);
				match(TO);
				setState(635);
				player();
				setState(636);
				match(POSSESSIVE);
				setState(637);
				match(HAND);
				}
				break;
			case OPPONENT:
			case PLAYER:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				player();
				setState(640);
				match(MOVED);
				setState(641);
				player();
				setState(642);
				match(POSSESSIVE);
				setState(643);
				match(NUMBER);
				setState(644);
				match(CARDS);
				setState(645);
				match(TO);
				setState(646);
				match(THEIR);
				setState(647);
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
		enterRule(_localctx, 62, RULE_switchAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			player();
			setState(652);
			match(POSSESSIVE);
			setState(653);
			match(CARD);
			setState(654);
			match(WAS);
			setState(655);
			match(SWITCHED);
			setState(656);
			match(WITH);
			setState(657);
			player();
			setState(658);
			match(POSSESSIVE);
			setState(659);
			match(CARD);
			setState(660);
			match(TO);
			setState(661);
			match(BECOME);
			setState(662);
			match(THE);
			setState(663);
			match(ACTIVE);
			setState(664);
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
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public DamagedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damagedAction; }
	}

	public final DamagedActionContext damagedAction() throws RecognitionException {
		DamagedActionContext _localctx = new DamagedActionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_damagedAction);
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
			match(TAKE);
			setState(670);
			match(NUMBER);
			setState(671);
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
		enterRule(_localctx, 66, RULE_flippedAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			player();
			setState(674);
			match(FLIPPED);
			setState(675);
			match(A_SOMETHING);
			setState(676);
			match(COIN);
			setState(677);
			match(AND);
			setState(678);
			match(IT);
			setState(679);
			match(LANDED);
			setState(680);
			match(ON);
			setState(681);
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
		enterRule(_localctx, 68, RULE_choiceAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			player();
			setState(684);
			match(CHOSE);
			setState(685);
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
		enterRule(_localctx, 70, RULE_specialConditionAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			player();
			setState(688);
			match(POSSESSIVE);
			setState(689);
			match(CARD);
			setState(690);
			match(IS);
			setState(691);
			match(NOW);
			setState(692);
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
		enterRule(_localctx, 72, RULE_activateAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(CARD);
			setState(695);
			match(WAS);
			setState(696);
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
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
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
		enterRule(_localctx, 74, RULE_putAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			player();
			setState(699);
			match(PUT);
			setState(700);
			match(NUMBER);
			setState(701);
			match(DAMAGE);
			setState(702);
			match(COUNTERS);
			setState(703);
			match(ON);
			setState(704);
			player();
			setState(705);
			match(POSSESSIVE);
			setState(706);
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
		enterRule(_localctx, 76, RULE_endTurn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			player();
			setState(709);
			match(ENDED);
			setState(710);
			match(THEIR);
			setState(711);
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
		enterRule(_localctx, 78, RULE_gameEnd);
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(ALL);
				setState(714);
				match(PRIZE_CARDS);
				setState(715);
				match(TAKEN);
				setState(716);
				match(DOT);
				setState(717);
				player();
				setState(718);
				match(WINS);
				setState(719);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(OPPONENT);
				setState(722);
				match(CONCEDED);
				setState(723);
				match(DOT);
				setState(724);
				player();
				setState(725);
				match(WINS);
				setState(726);
				match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
				match(OPPONENT);
				setState(729);
				match(TAKE);
				setState(730);
				match(ALL);
				setState(731);
				match(OF);
				setState(732);
				match(THEIR);
				setState(733);
				match(PRIZE_CARDS);
				setState(734);
				match(DOT);
				setState(735);
				player();
				setState(736);
				match(WINS);
				setState(737);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(739);
				match(YOU);
				setState(740);
				match(CONCEDED);
				setState(741);
				match(DOT);
				setState(742);
				player();
				setState(743);
				match(WINS);
				setState(744);
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
		enterRule(_localctx, 80, RULE_cardList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(BULLET);
			setState(749);
			match(CARD);
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(750);
				match(COMMA);
				setState(751);
				match(CARD);
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(757);
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
		"\u0004\u0001k\u02f8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001X\b\u0001\n\u0001\f\u0001[\t\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001_\b\u0001\n\u0001\f\u0001b\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002i\b\u0002\n\u0002\f\u0002l\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003t\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u009d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c5\b\t\u0001"+
		"\t\u0003\t\u00c8\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00dd\b\n\u0001\n\u0003\n\u00e0\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00ea\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f4\b\f"+
		"\n\f\f\f\u00f7\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00fe"+
		"\b\r\n\r\f\r\u0101\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0106\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u010a\b\u000e\n\u000e"+
		"\f\u000e\u010d\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0124\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0148\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0154\b\u0011\u0003\u0011\u0156\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0164\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0172\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0181\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0190\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0195"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0199\b\u0015\u000b\u0015"+
		"\f\u0015\u019a\u0001\u0015\u0003\u0015\u019e\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u01a3\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u01a9\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01b0\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01b9\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u01c1\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01c9\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u01d2\b\u0016\u0001\u0016\u0003\u0016\u01d5\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01de\b\u0016\u0001\u0016\u0003\u0016\u01e1\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u01ea\b\u0016\u0001\u0016\u0003\u0016\u01ed"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u01f6\b\u0016\u0001\u0016\u0003\u0016\u01f9"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0202\b\u0016\u0001\u0016\u0003\u0016\u0205"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0209\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0228\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0244\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0249\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0253\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u028a\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u02eb\b\'\u0001(\u0001(\u0001(\u0001(\u0005(\u02f1"+
		"\b(\n(\f(\u02f4\t(\u0001(\u0001(\u0001(\u0000\u0000)\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNP\u0000\u0005\u0002\u0000HHaa\u0001\u0000\f\r\u0001"+
		"\u0000\u001c\u001d\u0002\u0000bbee\u0002\u0000$$QQ\u032c\u0000R\u0001"+
		"\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000\u0004e\u0001\u0000\u0000"+
		"\u0000\u0006s\u0001\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000\n\u0080"+
		"\u0001\u0000\u0000\u0000\f\u0088\u0001\u0000\u0000\u0000\u000e\u009c\u0001"+
		"\u0000\u0000\u0000\u0010\u00a1\u0001\u0000\u0000\u0000\u0012\u00c4\u0001"+
		"\u0000\u0000\u0000\u0014\u00dc\u0001\u0000\u0000\u0000\u0016\u00e1\u0001"+
		"\u0000\u0000\u0000\u0018\u00ee\u0001\u0000\u0000\u0000\u001a\u00f8\u0001"+
		"\u0000\u0000\u0000\u001c\u0102\u0001\u0000\u0000\u0000\u001e\u0123\u0001"+
		"\u0000\u0000\u0000 \u0147\u0001\u0000\u0000\u0000\"\u0149\u0001\u0000"+
		"\u0000\u0000$\u0157\u0001\u0000\u0000\u0000&\u0165\u0001\u0000\u0000\u0000"+
		"(\u0173\u0001\u0000\u0000\u0000*\u0191\u0001\u0000\u0000\u0000,\u019f"+
		"\u0001\u0000\u0000\u0000.\u020c\u0001\u0000\u0000\u00000\u0227\u0001\u0000"+
		"\u0000\u00002\u0243\u0001\u0000\u0000\u00004\u0252\u0001\u0000\u0000\u0000"+
		"6\u0254\u0001\u0000\u0000\u00008\u025d\u0001\u0000\u0000\u0000:\u0267"+
		"\u0001\u0000\u0000\u0000<\u0289\u0001\u0000\u0000\u0000>\u028b\u0001\u0000"+
		"\u0000\u0000@\u029a\u0001\u0000\u0000\u0000B\u02a1\u0001\u0000\u0000\u0000"+
		"D\u02ab\u0001\u0000\u0000\u0000F\u02af\u0001\u0000\u0000\u0000H\u02b6"+
		"\u0001\u0000\u0000\u0000J\u02ba\u0001\u0000\u0000\u0000L\u02c4\u0001\u0000"+
		"\u0000\u0000N\u02ea\u0001\u0000\u0000\u0000P\u02ec\u0001\u0000\u0000\u0000"+
		"RS\u0007\u0000\u0000\u0000S\u0001\u0001\u0000\u0000\u0000TY\u0003\u0004"+
		"\u0002\u0000UV\u0005j\u0000\u0000VX\u0003\u0018\f\u0000WU\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\`\u0003N\'\u0000]_\u0005j\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005\u0000\u0000"+
		"\u0001d\u0003\u0001\u0000\u0000\u0000ef\u0005\n\u0000\u0000fj\u0005j\u0000"+
		"\u0000gi\u0003\u0006\u0003\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u0005"+
		"\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mt\u0003\b\u0004\u0000"+
		"nt\u0003\n\u0005\u0000ot\u0003\f\u0006\u0000pt\u0003\u0012\t\u0000qt\u0003"+
		"\u0016\u000b\u0000rt\u0003\u000e\u0007\u0000sm\u0001\u0000\u0000\u0000"+
		"sn\u0001\u0000\u0000\u0000so\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u0007\u0001"+
		"\u0000\u0000\u0000uv\u0003\u0000\u0000\u0000vw\u0005\u000b\u0000\u0000"+
		"wx\u0007\u0001\u0000\u0000xy\u0005\u000e\u0000\u0000yz\u0005\u000f\u0000"+
		"\u0000z{\u0005\u0010\u0000\u0000{|\u0005\u0011\u0000\u0000|}\u0005\u0012"+
		"\u0000\u0000}~\u0005b\u0000\u0000~\u007f\u0005j\u0000\u0000\u007f\t\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0003\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\u0014\u0000\u0000\u0082\u0083\u0005\u000f\u0000\u0000\u0083\u0084\u0005"+
		"\u0011\u0000\u0000\u0084\u0085\u0005\u0015\u0000\u0000\u0085\u0086\u0005"+
		"b\u0000\u0000\u0086\u0087\u0005j\u0000\u0000\u0087\u000b\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0003\u0000\u0000\u0000\u0089\u008a\u0005\u0016\u0000"+
		"\u0000\u008a\u008b\u0005\u0017\u0000\u0000\u008b\u008c\u0005\u0018\u0000"+
		"\u0000\u008c\u008d\u0005\u0019\u0000\u0000\u008d\u008e\u0005b\u0000\u0000"+
		"\u008e\u008f\u0005j\u0000\u0000\u008f\r\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0003\u0000\u0000\u0000\u0091\u0092\u0005@\u0000\u0000\u0092\u0093"+
		"\u0005M\u0000\u0000\u0093\u0094\u0005\u0001\u0000\u0000\u0094\u0095\u0005"+
		"b\u0000\u0000\u0095\u009d\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0000"+
		"\u0000\u0000\u0097\u0098\u0005@\u0000\u0000\u0098\u0099\u0005`\u0000\u0000"+
		"\u0099\u009a\u0005\u0001\u0000\u0000\u009a\u009b\u0005b\u0000\u0000\u009b"+
		"\u009d\u0001\u0000\u0000\u0000\u009c\u0090\u0001\u0000\u0000\u0000\u009c"+
		"\u0096\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005j\u0000\u0000\u009f\u00a0\u0003\u0010\b\u0000\u00a0\u000f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005i\u0000\u0000\u00a2\u00a3\u0005"+
		"\u001c\u0000\u0000\u00a3\u00a4\u0005\u0005\u0000\u0000\u00a4\u00a5\u0005"+
		">\u0000\u0000\u00a5\u00a6\u0005\u0001\u0000\u0000\u00a6\u00a7\u0005`\u0000"+
		"\u0000\u00a7\u00a8\u0005j\u0000\u0000\u00a8\u00a9\u0003P(\u0000\u00a9"+
		"\u0011\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u001a\u0000\u0000\u00ac\u00ad\u0005`\u0000\u0000\u00ad\u00ae"+
		"\u0005\u001c\u0000\u0000\u00ae\u00af\u0005\u000e\u0000\u0000\u00af\u00b0"+
		"\u0005\u000f\u0000\u0000\u00b0\u00b1\u0005\u0010\u0000\u0000\u00b1\u00b2"+
		"\u0005\"\u0000\u0000\u00b2\u00b3\u0005b\u0000\u0000\u00b3\u00b4\u0005"+
		"j\u0000\u0000\u00b4\u00c5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\u001a\u0000\u0000\u00b7\u00b8\u0005`\u0000"+
		"\u0000\u00b8\u00b9\u0005S\u0000\u0000\u00b9\u00ba\u0007\u0002\u0000\u0000"+
		"\u00ba\u00bb\u0005T\u0000\u0000\u00bb\u00bc\u0003\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005@\u0000\u0000\u00bd\u00be\u0005\u0006\u0000\u0000\u00be\u00bf"+
		"\u0005\u0007\u0000\u0000\u00bf\u00c0\u0005`\u0000\u0000\u00c0\u00c1\u0005"+
		"\u0001\u0000\u0000\u00c1\u00c2\u0005b\u0000\u0000\u00c2\u00c3\u0005j\u0000"+
		"\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00aa\u0001\u0000\u0000"+
		"\u0000\u00c4\u00b5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c8\u0003\u0014\n\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u0013\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005i\u0000\u0000\u00ca\u00cb\u0005`\u0000\u0000\u00cb\u00cc"+
		"\u0005\u001b\u0000\u0000\u00cc\u00cd\u0005\u001c\u0000\u0000\u00cd\u00ce"+
		"\u0005b\u0000\u0000\u00ce\u00dd\u0005j\u0000\u0000\u00cf\u00d0\u0005i"+
		"\u0000\u0000\u00d0\u00d1\u0007\u0000\u0000\u0000\u00d1\u00d2\u0005\u001a"+
		"\u0000\u0000\u00d2\u00d3\u0005`\u0000\u0000\u00d3\u00d4\u0005\u001c\u0000"+
		"\u0000\u00d4\u00d5\u0005b\u0000\u0000\u00d5\u00dd\u0005j\u0000\u0000\u00d6"+
		"\u00d7\u0005i\u0000\u0000\u00d7\u00d8\u0007\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005\u001a\u0000\u0000\u00d9\u00da\u0005[\u0000\u0000\u00da\u00db\u0005"+
		"b\u0000\u0000\u00db\u00dd\u0005j\u0000\u0000\u00dc\u00c9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00cf\u0001\u0000\u0000\u0000\u00dc\u00d6\u0001\u0000\u0000"+
		"\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00e0\u0003P(\u0000\u00df"+
		"\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u0015\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0005#\u0000\u0000\u00e3\u00e4\u0005[\u0000\u0000\u00e4\u00e5\u0005"+
		"\u0017\u0000\u0000\u00e5\u00e9\u0005\u000f\u0000\u0000\u00e6\u00e7\u0005"+
		"2\u0000\u0000\u00e7\u00ea\u00054\u0000\u0000\u00e8\u00ea\u00055\u0000"+
		"\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005b\u0000\u0000"+
		"\u00ec\u00ed\u0005j\u0000\u0000\u00ed\u0017\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0003\u0000\u0000\u0000\u00ef\u00f0\u0005Z\u0000\u0000\u00f0\u00f1"+
		"\u0005\u0002\u0000\u0000\u00f1\u00f5\u0005j\u0000\u0000\u00f2\u00f4\u0003"+
		"\u001a\r\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u0019\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0003\u001e\u000f\u0000\u00f9\u00fa\u0007\u0003"+
		"\u0000\u0000\u00fa\u00ff\u0005j\u0000\u0000\u00fb\u00fe\u0003\u001c\u000e"+
		"\u0000\u00fc\u00fe\u0003*\u0015\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100\u001b\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0005i\u0000\u0000\u0103\u0105\u0003\u001e\u000f\u0000\u0104"+
		"\u0106\u0005b\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010b"+
		"\u0005j\u0000\u0000\u0108\u010a\u0003P(\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u001d\u0001\u0000"+
		"\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0124\u0003 \u0010"+
		"\u0000\u010f\u0124\u0003\"\u0011\u0000\u0110\u0124\u0003$\u0012\u0000"+
		"\u0111\u0124\u0003&\u0013\u0000\u0112\u0124\u0003(\u0014\u0000\u0113\u0124"+
		"\u0003.\u0017\u0000\u0114\u0124\u00030\u0018\u0000\u0115\u0124\u0003<"+
		"\u001e\u0000\u0116\u0124\u00032\u0019\u0000\u0117\u0124\u00034\u001a\u0000"+
		"\u0118\u0124\u00036\u001b\u0000\u0119\u0124\u00038\u001c\u0000\u011a\u0124"+
		"\u0003>\u001f\u0000\u011b\u0124\u0003:\u001d\u0000\u011c\u0124\u0003@"+
		" \u0000\u011d\u0124\u0003B!\u0000\u011e\u0124\u0003D\"\u0000\u011f\u0124"+
		"\u0003F#\u0000\u0120\u0124\u0003H$\u0000\u0121\u0124\u0003J%\u0000\u0122"+
		"\u0124\u0003L&\u0000\u0123\u010e\u0001\u0000\u0000\u0000\u0123\u010f\u0001"+
		"\u0000\u0000\u0000\u0123\u0110\u0001\u0000\u0000\u0000\u0123\u0111\u0001"+
		"\u0000\u0000\u0000\u0123\u0112\u0001\u0000\u0000\u0000\u0123\u0113\u0001"+
		"\u0000\u0000\u0000\u0123\u0114\u0001\u0000\u0000\u0000\u0123\u0115\u0001"+
		"\u0000\u0000\u0000\u0123\u0116\u0001\u0000\u0000\u0000\u0123\u0117\u0001"+
		"\u0000\u0000\u0000\u0123\u0118\u0001\u0000\u0000\u0000\u0123\u0119\u0001"+
		"\u0000\u0000\u0000\u0123\u011a\u0001\u0000\u0000\u0000\u0123\u011b\u0001"+
		"\u0000\u0000\u0000\u0123\u011c\u0001\u0000\u0000\u0000\u0123\u011d\u0001"+
		"\u0000\u0000\u0000\u0123\u011e\u0001\u0000\u0000\u0000\u0123\u011f\u0001"+
		"\u0000\u0000\u0000\u0123\u0120\u0001\u0000\u0000\u0000\u0123\u0121\u0001"+
		"\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u001f\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0003\u0000\u0000\u0000\u0126\u0127\u0005"+
		"\u001a\u0000\u0000\u0127\u0128\u0005\u001d\u0000\u0000\u0128\u0148\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0003\u0000\u0000\u0000\u012a\u012b\u0005"+
		"\u001a\u0000\u0000\u012b\u012c\u0005M\u0000\u0000\u012c\u012d\u0005\u001d"+
		"\u0000\u0000\u012d\u0148\u0001\u0000\u0000\u0000\u012e\u012f\u0003\u0000"+
		"\u0000\u0000\u012f\u0130\u0005\u001a\u0000\u0000\u0130\u0131\u0005[\u0000"+
		"\u0000\u0131\u0148\u0001\u0000\u0000\u0000\u0132\u0133\u0003\u0000\u0000"+
		"\u0000\u0133\u0134\u0005\u001a\u0000\u0000\u0134\u0135\u0005`\u0000\u0000"+
		"\u0135\u0136\u0005[\u0000\u0000\u0136\u0148\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0003\u0000\u0000\u0000\u0138\u0139\u0005\u001a\u0000\u0000\u0139"+
		"\u013a\u0005`\u0000\u0000\u013a\u013b\u0005\u001c\u0000\u0000\u013b\u0148"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0003\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\u001a\u0000\u0000\u013e\u013f\u0005`\u0000\u0000\u013f\u0140\u0005"+
		"\u001c\u0000\u0000\u0140\u0141\u0005N\u0000\u0000\u0141\u0142\u0005#\u0000"+
		"\u0000\u0142\u0143\u0005O\u0000\u0000\u0143\u0144\u0005\u0017\u0000\u0000"+
		"\u0144\u0145\u0005\u000f\u0000\u0000\u0145\u0146\u00055\u0000\u0000\u0146"+
		"\u0148\u0001\u0000\u0000\u0000\u0147\u0125\u0001\u0000\u0000\u0000\u0147"+
		"\u0129\u0001\u0000\u0000\u0000\u0147\u012e\u0001\u0000\u0000\u0000\u0147"+
		"\u0132\u0001\u0000\u0000\u0000\u0147\u0137\u0001\u0000\u0000\u0000\u0147"+
		"\u013c\u0001\u0000\u0000\u0000\u0148!\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0003\u0000\u0000\u0000\u014a\u014b\u0005#\u0000\u0000\u014b\u0155\u0005"+
		"[\u0000\u0000\u014c\u014d\u0005\u0017\u0000\u0000\u014d\u0153\u0005\u000f"+
		"\u0000\u0000\u014e\u0154\u00055\u0000\u0000\u014f\u0150\u00052\u0000\u0000"+
		"\u0150\u0154\u00054\u0000\u0000\u0151\u0152\u00056\u0000\u0000\u0152\u0154"+
		"\u00054\u0000\u0000\u0153\u014e\u0001\u0000\u0000\u0000\u0153\u014f\u0001"+
		"\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0156\u0001"+
		"\u0000\u0000\u0000\u0155\u014c\u0001\u0000\u0000\u0000\u0155\u0156\u0001"+
		"\u0000\u0000\u0000\u0156#\u0001\u0000\u0000\u0000\u0157\u0158\u0003\u0000"+
		"\u0000\u0000\u0158\u0159\u0005$\u0000\u0000\u0159\u015a\u0005[\u0000\u0000"+
		"\u015a\u015b\u0005\u0017\u0000\u0000\u015b\u0163\u0005[\u0000\u0000\u015c"+
		"\u015d\u0005(\u0000\u0000\u015d\u015e\u0005\u000f\u0000\u0000\u015e\u0164"+
		"\u00055\u0000\u0000\u015f\u0160\u0005)\u0000\u0000\u0160\u0161\u0005\u000f"+
		"\u0000\u0000\u0161\u0162\u00052\u0000\u0000\u0162\u0164\u00054\u0000\u0000"+
		"\u0163\u015c\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000\u0000\u0000"+
		"\u0164%\u0001\u0000\u0000\u0000\u0165\u0166\u0003\u0000\u0000\u0000\u0166"+
		"\u0167\u0005%\u0000\u0000\u0167\u0168\u0005[\u0000\u0000\u0168\u0169\u0005"+
		"\u0017\u0000\u0000\u0169\u0171\u0005[\u0000\u0000\u016a\u016b\u0005(\u0000"+
		"\u0000\u016b\u016c\u0005\u000f\u0000\u0000\u016c\u0172\u00055\u0000\u0000"+
		"\u016d\u016e\u0005)\u0000\u0000\u016e\u016f\u0005\u000f\u0000\u0000\u016f"+
		"\u0170\u00052\u0000\u0000\u0170\u0172\u00054\u0000\u0000\u0171\u016a\u0001"+
		"\u0000\u0000\u0000\u0171\u016d\u0001\u0000\u0000\u0000\u0172\'\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0003\u0000\u0000\u0000\u0174\u0175\u0005Z\u0000"+
		"\u0000\u0175\u0176\u0005[\u0000\u0000\u0176\u0177\u0005&\u0000\u0000\u0177"+
		"\u0180\u0005\\\u0000\u0000\u0178\u0179\u0005(\u0000\u0000\u0179\u017a"+
		"\u0003\u0000\u0000\u0000\u017a\u017b\u0005Z\u0000\u0000\u017b\u017c\u0005"+
		"[\u0000\u0000\u017c\u017d\u0005\u000e\u0000\u0000\u017d\u017e\u0005`\u0000"+
		"\u0000\u017e\u017f\u00057\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000"+
		"\u0180\u0178\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u018f\u0001\u0000\u0000\u0000\u0182\u0183\u0005b\u0000\u0000\u0183"+
		"\u0184\u0003\u0000\u0000\u0000\u0184\u0185\u0005Z\u0000\u0000\u0185\u0186"+
		"\u0005[\u0000\u0000\u0186\u0187\u0005@\u0000\u0000\u0187\u0188\u0005`"+
		"\u0000\u0000\u0188\u0189\u0005S\u0000\u0000\u0189\u018a\u00057\u0000\u0000"+
		"\u018a\u018b\u0005T\u0000\u0000\u018b\u018c\u0005\'\u0000\u0000\u018c"+
		"\u018d\u0005_\u0000\u0000\u018d\u018e\u0005U\u0000\u0000\u018e\u0190\u0001"+
		"\u0000\u0000\u0000\u018f\u0182\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u0190)\u0001\u0000\u0000\u0000\u0191\u0192\u0005i\u0000"+
		"\u0000\u0192\u0194\u0005V\u0000\u0000\u0193\u0195\u0005d\u0000\u0000\u0194"+
		"\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0005j\u0000\u0000\u0197\u0199"+
		"\u0003,\u0016\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001"+
		"\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u019e\u0005"+
		"j\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000"+
		"\u0000\u0000\u019e+\u0001\u0000\u0000\u0000\u019f\u0208\u0005h\u0000\u0000"+
		"\u01a0\u01a2\u0005W\u0000\u0000\u01a1\u01a3\u0005d\u0000\u0000\u01a2\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005`\u0000\u0000\u01a5\u0209\u0005"+
		"7\u0000\u0000\u01a6\u01a8\u0005X\u0000\u0000\u01a7\u01a9\u0005d\u0000"+
		"\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005`\u0000\u0000"+
		"\u01ab\u0209\u00057\u0000\u0000\u01ac\u01ad\u0005`\u0000\u0000\u01ad\u01af"+
		"\u0005\u0003\u0000\u0000\u01ae\u01b0\u0005d\u0000\u0000\u01af\u01ae\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0005`\u0000\u0000\u01b2\u0209\u00057\u0000"+
		"\u0000\u01b3\u01b4\u0005f\u0000\u0000\u01b4\u01b5\u0005Y\u0000\u0000\u01b5"+
		"\u01b6\u0005g\u0000\u0000\u01b6\u01b8\u0005[\u0000\u0000\u01b7\u01b9\u0005"+
		"d\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005`\u0000"+
		"\u0000\u01bb\u0209\u00057\u0000\u0000\u01bc\u01bd\u0005`\u0000\u0000\u01bd"+
		"\u01be\u0007\u0004\u0000\u0000\u01be\u01c0\u0005P\u0000\u0000\u01bf\u01c1"+
		"\u0005d\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005"+
		"`\u0000\u0000\u01c3\u0209\u00057\u0000\u0000\u01c4\u01c5\u0005U\u0000"+
		"\u0000\u01c5\u01c6\u0005\u0017\u0000\u0000\u01c6\u01c8\u0005_\u0000\u0000"+
		"\u01c7\u01c9\u0005d\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0005`\u0000\u0000\u01cb\u0209\u00057\u0000\u0000\u01cc\u01cd\u0005"+
		"f\u0000\u0000\u01cd\u01ce\u0005\u001e\u0000\u0000\u01ce\u01cf\u0005g\u0000"+
		"\u0000\u01cf\u01d1\u0005]\u0000\u0000\u01d0\u01d2\u0005d\u0000\u0000\u01d1"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d3\u01d5\u0005i\u0000\u0000\u01d4\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005`\u0000\u0000\u01d7\u0209\u0005"+
		"7\u0000\u0000\u01d8\u01d9\u0005f\u0000\u0000\u01d9\u01da\u0005\u001f\u0000"+
		"\u0000\u01da\u01db\u0005g\u0000\u0000\u01db\u01dd\u0005[\u0000\u0000\u01dc"+
		"\u01de\u0005d\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0001\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01e1"+
		"\u0005i\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005"+
		"`\u0000\u0000\u01e3\u0209\u00057\u0000\u0000\u01e4\u01e5\u0005f\u0000"+
		"\u0000\u01e5\u01e6\u0005\u001e\u0000\u0000\u01e6\u01e7\u0005g\u0000\u0000"+
		"\u01e7\u01e9\u0005]\u0000\u0000\u01e8\u01ea\u0005d\u0000\u0000\u01e9\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ec"+
		"\u0001\u0000\u0000\u0000\u01eb\u01ed\u0005i\u0000\u0000\u01ec\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ef\u0005`\u0000\u0000\u01ef\u0209\u00057\u0000"+
		"\u0000\u01f0\u01f1\u0005f\u0000\u0000\u01f1\u01f2\u0005!\u0000\u0000\u01f2"+
		"\u01f3\u0005g\u0000\u0000\u01f3\u01f5\u0005[\u0000\u0000\u01f4\u01f6\u0005"+
		"d\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f9\u0005i\u0000"+
		"\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005`\u0000\u0000"+
		"\u01fb\u0209\u00057\u0000\u0000\u01fc\u01fd\u0005f\u0000\u0000\u01fd\u01fe"+
		"\u0005 \u0000\u0000\u01fe\u01ff\u0005g\u0000\u0000\u01ff\u0201\u0005\\"+
		"\u0000\u0000\u0200\u0202\u0005d\u0000\u0000\u0201\u0200\u0001\u0000\u0000"+
		"\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0204\u0001\u0000\u0000"+
		"\u0000\u0203\u0205\u0005i\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0005`\u0000\u0000\u0207\u0209\u00057\u0000\u0000\u0208\u01a0"+
		"\u0001\u0000\u0000\u0000\u0208\u01a6\u0001\u0000\u0000\u0000\u0208\u01ac"+
		"\u0001\u0000\u0000\u0000\u0208\u01b3\u0001\u0000\u0000\u0000\u0208\u01bc"+
		"\u0001\u0000\u0000\u0000\u0208\u01c4\u0001\u0000\u0000\u0000\u0208\u01cc"+
		"\u0001\u0000\u0000\u0000\u0208\u01d8\u0001\u0000\u0000\u0000\u0208\u01e4"+
		"\u0001\u0000\u0000\u0000\u0208\u01f0\u0001\u0000\u0000\u0000\u0208\u01fc"+
		"\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\u0005j\u0000\u0000\u020b-\u0001\u0000\u0000\u0000\u020c\u020d\u0003\u0000"+
		"\u0000\u0000\u020d\u020e\u0005F\u0000\u0000\u020e\u020f\u0005[\u0000\u0000"+
		"\u020f\u0210\u0005\u0017\u0000\u0000\u0210\u0211\u0005\u000f\u0000\u0000"+
		"\u0211\u0212\u00055\u0000\u0000\u0212/\u0001\u0000\u0000\u0000\u0213\u0214"+
		"\u0003\u0000\u0000\u0000\u0214\u0215\u0005:\u0000\u0000\u0215\u0216\u0005"+
		"=\u0000\u0000\u0216\u0217\u0005;\u0000\u0000\u0217\u0228\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\u0003\u0000\u0000\u0000\u0219\u021a\u0005:\u0000\u0000"+
		"\u021a\u021b\u0005`\u0000\u0000\u021b\u021c\u0005\u001c\u0000\u0000\u021c"+
		"\u021d\u0005<\u0000\u0000\u021d\u021e\u0005=\u0000\u0000\u021e\u021f\u0005"+
		";\u0000\u0000\u021f\u0228\u0001\u0000\u0000\u0000\u0220\u0221\u0003\u0000"+
		"\u0000\u0000\u0221\u0222\u0005:\u0000\u0000\u0222\u0223\u0005[\u0000\u0000"+
		"\u0223\u0224\u0005<\u0000\u0000\u0224\u0225\u0005=\u0000\u0000\u0225\u0226"+
		"\u0005;\u0000\u0000\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0213\u0001"+
		"\u0000\u0000\u0000\u0227\u0218\u0001\u0000\u0000\u0000\u0227\u0220\u0001"+
		"\u0000\u0000\u0000\u02281\u0001\u0000\u0000\u0000\u0229\u022a\u0003\u0000"+
		"\u0000\u0000\u022a\u022b\u00058\u0000\u0000\u022b\u022c\u0005[\u0000\u0000"+
		"\u022c\u0244\u0001\u0000\u0000\u0000\u022d\u022e\u0003\u0000\u0000\u0000"+
		"\u022e\u022f\u00058\u0000\u0000\u022f\u0230\u0005`\u0000\u0000\u0230\u0231"+
		"\u0005\u001c\u0000\u0000\u0231\u0244\u0001\u0000\u0000\u0000\u0232\u0233"+
		"\u0005`\u0000\u0000\u0233\u0234\u0005\u001c\u0000\u0000\u0234\u0235\u0005"+
		"-\u0000\u0000\u0235\u0236\u00058\u0000\u0000\u0236\u0237\u0005>\u0000"+
		"\u0000\u0237\u0238\u0003\u0000\u0000\u0000\u0238\u0239\u0005Z\u0000\u0000"+
		"\u0239\u023a\u0005[\u0000\u0000\u023a\u0244\u0001\u0000\u0000\u0000\u023b"+
		"\u023c\u0005[\u0000\u0000\u023c\u023d\u0005,\u0000\u0000\u023d\u023e\u0005"+
		"8\u0000\u0000\u023e\u023f\u0005>\u0000\u0000\u023f\u0240\u0003\u0000\u0000"+
		"\u0000\u0240\u0241\u0005Z\u0000\u0000\u0241\u0242\u0005[\u0000\u0000\u0242"+
		"\u0244\u0001\u0000\u0000\u0000\u0243\u0229\u0001\u0000\u0000\u0000\u0243"+
		"\u022d\u0001\u0000\u0000\u0000\u0243\u0232\u0001\u0000\u0000\u0000\u0243"+
		"\u023b\u0001\u0000\u0000\u0000\u02443\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0003\u0000\u0000\u0000\u0246\u0248\u0005@\u0000\u0000\u0247\u0249\u0005"+
		"M\u0000\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000"+
		"\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024b\u0005A\u0000"+
		"\u0000\u024b\u024c\u0005\u001d\u0000\u0000\u024c\u0253\u0001\u0000\u0000"+
		"\u0000\u024d\u024e\u0003\u0000\u0000\u0000\u024e\u024f\u0005@\u0000\u0000"+
		"\u024f\u0250\u0005`\u0000\u0000\u0250\u0251\u0005B\u0000\u0000\u0251\u0253"+
		"\u0001\u0000\u0000\u0000\u0252\u0245\u0001\u0000\u0000\u0000\u0252\u024d"+
		"\u0001\u0000\u0000\u0000\u02535\u0001\u0000\u0000\u0000\u0254\u0255\u0003"+
		"\u0000\u0000\u0000\u0255\u0256\u0005?\u0000\u0000\u0256\u0257\u0003\u0000"+
		"\u0000\u0000\u0257\u0258\u0005Z\u0000\u0000\u0258\u0259\u0005[\u0000\u0000"+
		"\u0259\u025a\u0005\u0017\u0000\u0000\u025a\u025b\u0005=\u0000\u0000\u025b"+
		"\u025c\u0005\"\u0000\u0000\u025c7\u0001\u0000\u0000\u0000\u025d\u025e"+
		"\u0003\u0000\u0000\u0000\u025e\u025f\u0005Z\u0000\u0000\u025f\u0260\u0005"+
		"[\u0000\u0000\u0260\u0261\u0005.\u0000\u0000\u0261\u0262\u0005/\u0000"+
		"\u0000\u0262\u0263\u0005)\u0000\u0000\u0263\u0264\u0005\u000f\u0000\u0000"+
		"\u0264\u0265\u00052\u0000\u0000\u0265\u0266\u00054\u0000\u0000\u02669"+
		"\u0001\u0000\u0000\u0000\u0267\u0268\u0003\u0000\u0000\u0000\u0268\u0269"+
		"\u0005Z\u0000\u0000\u0269\u026a\u0005[\u0000\u0000\u026a\u026b\u0005,"+
		"\u0000\u0000\u026b\u026c\u0005C\u0000\u0000\u026c\u026d\u0005D\u0000\u0000"+
		"\u026d;\u0001\u0000\u0000\u0000\u026e\u026f\u0005M\u0000\u0000\u026f\u0270"+
		"\u0005\u001d\u0000\u0000\u0270\u0271\u0005,\u0000\u0000\u0271\u0272\u0005"+
		"\u0004\u0000\u0000\u0272\u0273\u0005\u0017\u0000\u0000\u0273\u0274\u0003"+
		"\u0000\u0000\u0000\u0274\u0275\u0005Z\u0000\u0000\u0275\u0276\u0005\""+
		"\u0000\u0000\u0276\u028a\u0001\u0000\u0000\u0000\u0277\u0278\u0005[\u0000"+
		"\u0000\u0278\u0279\u0005,\u0000\u0000\u0279\u027a\u0005\u0004\u0000\u0000"+
		"\u027a\u027b\u0005\u0017\u0000\u0000\u027b\u027c\u0003\u0000\u0000\u0000"+
		"\u027c\u027d\u0005Z\u0000\u0000\u027d\u027e\u0005\"\u0000\u0000\u027e"+
		"\u028a\u0001\u0000\u0000\u0000\u027f\u0280\u0003\u0000\u0000\u0000\u0280"+
		"\u0281\u0005?\u0000\u0000\u0281\u0282\u0003\u0000\u0000\u0000\u0282\u0283"+
		"\u0005Z\u0000\u0000\u0283\u0284\u0005`\u0000\u0000\u0284\u0285\u0005\u001c"+
		"\u0000\u0000\u0285\u0286\u0005\u0017\u0000\u0000\u0286\u0287\u0005=\u0000"+
		"\u0000\u0287\u0288\u0005\"\u0000\u0000\u0288\u028a\u0001\u0000\u0000\u0000"+
		"\u0289\u026e\u0001\u0000\u0000\u0000\u0289\u0277\u0001\u0000\u0000\u0000"+
		"\u0289\u027f\u0001\u0000\u0000\u0000\u028a=\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0003\u0000\u0000\u0000\u028c\u028d\u0005Z\u0000\u0000\u028d\u028e"+
		"\u0005[\u0000\u0000\u028e\u028f\u0005,\u0000\u0000\u028f\u0290\u0005E"+
		"\u0000\u0000\u0290\u0291\u0005+\u0000\u0000\u0291\u0292\u0003\u0000\u0000"+
		"\u0000\u0292\u0293\u0005Z\u0000\u0000\u0293\u0294\u0005[\u0000\u0000\u0294"+
		"\u0295\u0005\u0017\u0000\u0000\u0295\u0296\u00050\u0000\u0000\u0296\u0297"+
		"\u0005\u000f\u0000\u0000\u0297\u0298\u00052\u0000\u0000\u0298\u0299\u0005"+
		"\u0003\u0000\u0000\u0299?\u0001\u0000\u0000\u0000\u029a\u029b\u0003\u0000"+
		"\u0000\u0000\u029b\u029c\u0005Z\u0000\u0000\u029c\u029d\u0005[\u0000\u0000"+
		"\u029d\u029e\u0005@\u0000\u0000\u029e\u029f\u0005`\u0000\u0000\u029f\u02a0"+
		"\u00057\u0000\u0000\u02a0A\u0001\u0000\u0000\u0000\u02a1\u02a2\u0003\u0000"+
		"\u0000\u0000\u02a2\u02a3\u0005\u0013\u0000\u0000\u02a3\u02a4\u0005M\u0000"+
		"\u0000\u02a4\u02a5\u0005\u0011\u0000\u0000\u02a5\u02a6\u0005N\u0000\u0000"+
		"\u02a6\u02a7\u0005*\u0000\u0000\u02a7\u02a8\u00051\u0000\u0000\u02a8\u02a9"+
		"\u0005(\u0000\u0000\u02a9\u02aa\u0007\u0001\u0000\u0000\u02aaC\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ac\u0003\u0000\u0000\u0000\u02ac\u02ad\u0005\u000b"+
		"\u0000\u0000\u02ad\u02ae\u0005\\\u0000\u0000\u02aeE\u0001\u0000\u0000"+
		"\u0000\u02af\u02b0\u0003\u0000\u0000\u0000\u02b0\u02b1\u0005Z\u0000\u0000"+
		"\u02b1\u02b2\u0005[\u0000\u0000\u02b2\u02b3\u0005.\u0000\u0000\u02b3\u02b4"+
		"\u0005/\u0000\u0000\u02b4\u02b5\u0005^\u0000\u0000\u02b5G\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b7\u0005[\u0000\u0000\u02b7\u02b8\u0005,\u0000\u0000"+
		"\u02b8\u02b9\u00053\u0000\u0000\u02b9I\u0001\u0000\u0000\u0000\u02ba\u02bb"+
		"\u0003\u0000\u0000\u0000\u02bb\u02bc\u0005\b\u0000\u0000\u02bc\u02bd\u0005"+
		"`\u0000\u0000\u02bd\u02be\u00057\u0000\u0000\u02be\u02bf\u0005\t\u0000"+
		"\u0000\u02bf\u02c0\u0005(\u0000\u0000\u02c0\u02c1\u0003\u0000\u0000\u0000"+
		"\u02c1\u02c2\u0005Z\u0000\u0000\u02c2\u02c3\u0005[\u0000\u0000\u02c3K"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c5\u0003\u0000\u0000\u0000\u02c5\u02c6"+
		"\u0005G\u0000\u0000\u02c6\u02c7\u0005=\u0000\u0000\u02c7\u02c8\u0005\u0002"+
		"\u0000\u0000\u02c8M\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005K\u0000\u0000"+
		"\u02ca\u02cb\u0005B\u0000\u0000\u02cb\u02cc\u0005L\u0000\u0000\u02cc\u02cd"+
		"\u0005b\u0000\u0000\u02cd\u02ce\u0003\u0000\u0000\u0000\u02ce\u02cf\u0005"+
		"J\u0000\u0000\u02cf\u02d0\u0005b\u0000\u0000\u02d0\u02eb\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d2\u0005H\u0000\u0000\u02d2\u02d3\u0005I\u0000\u0000\u02d3"+
		"\u02d4\u0005b\u0000\u0000\u02d4\u02d5\u0003\u0000\u0000\u0000\u02d5\u02d6"+
		"\u0005J\u0000\u0000\u02d6\u02d7\u0005b\u0000\u0000\u02d7\u02eb\u0001\u0000"+
		"\u0000\u0000\u02d8\u02d9\u0005H\u0000\u0000\u02d9\u02da\u0005@\u0000\u0000"+
		"\u02da\u02db\u0005K\u0000\u0000\u02db\u02dc\u0005\'\u0000\u0000\u02dc"+
		"\u02dd\u0005=\u0000\u0000\u02dd\u02de\u0005B\u0000\u0000\u02de\u02df\u0005"+
		"b\u0000\u0000\u02df\u02e0\u0003\u0000\u0000\u0000\u02e0\u02e1\u0005J\u0000"+
		"\u0000\u02e1\u02e2\u0005b\u0000\u0000\u02e2\u02eb\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e4\u0005R\u0000\u0000\u02e4\u02e5\u0005I\u0000\u0000\u02e5\u02e6"+
		"\u0005b\u0000\u0000\u02e6\u02e7\u0003\u0000\u0000\u0000\u02e7\u02e8\u0005"+
		"J\u0000\u0000\u02e8\u02e9\u0005b\u0000\u0000\u02e9\u02eb\u0001\u0000\u0000"+
		"\u0000\u02ea\u02c9\u0001\u0000\u0000\u0000\u02ea\u02d1\u0001\u0000\u0000"+
		"\u0000\u02ea\u02d8\u0001\u0000\u0000\u0000\u02ea\u02e3\u0001\u0000\u0000"+
		"\u0000\u02ebO\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005h\u0000\u0000\u02ed"+
		"\u02f2\u0005[\u0000\u0000\u02ee\u02ef\u0005c\u0000\u0000\u02ef\u02f1\u0005"+
		"[\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f1\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f5\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f6\u0005j\u0000\u0000\u02f6Q\u0001\u0000\u0000\u0000"+
		"2Y`js\u009c\u00c4\u00c7\u00dc\u00df\u00e9\u00f5\u00fd\u00ff\u0105\u010b"+
		"\u0123\u0147\u0153\u0155\u0163\u0171\u0180\u018f\u0194\u019a\u019d\u01a2"+
		"\u01a8\u01af\u01b8\u01c0\u01c8\u01d1\u01d4\u01dd\u01e0\u01e9\u01ec\u01f5"+
		"\u01f8\u0201\u0204\u0208\u0227\u0243\u0248\u0252\u0289\u02ea\u02f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}