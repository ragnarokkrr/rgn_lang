// Generated from /home/ragnarokkrr/prj/rgn_lang/rgn_lang_sanaulla/src/main/java/org/rgn/dsl/sanaulla/external/Graph.g4 by ANTLR 4.5
package org.rgn.dsl.sanaulla.external.ant;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphParser}.
 */
public interface GraphListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraphParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(@NotNull GraphParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(@NotNull GraphParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#vertex}.
	 * @param ctx the parse tree
	 */
	void enterVertex(@NotNull GraphParser.VertexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#vertex}.
	 * @param ctx the parse tree
	 */
	void exitVertex(@NotNull GraphParser.VertexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(@NotNull GraphParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(@NotNull GraphParser.EdgeContext ctx);
}