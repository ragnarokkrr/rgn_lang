package org.rgn.dsl.sanaulla.internal.model;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class Edge {
    private Vertex fromVertex;
    private Vertex toVertex;
    private Double weight;

    public Edge() {
    }

    public Edge(Vertex fromVertex, Vertex toVertex, Double weight) {
        this.fromVertex = fromVertex;
        this.toVertex = toVertex;
        this.weight = weight;
    }


    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return fromVertex.getLabel() +
                " to " + toVertex.getLabel() +
                " with weight " + weight;
    }
}

