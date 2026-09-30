// Generated from e:/School stuff/Universidad/3er Año/1er Cuatrimestre/Computación Ubicua/Laboratorio/COMPILADORES-LAB/PL1/C-/Grammar/C_minus.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class C_minusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELSE=1, IF=2, INT_VAR=3, RET=4, VOID_TYPE=5, WHILE=6, ID=7, NUM=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ELSE", "IF", "INT_VAR", "RET", "VOID_TYPE", "WHILE", "ID", "NUM", "LETRA", 
			"DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "'if'", "'int'", "'return'", "'void'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ELSE", "IF", "INT_VAR", "RET", "VOID_TYPE", "WHILE", "ID", "NUM", 
			"WS"
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


	public C_minusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C_minus.g4"; }

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
		"\u0004\u0000\tK\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u00068\b\u0006\n\u0006\f\u0006;\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007?\b\u0007\n\u0007\f\u0007B\t\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\u0000\u0013\u0000\u0015\t\u0001\u0000\u0003\u0002\u0000"+
		"AZaz\u0001\u000009\u0002\u0000\t\n  J\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017"+
		"\u0001\u0000\u0000\u0000\u0003\u001c\u0001\u0000\u0000\u0000\u0005\u001f"+
		"\u0001\u0000\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t*\u0001\u0000"+
		"\u0000\u0000\u000b/\u0001\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000"+
		"\u000f<\u0001\u0000\u0000\u0000\u0011C\u0001\u0000\u0000\u0000\u0013E"+
		"\u0001\u0000\u0000\u0000\u0015G\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"e\u0000\u0000\u0018\u0019\u0005l\u0000\u0000\u0019\u001a\u0005s\u0000"+
		"\u0000\u001a\u001b\u0005e\u0000\u0000\u001b\u0002\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0005i\u0000\u0000\u001d\u001e\u0005f\u0000\u0000\u001e\u0004"+
		"\u0001\u0000\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005n\u0000\u0000"+
		"!\"\u0005t\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#$\u0005r\u0000"+
		"\u0000$%\u0005e\u0000\u0000%&\u0005t\u0000\u0000&\'\u0005u\u0000\u0000"+
		"\'(\u0005r\u0000\u0000()\u0005n\u0000\u0000)\b\u0001\u0000\u0000\u0000"+
		"*+\u0005v\u0000\u0000+,\u0005o\u0000\u0000,-\u0005i\u0000\u0000-.\u0005"+
		"d\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005w\u0000\u000001\u0005"+
		"h\u0000\u000012\u0005i\u0000\u000023\u0005l\u0000\u000034\u0005e\u0000"+
		"\u00004\f\u0001\u0000\u0000\u000059\u0003\u0011\b\u000068\u0003\u0011"+
		"\b\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:\u000e\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<@\u0003\u0013\t\u0000=?\u0003\u0013\t\u0000"+
		">=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A\u0010\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CD\u0007\u0000\u0000\u0000D\u0012\u0001\u0000\u0000"+
		"\u0000EF\u0007\u0001\u0000\u0000F\u0014\u0001\u0000\u0000\u0000GH\u0007"+
		"\u0002\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0006\n\u0000\u0000J\u0016"+
		"\u0001\u0000\u0000\u0000\u0003\u00009@\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}