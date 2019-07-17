package code.challenges.Graph;

import code.challenges.stacksandqueues.Queue;
import java.util.ArrayList;
import java.util.HashSet;

public class Graph {
    ArrayList<Vertex> vertices;

    public Graph(){
        this.vertices = new ArrayList<Vertex>();
    }

    public Vertex addVertex(int val){
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
        dest.addEdge(wt, source);
    }

    public ArrayList<Vertex> getNodes(){
        return this.vertices;
    }

    public ArrayList<Edge> getNeighbors(Vertex target){
        return target.edges;
    }

    public int size(){
        return vertices.size();
    }

    //For the breadth-first-traversal
    public ArrayList<Vertex> breadthFirstTraversal(Vertex start){
        Queue<Vertex> toVisit = new Queue<>();
        ArrayList<Vertex> output = new ArrayList<>();
        HashSet<Vertex> visited = new HashSet<>();
        toVisit.enqueue(start);
        while (!toVisit.isEmpty() && !visited.contains(curr)){
            Vertex curr = toVisit.dequeue();
            output.add(curr);
            visited.add(curr);
            if (curr.edges != null){
                for (Edge edge : curr.edges){
                    toVisit.enqueue(edge.getDestination());
                }
            }
        }
        return output;
    }
}
