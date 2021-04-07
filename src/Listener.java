import ANTLR.projetCompilParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedList;
import ANTLR.projetCompilBaseListener;
public class Listener extends projetCompilBaseListener{

        private String v= null;
        private boolean k =false;

        private String entier = "intCompil";
        private String reel = "floatCompil";
        private String chaine = "StringCompil";

        private TS table = new TS();
        private Quads quads = new Quads();
        private LinkedList<String> errors = new LinkedList<>();
        private QuadsGen quadsGen;
        private HashMap<ParserRuleContext,String> types = new HashMap<>();


        public LinkedList<String> getErrors(){
                return this.errors;
        }

        public TS getTable(){
                return table;
        }

        @Override
        public void exitTinyLang(projetCompilParser.TinyLangContext ctx) {
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
                                table.addElement(new TS.Element(varName,true, varType, null, false));
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

                //System.out.println("le type est "+ getCtxType(ctx.suite_operation()));

                if (table.getElement(ctx.ID().getText()) != null){
                if (!affectTypesCompatible(table.getElement(ctx.ID().getText()).type, getCtxType(ctx.suite_operation())))

                        errors.add("incompatible types in affectation ligne : " + ctx.ID().getSymbol().getLine());
                clearMap();}

                if(table.containsElement(id)){
                        if(table.getElement(id).declared){
                                quads.addQuad("=","exp","",id);
                                //int sauv_temp = quads.size();
                                table.getElement(id).setInitialise(true);
                                table.getElement(id).setValue(v);

                        }else{
                                errors.add("Variable: " + id+" non declaree a la ligne: "+line+" column: "+column);
                        }
                }else{
                       errors.add("Variable: " + id+" non declaree a la ligne: "+line+" column: "+column);
                }
        }

        @Override public void exitSuite_operation(projetCompilParser.Suite_operationContext ctx) {


                if(ctx.suite_operation() == null){
                        addCtxType(ctx,getCtxType(ctx.suite_operation2()));

                /*for (int i=0; i< ctx.children.size(); i++){
                        if (ctx.suite_operation().suite_operation2().operand().ID() !=null){
                                System.out.println("affichage"+ ctx.children.get(i).getText());
                        }

                }*/}
                else
                {
                        if(TypesCompatible(getCtxType(ctx.suite_operation()),getCtxType(ctx.suite_operation2())))
                                addCtxType(ctx,getResultingType(getCtxType(ctx.suite_operation()),getCtxType(ctx.suite_operation2())));
                        else {
                                addCtxType(ctx, null);
                        }

                }
        }

        @Override public void exitOperand(projetCompilParser.OperandContext ctx) {

             if(ctx.ID()!=null){
                     addCtxType(ctx, table.getElement(ctx.ID().getText()).type);
                     Token idToken =ctx.ID().getSymbol();
                     int line = idToken.getLine();
                     int column = idToken.getCharPositionInLine()+1;
                String id = ctx.ID().getText();
                if(table.containsElement(id)){
                        if(table.getElement(id).declared){
                                quads.addQuad("+","",id,"expA");
                                int sauv_temp = quads.size();
                        }else{
                              errors.add("Variable: " + id+" non declaree a la ligne: "+line+" column: "+column);
                        }
                }else{
                        errors.add("Variable: " + id+" non declaree a la ligne: "+line+" column: "+column);
                }}

             if ( ctx.val() != null){
                     addCtxType(ctx, getCtxType(ctx.val()));
             }
        }

        @Override
        public void exitSuite_operation2(projetCompilParser.Suite_operation2Context ctx) {
                if(ctx.suite_operation2() == null)
                        addCtxType(ctx,getCtxType(ctx.operand()));
                else
                {
                        if(TypesCompatible(getCtxType(ctx.suite_operation2()),getCtxType(ctx.operand())))
                                addCtxType(ctx,getResultingType(getCtxType(ctx.suite_operation2()),getCtxType(ctx.operand())));
                        else {
                                addCtxType(ctx, null);
                        }

                }

        }

        @Override public void exitVal(projetCompilParser.ValContext ctx) {
                if (ctx.INTEGERVAL()!= null){
                        addCtxType(ctx, entier);
                        v = String.valueOf(ctx.INTEGERVAL());
                }
                if (ctx.FLOATVAL()!= null){
                        addCtxType(ctx, reel);
                        v = String.valueOf(ctx.FLOATVAL());
                }
                if (ctx.STRINGVAL()!= null){
                        addCtxType(ctx, chaine);
                        v = String.valueOf(ctx.STRINGVAL());
                }

        }

        @Override public void exitIfinst(projetCompilParser.IfinstContext ctx) { }



        @Override public void exitCond(projetCompilParser.CondContext ctx) { }



        @Override public void exitOp(projetCompilParser.OpContext ctx) { }


        @Override public void exitDowhile_inst(projetCompilParser.Dowhile_instContext ctx) { }



        @Override public void exitRead(projetCompilParser.ReadContext ctx) { }



        @Override public void exitWrite(projetCompilParser.WriteContext ctx) { }

        @Override public void exitListID(projetCompilParser.ListIDContext ctx) { }

        @Override public void exitEveryRule(ParserRuleContext ctx) {
        }

        @Override public void visitTerminal(TerminalNode node) { }

        @Override public void visitErrorNode(ErrorNode node) { }



        private void addCtxType(ParserRuleContext ctx, String type) {
                types.put(ctx, type);
        }

        private String getCtxType(ParserRuleContext ctx) {
                return types.get(ctx);
        }

        private void clearMap() {
                types.clear();
        }


        private boolean affectTypesCompatible(String premier, String second) {
                if (premier.equals(entier)) {
                        if (second.equals(entier)) {
                                return true;
                        } else {
                                System.out.println("types incompatibles");
                                return false;
                        }
                } else if (premier.equals(reel)) {
                        if (second.equals(entier) || second.equals(reel)) {
                                return true;
                        } else {
                                System.out.println("types incompatibles");
                                return false;
                        }
                } else if (premier.equals(chaine)) {
                        if (second.equals(chaine)) {
                                return true;
                        } else {
                                System.out.println("types incompatibles");
                                return false;
                        }
                }
                return false;
        }


        private boolean TypesCompatible(String premier, String second) {
                if ((premier.equals(entier) || premier.equals(reel)) && ((second.equals(entier) || second.equals(reel)))){
                        return true;
                }
                return false;

        }



        private String getResultingType(String premier, String second) {
                if (premier.equals(entier) && second.equals(entier )){
                        return entier;
                }
                if (premier.equals(reel) || second.equals(reel)){
                        return reel;
                }
                return null;
        }

    }

