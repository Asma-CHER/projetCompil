// Generated from C:/Users/pc/IdeaProjects/projetCompil/src\projetCompil.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WS=8, SPACE=9, 
		ONELINE=10, MULLINE=11, COMPIL=12, INT=13, FLOAT=14, STRING=15, SCAN=16, 
		PRINT=17, START=18, IF=19, THEN=20, ELSE=21, DO=22, WHILE=23, INTEGERVAL=24, 
		FLOATVAL=25, NAMEPROG=26, ID=27, STRINGVAL=28, AFF=29, PLUS=30, MINUS=31, 
		MUL=32, DIV=33, SUP=34, INF=35, SUPE=36, INFE=37, EQ=38, DIF=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "WS", "SPACE", 
			"ONELINE", "MULLINE", "COMPIL", "INT", "FLOAT", "STRING", "SCAN", "PRINT", 
			"START", "IF", "THEN", "ELSE", "DO", "WHILE", "INTEGERVAL", "FLOATVAL", 
			"NAMEPROG", "ID", "STRINGVAL", "AFF", "PLUS", "MINUS", "MUL", "DIV", 
			"SUP", "INF", "SUPE", "INFE", "EQ", "DIF"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "');'", null, null, null, 
			null, "'compil'", "'intCompil'", "'floatCompil'", "'StringCompil'", "'scanCompil'", 
			"'printCompil'", "'start'", "'if'", "'then'", "'else'", "'do'", "'while'", 
			null, null, null, null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'>'", 
			"'<'", "'>='", "'<='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "WS", "SPACE", "ONELINE", 
			"MULLINE", "COMPIL", "INT", "FLOAT", "STRING", "SCAN", "PRINT", "START", 
			"IF", "THEN", "ELSE", "DO", "WHILE", "INTEGERVAL", "FLOATVAL", "NAMEPROG", 
			"ID", "STRINGVAL", "AFF", "PLUS", "MINUS", "MUL", "DIV", "SUP", "INF", 
			"SUPE", "INFE", "EQ", "DIF"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u012e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\6\tb\n\t\r\t\16\tc\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13o\n\13\f\13\16\13r\13\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u00e4\n\31\f\31"+
		"\16\31\u00e7\13\31\5\31\u00e9\n\31\3\32\5\32\u00ec\n\32\3\32\3\32\7\32"+
		"\u00f0\n\32\f\32\16\32\u00f3\13\32\3\32\3\32\7\32\u00f7\n\32\f\32\16\32"+
		"\u00fa\13\32\3\33\3\33\7\33\u00fe\n\33\f\33\16\33\u0101\13\33\3\34\3\34"+
		"\7\34\u0105\n\34\f\34\16\34\u0108\13\34\3\35\3\35\3\35\3\35\7\35\u010e"+
		"\n\35\f\35\16\35\u0111\13\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3{\2)\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)\3\2\13\4\2\13\f\17\17\3\2\"\"\3\2\f\f\3\2\63;\3\2\62"+
		";\3\2C\\\5\2\62;C\\c|\4\2C\\c|\3\2$$\2\u0139\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13Y\3"+
		"\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21a\3\2\2\2\23g\3\2\2\2\25k\3\2\2\2\27u"+
		"\3\2\2\2\31\u0083\3\2\2\2\33\u008a\3\2\2\2\35\u0094\3\2\2\2\37\u00a0\3"+
		"\2\2\2!\u00ad\3\2\2\2#\u00b8\3\2\2\2%\u00c4\3\2\2\2\'\u00ca\3\2\2\2)\u00cd"+
		"\3\2\2\2+\u00d2\3\2\2\2-\u00d7\3\2\2\2/\u00da\3\2\2\2\61\u00e8\3\2\2\2"+
		"\63\u00eb\3\2\2\2\65\u00fb\3\2\2\2\67\u0102\3\2\2\29\u0109\3\2\2\2;\u0114"+
		"\3\2\2\2=\u0116\3\2\2\2?\u0118\3\2\2\2A\u011a\3\2\2\2C\u011c\3\2\2\2E"+
		"\u011e\3\2\2\2G\u0120\3\2\2\2I\u0122\3\2\2\2K\u0125\3\2\2\2M\u0128\3\2"+
		"\2\2O\u012b\3\2\2\2QR\7*\2\2R\4\3\2\2\2ST\7+\2\2T\6\3\2\2\2UV\7}\2\2V"+
		"\b\3\2\2\2WX\7\177\2\2X\n\3\2\2\2YZ\7=\2\2Z\f\3\2\2\2[\\\7.\2\2\\\16\3"+
		"\2\2\2]^\7+\2\2^_\7=\2\2_\20\3\2\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2de\3\2\2\2ef\b\t\2\2f\22\3\2\2\2gh\t\3\2\2hi\3\2\2\2i"+
		"j\b\n\2\2j\24\3\2\2\2kl\7\61\2\2lp\7\61\2\2mo\n\4\2\2nm\3\2\2\2or\3\2"+
		"\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\b\13\2\2t\26\3\2\2\2uv"+
		"\7\61\2\2vw\7,\2\2w{\3\2\2\2xz\13\2\2\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2\2"+
		"{y\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7,\2\2\177\u0080\7\61\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\b\f\2\2\u0082\30\3\2\2\2\u0083\u0084\7e\2\2\u0084"+
		"\u0085\7q\2\2\u0085\u0086\7o\2\2\u0086\u0087\7r\2\2\u0087\u0088\7k\2\2"+
		"\u0088\u0089\7n\2\2\u0089\32\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7"+
		"p\2\2\u008c\u008d\7v\2\2\u008d\u008e\7E\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7o\2\2\u0090\u0091\7r\2\2\u0091\u0092\7k\2\2\u0092\u0093\7n\2\2\u0093"+
		"\34\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7n\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0098\7c\2\2\u0098\u0099\7v\2\2\u0099\u009a\7E\2\2\u009a\u009b\7q\2\2"+
		"\u009b\u009c\7o\2\2\u009c\u009d\7r\2\2\u009d\u009e\7k\2\2\u009e\u009f"+
		"\7n\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3"+
		"\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7i\2\2\u00a6"+
		"\u00a7\7E\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa\7r\2\2"+
		"\u00aa\u00ab\7k\2\2\u00ab\u00ac\7n\2\2\u00ac \3\2\2\2\u00ad\u00ae\7u\2"+
		"\2\u00ae\u00af\7e\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2"+
		"\7E\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5\7r\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7n\2\2\u00b7\"\3\2\2\2\u00b8\u00b9\7r\2\2\u00b9"+
		"\u00ba\7t\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2"+
		"\u00bd\u00be\7E\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1"+
		"\7r\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7n\2\2\u00c3$\3\2\2\2\u00c4\u00c5"+
		"\7u\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7t\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9&\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7h\2\2\u00cc"+
		"(\3\2\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"\u00d1\7p\2\2\u00d1*\3\2\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6,\3\2\2\2\u00d7\u00d8\7f\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9.\3\2\2\2\u00da\u00db\7y\2\2\u00db\u00dc\7j\2\2\u00dc"+
		"\u00dd\7k\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df\60\3\2\2\2\u00e0"+
		"\u00e9\7\62\2\2\u00e1\u00e5\t\5\2\2\u00e2\u00e4\t\6\2\2\u00e3\u00e2\3"+
		"\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e1\3\2"+
		"\2\2\u00e9\62\3\2\2\2\u00ea\u00ec\7/\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f1\t\5\2\2\u00ee\u00f0\t\6\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f8\7\60\2\2\u00f5"+
		"\u00f7\t\6\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\64\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00ff"+
		"\t\7\2\2\u00fc\u00fe\t\b\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\66\3\2\2\2\u0101\u00ff\3\2\2"+
		"\2\u0102\u0106\t\t\2\2\u0103\u0105\t\b\2\2\u0104\u0103\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u01078\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010f\7$\2\2\u010a\u010e\n\n\2\2\u010b\u010c\7^\2"+
		"\2\u010c\u010e\7$\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0111"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0113\7$\2\2\u0113:\3\2\2\2\u0114\u0115\7?\2\2\u0115"+
		"<\3\2\2\2\u0116\u0117\7-\2\2\u0117>\3\2\2\2\u0118\u0119\7/\2\2\u0119@"+
		"\3\2\2\2\u011a\u011b\7,\2\2\u011bB\3\2\2\2\u011c\u011d\7\61\2\2\u011d"+
		"D\3\2\2\2\u011e\u011f\7@\2\2\u011fF\3\2\2\2\u0120\u0121\7>\2\2\u0121H"+
		"\3\2\2\2\u0122\u0123\7@\2\2\u0123\u0124\7?\2\2\u0124J\3\2\2\2\u0125\u0126"+
		"\7>\2\2\u0126\u0127\7?\2\2\u0127L\3\2\2\2\u0128\u0129\7?\2\2\u0129\u012a"+
		"\7?\2\2\u012aN\3\2\2\2\u012b\u012c\7#\2\2\u012c\u012d\7?\2\2\u012dP\3"+
		"\2\2\2\17\2cp{\u00e5\u00e8\u00eb\u00f1\u00f8\u00ff\u0106\u010d\u010f\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}