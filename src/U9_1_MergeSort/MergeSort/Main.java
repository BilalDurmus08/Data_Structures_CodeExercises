package U9_1_MergeSort.MergeSort;

import java.util.Arrays;


public class Main {

    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }


    // WRITE MERGESORT METHOD HERE //
    public static int[] mergeSort(int[] Array) {
        if (Array.length == 1) {

            return Array;
        }
        int halfLength = Array.length / 2;
        int[] firstArray = new int[halfLength];
        int[] secondArray = new int[halfLength];
        int[] temp1 = new int[halfLength];
        int[] temp2 = new int[halfLength];
        for (int i = 0; i < halfLength; i++) {
            temp1[i] = Array[i];
        }
        int j = 0;
        for (int i = halfLength; i < Array.length; i++) {

            temp2[j] = Array[i];
            j++;
        }
        firstArray = mergeSort(temp1);
        secondArray = mergeSort(temp2);

        return merge(firstArray, secondArray);

    }


    public static void main(String[] args) {

        int[] originalArray = {3, 1, 4, 2};

        int[] sortedArray = mergeSort(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));

        System.out.println("\nSorted Array: " + Arrays.toString(sortedArray));

        /*
            EXPECTED OUTPUT:
            ----------------
            Original Array: [3, 1, 4, 2]

            Sorted Array: [1, 2, 3, 4]

         */

    }

}




