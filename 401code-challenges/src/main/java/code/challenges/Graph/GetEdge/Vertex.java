package code.challenges.Graph.GetEdge;

import java.util.ArrayList;

public class Vertex {
    String value;
    ArrayList<Edge> edges;


    public Vertex(){}

    public Vertex(String value){
        this.edges = new ArrayList<>();
        this.value = value;
    }

    protected void addEdge(Vertex dest){
        edges.add(new Edge());
    }

    public void addEdge(int wt, Vertex dest){
        edges.add(new Edge(wt, dest));
    }


//Getters and Setters

    public String getValue(){
        return this.value;
    }

    public void setValue(String val){
        this.value = val;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

}
