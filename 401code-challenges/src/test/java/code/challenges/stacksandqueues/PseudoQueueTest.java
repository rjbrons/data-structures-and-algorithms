package code.challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void test_enqueue() {
        PseudoQueue testQ = new PseudoQueue();
        testQ.enqueue(5);
        assertEquals("Front of queuue should be 5", 5, testQ.peek());
    }

    @Test
    public void test_enqueue_multiple() {
        PseudoQueue testQ = new PseudoQueue();
        testQ.enqueue(20);
        testQ.enqueue(15);
        assertEquals("Top of stack should be 15", 15, testQ.top.getValue());
        testQ.enqueue(10);
        assertEquals("Top of stack should be 10", 10, testQ.top.getValue());
    }

    @Test
    public void test_dequeue() {
        PseudoQueue testQ = new PseudoQueue();
        testQ.enqueue(20);
        testQ.enqueue(15);
        testQ.enqueue(10);
        testQ.enqueue(5);
        assertEquals("Dequeued value should be 20", 20, testQ.dequeue());
        assertEquals("Dequeued value should be 15", 15, testQ.dequeue());
        assertEquals("Dequeued value should be 10", 10, testQ.dequeue());
    }
}