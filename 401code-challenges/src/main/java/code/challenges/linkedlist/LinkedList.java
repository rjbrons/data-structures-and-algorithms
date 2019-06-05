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

    private void genericInsert(int val, int newVal, char c) throws IllegalArgumentException {
        Node cur = this.head;
        if (cur == null){
            throw new IllegalArgumentException("Target value not found in List");
        }
        while(cur != null){
            if (cur.next == null) {
                throw new IllegalArgumentException("Target value not found in List");
            }
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

    public void insertBefore(int target, int value){
        this.genericInsert(target, value, 'b');
    }

    public void insertAfter(int target, int value){
        this.genericInsert(target, value, 'a');
    }

    public int kthFromEnd(int k) throws IllegalArgumentException {
        if (this.head == null){
            throw new IllegalArgumentException("There are no nodes in the list.");
        } else if (k < 0){
            throw new IllegalArgumentException("Negative values of k are not allowed.");
        }
        int target = k;
        Node hare = null;
        hare = this.head;
        Node tortoise = null;
        while (hare != null){
            if (target > 0) {
                target--;
                hare = hare.next;
            } else if (target == 0){
                tortoise = this.head;
                hare = hare.next;
                target--;
            } else {
                hare = hare.next;
                tortoise = tortoise.next;
            }
        }
        if (tortoise == null){
            throw new IllegalArgumentException(String.format("There aren't %d values in the list.", k));
        }
        return tortoise.value;
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
