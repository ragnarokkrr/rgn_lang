// Generated from /home/ragnarokkrr/prj/rgn_lang/rgn_lang_bart_tl/src/main/antlr4/CSV.g4 by ANTLR 4.5
package org.rgn.lang.csv;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVParser}.
 */
public interface CSVListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull CSVParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull CSVParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(@NotNull CSVParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(@NotNull CSVParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull CSVParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull CSVParser.ValueContext ctx);
}