// Generated from C:/Users/Racha/IdeaProjects/projetCompil\projetCompil.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class projetCompilParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Nameprog=7, ID=8, INTVAL=9, 
		FLOATVAL=10, STRINGVAL=11, COMPIL=12, INT=13, FLOAT=14, STRING=15, SCAN=16, 
		PRINT=17, START=18, IF=19, THEN=20, ELSE=21, DO=22, WHILE=23, AFF=24, 
		PLUS=25, MINUS=26, MUL=27, DIV=28, SUP=29, INF=30, SUPE=31, INFE=32, EQ=33, 
		DIF=34, INTEGERVAL=35;
	public static final int
		RULE_programme = 0, RULE_declarations = 1, RULE_dec = 2, RULE_type = 3, 
		RULE_var = 4, RULE_insts = 5, RULE_inst = 6, RULE_affect = 7, RULE_exp = 8, 
		RULE_t = 9, RULE_opmi = 10, RULE_opma = 11, RULE_endEx = 12, RULE_val = 13, 
		RULE_ifinst = 14, RULE_comp = 15, RULE_op = 16, RULE_dowhile_inst = 17, 
		RULE_read = 18, RULE_write = 19, RULE_listID = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"programme", "declarations", "dec", "type", "var", "insts", "inst", "affect", 
			"exp", "t", "opmi", "opma", "endEx", "val", "ifinst", "comp", "op", "dowhile_inst", 
			"read", "write", "listID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", null, null, null, null, 
			"'.*'", "'compil'", "'intCompil'", "'floatCompil'", "'StringCompil'", 
			"'scanCompil'", "'printCompil'", "'start'", "'if'", "'then'", "'else'", 
			"'do'", "'while'", "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Nameprog", "ID", "INTVAL", 
			"FLOATVAL", "STRINGVAL", "COMPIL", "INT", "FLOAT", "STRING", "SCAN", 
			"PRINT", "START", "IF", "THEN", "ELSE", "DO", "WHILE", "AFF", "PLUS", 
			"MINUS", "MUL", "DIV", "SUP", "INF", "SUPE", "INFE", "EQ", "DIF", "INTEGERVAL"
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
	public String getGrammarFileName() { return "projetCompil.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public projetCompilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrammeContext extends ParserRuleContext {
		public TerminalNode COMPIL() { return getToken(projetCompilParser.COMPIL, 0); }
		public TerminalNode Nameprog() { return getToken(projetCompilParser.Nameprog, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode START() { return getToken(projetCompilParser.START, 0); }
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(COMPIL);
			setState(43);
			match(Nameprog);
			setState(44);
			match(T__0);
			setState(45);
			match(T__1);
			setState(46);
			match(T__2);
			setState(47);
			declarations();
			setState(48);
			match(START);
			setState(49);
			insts();
			setState(50);
			match(T__3);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(52);
				dec();
				setState(53);
				declarations();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				dec();
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

	public static class DecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			type();
			setState(59);
			var();
			setState(60);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(projetCompilParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(projetCompilParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(projetCompilParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(projetCompilParser.ID, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				{
				setState(64);
				match(ID);
				setState(65);
				match(T__5);
				setState(66);
				var();
				}
				}
				break;
			case 2:
				{
				setState(67);
				match(ID);
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

	public static class InstsContext extends ParserRuleContext {
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public InstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterInsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitInsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitInsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstsContext insts() throws RecognitionException {
		InstsContext _localctx = new InstsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_insts);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(70);
				inst();
				setState(71);
				match(T__4);
				setState(72);
				insts();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				inst();
				setState(75);
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

	public static class InstContext extends ParserRuleContext {
		public AffectContext affect() {
			return getRuleContext(AffectContext.class,0);
		}
		public IfinstContext ifinst() {
			return getRuleContext(IfinstContext.class,0);
		}
		public Dowhile_instContext dowhile_inst() {
			return getRuleContext(Dowhile_instContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inst);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				affect();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				ifinst();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				dowhile_inst();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				read();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				write();
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

	public static class AffectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(projetCompilParser.ID, 0); }
		public TerminalNode AFF() { return getToken(projetCompilParser.AFF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterAffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitAffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitAffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectContext affect() throws RecognitionException {
		AffectContext _localctx = new AffectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_affect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			match(AFF);
			setState(88);
			exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OpmiContext opmi() {
			return getRuleContext(OpmiContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(91);
			t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(93);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(94);
					opmi();
					setState(95);
					t(0);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class TContext extends ParserRuleContext {
		public EndExContext endEx() {
			return getRuleContext(EndExContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public OpmaContext opma() {
			return getRuleContext(OpmaContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		return t(0);
	}

	private TContext t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TContext _localctx = new TContext(_ctx, _parentState);
		TContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(103);
			endEx();
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_t);
					setState(105);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(106);
					opma();
					setState(107);
					endEx();
					}
					} 
				}
				setState(113);
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

	public static class OpmiContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(projetCompilParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(projetCompilParser.MINUS, 0); }
		public OpmiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opmi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterOpmi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitOpmi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitOpmi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpmiContext opmi() throws RecognitionException {
		OpmiContext _localctx = new OpmiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opmi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class OpmaContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(projetCompilParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(projetCompilParser.DIV, 0); }
		public OpmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterOpma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitOpma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitOpma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpmaContext opma() throws RecognitionException {
		OpmaContext _localctx = new OpmaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_opma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
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

	public static class EndExContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(projetCompilParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public EndExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterEndEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitEndEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitEndEx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndExContext endEx() throws RecognitionException {
		EndExContext _localctx = new EndExContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_endEx);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(ID);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__0);
				setState(120);
				exp(0);
				setState(121);
				match(T__1);
				}
				break;
			case FLOATVAL:
			case STRINGVAL:
			case INTEGERVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				val();
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode INTEGERVAL() { return getToken(projetCompilParser.INTEGERVAL, 0); }
		public TerminalNode FLOATVAL() { return getToken(projetCompilParser.FLOATVAL, 0); }
		public TerminalNode STRINGVAL() { return getToken(projetCompilParser.STRINGVAL, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOATVAL) | (1L << STRINGVAL) | (1L << INTEGERVAL))) != 0)) ) {
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

	public static class IfinstContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(projetCompilParser.IF, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode THEN() { return getToken(projetCompilParser.THEN, 0); }
		public List<InstsContext> insts() {
			return getRuleContexts(InstsContext.class);
		}
		public InstsContext insts(int i) {
			return getRuleContext(InstsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(projetCompilParser.ELSE, 0); }
		public IfinstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifinst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterIfinst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitIfinst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitIfinst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfinstContext ifinst() throws RecognitionException {
		IfinstContext _localctx = new IfinstContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifinst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IF);
			setState(129);
			match(T__0);
			setState(130);
			comp();
			setState(131);
			match(T__1);
			setState(132);
			match(THEN);
			setState(133);
			match(T__2);
			setState(134);
			insts();
			setState(135);
			match(T__3);
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				}
				break;
			case ELSE:
				{
				setState(137);
				match(ELSE);
				setState(138);
				match(T__2);
				setState(139);
				insts();
				setState(140);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CompContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			exp(0);
			setState(145);
			op();
			setState(146);
			exp(0);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode SUP() { return getToken(projetCompilParser.SUP, 0); }
		public TerminalNode INF() { return getToken(projetCompilParser.INF, 0); }
		public TerminalNode SUPE() { return getToken(projetCompilParser.SUPE, 0); }
		public TerminalNode INFE() { return getToken(projetCompilParser.INFE, 0); }
		public TerminalNode DIF() { return getToken(projetCompilParser.DIF, 0); }
		public TerminalNode EQ() { return getToken(projetCompilParser.EQ, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUP) | (1L << INF) | (1L << SUPE) | (1L << INFE) | (1L << EQ) | (1L << DIF))) != 0)) ) {
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

	public static class Dowhile_instContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(projetCompilParser.DO, 0); }
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(projetCompilParser.WHILE, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public Dowhile_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterDowhile_inst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitDowhile_inst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitDowhile_inst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dowhile_instContext dowhile_inst() throws RecognitionException {
		Dowhile_instContext _localctx = new Dowhile_instContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dowhile_inst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(DO);
			setState(151);
			match(T__2);
			setState(152);
			insts();
			setState(153);
			match(T__3);
			setState(154);
			match(WHILE);
			setState(155);
			match(T__0);
			setState(156);
			comp();
			setState(157);
			match(T__1);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(projetCompilParser.SCAN, 0); }
		public ListIDContext listID() {
			return getRuleContext(ListIDContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(SCAN);
			setState(160);
			match(T__0);
			setState(161);
			listID();
			setState(162);
			match(T__1);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(projetCompilParser.PRINT, 0); }
		public TerminalNode STRINGVAL() { return getToken(projetCompilParser.STRINGVAL, 0); }
		public ListIDContext listID() {
			return getRuleContext(ListIDContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(PRINT);
			setState(165);
			match(T__0);
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGVAL:
				{
				setState(166);
				match(STRINGVAL);
				}
				break;
			case ID:
				{
				setState(167);
				listID();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(170);
			match(T__1);
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

	public static class ListIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(projetCompilParser.ID, 0); }
		public ListIDContext listID() {
			return getRuleContext(ListIDContext.class,0);
		}
		public ListIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).enterListID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof projetCompilListener ) ((projetCompilListener)listener).exitListID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof projetCompilVisitor ) return ((projetCompilVisitor<? extends T>)visitor).visitListID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListIDContext listID() throws RecognitionException {
		ListIDContext _localctx = new ListIDContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listID);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ID);
				setState(173);
				match(T__5);
				setState(174);
				listID();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 9:
			return t_sempred((TContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean t_sempred(TContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\5\6G\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\bW\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nd\n\n\f\n\16"+
		"\ng\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13p\n\13\f\13\16\13s\13"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\177\n\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0091\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\5\25\u00ab\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00b3\n\26\3\26\2"+
		"\4\22\24\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\3\2\17\21"+
		"\3\2\33\34\3\2\35\36\4\2\f\r%%\3\2\37$\2\u00ad\2,\3\2\2\2\4:\3\2\2\2\6"+
		"<\3\2\2\2\b@\3\2\2\2\nF\3\2\2\2\fO\3\2\2\2\16V\3\2\2\2\20X\3\2\2\2\22"+
		"\\\3\2\2\2\24h\3\2\2\2\26t\3\2\2\2\30v\3\2\2\2\32~\3\2\2\2\34\u0080\3"+
		"\2\2\2\36\u0082\3\2\2\2 \u0092\3\2\2\2\"\u0096\3\2\2\2$\u0098\3\2\2\2"+
		"&\u00a1\3\2\2\2(\u00a6\3\2\2\2*\u00b2\3\2\2\2,-\7\16\2\2-.\7\t\2\2./\7"+
		"\3\2\2/\60\7\4\2\2\60\61\7\5\2\2\61\62\5\4\3\2\62\63\7\24\2\2\63\64\5"+
		"\f\7\2\64\65\7\6\2\2\65\3\3\2\2\2\66\67\5\6\4\2\678\5\4\3\28;\3\2\2\2"+
		"9;\5\6\4\2:\66\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<=\5\b\5\2=>\5\n\6\2>?\7\7"+
		"\2\2?\7\3\2\2\2@A\t\2\2\2A\t\3\2\2\2BC\7\n\2\2CD\7\b\2\2DG\5\n\6\2EG\7"+
		"\n\2\2FB\3\2\2\2FE\3\2\2\2G\13\3\2\2\2HI\5\16\b\2IJ\7\7\2\2JK\5\f\7\2"+
		"KP\3\2\2\2LM\5\16\b\2MN\7\7\2\2NP\3\2\2\2OH\3\2\2\2OL\3\2\2\2P\r\3\2\2"+
		"\2QW\5\20\t\2RW\5\36\20\2SW\5$\23\2TW\5&\24\2UW\5(\25\2VQ\3\2\2\2VR\3"+
		"\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\17\3\2\2\2XY\7\n\2\2YZ\7\32\2\2"+
		"Z[\5\22\n\2[\21\3\2\2\2\\]\b\n\1\2]^\5\24\13\2^e\3\2\2\2_`\f\4\2\2`a\5"+
		"\26\f\2ab\5\24\13\2bd\3\2\2\2c_\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2"+
		"f\23\3\2\2\2ge\3\2\2\2hi\b\13\1\2ij\5\32\16\2jq\3\2\2\2kl\f\4\2\2lm\5"+
		"\30\r\2mn\5\32\16\2np\3\2\2\2ok\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"r\25\3\2\2\2sq\3\2\2\2tu\t\3\2\2u\27\3\2\2\2vw\t\4\2\2w\31\3\2\2\2x\177"+
		"\7\n\2\2yz\7\3\2\2z{\5\22\n\2{|\7\4\2\2|\177\3\2\2\2}\177\5\34\17\2~x"+
		"\3\2\2\2~y\3\2\2\2~}\3\2\2\2\177\33\3\2\2\2\u0080\u0081\t\5\2\2\u0081"+
		"\35\3\2\2\2\u0082\u0083\7\25\2\2\u0083\u0084\7\3\2\2\u0084\u0085\5 \21"+
		"\2\u0085\u0086\7\4\2\2\u0086\u0087\7\26\2\2\u0087\u0088\7\5\2\2\u0088"+
		"\u0089\5\f\7\2\u0089\u0090\7\6\2\2\u008a\u0091\3\2\2\2\u008b\u008c\7\27"+
		"\2\2\u008c\u008d\7\5\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\6\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0091\37\3\2\2"+
		"\2\u0092\u0093\5\22\n\2\u0093\u0094\5\"\22\2\u0094\u0095\5\22\n\2\u0095"+
		"!\3\2\2\2\u0096\u0097\t\6\2\2\u0097#\3\2\2\2\u0098\u0099\7\30\2\2\u0099"+
		"\u009a\7\5\2\2\u009a\u009b\5\f\7\2\u009b\u009c\7\6\2\2\u009c\u009d\7\31"+
		"\2\2\u009d\u009e\7\3\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7\4\2\2\u00a0"+
		"%\3\2\2\2\u00a1\u00a2\7\22\2\2\u00a2\u00a3\7\3\2\2\u00a3\u00a4\5*\26\2"+
		"\u00a4\u00a5\7\4\2\2\u00a5\'\3\2\2\2\u00a6\u00a7\7\23\2\2\u00a7\u00aa"+
		"\7\3\2\2\u00a8\u00ab\7\r\2\2\u00a9\u00ab\5*\26\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\4\2\2\u00ad)\3\2\2\2"+
		"\u00ae\u00af\7\n\2\2\u00af\u00b0\7\b\2\2\u00b0\u00b3\5*\26\2\u00b1\u00b3"+
		"\7\n\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3+\3\2\2\2\f:FOV"+
		"eq~\u0090\u00aa\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}