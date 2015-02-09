package org.rgn.dsl.sanaulla.internal.lambda;

import org.rgn.dsl.sanaulla.internal.model.Edge;
import org.rgn.dsl.sanaulla.internal.model.Vertex;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class EdgeBuilder {
    private Edge e;

    public EdgeBuilder() {
        e = new Edge();
    }

    public Edge edge() {
        return e;
    }

    public void from(String lbl) {
        e.setFromVertex(new Vertex(lbl));
    }

    public void to(String lbl) {
        e.setToVertex(new Vertex(lbl));
    }

    public void weight(Double w) {
        e.setWeight(w);
    }
}
