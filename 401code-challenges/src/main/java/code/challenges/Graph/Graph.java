package code.challenges.Graph;

import java.util.ArrayList;

public class Graph {
    ArrayList<Vertex> vertices;

    public Graph(){
        this.vertices = new ArrayList<Vertex>();
    }


    public Vertex addVertex(){

    }
}


//    AddNode
//    Adds a new node to the graph
//        Takes in the value of that node
//        Returns the added node
//    AddEdge()
//        Adds a new edge between two nodes in the graph
//        Include the ability to have a “weight”
//        Takes in the two nodes to be connected by the edge
//        Both nodes should already be in the Graph
//    GetNodes()
//        Returns all of the nodes in the graph as a collection (set, list, or similar)
//     GetNeighbors()
//        Returns a collection of nodes connected to the given node
//        Takes in a given node
//        Include the weight of the connection in the returned collection
//     Size()
//        Returns the total number of nodes in the graph
