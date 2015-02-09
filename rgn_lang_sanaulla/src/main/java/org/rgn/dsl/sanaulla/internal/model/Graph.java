package org.rgn.dsl.sanaulla.internal.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ragnarokkrr on 08/02/15.
 */
public class Graph {
    private List<Edge> edges;
    private Set<Vertex> vertices;

    public Graph() {
        edges = new ArrayList<>();
        vertices = new TreeSet<>();
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public Set<Vertex> getVertices() {
        return vertices;
    }

    public void addVertice(Vertex v) {
        getVertices().add(v);
    }

    public void addEdge(Edge e) {
        getEdges().add(e);
    }

    public static void printGraph(Graph g) {
        System.out.println("Vertices...");
        for (Vertex v : g.getVertices()) {
            System.out.print(v.getLabel() + " ");
        }
        System.out.println("");
        System.out.println("Edges...");
        for (Edge e : g.getEdges()) {
            System.out.println(e);
        }
    }
}
