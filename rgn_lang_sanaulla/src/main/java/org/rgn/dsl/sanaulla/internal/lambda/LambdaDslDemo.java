package org.rgn.dsl.sanaulla.internal.lambda;

import org.rgn.dsl.sanaulla.internal.model.Graph;

import static org.rgn.dsl.sanaulla.internal.lambda.GraphBuilder.*;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class LambdaDslDemo {
    public static void main(String[] args) {
        Graph g1 = Graph(
                g -> {
                    g.edge(e -> {
                        e.from("a");
                        e.to("b");
                        e.weight(12.4);
                    });
                }

        );

        Graph.printGraph(g1);
    }

}
