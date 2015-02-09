package org.rgn.dsl.sanaulla.internal.nested;

import org.rgn.dsl.sanaulla.internal.model.Edge;
import org.rgn.dsl.sanaulla.internal.model.Vertex;

/*
 * Created by ragnarokkrr on 08/02/15.
 */
public class NestedEdgeBuilder {
    public static Edge edge(Vertex from, Vertex to, Double weight) {
        return new Edge(from, to, weight);
    }

    public static Double weight(Double weight) {
        return weight;
    }
}
