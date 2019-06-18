package code.challenges;

import code.challenges.tree.BinarySearchTree;
import code.challenges.tree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    public static void addNodes(BinarySearchTree<Integer> tree){
        int[] vals = new int[]{5, 3, 10};
        for (int val : vals){
            tree.addNode(val);
        }
    }

    @Test
    public void test_fizzBuzzTree() {
        FizzBuzzTree testTree = new FizzBuzzTree();
        BinarySearchTree<Integer> inputTree = new BinarySearchTree<>();
        addNodes(inputTree);
        BinaryTree output = testTree.fizzBuzzTree(inputTree);
        assertEquals("Output should be Buzz, Buzz, Fizz",
                "[Buzz, Fizz, Buzz]",
                output.preOrder(output.getRoot()).toString());
    }

}