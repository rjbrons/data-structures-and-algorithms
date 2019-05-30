package code.challenges;

public class BinarySearch {
    //takes in a sorted array and a value, returns the index of the value or -1.
    public int binarySearch(int[] arr, int val){
        int idx;
        int min = 0;
        int max = arr.length -1;
        while (min <= max){
            idx = (min + max) / 2;
            if (arr[idx] == val){
                return idx;
            } else if ( arr[idx] < val) {
                min = idx + 1;
            } else if ( arr[idx] > val){
                max = idx -1;
            }
        }

        return -1;
    }
}
