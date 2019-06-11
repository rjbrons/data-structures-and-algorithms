package code.challenges.stacksandqueues;

import code.challenges.linkedlist.Node;

public class PseudoQueue extends Stack {

    public PseudoQueue(){
        super();
    }

    //method to enqueue to the back of the Pseudoqueue
    public void enqueue(int val){
        this.push(val);
    }

    //method to dequue from front of Pseudoqueue
    public int dequeue(){
        Stack temp = new Stack();
        int val;
        while ( this.top != null){
            temp.push(this.pop());
        }
        val = temp.pop();
        while (temp.top != null){
            this.push(temp.pop());
        }
        return val;
    }

    @Override
    public String toString(){
        return null;
    }
}
