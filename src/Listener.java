import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedList;

public class Listener extends projetCompilBaseListener{



        private TS table = new TS();
        private LinkedList<String> errors = new LinkedList<>();
        private HashMap<ParserRuleContext,Integer> types = new HashMap<>();



        @Override public void exitTinyLang(projetCompilParser.TinyLangContext ctx) {
                if(errors.size() == 0) { // no errors
                        System.out.println("program compiled without errors!");
                        System.out.println("La table des symboles ");
                        System.out.println("******************************************************");
                        for (int i = 0; i < table.getSize(); i++) {
                                System.out.println(table.getElement(i).toString());
                        }
                        System.out.println("******************************************************");
                }
                else
                {
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

                for (;;vars = vars.var())
                {
                        String varType = vars.getChild(0).getText();
                        String varName = vars.getChild(1).getText();

                        if(table.containsElement(varName)) {
                                errors.add("Double declaration of variable: " + varName);
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



        @Override public void exitAffect(projetCompilParser.AffectContext ctx) { }



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

