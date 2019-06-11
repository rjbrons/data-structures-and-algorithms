package code.challenges.stacksandqueues;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void test_push() {
        Stack testStack = new Stack();
        testStack.push(1);
        assertEquals("Top value in stack should be 1",
                1,
                testStack.top.getValue());
    }

    @Test
    public void test_multiple_push() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        assertEquals("Top value in stack should be 3",
                3,
                testStack.top.getValue());
    }

    @Test
    public void test_pop_returns_value_at_top() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        assertEquals("Pop should return the top node value.",
                3,
                testStack.pop());
    }

    @Test
    public void test_pop_moves_top_to_next_node() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.pop();
        assertEquals("Pop should return the top node value.",
                2,
                testStack.top.getValue());
    }

    @Test
    public void test_pop_push_pop_push(){
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.pop();
        testStack.push(4);
        testStack.pop();
        testStack.push(5);
        assertEquals("Top node should have 5", 5, testStack.top.getValue());
    }

    @Test
    public void test_multiple_pop() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.push(4);
        testStack.push(5);
        testStack.pop();
        testStack.pop();
        testStack.pop();
        assertEquals("Top node should be 2",
                2,
                testStack.top.getValue());
    }

    @Test(expected = EmptyStackException.class)
    public void test_pop_empty() {
        Stack testStack = new Stack();
        testStack.pop();
    }

    @Test
    public void test_peek() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.push(4);
        testStack.push(5);
    }

    @Test(expected = EmptyStackException.class)
    public void test_peek_empty() {
        Stack testStack = new Stack();
        testStack.peek();
    }
}