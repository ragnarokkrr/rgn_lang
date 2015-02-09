package org.rgn.dsl.sanaulla.external;

import org.rgn.dsl.sanaulla.external.ant.GraphBaseListener;
import org.rgn.dsl.sanaulla.external.ant.GraphParser;
import org.rgn.dsl.sanaulla.internal.model.Edge;
import org.rgn.dsl.sanaulla.internal.model.Graph;
import org.rgn.dsl.sanaulla.internal.model.Vertex;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class MyGraphBaseListener extends GraphBaseListener {
    private final Graph g;

    public MyGraphBaseListener(Graph g) {
        this.g = g;
    }

    @Override
    public void exitEdge(GraphParser.EdgeContext context) {

        Vertex fromVertex = new Vertex(context.vertex(0).ID().getText());
        Vertex toVertex = new Vertex(context.vertex(1).ID().getText());
        double weight = Double.parseDouble(context.NUM().getText());
        Edge e = new Edge(fromVertex, toVertex, weight);
        g.addEdge(e);
        g.addVertice(fromVertex);
        g.addVertice(toVertex);
    }

}
