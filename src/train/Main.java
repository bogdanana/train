package train;


import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] initialArray = {5, 1, 4, 75, 43, -1, 0, 0, 54, 1000, 2};
        int[] sortedArray = insertSort(initialArray);
        System.out.println(foundValue(sortedArray, 43));
        System.out.println(Arrays.toString(sortedArray));

/*
        int a = 20;
        a = a << 1;
        a = a >> 3;
        System.out.println(a);
        int[] arr = {2, 5, 1, 6, 7, 1, 1, 4, 10};
        */
    }

    public static int[] insertSort(int[] initialArray) {
        int n = initialArray.length;
        for (int i = 1; i < n; ++i) {
            int key = initialArray[i];
            int j = i - 1;

            while (j >= 0 && initialArray[j] > key) {
                initialArray[j + 1] = initialArray[j];
                j = j - 1;
            }
            initialArray[j + 1] = key;
        }
        return initialArray;
    }

    public static int[] bubbleSort(int[] initialArray) {
        int[] arr = initialArray;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return initialArray;
    }

    public static int foundValue(int[] initialArray, int x) {
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] == x) {
                return i;
            }
        }
        return -1;
    }

  /*  public static int binarySearch(int[] initialArray, int l, int r, int x) {
        // Returns index of x if it is present in arr[l..r], else return -1

        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

}*/
/* This code is contributed by Rajat Mishra */
}

