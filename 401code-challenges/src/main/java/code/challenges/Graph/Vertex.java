package code.challenges.Graph;

import java.util.ArrayList;

public class Vertex {
    int value;
    ArrayList<Edge> edges;


    public Vertex(){}

    public Vertex(int value){
        this.value = value;
    }

    protected void addEdge(int wt, Vertex src, Vertex dest){
        edges.add(new Edge(wt, src, dest));
    }


//Getters and Setters

    public int getValue(){
        return this.value;
    }

    public void setValue(int val){
        this.value = val;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

}
