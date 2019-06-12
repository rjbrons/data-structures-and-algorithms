package code.challenges.stacksandqueues;

import code.challenges.linkedlist.Node;

public class Queue<V> {

    Node<V> front;
    Node<V> back;

    public Queue(){
        Node back = null;
        Node front = null;
    }

    //add a node to the back of the queue
    public void enqueue(V value){
        if (this.front == null){
            this.front = new Node(value, back);
            back = front;
        } else {
            Node<V> temp = new Node(value, null);
            this.back.setNext(temp);
            back = temp;
        }
    }

    //remove node at the head of the queue
    public V dequeue() throws NullPointerException {
        if (this.front == null){
            throw new NullPointerException("Queue is empty");
        }
        V temp = this.front.getValue();
        this.front = this.front.getNext();
        return temp;
    }

    //check the value of the node at the head of the queue
    public V peek() throws NullPointerException {
        if (this.front == null){
            throw new NullPointerException("Queue is empty");
        }
        return this.front.getValue();
    }

}
