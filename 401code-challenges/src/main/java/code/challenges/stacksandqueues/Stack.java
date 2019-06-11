package code.challenges.stacksandqueues;

import code.challenges.linkedlist.Node;

import java.util.EmptyStackException;

public class Stack {
    Node top;

    //Constructor for stack
    public Stack(){
        this.top = null;
    }

    //Add a node to the top of the stack with input value.
    public void push(int val){
        this.top = new Node(val, this.top);
    }

    //Pop off the top node and return its value.
    public int pop() throws EmptyStackException {
        if (this.top == null){
            throw new EmptyStackException();
        }
        int temp = this.peek();
        this.top = this.top.getNext();
        return temp ;
    }

    //Return the value of the top node.
    public int peek() throws EmptyStackException {
        if (this.top == null){
            throw new EmptyStackException();
        }
        return this.top.getValue();
    }
}
