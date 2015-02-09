package org.rgn.dsl.sanaulla.internal.nested;

import org.rgn.dsl.sanaulla.internal.model.Graph;

import static org.rgn.dsl.sanaulla.internal.nested.NestedEdgeBuilder.*;
import static org.rgn.dsl.sanaulla.internal.nested.NestedGraphBuilder.*;
import static org.rgn.dsl.sanaulla.internal.nested.NestedVertexBuilder.*;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class NestedGraphDSL {
    public static void main(String[] args) {
        Graph.printGraph(
            Graph(
                edge(from("a"), to("b"), weight(23.5)),
                edge(from("b"), to("c"), weight(56.5))
            )

        );
    }
}
