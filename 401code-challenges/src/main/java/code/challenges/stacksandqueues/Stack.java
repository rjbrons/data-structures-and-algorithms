package code.challenges.stacksandqueues;

import code.challenges.linkedlist.Node;

public class Stack {
    Node top;

    //Constructor for stack
    public Stack(){
        this.top = null;
    }

    //Add a node to the top of the stack with input value.
    public void push(int val){

    }

    //Pop off the top node and return its value.
    public int pop() throws NullPointerException {
        if (this.top == null){
            throw new NullPointerException("The stack is empty.");
        }
        int temp = this.peek();
        this.top = this.top.getNext();
        return temp ;
    }

    //Return the value of the top node.
    public int peek() throws NullPointerException {
        if (this.top == null){
            throw new NullPointerException("The stack is empty.");
        }
        return this.top.getValue();
    }
}
