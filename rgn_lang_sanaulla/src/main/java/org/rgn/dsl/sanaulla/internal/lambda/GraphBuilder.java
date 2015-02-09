package org.rgn.dsl.sanaulla.internal.lambda;

import org.rgn.dsl.sanaulla.internal.model.Edge;
import org.rgn.dsl.sanaulla.internal.model.Graph;

import java.util.function.Consumer;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class GraphBuilder {
    Graph g;

    public GraphBuilder() {
        g = new Graph();
    }

    public static Graph Graph(Consumer<GraphBuilder> gConsumer) {
        GraphBuilder graphBuilder = new GraphBuilder();
        gConsumer.accept(graphBuilder);
        return graphBuilder.g;
    }

    public void edge(Consumer<EdgeBuilder> eConsumer) {
        EdgeBuilder edgeBuilder = new EdgeBuilder();
        eConsumer.accept(edgeBuilder);
        Edge e = edgeBuilder.edge();
        g.addEdge(e);
        g.addVertice(e.getFromVertex());
        g.addVertice(e.getToVertex());
    }
}
