package code.challenges.tree;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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


    @Test
    public void testBFT(){
        BinaryTree<Integer> testTree = new BinaryTree<>();
        testTree.setRoot(new TreeNode<Integer>(1));
        testTree.getRoot().setLeft(new TreeNode<Integer>(2));
        testTree.getRoot().getLeft().setLeft(new TreeNode<Integer>(4));
        testTree.getRoot().getLeft().getLeft().setLeft(new TreeNode<Integer>(8));
        testTree.getRoot().getLeft().getLeft().setRight(new TreeNode<Integer>(9));
        testTree.getRoot().getLeft().setRight(new TreeNode(5));
        testTree.getRoot().getLeft().getRight().setLeft(new TreeNode<Integer>(10));
        testTree.getRoot().getLeft().getRight().setRight(new TreeNode<Integer>(11));
        testTree.getRoot().setRight(new TreeNode<Integer>(3));
        testTree.getRoot().getRight().setLeft(new TreeNode(6));
        testTree.getRoot().getRight().getLeft().setRight(new TreeNode<Integer>(12));
        testTree.getRoot().getRight().setRight(new TreeNode<Integer>(7));
        testTree.getRoot().getRight().getRight().setLeft(new TreeNode<Integer>(13));
        testTree.getRoot().getRight().getRight().setRight(new TreeNode<Integer>(14));

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        //credit for how to test output stream
        //https://coderanch.com/t/587280/java/assertEquals-println
        System.setOut(new PrintStream(outContent));
        testTree.breadthFirst(testTree);
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n",outContent.toString() );
    }
}