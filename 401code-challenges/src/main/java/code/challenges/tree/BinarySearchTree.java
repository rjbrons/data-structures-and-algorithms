package code.challenges.tree;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree {

    public BinarySearchTree(){
        super();
    }

    public void addNode(T value){
        TreeNode<T> node = new TreeNode<>(value);
        TreeNode<T> curr = this.root;
        if (this.root == null){
            this.setRoot(node);
            return;
        }
        while (true){
            if (curr.getValue().compareTo(node.getValue()) == 0) return;
            if (node.getValue().compareTo(curr.getValue()) == -1){
                if (curr.getLeft() == null){
                    curr.setLeft(node);
                    return;
                } else curr = curr.getLeft();
            }else {
                if (curr.getRight() == null){
                    curr.setRight(node);
                    return;
                }else curr = curr.getRight();
            }
        }

    }


    public Boolean contains(T value){
        if (this.getRoot() == null) return false;
        TreeNode<T> curr = this.getRoot();
        while (true){
            if (curr.getValue().compareTo(value) == 0){
                return true;
            }else {
                if (curr.getValue().compareTo(value) == -1){
                    if (curr.getLeft() == null) return false;
                    else curr = curr.getLeft();
                }else {
                    if (curr.getRight() == null) return false;
                    else curr = curr.getRight();
                }
            }
        }
    }
}
