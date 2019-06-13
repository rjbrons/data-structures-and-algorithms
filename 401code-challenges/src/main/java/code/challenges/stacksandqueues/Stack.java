package code.challenges.stacksandqueues;

import code.challenges.linkedlist.Node;

import java.util.EmptyStackException;

public class Stack<V> {
    Node<V> top;

    //Constructor for stack
    public Stack(){
        this.top = null;
    }

    //Add a node to the top of the stack with input value.
    public void push(V val){
        this.top = new Node(val, this.top);
    }

    //Pop off the top node and return its value.
    public V pop() throws EmptyStackException {
        if (this.top == null){
            throw new EmptyStackException();
        }
        V temp = this.peek();
        this.top = this.top.getNext();
        return temp ;
    }

    public boolean empty(){
        return this.top == null;
    }

    //Return the value of the top node.
    public V peek() throws EmptyStackException {
        if (this.top == null){
            throw new EmptyStackException();
        }
        return this.top.getValue();
    }
}
