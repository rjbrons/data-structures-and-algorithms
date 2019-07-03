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

    public static int[] quickSort(int lh, int rh, int[] arr){
        if (arr == null || arr.length == 0) return arr;
        int partitionIndex;
        if (lh < rh){
            partitionIndex = partition(lh, rh, arr);
            quickSort(lh, partitionIndex, arr);
            quickSort(partitionIndex + 1, rh, arr);
        }
        return arr;
    }

    private static int partition(int lh, int rh, int[] arr){
        int pivotIndex = lh;
        while (lh < rh){
            while(arr[lh] <= arr[pivotIndex]){
                lh++;
            }
            while(arr[rh] > arr[pivotIndex]){
                rh--;
            }
            if (lh < rh )
                swap(lh, rh, arr);
        }
        swap(pivotIndex, rh, arr);
        return rh;
    }

    private static void swap(int lh, int rh, int[] arr){
        int temp = arr[lh];
        arr[lh] = arr[rh];
        arr[rh] = temp;
    }
}

