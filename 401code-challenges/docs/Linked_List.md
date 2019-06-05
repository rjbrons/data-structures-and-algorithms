# [Singly Linked List](../src/main/java/code/challenges/linkedlist/LinkedList.java)
This class creates a singly linked list of nodes which can take integers as their value.

## Challenge
Create a class for the linked list with the following functionality: 

- insert  
    - adds a node with the given value to the front of the list
- includes  
    - checks the list for a given value, returns true if it is found, false if not.
- print  
    - builds an arraylist of the nodes in the list and returns it.
- append  
    - adds a node to end of LL
- insertBefore  
    - inserts a node with a given value before a node with a target value.
- insertAfter  
    - inserts a node with a given value after a node with a target value.  
- kthFromEnd
    - return the value of the node k places from the end of the list.


## Approach & Efficiency
Insert is an O(1) operation since it always adds to the front of the list and just changes pointers, it doesn't matter how big the list is.  
Includes, the insertion (append, before, and after) methods,  and print are both O(n) operations since they have to navigate through the list one time in order to gather the necessary data to return accurately.  
Kth-from-end is an O(n) operation since it only traverses the list once.

## API
.insert(int value) 
method on the linked list object.  Takes an integer as an argument.  Creates a new node with the given value and inserts it at the head of the list.

.includes(int value)  
Method on the linked list object.  Takes an integer as an argument, returns true if the value is in the linked list and false if not.

.print()  
Method on the linked list object. Iterates through the linked list and generates an ArrayList of the node values and returns it.

.append(int value)
LL method.  Creates a new node with value and inserts it at the end of the LL.

.insertBefore(int target, int value)
Searches list for target value, creates new node with new value and inserts it in front of the target node.  Throws IllegalArgumentException if target value is not in list.

.insertAfter(int target, int value)
Searches list for target value, creates new node with new value and inserts it after the target node.  Throws IllegalArgumentException if target value is not in list.

.kthFromEnd(int target)
Traverses the list and returns the value of the node that is k places from the end node.

![Whiteboard](../assets/whiteboard_ll_insert.jpg)
![Whiteboard](../assets/whiteboard_kth_value.jpg)