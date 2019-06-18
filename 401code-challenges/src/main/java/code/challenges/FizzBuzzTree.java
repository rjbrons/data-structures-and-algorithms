package code.challenges;

import code.challenges.tree.BinaryTree;
import code.challenges.tree.TreeNode;

public class FizzBuzzTree{

    public BinaryTree fizzBuzzTree(BinaryTree<Object> input){
        if (input.getRoot() == null){
            return input;
        }else{
            this.recurseTree(input.getRoot());
        }return input;
    }

    private void recurseTree(TreeNode<Object> node){
        if (node != null){

            swapNodeValues(node);
            recurseTree(node.getLeft());
            recurseTree(node.getRight());
        }
    }

    private void swapNodeValues(TreeNode<Object> node){
        if ((int)(node.getValue()) % 15 == 0){
            node.setValue("FizzBuzz");
        }else if( (int)(node.getValue()) % 5 == 0){
            node.setValue("Buzz");
        }else if((int)(node.getValue()) % 3 == 0){
            node.setValue("Fizz");
        }
    }
}
