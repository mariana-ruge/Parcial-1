// Generated from Trig.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrigParser}.
 */
public interface TrigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrigParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TrigParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TrigParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SinExpr}
	 * labeled alternative in {@link TrigParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSinExpr(TrigParser.SinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SinExpr}
	 * labeled alternative in {@link TrigParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSinExpr(TrigParser.SinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CosExpr}
	 * labeled alternative in {@link TrigParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCosExpr(TrigParser.CosExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CosExpr}
	 * labeled alternative in {@link TrigParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCosExpr(TrigParser.CosExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TanExpr}
	 * labeled alternative in {@link TrigParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTanExpr(TrigParser.TanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TanExpr}
	 * labeled alternative in {@link TrigParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTanExpr(TrigParser.TanExprContext ctx);
}