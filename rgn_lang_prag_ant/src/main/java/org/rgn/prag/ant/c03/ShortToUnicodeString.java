package org.rgn.prag.ant.c03;

import org.antlr.v4.runtime.misc.NotNull;
import org.rgn.prag.ant.c03.parser.ArrayInitBaseListener;
import org.rgn.prag.ant.c03.parser.ArrayInitParser;

/**
 * Created by ragnarokkrr on 09/02/15.
 */
public class ShortToUnicodeString extends ArrayInitBaseListener {
    @Override
    public void enterInit(@NotNull ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    @Override
    public void exitInit(@NotNull ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    @Override
    public void enterValue(@NotNull ArrayInitParser.ValueContext ctx) {
        int value = Integer.valueOf(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
    }
}
