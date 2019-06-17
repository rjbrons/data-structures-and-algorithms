package code.challenges.tree;

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
}
