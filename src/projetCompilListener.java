// Generated from C:/Users/pc/IdeaProjects/projetCompil/src\projetCompil.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link projetCompilParser}.
 */
public interface projetCompilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#tinyLang}.
	 * @param ctx the parse tree
	 */
	void enterTinyLang(projetCompilParser.TinyLangContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#tinyLang}.
	 * @param ctx the parse tree
	 */
	void exitTinyLang(projetCompilParser.TinyLangContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#decList}.
	 * @param ctx the parse tree
	 */
	void enterDecList(projetCompilParser.DecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#decList}.
	 * @param ctx the parse tree
	 */
	void exitDecList(projetCompilParser.DecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(projetCompilParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(projetCompilParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(projetCompilParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(projetCompilParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(projetCompilParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(projetCompilParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#instsList}.
	 * @param ctx the parse tree
	 */
	void enterInstsList(projetCompilParser.InstsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#instsList}.
	 * @param ctx the parse tree
	 */
	void exitInstsList(projetCompilParser.InstsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(projetCompilParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(projetCompilParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#affect}.
	 * @param ctx the parse tree
	 */
	void enterAffect(projetCompilParser.AffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#affect}.
	 * @param ctx the parse tree
	 */
	void exitAffect(projetCompilParser.AffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#suite_operation()}.
	 * @param ctx the parse tree
	 */
	void enterSuite_operation(projetCompilParser.Suite_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#suite_operation()}.
	 * @param ctx the parse tree
	 */
	void exitSuite_operation(projetCompilParser.Suite_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#suite_operation2()}.
	 * @param ctx the parse tree
	 */
	void enterSuite_operation2(projetCompilParser.Suite_operation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#suite_operation2()}.
	 * @param ctx the parse tree
	 */
	void exitSuite_operation2(projetCompilParser.Suite_operation2Context ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#operateurP}.
	 * @param ctx the parse tree
	 */
	void enterOperateurP(projetCompilParser.OperateurPContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#operateurP}.
	 * @param ctx the parse tree
	 */
	void exitOperateurP(projetCompilParser.OperateurPContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#operateurM}.
	 * @param ctx the parse tree
	 */
	void enterOperateurM(projetCompilParser.OperateurMContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#operateurM}.
	 * @param ctx the parse tree
	 */
	void exitOperateurM(projetCompilParser.OperateurMContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(projetCompilParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(projetCompilParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(projetCompilParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(projetCompilParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#ifinst}.
	 * @param ctx the parse tree
	 */
	void enterIfinst(projetCompilParser.IfinstContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#ifinst}.
	 * @param ctx the parse tree
	 */
	void exitIfinst(projetCompilParser.IfinstContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#elseinst}.
	 * @param ctx the parse tree
	 */
	void enterElseinst(projetCompilParser.ElseinstContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#elseinst}.
	 * @param ctx the parse tree
	 */
	void exitElseinst(projetCompilParser.ElseinstContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(projetCompilParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(projetCompilParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#operandif}.
	 * @param ctx the parse tree
	 */
	void enterOperandif(projetCompilParser.OperandifContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#operandif}.
	 * @param ctx the parse tree
	 */
	void exitOperandif(projetCompilParser.OperandifContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(projetCompilParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(projetCompilParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#dowhile_inst}.
	 * @param ctx the parse tree
	 */
	void enterDowhile_inst(projetCompilParser.Dowhile_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#dowhile_inst}.
	 * @param ctx the parse tree
	 */
	void exitDowhile_inst(projetCompilParser.Dowhile_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(projetCompilParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(projetCompilParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(projetCompilParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(projetCompilParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#chaine}.
	 * @param ctx the parse tree
	 */
	void enterChaine(projetCompilParser.ChaineContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#chaine}.
	 * @param ctx the parse tree
	 */
	void exitChaine(projetCompilParser.ChaineContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#listID}.
	 * @param ctx the parse tree
	 */
	void enterListID(projetCompilParser.ListIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#listID}.
	 * @param ctx the parse tree
	 */
	void exitListID(projetCompilParser.ListIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#listIDR}.
	 * @param ctx the parse tree
	 */
	void enterListIDR(projetCompilParser.ListIDRContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#listIDR}.
	 * @param ctx the parse tree
	 */
	void exitListIDR(projetCompilParser.ListIDRContext ctx);
}