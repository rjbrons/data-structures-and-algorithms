# Graph 
Implement a Graph

## Challenge
Implement your own Graph.  
The graph should be represented as an adjacency list, and should include the following methods:
addNode, addEdge, getNodes, getNeighbors, size.


## Approach & Efficiency

I used an ArrayList to hold the Vertices (nodes), and each vertex holds an array list of Edges (neighbors), each edge is stored in its "source" and contains the values of its weight and its destination.

This makes traversals O(n), and lookups are worst-case O(n) as well since I may have to traverse the whole vertex list to get to my target node.


## API 

- AddNode()
    - Adds a new node to the graph
    - Takes in the value of that node
    - Returns the added node
- AddEdge()
    - Adds a new edge between two nodes in the graph
    - Include the ability to have a “weight”
    - Takes in the two nodes to be connected by the edge
    - Both nodes should already be in the Graph
- GetNodes()
    - Returns all of the nodes in the graph as a collection (set, list, or similar)
- GetNeighbors()
    - Returns a collection of nodes connected to the given node
    - Takes in a given node
    - Include the weight of the connection in the returned collection
- Size()
    - Returns the total number of nodes in the graph

## Solution
[Code](../src/main/java/code/challenges/Graph/Graph.java)  
 