// Generated from e:/School stuff/Universidad/3er Año/1er Cuatrimestre/Procesadores del Lenguaje/COMPILADORES-LAB/PL1/PokemonTCG/Grammar/gTCGParser.g4 by ANTLR 4.13.1
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
		BENCH=1, ACTIVESPOT=2, DREW_ACTION=3, START_TURN=4, END_TURN=5, TEXT=6, 
		INT=7, ENDLINE=8, OPEN_PARENTH=9, CLOSE_PARENTH=10, UNDERSCORE=11, DASH=12, 
		COMMA=13, BULLET_POINT=14, INTRO=15, WS=16;
	public static final int
		RULE_log_line = 0, RULE_log_info = 1, RULE_text_info = 2, RULE_start_turn = 3, 
		RULE_end_turn = 4, RULE_play_card = 5, RULE_bench_action = 6, RULE_active_spot_action = 7, 
		RULE_draw_card_action = 8, RULE_mult_card_draw = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"log_line", "log_info", "text_info", "start_turn", "end_turn", "play_card", 
			"bench_action", "active_spot_action", "draw_card_action", "mult_card_draw"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Bench'", "'Active Spot'", "'drew'", "'Turn'", "'ended their turn.'", 
			null, null, "'.'", "'('", "')'", "'_'", "'-'", "','", "'\\u2022'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BENCH", "ACTIVESPOT", "DREW_ACTION", "START_TURN", "END_TURN", 
			"TEXT", "INT", "ENDLINE", "OPEN_PARENTH", "CLOSE_PARENTH", "UNDERSCORE", 
			"DASH", "COMMA", "BULLET_POINT", "INTRO", "WS"
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
	public static class Log_lineContext extends ParserRuleContext {
		public List<Log_infoContext> log_info() {
			return getRuleContexts(Log_infoContext.class);
		}
		public Log_infoContext log_info(int i) {
			return getRuleContext(Log_infoContext.class,i);
		}
		public List<TerminalNode> INTRO() { return getTokens(gTCGParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(gTCGParser.INTRO, i);
		}
		public Log_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_line; }
	}

	public final Log_lineContext log_line() throws RecognitionException {
		Log_lineContext _localctx = new Log_lineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_log_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53440L) != 0)) {
				{
				setState(22);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT:
				case INT:
				case DASH:
				case BULLET_POINT:
					{
					setState(20);
					log_info();
					}
					break;
				case INTRO:
					{
					setState(21);
					match(INTRO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26);
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
	public static class Log_infoContext extends ParserRuleContext {
		public Play_cardContext play_card() {
			return getRuleContext(Play_cardContext.class,0);
		}
		public Text_infoContext text_info() {
			return getRuleContext(Text_infoContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(gTCGParser.ENDLINE, 0); }
		public TerminalNode INTRO() { return getToken(gTCGParser.INTRO, 0); }
		public Start_turnContext start_turn() {
			return getRuleContext(Start_turnContext.class,0);
		}
		public End_turnContext end_turn() {
			return getRuleContext(End_turnContext.class,0);
		}
		public Draw_card_actionContext draw_card_action() {
			return getRuleContext(Draw_card_actionContext.class,0);
		}
		public Mult_card_drawContext mult_card_draw() {
			return getRuleContext(Mult_card_drawContext.class,0);
		}
		public Log_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_info; }
	}

	public final Log_infoContext log_info() throws RecognitionException {
		Log_infoContext _localctx = new Log_infoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_log_info);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				play_card();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(28);
				text_info();
				setState(29);
				match(ENDLINE);
				setState(30);
				match(INTRO);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(32);
				text_info();
				setState(33);
				match(INTRO);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				start_turn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				end_turn();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				draw_card_action();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(38);
				mult_card_draw();
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
	public static class Text_infoContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(gTCGParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(gTCGParser.TEXT, i);
		}
		public List<TerminalNode> INT() { return getTokens(gTCGParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(gTCGParser.INT, i);
		}
		public Text_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_info; }
	}

	public final Text_infoContext text_info() throws RecognitionException {
		Text_infoContext _localctx = new Text_infoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==INT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Start_turnContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gTCGParser.TEXT, 0); }
		public TerminalNode START_TURN() { return getToken(gTCGParser.START_TURN, 0); }
		public Start_turnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_turn; }
	}

	public final Start_turnContext start_turn() throws RecognitionException {
		Start_turnContext _localctx = new Start_turnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_start_turn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(TEXT);
			setState(47);
			match(START_TURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class End_turnContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gTCGParser.TEXT, 0); }
		public TerminalNode END_TURN() { return getToken(gTCGParser.END_TURN, 0); }
		public End_turnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_turn; }
	}

	public final End_turnContext end_turn() throws RecognitionException {
		End_turnContext _localctx = new End_turnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_end_turn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(TEXT);
			setState(50);
			match(END_TURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Play_cardContext extends ParserRuleContext {
		public Bench_actionContext bench_action() {
			return getRuleContext(Bench_actionContext.class,0);
		}
		public Active_spot_actionContext active_spot_action() {
			return getRuleContext(Active_spot_actionContext.class,0);
		}
		public Play_cardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play_card; }
	}

	public final Play_cardContext play_card() throws RecognitionException {
		Play_cardContext _localctx = new Play_cardContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_play_card);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				bench_action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				active_spot_action();
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
	public static class Bench_actionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gTCGParser.TEXT, 0); }
		public TerminalNode BENCH() { return getToken(gTCGParser.BENCH, 0); }
		public TerminalNode ENDLINE() { return getToken(gTCGParser.ENDLINE, 0); }
		public TerminalNode INTRO() { return getToken(gTCGParser.INTRO, 0); }
		public Bench_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bench_action; }
	}

	public final Bench_actionContext bench_action() throws RecognitionException {
		Bench_actionContext _localctx = new Bench_actionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bench_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(TEXT);
			setState(57);
			match(BENCH);
			setState(58);
			match(ENDLINE);
			setState(59);
			match(INTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Active_spot_actionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gTCGParser.TEXT, 0); }
		public TerminalNode ACTIVESPOT() { return getToken(gTCGParser.ACTIVESPOT, 0); }
		public TerminalNode ENDLINE() { return getToken(gTCGParser.ENDLINE, 0); }
		public TerminalNode INTRO() { return getToken(gTCGParser.INTRO, 0); }
		public Active_spot_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_active_spot_action; }
	}

	public final Active_spot_actionContext active_spot_action() throws RecognitionException {
		Active_spot_actionContext _localctx = new Active_spot_actionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_active_spot_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(TEXT);
			setState(62);
			match(ACTIVESPOT);
			setState(63);
			match(ENDLINE);
			setState(64);
			match(INTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Draw_card_actionContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(gTCGParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(gTCGParser.TEXT, i);
		}
		public TerminalNode DREW_ACTION() { return getToken(gTCGParser.DREW_ACTION, 0); }
		public TerminalNode INTRO() { return getToken(gTCGParser.INTRO, 0); }
		public TerminalNode DASH() { return getToken(gTCGParser.DASH, 0); }
		public TerminalNode ENDLINE() { return getToken(gTCGParser.ENDLINE, 0); }
		public Draw_card_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_card_action; }
	}

	public final Draw_card_actionContext draw_card_action() throws RecognitionException {
		Draw_card_actionContext _localctx = new Draw_card_actionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_draw_card_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DASH) {
				{
				setState(66);
				match(DASH);
				}
			}

			setState(69);
			match(TEXT);
			setState(70);
			match(DREW_ACTION);
			setState(71);
			match(TEXT);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENDLINE) {
				{
				setState(72);
				match(ENDLINE);
				}
			}

			setState(75);
			match(INTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mult_card_drawContext extends ParserRuleContext {
		public TerminalNode BULLET_POINT() { return getToken(gTCGParser.BULLET_POINT, 0); }
		public List<TerminalNode> TEXT() { return getTokens(gTCGParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(gTCGParser.TEXT, i);
		}
		public TerminalNode INTRO() { return getToken(gTCGParser.INTRO, 0); }
		public TerminalNode ENDLINE() { return getToken(gTCGParser.ENDLINE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(gTCGParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gTCGParser.COMMA, i);
		}
		public Mult_card_drawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_card_draw; }
	}

	public final Mult_card_drawContext mult_card_draw() throws RecognitionException {
		Mult_card_drawContext _localctx = new Mult_card_drawContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mult_card_draw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(BULLET_POINT);
			setState(78);
			match(TEXT);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(79);
					match(COMMA);
					}
				}

				setState(82);
				match(TEXT);
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==COMMA );
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENDLINE) {
				{
				setState(87);
				match(ENDLINE);
				}
			}

			setState(90);
			match(INTRO);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001\u0010]\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0005\u0000\u0017\b"+
		"\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002"+
		"\u0004\u0002+\b\u0002\u000b\u0002\f\u0002,\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u00057\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0003\bD\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bJ\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0003\tQ\b\t\u0001\t\u0004\tT\b\t\u000b\t\f"+
		"\tU\u0001\t\u0003\tY\b\t\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0001\u0001\u0000\u0006\u0007"+
		"a\u0000\u0018\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000"+
		"\u0004*\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b1\u0001"+
		"\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000\f8\u0001\u0000\u0000\u0000"+
		"\u000e=\u0001\u0000\u0000\u0000\u0010C\u0001\u0000\u0000\u0000\u0012M"+
		"\u0001\u0000\u0000\u0000\u0014\u0017\u0003\u0002\u0001\u0000\u0015\u0017"+
		"\u0005\u000f\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0015"+
		"\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0001"+
		"\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b(\u0003"+
		"\n\u0005\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005\b"+
		"\u0000\u0000\u001e\u001f\u0005\u000f\u0000\u0000\u001f(\u0001\u0000\u0000"+
		"\u0000 !\u0003\u0004\u0002\u0000!\"\u0005\u000f\u0000\u0000\"(\u0001\u0000"+
		"\u0000\u0000#(\u0003\u0006\u0003\u0000$(\u0003\b\u0004\u0000%(\u0003\u0010"+
		"\b\u0000&(\u0003\u0012\t\u0000\'\u001b\u0001\u0000\u0000\u0000\'\u001c"+
		"\u0001\u0000\u0000\u0000\' \u0001\u0000\u0000\u0000\'#\u0001\u0000\u0000"+
		"\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001"+
		"\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)+\u0007\u0000\u0000"+
		"\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000"+
		"./\u0005\u0006\u0000\u0000/0\u0005\u0004\u0000\u00000\u0007\u0001\u0000"+
		"\u0000\u000012\u0005\u0006\u0000\u000023\u0005\u0005\u0000\u00003\t\u0001"+
		"\u0000\u0000\u000047\u0003\f\u0006\u000057\u0003\u000e\u0007\u000064\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u00007\u000b\u0001\u0000\u0000"+
		"\u000089\u0005\u0006\u0000\u00009:\u0005\u0001\u0000\u0000:;\u0005\b\u0000"+
		"\u0000;<\u0005\u000f\u0000\u0000<\r\u0001\u0000\u0000\u0000=>\u0005\u0006"+
		"\u0000\u0000>?\u0005\u0002\u0000\u0000?@\u0005\b\u0000\u0000@A\u0005\u000f"+
		"\u0000\u0000A\u000f\u0001\u0000\u0000\u0000BD\u0005\f\u0000\u0000CB\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u0005\u0006\u0000\u0000FG\u0005\u0003\u0000\u0000GI\u0005\u0006\u0000"+
		"\u0000HJ\u0005\b\u0000\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KL\u0005\u000f\u0000\u0000L\u0011\u0001"+
		"\u0000\u0000\u0000MN\u0005\u000e\u0000\u0000NS\u0005\u0006\u0000\u0000"+
		"OQ\u0005\r\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RT\u0005\u0006\u0000\u0000SP\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VX\u0001\u0000\u0000\u0000WY\u0005\b\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0005"+
		"\u000f\u0000\u0000[\u0013\u0001\u0000\u0000\u0000\n\u0016\u0018\',6CI"+
		"PUX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}