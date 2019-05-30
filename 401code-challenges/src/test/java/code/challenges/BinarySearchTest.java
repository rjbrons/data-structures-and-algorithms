package code.challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearch_pass() {
        BinarySearch classUnderTest = new BinarySearch();
        int[] test = new int[] {4,8,15,16,23,42};
        assertEquals("searching for 15 should return index 2", classUnderTest.binarySearch(test, 15), 2);
    }

    @Test
    public void binarySearch_not_included() {
        BinarySearch classUnderTest = new BinarySearch();
        int[] test = new int[] {11,22,33,44,55,66,77};
        assertEquals("searching for 90 should return index -1", classUnderTest.binarySearch(test, 90), -1);
    }

    @Test
    public void binarySearch_large_array() {
        BinarySearch classUnderTest = new BinarySearch();
        int[] test = arrayGenerator(100);
        assertEquals("searching for 90 should return index 90", classUnderTest.binarySearch(test, 90), 90);
    }

    @Test
    public void binarySearch_larger_array() {
        BinarySearch classUnderTest = new BinarySearch();
        int[] test = arrayGenerator(10000);
        assertEquals("searching for 500 should return index 500", classUnderTest.binarySearch(test, 500), 500);
    }

    public int[] arrayGenerator(int qty){
        int[] arr = new int[qty];
        for (int i = 0; i < qty; i++){
            arr[i] = i;
        }
        return arr;
    }
}