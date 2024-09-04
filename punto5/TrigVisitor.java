// Generated from Trig.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TrigParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TrigVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TrigParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TrigParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SinExpr}
	 * labeled alternative in {@link TrigParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinExpr(TrigParser.SinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CosExpr}
	 * labeled alternative in {@link TrigParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosExpr(TrigParser.CosExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TanExpr}
	 * labeled alternative in {@link TrigParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTanExpr(TrigParser.TanExprContext ctx);
}