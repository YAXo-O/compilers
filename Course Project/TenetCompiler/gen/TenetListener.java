// Generated from D:/Study/Compilers/Course Project/TenetCompiler/TenetCompiler/antlr\Tenet.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TenetParser}.
 */
public interface TenetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TenetParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TenetParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TenetParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TenetParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TenetParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(TenetParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TenetParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(TenetParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TenetParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(TenetParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TenetParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(TenetParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TenetParser#declare_function}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_function(TenetParser.Declare_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TenetParser#declare_function}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_function(TenetParser.Declare_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TenetParser#define_variable}.
	 * @param ctx the parse tree
	 */
	void enterDefine_variable(TenetParser.Define_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TenetParser#define_variable}.
	 * @param ctx the parse tree
	 */
	void exitDefine_variable(TenetParser.Define_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TenetParser#define_constant}.
	 * @param ctx the parse tree
	 */
	void enterDefine_constant(TenetParser.Define_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TenetParser#define_constant}.
	 * @param ctx the parse tree
	 */
	void exitDefine_constant(TenetParser.Define_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TenetParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arguments(TenetParser.Function_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TenetParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arguments(TenetParser.Function_argumentsContext ctx);
}