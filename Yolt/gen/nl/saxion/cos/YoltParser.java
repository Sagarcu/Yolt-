package nl.saxion.cos;// Generated from C:/Users/mathi/Desktop/Yolt/Yolt/src\Yolt.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YoltParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ADD=2, SUB=3, MUL=4, MOD=5, DIV=6, POW=7, LOGIC_EQUAL=8, LOGIC_UNEQUAL=9, 
		LOGIC_BIGGER=10, LOGIC_LOWER=11, LOGIC_BIGGER_EQUAL=12, LOGIC_LOWER_EQUAL=13, 
		LOGIC_OR=14, LOGIC_AND=15, IF=16, ELSE_IF=17, ELSE=18, BREAK=19, CLASS=20, 
		LOOP=21, WHILE=22, FUNCTION=23, RETURN=24, GOLD=25, STRING=26, INT=27, 
		BOOLEAN=28, PRINT=29, PROMPT=30, RANDOM=31, EQUALS=32, INT_VALUE=33, GOLD_VALUE=34, 
		COINS_VALUE=35, BOOLEAN_VALUE=36, STRING_VALUE=37, IDENTIFIER=38, COMMA=39, 
		SEMICOLON=40, COLON=41, PAREN_OPEN=42, PAREN_CLOSE=43, BRACKET_OPEN=44, 
		BRACKET_CLOSE=45, APOSTROPHE=46, COMMENT=47, WS=48;
	public static final int
		RULE_application = 0, RULE_class_declaration = 1, RULE_function_declaration = 2, 
		RULE_function_call = 3, RULE_var_declaration = 4, RULE_var_addition = 5, 
		RULE_var_addition_short = 6, RULE_string_addition_short = 7, RULE_prompt_input = 8, 
		RULE_random_input = 9, RULE_if_statement = 10, RULE_else_if_statement = 11, 
		RULE_else_statement = 12, RULE_return_statement = 13, RULE_while_loop = 14, 
		RULE_do_while_loop = 15, RULE_variables = 16, RULE_break_statement = 17, 
		RULE_logic_expr = 18, RULE_compare_values = 19, RULE_print_stmt = 20, 
		RULE_statement = 21, RULE_expr = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"application", "class_declaration", "function_declaration", "function_call", 
			"var_declaration", "var_addition", "var_addition_short", "string_addition_short", 
			"prompt_input", "random_input", "if_statement", "else_if_statement", 
			"else_statement", "return_statement", "while_loop", "do_while_loop", 
			"variables", "break_statement", "logic_expr", "compare_values", "print_stmt", 
			"statement", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ADD'", "'+'", "'-'", "'*'", "'%'", "'/'", "'^'", "'=='", "'=!='", 
			"'>'", "'<'", "'>='", "'<='", "'||'", "'&&'", "'IF'", "'ELSE IF'", "'ELSE'", 
			"'STOP'", "'CLASS'", "'REPEAT'", "'WHILE'", "'FUNCTION'", "'RETURN'", 
			"'COINS'", "'WORDS'", "'NUMBER'", "'BOOL'", "'SPEAK'", "'TELL'", "'RANDOM'", 
			"'='", null, null, null, null, null, null, "','", "';'", "':'", "'('", 
			"')'", "'{'", "'}'", "'\"'", "'//*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ADD", "SUB", "MUL", "MOD", "DIV", "POW", "LOGIC_EQUAL", 
			"LOGIC_UNEQUAL", "LOGIC_BIGGER", "LOGIC_LOWER", "LOGIC_BIGGER_EQUAL", 
			"LOGIC_LOWER_EQUAL", "LOGIC_OR", "LOGIC_AND", "IF", "ELSE_IF", "ELSE", 
			"BREAK", "CLASS", "LOOP", "WHILE", "FUNCTION", "RETURN", "GOLD", "STRING", 
			"INT", "BOOLEAN", "PRINT", "PROMPT", "RANDOM", "EQUALS", "INT_VALUE", 
			"GOLD_VALUE", "COINS_VALUE", "BOOLEAN_VALUE", "STRING_VALUE", "IDENTIFIER", 
			"COMMA", "SEMICOLON", "COLON", "PAREN_OPEN", "PAREN_CLOSE", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "APOSTROPHE", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Yolt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YoltParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ApplicationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(YoltParser.EOF, 0); }
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplicationContext application() throws RecognitionException {
		ApplicationContext _localctx = new ApplicationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_application);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(46);
				class_declaration();
				}
			}

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(49);
				function_declaration();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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

	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(YoltParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(CLASS);
			setState(58);
			match(IDENTIFIER);
			setState(59);
			match(PAREN_OPEN);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(60);
				variables();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(PAREN_CLOSE);
			setState(67);
			match(BRACKET_OPEN);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				function_declaration();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
			setState(73);
			match(BRACKET_CLOSE);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(YoltParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YoltParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YoltParser.COMMA, i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(FUNCTION);
			setState(76);
			match(IDENTIFIER);
			setState(77);
			match(PAREN_OPEN);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) {
				{
				setState(78);
				variables();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(79);
					match(COMMA);
					setState(80);
					variables();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(88);
			match(PAREN_CLOSE);
			setState(89);
			match(BRACKET_OPEN);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				statement();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(95);
			match(BRACKET_CLOSE);
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

	public static class Function_callContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(YoltParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(YoltParser.IDENTIFIER, i);
		}
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(YoltParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YoltParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENTIFIER);
			setState(98);
			match(PAREN_OPEN);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(99);
				match(IDENTIFIER);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					match(IDENTIFIER);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(109);
			match(PAREN_CLOSE);
			setState(110);
			match(SEMICOLON);
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

	public static class Var_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public TerminalNode INT() { return getToken(YoltParser.INT, 0); }
		public TerminalNode STRING() { return getToken(YoltParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(YoltParser.BOOLEAN, 0); }
		public TerminalNode GOLD() { return getToken(YoltParser.GOLD, 0); }
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitVar_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitVar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(EQUALS);
			setState(115);
			expr(0);
			setState(116);
			match(SEMICOLON);
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

	public static class Var_additionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Var_additionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterVar_addition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitVar_addition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitVar_addition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_additionContext var_addition() throws RecognitionException {
		Var_additionContext _localctx = new Var_additionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IDENTIFIER);
			setState(119);
			match(EQUALS);
			setState(120);
			expr(0);
			setState(121);
			match(SEMICOLON);
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

	public static class Var_addition_shortContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public TerminalNode POW() { return getToken(YoltParser.POW, 0); }
		public TerminalNode MOD() { return getToken(YoltParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(YoltParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(YoltParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(YoltParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(YoltParser.SUB, 0); }
		public TerminalNode INT_VALUE() { return getToken(YoltParser.INT_VALUE, 0); }
		public TerminalNode GOLD_VALUE() { return getToken(YoltParser.GOLD_VALUE, 0); }
		public Var_addition_shortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_addition_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterVar_addition_short(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitVar_addition_short(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitVar_addition_short(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_addition_shortContext var_addition_short() throws RecognitionException {
		Var_addition_shortContext _localctx = new Var_addition_shortContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_addition_short);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IDENTIFIER);
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << MOD) | (1L << DIV) | (1L << POW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(125);
			match(EQUALS);
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==INT_VALUE || _la==GOLD_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			match(SEMICOLON);
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

	public static class String_addition_shortContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode ADD() { return getToken(YoltParser.ADD, 0); }
		public TerminalNode EQUALS() { return getToken(YoltParser.EQUALS, 0); }
		public TerminalNode STRING_VALUE() { return getToken(YoltParser.STRING_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public String_addition_shortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_addition_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterString_addition_short(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitString_addition_short(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitString_addition_short(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_addition_shortContext string_addition_short() throws RecognitionException {
		String_addition_shortContext _localctx = new String_addition_shortContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string_addition_short);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IDENTIFIER);
			setState(130);
			match(ADD);
			setState(131);
			match(EQUALS);
			setState(132);
			match(STRING_VALUE);
			setState(133);
			match(SEMICOLON);
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

	public static class Prompt_inputContext extends ParserRuleContext {
		public TerminalNode PROMPT() { return getToken(YoltParser.PROMPT, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public Prompt_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prompt_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterPrompt_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitPrompt_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitPrompt_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prompt_inputContext prompt_input() throws RecognitionException {
		Prompt_inputContext _localctx = new Prompt_inputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prompt_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(PROMPT);
			setState(136);
			match(PAREN_OPEN);
			setState(137);
			match(PAREN_CLOSE);
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

	public static class Random_inputContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(YoltParser.RANDOM, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode INT_VALUE() { return getToken(YoltParser.INT_VALUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public Random_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterRandom_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitRandom_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitRandom_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Random_inputContext random_input() throws RecognitionException {
		Random_inputContext _localctx = new Random_inputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_random_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(RANDOM);
			setState(140);
			match(PAREN_OPEN);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_VALUE || _la==IDENTIFIER) {
				{
				setState(141);
				_la = _input.LA(1);
				if ( !(_la==INT_VALUE || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(144);
			match(PAREN_CLOSE);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(YoltParser.IF, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(YoltParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IF);
			setState(147);
			match(PAREN_OPEN);
			setState(148);
			logic_expr(0);
			setState(149);
			match(PAREN_CLOSE);
			setState(150);
			match(COLON);
			setState(151);
			match(BRACKET_OPEN);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				statement();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(157);
			match(BRACKET_CLOSE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(158);
				else_if_statement();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(164);
				else_statement();
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

	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(YoltParser.ELSE_IF, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(YoltParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterElse_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitElse_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitElse_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ELSE_IF);
			setState(168);
			match(PAREN_OPEN);
			setState(169);
			logic_expr(0);
			setState(170);
			match(PAREN_CLOSE);
			setState(171);
			match(COLON);
			setState(172);
			match(BRACKET_OPEN);
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				statement();
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(178);
			match(BRACKET_CLOSE);
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(YoltParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(YoltParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ELSE);
			setState(181);
			match(COLON);
			setState(182);
			match(BRACKET_OPEN);
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				statement();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(188);
			match(BRACKET_CLOSE);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(YoltParser.RETURN, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(RETURN);
			setState(191);
			match(PAREN_OPEN);
			setState(192);
			match(IDENTIFIER);
			setState(193);
			match(PAREN_CLOSE);
			setState(194);
			match(SEMICOLON);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(YoltParser.LOOP, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(YoltParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(LOOP);
			setState(197);
			match(PAREN_OPEN);
			setState(198);
			logic_expr(0);
			setState(199);
			match(PAREN_CLOSE);
			setState(200);
			match(COLON);
			setState(201);
			match(BRACKET_OPEN);
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				statement();
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(207);
				break_statement();
				}
			}

			setState(210);
			match(BRACKET_CLOSE);
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

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(YoltParser.LOOP, 0); }
		public TerminalNode COLON() { return getToken(YoltParser.COLON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(YoltParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(YoltParser.BRACKET_CLOSE, 0); }
		public TerminalNode WHILE() { return getToken(YoltParser.WHILE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterDo_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitDo_while_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitDo_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_do_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LOOP);
			setState(213);
			match(COLON);
			setState(214);
			match(BRACKET_OPEN);
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				statement();
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << LOOP) | (1L << RETURN) | (1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << PRINT) | (1L << IDENTIFIER))) != 0) );
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(220);
				break_statement();
				}
			}

			setState(223);
			match(BRACKET_CLOSE);
			setState(224);
			match(WHILE);
			setState(225);
			match(PAREN_OPEN);
			setState(226);
			logic_expr(0);
			setState(227);
			match(PAREN_CLOSE);
			setState(228);
			match(SEMICOLON);
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public TerminalNode GOLD() { return getToken(YoltParser.GOLD, 0); }
		public TerminalNode INT() { return getToken(YoltParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(YoltParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(YoltParser.STRING, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOLD) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(231);
			match(IDENTIFIER);
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

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(YoltParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(BREAK);
			setState(234);
			match(SEMICOLON);
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

	public static class Logic_exprContext extends ParserRuleContext {
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
	 
		public Logic_exprContext() { }
		public void copyFrom(Logic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicOrContext extends Logic_exprContext {
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public TerminalNode LOGIC_OR() { return getToken(YoltParser.LOGIC_OR, 0); }
		public LogicOrContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterLogicOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitLogicOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitLogicOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueExpressionContext extends Logic_exprContext {
		public Compare_valuesContext compare_values() {
			return getRuleContext(Compare_valuesContext.class,0);
		}
		public ValueExpressionContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicAndContext extends Logic_exprContext {
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public TerminalNode LOGIC_AND() { return getToken(YoltParser.LOGIC_AND, 0); }
		public LogicAndContext(Logic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterLogicAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitLogicAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitLogicAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		return logic_expr(0);
	}

	private Logic_exprContext logic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, _parentState);
		Logic_exprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logic_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValueExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(237);
			compare_values();
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new LogicAndContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(239);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(240);
						match(LOGIC_AND);
						setState(241);
						logic_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicOrContext(new Logic_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(242);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(243);
						match(LOGIC_OR);
						setState(244);
						logic_expr(3);
						}
						break;
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Compare_valuesContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOGIC_BIGGER() { return getToken(YoltParser.LOGIC_BIGGER, 0); }
		public TerminalNode LOGIC_EQUAL() { return getToken(YoltParser.LOGIC_EQUAL, 0); }
		public TerminalNode LOGIC_LOWER() { return getToken(YoltParser.LOGIC_LOWER, 0); }
		public TerminalNode LOGIC_UNEQUAL() { return getToken(YoltParser.LOGIC_UNEQUAL, 0); }
		public TerminalNode LOGIC_BIGGER_EQUAL() { return getToken(YoltParser.LOGIC_BIGGER_EQUAL, 0); }
		public TerminalNode LOGIC_LOWER_EQUAL() { return getToken(YoltParser.LOGIC_LOWER_EQUAL, 0); }
		public Compare_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterCompare_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitCompare_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitCompare_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_valuesContext compare_values() throws RecognitionException {
		Compare_valuesContext _localctx = new Compare_valuesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compare_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			expr(0);
			setState(251);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGIC_EQUAL) | (1L << LOGIC_UNEQUAL) | (1L << LOGIC_BIGGER) | (1L << LOGIC_LOWER) | (1L << LOGIC_BIGGER_EQUAL) | (1L << LOGIC_LOWER_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(252);
			expr(0);
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

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(YoltParser.PRINT, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YoltParser.SEMICOLON, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(PRINT);
			setState(255);
			match(PAREN_OPEN);
			setState(256);
			expr(0);
			setState(257);
			match(PAREN_CLOSE);
			setState(258);
			match(SEMICOLON);
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

	public static class StatementContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public String_addition_shortContext string_addition_short() {
			return getRuleContext(String_addition_shortContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Var_addition_shortContext var_addition_short() {
			return getRuleContext(Var_addition_shortContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_additionContext var_addition() {
			return getRuleContext(Var_additionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				return_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				string_addition_short();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				var_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(265);
				do_while_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(266);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(267);
				print_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(268);
				var_addition_short();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(269);
				match(T__0);
				setState(270);
				expr(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(271);
				var_addition();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddSubExpressionContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(YoltParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(YoltParser.SUB, 0); }
		public AddSubExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanExpressionContext extends ExprContext {
		public TerminalNode PAREN_OPEN() { return getToken(YoltParser.PAREN_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(YoltParser.PAREN_CLOSE, 0); }
		public ParanExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterParanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitParanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitParanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RandomIdentifierContext extends ExprContext {
		public Random_inputContext random_input() {
			return getRuleContext(Random_inputContext.class,0);
		}
		public RandomIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterRandomIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitRandomIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitRandomIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIdentifierContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(YoltParser.IDENTIFIER, 0); }
		public VarIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterVarIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitVarIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitVarIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntIdentifierContext extends ExprContext {
		public TerminalNode INT_VALUE() { return getToken(YoltParser.INT_VALUE, 0); }
		public IntIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterIntIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitIntIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitIntIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringIdentifierContext extends ExprContext {
		public TerminalNode STRING_VALUE() { return getToken(YoltParser.STRING_VALUE, 0); }
		public StringIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterStringIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitStringIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitStringIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowModExpressionContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(YoltParser.POW, 0); }
		public TerminalNode MOD() { return getToken(YoltParser.MOD, 0); }
		public PowModExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterPowModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitPowModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitPowModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolIdentifierContext extends ExprContext {
		public TerminalNode BOOLEAN_VALUE() { return getToken(YoltParser.BOOLEAN_VALUE, 0); }
		public BoolIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterBoolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitBoolIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitBoolIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GoldIdentifierContext extends ExprContext {
		public TerminalNode GOLD_VALUE() { return getToken(YoltParser.GOLD_VALUE, 0); }
		public GoldIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterGoldIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitGoldIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitGoldIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextIdentifierContext extends ExprContext {
		public Prompt_inputContext prompt_input() {
			return getRuleContext(Prompt_inputContext.class,0);
		}
		public TextIdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterTextIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitTextIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitTextIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeExpressionContext extends ExprContext {
		public TerminalNode SUB() { return getToken(YoltParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegativeExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterNegativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitNegativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitNegativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExpressionContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(YoltParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(YoltParser.DIV, 0); }
		public MulDivExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YoltListener ) ((YoltListener)listener).exitMulDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YoltVisitor ) return ((YoltVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_OPEN:
				{
				_localctx = new ParanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(275);
				match(PAREN_OPEN);
				setState(276);
				expr(0);
				setState(277);
				match(PAREN_CLOSE);
				}
				}
				break;
			case SUB:
				{
				_localctx = new NegativeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(SUB);
				setState(280);
				expr(11);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VarIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				match(IDENTIFIER);
				}
				break;
			case RANDOM:
				{
				_localctx = new RandomIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				random_input();
				}
				break;
			case PROMPT:
				{
				_localctx = new TextIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				prompt_input();
				}
				break;
			case INT_VALUE:
				{
				_localctx = new IntIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(INT_VALUE);
				}
				break;
			case BOOLEAN_VALUE:
				{
				_localctx = new BoolIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(BOOLEAN_VALUE);
				}
				break;
			case GOLD_VALUE:
				{
				_localctx = new GoldIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(GOLD_VALUE);
				}
				break;
			case STRING_VALUE:
				{
				_localctx = new StringIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(STRING_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new PowModExpressionContext(new ExprContext(_parentctx, _parentState));
						((PowModExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(291);
						_la = _input.LA(1);
						if ( !(_la==MOD || _la==POW) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(292);
						((PowModExpressionContext)_localctx).right = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MulDivExpressionContext(new ExprContext(_parentctx, _parentState));
						((MulDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(294);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(295);
						((MulDivExpressionContext)_localctx).right = expr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExpressionContext(new ExprContext(_parentctx, _parentState));
						((AddSubExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(297);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(298);
						((AddSubExpressionContext)_localctx).right = expr(9);
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		case 18:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logic_expr_sempred(Logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u0131\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0003\u00000\b\u0000\u0001\u0000"+
		"\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001>\b\u0001"+
		"\n\u0001\f\u0001A\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"F\b\u0001\u000b\u0001\f\u0001G\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002R\b"+
		"\u0002\n\u0002\f\u0002U\t\u0002\u0003\u0002W\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002\\\b\u0002\u000b\u0002\f\u0002]\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003g\b\u0003\n\u0003\f\u0003j\t\u0003\u0003\u0003l\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u008f\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0004\n\u009a\b\n\u000b\n\f\n\u009b\u0001\n\u0001\n"+
		"\u0005\n\u00a0\b\n\n\n\f\n\u00a3\t\n\u0001\n\u0003\n\u00a6\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u00af\b\u000b\u000b\u000b\f\u000b\u00b0\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00b9\b\f\u000b\f\f\f\u00ba"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u00cc\b\u000e\u000b\u000e\f\u000e\u00cd\u0001\u000e"+
		"\u0003\u000e\u00d1\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u00d9\b\u000f\u000b\u000f\f\u000f"+
		"\u00da\u0001\u000f\u0003\u000f\u00de\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u00f6\b\u0012\n\u0012\f\u0012\u00f9\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0111\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0121\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u012c\b\u0016\n\u0016\f\u0016\u012f\t\u0016\u0001"+
		"\u0016\u0000\u0002$,\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\b\u0001\u0000\u0019"+
		"\u001c\u0001\u0000\u0002\u0007\u0001\u0000!\"\u0002\u0000!!&&\u0001\u0000"+
		"\b\r\u0002\u0000\u0005\u0005\u0007\u0007\u0002\u0000\u0004\u0004\u0006"+
		"\u0006\u0001\u0000\u0002\u0003\u0143\u0000/\u0001\u0000\u0000\u0000\u0002"+
		"9\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006a\u0001"+
		"\u0000\u0000\u0000\bp\u0001\u0000\u0000\u0000\nv\u0001\u0000\u0000\u0000"+
		"\f{\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000\u0000\u0010"+
		"\u0087\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014"+
		"\u0092\u0001\u0000\u0000\u0000\u0016\u00a7\u0001\u0000\u0000\u0000\u0018"+
		"\u00b4\u0001\u0000\u0000\u0000\u001a\u00be\u0001\u0000\u0000\u0000\u001c"+
		"\u00c4\u0001\u0000\u0000\u0000\u001e\u00d4\u0001\u0000\u0000\u0000 \u00e6"+
		"\u0001\u0000\u0000\u0000\"\u00e9\u0001\u0000\u0000\u0000$\u00ec\u0001"+
		"\u0000\u0000\u0000&\u00fa\u0001\u0000\u0000\u0000(\u00fe\u0001\u0000\u0000"+
		"\u0000*\u0110\u0001\u0000\u0000\u0000,\u0120\u0001\u0000\u0000\u0000."+
		"0\u0003\u0002\u0001\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000004\u0001\u0000\u0000\u000013\u0003\u0004\u0002\u000021\u0001\u0000"+
		"\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"78\u0005\u0000\u0000\u00018\u0001\u0001\u0000\u0000\u00009:\u0005\u0014"+
		"\u0000\u0000:;\u0005&\u0000\u0000;?\u0005*\u0000\u0000<>\u0003 \u0010"+
		"\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000BC\u0005+\u0000\u0000CE\u0005,\u0000\u0000DF\u0003\u0004"+
		"\u0002\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IJ\u0005-\u0000\u0000J\u0003\u0001\u0000\u0000\u0000KL\u0005\u0017\u0000"+
		"\u0000LM\u0005&\u0000\u0000MV\u0005*\u0000\u0000NS\u0003 \u0010\u0000"+
		"OP\u0005\'\u0000\u0000PR\u0003 \u0010\u0000QO\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VN\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0005"+
		"+\u0000\u0000Y[\u0005,\u0000\u0000Z\\\u0003*\u0015\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005-\u0000\u0000`\u0005"+
		"\u0001\u0000\u0000\u0000ab\u0005&\u0000\u0000bk\u0005*\u0000\u0000ch\u0005"+
		"&\u0000\u0000de\u0005\'\u0000\u0000eg\u0005&\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"kc\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0005+\u0000\u0000no\u0005(\u0000\u0000o\u0007\u0001\u0000\u0000"+
		"\u0000pq\u0007\u0000\u0000\u0000qr\u0005&\u0000\u0000rs\u0005 \u0000\u0000"+
		"st\u0003,\u0016\u0000tu\u0005(\u0000\u0000u\t\u0001\u0000\u0000\u0000"+
		"vw\u0005&\u0000\u0000wx\u0005 \u0000\u0000xy\u0003,\u0016\u0000yz\u0005"+
		"(\u0000\u0000z\u000b\u0001\u0000\u0000\u0000{|\u0005&\u0000\u0000|}\u0007"+
		"\u0001\u0000\u0000}~\u0005 \u0000\u0000~\u007f\u0007\u0002\u0000\u0000"+
		"\u007f\u0080\u0005(\u0000\u0000\u0080\r\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005&\u0000\u0000\u0082\u0083\u0005\u0002\u0000\u0000\u0083\u0084"+
		"\u0005 \u0000\u0000\u0084\u0085\u0005%\u0000\u0000\u0085\u0086\u0005("+
		"\u0000\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u001e"+
		"\u0000\u0000\u0088\u0089\u0005*\u0000\u0000\u0089\u008a\u0005+\u0000\u0000"+
		"\u008a\u0011\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u001f\u0000\u0000"+
		"\u008c\u008e\u0005*\u0000\u0000\u008d\u008f\u0007\u0003\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0005+\u0000\u0000\u0091\u0013"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0010\u0000\u0000\u0093\u0094"+
		"\u0005*\u0000\u0000\u0094\u0095\u0003$\u0012\u0000\u0095\u0096\u0005+"+
		"\u0000\u0000\u0096\u0097\u0005)\u0000\u0000\u0097\u0099\u0005,\u0000\u0000"+
		"\u0098\u009a\u0003*\u0015\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u00a1\u0005-\u0000\u0000\u009e\u00a0\u0003\u0016\u000b\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0003\u0018\f\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u0015\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0011\u0000\u0000\u00a8\u00a9\u0005*\u0000\u0000\u00a9\u00aa\u0003$\u0012"+
		"\u0000\u00aa\u00ab\u0005+\u0000\u0000\u00ab\u00ac\u0005)\u0000\u0000\u00ac"+
		"\u00ae\u0005,\u0000\u0000\u00ad\u00af\u0003*\u0015\u0000\u00ae\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005-\u0000\u0000\u00b3\u0017\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0005\u0012\u0000\u0000\u00b5\u00b6\u0005)\u0000"+
		"\u0000\u00b6\u00b8\u0005,\u0000\u0000\u00b7\u00b9\u0003*\u0015\u0000\u00b8"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005-\u0000\u0000\u00bd\u0019"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0018\u0000\u0000\u00bf\u00c0"+
		"\u0005*\u0000\u0000\u00c0\u00c1\u0005&\u0000\u0000\u00c1\u00c2\u0005+"+
		"\u0000\u0000\u00c2\u00c3\u0005(\u0000\u0000\u00c3\u001b\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005\u0015\u0000\u0000\u00c5\u00c6\u0005*\u0000\u0000"+
		"\u00c6\u00c7\u0003$\u0012\u0000\u00c7\u00c8\u0005+\u0000\u0000\u00c8\u00c9"+
		"\u0005)\u0000\u0000\u00c9\u00cb\u0005,\u0000\u0000\u00ca\u00cc\u0003*"+
		"\u0015\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00d1\u0003\"\u0011"+
		"\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005-\u0000\u0000"+
		"\u00d3\u001d\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0015\u0000\u0000"+
		"\u00d5\u00d6\u0005)\u0000\u0000\u00d6\u00d8\u0005,\u0000\u0000\u00d7\u00d9"+
		"\u0003*\u0015\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00de\u0003"+
		"\"\u0011\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005-\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0016\u0000\u0000\u00e1\u00e2\u0005*\u0000\u0000"+
		"\u00e2\u00e3\u0003$\u0012\u0000\u00e3\u00e4\u0005+\u0000\u0000\u00e4\u00e5"+
		"\u0005(\u0000\u0000\u00e5\u001f\u0001\u0000\u0000\u0000\u00e6\u00e7\u0007"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005&\u0000\u0000\u00e8!\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0013\u0000\u0000\u00ea\u00eb\u0005(\u0000\u0000"+
		"\u00eb#\u0001\u0000\u0000\u0000\u00ec\u00ed\u0006\u0012\uffff\uffff\u0000"+
		"\u00ed\u00ee\u0003&\u0013\u0000\u00ee\u00f7\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\n\u0003\u0000\u0000\u00f0\u00f1\u0005\u000f\u0000\u0000\u00f1\u00f6"+
		"\u0003$\u0012\u0004\u00f2\u00f3\n\u0002\u0000\u0000\u00f3\u00f4\u0005"+
		"\u000e\u0000\u0000\u00f4\u00f6\u0003$\u0012\u0003\u00f5\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8%\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0003,\u0016\u0000\u00fb\u00fc\u0007\u0004\u0000\u0000"+
		"\u00fc\u00fd\u0003,\u0016\u0000\u00fd\'\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005\u001d\u0000\u0000\u00ff\u0100\u0005*\u0000\u0000\u0100\u0101"+
		"\u0003,\u0016\u0000\u0101\u0102\u0005+\u0000\u0000\u0102\u0103\u0005("+
		"\u0000\u0000\u0103)\u0001\u0000\u0000\u0000\u0104\u0111\u0003\u0006\u0003"+
		"\u0000\u0105\u0111\u0003\u001a\r\u0000\u0106\u0111\u0003\u000e\u0007\u0000"+
		"\u0107\u0111\u0003\u0014\n\u0000\u0108\u0111\u0003\b\u0004\u0000\u0109"+
		"\u0111\u0003\u001e\u000f\u0000\u010a\u0111\u0003\u001c\u000e\u0000\u010b"+
		"\u0111\u0003(\u0014\u0000\u010c\u0111\u0003\f\u0006\u0000\u010d\u010e"+
		"\u0005\u0001\u0000\u0000\u010e\u0111\u0003,\u0016\u0000\u010f\u0111\u0003"+
		"\n\u0005\u0000\u0110\u0104\u0001\u0000\u0000\u0000\u0110\u0105\u0001\u0000"+
		"\u0000\u0000\u0110\u0106\u0001\u0000\u0000\u0000\u0110\u0107\u0001\u0000"+
		"\u0000\u0000\u0110\u0108\u0001\u0000\u0000\u0000\u0110\u0109\u0001\u0000"+
		"\u0000\u0000\u0110\u010a\u0001\u0000\u0000\u0000\u0110\u010b\u0001\u0000"+
		"\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u0110\u010d\u0001\u0000"+
		"\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111+\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0006\u0016\uffff\uffff\u0000\u0113\u0114\u0005*\u0000"+
		"\u0000\u0114\u0115\u0003,\u0016\u0000\u0115\u0116\u0005+\u0000\u0000\u0116"+
		"\u0121\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0003\u0000\u0000\u0118"+
		"\u0121\u0003,\u0016\u000b\u0119\u0121\u0005&\u0000\u0000\u011a\u0121\u0003"+
		"\u0012\t\u0000\u011b\u0121\u0003\u0010\b\u0000\u011c\u0121\u0005!\u0000"+
		"\u0000\u011d\u0121\u0005$\u0000\u0000\u011e\u0121\u0005\"\u0000\u0000"+
		"\u011f\u0121\u0005%\u0000\u0000\u0120\u0112\u0001\u0000\u0000\u0000\u0120"+
		"\u0117\u0001\u0000\u0000\u0000\u0120\u0119\u0001\u0000\u0000\u0000\u0120"+
		"\u011a\u0001\u0000\u0000\u0000\u0120\u011b\u0001\u0000\u0000\u0000\u0120"+
		"\u011c\u0001\u0000\u0000\u0000\u0120\u011d\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u012d\u0001\u0000\u0000\u0000\u0122\u0123\n\n\u0000\u0000\u0123\u0124"+
		"\u0007\u0005\u0000\u0000\u0124\u012c\u0003,\u0016\u000b\u0125\u0126\n"+
		"\t\u0000\u0000\u0126\u0127\u0007\u0006\u0000\u0000\u0127\u012c\u0003,"+
		"\u0016\n\u0128\u0129\n\b\u0000\u0000\u0129\u012a\u0007\u0007\u0000\u0000"+
		"\u012a\u012c\u0003,\u0016\t\u012b\u0122\u0001\u0000\u0000\u0000\u012b"+
		"\u0125\u0001\u0000\u0000\u0000\u012b\u0128\u0001\u0000\u0000\u0000\u012c"+
		"\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e-\u0001\u0000\u0000\u0000\u012f\u012d"+
		"\u0001\u0000\u0000\u0000\u0019/4?GSV]hk\u008e\u009b\u00a1\u00a5\u00b0"+
		"\u00ba\u00cd\u00d0\u00da\u00dd\u00f5\u00f7\u0110\u0120\u012b\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}