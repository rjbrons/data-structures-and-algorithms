# Lecture Notes: Insertion Sort

## Objectives:   
- Insertion Sort
- Big O
- Other considerations.
- Algorithm
- Pseudocode


This algorithm works by comparing a given index value to the previous value and if it is less, shifting the previous value up until we find the spot where the indexed value goes, then inserting it at that point.
It is not particularly time efficient as far as BigO goes.  It is an n^2 operation.  The process however, is easier on processing power since we are only making a single assignment on each time through instead of swapping out 2 numbers.  This allows it to still have good performance.

## Algorithm
In order to do this we are going to start with an outer loop that starts at the 2nd item (we assume that a 1 item "array" is sorted) and loops through the end of the array.
We set an index for the inner loop to be one less than the outer index, and set a temp var to hold the value of the index of the outer array, which we will be comparing to each value on the inner loop to find out what needs to be shifted.
While the "inner" index is greater than 0 and the temp value (which we got from the outer loop) is less than the inner value we shift the array value forward and then index the inner loop down one.
When the while loop breaks out - either we got to index 0 or the temp value is greater than the next value down - we insert the temp value back into the array at that point, as we have shifted all the other numbers forward to make room for it.



## Pseudocode
```
  InsertionSort(int[] arr)
  
    FOR int i ->>  i < arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE (j >= 0 AND temp < arr[j])
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
```
## Readings and References


### Video  
[Geeks for Geeks](https://www.youtube.com/watch?v=OGzPmgsI-pQ)

### Read  
[Geeks for Geeks](https://www.geeksforgeeks.org/insertion-sort/)  
[InterviewBit](https://www.interviewbit.com/tutorial/insertion-sort-algorithm/)

### Bookmark

[Wikipedia](https://en.wikipedia.org/wiki/Insertion_sort)