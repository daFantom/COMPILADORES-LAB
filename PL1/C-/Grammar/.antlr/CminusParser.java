// Generated from c:/Users/pavei/Desktop/Git/COMPILADORES-LAB/PL1/C-/Grammar/CminusParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CminusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, WHILE=4, RET=5, VOID_TYPE=6, INT_TYPE=7, CHAR_TYPE=8, 
		BOOL_TYPE=9, BOOL=10, BOOL_TRUE=11, BOOL_FALSE=12, CHAR=13, INT=14, INPUT=15, 
		OUTPUT=16, ID=17, ASSIGN=18, PLUS=19, MINUS=20, MUL=21, DIV=22, MOD=23, 
		COMP=24, LE=25, GE=26, LT=27, GT=28, EQUAL=29, NEQUAL=30, AND=31, OR=32, 
		NOT=33, COMMA=34, SC=35, OPAREN=36, CPAREN=37, OBRACKETS=38, CBRACKETS=39, 
		OBRACES=40, CBRACES=41, COMMENT=42, WS=43;
	public static final int
		RULE_prog = 0, RULE_declaration_list = 1, RULE_declaration = 2, RULE_var_declaration = 3, 
		RULE_func_declaration = 4, RULE_params = 5, RULE_param_list = 6, RULE_param = 7, 
		RULE_compound_stmt = 8, RULE_local_declarations = 9, RULE_statment_list = 10, 
		RULE_statment = 11, RULE_expression_stmt = 12, RULE_selection_stmt = 13, 
		RULE_iteration_stmt = 14, RULE_for_cond = 15, RULE_while_cond = 16, RULE_return_stmt = 17, 
		RULE_io_stmt = 18, RULE_expression = 19, RULE_var = 20, RULE_simple_expression = 21, 
		RULE_logical_or_expression = 22, RULE_logical_and_expression = 23, RULE_relational_expression = 24, 
		RULE_additive_expression = 25, RULE_factor_expression = 26, RULE_unary_expression = 27, 
		RULE_value = 28, RULE_call = 29, RULE_args = 30, RULE_args_list = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration_list", "declaration", "var_declaration", "func_declaration", 
			"params", "param_list", "param", "compound_stmt", "local_declarations", 
			"statment_list", "statment", "expression_stmt", "selection_stmt", "iteration_stmt", 
			"for_cond", "while_cond", "return_stmt", "io_stmt", "expression", "var", 
			"simple_expression", "logical_or_expression", "logical_and_expression", 
			"relational_expression", "additive_expression", "factor_expression", 
			"unary_expression", "value", "call", "args", "args_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'while'", "'return'", "'void'", "'int'", 
			"'char'", "'bool'", null, "'true'", "'false'", null, null, "'input'", 
			"'output'", null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", null, "'<='", 
			"'>='", "'<'", "'>'", "'=='", "'!='", "'&&'", "'||'", "'!'", "','", "';'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "WHILE", "RET", "VOID_TYPE", "INT_TYPE", "CHAR_TYPE", 
			"BOOL_TYPE", "BOOL", "BOOL_TRUE", "BOOL_FALSE", "CHAR", "INT", "INPUT", 
			"OUTPUT", "ID", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "COMP", 
			"LE", "GE", "LT", "GT", "EQUAL", "NEQUAL", "AND", "OR", "NOT", "COMMA", 
			"SC", "OPAREN", "CPAREN", "OBRACKETS", "CBRACKETS", "OBRACES", "CBRACES", 
			"COMMENT", "WS"
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
	public String getGrammarFileName() { return "CminusParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CminusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CminusParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			declaration_list();
			setState(65);
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
	public static class Declaration_listContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				declaration();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0) );
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
	public static class DeclarationContext extends ParserRuleContext {
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Func_declarationContext func_declaration() {
			return getRuleContext(Func_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				func_declaration();
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
	public static class Var_declarationContext extends ParserRuleContext {
		public TerminalNode SC() { return getToken(CminusParser.SC, 0); }
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public TerminalNode INT_TYPE() { return getToken(CminusParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(CminusParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(CminusParser.BOOL_TYPE, 0); }
		public TerminalNode OBRACKETS() { return getToken(CminusParser.OBRACKETS, 0); }
		public TerminalNode INT() { return getToken(CminusParser.INT, 0); }
		public TerminalNode CBRACKETS() { return getToken(CminusParser.CBRACKETS, 0); }
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(76);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(77);
				match(ID);
				}
				break;
			case 2:
				{
				{
				setState(78);
				match(INT_TYPE);
				setState(79);
				match(ID);
				setState(80);
				match(OBRACKETS);
				setState(81);
				match(INT);
				setState(82);
				match(CBRACKETS);
				}
				}
				break;
			}
			setState(85);
			match(SC);
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
	public static class Func_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public TerminalNode OPAREN() { return getToken(CminusParser.OPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(CminusParser.CPAREN, 0); }
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public TerminalNode INT_TYPE() { return getToken(CminusParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(CminusParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(CminusParser.BOOL_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(CminusParser.VOID_TYPE, 0); }
		public Func_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declaration; }
	}

	public final Func_declarationContext func_declaration() throws RecognitionException {
		Func_declarationContext _localctx = new Func_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(88);
			match(ID);
			setState(89);
			match(OPAREN);
			setState(90);
			params();
			setState(91);
			match(CPAREN);
			setState(92);
			compound_stmt();
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
	public static class ParamsContext extends ParserRuleContext {
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode VOID_TYPE() { return getToken(CminusParser.VOID_TYPE, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				param_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(VOID_TYPE);
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
	public static class Param_listContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CminusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CminusParser.COMMA, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			param();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99);
				match(COMMA);
				setState(100);
				param();
				}
				}
				setState(105);
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
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public TerminalNode INT_TYPE() { return getToken(CminusParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(CminusParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(CminusParser.BOOL_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(CminusParser.VOID_TYPE, 0); }
		public TerminalNode OBRACKETS() { return getToken(CminusParser.OBRACKETS, 0); }
		public TerminalNode CBRACKETS() { return getToken(CminusParser.CBRACKETS, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(INT_TYPE);
				setState(109);
				match(ID);
				setState(110);
				match(OBRACKETS);
				setState(111);
				match(CBRACKETS);
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
	public static class Compound_stmtContext extends ParserRuleContext {
		public TerminalNode OBRACES() { return getToken(CminusParser.OBRACES, 0); }
		public TerminalNode CBRACES() { return getToken(CminusParser.CBRACES, 0); }
		public List<Local_declarationsContext> local_declarations() {
			return getRuleContexts(Local_declarationsContext.class);
		}
		public Local_declarationsContext local_declarations(int i) {
			return getRuleContext(Local_declarationsContext.class,i);
		}
		public List<Statment_listContext> statment_list() {
			return getRuleContexts(Statment_listContext.class);
		}
		public Statment_listContext statment_list(int i) {
			return getRuleContext(Statment_listContext.class,i);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compound_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(OBRACES);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1211182606266L) != 0)) {
				{
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case CHAR_TYPE:
				case BOOL_TYPE:
					{
					setState(115);
					local_declarations();
					}
					break;
				case IF:
				case FOR:
				case WHILE:
				case RET:
				case BOOL:
				case CHAR:
				case INT:
				case INPUT:
				case OUTPUT:
				case ID:
				case PLUS:
				case MINUS:
				case NOT:
				case SC:
				case OPAREN:
				case OBRACES:
					{
					setState(116);
					statment_list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(CBRACES);
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
	public static class Local_declarationsContext extends ParserRuleContext {
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public Local_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_declarations; }
	}

	public final Local_declarationsContext local_declarations() throws RecognitionException {
		Local_declarationsContext _localctx = new Local_declarationsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_local_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(124);
					var_declaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Statment_listContext extends ParserRuleContext {
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public Statment_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment_list; }
	}

	public final Statment_listContext statment_list() throws RecognitionException {
		Statment_listContext _localctx = new Statment_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statment_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(129);
					statment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatmentContext extends ParserRuleContext {
		public Expression_stmtContext expression_stmt() {
			return getRuleContext(Expression_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Selection_stmtContext selection_stmt() {
			return getRuleContext(Selection_stmtContext.class,0);
		}
		public Iteration_stmtContext iteration_stmt() {
			return getRuleContext(Iteration_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Io_stmtContext io_stmt() {
			return getRuleContext(Io_stmtContext.class,0);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statment);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case INT:
			case ID:
			case PLUS:
			case MINUS:
			case NOT:
			case SC:
			case OPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				expression_stmt();
				}
				break;
			case OBRACES:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				compound_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				selection_stmt();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				iteration_stmt();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				return_stmt();
				}
				break;
			case INPUT:
			case OUTPUT:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				io_stmt();
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
	public static class Expression_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SC() { return getToken(CminusParser.SC, 0); }
		public Expression_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_stmt; }
	}

	public final Expression_stmtContext expression_stmt() throws RecognitionException {
		Expression_stmtContext _localctx = new Expression_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression_stmt);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case INT:
			case ID:
			case PLUS:
			case MINUS:
			case NOT:
			case OPAREN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(142);
				expression();
				setState(143);
				match(SC);
				}
				}
				break;
			case SC:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(SC);
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
	public static class Selection_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CminusParser.IF, 0); }
		public TerminalNode OPAREN() { return getToken(CminusParser.OPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(CminusParser.CPAREN, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CminusParser.ELSE, 0); }
		public Selection_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_stmt; }
	}

	public final Selection_stmtContext selection_stmt() throws RecognitionException {
		Selection_stmtContext _localctx = new Selection_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selection_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IF);
			setState(149);
			match(OPAREN);
			setState(150);
			expression();
			setState(151);
			match(CPAREN);
			setState(152);
			statment();
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(153);
				match(ELSE);
				setState(154);
				statment();
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
	public static class Iteration_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CminusParser.FOR, 0); }
		public For_condContext for_cond() {
			return getRuleContext(For_condContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CminusParser.WHILE, 0); }
		public While_condContext while_cond() {
			return getRuleContext(While_condContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public Iteration_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_stmt; }
	}

	public final Iteration_stmtContext iteration_stmt() throws RecognitionException {
		Iteration_stmtContext _localctx = new Iteration_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iteration_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(157);
				match(FOR);
				setState(158);
				for_cond();
				}
				break;
			case WHILE:
				{
				setState(159);
				match(WHILE);
				setState(160);
				while_cond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(163);
				compound_stmt();
				}
				break;
			case 2:
				{
				setState(164);
				statment();
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
	public static class For_condContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(CminusParser.OPAREN, 0); }
		public List<TerminalNode> SC() { return getTokens(CminusParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(CminusParser.SC, i);
		}
		public TerminalNode CPAREN() { return getToken(CminusParser.CPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cond; }
	}

	public final For_condContext for_cond() throws RecognitionException {
		For_condContext _localctx = new For_condContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(OPAREN);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 77311140864L) != 0)) {
				{
				setState(168);
				expression();
				}
			}

			setState(171);
			match(SC);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 77311140864L) != 0)) {
				{
				setState(172);
				expression();
				}
			}

			setState(175);
			match(SC);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 77311140864L) != 0)) {
				{
				setState(176);
				expression();
				}
			}

			setState(179);
			match(CPAREN);
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
	public static class While_condContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(CminusParser.OPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(CminusParser.CPAREN, 0); }
		public While_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cond; }
	}

	public final While_condContext while_cond() throws RecognitionException {
		While_condContext _localctx = new While_condContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(OPAREN);
			setState(182);
			expression();
			setState(183);
			match(CPAREN);
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
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(CminusParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SC() { return getToken(CminusParser.SC, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_return_stmt);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(RET);
				setState(186);
				expression();
				setState(187);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(RET);
				setState(190);
				match(SC);
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
	public static class Io_stmtContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(CminusParser.INPUT, 0); }
		public TerminalNode OPAREN() { return getToken(CminusParser.OPAREN, 0); }
		public TerminalNode CPAREN() { return getToken(CminusParser.CPAREN, 0); }
		public TerminalNode SC() { return getToken(CminusParser.SC, 0); }
		public TerminalNode OUTPUT() { return getToken(CminusParser.OUTPUT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Io_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io_stmt; }
	}

	public final Io_stmtContext io_stmt() throws RecognitionException {
		Io_stmtContext _localctx = new Io_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_io_stmt);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(INPUT);
				setState(194);
				match(OPAREN);
				setState(195);
				match(CPAREN);
				setState(196);
				match(SC);
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(OUTPUT);
				setState(198);
				match(OPAREN);
				setState(199);
				expression();
				setState(200);
				match(CPAREN);
				setState(201);
				match(SC);
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
	public static class ExpressionContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CminusParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				var();
				setState(206);
				match(ASSIGN);
				setState(207);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				simple_expression();
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public TerminalNode OBRACKETS() { return getToken(CminusParser.OBRACKETS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CBRACKETS() { return getToken(CminusParser.CBRACKETS, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(213);
				match(ID);
				setState(214);
				match(OBRACKETS);
				setState(215);
				expression();
				setState(216);
				match(CBRACKETS);
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
	public static class Simple_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simple_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			logical_or_expression();
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
	public static class Logical_or_expressionContext extends ParserRuleContext {
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CminusParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CminusParser.OR, i);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			logical_and_expression();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(223);
				match(OR);
				setState(224);
				logical_and_expression();
				}
				}
				setState(229);
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
	public static class Logical_and_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CminusParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CminusParser.AND, i);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			relational_expression();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(231);
				match(AND);
				setState(232);
				relational_expression();
				}
				}
				setState(237);
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
	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> COMP() { return getTokens(CminusParser.COMP); }
		public TerminalNode COMP(int i) {
			return getToken(CminusParser.COMP, i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			additive_expression();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMP) {
				{
				{
				setState(239);
				match(COMP);
				setState(240);
				additive_expression();
				}
				}
				setState(245);
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
	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Factor_expressionContext> factor_expression() {
			return getRuleContexts(Factor_expressionContext.class);
		}
		public Factor_expressionContext factor_expression(int i) {
			return getRuleContext(Factor_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CminusParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CminusParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CminusParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CminusParser.MINUS, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			factor_expression();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(248);
				factor_expression();
				}
				}
				setState(253);
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
	public static class Factor_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(CminusParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(CminusParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CminusParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CminusParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(CminusParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(CminusParser.MOD, i);
		}
		public Factor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_expression; }
	}

	public final Factor_expressionContext factor_expression() throws RecognitionException {
		Factor_expressionContext _localctx = new Factor_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			unary_expression();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
				{
				{
				setState(255);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				unary_expression();
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
	public static class Unary_expressionContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CminusParser.PLUS, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CminusParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(CminusParser.NOT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unary_expression);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(PLUS);
				setState(263);
				unary_expression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(MINUS);
				setState(265);
				unary_expression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(NOT);
				setState(267);
				unary_expression();
				}
				break;
			case BOOL:
			case CHAR:
			case INT:
			case ID:
			case OPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				value();
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(CminusParser.OPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(CminusParser.CPAREN, 0); }
		public TerminalNode INT() { return getToken(CminusParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CminusParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(CminusParser.CHAR, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_value);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(OPAREN);
				setState(272);
				expression();
				setState(273);
				match(CPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				var();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				call();
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
	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public TerminalNode OPAREN() { return getToken(CminusParser.OPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(CminusParser.CPAREN, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ID);
			setState(283);
			match(OPAREN);
			setState(284);
			args();
			setState(285);
			match(CPAREN);
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
	public static class ArgsContext extends ParserRuleContext {
		public Args_listContext args_list() {
			return getRuleContext(Args_listContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 77311140864L) != 0)) {
				{
				setState(287);
				args_list();
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
	public static class Args_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CminusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CminusParser.COMMA, i);
		}
		public Args_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_list; }
	}

	public final Args_listContext args_list() throws RecognitionException {
		Args_listContext _localctx = new Args_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_args_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			expression();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(291);
				match(COMMA);
				setState(292);
				expression();
				}
				}
				setState(297);
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

	public static final String _serializedATN =
		"\u0004\u0001+\u012b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0004\u0001E\b\u0001\u000b\u0001\f\u0001F\u0001\u0002\u0001\u0002\u0003"+
		"\u0002K\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003T\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005a\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006f\b\u0006\n\u0006\f\u0006i\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007q\b\u0007\u0001\b\u0001\b\u0001\b\u0005\bv\b\b\n\b\f"+
		"\by\t\b\u0001\b\u0001\b\u0001\t\u0004\t~\b\t\u000b\t\f\t\u007f\u0001\n"+
		"\u0004\n\u0083\b\n\u000b\n\f\n\u0084\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008d\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u0093\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u009c\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00a2\b\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00a6\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00aa\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00ae\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00b2\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00c0\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00cc\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00d3\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00db\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u00e2\b\u0016\n\u0016\f\u0016\u00e5\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u00ea\b\u0017\n\u0017\f\u0017\u00ed\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00f2\b\u0018\n\u0018"+
		"\f\u0018\u00f5\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u00fa\b\u0019\n\u0019\f\u0019\u00fd\t\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u0102\b\u001a\n\u001a\f\u001a\u0105\t\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u010e\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0119\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0003\u001e\u0121\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0126\b\u001f\n\u001f\f\u001f\u0129\t\u001f\u0001\u001f\u0000"+
		"\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0004\u0001\u0000\u0007\t\u0001"+
		"\u0000\u0006\t\u0001\u0000\u0013\u0014\u0001\u0000\u0015\u0017\u0133\u0000"+
		"@\u0001\u0000\u0000\u0000\u0002D\u0001\u0000\u0000\u0000\u0004J\u0001"+
		"\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000"+
		"\u0000\n`\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000ep\u0001"+
		"\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000"+
		"\u0000\u0014\u0082\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000\u0000"+
		"\u0000\u0018\u0092\u0001\u0000\u0000\u0000\u001a\u0094\u0001\u0000\u0000"+
		"\u0000\u001c\u00a1\u0001\u0000\u0000\u0000\u001e\u00a7\u0001\u0000\u0000"+
		"\u0000 \u00b5\u0001\u0000\u0000\u0000\"\u00bf\u0001\u0000\u0000\u0000"+
		"$\u00cb\u0001\u0000\u0000\u0000&\u00d2\u0001\u0000\u0000\u0000(\u00da"+
		"\u0001\u0000\u0000\u0000*\u00dc\u0001\u0000\u0000\u0000,\u00de\u0001\u0000"+
		"\u0000\u0000.\u00e6\u0001\u0000\u0000\u00000\u00ee\u0001\u0000\u0000\u0000"+
		"2\u00f6\u0001\u0000\u0000\u00004\u00fe\u0001\u0000\u0000\u00006\u010d"+
		"\u0001\u0000\u0000\u00008\u0118\u0001\u0000\u0000\u0000:\u011a\u0001\u0000"+
		"\u0000\u0000<\u0120\u0001\u0000\u0000\u0000>\u0122\u0001\u0000\u0000\u0000"+
		"@A\u0003\u0002\u0001\u0000AB\u0005\u0000\u0000\u0001B\u0001\u0001\u0000"+
		"\u0000\u0000CE\u0003\u0004\u0002\u0000DC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"G\u0003\u0001\u0000\u0000\u0000HK\u0003\u0006\u0003\u0000IK\u0003\b\u0004"+
		"\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0005\u0001"+
		"\u0000\u0000\u0000LM\u0007\u0000\u0000\u0000MT\u0005\u0011\u0000\u0000"+
		"NO\u0005\u0007\u0000\u0000OP\u0005\u0011\u0000\u0000PQ\u0005&\u0000\u0000"+
		"QR\u0005\u000e\u0000\u0000RT\u0005\'\u0000\u0000SL\u0001\u0000\u0000\u0000"+
		"SN\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0005#\u0000\u0000"+
		"V\u0007\u0001\u0000\u0000\u0000WX\u0007\u0001\u0000\u0000XY\u0005\u0011"+
		"\u0000\u0000YZ\u0005$\u0000\u0000Z[\u0003\n\u0005\u0000[\\\u0005%\u0000"+
		"\u0000\\]\u0003\u0010\b\u0000]\t\u0001\u0000\u0000\u0000^a\u0003\f\u0006"+
		"\u0000_a\u0005\u0006\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000"+
		"\u0000\u0000a\u000b\u0001\u0000\u0000\u0000bg\u0003\u000e\u0007\u0000"+
		"cd\u0005\"\u0000\u0000df\u0003\u000e\u0007\u0000ec\u0001\u0000\u0000\u0000"+
		"fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000h\r\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0007\u0001"+
		"\u0000\u0000kq\u0005\u0011\u0000\u0000lm\u0005\u0007\u0000\u0000mn\u0005"+
		"\u0011\u0000\u0000no\u0005&\u0000\u0000oq\u0005\'\u0000\u0000pj\u0001"+
		"\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000q\u000f\u0001\u0000\u0000"+
		"\u0000rw\u0005(\u0000\u0000sv\u0003\u0012\t\u0000tv\u0003\u0014\n\u0000"+
		"us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005)\u0000\u0000{\u0011\u0001"+
		"\u0000\u0000\u0000|~\u0003\u0006\u0003\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0013\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0003\u0016\u000b\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086\u008d"+
		"\u0003\u0018\f\u0000\u0087\u008d\u0003\u0010\b\u0000\u0088\u008d\u0003"+
		"\u001a\r\u0000\u0089\u008d\u0003\u001c\u000e\u0000\u008a\u008d\u0003\""+
		"\u0011\u0000\u008b\u008d\u0003$\u0012\u0000\u008c\u0086\u0001\u0000\u0000"+
		"\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008c\u0088\u0001\u0000\u0000"+
		"\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0017\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0003&\u0013\u0000\u008f\u0090\u0005#\u0000\u0000\u0090"+
		"\u0093\u0001\u0000\u0000\u0000\u0091\u0093\u0005#\u0000\u0000\u0092\u008e"+
		"\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0019"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0001\u0000\u0000\u0095\u0096"+
		"\u0005$\u0000\u0000\u0096\u0097\u0003&\u0013\u0000\u0097\u0098\u0005%"+
		"\u0000\u0000\u0098\u009b\u0003\u0016\u000b\u0000\u0099\u009a\u0005\u0002"+
		"\u0000\u0000\u009a\u009c\u0003\u0016\u000b\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u001b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\u0003\u0000\u0000\u009e\u00a2\u0003\u001e"+
		"\u000f\u0000\u009f\u00a0\u0005\u0004\u0000\u0000\u00a0\u00a2\u0003 \u0010"+
		"\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a6\u0003\u0010\b\u0000"+
		"\u00a4\u00a6\u0003\u0016\u000b\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u001d\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a9\u0005$\u0000\u0000\u00a8\u00aa\u0003&\u0013\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005#\u0000\u0000\u00ac\u00ae\u0003"+
		"&\u0013\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0005#\u0000"+
		"\u0000\u00b0\u00b2\u0003&\u0013\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005%\u0000\u0000\u00b4\u001f\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005$\u0000\u0000\u00b6\u00b7\u0003&\u0013\u0000\u00b7\u00b8\u0005"+
		"%\u0000\u0000\u00b8!\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0005\u0000"+
		"\u0000\u00ba\u00bb\u0003&\u0013\u0000\u00bb\u00bc\u0005#\u0000\u0000\u00bc"+
		"\u00c0\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0005\u0000\u0000\u00be"+
		"\u00c0\u0005#\u0000\u0000\u00bf\u00b9\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0#\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005"+
		"\u000f\u0000\u0000\u00c2\u00c3\u0005$\u0000\u0000\u00c3\u00c4\u0005%\u0000"+
		"\u0000\u00c4\u00cc\u0005#\u0000\u0000\u00c5\u00c6\u0005\u0010\u0000\u0000"+
		"\u00c6\u00c7\u0005$\u0000\u0000\u00c7\u00c8\u0003&\u0013\u0000\u00c8\u00c9"+
		"\u0005%\u0000\u0000\u00c9\u00ca\u0005#\u0000\u0000\u00ca\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c1\u0001\u0000\u0000\u0000\u00cb\u00c5\u0001\u0000"+
		"\u0000\u0000\u00cc%\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003(\u0014\u0000"+
		"\u00ce\u00cf\u0005\u0012\u0000\u0000\u00cf\u00d0\u0003&\u0013\u0000\u00d0"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d1\u00d3\u0003*\u0015\u0000\u00d2\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\'\u0001"+
		"\u0000\u0000\u0000\u00d4\u00db\u0005\u0011\u0000\u0000\u00d5\u00d6\u0005"+
		"\u0011\u0000\u0000\u00d6\u00d7\u0005&\u0000\u0000\u00d7\u00d8\u0003&\u0013"+
		"\u0000\u00d8\u00d9\u0005\'\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000"+
		"\u00da\u00d4\u0001\u0000\u0000\u0000\u00da\u00d5\u0001\u0000\u0000\u0000"+
		"\u00db)\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003,\u0016\u0000\u00dd+"+
		"\u0001\u0000\u0000\u0000\u00de\u00e3\u0003.\u0017\u0000\u00df\u00e0\u0005"+
		" \u0000\u0000\u00e0\u00e2\u0003.\u0017\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4-\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00eb\u00030\u0018\u0000\u00e7"+
		"\u00e8\u0005\u001f\u0000\u0000\u00e8\u00ea\u00030\u0018\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec/\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f3\u0003"+
		"2\u0019\u0000\u00ef\u00f0\u0005\u0018\u0000\u0000\u00f0\u00f2\u00032\u0019"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f41\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f6\u00fb\u00034\u001a\u0000\u00f7\u00f8\u0007\u0002\u0000\u0000\u00f8"+
		"\u00fa\u00034\u001a\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fc3\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fe\u0103\u00036\u001b\u0000\u00ff\u0100\u0007\u0003"+
		"\u0000\u0000\u0100\u0102\u00036\u001b\u0000\u0101\u00ff\u0001\u0000\u0000"+
		"\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u01045\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0013\u0000\u0000"+
		"\u0107\u010e\u00036\u001b\u0000\u0108\u0109\u0005\u0014\u0000\u0000\u0109"+
		"\u010e\u00036\u001b\u0000\u010a\u010b\u0005!\u0000\u0000\u010b\u010e\u0003"+
		"6\u001b\u0000\u010c\u010e\u00038\u001c\u0000\u010d\u0106\u0001\u0000\u0000"+
		"\u0000\u010d\u0108\u0001\u0000\u0000\u0000\u010d\u010a\u0001\u0000\u0000"+
		"\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e7\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0005$\u0000\u0000\u0110\u0111\u0003&\u0013\u0000\u0111\u0112"+
		"\u0005%\u0000\u0000\u0112\u0119\u0001\u0000\u0000\u0000\u0113\u0119\u0005"+
		"\u000e\u0000\u0000\u0114\u0119\u0005\n\u0000\u0000\u0115\u0119\u0005\r"+
		"\u0000\u0000\u0116\u0119\u0003(\u0014\u0000\u0117\u0119\u0003:\u001d\u0000"+
		"\u0118\u010f\u0001\u0000\u0000\u0000\u0118\u0113\u0001\u0000\u0000\u0000"+
		"\u0118\u0114\u0001\u0000\u0000\u0000\u0118\u0115\u0001\u0000\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000"+
		"\u01199\u0001\u0000\u0000\u0000\u011a\u011b\u0005\u0011\u0000\u0000\u011b"+
		"\u011c\u0005$\u0000\u0000\u011c\u011d\u0003<\u001e\u0000\u011d\u011e\u0005"+
		"%\u0000\u0000\u011e;\u0001\u0000\u0000\u0000\u011f\u0121\u0003>\u001f"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121=\u0001\u0000\u0000\u0000\u0122\u0127\u0003&\u0013\u0000\u0123"+
		"\u0124\u0005\"\u0000\u0000\u0124\u0126\u0003&\u0013\u0000\u0125\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128?\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u001fFJS`gpuw\u007f"+
		"\u0084\u008c\u0092\u009b\u00a1\u00a5\u00a9\u00ad\u00b1\u00bf\u00cb\u00d2"+
		"\u00da\u00e3\u00eb\u00f3\u00fb\u0103\u010d\u0118\u0120\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}