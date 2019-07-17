package code.challenges.Graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addVertex() {
        Graph test = new Graph();
        test.addVertex(5);
        assertEquals(5, test.vertices.get(0).value);
    }

    @Test
    public void addEdge() {
        Graph test = new Graph();
        test.addVertex(1);
        test.addVertex(5);
        test.addEdge(test.getVertices().get(0), test.getVertices().get(1));
        Vertex test1 = test.getVertices().get(0).getEdges().get(0).destination;
        System.out.println(test1.value);
        Vertex test2 = test.getVertices().get(1).getEdges().get(0).destination;
        System.out.println(test2.value);
        assertEquals(5, test1.value);
        assertEquals(1, test2.value);
    }

    @Test
    public void testGetVertices() {
        Graph test = new Graph();
        test.addVertex(1);
        test.addVertex(2);
        test.addVertex(3);
        ArrayList<Vertex> output = test.getVertices();
        int[] vals = new int[]{1,2,3};
        int count = 0;
        for (Vertex node : output){
            assertTrue(node instanceof Vertex);
            assertEquals(vals[count], node.value);
            count++;
        }
    }

    @Test
    public void getNeighbors() {
        Graph test = new Graph();
        test.addVertex(5);
        test.addVertex(4);
        test.addVertex(6);
        test.addVertex(1);
        test.addVertex(9);
        test.addEdge(test.getVertices().get(0), test.getVertices().get(1));
        test.addEdge(test.getVertices().get(0), test.getVertices().get(2));
        ArrayList<Edge> neighbors = test.getVertices().get(0).getEdges();
        int[] vals = new int[]{4, 6};
        int count = 0;
        for (Edge edge : neighbors){
            assertEquals(vals[count], edge.destination.value);
            count++;
        }
    }

    @Test
    public void size() {
        Graph test = new Graph();
        test.addVertex(5);
        assertEquals(1, test.size());
    }

    @Test
    public void breadthFirstTraversal() {
        Graph test = new Graph();
        test.addVertex(5);
        test.addVertex(4);
        test.addVertex(6);
        test.addVertex(1);
        test.addVertex(9);
        test.addEdge(test.getVertices().get(1), test.getVertices().get(0));
        test.addEdge(test.getVertices().get(1), test.getVertices().get(2));
        test.addEdge(test.getVertices().get(2), test.getVertices().get(3));
        test.addEdge(test.getVertices().get(2), test.getVertices().get(4));
        ArrayList<Vertex> output = test.breadthFirstTraversal(test.getVertices().get(1));
        assertEquals(4, output.get(0).value);
        assertEquals(5, output.get(1).value);
        assertEquals(6, output.get(2).value);
        assertEquals(1, output.get(3).value);
        assertEquals(9, output.get(4).value);
    }
}
