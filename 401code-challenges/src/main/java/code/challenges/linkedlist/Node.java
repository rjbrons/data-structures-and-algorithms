package code.challenges.linkedlist;

public class Node {
    int value;
    Node next;

    public Node(int val, Node next){
        this.value = val;
        this.next = next;
    }

    //setter for node value
    public void setValue(int val){
        this.value = val;
    }

    //getter for node value
    public int getValue(){
        return this.value;
    }

    //setter for the node next
    public void setNext(Node next){
        this.next = next;
    }

    //getter for node next
    public Node getNext(){
        return this.next;
    }

}
