# Hashtables

Hashtables are a data structure that utilize key value pairs. This means every Node or Bucket has both a key, and a value.


## Challenge

Implement a Hashtable with the following methods:

- add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
- get: takes in the key and returns the value from the table.
- contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
- hash: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency

Using an array of 1024 default indices, but allowing the user to create a table with a different base size by adding a param.
  Nodes with kvp are added to the array according to the hashed value of they key.  
  I used a basic hash by multiplying the result of the .hashValue() java function by 599 and taking the modulo of that and the length of the array.  

Hash tables generally perform on a O(1) efficiency since you are adding and finding directly by index.  It differs from that when there are collisions, and then it is "kinda" O(n) where n is the number of items that mapped to the same index (collided)
 


## API

- .add(key, value) -- takes the key/value pair and adds it to the hashtable
- .get(key) -- takes the key and returns its value.
- .contains(key) -- takes the key and returns a boolean on whether it is in the hashtable or not.

## Solution
[Code](../src/main/java/code/challenges/HashTable.java)   