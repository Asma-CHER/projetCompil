// Generated from C:/Users/Racha/IdeaProjects/projetCompil\projetCompil.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link projetCompilParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface projetCompilVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(projetCompilParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(projetCompilParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(projetCompilParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(projetCompilParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(projetCompilParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#insts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsts(projetCompilParser.InstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(projetCompilParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#affect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffect(projetCompilParser.AffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(projetCompilParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(projetCompilParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#opmi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpmi(projetCompilParser.OpmiContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#opma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpma(projetCompilParser.OpmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#endEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndEx(projetCompilParser.EndExContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(projetCompilParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#ifinst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfinst(projetCompilParser.IfinstContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(projetCompilParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(projetCompilParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#dowhile_inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile_inst(projetCompilParser.Dowhile_instContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(projetCompilParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(projetCompilParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#listID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListID(projetCompilParser.ListIDContext ctx);
}