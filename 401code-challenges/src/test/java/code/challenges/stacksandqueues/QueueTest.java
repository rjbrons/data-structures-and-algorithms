package code.challenges.stacksandqueues;

import code.challenges.linkedlist.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void test_first_enqueue() {
        Queue testQ = new Queue();
        testQ.enqueue(1);
        assertEquals("Enqueue should put a node in with the value", 1, testQ.front.getValue());
        assertTrue("First enqueue should make front and back equal", testQ.front == testQ.back );
    }

    @Test
    public void test_multiple_enqueue(){
        Queue testQ = new Queue();
        testQ.enqueue(1);
        testQ.enqueue(2);
        testQ.enqueue(3);
        assertEquals("Peeking should show the first value put in", 1, testQ.peek());
        assertEquals("Last value put in should be the back", 3, testQ.back.getValue());
    }

    @Test
    public void test_dequeue() {
        Queue testQ = new Queue();
        testQ.enqueue(1);
        testQ.enqueue(2);
        testQ.enqueue(3);
        assertEquals("Deque should return the value of the front node", 1, testQ.dequeue());
        assertEquals("2nd node should now be front", 2, testQ.front.getValue());
        assertEquals("Back value should not be changed", 3, testQ.back.getValue());
    }

    @Test
    public void test_multiple_dequeue() {
        Queue testQ = new Queue();
        testQ.enqueue(1);
        testQ.enqueue(2);
        testQ.enqueue(3);
        testQ.enqueue(4);
        testQ.dequeue();
        testQ.dequeue();
        testQ.dequeue();
        assertEquals("Value left in queue should be 4", 4, testQ.front.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void test_multiple_dequeue_past_end() {
        Queue testQ = new Queue();
        testQ.enqueue(1);
        testQ.enqueue(2);
        testQ.enqueue(3);
        testQ.enqueue(4);
        testQ.dequeue();
        testQ.dequeue();
        testQ.dequeue();
        testQ.dequeue();
        testQ.dequeue();
    }

    @Test
    public void test_peek() {
        Queue testQ = new Queue();
        testQ.front = new Node(1, null);
        assertEquals("Peeking should return the value in the front of the queue", 1, testQ.peek());
        assertTrue("After peeking, front should still be in the queue", testQ.front != null);
    }

    @Test(expected = NullPointerException.class)
    public void test_peek_on_empty() {
        Queue testQ = new Queue();
        testQ.peek();
    }
}