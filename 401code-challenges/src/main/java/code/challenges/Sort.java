package code.challenges;

import java.util.Arrays;

public class Sort {

    public static int[] insertionSort(int[] arr){
        if (arr == null || arr.length == 0){
            return arr;
        }
        for (int i = 0; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];
            while (j>=0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr){
        if (arr == null || arr.length < 1) return arr;
        mergeSplit(arr);
        return arr;
    }

    private static void mergeSplit(int[] arr){
        int n = arr.length;
        if (arr.length < 2)return;
        int mid = n /2;
        int[] arrB = Arrays.copyOfRange(arr, 0, mid);
        int[] arrC = Arrays.copyOfRange(arr, mid, n);
        mergeSplit(arrB);
        mergeSplit(arrC);
        mergeAssemble(arrB, arrC, arr);
    }

    private static int[] mergeAssemble(int[] arrB, int[] arrC, int[] arr ){
        int l = 0;
        int r = 0;
        int m = 0;
        while (l < arrB.length && r < arrC.length){
            if (arrB[l] <= arrC[r]){
                arr[m] = arrB[l];
                l++;
            } else {
                arr[m] = arrC[r];
                r++;
            }
            m++;
        }
        if (l == arrB.length){
            while (r < arrC.length){
                arr[m] = arrC[r];
                m++;
                r++;
            }
        } else {
            while (l < arrB.length){
                arr[m] = arrB[l];
                m++;
                l++;
            }
        }

        return arr;
    }
}

//    ALGORITHM Mergesort(arr)
//    DECLARE n <-- arr.length
//
//        if arr.length > 1
//        DECLARE mid <-- n/2
//        DECLARE b <-- arr[0...mid]
//        DECLARE c <-- arr[mid...n]
//        // break down the left side
//        Mergesort(b)
//        // break down the right side
//        Mergesort(c)
//        // merge the left and the right side together
//        Merge(b, c, arr)
//
//        ALGORITHM Merge(b, c, a)
//        DECLARE i <-- 0
//        DECLARE j <-- 0
//        DECLARE k <-- 0
//
//        while i < b && j < c
//        if b[i] <= c[j]
//                a[k] <-- b[i]
//        i <-- i + 1
//        else
//        a[k] = c[j]
//        j <-- j + 1
//
//        k <-- k + 1
//
//        if i = b.length
//        add remaining items in array c to array a
//        else
//        add remaining items in array b to array a
//
//        return a
