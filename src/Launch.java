import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {

    public static void main(String[] args){
        try{
            String source = "test.txt";
            CharStream cs = fromFileName(source);
            projetCompilLexer lexer = new projetCompilLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            projetCompilParser parser = new projetCompilParser(token);
            ParseTree tree = parser.tinyLang(); //test sur le programme tinylang

            Listener listener = new Listener();
            ParseTreeWalker.DEFAULT.walk(listener, tree);
        }
        catch (IOException e ){
            e.printStackTrace();
        }
    }
}
