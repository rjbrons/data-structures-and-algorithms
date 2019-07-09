package code.challenges.HashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashNodeTest {

    @Test
    public void testNodeConstruction(){
        HashNode<Integer> testNode = new HashNode<Integer>("age", 12);
        assertEquals((Integer)12, testNode.getValue());
        assertTrue(testNode.getKey().equals("age"));
    }

    @Test
    public void testSetNext() {
        HashNode<Integer> testNode = new HashNode<Integer>("age", 12);
        HashNode<String> newNode = new HashNode<String>("name", "joe");
        testNode.setNext(newNode);
        assertTrue(testNode.getNext() == newNode);
        assertSame(testNode.next, newNode);
    }

    @Test
    public void testSetKey() {
        HashNode<Integer> testNode = new HashNode<Integer>("age", 12);
        testNode.setKey("dob");
        assertTrue(testNode.key.equals("dob"));
    }

    @Test
    public void testSetValue() {
        HashNode<String> newNode = new HashNode<String>("name", "joe");
        newNode.setValue("billy");
        assertTrue(newNode.value.equals("billy"));
    }
}