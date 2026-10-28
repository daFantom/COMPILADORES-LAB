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
		RULE_type_specifier = 4, RULE_func_declaration = 5, RULE_params = 6, RULE_param_list = 7, 
		RULE_param = 8, RULE_compound_stmt = 9, RULE_local_declarations = 10, 
		RULE_statment_list = 11, RULE_statment = 12, RULE_expression_stmt = 13, 
		RULE_selection_stmt = 14, RULE_iteration_stmt = 15, RULE_for_cond = 16, 
		RULE_while_cond = 17, RULE_return_stmt = 18, RULE_io_stmt = 19, RULE_input_stmt = 20, 
		RULE_output_stmt = 21, RULE_expression = 22, RULE_var = 23, RULE_simple_expression = 24, 
		RULE_logical_or_expression = 25, RULE_logical_and_expression = 26, RULE_relational_expression = 27, 
		RULE_additive_expression = 28, RULE_factor_expression = 29, RULE_unary_expression = 30, 
		RULE_value = 31, RULE_call = 32, RULE_args = 33, RULE_args_list = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration_list", "declaration", "var_declaration", "type_specifier", 
			"func_declaration", "params", "param_list", "param", "compound_stmt", 
			"local_declarations", "statment_list", "statment", "expression_stmt", 
			"selection_stmt", "iteration_stmt", "for_cond", "while_cond", "return_stmt", 
			"io_stmt", "input_stmt", "output_stmt", "expression", "var", "simple_expression", 
			"logical_or_expression", "logical_and_expression", "relational_expression", 
			"additive_expression", "factor_expression", "unary_expression", "value", 
			"call", "args", "args_list"
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
			setState(70);
			declaration_list();
			setState(71);
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
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				declaration();
				}
				}
				setState(76); 
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
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
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public TerminalNode INT_TYPE() { return getToken(CminusParser.INT_TYPE, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(82);
				type_specifier();
				setState(83);
				match(ID);
				}
				break;
			case 2:
				{
				{
				setState(85);
				match(INT_TYPE);
				setState(86);
				match(ID);
				setState(87);
				match(OBRACKETS);
				setState(88);
				match(INT);
				setState(89);
				match(CBRACKETS);
				}
				}
				break;
			}
			setState(92);
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
	public static class Type_specifierContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(CminusParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(CminusParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(CminusParser.BOOL_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(CminusParser.VOID_TYPE, 0); }
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
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
	public static class Func_declarationContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public TerminalNode OPAREN() { return getToken(CminusParser.OPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(CminusParser.CPAREN, 0); }
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Func_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declaration; }
	}

	public final Func_declarationContext func_declaration() throws RecognitionException {
		Func_declarationContext _localctx = new Func_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type_specifier();
			setState(97);
			match(ID);
			setState(98);
			match(OPAREN);
			setState(99);
			params();
			setState(100);
			match(CPAREN);
			setState(101);
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
		enterRule(_localctx, 12, RULE_params);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				param_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
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
		enterRule(_localctx, 14, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			param();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(109);
				param();
				}
				}
				setState(114);
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
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(CminusParser.ID, 0); }
		public TerminalNode INT_TYPE() { return getToken(CminusParser.INT_TYPE, 0); }
		public TerminalNode OBRACKETS() { return getToken(CminusParser.OBRACKETS, 0); }
		public TerminalNode CBRACKETS() { return getToken(CminusParser.CBRACKETS, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				type_specifier();
				setState(116);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(INT_TYPE);
				setState(119);
				match(ID);
				setState(120);
				match(OBRACKETS);
				setState(121);
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
		public Local_declarationsContext local_declarations() {
			return getRuleContext(Local_declarationsContext.class,0);
		}
		public Statment_listContext statment_list() {
			return getRuleContext(Statment_listContext.class,0);
		}
		public TerminalNode CBRACES() { return getToken(CminusParser.CBRACES, 0); }
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(OBRACES);
			setState(125);
			local_declarations();
			setState(126);
			statment_list();
			setState(127);
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
		enterRule(_localctx, 20, RULE_local_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) {
				{
				{
				setState(129);
				var_declaration();
				}
				}
				setState(134);
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
		enterRule(_localctx, 22, RULE_statment_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1211182605370L) != 0)) {
				{
				{
				setState(135);
				statment();
				}
				}
				setState(140);
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
		enterRule(_localctx, 24, RULE_statment);
		try {
			setState(147);
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
				setState(141);
				expression_stmt();
				}
				break;
			case OBRACES:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				compound_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				selection_stmt();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				iteration_stmt();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				return_stmt();
				}
				break;
			case INPUT:
			case OUTPUT:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
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
		enterRule(_localctx, 26, RULE_expression_stmt);
		try {
			setState(153);
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
				setState(149);
				expression();
				setState(150);
				match(SC);
				}
				break;
			case SC:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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
		enterRule(_localctx, 28, RULE_selection_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(IF);
			setState(156);
			match(OPAREN);
			setState(157);
			expression();
			setState(158);
			match(CPAREN);
			setState(159);
			statment();
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(160);
				match(ELSE);
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
		enterRule(_localctx, 30, RULE_iteration_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(164);
				match(FOR);
				setState(165);
				for_cond();
				}
				break;
			case WHILE:
				{
				setState(166);
				match(WHILE);
				setState(167);
				while_cond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(170);
				compound_stmt();
				}
				break;
			case 2:
				{
				setState(171);
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
		enterRule(_localctx, 32, RULE_for_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(OPAREN);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 77311140864L) != 0)) {
				{
				setState(175);
				expression();
				}
			}

			setState(178);
			match(SC);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 77311140864L) != 0)) {
				{
				setState(179);
				expression();
				}
			}

			setState(182);
			match(SC);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 77311140864L) != 0)) {
				{
				setState(183);
				expression();
				}
			}

			setState(186);
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
		enterRule(_localctx, 34, RULE_while_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(OPAREN);
			setState(189);
			expression();
			setState(190);
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
		public TerminalNode SC() { return getToken(CminusParser.SC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(RET);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 77311140864L) != 0)) {
				{
				setState(193);
				expression();
				}
			}

			setState(196);
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
	public static class Io_stmtContext extends ParserRuleContext {
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Output_stmtContext output_stmt() {
			return getRuleContext(Output_stmtContext.class,0);
		}
		public TerminalNode SC() { return getToken(CminusParser.SC, 0); }
		public Io_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io_stmt; }
	}

	public final Io_stmtContext io_stmt() throws RecognitionException {
		Io_stmtContext _localctx = new Io_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_io_stmt);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				input_stmt();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				output_stmt();
				setState(200);
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
	public static class Input_stmtContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(CminusParser.INPUT, 0); }
		public TerminalNode OPAREN() { return getToken(CminusParser.OPAREN, 0); }
		public TerminalNode CPAREN() { return getToken(CminusParser.CPAREN, 0); }
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(INPUT);
			setState(205);
			match(OPAREN);
			setState(206);
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
	public static class Output_stmtContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(CminusParser.OUTPUT, 0); }
		public TerminalNode OPAREN() { return getToken(CminusParser.OPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(CminusParser.CPAREN, 0); }
		public Output_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_stmt; }
	}

	public final Output_stmtContext output_stmt() throws RecognitionException {
		Output_stmtContext _localctx = new Output_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_output_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(OUTPUT);
			setState(209);
			match(OPAREN);
			setState(210);
			expression();
			setState(211);
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
	public static class ExpressionContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CminusParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
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
		enterRule(_localctx, 44, RULE_expression);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				var();
				setState(214);
				match(ASSIGN);
				setState(217);
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
					{
					setState(215);
					expression();
					}
					break;
				case INPUT:
					{
					setState(216);
					input_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
		enterRule(_localctx, 46, RULE_var);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(223);
				match(ID);
				setState(224);
				match(OBRACKETS);
				setState(225);
				expression();
				setState(226);
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
		enterRule(_localctx, 48, RULE_simple_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		enterRule(_localctx, 50, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			logical_and_expression();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(233);
				match(OR);
				setState(234);
				logical_and_expression();
				}
				}
				setState(239);
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
		enterRule(_localctx, 52, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			relational_expression();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(241);
				match(AND);
				setState(242);
				relational_expression();
				}
				}
				setState(247);
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
		enterRule(_localctx, 54, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			additive_expression();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMP) {
				{
				{
				setState(249);
				match(COMP);
				setState(250);
				additive_expression();
				}
				}
				setState(255);
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
		enterRule(_localctx, 56, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			factor_expression();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(257);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
				factor_expression();
				}
				}
				setState(263);
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
		enterRule(_localctx, 58, RULE_factor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			unary_expression();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
				{
				{
				setState(265);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				unary_expression();
				}
				}
				setState(271);
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
		enterRule(_localctx, 60, RULE_unary_expression);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(PLUS);
				setState(273);
				unary_expression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(MINUS);
				setState(275);
				unary_expression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(NOT);
				setState(277);
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
				setState(278);
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
		enterRule(_localctx, 62, RULE_value);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(OPAREN);
				setState(282);
				expression();
				setState(283);
				match(CPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				var();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(289);
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
		enterRule(_localctx, 64, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ID);
			setState(293);
			match(OPAREN);
			setState(294);
			args();
			setState(295);
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
		enterRule(_localctx, 66, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 77311140864L) != 0)) {
				{
				setState(297);
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
		enterRule(_localctx, 68, RULE_args_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			expression();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(301);
				match(COMMA);
				setState(302);
				expression();
				}
				}
				setState(307);
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
		"\u0004\u0001+\u0135\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001K\b\u0001\u000b"+
		"\u0001\f\u0001L\u0001\u0002\u0001\u0002\u0003\u0002Q\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006j\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007o\b\u0007\n\u0007\f\u0007"+
		"r\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b{\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0005\n\u0083"+
		"\b\n\n\n\f\n\u0086\t\n\u0001\u000b\u0005\u000b\u0089\b\u000b\n\u000b\f"+
		"\u000b\u008c\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0094\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u009a\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00a3\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00a9\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ad\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00b1\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00b5\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b9"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00c3\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00cb"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00da\b\u0016\u0001\u0016\u0003\u0016\u00dd"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u00e5\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u00ec\b\u0019\n\u0019\f\u0019\u00ef\t\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00f4\b\u001a\n\u001a"+
		"\f\u001a\u00f7\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u00fc\b\u001b\n\u001b\f\u001b\u00ff\t\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u0104\b\u001c\n\u001c\f\u001c\u0107\t\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u010c\b\u001d\n\u001d\f\u001d\u010f"+
		"\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0118\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0123\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0003!\u012b\b!\u0001\"\u0001\"\u0001\"\u0005\"\u0130\b\"\n\"\f\"\u0133"+
		"\t\"\u0001\"\u0000\u0000#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0003\u0001"+
		"\u0000\u0006\t\u0001\u0000\u0013\u0014\u0001\u0000\u0015\u0017\u0139\u0000"+
		"F\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004P\u0001"+
		"\u0000\u0000\u0000\u0006Z\u0001\u0000\u0000\u0000\b^\u0001\u0000\u0000"+
		"\u0000\n`\u0001\u0000\u0000\u0000\fi\u0001\u0000\u0000\u0000\u000ek\u0001"+
		"\u0000\u0000\u0000\u0010z\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000"+
		"\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u008a\u0001\u0000\u0000"+
		"\u0000\u0018\u0093\u0001\u0000\u0000\u0000\u001a\u0099\u0001\u0000\u0000"+
		"\u0000\u001c\u009b\u0001\u0000\u0000\u0000\u001e\u00a8\u0001\u0000\u0000"+
		"\u0000 \u00ae\u0001\u0000\u0000\u0000\"\u00bc\u0001\u0000\u0000\u0000"+
		"$\u00c0\u0001\u0000\u0000\u0000&\u00ca\u0001\u0000\u0000\u0000(\u00cc"+
		"\u0001\u0000\u0000\u0000*\u00d0\u0001\u0000\u0000\u0000,\u00dc\u0001\u0000"+
		"\u0000\u0000.\u00e4\u0001\u0000\u0000\u00000\u00e6\u0001\u0000\u0000\u0000"+
		"2\u00e8\u0001\u0000\u0000\u00004\u00f0\u0001\u0000\u0000\u00006\u00f8"+
		"\u0001\u0000\u0000\u00008\u0100\u0001\u0000\u0000\u0000:\u0108\u0001\u0000"+
		"\u0000\u0000<\u0117\u0001\u0000\u0000\u0000>\u0122\u0001\u0000\u0000\u0000"+
		"@\u0124\u0001\u0000\u0000\u0000B\u012a\u0001\u0000\u0000\u0000D\u012c"+
		"\u0001\u0000\u0000\u0000FG\u0003\u0002\u0001\u0000GH\u0005\u0000\u0000"+
		"\u0001H\u0001\u0001\u0000\u0000\u0000IK\u0003\u0004\u0002\u0000JI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000NQ\u0003\u0006"+
		"\u0003\u0000OQ\u0003\n\u0005\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000Q\u0005\u0001\u0000\u0000\u0000RS\u0003\b\u0004\u0000ST\u0005"+
		"\u0011\u0000\u0000T[\u0001\u0000\u0000\u0000UV\u0005\u0007\u0000\u0000"+
		"VW\u0005\u0011\u0000\u0000WX\u0005&\u0000\u0000XY\u0005\u000e\u0000\u0000"+
		"Y[\u0005\'\u0000\u0000ZR\u0001\u0000\u0000\u0000ZU\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\]\u0005#\u0000\u0000]\u0007\u0001\u0000\u0000"+
		"\u0000^_\u0007\u0000\u0000\u0000_\t\u0001\u0000\u0000\u0000`a\u0003\b"+
		"\u0004\u0000ab\u0005\u0011\u0000\u0000bc\u0005$\u0000\u0000cd\u0003\f"+
		"\u0006\u0000de\u0005%\u0000\u0000ef\u0003\u0012\t\u0000f\u000b\u0001\u0000"+
		"\u0000\u0000gj\u0003\u000e\u0007\u0000hj\u0005\u0006\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000j\r\u0001\u0000\u0000\u0000"+
		"kp\u0003\u0010\b\u0000lm\u0005\"\u0000\u0000mo\u0003\u0010\b\u0000nl\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000q\u000f\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000st\u0003\b\u0004\u0000tu\u0005\u0011\u0000\u0000u{\u0001\u0000"+
		"\u0000\u0000vw\u0005\u0007\u0000\u0000wx\u0005\u0011\u0000\u0000xy\u0005"+
		"&\u0000\u0000y{\u0005\'\u0000\u0000zs\u0001\u0000\u0000\u0000zv\u0001"+
		"\u0000\u0000\u0000{\u0011\u0001\u0000\u0000\u0000|}\u0005(\u0000\u0000"+
		"}~\u0003\u0014\n\u0000~\u007f\u0003\u0016\u000b\u0000\u007f\u0080\u0005"+
		")\u0000\u0000\u0080\u0013\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u0006"+
		"\u0003\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0003\u0018\f\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0017\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0094\u0003\u001a\r\u0000"+
		"\u008e\u0094\u0003\u0012\t\u0000\u008f\u0094\u0003\u001c\u000e\u0000\u0090"+
		"\u0094\u0003\u001e\u000f\u0000\u0091\u0094\u0003$\u0012\u0000\u0092\u0094"+
		"\u0003&\u0013\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0093\u008e\u0001"+
		"\u0000\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0093\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0019\u0001\u0000\u0000\u0000\u0095\u0096\u0003"+
		",\u0016\u0000\u0096\u0097\u0005#\u0000\u0000\u0097\u009a\u0001\u0000\u0000"+
		"\u0000\u0098\u009a\u0005#\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u001b\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\u0001\u0000\u0000\u009c\u009d\u0005$\u0000\u0000\u009d"+
		"\u009e\u0003,\u0016\u0000\u009e\u009f\u0005%\u0000\u0000\u009f\u00a2\u0003"+
		"\u0018\f\u0000\u00a0\u00a1\u0005\u0002\u0000\u0000\u00a1\u00a3\u0003\u0018"+
		"\f\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u001d\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0003\u0000"+
		"\u0000\u00a5\u00a9\u0003 \u0010\u0000\u00a6\u00a7\u0005\u0004\u0000\u0000"+
		"\u00a7\u00a9\u0003\"\u0011\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0003\u0012\t\u0000\u00ab\u00ad\u0003\u0018\f\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u001f"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005$\u0000\u0000\u00af\u00b1\u0003"+
		",\u0016\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005#\u0000"+
		"\u0000\u00b3\u00b5\u0003,\u0016\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b8\u0005#\u0000\u0000\u00b7\u00b9\u0003,\u0016\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005%\u0000\u0000\u00bb!\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005$\u0000\u0000\u00bd\u00be\u0003,\u0016\u0000"+
		"\u00be\u00bf\u0005%\u0000\u0000\u00bf#\u0001\u0000\u0000\u0000\u00c0\u00c2"+
		"\u0005\u0005\u0000\u0000\u00c1\u00c3\u0003,\u0016\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0005#\u0000\u0000\u00c5%\u0001\u0000\u0000"+
		"\u0000\u00c6\u00cb\u0003(\u0014\u0000\u00c7\u00c8\u0003*\u0015\u0000\u00c8"+
		"\u00c9\u0005#\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c6"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00cb\'\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005\u000f\u0000\u0000\u00cd\u00ce\u0005"+
		"$\u0000\u0000\u00ce\u00cf\u0005%\u0000\u0000\u00cf)\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005\u0010\u0000\u0000\u00d1\u00d2\u0005$\u0000\u0000"+
		"\u00d2\u00d3\u0003,\u0016\u0000\u00d3\u00d4\u0005%\u0000\u0000\u00d4+"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003.\u0017\u0000\u00d6\u00d9\u0005"+
		"\u0012\u0000\u0000\u00d7\u00da\u0003,\u0016\u0000\u00d8\u00da\u0003(\u0014"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00dd\u00030\u0018\u0000"+
		"\u00dc\u00d5\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd-\u0001\u0000\u0000\u0000\u00de\u00e5\u0005\u0011\u0000\u0000\u00df"+
		"\u00e0\u0005\u0011\u0000\u0000\u00e0\u00e1\u0005&\u0000\u0000\u00e1\u00e2"+
		"\u0003,\u0016\u0000\u00e2\u00e3\u0005\'\u0000\u0000\u00e3\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e4\u00de\u0001\u0000\u0000\u0000\u00e4\u00df\u0001"+
		"\u0000\u0000\u0000\u00e5/\u0001\u0000\u0000\u0000\u00e6\u00e7\u00032\u0019"+
		"\u0000\u00e71\u0001\u0000\u0000\u0000\u00e8\u00ed\u00034\u001a\u0000\u00e9"+
		"\u00ea\u0005 \u0000\u0000\u00ea\u00ec\u00034\u001a\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee3\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f5\u00036\u001b"+
		"\u0000\u00f1\u00f2\u0005\u001f\u0000\u0000\u00f2\u00f4\u00036\u001b\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f65\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fd\u00038\u001c\u0000\u00f9\u00fa\u0005\u0018\u0000\u0000\u00fa\u00fc"+
		"\u00038\u001c\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fe7\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u0100\u0105\u0003:\u001d\u0000\u0101\u0102\u0007\u0001\u0000"+
		"\u0000\u0102\u0104\u0003:\u001d\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u01069\u0001\u0000\u0000\u0000\u0107"+
		"\u0105\u0001\u0000\u0000\u0000\u0108\u010d\u0003<\u001e\u0000\u0109\u010a"+
		"\u0007\u0002\u0000\u0000\u010a\u010c\u0003<\u001e\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e;\u0001\u0000"+
		"\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0013"+
		"\u0000\u0000\u0111\u0118\u0003<\u001e\u0000\u0112\u0113\u0005\u0014\u0000"+
		"\u0000\u0113\u0118\u0003<\u001e\u0000\u0114\u0115\u0005!\u0000\u0000\u0115"+
		"\u0118\u0003<\u001e\u0000\u0116\u0118\u0003>\u001f\u0000\u0117\u0110\u0001"+
		"\u0000\u0000\u0000\u0117\u0112\u0001\u0000\u0000\u0000\u0117\u0114\u0001"+
		"\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118=\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0005$\u0000\u0000\u011a\u011b\u0003,\u0016\u0000"+
		"\u011b\u011c\u0005%\u0000\u0000\u011c\u0123\u0001\u0000\u0000\u0000\u011d"+
		"\u0123\u0005\u000e\u0000\u0000\u011e\u0123\u0005\n\u0000\u0000\u011f\u0123"+
		"\u0005\r\u0000\u0000\u0120\u0123\u0003.\u0017\u0000\u0121\u0123\u0003"+
		"@ \u0000\u0122\u0119\u0001\u0000\u0000\u0000\u0122\u011d\u0001\u0000\u0000"+
		"\u0000\u0122\u011e\u0001\u0000\u0000\u0000\u0122\u011f\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000"+
		"\u0000\u0123?\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0011\u0000\u0000"+
		"\u0125\u0126\u0005$\u0000\u0000\u0126\u0127\u0003B!\u0000\u0127\u0128"+
		"\u0005%\u0000\u0000\u0128A\u0001\u0000\u0000\u0000\u0129\u012b\u0003D"+
		"\"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012bC\u0001\u0000\u0000\u0000\u012c\u0131\u0003,\u0016\u0000\u012d"+
		"\u012e\u0005\"\u0000\u0000\u012e\u0130\u0003,\u0016\u0000\u012f\u012d"+
		"\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f"+
		"\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132E\u0001"+
		"\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u001eLPZipz\u0084"+
		"\u008a\u0093\u0099\u00a2\u00a8\u00ac\u00b0\u00b4\u00b8\u00c2\u00ca\u00d9"+
		"\u00dc\u00e4\u00ed\u00f5\u00fd\u0105\u010d\u0117\u0122\u012a\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}