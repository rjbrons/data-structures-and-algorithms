package code.challenges.linkedlist;

import org.junit.Test;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void test_empty_list() {
        LinkedList testList = new LinkedList();
        assertEquals("empty linked list should have null head", null, testList.head);
    }

    @Test
    public void test_insert_adds_to_head() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        assertEquals("empty linked list should have null head", 5, testList.head.value);
    }

    @Test
    public void test_insert_adds_to_head_after_multiple_adds() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        testList.insert(10);
        assertEquals("empty linked list should have null head", 10, testList.head.value);
    }

    @Test
    public void test_includes_returns_true() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        testList.insert(10);
        assertTrue(testList.includes(10));
        assertTrue(testList.includes(5));
    }

    @Test
    public void test_includes_returns_false() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        testList.insert(10);
        assertFalse(testList.includes(15));
        assertFalse(testList.includes(0));
    }

    @Test
    public void test_empty_ll_includes_returns_false() {
        LinkedList testList = new LinkedList();
        assertFalse(testList.includes(5));
    }

    @Test
    public void test_print() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        testList.insert(10);
        assertEquals("should output array as string", new ArrayList<Integer>(Arrays.asList(10, 5, 5, 5)), testList.print());
    }

    @Test
    public void append() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.append(10);
        assertEquals("next node from head should be inserted node", 10, testList.head.next.value);
    }

    @Test
    public void insertBefore() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(10);
        testList.insertBefore(5, 7);
        assertEquals("should output array as string", new ArrayList<Integer>(Arrays.asList(10, 7, 5)), testList.print());
    }

    @Test
    public void insertAfter() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(10);
        testList.insertAfter(5, 7);
        assertEquals("should output array as string", new ArrayList<Integer>(Arrays.asList(10, 5, 7)), testList.print());

    }
}
