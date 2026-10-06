// Generated from u:/UAH/Year 3/Cuatrimestre 1/Compiladores/COMPILADORES-LAB/PL1/PokemonTCG/Grammar/gTCGParser.g4 by ANTLR 4.13.1
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
		PRUEBA=1, INTRO=2;
	public static final int
		RULE_log_line = 0, RULE_log_info = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"log_line", "log_info"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\r\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRUEBA", "INTRO"
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
			setState(8);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRUEBA || _la==INTRO) {
				{
				setState(6);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRUEBA:
					{
					setState(4);
					log_info();
					}
					break;
				case INTRO:
					{
					setState(5);
					match(INTRO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(10);
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
		public List<TerminalNode> PRUEBA() { return getTokens(gTCGParser.PRUEBA); }
		public TerminalNode PRUEBA(int i) {
			return getToken(gTCGParser.PRUEBA, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(11);
					match(PRUEBA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(14); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001\u0002\u0011\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u0007\b\u0000\n\u0000\f\u0000\n\t"+
		"\u0000\u0001\u0001\u0004\u0001\r\b\u0001\u000b\u0001\f\u0001\u000e\u0001"+
		"\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u0011\u0000\b\u0001\u0000"+
		"\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004\u0007\u0003\u0002\u0001"+
		"\u0000\u0005\u0007\u0005\u0002\u0000\u0000\u0006\u0004\u0001\u0000\u0000"+
		"\u0000\u0006\u0005\u0001\u0000\u0000\u0000\u0007\n\u0001\u0000\u0000\u0000"+
		"\b\u0006\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\u0001\u0001"+
		"\u0000\u0000\u0000\n\b\u0001\u0000\u0000\u0000\u000b\r\u0005\u0001\u0000"+
		"\u0000\f\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000"+
		"\u000e\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f"+
		"\u0003\u0001\u0000\u0000\u0000\u0003\u0006\b\u000e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}