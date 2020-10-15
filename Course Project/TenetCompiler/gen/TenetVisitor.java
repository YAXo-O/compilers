// Generated from D:/Study/Compilers/Course Project/TenetCompiler/TenetCompiler/antlr\Tenet.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TenetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TenetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TenetParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TenetParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TenetParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(TenetParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TenetParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(TenetParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TenetParser#declare_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_function(TenetParser.Declare_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TenetParser#define_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_variable(TenetParser.Define_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TenetParser#define_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_constant(TenetParser.Define_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TenetParser#function_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arguments(TenetParser.Function_argumentsContext ctx);
}