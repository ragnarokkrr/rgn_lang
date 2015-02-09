package org.rgn.dsl.sanaulla.internal.fluent;

import static org.rgn.dsl.sanaulla.internal.fluent.GraphBuilder.Graph;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class GraphDslSample {
    public static void main(String[] args) {
        Graph()
            .edge()
               .from("a")
               .to("b")
               .weight(40.)
            .edge()
                .from("b")
                .to("c")
                .weight(20.)
            .edge()
                .from("d")
                .to("e")
                .weight(50.5)
            .printGraph();


    }

}
