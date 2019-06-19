# Trees
- [Tree](../src/main/java/code/challenges/tree/Tree.java)
- [TreeNode](../src/main/java/code/challenges/tree/TreeNode.java)
- [BinaryTree](../src/main/java/code/challenges/tree/BinaryTree.java)
- [BinarySearchTree](../src/main/java/code/challenges/tree/BinarySearchTree.java)

## Challenge
Create classes for Tree, Binary Tree and Binary Search Tree
Binary trees should have traversal methods: 
- inOrder - traverse the list and return a collection based on the l.child, root, r.child traversal pattern
- preOrder - traverse the list and return a collection based on the root, l.child, r.child traversal pattern.
- postOrder - traverse the list and return a collection based on the l.child, r.child, root traversal pattern.
- breadthFirst - traverse the list "breadth first" so.. row by row, printing out the value of each node.




## Approach & Efficiency
this should be a O(lg n) efficiency to search and add to tree.
traversal efficiency is O(n) since every node is visited.


## API

### Tree

### Binary Tree - subclass of the Tree class

.inOrder() - traverses the list in the inOrder pattern and returns an array list with the values.

.preOrder() - traverses the list in the preOrder pattern and returns an array list with the values.

.postOrder() - traverses the list in the postOrder pattern and returns an array list with the values.

.breadthFirst() - traverse the tree by breadth first (smallest breadth to widest breadth, or row by row) prints out the values of each node as it is visited.


### Binary Search Tree - subclass of the Binary Tree class

.addNode(T value) - takes a generic type called value and inserts it into the tree by checking if the value is greater or less than the root and going left for less and right for greater. Returns out if the value is a duplicate.

.contains(T value) - takes a generic type called value and returns a boolean answer based on whether it finds the value in the tree or not.

