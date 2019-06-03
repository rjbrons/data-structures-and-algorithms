# [Singly Linked List](../401code-challenges/src/main/java/code/challenges/linkedlist/LinkedList.java)
This class creates a singly linked list of nodes which can take integers as their value.

## Challenge
Create a class for the linked list with the following functionality: 

- insert  
    - adds a node with the given value to the front of the list
- includes  
    - checks the list for a given value, returns true if it is found, false if not.
- print  
    - builds an arraylist of the nodes in the list and returns it.

## Approach & Efficiency
Insert is an O(1) operation since it always adds to the front of the list and just changes pointers, it doesn't matter how big the list is.  
Includes and print are both O(n) operations since they have to navigate through the list one time in order to gather the necessary data to return accurately.  


## API
.insert(int value) 
method on the linked list object.  Takes an integer as an argument.  Creates a new node with the given value and inserts it at the head of the list.

.includes(int value)  
Method on the linked list object.  Takes an integer as an argument, returns true if the value is in the linked list and false if not.

.print()  
Method on the linked list object. Iterates through the linked list and generates an ArrayList of the node values and returns it.

