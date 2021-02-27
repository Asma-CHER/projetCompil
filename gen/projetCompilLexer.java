// Generated from C:/Users/Racha/IdeaProjects/projetCompil\projetCompil.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Nameprog=7, ID=8, INTVAL=9, 
		FLOATVAL=10, STRINGVAL=11, COMPIL=12, INT=13, FLOAT=14, STRING=15, SCAN=16, 
		PRINT=17, START=18, IF=19, THEN=20, ELSE=21, DO=22, WHILE=23, AFF=24, 
		PLUS=25, MINUS=26, MUL=27, DIV=28, SUP=29, INF=30, SUPE=31, INFE=32, EQ=33, 
		DIF=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Nameprog", "ID", "INTVAL", 
			"FLOATVAL", "STRINGVAL", "COMPIL", "INT", "FLOAT", "STRING", "SCAN", 
			"PRINT", "START", "IF", "THEN", "ELSE", "DO", "WHILE", "AFF", "PLUS", 
			"MINUS", "MUL", "DIV", "SUP", "INF", "SUPE", "INFE", "EQ", "DIF"
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
			"MINUS", "MUL", "DIV", "SUP", "INF", "SUPE", "INFE", "EQ", "DIF"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00fc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\7\bV\n\b\f\b\16\bY\13\b\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\n\3\n\5"+
		"\nd\n\n\3\n\3\n\7\nh\n\n\f\n\16\nk\13\n\5\nm\n\n\3\13\3\13\5\13q\n\13"+
		"\3\13\3\13\7\13u\n\13\f\13\16\13x\13\13\3\13\3\13\7\13|\n\13\f\13\16\13"+
		"\177\13\13\5\13\u0081\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\b\3\2"+
		"C\\\5\2\62;C\\c|\4\2C\\c|\4\2--//\3\2\63;\3\2\62;\2\u0104\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2"+
		"\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21Z\3\2\2\2"+
		"\23l\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3\2\2\2\31\u0085\3\2\2\2\33\u008c"+
		"\3\2\2\2\35\u0096\3\2\2\2\37\u00a2\3\2\2\2!\u00af\3\2\2\2#\u00ba\3\2\2"+
		"\2%\u00c6\3\2\2\2\'\u00cc\3\2\2\2)\u00cf\3\2\2\2+\u00d4\3\2\2\2-\u00d9"+
		"\3\2\2\2/\u00dc\3\2\2\2\61\u00e2\3\2\2\2\63\u00e4\3\2\2\2\65\u00e6\3\2"+
		"\2\2\67\u00e8\3\2\2\29\u00ea\3\2\2\2;\u00ec\3\2\2\2=\u00ee\3\2\2\2?\u00f0"+
		"\3\2\2\2A\u00f3\3\2\2\2C\u00f6\3\2\2\2E\u00f9\3\2\2\2GH\7*\2\2H\4\3\2"+
		"\2\2IJ\7+\2\2J\6\3\2\2\2KL\7}\2\2L\b\3\2\2\2MN\7\177\2\2N\n\3\2\2\2OP"+
		"\7=\2\2P\f\3\2\2\2QR\7.\2\2R\16\3\2\2\2SW\t\2\2\2TV\t\3\2\2UT\3\2\2\2"+
		"VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\20\3\2\2\2YW\3\2\2\2Z^\t\4\2\2[]\t\3\2"+
		"\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\22\3\2\2\2`^\3\2\2\2am\7"+
		"\62\2\2bd\t\5\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ei\t\6\2\2fh\t\7\2\2gf"+
		"\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2la\3\2\2\2l"+
		"c\3\2\2\2m\24\3\2\2\2n\u0081\7\62\2\2oq\t\5\2\2po\3\2\2\2pq\3\2\2\2qr"+
		"\3\2\2\2rv\t\6\2\2su\t\7\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w"+
		"y\3\2\2\2xv\3\2\2\2y}\7\60\2\2z|\t\7\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2"+
		"\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080n\3\2\2\2\u0080p\3\2\2"+
		"\2\u0081\26\3\2\2\2\u0082\u0083\7\60\2\2\u0083\u0084\7,\2\2\u0084\30\3"+
		"\2\2\2\u0085\u0086\7e\2\2\u0086\u0087\7q\2\2\u0087\u0088\7o\2\2\u0088"+
		"\u0089\7r\2\2\u0089\u008a\7k\2\2\u008a\u008b\7n\2\2\u008b\32\3\2\2\2\u008c"+
		"\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\u0090\7E\2\2"+
		"\u0090\u0091\7q\2\2\u0091\u0092\7o\2\2\u0092\u0093\7r\2\2\u0093\u0094"+
		"\7k\2\2\u0094\u0095\7n\2\2\u0095\34\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098"+
		"\7n\2\2\u0098\u0099\7q\2\2\u0099\u009a\7c\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7E\2\2\u009c\u009d\7q\2\2\u009d\u009e\7o\2\2\u009e\u009f\7r\2\2"+
		"\u009f\u00a0\7k\2\2\u00a0\u00a1\7n\2\2\u00a1\36\3\2\2\2\u00a2\u00a3\7"+
		"U\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7"+
		"\7p\2\2\u00a7\u00a8\7i\2\2\u00a8\u00a9\7E\2\2\u00a9\u00aa\7q\2\2\u00aa"+
		"\u00ab\7o\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7n\2\2"+
		"\u00ae \3\2\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7c\2"+
		"\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7E\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6"+
		"\7o\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7n\2\2\u00b9"+
		"\"\3\2\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7E\2\2\u00c0\u00c1\7q\2\2"+
		"\u00c1\u00c2\7o\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5"+
		"\7n\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7v\2\2\u00cb&\3\2\2\2\u00cc\u00cd"+
		"\7k\2\2\u00cd\u00ce\7h\2\2\u00ce(\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1"+
		"\7j\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7p\2\2\u00d3*\3\2\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7g\2\2\u00d8"+
		",\3\2\2\2\u00d9\u00da\7f\2\2\u00da\u00db\7q\2\2\u00db.\3\2\2\2\u00dc\u00dd"+
		"\7y\2\2\u00dd\u00de\7j\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7n\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1\60\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3\62\3\2\2\2\u00e4"+
		"\u00e5\7-\2\2\u00e5\64\3\2\2\2\u00e6\u00e7\7/\2\2\u00e7\66\3\2\2\2\u00e8"+
		"\u00e9\7,\2\2\u00e98\3\2\2\2\u00ea\u00eb\7\61\2\2\u00eb:\3\2\2\2\u00ec"+
		"\u00ed\7@\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7>\2\2\u00ef>\3\2\2\2\u00f0\u00f1"+
		"\7@\2\2\u00f1\u00f2\7?\2\2\u00f2@\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4\u00f5"+
		"\7?\2\2\u00f5B\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7\u00f8\7?\2\2\u00f8D\3"+
		"\2\2\2\u00f9\u00fa\7#\2\2\u00fa\u00fb\7?\2\2\u00fbF\3\2\2\2\f\2W^cilp"+
		"v}\u0080\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}