package code.challenges.Graph;

import java.util.ArrayList;

public class Vertex {
    ArrayList<Edge> edges;
    

    public Vertex(){}


    protected void addEdge(int wt, Vertex src, Vertex dest){
        edges.add(new Edge(wt, src, dest));
    }


//Getters and Setters

    public ArrayList<Edge> getEdges() {
        return edges;
    }

}
