// Generated from D:/Study/Compilers/Course Project/TenetCompiler/TenetCompiler/antlr\Tenet.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TenetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, BASIC_TYPES=4, INTEGER=5, REAL=6, STRING=7, BINARY=8, 
		TERNARY=9, OCTAL=10, HEXADECIMAL=11, DECIMAL=12, FUNCTION=13, VAR=14, 
		CONST=15, ASSIGN=16, TYPE_SPECIFIER=17, TYPE=18, EOO=19, IDENTIFIER=20, 
		ALPHA=21, DIGIT=22, WHITESPACE=23;
	public static final int
		RULE_program = 0, RULE_instructions = 1, RULE_operation = 2, RULE_declare_function = 3, 
		RULE_define_variable = 4, RULE_define_constant = 5, RULE_function_arguments = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instructions", "operation", "declare_function", "define_variable", 
			"define_constant", "function_arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", null, null, null, null, null, null, null, 
			null, null, "'function'", "'var'", "'const'", "'='", "':'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "BASIC_TYPES", "INTEGER", "REAL", "STRING", "BINARY", 
			"TERNARY", "OCTAL", "HEXADECIMAL", "DECIMAL", "FUNCTION", "VAR", "CONST", 
			"ASSIGN", "TYPE_SPECIFIER", "TYPE", "EOO", "IDENTIFIER", "ALPHA", "DIGIT", 
			"WHITESPACE"
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
	public String getGrammarFileName() { return "Tenet.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TenetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TenetVisitor ) return ((TenetVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			instructions();
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

	public static class InstructionsContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TenetParser.EOF, 0); }
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TenetVisitor ) return ((TenetVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructions);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case VAR:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				operation();
				setState(17);
				instructions();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(EOF);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode EOO() { return getToken(TenetParser.EOO, 0); }
		public Declare_functionContext declare_function() {
			return getRuleContext(Declare_functionContext.class,0);
		}
		public Define_variableContext define_variable() {
			return getRuleContext(Define_variableContext.class,0);
		}
		public Define_constantContext define_constant() {
			return getRuleContext(Define_constantContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TenetVisitor ) return ((TenetVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				setState(22);
				declare_function();
				}
				break;
			case VAR:
				{
				setState(23);
				define_variable();
				}
				break;
			case CONST:
				{
				setState(24);
				define_constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(27);
			match(EOO);
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

	public static class Declare_functionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(TenetParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TenetParser.IDENTIFIER, 0); }
		public Function_argumentsContext function_arguments() {
			return getRuleContext(Function_argumentsContext.class,0);
		}
		public TerminalNode TYPE_SPECIFIER() { return getToken(TenetParser.TYPE_SPECIFIER, 0); }
		public TerminalNode TYPE() { return getToken(TenetParser.TYPE, 0); }
		public Declare_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).enterDeclare_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).exitDeclare_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TenetVisitor ) return ((TenetVisitor<? extends T>)visitor).visitDeclare_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_functionContext declare_function() throws RecognitionException {
		Declare_functionContext _localctx = new Declare_functionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(FUNCTION);
			setState(30);
			match(IDENTIFIER);
			setState(31);
			match(T__0);
			setState(32);
			function_arguments(0);
			setState(33);
			match(T__1);
			setState(34);
			match(TYPE_SPECIFIER);
			setState(35);
			match(TYPE);
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

	public static class Define_variableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(TenetParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TenetParser.IDENTIFIER, 0); }
		public TerminalNode TYPE_SPECIFIER() { return getToken(TenetParser.TYPE_SPECIFIER, 0); }
		public TerminalNode TYPE() { return getToken(TenetParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(TenetParser.ASSIGN, 0); }
		public TerminalNode BASIC_TYPES() { return getToken(TenetParser.BASIC_TYPES, 0); }
		public Define_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).enterDefine_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).exitDefine_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TenetVisitor ) return ((TenetVisitor<? extends T>)visitor).visitDefine_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_variableContext define_variable() throws RecognitionException {
		Define_variableContext _localctx = new Define_variableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(VAR);
			setState(38);
			match(IDENTIFIER);
			setState(39);
			match(TYPE_SPECIFIER);
			setState(40);
			match(TYPE);
			setState(41);
			match(ASSIGN);
			setState(42);
			match(BASIC_TYPES);
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

	public static class Define_constantContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(TenetParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TenetParser.IDENTIFIER, 0); }
		public TerminalNode TYPE_SPECIFIER() { return getToken(TenetParser.TYPE_SPECIFIER, 0); }
		public TerminalNode TYPE() { return getToken(TenetParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(TenetParser.ASSIGN, 0); }
		public TerminalNode BASIC_TYPES() { return getToken(TenetParser.BASIC_TYPES, 0); }
		public Define_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).enterDefine_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).exitDefine_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TenetVisitor ) return ((TenetVisitor<? extends T>)visitor).visitDefine_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_constantContext define_constant() throws RecognitionException {
		Define_constantContext _localctx = new Define_constantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_define_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(CONST);
			setState(45);
			match(IDENTIFIER);
			setState(46);
			match(TYPE_SPECIFIER);
			setState(47);
			match(TYPE);
			setState(48);
			match(ASSIGN);
			setState(49);
			match(BASIC_TYPES);
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

	public static class Function_argumentsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TenetParser.IDENTIFIER, 0); }
		public TerminalNode TYPE_SPECIFIER() { return getToken(TenetParser.TYPE_SPECIFIER, 0); }
		public TerminalNode TYPE() { return getToken(TenetParser.TYPE, 0); }
		public List<Function_argumentsContext> function_arguments() {
			return getRuleContexts(Function_argumentsContext.class);
		}
		public Function_argumentsContext function_arguments(int i) {
			return getRuleContext(Function_argumentsContext.class,i);
		}
		public Function_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).enterFunction_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TenetListener ) ((TenetListener)listener).exitFunction_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TenetVisitor ) return ((TenetVisitor<? extends T>)visitor).visitFunction_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentsContext function_arguments() throws RecognitionException {
		return function_arguments(0);
	}

	private Function_argumentsContext function_arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_argumentsContext _localctx = new Function_argumentsContext(_ctx, _parentState);
		Function_argumentsContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_function_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(52);
			match(IDENTIFIER);
			setState(53);
			match(TYPE_SPECIFIER);
			setState(54);
			match(TYPE);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_argumentsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_arguments);
					setState(56);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(57);
					match(T__2);
					setState(58);
					function_arguments(3);
					}
					} 
				}
				setState(63);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return function_arguments_sempred((Function_argumentsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean function_arguments_sempred(Function_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3\5\3"+
		"\27\n\3\3\4\3\4\3\4\5\4\34\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b>\n\b\f\b\16\bA\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16"+
		"\2\2\2?\2\20\3\2\2\2\4\26\3\2\2\2\6\33\3\2\2\2\b\37\3\2\2\2\n\'\3\2\2"+
		"\2\f.\3\2\2\2\16\65\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\23\5\6\4\2\23"+
		"\24\5\4\3\2\24\27\3\2\2\2\25\27\7\2\2\3\26\22\3\2\2\2\26\25\3\2\2\2\27"+
		"\5\3\2\2\2\30\34\5\b\5\2\31\34\5\n\6\2\32\34\5\f\7\2\33\30\3\2\2\2\33"+
		"\31\3\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\36\7\25\2\2\36\7\3\2\2\2\37"+
		" \7\17\2\2 !\7\26\2\2!\"\7\3\2\2\"#\5\16\b\2#$\7\4\2\2$%\7\23\2\2%&\7"+
		"\24\2\2&\t\3\2\2\2\'(\7\20\2\2()\7\26\2\2)*\7\23\2\2*+\7\24\2\2+,\7\22"+
		"\2\2,-\7\6\2\2-\13\3\2\2\2./\7\21\2\2/\60\7\26\2\2\60\61\7\23\2\2\61\62"+
		"\7\24\2\2\62\63\7\22\2\2\63\64\7\6\2\2\64\r\3\2\2\2\65\66\b\b\1\2\66\67"+
		"\7\26\2\2\678\7\23\2\289\7\24\2\29?\3\2\2\2:;\f\4\2\2;<\7\5\2\2<>\5\16"+
		"\b\5=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\17\3\2\2\2A?\3\2\2\2\5\26"+
		"\33?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}