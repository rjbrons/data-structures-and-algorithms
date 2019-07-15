package code.challenges.Graph;

public class Edge {
    int weight;
    Vertex source;
    Vertex destination;

    public Edge(){};

    public Edge(int wt){
        this.weight = wt;
    }

    public Edge(int wt, Vertex src, Vertex dest){
        this.weight = wt;
        this.source = src;
        this.destination = dest;
    }

// Getters and Setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

}
