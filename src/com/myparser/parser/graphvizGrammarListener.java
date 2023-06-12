// Generated from C:/Users/benja/IdeaProjects/antlr_graph/src\graphvizGrammar.g4 by ANTLR 4.12.0
package com.myparser.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link graphvizGrammarParser}.
 */
public interface graphvizGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link graphvizGrammarParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(graphvizGrammarParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link graphvizGrammarParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(graphvizGrammarParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link graphvizGrammarParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(graphvizGrammarParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link graphvizGrammarParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(graphvizGrammarParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link graphvizGrammarParser#vertex}.
	 * @param ctx the parse tree
	 */
	void enterVertex(graphvizGrammarParser.VertexContext ctx);
	/**
	 * Exit a parse tree produced by {@link graphvizGrammarParser#vertex}.
	 * @param ctx the parse tree
	 */
	void exitVertex(graphvizGrammarParser.VertexContext ctx);
	/**
	 * Enter a parse tree produced by {@link graphvizGrammarParser#weight}.
	 * @param ctx the parse tree
	 */
	void enterWeight(graphvizGrammarParser.WeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link graphvizGrammarParser#weight}.
	 * @param ctx the parse tree
	 */
	void exitWeight(graphvizGrammarParser.WeightContext ctx);
}