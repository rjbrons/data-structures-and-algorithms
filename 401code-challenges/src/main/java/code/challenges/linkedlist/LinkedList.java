package code.challenges.linkedlist;

import java.util.ArrayList;

public class LinkedList {
    Node head;

    public LinkedList(){
        Node head = null;

    }

    public void insert(int value){
        this.head = new Node(value, this.head);

    }

    public boolean includes(int value){
        if (this.head == null){
            return false;
        }
        Node cur = this.head;
        while (cur != null){
            if (cur.value == value){
                return true;
            } else {
                cur = cur.next;
            }
        }
        return false;
    }

    public ArrayList print(){
        ArrayList<Integer> output = new ArrayList();
        if (this.head == null){
            return output;
        }
        Node cur = this.head;
        while (cur != null){
            output.add(cur.value);
            cur = cur.next;
        }
        return output;
    }

}
