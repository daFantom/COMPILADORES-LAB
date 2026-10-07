// Generated from e:/School stuff/Universidad/3er Año/1er Cuatrimestre/Procesadores del Lenguaje/COMPILADORES-LAB/PL1/PokemonTCG/Grammar/gTCGLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gTCGLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT=1, INT=2, BENCH=3, ACTIVESPOT=4, DREW_ACTION=5, START_TURN=6, END_TURN=7, 
		ENDLINE=8, OPEN_PARENTH=9, CLOSE_PARENTH=10, UNDERSCORE=11, DASH=12, COMMA=13, 
		BULLET_POINT=14, INTRO=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TEXT", "INT", "BENCH", "ACTIVESPOT", "DREW_ACTION", "START_TURN", "END_TURN", 
			"ENDLINE", "OPEN_PARENTH", "CLOSE_PARENTH", "UNDERSCORE", "DASH", "COMMA", 
			"BULLET_POINT", "INTRO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'Bench'", "'Active Spot'", "'drew'", "'Turn'", "'ended their turn.'", 
			"'.'", "'('", "')'", "'_'", "'-'", "','", "'\\u2022'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXT", "INT", "BENCH", "ACTIVESPOT", "DREW_ACTION", "START_TURN", 
			"END_TURN", "ENDLINE", "OPEN_PARENTH", "CLOSE_PARENTH", "UNDERSCORE", 
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


	public gTCGLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gTCGLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010s\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000"+
		"$\u0001\u0001\u0004\u0001(\b\u0001\u000b\u0001\f\u0001)\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0004\u000ei\b\u000e\u000b\u000e\f\u000e"+
		"j\u0001\u000f\u0004\u000fn\b\u000f\u000b\u000f\f\u000fo\u0001\u000f\u0001"+
		"\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0004\u0003"+
		"\u0000\'\'AZaz\u0001\u000009\u0002\u0000\n\n\r\r\u0002\u0000\t\t  v\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001\"\u0001"+
		"\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005+\u0001\u0000"+
		"\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000"+
		"\u000bB\u0001\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000\u000fY\u0001"+
		"\u0000\u0000\u0000\u0011[\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000"+
		"\u0000\u0015_\u0001\u0000\u0000\u0000\u0017a\u0001\u0000\u0000\u0000\u0019"+
		"c\u0001\u0000\u0000\u0000\u001be\u0001\u0000\u0000\u0000\u001dh\u0001"+
		"\u0000\u0000\u0000\u001fm\u0001\u0000\u0000\u0000!#\u0007\u0000\u0000"+
		"\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0002\u0001\u0000\u0000\u0000"+
		"&(\u0007\u0001\u0000\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0004\u0001"+
		"\u0000\u0000\u0000+,\u0005B\u0000\u0000,-\u0005e\u0000\u0000-.\u0005n"+
		"\u0000\u0000./\u0005c\u0000\u0000/0\u0005h\u0000\u00000\u0006\u0001\u0000"+
		"\u0000\u000012\u0005A\u0000\u000023\u0005c\u0000\u000034\u0005t\u0000"+
		"\u000045\u0005i\u0000\u000056\u0005v\u0000\u000067\u0005e\u0000\u0000"+
		"78\u0005 \u0000\u000089\u0005S\u0000\u00009:\u0005p\u0000\u0000:;\u0005"+
		"o\u0000\u0000;<\u0005t\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005"+
		"d\u0000\u0000>?\u0005r\u0000\u0000?@\u0005e\u0000\u0000@A\u0005w\u0000"+
		"\u0000A\n\u0001\u0000\u0000\u0000BC\u0005T\u0000\u0000CD\u0005u\u0000"+
		"\u0000DE\u0005r\u0000\u0000EF\u0005n\u0000\u0000F\f\u0001\u0000\u0000"+
		"\u0000GH\u0005e\u0000\u0000HI\u0005n\u0000\u0000IJ\u0005d\u0000\u0000"+
		"JK\u0005e\u0000\u0000KL\u0005d\u0000\u0000LM\u0005 \u0000\u0000MN\u0005"+
		"t\u0000\u0000NO\u0005h\u0000\u0000OP\u0005e\u0000\u0000PQ\u0005i\u0000"+
		"\u0000QR\u0005r\u0000\u0000RS\u0005 \u0000\u0000ST\u0005t\u0000\u0000"+
		"TU\u0005u\u0000\u0000UV\u0005r\u0000\u0000VW\u0005n\u0000\u0000WX\u0005"+
		".\u0000\u0000X\u000e\u0001\u0000\u0000\u0000YZ\u0005.\u0000\u0000Z\u0010"+
		"\u0001\u0000\u0000\u0000[\\\u0005(\u0000\u0000\\\u0012\u0001\u0000\u0000"+
		"\u0000]^\u0005)\u0000\u0000^\u0014\u0001\u0000\u0000\u0000_`\u0005_\u0000"+
		"\u0000`\u0016\u0001\u0000\u0000\u0000ab\u0005-\u0000\u0000b\u0018\u0001"+
		"\u0000\u0000\u0000cd\u0005,\u0000\u0000d\u001a\u0001\u0000\u0000\u0000"+
		"ef\u0005\u2022\u0000\u0000f\u001c\u0001\u0000\u0000\u0000gi\u0007\u0002"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u001e\u0001\u0000\u0000"+
		"\u0000ln\u0007\u0003\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qr\u0006\u000f\u0000\u0000r \u0001\u0000\u0000\u0000"+
		"\u0005\u0000$)jo\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}