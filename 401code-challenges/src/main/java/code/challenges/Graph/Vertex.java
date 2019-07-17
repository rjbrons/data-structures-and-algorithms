package code.challenges.Graph;

import java.util.ArrayList;

public class Vertex {
    int value;
    ArrayList<Edge> edges;


    public Vertex(){}

    public Vertex(int value){
        this.edges = new ArrayList<>();
        this.value = value;
    }

    protected void addEdge(Vertex dest){
        edges.add(new Edge(dest));
    }

    public void addEdge(int wt, Vertex dest){
        edges.add(new Edge(wt, dest));
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
