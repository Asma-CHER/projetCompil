// Generated from C:/Users/Racha/IdeaProjects/projetCompil\projetCompil.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link projetCompilParser}.
 */
public interface projetCompilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(projetCompilParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(projetCompilParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(projetCompilParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(projetCompilParser.DeclarationsContext ctx);
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
	 * Enter a parse tree produced by {@link projetCompilParser#insts}.
	 * @param ctx the parse tree
	 */
	void enterInsts(projetCompilParser.InstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#insts}.
	 * @param ctx the parse tree
	 */
	void exitInsts(projetCompilParser.InstsContext ctx);
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
	 * Enter a parse tree produced by {@link projetCompilParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(projetCompilParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(projetCompilParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(projetCompilParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(projetCompilParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#opmi}.
	 * @param ctx the parse tree
	 */
	void enterOpmi(projetCompilParser.OpmiContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#opmi}.
	 * @param ctx the parse tree
	 */
	void exitOpmi(projetCompilParser.OpmiContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#opma}.
	 * @param ctx the parse tree
	 */
	void enterOpma(projetCompilParser.OpmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#opma}.
	 * @param ctx the parse tree
	 */
	void exitOpma(projetCompilParser.OpmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link projetCompilParser#endEx}.
	 * @param ctx the parse tree
	 */
	void enterEndEx(projetCompilParser.EndExContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#endEx}.
	 * @param ctx the parse tree
	 */
	void exitEndEx(projetCompilParser.EndExContext ctx);
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
	 * Enter a parse tree produced by {@link projetCompilParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(projetCompilParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(projetCompilParser.CompContext ctx);
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
	 * Enter a parse tree produced by {@link projetCompilParser#listID}.
	 * @param ctx the parse tree
	 */
	void enterListID(projetCompilParser.ListIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link projetCompilParser#listID}.
	 * @param ctx the parse tree
	 */
	void exitListID(projetCompilParser.ListIDContext ctx);
}