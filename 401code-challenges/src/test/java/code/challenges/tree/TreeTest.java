package code.challenges.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void test_getRoot() {
        Tree<Integer> testTree = new Tree<>();
        testTree.setRoot(new TreeNode<Integer>(22));
        assertTrue(testTree instanceof Tree);
        assertTrue(testTree.getRoot() instanceof TreeNode);
    }

    @Test
    public void test_setRoot() {
        Tree<Integer> testTree = new Tree<>();
        testTree.setRoot(new TreeNode<Integer>(22));
    }

    @Test
    public void testAddLeftChild(){
        Tree<Integer> testTree = new Tree<>();
        testTree.setRoot(new TreeNode<Integer>(5));
        testTree.getRoot().setLeft(new TreeNode<>(2));
        assertTrue( testTree.getRoot().getLeft().getValue() == 2);
    }

    @Test
    public void testAddRightChild(){
        Tree<Integer> testTree = new Tree<>();
        testTree.setRoot(new TreeNode<Integer>(5));
        testTree.getRoot().setRight(new TreeNode<>(8));
        assertTrue( testTree.getRoot().getRight().getValue() == 8);
    }

    @Test
    public void testTraversePreOrder(){
        BinaryTree<Integer> testTree = new BinaryTree<>();
        testTree.setRoot(new TreeNode<Integer>(10));
        testTree.getRoot().setLeft(new TreeNode<Integer>(5));
        testTree.getRoot().setRight(new TreeNode<Integer>(15));
        ArrayList<Integer> output = testTree.preOrder(testTree.getRoot());
        assertTrue("should output 10, 5, 15", "[10, 5, 15]".equals(output.toString()));
        assertTrue("output should be a collection", output instanceof Collection);

    }

    @Test
    public void testTraversePostOrder(){
        BinaryTree<Integer> testTree = new BinaryTree<>();
        testTree.setRoot(new TreeNode<Integer>(10));
        testTree.getRoot().setLeft(new TreeNode<Integer>(5));
        testTree.getRoot().setRight(new TreeNode<Integer>(15));
        ArrayList<Integer> output = testTree.postOrder(testTree.getRoot());
        assertTrue("should output 5, 15, 10", "[5, 15, 10]".equals(output.toString()));
        assertTrue("output should be a collection", output instanceof Collection);

    }

    @Test
    public void testTraverseinOrder(){
        BinaryTree<Integer> testTree = new BinaryTree<>();
        testTree.setRoot(new TreeNode<Integer>(10));
        testTree.getRoot().setLeft(new TreeNode<Integer>(5));
        testTree.getRoot().setRight(new TreeNode<Integer>(15));
        ArrayList<Integer> output = testTree.inOrder(testTree.getRoot());
        assertTrue("should output 5, 10, 15", "[5, 10, 15]".equals(output.toString()));
        assertTrue("output should be a collection", output instanceof Collection);
    }
}