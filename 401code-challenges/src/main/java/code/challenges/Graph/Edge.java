package code.challenges.Graph;

public class Edge {
    int weight;
    Vertex destination;

    public Edge(){};

    protected Edge(Vertex dest){
        this.destination = dest;
        this.weight = 1;
    }

    protected Edge(int wt,  Vertex dest){
        this.weight = wt;
        this.destination = dest;
    }

// Getters and Setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

}
