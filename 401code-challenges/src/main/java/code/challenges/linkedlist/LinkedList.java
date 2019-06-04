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

        Node cur = this.head;
        try {
            while (cur != null){
                if (cur.value == value){
                    return true;
                } else {
                    cur = cur.next;
                }
            }
            return false;
        } catch (Exception e){
            System.out.println("Operation failed.");
            return false;
        }

    }

    public void append(int val){
        Node cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = new Node(val, null);
    }

    private void genericInsert(int val, int newVal, char c){
        Node cur = this.head;
        while(cur != null){
//            try {
//
//            } catch (Exception e) {
//
//            }
            if (cur.next.value == val){
                if (c == 'a'){
                    Node node = new Node(newVal, cur.next.next);
                    cur.next.next = node;
                    break;
                }else if (c == 'b'){
                    Node node = new Node(newVal, cur.next);
                    cur.next = node;
                    break;
                }
            } else {
                cur = cur.next;
            }
        }
    }

    public void insertBefore(int val, int newVal){
        this.genericInsert(val, newVal, 'b');
    }

    public void insertAfter(int val, int newVal){
        this.genericInsert(val, newVal, 'a');
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
