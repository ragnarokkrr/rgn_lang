// Generated from /home/ragnarokkrr/prj/rgn_lang/rgn_lang_prag_ant/src/main/resources/org/rgn/prag/ant/c03/ArrayInit.g4 by ANTLR 4.5
package org.rgn.prag.ant.c03.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayInitParser}.
 */
public interface ArrayInitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrayInitParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull ArrayInitParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayInitParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull ArrayInitParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ArrayInitParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ArrayInitParser.ValueContext ctx);
}