package code.challenges.Graph.GetEdge;

import code.challenges.stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.HashSet;

public class GetEdge {
    ArrayList<Vertex> vertices;

    public GetEdge(){
        this.vertices = new ArrayList<Vertex>();
    }

    public Vertex addVertex(String val){
        Vertex temp = new Vertex(val);
        this.vertices.add(temp);
        return temp;
    }

    public void addEdge(Vertex source, Vertex dest){
        source.addEdge(dest);
        dest.addEdge(source);
    }

    public void addEdge(Vertex source, Vertex dest, int wt){
        source.addEdge(wt, dest);
        source.addEdge(wt, dest);
        dest.addEdge(wt, source);
    }

    public ArrayList<Vertex> getVertices(){
        return this.vertices;
    }

    public ArrayList<Edge> getNeighbors(Vertex target){
        return target.edges;
    }

    public int size(){
        return vertices.size();
    }

    public  canFlyDirect(String place)
}
