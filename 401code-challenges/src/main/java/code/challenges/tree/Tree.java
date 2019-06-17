package code.challenges.tree;

public class Tree<T> {
    TreeNode<T> root;

    public Tree(){
        this.root = null;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }



}
