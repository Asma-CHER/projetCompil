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
	 * Visit a parse tree produced by {@link projetCompilParser#tinyLang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyLang(projetCompilParser.TinyLangContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#decList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecList(projetCompilParser.DecListContext ctx);
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
	 * Visit a parse tree produced by {@link projetCompilParser#instsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstsList(projetCompilParser.InstsListContext ctx);
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
	 * Visit a parse tree produced by {@link projetCompilParser#suite_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite_operation(projetCompilParser.Suite_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(projetCompilParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#operateur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperateur(projetCompilParser.OperateurContext ctx);
	/**
	 * Visit a parse tree produced by {@link projetCompilParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(projetCompilParser.OperandContext ctx);
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
	 * Visit a parse tree produced by {@link projetCompilParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(projetCompilParser.CondContext ctx);
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