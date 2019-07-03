# Lecture Notes: Quick Sort

## Objectives:   
- Quick Sort
- Big O
- Other considerations.
- Algorithm
- Pseudocode

The quick sort is another "divide and conquor" method of sorting.  We are splitting each section into values that are higher lower than a given pivot point and then sorting each of those sections in turn.

It is another sort that runs in O(n * log n) time.  It is more space-efficient than merge sort since it does not allocate new arrays on each recursive iteration.

## Algorithm  
Set a pivot point which you then use as a comparison for the lh and rh pointers.  Traverse in from the ends of the array until the lh pointer is pointing to something that is larger than the pivot and the rh pointer is pointed at something smaller than the pivot.
Swap those 2 items, and keep doing that until the pointers cross.  Then swap the pivot with the pivot with the rh item and return the rh item as the "partitioned" index.  
Inside the quicksort method you then call quicksort on the "left side" and "right side" of that partiion pont recursively.


## Pseudocode
```
    ALGORITHM QuickSort(left, right, arr)
    if left < right
// Partition the array by setting the position of the pivot value
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

        ALGORITHM Partition(left, right, arr)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left - 1
        for i <- left to right do
        if arr[i] <= pivot
        low++
        Swap(arr, i, low)

        // place the value of the pivot location in the middle.
        // all numbers smaller than the pivot are on the left, larger on the right.
        Swap(arr, right, low + 1)
        // return the pivot index point
        return low + 1

        ALGORITHM Swap(lh, rh, arr)
        DEFINE temp;
        temp <-- arr[lh]
        arr[lh] <-- arr[rh]
        arr[rh] <-- temp

```
## Readings and References


### Video  
[HackerRank QuickSort](https://www.youtube.com/watch?v=SLauY6PpjW4)

### Read  
[Geeks for Geeks](https://www.geeksforgeeks.org/quick-sort/)  
[HackerEarth](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/)  

### Bookmark

[WikiPedia](https://en.wikipedia.org/wiki/Quicksort)
