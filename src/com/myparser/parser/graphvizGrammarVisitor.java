// Generated from C:/Users/benja/IdeaProjects/antlr_graph/src\graphvizGrammar.g4 by ANTLR 4.12.0
package com.myparser.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link graphvizGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface graphvizGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link graphvizGrammarParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(graphvizGrammarParser.GraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link graphvizGrammarParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(graphvizGrammarParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link graphvizGrammarParser#vertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertex(graphvizGrammarParser.VertexContext ctx);
	/**
	 * Visit a parse tree produced by {@link graphvizGrammarParser#weight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeight(graphvizGrammarParser.WeightContext ctx);
}