package code.challenges.tree;

import code.challenges.stacksandqueues.Queue;

import java.util.ArrayList;

public class BinaryTree<T> extends Tree{

    public BinaryTree(){
        super();
    }


    public ArrayList<T> preOrder(TreeNode<T> root){
        ArrayList<T> nodes = new ArrayList<>();
        if (root == null){
            return nodes;
        }
        this.preOrder(root, nodes);
        return nodes;
    }
    private void preOrder(TreeNode<T> root, ArrayList<T> list){
        list.add(root.getValue());
        if (root.getLeft() != null){
            this.preOrder(root.getLeft(), list);
        }
        if (root.getRight() != null){
            this.preOrder(root.getRight(), list);
        }
        return;
    }


    public ArrayList<T> inOrder(TreeNode<T> root){
        ArrayList<T> nodes = new ArrayList<>();
        if (root == null){
            return nodes;
        }
        this.inOrder(root, nodes);
        return nodes;
    }
    private void inOrder(TreeNode<T> root, ArrayList<T> list) {
        if (root.getLeft() != null) {
            this.inOrder(root.getLeft(), list);
        }
        list.add(root.getValue());
        if (root.getRight() != null) {
            this.inOrder(root.getRight(), list);
        }
        return;
    }


    public ArrayList<T> postOrder(TreeNode<T> root){
        ArrayList<T> nodes = new ArrayList<>();
        if (root == null){
            return nodes;
        }
        this.postOrder(root, nodes);
        return nodes;
    }
    private void postOrder(TreeNode<T> root, ArrayList<T> list){
        if (root.getLeft() != null) {
            this.postOrder(root.getLeft(), list);
        }
        if (root.getRight() != null) {
            this.postOrder(root.getRight(), list);
        }
        list.add(root.getValue());
        return;
    }


    public void breadthFirst(BinaryTree<T> tree){
        Queue<TreeNode> tempQueue = new Queue<>();
        TreeNode<T> curr = tree.getRoot();
        tempQueue.enqueue(curr);

        while (!tempQueue.isEmpty()){
            curr = tempQueue.dequeue();
            System.out.println(curr.getValue());
            if (curr.getLeft() != null)
                tempQueue.enqueue(curr.getLeft());
            if (curr.getRight() != null)
                tempQueue.enqueue(curr.getRight());
        }

    }

    public Integer maxValue(BinaryTree<Integer> tree){
        if (tree.getRoot() == null ){
            return Integer.MIN_VALUE;
        }
        Integer max = Integer.MIN_VALUE;
        Queue<TreeNode> tempQ = new Queue<>();
        TreeNode<Integer> curr = tree.getRoot();
        tempQ.enqueue(curr);
        while   (!tempQ.isEmpty()){
            curr = tempQ.dequeue();
            max = Math.max(curr.getValue(), max);
            if (curr.getLeft() != null)
                tempQ.enqueue(curr.getLeft());
            if (curr.getRight() != null)
                tempQ.enqueue(curr.getRight());
        }
        return max;
    }
}
