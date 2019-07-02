# Lecture Notes: Insertion Sort

## Objectives:   
- Merge Sort
- Big O
- Other considerations.
- Algorithm
- Pseudocode


This sorting algorithm works by breaking the array down into smaller and smaller units to a base unit of 1.  
It then reassembles those broken down units in sorted order.  

This is a more efficient method of sorting than others, as it can achiceve O(n log n) time complexity as it initially divides the array by halves, and then uses linear time to reassemble them.

## Algorithm  
1. break the array down in halves to a base unit of 1.
2. reassemble by checking if the "left" side is less than the "right" side, and putting the smaller number into the return array.
3. once either left or right side is exhausted, work through the remaining "side" to add the rest of the values to the reutrn array.
4. return the sorted array.


## Pseudocode
```
 mergeSort(arr)
    DECLARE n <-- arr.length
           
    if arr.length < 2 
        return array
        
    DECLARE mid <-- n/2
    DECLARE new array for lh side l <-- arr[0...mid] //from beginning to middle index
    DECLARE new array for rh side r <-- arr[mid...n] //from middle index to end
    // break down the left side recursively
    Mergesort(l)
    // break down the right side recursively
    Mergesort(r)
    // merge the left and the right side together into the input array
    Merge(l, r, arr)

 mergeArrays(l, r, arr)
    // set up indices for the lh, rh, and main array - starting at 0
    DECLARE lh <-- 0
    DECLARE rh <-- 0
    DECLARE main <-- 0

    while lh < l array length && rh < r array length
        if l[lh] <= r[rh] //if the lh item is smaller than the rh item
            arr[main] <-- l[lh] //add the lh item to the main array
            lh <-- lh + 1 //increment the lh index
        else
            arr[main] = r[rh]  //add the rh item to the main array
            rh <-- rh + 1 //increment the rh index
            
        main <-- main + 1 once somthing has been added to the main array, increment the main index

    if lh = l.length  //if there no more items in the left array
       add remaining items in array r to array arr
    else
       add remaining items in array l to array arr
       
    return arr // return the main array which is now the sorted merge of l and r arrays.

```
## Readings and References


### Video  
[Merge Sort in 3 Minutes](https://www.youtube.com/watch?v=4VqmGXwpLqc)

### Read  
[Geeks for Geeks](https://www.geeksforgeeks.org/merge-sort/)  
[TutorialsPoint](https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm)  

### Bookmark

[WikiPedia](https://en.wikipedia.org/wiki/Merge_sort)
