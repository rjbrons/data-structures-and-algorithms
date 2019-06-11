# [Stacks](../src/main/java/code/challenges/stacksandqueues/Stack.java) and [Queues](../src/main/java/code/challenges/stacksandqueues/Queue.java)
Creates a stack structure that is a FILO, that adds and removes from the top.
Creates a queue structure that is a FIFO, adds to the rear and removes from the front.

## Challenge
Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.  
Create a Queue class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.
Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.

## Approach & Efficiency
### Stack - 

- push method adds to the top, O(1) operation.
- pop method removes the top node from the stack and returns its value. O(1) operation.
- peek method returns the value of the top node without mutating the list. O(1) operation.  

All these methods are O(1) since all operations are done from the top of the stack and iteration through the stack is not necessary.

### Queue - 

- enqueue adds to the back of the queue.  O(1) operation since I track the back node.
- dequeue removes node from front of the queue and returns its value.  O(1) operation since the front is tracked as well.
- peek returns the value of the front node. O(1) operation since the front is tracked.


## API

### Stack - 

.push(int val)
Method on the Stack class.  Takes in an integer as an argument.  Creates a node with that value an adds it to the top of the stack.

.pop()
Method on the Stack class.  Removes the top node from the stack and returns its value.  Throws EmptyStackException if the stack is empty.

.peek()
Method on the Stack class.  Returns the value of the top node in the stack.  Throws EmptyStackException if the stack is empty.


### Queue - 

.enqueue(int value) 
Method on the Queue class, takes an integer value as an argument, creates a node with that value and inserts it at the back of the queue.

.dequeue()
Method on the Queue class, removes the front node from the queue and returns its value.  Throws NullPointerException error if queue is empty.

.peek()
Method on the Queue class.  Returns the value of the front node in the queue.  Throws NullPointerException if the queue is empty.

