package org.rgn.dsl.sanaulla.internal.model;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class Vertex implements Comparable<Vertex> {
    private String label;

    public Vertex(String lbl) {
        setLabel(lbl);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public int compareTo(Vertex o) {
        return this.getLabel().compareTo(o.getLabel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex that = (Vertex) o;

        return com.google.common.base.Objects.equal(this.label, that.label);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(label);
    }
}
