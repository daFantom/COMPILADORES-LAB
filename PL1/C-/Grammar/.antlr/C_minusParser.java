// Generated from c:/Users/pavei/Desktop/Git/COMPILADORES-LAB/PL1/C-/Grammar/C_minus.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class C_minusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SINGLE_QUOTES=11, IF=12, ELSE=13, FOR=14, WHILE=15, BOOL=16, 
		RET=17, INT_TYPE=18, CHAR_TYPE=19, BOOL_TYPE=20, BOOL_TRUE=21, BOOL_FALSE=22, 
		VOID_TYPE=23, CHAR=24, ID=25, INT=26, EQUAL=27, COMP=28, NEG=29, MINUS=30, 
		ADDOP=31, MULOP=32, COMMENT=33, WS=34;
	public static final int
		RULE_prog = 0, RULE_declaration_list = 1, RULE_declaration = 2, RULE_var_declaration = 3, 
		RULE_func_declaration = 4, RULE_params = 5, RULE_param_list = 6, RULE_param = 7, 
		RULE_compound_stmt = 8, RULE_local_declarations = 9, RULE_statment_list = 10, 
		RULE_statment = 11, RULE_expression_stmt = 12, RULE_selection_stmt = 13, 
		RULE_iteration_stmt = 14, RULE_for_cond = 15, RULE_while_cond = 16, RULE_return_stmt = 17, 
		RULE_expression = 18, RULE_var = 19, RULE_simple_expression = 20, RULE_additive_expression = 21, 
		RULE_term = 22, RULE_value = 23, RULE_call = 24, RULE_args = 25, RULE_args_list = 26, 
		RULE_inputfun = 27, RULE_outputfun = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration_list", "declaration", "var_declaration", "func_declaration", 
			"params", "param_list", "param", "compound_stmt", "local_declarations", 
			"statment_list", "statment", "expression_stmt", "selection_stmt", "iteration_stmt", 
			"for_cond", "while_cond", "return_stmt", "expression", "var", "simple_expression", 
			"additive_expression", "term", "value", "call", "args", "args_list", 
			"inputfun", "outputfun"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "';'", "'('", "')'", "','", "'{'", "'}'", "'input'", 
			"'output'", "'''", "'if'", "'else'", "'for'", "'while'", null, "'return'", 
			"'int'", "'char'", "'bool'", "'true'", "'false'", "'void'", null, null, 
			null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SINGLE_QUOTES", 
			"IF", "ELSE", "FOR", "WHILE", "BOOL", "RET", "INT_TYPE", "CHAR_TYPE", 
			"BOOL_TYPE", "BOOL_TRUE", "BOOL_FALSE", "VOID_TYPE", "CHAR", "ID", "INT", 
			"EQUAL", "COMP", "NEG", "MINUS", "ADDOP", "MULOP", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "C_minus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public C_minusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<Declaration_listContext> declaration_list() {
			return getRuleContexts(Declaration_listContext.class);
		}
		public Declaration_listContext declaration_list(int i) {
			return getRuleContext(Declaration_listContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				declaration_list();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10223616L) != 0) );
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(63);
					declaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(66); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
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
		public TerminalNode ID() { return getToken(C_minusParser.ID, 0); }
		public TerminalNode INT_TYPE() { return getToken(C_minusParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(C_minusParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(C_minusParser.BOOL_TYPE, 0); }
		public TerminalNode INT() { return getToken(C_minusParser.INT, 0); }
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(72);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(73);
				match(ID);
				}
				break;
			case 2:
				{
				{
				setState(74);
				match(INT_TYPE);
				setState(75);
				match(ID);
				setState(76);
				match(T__0);
				setState(77);
				match(INT);
				setState(78);
				match(T__1);
				}
				}
				break;
			}
			setState(81);
			match(T__2);
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
		public TerminalNode ID() { return getToken(C_minusParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public TerminalNode INT_TYPE() { return getToken(C_minusParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(C_minusParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(C_minusParser.BOOL_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(C_minusParser.VOID_TYPE, 0); }
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
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 10223616L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(84);
			match(ID);
			setState(85);
			match(T__3);
			setState(86);
			params();
			setState(87);
			match(T__4);
			setState(88);
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
		public TerminalNode VOID_TYPE() { return getToken(C_minusParser.VOID_TYPE, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				param_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
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
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
	}

	public final Param_listContext param_list() throws RecognitionException {
		return param_list(0);
	}

	private Param_listContext param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Param_listContext _localctx = new Param_listContext(_ctx, _parentState);
		Param_listContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(95);
			param();
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_param_list);
					setState(97);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(98);
					match(T__5);
					setState(99);
					param();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(C_minusParser.ID, 0); }
		public TerminalNode INT_TYPE() { return getToken(C_minusParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(C_minusParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(C_minusParser.BOOL_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(C_minusParser.VOID_TYPE, 0); }
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 10223616L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(INT_TYPE);
				setState(108);
				match(ID);
				setState(109);
				match(T__0);
				setState(110);
				match(T__1);
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
			setState(113);
			match(T__6);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1730139800L) != 0)) {
				{
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case CHAR_TYPE:
				case BOOL_TYPE:
					{
					setState(114);
					local_declarations();
					}
					break;
				case T__2:
				case T__3:
				case T__6:
				case T__8:
				case T__9:
				case IF:
				case FOR:
				case WHILE:
				case BOOL:
				case RET:
				case CHAR:
				case ID:
				case INT:
				case NEG:
				case MINUS:
					{
					setState(115);
					statment_list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(T__7);
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
			setState(124); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(123);
					var_declaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126); 
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
			setState(129); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(128);
					statment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public InputfunContext inputfun() {
			return getRuleContext(InputfunContext.class,0);
		}
		public OutputfunContext outputfun() {
			return getRuleContext(OutputfunContext.class,0);
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
			case T__2:
			case T__3:
			case BOOL:
			case CHAR:
			case ID:
			case INT:
			case NEG:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				expression_stmt();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				compound_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				selection_stmt();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				iteration_stmt();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				return_stmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				inputfun();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				outputfun();
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
			case T__3:
			case BOOL:
			case CHAR:
			case ID:
			case INT:
			case NEG:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(142);
				expression();
				setState(143);
				match(T__2);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__2);
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
		public TerminalNode IF() { return getToken(C_minusParser.IF, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(C_minusParser.ELSE, 0); }
		public Selection_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_stmt; }
	}

	public final Selection_stmtContext selection_stmt() throws RecognitionException {
		Selection_stmtContext _localctx = new Selection_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selection_stmt);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(148);
				match(IF);
				setState(149);
				match(T__3);
				setState(150);
				simple_expression();
				setState(151);
				match(T__4);
				setState(152);
				statment();
				setState(153);
				match(ELSE);
				setState(154);
				statment();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(156);
				match(IF);
				setState(157);
				match(T__3);
				setState(158);
				simple_expression();
				setState(159);
				match(T__4);
				setState(160);
				statment();
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
	public static class Iteration_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(C_minusParser.FOR, 0); }
		public For_condContext for_cond() {
			return getRuleContext(For_condContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(C_minusParser.WHILE, 0); }
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
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
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
			setState(174);
			match(T__3);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1728118800L) != 0)) {
				{
				setState(175);
				expression();
				}
			}

			setState(178);
			match(T__2);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1728118800L) != 0)) {
				{
				setState(179);
				expression();
				}
			}

			setState(182);
			match(T__2);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1728118800L) != 0)) {
				{
				setState(183);
				expression();
				}
			}

			setState(186);
			match(T__4);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(188);
			match(T__3);
			setState(189);
			expression();
			setState(190);
			match(T__4);
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
		public TerminalNode RET() { return getToken(C_minusParser.RET, 0); }
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
		enterRule(_localctx, 34, RULE_return_stmt);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(RET);
				setState(193);
				expression();
				setState(194);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(RET);
				setState(197);
				match(T__2);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(C_minusParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(C_minusParser.EQUAL, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(203); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(200);
						var();
						setState(201);
						match(EQUAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(205); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(207);
				expression();
				}
				break;
			case 2:
				{
				setState(209);
				simple_expression();
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(C_minusParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
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
				match(T__0);
				setState(215);
				expression();
				setState(216);
				match(T__1);
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
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode COMP() { return getToken(C_minusParser.COMP, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
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
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(220);
				additive_expression();
				setState(221);
				match(COMP);
				setState(222);
				simple_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				additive_expression();
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
	public static class Additive_expressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ADDOP() { return getToken(C_minusParser.ADDOP, 0); }
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(C_minusParser.MINUS, 0); }
		public List<TerminalNode> NEG() { return getTokens(C_minusParser.NEG); }
		public TerminalNode NEG(int i) {
			return getToken(C_minusParser.NEG, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_additive_expression);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(227);
				term();
				setState(228);
				match(ADDOP);
				setState(229);
				additive_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUS) {
						{
						setState(231);
						match(MINUS);
						}
					}

					}
					break;
				case 2:
					{
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEG) {
						{
						{
						setState(234);
						match(NEG);
						}
						}
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(242);
				term();
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
	public static class TermContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode MULOP() { return getToken(C_minusParser.MULOP, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_term);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(245);
				value();
				setState(246);
				match(MULOP);
				setState(247);
				term();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				value();
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(C_minusParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(C_minusParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(C_minusParser.CHAR, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(BOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				var();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				match(T__3);
				setState(258);
				simple_expression();
				setState(259);
				match(T__4);
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
		public TerminalNode ID() { return getToken(C_minusParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ID);
			setState(264);
			match(T__3);
			setState(265);
			args();
			setState(266);
			match(T__4);
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
		public List<Args_listContext> args_list() {
			return getRuleContexts(Args_listContext.class);
		}
		public Args_listContext args_list(int i) {
			return getRuleContext(Args_listContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1728118800L) != 0)) {
				{
				{
				setState(268);
				args_list(0);
				}
				}
				setState(273);
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
	public static class Args_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Args_listContext args_list() {
			return getRuleContext(Args_listContext.class,0);
		}
		public Args_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_list; }
	}

	public final Args_listContext args_list() throws RecognitionException {
		return args_list(0);
	}

	private Args_listContext args_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Args_listContext _localctx = new Args_listContext(_ctx, _parentState);
		Args_listContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_args_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(275);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Args_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args_list);
					setState(277);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(278);
					match(T__5);
					setState(279);
					expression();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputfunContext extends ParserRuleContext {
		public InputfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputfun; }
	}

	public final InputfunContext inputfun() throws RecognitionException {
		InputfunContext _localctx = new InputfunContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inputfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__8);
			setState(286);
			match(T__3);
			setState(287);
			match(T__4);
			setState(288);
			match(T__2);
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
	public static class OutputfunContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode INT() { return getToken(C_minusParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(C_minusParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(C_minusParser.BOOL, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public OutputfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputfun; }
	}

	public final OutputfunContext outputfun() throws RecognitionException {
		OutputfunContext _localctx = new OutputfunContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_outputfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__9);
			setState(291);
			match(T__3);
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(292);
				var();
				}
				break;
			case 2:
				{
				setState(293);
				match(INT);
				}
				break;
			case 3:
				{
				setState(294);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(295);
				match(BOOL);
				}
				break;
			case 5:
				{
				setState(296);
				simple_expression();
				}
				break;
			}
			setState(299);
			match(T__4);
			setState(300);
			match(T__2);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return param_list_sempred((Param_listContext)_localctx, predIndex);
		case 26:
			return args_list_sempred((Args_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean param_list_sempred(Param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean args_list_sempred(Args_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u012f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0004\u0000<\b\u0000\u000b\u0000"+
		"\f\u0000=\u0001\u0001\u0004\u0001A\b\u0001\u000b\u0001\f\u0001B\u0001"+
		"\u0002\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003P\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005]\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006e\b\u0006\n\u0006\f\u0006h\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007p\b\u0007\u0001\b\u0001\b\u0001\b\u0005\bu\b\b\n\b\f\bx\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0004\t}\b\t\u000b\t\f\t~\u0001\n\u0004\n\u0082\b\n"+
		"\u000b\n\f\n\u0083\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008d\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0093\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00a3\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00a9\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ad\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00b1\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00b5\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b9\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00c7\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0004"+
		"\u0012\u00cc\b\u0012\u000b\u0012\f\u0012\u00cd\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00d3\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00db\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00e2\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00e9\b\u0015\u0001\u0015\u0005\u0015\u00ec\b\u0015\n\u0015\f\u0015\u00ef"+
		"\t\u0015\u0003\u0015\u00f1\b\u0015\u0001\u0015\u0003\u0015\u00f4\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u00fb\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0106\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0005\u0019\u010e\b\u0019\n\u0019\f\u0019\u0111\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0119"+
		"\b\u001a\n\u001a\f\u001a\u011c\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u012a\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0002\f4\u001d\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468\u0000\u0002\u0001\u0000\u0012\u0014\u0002\u0000\u0012\u0014"+
		"\u0017\u0017\u013e\u0000;\u0001\u0000\u0000\u0000\u0002@\u0001\u0000\u0000"+
		"\u0000\u0004F\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\b"+
		"S\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\f^\u0001\u0000\u0000"+
		"\u0000\u000eo\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012"+
		"|\u0001\u0000\u0000\u0000\u0014\u0081\u0001\u0000\u0000\u0000\u0016\u008c"+
		"\u0001\u0000\u0000\u0000\u0018\u0092\u0001\u0000\u0000\u0000\u001a\u00a2"+
		"\u0001\u0000\u0000\u0000\u001c\u00a8\u0001\u0000\u0000\u0000\u001e\u00ae"+
		"\u0001\u0000\u0000\u0000 \u00bc\u0001\u0000\u0000\u0000\"\u00c6\u0001"+
		"\u0000\u0000\u0000$\u00d2\u0001\u0000\u0000\u0000&\u00da\u0001\u0000\u0000"+
		"\u0000(\u00e1\u0001\u0000\u0000\u0000*\u00f3\u0001\u0000\u0000\u0000,"+
		"\u00fa\u0001\u0000\u0000\u0000.\u0105\u0001\u0000\u0000\u00000\u0107\u0001"+
		"\u0000\u0000\u00002\u010f\u0001\u0000\u0000\u00004\u0112\u0001\u0000\u0000"+
		"\u00006\u011d\u0001\u0000\u0000\u00008\u0122\u0001\u0000\u0000\u0000:"+
		"<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0001\u0001"+
		"\u0000\u0000\u0000?A\u0003\u0004\u0002\u0000@?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000C\u0003\u0001\u0000\u0000\u0000DG\u0003\u0006\u0003\u0000EG\u0003"+
		"\b\u0004\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0005"+
		"\u0001\u0000\u0000\u0000HI\u0007\u0000\u0000\u0000IP\u0005\u0019\u0000"+
		"\u0000JK\u0005\u0012\u0000\u0000KL\u0005\u0019\u0000\u0000LM\u0005\u0001"+
		"\u0000\u0000MN\u0005\u001a\u0000\u0000NP\u0005\u0002\u0000\u0000OH\u0001"+
		"\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QR\u0005\u0003\u0000\u0000R\u0007\u0001\u0000\u0000\u0000ST\u0007\u0001"+
		"\u0000\u0000TU\u0005\u0019\u0000\u0000UV\u0005\u0004\u0000\u0000VW\u0003"+
		"\n\u0005\u0000WX\u0005\u0005\u0000\u0000XY\u0003\u0010\b\u0000Y\t\u0001"+
		"\u0000\u0000\u0000Z]\u0003\f\u0006\u0000[]\u0005\u0017\u0000\u0000\\Z"+
		"\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u000b\u0001\u0000"+
		"\u0000\u0000^_\u0006\u0006\uffff\uffff\u0000_`\u0003\u000e\u0007\u0000"+
		"`f\u0001\u0000\u0000\u0000ab\n\u0002\u0000\u0000bc\u0005\u0006\u0000\u0000"+
		"ce\u0003\u000e\u0007\u0000da\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\r\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0007\u0001\u0000\u0000jp\u0005"+
		"\u0019\u0000\u0000kl\u0005\u0012\u0000\u0000lm\u0005\u0019\u0000\u0000"+
		"mn\u0005\u0001\u0000\u0000np\u0005\u0002\u0000\u0000oi\u0001\u0000\u0000"+
		"\u0000ok\u0001\u0000\u0000\u0000p\u000f\u0001\u0000\u0000\u0000qv\u0005"+
		"\u0007\u0000\u0000ru\u0003\u0012\t\u0000su\u0003\u0014\n\u0000tr\u0001"+
		"\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000yz\u0005\b\u0000\u0000z\u0011\u0001\u0000"+
		"\u0000\u0000{}\u0003\u0006\u0003\u0000|{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0013\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0016\u000b"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085\u008d\u0003\u0018\f\u0000"+
		"\u0086\u008d\u0003\u0010\b\u0000\u0087\u008d\u0003\u001a\r\u0000\u0088"+
		"\u008d\u0003\u001c\u000e\u0000\u0089\u008d\u0003\"\u0011\u0000\u008a\u008d"+
		"\u00036\u001b\u0000\u008b\u008d\u00038\u001c\u0000\u008c\u0085\u0001\u0000"+
		"\u0000\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u0087\u0001\u0000"+
		"\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008c\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u0017\u0001\u0000\u0000\u0000\u008e\u008f\u0003$\u0012"+
		"\u0000\u008f\u0090\u0005\u0003\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0005\u0003\u0000\u0000\u0092\u008e\u0001\u0000\u0000"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0019\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\f\u0000\u0000\u0095\u0096\u0005\u0004\u0000\u0000"+
		"\u0096\u0097\u0003(\u0014\u0000\u0097\u0098\u0005\u0005\u0000\u0000\u0098"+
		"\u0099\u0003\u0016\u000b\u0000\u0099\u009a\u0005\r\u0000\u0000\u009a\u009b"+
		"\u0003\u0016\u000b\u0000\u009b\u00a3\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005\f\u0000\u0000\u009d\u009e\u0005\u0004\u0000\u0000\u009e\u009f\u0003"+
		"(\u0014\u0000\u009f\u00a0\u0005\u0005\u0000\u0000\u00a0\u00a1\u0003\u0016"+
		"\u000b\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u0094\u0001\u0000"+
		"\u0000\u0000\u00a2\u009c\u0001\u0000\u0000\u0000\u00a3\u001b\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005\u000e\u0000\u0000\u00a5\u00a9\u0003\u001e"+
		"\u000f\u0000\u00a6\u00a7\u0005\u000f\u0000\u0000\u00a7\u00a9\u0003 \u0010"+
		"\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00ad\u0003\u0010\b\u0000"+
		"\u00ab\u00ad\u0003\u0016\u000b\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u001d\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0005\u0004\u0000\u0000\u00af\u00b1\u0003$\u0012\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005\u0003\u0000\u0000\u00b3"+
		"\u00b5\u0003$\u0012\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u0005\u0003\u0000\u0000\u00b7\u00b9\u0003$\u0012\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005\u0005\u0000\u0000\u00bb\u001f\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u0004\u0000\u0000\u00bd\u00be\u0003"+
		"$\u0012\u0000\u00be\u00bf\u0005\u0005\u0000\u0000\u00bf!\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0011\u0000\u0000\u00c1\u00c2\u0003$\u0012\u0000"+
		"\u00c2\u00c3\u0005\u0003\u0000\u0000\u00c3\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0011\u0000\u0000\u00c5\u00c7\u0005\u0003\u0000\u0000"+
		"\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c7#\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003&\u0013\u0000\u00c9\u00ca"+
		"\u0005\u001b\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c8"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003$\u0012\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d3\u0003(\u0014\u0000\u00d2\u00cb\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3%\u0001\u0000\u0000"+
		"\u0000\u00d4\u00db\u0005\u0019\u0000\u0000\u00d5\u00d6\u0005\u0019\u0000"+
		"\u0000\u00d6\u00d7\u0005\u0001\u0000\u0000\u00d7\u00d8\u0003$\u0012\u0000"+
		"\u00d8\u00d9\u0005\u0002\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000"+
		"\u00da\u00d4\u0001\u0000\u0000\u0000\u00da\u00d5\u0001\u0000\u0000\u0000"+
		"\u00db\'\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003*\u0015\u0000\u00dd"+
		"\u00de\u0005\u001c\u0000\u0000\u00de\u00df\u0003(\u0014\u0000\u00df\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e2\u0003*\u0015\u0000\u00e1\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2)\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0003,\u0016\u0000\u00e4\u00e5\u0005\u001f\u0000"+
		"\u0000\u00e5\u00e6\u0003*\u0015\u0000\u00e6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e9\u0005\u001e\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ec\u0005\u001d\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00e8\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0003,\u0016\u0000\u00f3\u00e3\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f4+\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0003.\u0017\u0000\u00f6\u00f7\u0005 \u0000\u0000\u00f7\u00f8\u0003,"+
		"\u0016\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00fb\u0003.\u0017"+
		"\u0000\u00fa\u00f5\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb-\u0001\u0000\u0000\u0000\u00fc\u0106\u0005\u0010\u0000\u0000"+
		"\u00fd\u0106\u0005\u001a\u0000\u0000\u00fe\u0106\u0005\u0018\u0000\u0000"+
		"\u00ff\u0106\u0003&\u0013\u0000\u0100\u0106\u00030\u0018\u0000\u0101\u0102"+
		"\u0005\u0004\u0000\u0000\u0102\u0103\u0003(\u0014\u0000\u0103\u0104\u0005"+
		"\u0005\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u00fc\u0001"+
		"\u0000\u0000\u0000\u0105\u00fd\u0001\u0000\u0000\u0000\u0105\u00fe\u0001"+
		"\u0000\u0000\u0000\u0105\u00ff\u0001\u0000\u0000\u0000\u0105\u0100\u0001"+
		"\u0000\u0000\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0106/\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005\u0019\u0000\u0000\u0108\u0109\u0005\u0004"+
		"\u0000\u0000\u0109\u010a\u00032\u0019\u0000\u010a\u010b\u0005\u0005\u0000"+
		"\u0000\u010b1\u0001\u0000\u0000\u0000\u010c\u010e\u00034\u001a\u0000\u010d"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"3\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0006\u001a\uffff\uffff\u0000\u0113\u0114\u0003$\u0012\u0000\u0114\u011a"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\n\u0002\u0000\u0000\u0116\u0117\u0005"+
		"\u0006\u0000\u0000\u0117\u0119\u0003$\u0012\u0000\u0118\u0115\u0001\u0000"+
		"\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b5\u0001\u0000\u0000"+
		"\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u011e\u0005\t\u0000\u0000"+
		"\u011e\u011f\u0005\u0004\u0000\u0000\u011f\u0120\u0005\u0005\u0000\u0000"+
		"\u0120\u0121\u0005\u0003\u0000\u0000\u01217\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005\n\u0000\u0000\u0123\u0129\u0005\u0004\u0000\u0000\u0124\u012a"+
		"\u0003&\u0013\u0000\u0125\u012a\u0005\u001a\u0000\u0000\u0126\u012a\u0005"+
		"\u0018\u0000\u0000\u0127\u012a\u0005\u0010\u0000\u0000\u0128\u012a\u0003"+
		"(\u0014\u0000\u0129\u0124\u0001\u0000\u0000\u0000\u0129\u0125\u0001\u0000"+
		"\u0000\u0000\u0129\u0126\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0005\u0005\u0000\u0000\u012c\u012d\u0005\u0003"+
		"\u0000\u0000\u012d9\u0001\u0000\u0000\u0000!=BFO\\fotv~\u0083\u008c\u0092"+
		"\u00a2\u00a8\u00ac\u00b0\u00b4\u00b8\u00c6\u00cd\u00d2\u00da\u00e1\u00e8"+
		"\u00ed\u00f0\u00f3\u00fa\u0105\u010f\u011a\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}