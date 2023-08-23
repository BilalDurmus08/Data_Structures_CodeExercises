package U8_BasicSorts.Selection;

import java.util.Arrays;


public class Main {

    // WRITE SELECTIONSORT METHOD HERE //
    public static int[] selectionSort(int[] array) {
        int k = 0;
        while (true){
            int i = 0;
            i += k;
            int min = array[i];
            int minIndex = i;
            for (; i < array.length; i++) {
                 if (min > array[i]){
                     min = array[i];
                     minIndex = i;
                 }
            }
            int temp;
            temp = array[k];
            array[k] = array[minIndex];
            array[minIndex] = temp;

            k++;
            if (k == array.length){
                return array;
            }
        }

    }


    public static void main(String[] args) {

        int[] myArray = {4, 2, 6, 5, 1, 3};

        selectionSort(myArray);

        System.out.println(Arrays.toString(myArray));

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}