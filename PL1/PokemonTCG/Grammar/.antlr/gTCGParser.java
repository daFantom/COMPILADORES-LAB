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
		RULE_log = 0, RULE_setup = 1, RULE_setupAction = 2, RULE_coinChoice = 3, 
		RULE_coinToss = 4, RULE_firstPlayer = 5, RULE_mulligan = 6, RULE_mulliganCards = 7, 
		RULE_openingHand = 8, RULE_drawnCards = 9, RULE_initialPokemon = 10, RULE_turn = 11, 
		RULE_mainTurnAction = 12, RULE_subTurnAction = 13, RULE_turnActionBody = 14, 
		RULE_drawAction = 15, RULE_playAction = 16, RULE_attachAction = 17, RULE_evolveAction = 18, 
		RULE_attackAction = 19, RULE_damageBreakdown = 20, RULE_damageBreakdownLine = 21, 
		RULE_retreatAction = 22, RULE_shuffleAction = 23, RULE_discardAction = 24, 
		RULE_prizeAction = 25, RULE_moveToHandAction = 26, RULE_activeSpotAction = 27, 
		RULE_knockoutAction = 28, RULE_cardMovedAction = 29, RULE_switchAction = 30, 
		RULE_damagedAction = 31, RULE_flippedAction = 32, RULE_choiceAction = 33, 
		RULE_specialConditionAction = 34, RULE_activateAction = 35, RULE_putAction = 36, 
		RULE_endTurn = 37, RULE_gameEnd = 38, RULE_cardList = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"log", "setup", "setupAction", "coinChoice", "coinToss", "firstPlayer", 
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
			setState(80);
			setup();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(81);
				match(NEWLINE);
				setState(82);
				turn();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			gameEnd();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(89);
				match(NEWLINE);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
			setState(97);
			match(SETUP);
			setState(98);
			match(NEWLINE);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					setupAction();
					}
					} 
				}
				setState(104);
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
		enterRule(_localctx, 4, RULE_setupAction);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				coinChoice();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				coinToss();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				firstPlayer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				openingHand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				initialPokemon();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
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
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			match(CHOSE);
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==HEADS || _la==TAILS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(116);
			match(FOR);
			setState(117);
			match(THE);
			setState(118);
			match(OPENING);
			setState(119);
			match(COIN);
			setState(120);
			match(FLIP);
			setState(121);
			match(DOT);
			setState(122);
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
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(125);
			match(WON);
			setState(126);
			match(THE);
			setState(127);
			match(COIN);
			setState(128);
			match(TOSS);
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
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			match(DECIDED);
			setState(134);
			match(TO);
			setState(135);
			match(GO);
			setState(136);
			match(FIRST);
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
	public static class MulliganContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(gTCGParser.NEWLINE, 0); }
		public MulliganCardsContext mulliganCards() {
			return getRuleContext(MulliganCardsContext.class,0);
		}
		public TerminalNode TAKE() { return getToken(gTCGParser.TAKE, 0); }
		public TerminalNode A_SOMETHING() { return getToken(gTCGParser.A_SOMETHING, 0); }
		public TerminalNode MULLIGAN() { return getToken(gTCGParser.MULLIGAN, 0); }
		public TerminalNode DOT() { return getToken(gTCGParser.DOT, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode OPPONENT() { return getToken(gTCGParser.OPPONENT, 0); }
		public TerminalNode PLAYER() { return getToken(gTCGParser.PLAYER, 0); }
		public MulliganContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulligan; }
	}

	public final MulliganContext mulligan() throws RecognitionException {
		MulliganContext _localctx = new MulliganContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mulligan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(140);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(141);
				match(TAKE);
				setState(142);
				match(A_SOMETHING);
				setState(143);
				match(MULLIGAN);
				setState(144);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				match(TAKE);
				setState(147);
				match(NUMBER);
				setState(148);
				match(MULLIGAN);
				setState(149);
				match(DOT);
				}
				break;
			}
			setState(152);
			match(NEWLINE);
			setState(153);
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
		enterRule(_localctx, 14, RULE_mulliganCards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(HYPHEN);
			setState(156);
			match(CARDS);
			setState(157);
			match(REVEALED);
			setState(158);
			match(FROM);
			setState(159);
			match(MULLIGAN);
			setState(160);
			match(NUMBER);
			setState(161);
			match(NEWLINE);
			setState(162);
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
		public List<TerminalNode> OPPONENT() { return getTokens(gTCGParser.OPPONENT); }
		public TerminalNode OPPONENT(int i) {
			return getToken(gTCGParser.OPPONENT, i);
		}
		public List<TerminalNode> PLAYER() { return getTokens(gTCGParser.PLAYER); }
		public TerminalNode PLAYER(int i) {
			return getToken(gTCGParser.PLAYER, i);
		}
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
		enterRule(_localctx, 16, RULE_openingHand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				match(DREW);
				setState(166);
				match(NUMBER);
				setState(167);
				match(CARDS);
				setState(168);
				match(FOR);
				setState(169);
				match(THE);
				setState(170);
				match(OPENING);
				setState(171);
				match(HAND);
				setState(172);
				match(DOT);
				setState(173);
				match(NEWLINE);
				}
				break;
			case 2:
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				match(DREW);
				setState(176);
				match(NUMBER);
				setState(177);
				match(MORE_WORD);
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==CARDS || _la==CARD_WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				match(BECAUSE);
				setState(180);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				match(TAKE);
				setState(182);
				match(AT);
				setState(183);
				match(LEAST);
				setState(184);
				match(NUMBER);
				setState(185);
				match(MULLIGAN);
				setState(186);
				match(DOT);
				setState(187);
				match(NEWLINE);
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HYPHEN) {
				{
				setState(190);
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
		enterRule(_localctx, 18, RULE_drawnCards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(193);
				match(HYPHEN);
				setState(194);
				match(NUMBER);
				setState(195);
				match(DRAWN);
				setState(196);
				match(CARDS);
				setState(197);
				match(DOT);
				setState(198);
				match(NEWLINE);
				}
				break;
			case 2:
				{
				setState(199);
				match(HYPHEN);
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				match(DREW);
				setState(202);
				match(NUMBER);
				setState(203);
				match(CARDS);
				setState(204);
				match(DOT);
				setState(205);
				match(NEWLINE);
				}
				break;
			case 3:
				{
				setState(206);
				match(HYPHEN);
				setState(207);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
				match(DREW);
				setState(209);
				match(CARD);
				setState(210);
				match(DOT);
				setState(211);
				match(NEWLINE);
				}
				break;
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BULLET) {
				{
				setState(214);
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
		enterRule(_localctx, 20, RULE_initialPokemon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(218);
			match(PLAYED);
			setState(219);
			match(CARD);
			setState(220);
			match(TO);
			setState(221);
			match(THE);
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIVE:
				{
				setState(222);
				match(ACTIVE);
				setState(223);
				match(SPOT);
				}
				break;
			case BENCH:
				{
				setState(224);
				match(BENCH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227);
			match(DOT);
			setState(228);
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
		enterRule(_localctx, 22, RULE_turn);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(231);
			match(POSSESSIVE);
			setState(232);
			match(TURN);
			setState(233);
			match(NEWLINE);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					mainTurnAction();
					}
					} 
				}
				setState(239);
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
		enterRule(_localctx, 24, RULE_mainTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			turnActionBody();
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==EXCLAMATION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(242);
			match(NEWLINE);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYPHEN) {
				{
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(243);
					subTurnAction();
					}
					break;
				case 2:
					{
					setState(244);
					damageBreakdown();
					}
					break;
				}
				}
				setState(249);
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
		enterRule(_localctx, 26, RULE_subTurnAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(HYPHEN);
			setState(251);
			turnActionBody();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(252);
				match(DOT);
				}
			}

			setState(255);
			match(NEWLINE);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BULLET) {
				{
				{
				setState(256);
				cardList();
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
		enterRule(_localctx, 28, RULE_turnActionBody);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				drawAction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				playAction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				attachAction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				evolveAction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				attackAction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				retreatAction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				shuffleAction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				cardMovedAction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(270);
				discardAction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(271);
				prizeAction();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(272);
				moveToHandAction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(273);
				activeSpotAction();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(274);
				switchAction();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(275);
				knockoutAction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(276);
				damagedAction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(277);
				flippedAction();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(278);
				choiceAction();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(279);
				specialConditionAction();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(280);
				activateAction();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(281);
				putAction();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(282);
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
		enterRule(_localctx, 30, RULE_drawAction);
		int _la;
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(286);
				match(DREW);
				setState(287);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				match(DREW);
				setState(290);
				match(A_SOMETHING);
				setState(291);
				match(CARD_WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(293);
				match(DREW);
				setState(294);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(296);
				match(DREW);
				setState(297);
				match(NUMBER);
				setState(298);
				match(CARD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(300);
				match(DREW);
				setState(301);
				match(NUMBER);
				setState(302);
				match(CARDS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(304);
				match(DREW);
				setState(305);
				match(NUMBER);
				setState(306);
				match(CARDS);
				setState(307);
				match(AND);
				setState(308);
				match(PLAYED);
				setState(309);
				match(THEM);
				setState(310);
				match(TO);
				setState(311);
				match(THE);
				setState(312);
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
		enterRule(_localctx, 32, RULE_playAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(316);
			match(PLAYED);
			setState(317);
			match(CARD);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(318);
				match(TO);
				setState(319);
				match(THE);
				setState(325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BENCH:
					{
					setState(320);
					match(BENCH);
					}
					break;
				case ACTIVE:
					{
					setState(321);
					match(ACTIVE);
					setState(322);
					match(SPOT);
					}
					break;
				case STADIUM:
					{
					setState(323);
					match(STADIUM);
					setState(324);
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
		enterRule(_localctx, 34, RULE_attachAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(330);
			match(ATTACHED);
			setState(331);
			match(CARD);
			setState(332);
			match(TO);
			setState(333);
			match(CARD);
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(334);
				match(ON);
				setState(335);
				match(THE);
				setState(336);
				match(BENCH);
				}
				break;
			case IN:
				{
				setState(337);
				match(IN);
				setState(338);
				match(THE);
				setState(339);
				match(ACTIVE);
				setState(340);
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
		enterRule(_localctx, 36, RULE_evolveAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(344);
			match(EVOLVED);
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
		enterRule(_localctx, 38, RULE_attackAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(358);
			match(POSSESSIVE);
			setState(359);
			match(CARD);
			setState(360);
			match(USED);
			setState(361);
			match(ATTACK);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(362);
				match(ON);
				setState(363);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(364);
				match(POSSESSIVE);
				setState(365);
				match(CARD);
				setState(366);
				match(FOR);
				setState(367);
				match(NUMBER);
				setState(368);
				match(DAMAGE);
				}
			}

			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(371);
				match(DOT);
				setState(372);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(373);
				match(POSSESSIVE);
				setState(374);
				match(CARD);
				setState(375);
				match(TAKE);
				setState(376);
				match(NUMBER);
				setState(377);
				match(MORE_WORD);
				setState(378);
				match(DAMAGE);
				setState(379);
				match(BECAUSE);
				setState(380);
				match(OF);
				setState(381);
				match(POKEMON_TYPE);
				setState(382);
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
		enterRule(_localctx, 40, RULE_damageBreakdown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(HYPHEN);
			setState(386);
			match(DAMAGE_BREAKDOWN);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(387);
				match(COLON);
				}
			}

			setState(390);
			match(NEWLINE);
			setState(392); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(391);
				damageBreakdownLine();
				}
				}
				setState(394); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BULLET );
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(396);
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
		enterRule(_localctx, 42, RULE_damageBreakdownLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(BULLET);
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(400);
				match(BASE_DAMAGE);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(401);
					match(COLON);
					}
				}

				setState(404);
				match(NUMBER);
				setState(405);
				match(DAMAGE);
				}
				break;
			case 2:
				{
				setState(406);
				match(TOTAL_DAMAGE);
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
				match(NUMBER);
				setState(411);
				match(DAMAGE);
				}
				break;
			case 3:
				{
				setState(412);
				match(NUMBER);
				setState(413);
				match(POKEMON);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(414);
					match(COLON);
					}
				}

				setState(417);
				match(NUMBER);
				setState(418);
				match(DAMAGE);
				}
				break;
			case 4:
				{
				setState(419);
				match(LPAREN);
				setState(420);
				match(ITEM);
				setState(421);
				match(RPAREN);
				setState(422);
				match(CARD);
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
			case 5:
				{
				setState(428);
				match(NUMBER);
				setState(429);
				_la = _input.LA(1);
				if ( !(_la==ATTACHED || _la==SELECTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(430);
				match(ENERGY);
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
				match(NUMBER);
				setState(435);
				match(DAMAGE);
				}
				break;
			case 6:
				{
				setState(436);
				match(WEAKNESS);
				setState(437);
				match(TO);
				setState(438);
				match(POKEMON_TYPE);
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
			case 7:
				{
				setState(444);
				match(LPAREN);
				setState(445);
				match(ABILITY_WORD);
				setState(446);
				match(RPAREN);
				setState(447);
				match(ABILITY);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(448);
					match(COLON);
					}
				}

				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(451);
					match(HYPHEN);
					}
				}

				setState(454);
				match(NUMBER);
				setState(455);
				match(DAMAGE);
				}
				break;
			case 8:
				{
				setState(456);
				match(LPAREN);
				setState(457);
				match(SUPPORTER_WORD);
				setState(458);
				match(RPAREN);
				setState(459);
				match(CARD);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(460);
					match(COLON);
					}
				}

				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(463);
					match(HYPHEN);
					}
				}

				setState(466);
				match(NUMBER);
				setState(467);
				match(DAMAGE);
				}
				break;
			case 9:
				{
				setState(468);
				match(LPAREN);
				setState(469);
				match(ABILITY_WORD);
				setState(470);
				match(RPAREN);
				setState(471);
				match(ABILITY);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(472);
					match(COLON);
					}
				}

				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(475);
					match(HYPHEN);
					}
				}

				setState(478);
				match(NUMBER);
				setState(479);
				match(DAMAGE);
				}
				break;
			case 10:
				{
				setState(480);
				match(LPAREN);
				setState(481);
				match(POKEMON_TOOL);
				setState(482);
				match(RPAREN);
				setState(483);
				match(CARD);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(484);
					match(COLON);
					}
				}

				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(487);
					match(HYPHEN);
					}
				}

				setState(490);
				match(NUMBER);
				setState(491);
				match(DAMAGE);
				}
				break;
			case 11:
				{
				setState(492);
				match(LPAREN);
				setState(493);
				match(ATTACK_WORD);
				setState(494);
				match(RPAREN);
				setState(495);
				match(ATTACK);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(496);
					match(COLON);
					}
				}

				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HYPHEN) {
					{
					setState(499);
					match(HYPHEN);
					}
				}

				setState(502);
				match(NUMBER);
				setState(503);
				match(DAMAGE);
				}
				break;
			}
			setState(506);
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
		enterRule(_localctx, 44, RULE_retreatAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(509);
			match(RETIRED);
			setState(510);
			match(CARD);
			setState(511);
			match(TO);
			setState(512);
			match(THE);
			setState(513);
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
		enterRule(_localctx, 46, RULE_shuffleAction);
		int _la;
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(516);
				match(SHUFFLED);
				setState(517);
				match(THEIR);
				setState(518);
				match(DECK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(520);
				match(SHUFFLED);
				setState(521);
				match(NUMBER);
				setState(522);
				match(CARDS);
				setState(523);
				match(INTO);
				setState(524);
				match(THEIR);
				setState(525);
				match(DECK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				match(SHUFFLED);
				setState(528);
				match(CARD);
				setState(529);
				match(INTO);
				setState(530);
				match(THEIR);
				setState(531);
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
		enterRule(_localctx, 48, RULE_discardAction);
		int _la;
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(535);
				match(DISCARDED);
				setState(536);
				match(CARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(538);
				match(DISCARDED);
				setState(539);
				match(NUMBER);
				setState(540);
				match(CARDS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				match(NUMBER);
				setState(542);
				match(CARDS);
				setState(543);
				match(WERE);
				setState(544);
				match(DISCARDED);
				setState(545);
				match(FROM);
				setState(546);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(547);
				match(POSSESSIVE);
				setState(548);
				match(CARD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(549);
				match(CARD);
				setState(550);
				match(WAS);
				setState(551);
				match(DISCARDED);
				setState(552);
				match(FROM);
				setState(553);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(554);
				match(POSSESSIVE);
				setState(555);
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
		enterRule(_localctx, 50, RULE_prizeAction);
		int _la;
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
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
				match(TAKE);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==A_SOMETHING) {
					{
					setState(560);
					match(A_SOMETHING);
					}
				}

				setState(563);
				match(PRIZE);
				setState(564);
				match(CARD_WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(566);
				match(TAKE);
				setState(567);
				match(NUMBER);
				setState(568);
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
		enterRule(_localctx, 52, RULE_moveToHandAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(572);
			match(MOVED);
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
			match(POSSESSIVE);
			setState(575);
			match(CARD);
			setState(576);
			match(TO);
			setState(577);
			match(THEIR);
			setState(578);
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
		enterRule(_localctx, 54, RULE_activeSpotAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(581);
			match(POSSESSIVE);
			setState(582);
			match(CARD);
			setState(583);
			match(IS);
			setState(584);
			match(NOW);
			setState(585);
			match(IN);
			setState(586);
			match(THE);
			setState(587);
			match(ACTIVE);
			setState(588);
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
		enterRule(_localctx, 56, RULE_knockoutAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(591);
			match(POSSESSIVE);
			setState(592);
			match(CARD);
			setState(593);
			match(WAS);
			setState(594);
			match(KNOCKED);
			setState(595);
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
		public List<TerminalNode> OPPONENT() { return getTokens(gTCGParser.OPPONENT); }
		public TerminalNode OPPONENT(int i) {
			return getToken(gTCGParser.OPPONENT, i);
		}
		public List<TerminalNode> PLAYER() { return getTokens(gTCGParser.PLAYER); }
		public TerminalNode PLAYER(int i) {
			return getToken(gTCGParser.PLAYER, i);
		}
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
		enterRule(_localctx, 58, RULE_cardMovedAction);
		int _la;
		try {
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_SOMETHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(A_SOMETHING);
				setState(598);
				match(CARD_WORD);
				setState(599);
				match(WAS);
				setState(600);
				match(ADDED);
				setState(601);
				match(TO);
				setState(602);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(603);
				match(POSSESSIVE);
				setState(604);
				match(HAND);
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				match(CARD);
				setState(606);
				match(WAS);
				setState(607);
				match(ADDED);
				setState(608);
				match(TO);
				setState(609);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(610);
				match(POSSESSIVE);
				setState(611);
				match(HAND);
				}
				break;
			case OPPONENT:
			case PLAYER:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(613);
				match(MOVED);
				setState(614);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(615);
				match(POSSESSIVE);
				setState(616);
				match(NUMBER);
				setState(617);
				match(CARDS);
				setState(618);
				match(TO);
				setState(619);
				match(THEIR);
				setState(620);
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
		enterRule(_localctx, 60, RULE_switchAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(624);
			match(POSSESSIVE);
			setState(625);
			match(CARD);
			setState(626);
			match(WAS);
			setState(627);
			match(SWITCHED);
			setState(628);
			match(WITH);
			setState(629);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(630);
			match(POSSESSIVE);
			setState(631);
			match(CARD);
			setState(632);
			match(TO);
			setState(633);
			match(BECOME);
			setState(634);
			match(THE);
			setState(635);
			match(ACTIVE);
			setState(636);
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
		enterRule(_localctx, 62, RULE_damagedAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(639);
			match(POSSESSIVE);
			setState(640);
			match(CARD);
			setState(641);
			match(TAKE);
			setState(642);
			match(NUMBER);
			setState(643);
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
		enterRule(_localctx, 64, RULE_flippedAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(646);
			match(FLIPPED);
			setState(647);
			match(A_SOMETHING);
			setState(648);
			match(COIN);
			setState(649);
			match(AND);
			setState(650);
			match(IT);
			setState(651);
			match(LANDED);
			setState(652);
			match(ON);
			setState(653);
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
		enterRule(_localctx, 66, RULE_choiceAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(656);
			match(CHOSE);
			setState(657);
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
		enterRule(_localctx, 68, RULE_specialConditionAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(660);
			match(POSSESSIVE);
			setState(661);
			match(CARD);
			setState(662);
			match(IS);
			setState(663);
			match(NOW);
			setState(664);
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
		enterRule(_localctx, 70, RULE_activateAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(CARD);
			setState(667);
			match(WAS);
			setState(668);
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
		public TerminalNode PUT() { return getToken(gTCGParser.PUT, 0); }
		public TerminalNode NUMBER() { return getToken(gTCGParser.NUMBER, 0); }
		public TerminalNode DAMAGE() { return getToken(gTCGParser.DAMAGE, 0); }
		public TerminalNode COUNTERS() { return getToken(gTCGParser.COUNTERS, 0); }
		public TerminalNode ON() { return getToken(gTCGParser.ON, 0); }
		public TerminalNode POSSESSIVE() { return getToken(gTCGParser.POSSESSIVE, 0); }
		public TerminalNode CARD() { return getToken(gTCGParser.CARD, 0); }
		public List<TerminalNode> OPPONENT() { return getTokens(gTCGParser.OPPONENT); }
		public TerminalNode OPPONENT(int i) {
			return getToken(gTCGParser.OPPONENT, i);
		}
		public List<TerminalNode> PLAYER() { return getTokens(gTCGParser.PLAYER); }
		public TerminalNode PLAYER(int i) {
			return getToken(gTCGParser.PLAYER, i);
		}
		public PutActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putAction; }
	}

	public final PutActionContext putAction() throws RecognitionException {
		PutActionContext _localctx = new PutActionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_putAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(671);
			match(PUT);
			setState(672);
			match(NUMBER);
			setState(673);
			match(DAMAGE);
			setState(674);
			match(COUNTERS);
			setState(675);
			match(ON);
			setState(676);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(677);
			match(POSSESSIVE);
			setState(678);
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
		enterRule(_localctx, 74, RULE_endTurn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_la = _input.LA(1);
			if ( !(_la==OPPONENT || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(681);
			match(ENDED);
			setState(682);
			match(THEIR);
			setState(683);
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
		public TerminalNode YOU() { return getToken(gTCGParser.YOU, 0); }
		public GameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameEnd; }
	}

	public final GameEndContext gameEnd() throws RecognitionException {
		GameEndContext _localctx = new GameEndContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_gameEnd);
		int _la;
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				match(ALL);
				setState(686);
				match(PRIZE_CARDS);
				setState(687);
				match(TAKEN);
				setState(688);
				match(DOT);
				setState(689);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(690);
				match(WINS);
				setState(691);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				match(OPPONENT);
				setState(693);
				match(CONCEDED);
				setState(694);
				match(DOT);
				setState(695);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(696);
				match(WINS);
				setState(697);
				match(DOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(698);
				match(OPPONENT);
				setState(699);
				match(TAKE);
				setState(700);
				match(ALL);
				setState(701);
				match(OF);
				setState(702);
				match(THEIR);
				setState(703);
				match(PRIZE_CARDS);
				setState(704);
				match(DOT);
				setState(705);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(706);
				match(WINS);
				setState(707);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(708);
				match(YOU);
				setState(709);
				match(CONCEDED);
				setState(710);
				match(DOT);
				setState(711);
				_la = _input.LA(1);
				if ( !(_la==OPPONENT || _la==PLAYER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(712);
				match(WINS);
				setState(713);
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
		enterRule(_localctx, 78, RULE_cardList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(BULLET);
			setState(717);
			match(CARD);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(718);
				match(COMMA);
				setState(719);
				match(CARD);
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(725);
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
		"\u0004\u0001k\u02d8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000T\b\u0000\n\u0000\f\u0000W\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000[\b\u0000\n\u0000\f\u0000^\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001e\b\u0001\n\u0001\f\u0001h\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002p\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0097\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00bd\b\b\u0001\b\u0003\b\u00c0\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00d5\b\t\u0001\t\u0003\t\u00d8\b\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e2\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00ec\b\u000b\n\u000b\f\u000b\u00ef\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00f6\b\f\n\f\f\f\u00f9\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00fe\b\r\u0001\r\u0001\r\u0005\r\u0102\b\r\n\r\f\r\u0105\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u011c\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u013a\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0146\b\u0010\u0003\u0010"+
		"\u0148\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0156\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0164\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0172\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0180\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0185\b\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u0189\b"+
		"\u0014\u000b\u0014\f\u0014\u018a\u0001\u0014\u0003\u0014\u018e\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0193\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0199\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01a0\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01a9\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01b1\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01b9\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01c2\b\u0015\u0001\u0015\u0003\u0015"+
		"\u01c5\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01ce\b\u0015\u0001\u0015\u0003\u0015"+
		"\u01d1\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01da\b\u0015\u0001\u0015\u0003\u0015"+
		"\u01dd\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01e6\b\u0015\u0001\u0015\u0003\u0015"+
		"\u01e9\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01f2\b\u0015\u0001\u0015\u0003\u0015"+
		"\u01f5\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01f9\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0215\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u022d\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0232\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u023a\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u026e\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u02cb\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u02d1\b\'\n"+
		"\'\f\'\u02d4\t\'\u0001\'\u0001\'\u0001\'\u0000\u0000(\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLN\u0000\u0005\u0002\u0000HHaa\u0001\u0000\f\r\u0001"+
		"\u0000\u001c\u001d\u0002\u0000bbee\u0002\u0000$$QQ\u030d\u0000P\u0001"+
		"\u0000\u0000\u0000\u0002a\u0001\u0000\u0000\u0000\u0004o\u0001\u0000\u0000"+
		"\u0000\u0006q\u0001\u0000\u0000\u0000\b|\u0001\u0000\u0000\u0000\n\u0084"+
		"\u0001\u0000\u0000\u0000\f\u0096\u0001\u0000\u0000\u0000\u000e\u009b\u0001"+
		"\u0000\u0000\u0000\u0010\u00bc\u0001\u0000\u0000\u0000\u0012\u00d4\u0001"+
		"\u0000\u0000\u0000\u0014\u00d9\u0001\u0000\u0000\u0000\u0016\u00e6\u0001"+
		"\u0000\u0000\u0000\u0018\u00f0\u0001\u0000\u0000\u0000\u001a\u00fa\u0001"+
		"\u0000\u0000\u0000\u001c\u011b\u0001\u0000\u0000\u0000\u001e\u0139\u0001"+
		"\u0000\u0000\u0000 \u013b\u0001\u0000\u0000\u0000\"\u0149\u0001\u0000"+
		"\u0000\u0000$\u0157\u0001\u0000\u0000\u0000&\u0165\u0001\u0000\u0000\u0000"+
		"(\u0181\u0001\u0000\u0000\u0000*\u018f\u0001\u0000\u0000\u0000,\u01fc"+
		"\u0001\u0000\u0000\u0000.\u0214\u0001\u0000\u0000\u00000\u022c\u0001\u0000"+
		"\u0000\u00002\u0239\u0001\u0000\u0000\u00004\u023b\u0001\u0000\u0000\u0000"+
		"6\u0244\u0001\u0000\u0000\u00008\u024e\u0001\u0000\u0000\u0000:\u026d"+
		"\u0001\u0000\u0000\u0000<\u026f\u0001\u0000\u0000\u0000>\u027e\u0001\u0000"+
		"\u0000\u0000@\u0285\u0001\u0000\u0000\u0000B\u028f\u0001\u0000\u0000\u0000"+
		"D\u0293\u0001\u0000\u0000\u0000F\u029a\u0001\u0000\u0000\u0000H\u029e"+
		"\u0001\u0000\u0000\u0000J\u02a8\u0001\u0000\u0000\u0000L\u02ca\u0001\u0000"+
		"\u0000\u0000N\u02cc\u0001\u0000\u0000\u0000PU\u0003\u0002\u0001\u0000"+
		"QR\u0005j\u0000\u0000RT\u0003\u0016\u000b\u0000SQ\u0001\u0000\u0000\u0000"+
		"TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000X\\\u0003L&"+
		"\u0000Y[\u0005j\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\u0000\u0000\u0001`\u0001"+
		"\u0001\u0000\u0000\u0000ab\u0005\n\u0000\u0000bf\u0005j\u0000\u0000ce"+
		"\u0003\u0004\u0002\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0003\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ip\u0003\u0006\u0003\u0000"+
		"jp\u0003\b\u0004\u0000kp\u0003\n\u0005\u0000lp\u0003\u0010\b\u0000mp\u0003"+
		"\u0014\n\u0000np\u0003\f\u0006\u0000oi\u0001\u0000\u0000\u0000oj\u0001"+
		"\u0000\u0000\u0000ok\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000p\u0005\u0001\u0000"+
		"\u0000\u0000qr\u0007\u0000\u0000\u0000rs\u0005\u000b\u0000\u0000st\u0007"+
		"\u0001\u0000\u0000tu\u0005\u000e\u0000\u0000uv\u0005\u000f\u0000\u0000"+
		"vw\u0005\u0010\u0000\u0000wx\u0005\u0011\u0000\u0000xy\u0005\u0012\u0000"+
		"\u0000yz\u0005b\u0000\u0000z{\u0005j\u0000\u0000{\u0007\u0001\u0000\u0000"+
		"\u0000|}\u0007\u0000\u0000\u0000}~\u0005\u0014\u0000\u0000~\u007f\u0005"+
		"\u000f\u0000\u0000\u007f\u0080\u0005\u0011\u0000\u0000\u0080\u0081\u0005"+
		"\u0015\u0000\u0000\u0081\u0082\u0005b\u0000\u0000\u0082\u0083\u0005j\u0000"+
		"\u0000\u0083\t\u0001\u0000\u0000\u0000\u0084\u0085\u0007\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\u0016\u0000\u0000\u0086\u0087\u0005\u0017\u0000\u0000"+
		"\u0087\u0088\u0005\u0018\u0000\u0000\u0088\u0089\u0005\u0019\u0000\u0000"+
		"\u0089\u008a\u0005b\u0000\u0000\u008a\u008b\u0005j\u0000\u0000\u008b\u000b"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0007\u0000\u0000\u0000\u008d\u008e"+
		"\u0005@\u0000\u0000\u008e\u008f\u0005M\u0000\u0000\u008f\u0090\u0005\u0001"+
		"\u0000\u0000\u0090\u0097\u0005b\u0000\u0000\u0091\u0092\u0007\u0000\u0000"+
		"\u0000\u0092\u0093\u0005@\u0000\u0000\u0093\u0094\u0005`\u0000\u0000\u0094"+
		"\u0095\u0005\u0001\u0000\u0000\u0095\u0097\u0005b\u0000\u0000\u0096\u008c"+
		"\u0001\u0000\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005j\u0000\u0000\u0099\u009a\u0003"+
		"\u000e\u0007\u0000\u009a\r\u0001\u0000\u0000\u0000\u009b\u009c\u0005i"+
		"\u0000\u0000\u009c\u009d\u0005\u001c\u0000\u0000\u009d\u009e\u0005\u0005"+
		"\u0000\u0000\u009e\u009f\u0005>\u0000\u0000\u009f\u00a0\u0005\u0001\u0000"+
		"\u0000\u00a0\u00a1\u0005`\u0000\u0000\u00a1\u00a2\u0005j\u0000\u0000\u00a2"+
		"\u00a3\u0003N\'\u0000\u00a3\u000f\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0007\u0000\u0000\u0000\u00a5\u00a6\u0005\u001a\u0000\u0000\u00a6\u00a7"+
		"\u0005`\u0000\u0000\u00a7\u00a8\u0005\u001c\u0000\u0000\u00a8\u00a9\u0005"+
		"\u000e\u0000\u0000\u00a9\u00aa\u0005\u000f\u0000\u0000\u00aa\u00ab\u0005"+
		"\u0010\u0000\u0000\u00ab\u00ac\u0005\"\u0000\u0000\u00ac\u00ad\u0005b"+
		"\u0000\u0000\u00ad\u00bd\u0005j\u0000\u0000\u00ae\u00af\u0007\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005\u001a\u0000\u0000\u00b0\u00b1\u0005`\u0000\u0000"+
		"\u00b1\u00b2\u0005S\u0000\u0000\u00b2\u00b3\u0007\u0002\u0000\u0000\u00b3"+
		"\u00b4\u0005T\u0000\u0000\u00b4\u00b5\u0007\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005@\u0000\u0000\u00b6\u00b7\u0005\u0006\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0007\u0000\u0000\u00b8\u00b9\u0005`\u0000\u0000\u00b9\u00ba\u0005\u0001"+
		"\u0000\u0000\u00ba\u00bb\u0005b\u0000\u0000\u00bb\u00bd\u0005j\u0000\u0000"+
		"\u00bc\u00a4\u0001\u0000\u0000\u0000\u00bc\u00ae\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00c0\u0003\u0012\t\u0000\u00bf"+
		"\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u0011\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005i\u0000\u0000\u00c2\u00c3"+
		"\u0005`\u0000\u0000\u00c3\u00c4\u0005\u001b\u0000\u0000\u00c4\u00c5\u0005"+
		"\u001c\u0000\u0000\u00c5\u00c6\u0005b\u0000\u0000\u00c6\u00d5\u0005j\u0000"+
		"\u0000\u00c7\u00c8\u0005i\u0000\u0000\u00c8\u00c9\u0007\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005\u001a\u0000\u0000\u00ca\u00cb\u0005`\u0000\u0000\u00cb"+
		"\u00cc\u0005\u001c\u0000\u0000\u00cc\u00cd\u0005b\u0000\u0000\u00cd\u00d5"+
		"\u0005j\u0000\u0000\u00ce\u00cf\u0005i\u0000\u0000\u00cf\u00d0\u0007\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005\u001a\u0000\u0000\u00d1\u00d2\u0005[\u0000"+
		"\u0000\u00d2\u00d3\u0005b\u0000\u0000\u00d3\u00d5\u0005j\u0000\u0000\u00d4"+
		"\u00c1\u0001\u0000\u0000\u0000\u00d4\u00c7\u0001\u0000\u0000\u0000\u00d4"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d8\u0003N\'\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u0013\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0007\u0000\u0000\u0000\u00da\u00db\u0005#\u0000\u0000\u00db\u00dc\u0005"+
		"[\u0000\u0000\u00dc\u00dd\u0005\u0017\u0000\u0000\u00dd\u00e1\u0005\u000f"+
		"\u0000\u0000\u00de\u00df\u00052\u0000\u0000\u00df\u00e2\u00054\u0000\u0000"+
		"\u00e0\u00e2\u00055\u0000\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0005b\u0000\u0000\u00e4\u00e5\u0005j\u0000\u0000\u00e5\u0015\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0007\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"Z\u0000\u0000\u00e8\u00e9\u0005\u0002\u0000\u0000\u00e9\u00ed\u0005j\u0000"+
		"\u0000\u00ea\u00ec\u0003\u0018\f\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u0017\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003\u001c\u000e\u0000"+
		"\u00f1\u00f2\u0007\u0003\u0000\u0000\u00f2\u00f7\u0005j\u0000\u0000\u00f3"+
		"\u00f6\u0003\u001a\r\u0000\u00f4\u00f6\u0003(\u0014\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f8\u0019\u0001\u0000\u0000\u0000\u00f9\u00f7"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005i\u0000\u0000\u00fb\u00fd\u0003"+
		"\u001c\u000e\u0000\u00fc\u00fe\u0005b\u0000\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0103\u0005j\u0000\u0000\u0100\u0102\u0003N\'\u0000"+
		"\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u001b\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0106\u011c\u0003\u001e\u000f\u0000\u0107\u011c\u0003 \u0010\u0000\u0108"+
		"\u011c\u0003\"\u0011\u0000\u0109\u011c\u0003$\u0012\u0000\u010a\u011c"+
		"\u0003&\u0013\u0000\u010b\u011c\u0003,\u0016\u0000\u010c\u011c\u0003."+
		"\u0017\u0000\u010d\u011c\u0003:\u001d\u0000\u010e\u011c\u00030\u0018\u0000"+
		"\u010f\u011c\u00032\u0019\u0000\u0110\u011c\u00034\u001a\u0000\u0111\u011c"+
		"\u00036\u001b\u0000\u0112\u011c\u0003<\u001e\u0000\u0113\u011c\u00038"+
		"\u001c\u0000\u0114\u011c\u0003>\u001f\u0000\u0115\u011c\u0003@ \u0000"+
		"\u0116\u011c\u0003B!\u0000\u0117\u011c\u0003D\"\u0000\u0118\u011c\u0003"+
		"F#\u0000\u0119\u011c\u0003H$\u0000\u011a\u011c\u0003J%\u0000\u011b\u0106"+
		"\u0001\u0000\u0000\u0000\u011b\u0107\u0001\u0000\u0000\u0000\u011b\u0108"+
		"\u0001\u0000\u0000\u0000\u011b\u0109\u0001\u0000\u0000\u0000\u011b\u010a"+
		"\u0001\u0000\u0000\u0000\u011b\u010b\u0001\u0000\u0000\u0000\u011b\u010c"+
		"\u0001\u0000\u0000\u0000\u011b\u010d\u0001\u0000\u0000\u0000\u011b\u010e"+
		"\u0001\u0000\u0000\u0000\u011b\u010f\u0001\u0000\u0000\u0000\u011b\u0110"+
		"\u0001\u0000\u0000\u0000\u011b\u0111\u0001\u0000\u0000\u0000\u011b\u0112"+
		"\u0001\u0000\u0000\u0000\u011b\u0113\u0001\u0000\u0000\u0000\u011b\u0114"+
		"\u0001\u0000\u0000\u0000\u011b\u0115\u0001\u0000\u0000\u0000\u011b\u0116"+
		"\u0001\u0000\u0000\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011b\u0118"+
		"\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u001d\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0007\u0000\u0000\u0000\u011e\u011f\u0005\u001a\u0000\u0000\u011f\u013a"+
		"\u0005\u001d\u0000\u0000\u0120\u0121\u0007\u0000\u0000\u0000\u0121\u0122"+
		"\u0005\u001a\u0000\u0000\u0122\u0123\u0005M\u0000\u0000\u0123\u013a\u0005"+
		"\u001d\u0000\u0000\u0124\u0125\u0007\u0000\u0000\u0000\u0125\u0126\u0005"+
		"\u001a\u0000\u0000\u0126\u013a\u0005[\u0000\u0000\u0127\u0128\u0007\u0000"+
		"\u0000\u0000\u0128\u0129\u0005\u001a\u0000\u0000\u0129\u012a\u0005`\u0000"+
		"\u0000\u012a\u013a\u0005[\u0000\u0000\u012b\u012c\u0007\u0000\u0000\u0000"+
		"\u012c\u012d\u0005\u001a\u0000\u0000\u012d\u012e\u0005`\u0000\u0000\u012e"+
		"\u013a\u0005\u001c\u0000\u0000\u012f\u0130\u0007\u0000\u0000\u0000\u0130"+
		"\u0131\u0005\u001a\u0000\u0000\u0131\u0132\u0005`\u0000\u0000\u0132\u0133"+
		"\u0005\u001c\u0000\u0000\u0133\u0134\u0005N\u0000\u0000\u0134\u0135\u0005"+
		"#\u0000\u0000\u0135\u0136\u0005O\u0000\u0000\u0136\u0137\u0005\u0017\u0000"+
		"\u0000\u0137\u0138\u0005\u000f\u0000\u0000\u0138\u013a\u00055\u0000\u0000"+
		"\u0139\u011d\u0001\u0000\u0000\u0000\u0139\u0120\u0001\u0000\u0000\u0000"+
		"\u0139\u0124\u0001\u0000\u0000\u0000\u0139\u0127\u0001\u0000\u0000\u0000"+
		"\u0139\u012b\u0001\u0000\u0000\u0000\u0139\u012f\u0001\u0000\u0000\u0000"+
		"\u013a\u001f\u0001\u0000\u0000\u0000\u013b\u013c\u0007\u0000\u0000\u0000"+
		"\u013c\u013d\u0005#\u0000\u0000\u013d\u0147\u0005[\u0000\u0000\u013e\u013f"+
		"\u0005\u0017\u0000\u0000\u013f\u0145\u0005\u000f\u0000\u0000\u0140\u0146"+
		"\u00055\u0000\u0000\u0141\u0142\u00052\u0000\u0000\u0142\u0146\u00054"+
		"\u0000\u0000\u0143\u0144\u00056\u0000\u0000\u0144\u0146\u00054\u0000\u0000"+
		"\u0145\u0140\u0001\u0000\u0000\u0000\u0145\u0141\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000"+
		"\u0147\u013e\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000"+
		"\u0148!\u0001\u0000\u0000\u0000\u0149\u014a\u0007\u0000\u0000\u0000\u014a"+
		"\u014b\u0005$\u0000\u0000\u014b\u014c\u0005[\u0000\u0000\u014c\u014d\u0005"+
		"\u0017\u0000\u0000\u014d\u0155\u0005[\u0000\u0000\u014e\u014f\u0005(\u0000"+
		"\u0000\u014f\u0150\u0005\u000f\u0000\u0000\u0150\u0156\u00055\u0000\u0000"+
		"\u0151\u0152\u0005)\u0000\u0000\u0152\u0153\u0005\u000f\u0000\u0000\u0153"+
		"\u0154\u00052\u0000\u0000\u0154\u0156\u00054\u0000\u0000\u0155\u014e\u0001"+
		"\u0000\u0000\u0000\u0155\u0151\u0001\u0000\u0000\u0000\u0156#\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0007\u0000\u0000\u0000\u0158\u0159\u0005%\u0000"+
		"\u0000\u0159\u015a\u0005[\u0000\u0000\u015a\u015b\u0005\u0017\u0000\u0000"+
		"\u015b\u0163\u0005[\u0000\u0000\u015c\u015d\u0005(\u0000\u0000\u015d\u015e"+
		"\u0005\u000f\u0000\u0000\u015e\u0164\u00055\u0000\u0000\u015f\u0160\u0005"+
		")\u0000\u0000\u0160\u0161\u0005\u000f\u0000\u0000\u0161\u0162\u00052\u0000"+
		"\u0000\u0162\u0164\u00054\u0000\u0000\u0163\u015c\u0001\u0000\u0000\u0000"+
		"\u0163\u015f\u0001\u0000\u0000\u0000\u0164%\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0007\u0000\u0000\u0000\u0166\u0167\u0005Z\u0000\u0000\u0167\u0168"+
		"\u0005[\u0000\u0000\u0168\u0169\u0005&\u0000\u0000\u0169\u0171\u0005\\"+
		"\u0000\u0000\u016a\u016b\u0005(\u0000\u0000\u016b\u016c\u0007\u0000\u0000"+
		"\u0000\u016c\u016d\u0005Z\u0000\u0000\u016d\u016e\u0005[\u0000\u0000\u016e"+
		"\u016f\u0005\u000e\u0000\u0000\u016f\u0170\u0005`\u0000\u0000\u0170\u0172"+
		"\u00057\u0000\u0000\u0171\u016a\u0001\u0000\u0000\u0000\u0171\u0172\u0001"+
		"\u0000\u0000\u0000\u0172\u017f\u0001\u0000\u0000\u0000\u0173\u0174\u0005"+
		"b\u0000\u0000\u0174\u0175\u0007\u0000\u0000\u0000\u0175\u0176\u0005Z\u0000"+
		"\u0000\u0176\u0177\u0005[\u0000\u0000\u0177\u0178\u0005@\u0000\u0000\u0178"+
		"\u0179\u0005`\u0000\u0000\u0179\u017a\u0005S\u0000\u0000\u017a\u017b\u0005"+
		"7\u0000\u0000\u017b\u017c\u0005T\u0000\u0000\u017c\u017d\u0005\'\u0000"+
		"\u0000\u017d\u017e\u0005_\u0000\u0000\u017e\u0180\u0005U\u0000\u0000\u017f"+
		"\u0173\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180"+
		"\'\u0001\u0000\u0000\u0000\u0181\u0182\u0005i\u0000\u0000\u0182\u0184"+
		"\u0005V\u0000\u0000\u0183\u0185\u0005d\u0000\u0000\u0184\u0183\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000"+
		"\u0000\u0000\u0186\u0188\u0005j\u0000\u0000\u0187\u0189\u0003*\u0015\u0000"+
		"\u0188\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u018e\u0005j\u0000\u0000\u018d"+
		"\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e"+
		")\u0001\u0000\u0000\u0000\u018f\u01f8\u0005h\u0000\u0000\u0190\u0192\u0005"+
		"W\u0000\u0000\u0191\u0193\u0005d\u0000\u0000\u0192\u0191\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0005`\u0000\u0000\u0195\u01f9\u00057\u0000\u0000\u0196"+
		"\u0198\u0005X\u0000\u0000\u0197\u0199\u0005d\u0000\u0000\u0198\u0197\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0005`\u0000\u0000\u019b\u01f9\u00057\u0000"+
		"\u0000\u019c\u019d\u0005`\u0000\u0000\u019d\u019f\u0005\u0003\u0000\u0000"+
		"\u019e\u01a0\u0005d\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0005`\u0000\u0000\u01a2\u01f9\u00057\u0000\u0000\u01a3\u01a4\u0005"+
		"f\u0000\u0000\u01a4\u01a5\u0005Y\u0000\u0000\u01a5\u01a6\u0005g\u0000"+
		"\u0000\u01a6\u01a8\u0005[\u0000\u0000\u01a7\u01a9\u0005d\u0000\u0000\u01a8"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005`\u0000\u0000\u01ab\u01f9"+
		"\u00057\u0000\u0000\u01ac\u01ad\u0005`\u0000\u0000\u01ad\u01ae\u0007\u0004"+
		"\u0000\u0000\u01ae\u01b0\u0005P\u0000\u0000\u01af\u01b1\u0005d\u0000\u0000"+
		"\u01b0\u01af\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005`\u0000\u0000\u01b3"+
		"\u01f9\u00057\u0000\u0000\u01b4\u01b5\u0005U\u0000\u0000\u01b5\u01b6\u0005"+
		"\u0017\u0000\u0000\u01b6\u01b8\u0005_\u0000\u0000\u01b7\u01b9\u0005d\u0000"+
		"\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005`\u0000\u0000"+
		"\u01bb\u01f9\u00057\u0000\u0000\u01bc\u01bd\u0005f\u0000\u0000\u01bd\u01be"+
		"\u0005\u001e\u0000\u0000\u01be\u01bf\u0005g\u0000\u0000\u01bf\u01c1\u0005"+
		"]\u0000\u0000\u01c0\u01c2\u0005d\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c5\u0005i\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0005`\u0000\u0000\u01c7\u01f9\u00057\u0000\u0000\u01c8\u01c9"+
		"\u0005f\u0000\u0000\u01c9\u01ca\u0005\u001f\u0000\u0000\u01ca\u01cb\u0005"+
		"g\u0000\u0000\u01cb\u01cd\u0005[\u0000\u0000\u01cc\u01ce\u0005d\u0000"+
		"\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000"+
		"\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01d1\u0005i\u0000\u0000"+
		"\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005`\u0000\u0000\u01d3"+
		"\u01f9\u00057\u0000\u0000\u01d4\u01d5\u0005f\u0000\u0000\u01d5\u01d6\u0005"+
		"\u001e\u0000\u0000\u01d6\u01d7\u0005g\u0000\u0000\u01d7\u01d9\u0005]\u0000"+
		"\u0000\u01d8\u01da\u0005d\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001\u0000\u0000\u0000"+
		"\u01db\u01dd\u0005i\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc"+
		"\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de"+
		"\u01df\u0005`\u0000\u0000\u01df\u01f9\u00057\u0000\u0000\u01e0\u01e1\u0005"+
		"f\u0000\u0000\u01e1\u01e2\u0005!\u0000\u0000\u01e2\u01e3\u0005g\u0000"+
		"\u0000\u01e3\u01e5\u0005[\u0000\u0000\u01e4\u01e6\u0005d\u0000\u0000\u01e5"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e7\u01e9\u0005i\u0000\u0000\u01e8\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005`\u0000\u0000\u01eb\u01f9\u0005"+
		"7\u0000\u0000\u01ec\u01ed\u0005f\u0000\u0000\u01ed\u01ee\u0005 \u0000"+
		"\u0000\u01ee\u01ef\u0005g\u0000\u0000\u01ef\u01f1\u0005\\\u0000\u0000"+
		"\u01f0\u01f2\u0005d\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f5\u0005i\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0005`\u0000\u0000\u01f7\u01f9\u00057\u0000\u0000\u01f8\u0190\u0001\u0000"+
		"\u0000\u0000\u01f8\u0196\u0001\u0000\u0000\u0000\u01f8\u019c\u0001\u0000"+
		"\u0000\u0000\u01f8\u01a3\u0001\u0000\u0000\u0000\u01f8\u01ac\u0001\u0000"+
		"\u0000\u0000\u01f8\u01b4\u0001\u0000\u0000\u0000\u01f8\u01bc\u0001\u0000"+
		"\u0000\u0000\u01f8\u01c8\u0001\u0000\u0000\u0000\u01f8\u01d4\u0001\u0000"+
		"\u0000\u0000\u01f8\u01e0\u0001\u0000\u0000\u0000\u01f8\u01ec\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005j\u0000"+
		"\u0000\u01fb+\u0001\u0000\u0000\u0000\u01fc\u01fd\u0007\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0005F\u0000\u0000\u01fe\u01ff\u0005[\u0000\u0000\u01ff\u0200"+
		"\u0005\u0017\u0000\u0000\u0200\u0201\u0005\u000f\u0000\u0000\u0201\u0202"+
		"\u00055\u0000\u0000\u0202-\u0001\u0000\u0000\u0000\u0203\u0204\u0007\u0000"+
		"\u0000\u0000\u0204\u0205\u0005:\u0000\u0000\u0205\u0206\u0005=\u0000\u0000"+
		"\u0206\u0215\u0005;\u0000\u0000\u0207\u0208\u0007\u0000\u0000\u0000\u0208"+
		"\u0209\u0005:\u0000\u0000\u0209\u020a\u0005`\u0000\u0000\u020a\u020b\u0005"+
		"\u001c\u0000\u0000\u020b\u020c\u0005<\u0000\u0000\u020c\u020d\u0005=\u0000"+
		"\u0000\u020d\u0215\u0005;\u0000\u0000\u020e\u020f\u0007\u0000\u0000\u0000"+
		"\u020f\u0210\u0005:\u0000\u0000\u0210\u0211\u0005[\u0000\u0000\u0211\u0212"+
		"\u0005<\u0000\u0000\u0212\u0213\u0005=\u0000\u0000\u0213\u0215\u0005;"+
		"\u0000\u0000\u0214\u0203\u0001\u0000\u0000\u0000\u0214\u0207\u0001\u0000"+
		"\u0000\u0000\u0214\u020e\u0001\u0000\u0000\u0000\u0215/\u0001\u0000\u0000"+
		"\u0000\u0216\u0217\u0007\u0000\u0000\u0000\u0217\u0218\u00058\u0000\u0000"+
		"\u0218\u022d\u0005[\u0000\u0000\u0219\u021a\u0007\u0000\u0000\u0000\u021a"+
		"\u021b\u00058\u0000\u0000\u021b\u021c\u0005`\u0000\u0000\u021c\u022d\u0005"+
		"\u001c\u0000\u0000\u021d\u021e\u0005`\u0000\u0000\u021e\u021f\u0005\u001c"+
		"\u0000\u0000\u021f\u0220\u0005-\u0000\u0000\u0220\u0221\u00058\u0000\u0000"+
		"\u0221\u0222\u0005>\u0000\u0000\u0222\u0223\u0007\u0000\u0000\u0000\u0223"+
		"\u0224\u0005Z\u0000\u0000\u0224\u022d\u0005[\u0000\u0000\u0225\u0226\u0005"+
		"[\u0000\u0000\u0226\u0227\u0005,\u0000\u0000\u0227\u0228\u00058\u0000"+
		"\u0000\u0228\u0229\u0005>\u0000\u0000\u0229\u022a\u0007\u0000\u0000\u0000"+
		"\u022a\u022b\u0005Z\u0000\u0000\u022b\u022d\u0005[\u0000\u0000\u022c\u0216"+
		"\u0001\u0000\u0000\u0000\u022c\u0219\u0001\u0000\u0000\u0000\u022c\u021d"+
		"\u0001\u0000\u0000\u0000\u022c\u0225\u0001\u0000\u0000\u0000\u022d1\u0001"+
		"\u0000\u0000\u0000\u022e\u022f\u0007\u0000\u0000\u0000\u022f\u0231\u0005"+
		"@\u0000\u0000\u0230\u0232\u0005M\u0000\u0000\u0231\u0230\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0005A\u0000\u0000\u0234\u023a\u0005\u001d\u0000\u0000"+
		"\u0235\u0236\u0007\u0000\u0000\u0000\u0236\u0237\u0005@\u0000\u0000\u0237"+
		"\u0238\u0005`\u0000\u0000\u0238\u023a\u0005B\u0000\u0000\u0239\u022e\u0001"+
		"\u0000\u0000\u0000\u0239\u0235\u0001\u0000\u0000\u0000\u023a3\u0001\u0000"+
		"\u0000\u0000\u023b\u023c\u0007\u0000\u0000\u0000\u023c\u023d\u0005?\u0000"+
		"\u0000\u023d\u023e\u0007\u0000\u0000\u0000\u023e\u023f\u0005Z\u0000\u0000"+
		"\u023f\u0240\u0005[\u0000\u0000\u0240\u0241\u0005\u0017\u0000\u0000\u0241"+
		"\u0242\u0005=\u0000\u0000\u0242\u0243\u0005\"\u0000\u0000\u02435\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0007\u0000\u0000\u0000\u0245\u0246\u0005"+
		"Z\u0000\u0000\u0246\u0247\u0005[\u0000\u0000\u0247\u0248\u0005.\u0000"+
		"\u0000\u0248\u0249\u0005/\u0000\u0000\u0249\u024a\u0005)\u0000\u0000\u024a"+
		"\u024b\u0005\u000f\u0000\u0000\u024b\u024c\u00052\u0000\u0000\u024c\u024d"+
		"\u00054\u0000\u0000\u024d7\u0001\u0000\u0000\u0000\u024e\u024f\u0007\u0000"+
		"\u0000\u0000\u024f\u0250\u0005Z\u0000\u0000\u0250\u0251\u0005[\u0000\u0000"+
		"\u0251\u0252\u0005,\u0000\u0000\u0252\u0253\u0005C\u0000\u0000\u0253\u0254"+
		"\u0005D\u0000\u0000\u02549\u0001\u0000\u0000\u0000\u0255\u0256\u0005M"+
		"\u0000\u0000\u0256\u0257\u0005\u001d\u0000\u0000\u0257\u0258\u0005,\u0000"+
		"\u0000\u0258\u0259\u0005\u0004\u0000\u0000\u0259\u025a\u0005\u0017\u0000"+
		"\u0000\u025a\u025b\u0007\u0000\u0000\u0000\u025b\u025c\u0005Z\u0000\u0000"+
		"\u025c\u026e\u0005\"\u0000\u0000\u025d\u025e\u0005[\u0000\u0000\u025e"+
		"\u025f\u0005,\u0000\u0000\u025f\u0260\u0005\u0004\u0000\u0000\u0260\u0261"+
		"\u0005\u0017\u0000\u0000\u0261\u0262\u0007\u0000\u0000\u0000\u0262\u0263"+
		"\u0005Z\u0000\u0000\u0263\u026e\u0005\"\u0000\u0000\u0264\u0265\u0007"+
		"\u0000\u0000\u0000\u0265\u0266\u0005?\u0000\u0000\u0266\u0267\u0007\u0000"+
		"\u0000\u0000\u0267\u0268\u0005Z\u0000\u0000\u0268\u0269\u0005`\u0000\u0000"+
		"\u0269\u026a\u0005\u001c\u0000\u0000\u026a\u026b\u0005\u0017\u0000\u0000"+
		"\u026b\u026c\u0005=\u0000\u0000\u026c\u026e\u0005\"\u0000\u0000\u026d"+
		"\u0255\u0001\u0000\u0000\u0000\u026d\u025d\u0001\u0000\u0000\u0000\u026d"+
		"\u0264\u0001\u0000\u0000\u0000\u026e;\u0001\u0000\u0000\u0000\u026f\u0270"+
		"\u0007\u0000\u0000\u0000\u0270\u0271\u0005Z\u0000\u0000\u0271\u0272\u0005"+
		"[\u0000\u0000\u0272\u0273\u0005,\u0000\u0000\u0273\u0274\u0005E\u0000"+
		"\u0000\u0274\u0275\u0005+\u0000\u0000\u0275\u0276\u0007\u0000\u0000\u0000"+
		"\u0276\u0277\u0005Z\u0000\u0000\u0277\u0278\u0005[\u0000\u0000\u0278\u0279"+
		"\u0005\u0017\u0000\u0000\u0279\u027a\u00050\u0000\u0000\u027a\u027b\u0005"+
		"\u000f\u0000\u0000\u027b\u027c\u00052\u0000\u0000\u027c\u027d\u0005\u0003"+
		"\u0000\u0000\u027d=\u0001\u0000\u0000\u0000\u027e\u027f\u0007\u0000\u0000"+
		"\u0000\u027f\u0280\u0005Z\u0000\u0000\u0280\u0281\u0005[\u0000\u0000\u0281"+
		"\u0282\u0005@\u0000\u0000\u0282\u0283\u0005`\u0000\u0000\u0283\u0284\u0005"+
		"7\u0000\u0000\u0284?\u0001\u0000\u0000\u0000\u0285\u0286\u0007\u0000\u0000"+
		"\u0000\u0286\u0287\u0005\u0013\u0000\u0000\u0287\u0288\u0005M\u0000\u0000"+
		"\u0288\u0289\u0005\u0011\u0000\u0000\u0289\u028a\u0005N\u0000\u0000\u028a"+
		"\u028b\u0005*\u0000\u0000\u028b\u028c\u00051\u0000\u0000\u028c\u028d\u0005"+
		"(\u0000\u0000\u028d\u028e\u0007\u0001\u0000\u0000\u028eA\u0001\u0000\u0000"+
		"\u0000\u028f\u0290\u0007\u0000\u0000\u0000\u0290\u0291\u0005\u000b\u0000"+
		"\u0000\u0291\u0292\u0005\\\u0000\u0000\u0292C\u0001\u0000\u0000\u0000"+
		"\u0293\u0294\u0007\u0000\u0000\u0000\u0294\u0295\u0005Z\u0000\u0000\u0295"+
		"\u0296\u0005[\u0000\u0000\u0296\u0297\u0005.\u0000\u0000\u0297\u0298\u0005"+
		"/\u0000\u0000\u0298\u0299\u0005^\u0000\u0000\u0299E\u0001\u0000\u0000"+
		"\u0000\u029a\u029b\u0005[\u0000\u0000\u029b\u029c\u0005,\u0000\u0000\u029c"+
		"\u029d\u00053\u0000\u0000\u029dG\u0001\u0000\u0000\u0000\u029e\u029f\u0007"+
		"\u0000\u0000\u0000\u029f\u02a0\u0005\b\u0000\u0000\u02a0\u02a1\u0005`"+
		"\u0000\u0000\u02a1\u02a2\u00057\u0000\u0000\u02a2\u02a3\u0005\t\u0000"+
		"\u0000\u02a3\u02a4\u0005(\u0000\u0000\u02a4\u02a5\u0007\u0000\u0000\u0000"+
		"\u02a5\u02a6\u0005Z\u0000\u0000\u02a6\u02a7\u0005[\u0000\u0000\u02a7I"+
		"\u0001\u0000\u0000\u0000\u02a8\u02a9\u0007\u0000\u0000\u0000\u02a9\u02aa"+
		"\u0005G\u0000\u0000\u02aa\u02ab\u0005=\u0000\u0000\u02ab\u02ac\u0005\u0002"+
		"\u0000\u0000\u02acK\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005K\u0000\u0000"+
		"\u02ae\u02af\u0005B\u0000\u0000\u02af\u02b0\u0005L\u0000\u0000\u02b0\u02b1"+
		"\u0005b\u0000\u0000\u02b1\u02b2\u0007\u0000\u0000\u0000\u02b2\u02b3\u0005"+
		"J\u0000\u0000\u02b3\u02cb\u0005b\u0000\u0000\u02b4\u02b5\u0005H\u0000"+
		"\u0000\u02b5\u02b6\u0005I\u0000\u0000\u02b6\u02b7\u0005b\u0000\u0000\u02b7"+
		"\u02b8\u0007\u0000\u0000\u0000\u02b8\u02b9\u0005J\u0000\u0000\u02b9\u02cb"+
		"\u0005b\u0000\u0000\u02ba\u02bb\u0005H\u0000\u0000\u02bb\u02bc\u0005@"+
		"\u0000\u0000\u02bc\u02bd\u0005K\u0000\u0000\u02bd\u02be\u0005\'\u0000"+
		"\u0000\u02be\u02bf\u0005=\u0000\u0000\u02bf\u02c0\u0005B\u0000\u0000\u02c0"+
		"\u02c1\u0005b\u0000\u0000\u02c1\u02c2\u0007\u0000\u0000\u0000\u02c2\u02c3"+
		"\u0005J\u0000\u0000\u02c3\u02cb\u0005b\u0000\u0000\u02c4\u02c5\u0005R"+
		"\u0000\u0000\u02c5\u02c6\u0005I\u0000\u0000\u02c6\u02c7\u0005b\u0000\u0000"+
		"\u02c7\u02c8\u0007\u0000\u0000\u0000\u02c8\u02c9\u0005J\u0000\u0000\u02c9"+
		"\u02cb\u0005b\u0000\u0000\u02ca\u02ad\u0001\u0000\u0000\u0000\u02ca\u02b4"+
		"\u0001\u0000\u0000\u0000\u02ca\u02ba\u0001\u0000\u0000\u0000\u02ca\u02c4"+
		"\u0001\u0000\u0000\u0000\u02cbM\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005"+
		"h\u0000\u0000\u02cd\u02d2\u0005[\u0000\u0000\u02ce\u02cf\u0005c\u0000"+
		"\u0000\u02cf\u02d1\u0005[\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000"+
		"\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005j\u0000\u0000\u02d6"+
		"O\u0001\u0000\u0000\u00002U\\fo\u0096\u00bc\u00bf\u00d4\u00d7\u00e1\u00ed"+
		"\u00f5\u00f7\u00fd\u0103\u011b\u0139\u0145\u0147\u0155\u0163\u0171\u017f"+
		"\u0184\u018a\u018d\u0192\u0198\u019f\u01a8\u01b0\u01b8\u01c1\u01c4\u01cd"+
		"\u01d0\u01d9\u01dc\u01e5\u01e8\u01f1\u01f4\u01f8\u0214\u022c\u0231\u0239"+
		"\u026d\u02ca\u02d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}