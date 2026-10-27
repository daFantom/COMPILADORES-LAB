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
		BOOL_TYPE=9, BOOL=10, BOOL_TRUE=11, BOOL_FALSE=12, CHAR=13, INT=14, ID=15, 
		ASSIGN=16, PLUS=17, MINUS=18, MUL=19, DIV=20, MOD=21, COMP=22, LE=23, 
		GE=24, LT=25, GT=26, EQUAL=27, NEQUAL=28, AND=29, OR=30, NOT=31, COMMA=32, 
		SC=33, OPAREN=34, CPAREN=35, OBRACKETS=36, CBRACKETS=37, OBRACES=38, CBRACES=39, 
		COMMENT=40, WS=41;
	public static final int
		RULE_prog = 0, RULE_declaration_list = 1, RULE_declaration = 2, RULE_var_declaration = 3, 
		RULE_func_declaration = 4, RULE_params = 5, RULE_param_list = 6, RULE_param = 7, 
		RULE_compound_stmt = 8, RULE_local_declarations = 9, RULE_statment_list = 10, 
		RULE_statment = 11, RULE_expression_stmt = 12, RULE_selection_stmt = 13, 
		RULE_iteration_stmt = 14, RULE_for_cond = 15, RULE_while_cond = 16, RULE_return_stmt = 17, 
		RULE_expression = 18, RULE_var = 19, RULE_simple_expression = 20, RULE_logical_or_expression = 21, 
		RULE_logical_and_expression = 22, RULE_relational_expression = 23, RULE_additive_expression = 24, 
		RULE_factor_expression = 25, RULE_unary_expression = 26, RULE_value = 27, 
		RULE_call = 28, RULE_args = 29, RULE_args_list = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration_list", "declaration", "var_declaration", "func_declaration", 
			"params", "param_list", "param", "compound_stmt", "local_declarations", 
			"statment_list", "statment", "expression_stmt", "selection_stmt", "iteration_stmt", 
			"for_cond", "while_cond", "return_stmt", "expression", "var", "simple_expression", 
			"logical_or_expression", "logical_and_expression", "relational_expression", 
			"additive_expression", "factor_expression", "unary_expression", "value", 
			"call", "args", "args_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'while'", "'return'", "'void'", "'int'", 
			"'char'", "'bool'", null, "'true'", "'false'", null, null, null, "'='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", null, "'<='", "'>='", "'<'", "'>'", 
			"'=='", "'!='", "'&&'", "'||'", "'!'", "','", "';'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "WHILE", "RET", "VOID_TYPE", "INT_TYPE", "CHAR_TYPE", 
			"BOOL_TYPE", "BOOL", "BOOL_TRUE", "BOOL_FALSE", "CHAR", "INT", "ID", 
			"ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "COMP", "LE", "GE", "LT", 
			"GT", "EQUAL", "NEQUAL", "AND", "OR", "NOT", "COMMA", "SC", "OPAREN", 
			"CPAREN", "OBRACKETS", "CBRACKETS", "OBRACES", "CBRACES", "COMMENT", 
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
			setState(62);
			declaration_list();
			setState(63);
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
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				declaration();
				}
				}
				setState(68); 
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(74);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(75);
				match(ID);
				}
				break;
			case 2:
				{
				{
				setState(76);
				match(INT_TYPE);
				setState(77);
				match(ID);
				setState(78);
				match(OBRACKETS);
				setState(79);
				match(INT);
				setState(80);
				match(CBRACKETS);
				}
				}
				break;
			}
			setState(83);
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
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(86);
			match(ID);
			setState(87);
			match(OPAREN);
			setState(88);
			params();
			setState(89);
			match(CPAREN);
			setState(90);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				param_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
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
			setState(96);
			param();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97);
				match(COMMA);
				setState(98);
				param();
				}
				}
				setState(103);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(105);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(INT_TYPE);
				setState(107);
				match(ID);
				setState(108);
				match(OBRACKETS);
				setState(109);
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
			setState(112);
			match(OBRACES);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 302795646906L) != 0)) {
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case CHAR_TYPE:
				case BOOL_TYPE:
					{
					setState(113);
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
				case ID:
				case PLUS:
				case MINUS:
				case NOT:
				case SC:
				case OPAREN:
				case OBRACES:
					{
					setState(114);
					statment_list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
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
			setState(123); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(122);
					var_declaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125); 
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
			setState(128); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(127);
					statment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(130); 
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
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statment);
		try {
			setState(137);
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
				setState(132);
				expression_stmt();
				}
				break;
			case OBRACES:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				compound_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				selection_stmt();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				iteration_stmt();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				return_stmt();
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
			setState(143);
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
				setState(139);
				expression();
				setState(140);
				match(SC);
				}
				}
				break;
			case SC:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
			setState(145);
			match(IF);
			setState(146);
			match(OPAREN);
			setState(147);
			expression();
			setState(148);
			match(CPAREN);
			setState(149);
			statment();
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(150);
				match(ELSE);
				setState(151);
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
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(154);
				match(FOR);
				setState(155);
				for_cond();
				}
				break;
			case WHILE:
				{
				setState(156);
				match(WHILE);
				setState(157);
				while_cond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(160);
				compound_stmt();
				}
				break;
			case 2:
				{
				setState(161);
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
			setState(164);
			match(OPAREN);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19327804416L) != 0)) {
				{
				setState(165);
				expression();
				}
			}

			setState(168);
			match(SC);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19327804416L) != 0)) {
				{
				setState(169);
				expression();
				}
			}

			setState(172);
			match(SC);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19327804416L) != 0)) {
				{
				setState(173);
				expression();
				}
			}

			setState(176);
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
			setState(178);
			match(OPAREN);
			setState(179);
			expression();
			setState(180);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(RET);
				setState(183);
				expression();
				setState(184);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(RET);
				setState(187);
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
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				var();
				setState(191);
				match(ASSIGN);
				setState(192);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
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
		enterRule(_localctx, 38, RULE_var);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(198);
				match(ID);
				setState(199);
				match(OBRACKETS);
				setState(200);
				expression();
				setState(201);
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
		enterRule(_localctx, 40, RULE_simple_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		enterRule(_localctx, 42, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			logical_and_expression();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(208);
				match(OR);
				setState(209);
				logical_and_expression();
				}
				}
				setState(214);
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
		enterRule(_localctx, 44, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			relational_expression();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(216);
				match(AND);
				setState(217);
				relational_expression();
				}
				}
				setState(222);
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
		enterRule(_localctx, 46, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			additive_expression();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMP) {
				{
				{
				setState(224);
				match(COMP);
				setState(225);
				additive_expression();
				}
				}
				setState(230);
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
		enterRule(_localctx, 48, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			factor_expression();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				factor_expression();
				}
				}
				setState(238);
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
		enterRule(_localctx, 50, RULE_factor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			unary_expression();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) {
				{
				{
				setState(240);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(241);
				unary_expression();
				}
				}
				setState(246);
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
		enterRule(_localctx, 52, RULE_unary_expression);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(PLUS);
				setState(248);
				unary_expression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(MINUS);
				setState(250);
				unary_expression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(NOT);
				setState(252);
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
				setState(253);
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
		enterRule(_localctx, 54, RULE_value);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(OPAREN);
				setState(257);
				expression();
				setState(258);
				match(CPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				var();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
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
		enterRule(_localctx, 56, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ID);
			setState(268);
			match(OPAREN);
			setState(269);
			args();
			setState(270);
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
		enterRule(_localctx, 58, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19327804416L) != 0)) {
				{
				setState(272);
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
		enterRule(_localctx, 60, RULE_args_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			expression();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(276);
				match(COMMA);
				setState(277);
				expression();
				}
				}
				setState(282);
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
		"\u0004\u0001)\u011c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001C\b\u0001"+
		"\u000b\u0001\f\u0001D\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003R\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005_\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006d\b\u0006\n\u0006\f\u0006g\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007o\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0005\bt\b\b\n\b\f\bw\t\b\u0001\b\u0001"+
		"\b\u0001\t\u0004\t|\b\t\u000b\t\f\t}\u0001\n\u0004\n\u0081\b\n\u000b\n"+
		"\f\n\u0082\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u008a\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0090"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0099"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009f"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a3\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00a7\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00ab\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00af\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00bd\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00c4\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00cc\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00d3\b\u0015\n"+
		"\u0015\f\u0015\u00d6\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00db\b\u0016\n\u0016\f\u0016\u00de\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u00e3\b\u0017\n\u0017\f\u0017\u00e6\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00eb\b\u0018\n\u0018\f\u0018"+
		"\u00ee\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00f3\b"+
		"\u0019\n\u0019\f\u0019\u00f6\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00ff\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u010a\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0003\u001d"+
		"\u0112\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0117\b"+
		"\u001e\n\u001e\f\u001e\u011a\t\u001e\u0001\u001e\u0000\u0000\u001f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<\u0000\u0004\u0001\u0000\u0007\t\u0001\u0000\u0006"+
		"\t\u0001\u0000\u0011\u0012\u0001\u0000\u0013\u0015\u0123\u0000>\u0001"+
		"\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000"+
		"\u0000\u0006Q\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\n^\u0001"+
		"\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000en\u0001\u0000\u0000"+
		"\u0000\u0010p\u0001\u0000\u0000\u0000\u0012{\u0001\u0000\u0000\u0000\u0014"+
		"\u0080\u0001\u0000\u0000\u0000\u0016\u0089\u0001\u0000\u0000\u0000\u0018"+
		"\u008f\u0001\u0000\u0000\u0000\u001a\u0091\u0001\u0000\u0000\u0000\u001c"+
		"\u009e\u0001\u0000\u0000\u0000\u001e\u00a4\u0001\u0000\u0000\u0000 \u00b2"+
		"\u0001\u0000\u0000\u0000\"\u00bc\u0001\u0000\u0000\u0000$\u00c3\u0001"+
		"\u0000\u0000\u0000&\u00cb\u0001\u0000\u0000\u0000(\u00cd\u0001\u0000\u0000"+
		"\u0000*\u00cf\u0001\u0000\u0000\u0000,\u00d7\u0001\u0000\u0000\u0000."+
		"\u00df\u0001\u0000\u0000\u00000\u00e7\u0001\u0000\u0000\u00002\u00ef\u0001"+
		"\u0000\u0000\u00004\u00fe\u0001\u0000\u0000\u00006\u0109\u0001\u0000\u0000"+
		"\u00008\u010b\u0001\u0000\u0000\u0000:\u0111\u0001\u0000\u0000\u0000<"+
		"\u0113\u0001\u0000\u0000\u0000>?\u0003\u0002\u0001\u0000?@\u0005\u0000"+
		"\u0000\u0001@\u0001\u0001\u0000\u0000\u0000AC\u0003\u0004\u0002\u0000"+
		"BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000E\u0003\u0001\u0000\u0000\u0000FI\u0003"+
		"\u0006\u0003\u0000GI\u0003\b\u0004\u0000HF\u0001\u0000\u0000\u0000HG\u0001"+
		"\u0000\u0000\u0000I\u0005\u0001\u0000\u0000\u0000JK\u0007\u0000\u0000"+
		"\u0000KR\u0005\u000f\u0000\u0000LM\u0005\u0007\u0000\u0000MN\u0005\u000f"+
		"\u0000\u0000NO\u0005$\u0000\u0000OP\u0005\u000e\u0000\u0000PR\u0005%\u0000"+
		"\u0000QJ\u0001\u0000\u0000\u0000QL\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000ST\u0005!\u0000\u0000T\u0007\u0001\u0000\u0000\u0000UV\u0007"+
		"\u0001\u0000\u0000VW\u0005\u000f\u0000\u0000WX\u0005\"\u0000\u0000XY\u0003"+
		"\n\u0005\u0000YZ\u0005#\u0000\u0000Z[\u0003\u0010\b\u0000[\t\u0001\u0000"+
		"\u0000\u0000\\_\u0003\f\u0006\u0000]_\u0005\u0006\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\u000b\u0001\u0000\u0000"+
		"\u0000`e\u0003\u000e\u0007\u0000ab\u0005 \u0000\u0000bd\u0003\u000e\u0007"+
		"\u0000ca\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000hi\u0007\u0001\u0000\u0000io\u0005\u000f\u0000\u0000"+
		"jk\u0005\u0007\u0000\u0000kl\u0005\u000f\u0000\u0000lm\u0005$\u0000\u0000"+
		"mo\u0005%\u0000\u0000nh\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000"+
		"o\u000f\u0001\u0000\u0000\u0000pu\u0005&\u0000\u0000qt\u0003\u0012\t\u0000"+
		"rt\u0003\u0014\n\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\'\u0000"+
		"\u0000y\u0011\u0001\u0000\u0000\u0000z|\u0003\u0006\u0003\u0000{z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0013\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0003\u0016\u000b\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0015\u0001\u0000\u0000\u0000\u0084\u008a"+
		"\u0003\u0018\f\u0000\u0085\u008a\u0003\u0010\b\u0000\u0086\u008a\u0003"+
		"\u001a\r\u0000\u0087\u008a\u0003\u001c\u000e\u0000\u0088\u008a\u0003\""+
		"\u0011\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000"+
		"\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0017\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0003$\u0012\u0000\u008c\u008d\u0005!\u0000\u0000"+
		"\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u0090\u0005!\u0000\u0000\u008f"+
		"\u008b\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0019\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0001\u0000\u0000\u0092"+
		"\u0093\u0005\"\u0000\u0000\u0093\u0094\u0003$\u0012\u0000\u0094\u0095"+
		"\u0005#\u0000\u0000\u0095\u0098\u0003\u0016\u000b\u0000\u0096\u0097\u0005"+
		"\u0002\u0000\u0000\u0097\u0099\u0003\u0016\u000b\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u001b\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\u0003\u0000\u0000\u009b\u009f\u0003"+
		"\u001e\u000f\u0000\u009c\u009d\u0005\u0004\u0000\u0000\u009d\u009f\u0003"+
		" \u0010\u0000\u009e\u009a\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u00a3\u0003\u0010"+
		"\b\u0000\u00a1\u00a3\u0003\u0016\u000b\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u001d\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0005\"\u0000\u0000\u00a5\u00a7\u0003$\u0012\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa\u0005!\u0000\u0000\u00a9"+
		"\u00ab\u0003$\u0012\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae"+
		"\u0005!\u0000\u0000\u00ad\u00af\u0003$\u0012\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005#\u0000\u0000\u00b1\u001f\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005\"\u0000\u0000\u00b3\u00b4\u0003$\u0012\u0000"+
		"\u00b4\u00b5\u0005#\u0000\u0000\u00b5!\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0005\u0000\u0000\u00b7\u00b8\u0003$\u0012\u0000\u00b8\u00b9\u0005"+
		"!\u0000\u0000\u00b9\u00bd\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0005"+
		"\u0000\u0000\u00bb\u00bd\u0005!\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd#\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0003&\u0013\u0000\u00bf\u00c0\u0005\u0010\u0000\u0000\u00c0"+
		"\u00c1\u0003$\u0012\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0003(\u0014\u0000\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4%\u0001\u0000\u0000\u0000\u00c5\u00cc\u0005\u000f"+
		"\u0000\u0000\u00c6\u00c7\u0005\u000f\u0000\u0000\u00c7\u00c8\u0005$\u0000"+
		"\u0000\u00c8\u00c9\u0003$\u0012\u0000\u00c9\u00ca\u0005%\u0000\u0000\u00ca"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c6\u0001\u0000\u0000\u0000\u00cc\'\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0003*\u0015\u0000\u00ce)\u0001\u0000\u0000\u0000\u00cf\u00d4\u0003,"+
		"\u0016\u0000\u00d0\u00d1\u0005\u001e\u0000\u0000\u00d1\u00d3\u0003,\u0016"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5+\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d7\u00dc\u0003.\u0017\u0000\u00d8\u00d9\u0005\u001d\u0000\u0000\u00d9"+
		"\u00db\u0003.\u0017\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd-\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00df\u00e4\u00030\u0018\u0000\u00e0\u00e1\u0005\u0016"+
		"\u0000\u0000\u00e1\u00e3\u00030\u0018\u0000\u00e2\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5/\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ec\u00032\u0019\u0000\u00e8"+
		"\u00e9\u0007\u0002\u0000\u0000\u00e9\u00eb\u00032\u0019\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed1\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f4\u0003"+
		"4\u001a\u0000\u00f0\u00f1\u0007\u0003\u0000\u0000\u00f1\u00f3\u00034\u001a"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f53\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0005\u0011\u0000\u0000\u00f8\u00ff\u00034\u001a\u0000\u00f9"+
		"\u00fa\u0005\u0012\u0000\u0000\u00fa\u00ff\u00034\u001a\u0000\u00fb\u00fc"+
		"\u0005\u001f\u0000\u0000\u00fc\u00ff\u00034\u001a\u0000\u00fd\u00ff\u0003"+
		"6\u001b\u0000\u00fe\u00f7\u0001\u0000\u0000\u0000\u00fe\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fb\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff5\u0001\u0000\u0000\u0000\u0100\u0101\u0005\"\u0000"+
		"\u0000\u0101\u0102\u0003$\u0012\u0000\u0102\u0103\u0005#\u0000\u0000\u0103"+
		"\u010a\u0001\u0000\u0000\u0000\u0104\u010a\u0005\u000e\u0000\u0000\u0105"+
		"\u010a\u0005\n\u0000\u0000\u0106\u010a\u0005\r\u0000\u0000\u0107\u010a"+
		"\u0003&\u0013\u0000\u0108\u010a\u00038\u001c\u0000\u0109\u0100\u0001\u0000"+
		"\u0000\u0000\u0109\u0104\u0001\u0000\u0000\u0000\u0109\u0105\u0001\u0000"+
		"\u0000\u0000\u0109\u0106\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a7\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0005\u000f\u0000\u0000\u010c\u010d\u0005\"\u0000\u0000"+
		"\u010d\u010e\u0003:\u001d\u0000\u010e\u010f\u0005#\u0000\u0000\u010f9"+
		"\u0001\u0000\u0000\u0000\u0110\u0112\u0003<\u001e\u0000\u0111\u0110\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112;\u0001\u0000"+
		"\u0000\u0000\u0113\u0118\u0003$\u0012\u0000\u0114\u0115\u0005 \u0000\u0000"+
		"\u0115\u0117\u0003$\u0012\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117"+
		"\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119=\u0001\u0000\u0000\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u001eDHQ^ensu}\u0082\u0089\u008f\u0098\u009e"+
		"\u00a2\u00a6\u00aa\u00ae\u00bc\u00c3\u00cb\u00d4\u00dc\u00e4\u00ec\u00f4"+
		"\u00fe\u0109\u0111\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}