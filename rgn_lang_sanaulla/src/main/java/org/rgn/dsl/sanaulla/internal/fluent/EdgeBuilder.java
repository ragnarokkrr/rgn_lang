package org.rgn.dsl.sanaulla.internal.fluent;

import org.rgn.dsl.sanaulla.internal.model.Edge;
import org.rgn.dsl.sanaulla.internal.model.Vertex;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class EdgeBuilder {
    GraphBuilder graphBuilder;
    Edge edge;

    public EdgeBuilder(GraphBuilder graphBuilder) {
        this.graphBuilder = graphBuilder;
        edge = new Edge();
    }

    public EdgeBuilder from(String lbl) {
        Vertex v = new Vertex(lbl);
        edge.setFromVertex(v);
        graphBuilder.getGraph().addVertice(v);
        return this;
    }

    public EdgeBuilder to(String lbl) {
        Vertex v = new Vertex(lbl);
        edge.setToVertex(v);
        graphBuilder.getGraph().addVertice(v);
        return this;
    }

    public GraphBuilder weight(Double d) {
        edge.setWeight(d);
        return graphBuilder;
    }


}
