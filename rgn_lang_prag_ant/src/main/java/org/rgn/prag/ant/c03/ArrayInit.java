package org.rgn.prag.ant.c03;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.rgn.prag.ant.c03.parser.ArrayInitLexer;
import org.rgn.prag.ant.c03.parser.ArrayInitParser;

/**
 * Created by ragnarokkrr on 09/02/15.
 */
public class ArrayInit {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream((System.in));

        ArrayInitLexer lexer = new ArrayInitLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);


        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init();
        System.out.println(tree.toStringTree(parser));

    }

}
