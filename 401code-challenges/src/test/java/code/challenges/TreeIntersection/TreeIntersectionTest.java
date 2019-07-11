package code.challenges.TreeIntersection;

import code.challenges.tree.BinarySearchTree;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void test_findIntersections() {
        BinarySearchTree<Integer> testTree1 = new BinarySearchTree<>();
        testTree1.addNode(5);
        testTree1.addNode(10);
        testTree1.addNode(3);
        testTree1.addNode(1);
        testTree1.addNode(20);

        BinarySearchTree<Integer> testTree2 = new BinarySearchTree<>();
        testTree2.addNode(5);
        testTree2.addNode(15);
        testTree2.addNode(2);
        testTree2.addNode(1);
        testTree2.addNode(20);

        ArrayList<Integer> output = TreeIntersection.findIntersections(testTree1, testTree2);
        assertEquals("[5, 1, 20]",output.toString());
    }

    @Test
    public void test_findIntersections2() {
        BinarySearchTree<Integer> testTree1 = new BinarySearchTree<>();
        testTree1.addNode(5);
        testTree1.addNode(10);
        testTree1.addNode(3);
        testTree1.addNode(1);
        testTree1.addNode(20);

        BinarySearchTree<Integer> testTree2 = new BinarySearchTree<>();
        testTree2.addNode(5);
        testTree2.addNode(10);
        testTree2.addNode(3);
        testTree2.addNode(1);
        testTree2.addNode(20);
        testTree1.addNode(40);
        testTree1.addNode(35);
        testTree1.addNode(21);

        ArrayList<Integer> output = TreeIntersection.findIntersections(testTree1, testTree2);
        assertEquals("[5, 3, 1, 10, 20]",output.toString());
    }

    @Test
    public void test_findIntersectionsNone() {
        BinarySearchTree<Integer> testTree1 = new BinarySearchTree<>();
        testTree1.addNode(5);
        testTree1.addNode(10);
        testTree1.addNode(3);
        testTree1.addNode(1);
        testTree1.addNode(20);

        BinarySearchTree<Integer> testTree2 = new BinarySearchTree<>();
        testTree2.addNode(6);
        testTree2.addNode(13);
        testTree2.addNode(4);
        testTree2.addNode(2);
        testTree2.addNode(22);

        ArrayList<Integer> output = TreeIntersection.findIntersections(testTree1, testTree2);
        assertEquals("[]",output.toString());
    }


}