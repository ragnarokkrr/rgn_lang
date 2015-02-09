package org.rgn.dsl.sanaulla.internal.nested;

import org.rgn.dsl.sanaulla.internal.model.Vertex;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class NestedVertexBuilder {
    public static Vertex from(String lbl) {
        return new Vertex(lbl);
    }

    public static Vertex to(String lbl) {
        return new Vertex(lbl);
    }

}
