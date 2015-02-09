package org.rgn.dsl.sanaulla.external;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.rgn.dsl.sanaulla.external.ant.GraphLexer;
import org.rgn.dsl.sanaulla.external.ant.GraphParser;
import org.rgn.dsl.sanaulla.internal.model.Graph;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class GraphDslAntlrSample {
    public static void main(String[] args) throws IOException {

        InputStream is =
                GraphDslAntlrSample.class.getClassLoader()
                        .getSystemResourceAsStream("org/rgn/dsl/sanaulla/external/Graph.graph");

        CharStream cs = new ANTLRInputStream(is);

        GraphLexer lexer = new GraphLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);


        GraphParser parser = new GraphParser(tokens);

        Graph g = new Graph();

        parser.addParseListener(new MyGraphBaseListener(g));

        parser.graph();

        Graph.printGraph(g);

    }

}
