package code.challenges.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void test_addNode() {
        BinarySearchTree<Integer> testTree = new BinarySearchTree<>();
        testTree.addNode(5);
        assertTrue("Root node should have the value", testTree.getRoot().getValue().equals(5));
    }

    @Test
    public void test_addNodeMultiple() {
        BinarySearchTree<Integer> testTree = new BinarySearchTree<>();
        testTree.addNode(5);
        testTree.addNode(10);
        testTree.addNode(3);
        testTree.addNode(1);
        testTree.addNode(20);
        assertTrue("Root node should have the value", testTree.getRoot().getValue().equals(5));
        ArrayList<Integer> output = testTree.inOrder(testTree.getRoot());
        System.out.println(output);
        assertTrue("List of nodes should be 1, 3, 5, 10, 20", "[1, 3, 5, 10, 20]".equals(output.toString()));
    }

    @Test
    public void test_contains() {
        BinarySearchTree<Integer> testTree = new BinarySearchTree<>();
        testTree.addNode(5);
        testTree.addNode(10);
        testTree.addNode(3);
        testTree.addNode(1);
        testTree.addNode(20);
        assertTrue("should be true", testTree.contains(3));
    }

    @Test
    public void test_containsWithoutValue() {
        BinarySearchTree<Integer> testTree = new BinarySearchTree<>();
        testTree.addNode(5);
        testTree.addNode(10);
        testTree.addNode(3);
        testTree.addNode(1);
        testTree.addNode(20);
        assertFalse("should be false", testTree.contains(2));
    }
}