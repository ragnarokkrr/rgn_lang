package org.rgn.dsl.sanaulla.internal.nested;

import org.rgn.dsl.sanaulla.internal.model.Edge;
import org.rgn.dsl.sanaulla.internal.model.Graph;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class NestedGraphBuilder {

    public static Graph Graph(Edge... edges) {
        Graph g = new Graph();
        for (Edge e : edges) {
            g.addEdge(e);
            g.addVertice(e.getFromVertex());
            g.addVertice(e.getToVertex());
        }

        return g;
    }
}
