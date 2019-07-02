package code.challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void testInsertionSort() {
        int[] test = new int[]{10,5,20,8,2};
        int[] sorted = new int[]{2,5,8,10,20};
        assertArrayEquals(Sort.insertionSort(test), sorted);
    }

    @Test
    public void testInsertionWithNull(){
        int[] test = null;
        assertArrayEquals(Sort.insertionSort(test), test);
    }

    @Test
    public void testInsertionWithSorted(){
        int[] test = new int[]{1,2,3,4,5,6,7};
        assertArrayEquals(Sort.insertionSort(test), test);
    }

    @Test
    public void testInsertionLarge(){
        int[] test = new int[]{10,5,20,8,2,44,121,66,1,100};
        int[] sorted = new int[]{1,2,5,8,10,20,44,66,100,121};
        assertArrayEquals(Sort.insertionSort(test), sorted);
    }

    @Test
    public void testInsertionReverseOrder(){
        int[] test = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] sorted = new int[]{1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(Sort.insertionSort(test), sorted);
    }

    @Test
    public void testMergeSort(){
        int[] test = new int[]{10,5,20,8,2};
        int[] sorted = new int[]{2,5,8,10,20};
        assertArrayEquals(Sort.mergeSort(test), sorted);
    }

    @Test
    public void testMergeEmpty(){
        int[] test = null;
        assertArrayEquals(Sort.mergeSort(test), test);
    }

    @Test
    public void testMergeWithSorted(){
        int[] test = new int[]{1,2,3,4,5,6,7};
        assertArrayEquals(Sort.insertionSort(test), test);
    }

    @Test
    public void testMergeLarge(){
        int[] test = new int[]{10,5,20,8,2,44,121,66,1,100};
        int[] sorted = new int[]{1,2,5,8,10,20,44,66,100,121};
        assertArrayEquals(Sort.insertionSort(test), sorted);
    }

    @Test
    public void testMergeReverseOrder(){
        int[] test = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] sorted = new int[]{1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(Sort.insertionSort(test), sorted);
    }
}
