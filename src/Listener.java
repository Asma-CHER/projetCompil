import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.LinkedList;

public class Listener extends projetCompilBaseListener{

        private TS table = new TS();
        private Quads quads = new Quads();
        private LinkedList<String> errors = new LinkedList<>();
        private QuadsGen quadsGen;
        private HashMap<ParserRuleContext,Integer> types = new HashMap<>();


        public LinkedList<String> getErrors(){
                return this.errors;
        }

        public TS getTable(){
                return table;
        }
        @Override public void exitTinyLang(projetCompilParser.TinyLangContext ctx) {
                if(errors.size() == 0) { // no errors
                        quads.addQuad("END","","","");
                        System.out.println("program compiled without errors!");
                        System.out.println("La table des symboles ");
                        System.out.println("**************************************************************");
                        for (int i = 0; i < table.getSize(); i++) {
                                System.out.println(table.getElement(i).toString());
                        }
                        System.out.println("**************************************************************");
                        System.out.println("********************** Les QUADS *****************************");

                        for (int i = 0; i < quads.size(); i++) {
                                System.out.println(quads.getQuad(i).toString());
                        }
                        System.out.println("**************************************************************");

                }
                else
                {
                        System.out.println("******************************************************");
                        System.out.println("program compiled with the following errors");
                        for (int i = 0; i < errors.size(); i++) {
                                System.out.println(errors.get(i));
                        }
                }
        }


        @Override public void exitDecList(projetCompilParser.DecListContext ctx) {

        }



        @Override public void exitDec(projetCompilParser.DecContext ctx) {

                projetCompilParser.VarContext vars = ctx.var();
                String varType = ctx.type().getText(); //    String varType = ctx.getChild(0).getText();

                Token idToken =ctx.var().ID().getSymbol(); //get symbole of child (the variable ID)
                int line = idToken.getLine(); //get the ligne
                int column = idToken.getCharPositionInLine()+1; //get the column

                for (;;vars = vars.var())
                {
                        String varName = vars.getChild(0).getText();
                        if(table.containsElement(varName)) {
                                errors.add("Double declaration de la variable: " + varName+" a la ligne: "+line+" column: "+column);
                        }
                         else
                                table.addElement(new TS.Element(varName,true, varType));
                        if(vars.var() == null)
                                return;
                }


        }



        @Override public void exitType(projetCompilParser.TypeContext ctx) { }



        @Override public void exitVar(projetCompilParser.VarContext ctx) { }



        @Override public void exitInstsList(projetCompilParser.InstsListContext ctx) { }



        @Override public void exitInst(projetCompilParser.InstContext ctx) { }



        @Override public void exitAffect(projetCompilParser.AffectContext ctx) {
                //verification de la declaration des variables
                //verifier la compatibilite des type
                Token idToken =ctx.ID().getSymbol();
                int line = idToken.getLine();
                int column = idToken.getCharPositionInLine()+1;
                String id = ctx.getChild(0).getText();
                if(table.containsElement(id)){
                        if(table.getElement(id).declared){
                                quads.addQuad("=","","",id);
                                int sauv_temp = quads.size();
                        }else{
                                errors.add("Variable: " + id+" non declaree a la ligne: "+line+" column: "+column);
                        }
                }else{
                       errors.add("Variable: " + id+" non declaree a la ligne: "+line+" column: "+column);
                }
        }



        @Override public void exitSuite_operation(projetCompilParser.Suite_operationContext ctx) { }



        @Override public void exitOperation(projetCompilParser.OperationContext ctx) { }



        @Override public void exitOperateur(projetCompilParser.OperateurContext ctx) { }



        @Override public void exitOperand(projetCompilParser.OperandContext ctx) { }



        @Override public void exitVal(projetCompilParser.ValContext ctx) { }



        @Override public void exitIfinst(projetCompilParser.IfinstContext ctx) { }



        @Override public void exitCond(projetCompilParser.CondContext ctx) { }



        @Override public void exitOp(projetCompilParser.OpContext ctx) { }


        @Override public void exitDowhile_inst(projetCompilParser.Dowhile_instContext ctx) { }



        @Override public void exitRead(projetCompilParser.ReadContext ctx) { }



        @Override public void exitWrite(projetCompilParser.WriteContext ctx) { }

        @Override public void exitListID(projetCompilParser.ListIDContext ctx) { }


        @Override public void enterEveryRule(ParserRuleContext ctx) { }

        @Override public void exitEveryRule(ParserRuleContext ctx) { }

        @Override public void visitTerminal(TerminalNode node) { }

        @Override public void visitErrorNode(ErrorNode node) { }


    }

