package code.challenges.Graph;

import java.util.ArrayList;

public class Vertex<T> {
    T value;
    ArrayList<Edge> edges;


    public Vertex(){}

    public Vertex(T value){
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

    public T getValue(){
        return this.value;
    }

    public void setValue(T val){
        this.value = val;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

}
