package code.challenges.linkedlist;

//public class Node {
//    int value;
//    Node next;
//
//    public Node(int val, Node next){
//        this.value = val;
//        this.next = next;
//    }
//
//    //getter for node value
//    public int getValue(){
//        return this.value;
//    }
//
//    //setter for the node next
//    public void setNext(Node next){
//        this.next = next;
//    }
//
//    //getter for node next
//    public Node getNext(){
//        return this.next;
//    }
//
//}


public class Node<V> {
    V value;
    Node<V> next;

    public Node(V data, Node<V> nextNode){
        this.value = data;
        this.next = nextNode;
    }

    //getter for node value
    public V getValue(){
        return this.value;
    }

    //setter for the node next
    public void setNext(Node<V> next){
        this.next = next;
    }

    //getter for node next
    public Node getNext(){
        return this.next;
    }

}