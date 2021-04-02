package ANTLR;// Generated from C:/Users/pc/IdeaProjects/projetCompil\projetCompil.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class projetCompilLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WS=8, COMPIL=9, 
		INT=10, FLOAT=11, STRING=12, SCAN=13, PRINT=14, START=15, IF=16, THEN=17, 
		ELSE=18, DO=19, WHILE=20, INTEGERVAL=21, FLOATVAL=22, STRINGVAL=23, NAMEPROG=24, 
		ID=25, AFF=26, PLUS=27, MINUS=28, MUL=29, DIV=30, SUP=31, INF=32, SUPE=33, 
		INFE=34, EQ=35, DIF=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "WS", "COMPIL", 
			"INT", "FLOAT", "STRING", "SCAN", "PRINT", "START", "IF", "THEN", "ELSE", 
			"DO", "WHILE", "INTEGERVAL", "FLOATVAL", "STRINGVAL", "NAMEPROG", "ID", 
			"AFF", "PLUS", "MINUS", "MUL", "DIV", "SUP", "INF", "SUPE", "INFE", "EQ", 
			"DIF"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "');'", null, "'compil'", 
			"'intCompil'", "'floatCompil'", "'StringCompil'", "'scanCompil'", "'printCompil'", 
			"'start'", "'if'", "'then'", "'else'", "'do'", "'while'", null, null, 
			"'.*'", null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "WS", "COMPIL", "INT", 
			"FLOAT", "STRING", "SCAN", "PRINT", "START", "IF", "THEN", "ELSE", "DO", 
			"WHILE", "INTEGERVAL", "FLOATVAL", "STRINGVAL", "NAMEPROG", "ID", "AFF", 
			"PLUS", "MINUS", "MUL", "DIV", "SUP", "INF", "SUPE", "INFE", "EQ", "DIF"
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


	public projetCompilLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "projetCompil.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0107\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\6\t\\\n\t\r\t\16\t]\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\5\26\u00c1\n\26\3\26\3\26\7\26\u00c5\n\26\f\26\16\26\u00c8\13\26"+
		"\5\26\u00ca\n\26\3\27\5\27\u00cd\n\27\3\27\3\27\7\27\u00d1\n\27\f\27\16"+
		"\27\u00d4\13\27\3\27\3\27\7\27\u00d8\n\27\f\27\16\27\u00db\13\27\3\30"+
		"\3\30\3\30\3\31\3\31\7\31\u00e2\n\31\f\31\16\31\u00e5\13\31\3\32\3\32"+
		"\7\32\u00e9\n\32\f\32\16\32\u00ec\13\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&\3\2\b\4\2\13\f\17\17\3\2\63;\3\2\62;\3\2C\\\5"+
		"\2\62;C\\c|\4\2C\\c|\2\u010f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2"+
		"\2\2\tQ\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21[\3\2\2\2\23a\3\2"+
		"\2\2\25h\3\2\2\2\27r\3\2\2\2\31~\3\2\2\2\33\u008b\3\2\2\2\35\u0096\3\2"+
		"\2\2\37\u00a2\3\2\2\2!\u00a8\3\2\2\2#\u00ab\3\2\2\2%\u00b0\3\2\2\2\'\u00b5"+
		"\3\2\2\2)\u00b8\3\2\2\2+\u00c9\3\2\2\2-\u00cc\3\2\2\2/\u00dc\3\2\2\2\61"+
		"\u00df\3\2\2\2\63\u00e6\3\2\2\2\65\u00ed\3\2\2\2\67\u00ef\3\2\2\29\u00f1"+
		"\3\2\2\2;\u00f3\3\2\2\2=\u00f5\3\2\2\2?\u00f7\3\2\2\2A\u00f9\3\2\2\2C"+
		"\u00fb\3\2\2\2E\u00fe\3\2\2\2G\u0101\3\2\2\2I\u0104\3\2\2\2KL\7*\2\2L"+
		"\4\3\2\2\2MN\7+\2\2N\6\3\2\2\2OP\7}\2\2P\b\3\2\2\2QR\7\177\2\2R\n\3\2"+
		"\2\2ST\7=\2\2T\f\3\2\2\2UV\7.\2\2V\16\3\2\2\2WX\7+\2\2XY\7=\2\2Y\20\3"+
		"\2\2\2Z\\\t\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_"+
		"`\b\t\2\2`\22\3\2\2\2ab\7e\2\2bc\7q\2\2cd\7o\2\2de\7r\2\2ef\7k\2\2fg\7"+
		"n\2\2g\24\3\2\2\2hi\7k\2\2ij\7p\2\2jk\7v\2\2kl\7E\2\2lm\7q\2\2mn\7o\2"+
		"\2no\7r\2\2op\7k\2\2pq\7n\2\2q\26\3\2\2\2rs\7h\2\2st\7n\2\2tu\7q\2\2u"+
		"v\7c\2\2vw\7v\2\2wx\7E\2\2xy\7q\2\2yz\7o\2\2z{\7r\2\2{|\7k\2\2|}\7n\2"+
		"\2}\30\3\2\2\2~\177\7U\2\2\177\u0080\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7i\2\2\u0084\u0085\7E\2\2\u0085"+
		"\u0086\7q\2\2\u0086\u0087\7o\2\2\u0087\u0088\7r\2\2\u0088\u0089\7k\2\2"+
		"\u0089\u008a\7n\2\2\u008a\32\3\2\2\2\u008b\u008c\7u\2\2\u008c\u008d\7"+
		"e\2\2\u008d\u008e\7c\2\2\u008e\u008f\7p\2\2\u008f\u0090\7E\2\2\u0090\u0091"+
		"\7q\2\2\u0091\u0092\7o\2\2\u0092\u0093\7r\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7n\2\2\u0095\34\3\2\2\2\u0096\u0097\7r\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b\u009c\7E\2\2"+
		"\u009c\u009d\7q\2\2\u009d\u009e\7o\2\2\u009e\u009f\7r\2\2\u009f\u00a0"+
		"\7k\2\2\u00a0\u00a1\7n\2\2\u00a1\36\3\2\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4"+
		"\7v\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		" \3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa\"\3\2\2\2\u00ab"+
		"\u00ac\7v\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7p\2\2"+
		"\u00af$\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7u\2"+
		"\2\u00b3\u00b4\7g\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7"+
		"q\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd*\3\2\2\2\u00be\u00ca"+
		"\7\62\2\2\u00bf\u00c1\7/\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c6\t\3\2\2\u00c3\u00c5\t\4\2\2\u00c4\u00c3\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00be\3\2\2\2\u00c9\u00c0\3\2"+
		"\2\2\u00ca,\3\2\2\2\u00cb\u00cd\7/\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d2\t\3\2\2\u00cf\u00d1\t\4\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d9\7\60\2\2\u00d6"+
		"\u00d8\t\4\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da.\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd"+
		"\7\60\2\2\u00dd\u00de\7,\2\2\u00de\60\3\2\2\2\u00df\u00e3\t\5\2\2\u00e0"+
		"\u00e2\t\6\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\62\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00ea"+
		"\t\7\2\2\u00e7\u00e9\t\6\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\64\3\2\2\2\u00ec\u00ea\3\2\2"+
		"\2\u00ed\u00ee\7?\2\2\u00ee\66\3\2\2\2\u00ef\u00f0\7-\2\2\u00f08\3\2\2"+
		"\2\u00f1\u00f2\7/\2\2\u00f2:\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4<\3\2\2\2"+
		"\u00f5\u00f6\7\61\2\2\u00f6>\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8@\3\2\2\2"+
		"\u00f9\u00fa\7>\2\2\u00faB\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\7?\2"+
		"\2\u00fdD\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff\u0100\7?\2\2\u0100F\3\2\2\2"+
		"\u0101\u0102\7?\2\2\u0102\u0103\7?\2\2\u0103H\3\2\2\2\u0104\u0105\7#\2"+
		"\2\u0105\u0106\7?\2\2\u0106J\3\2\2\2\f\2]\u00c0\u00c6\u00c9\u00cc\u00d2"+
		"\u00d9\u00e3\u00ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}