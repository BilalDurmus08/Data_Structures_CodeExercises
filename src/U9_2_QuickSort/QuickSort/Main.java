package U9_2_QuickSort.QuickSort;

import java.util.Arrays;


public class Main {

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);

        return swapIndex;
    }


    // WRITE QUICKSORT HELPER METHOD HERE //
    public static void quickSortHelper(int[] array, int first, int last){

        int index = pivot(array, first, last);
        if (first == last || first + 1 == last || first + 2 == last){
            return;
        }
        quickSortHelper(array, first, index - 1);
        quickSortHelper(array, index + 1, last);
        return;


    }






    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length-1);
    }


    public static void main(String[] args) {

        int[] myArray = {4,6,1,7,3,2,5};

        quickSort(myArray);

        System.out.println( Arrays.toString( myArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7]

         */

    }

}
