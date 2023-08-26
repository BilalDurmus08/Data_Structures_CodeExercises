package U9_2_QuickSort.Pivot;

import java.util.Arrays;


public class Main {

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }


    // WRITE PIVOT METHOD HERE //
    public static int pivot(int[] array,int pivotIndex ,int endIndex){
        int swapIndex = pivotIndex;
        int currentIndex = pivotIndex + 1;
        while (currentIndex <= endIndex){
            if (array[pivotIndex] < array[currentIndex]){
                currentIndex = currentIndex +1;
            }else {
                swapIndex++;
                int temp = array[currentIndex];
                array[currentIndex] = array[swapIndex];
                array[swapIndex] = temp;
                currentIndex = currentIndex +1;
            }
        }
            int temp = array[pivotIndex];
            array[pivotIndex] = array[swapIndex];
            array[swapIndex] = temp;
        return swapIndex;
    }


    public static void main(String[] args) {

        int[] myArray = {4,6,1,7,3,2,5};

        int returnedIndex = pivot(myArray, 0, 6);

        System.out.println( "Returned Index: " + returnedIndex);

        System.out.println( Arrays.toString( myArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            Returned Index: 3
            [2, 1, 3, 4, 6, 7, 5]

         */

    }

}
