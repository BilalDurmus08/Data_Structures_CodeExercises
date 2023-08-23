package U8_BasicSorts.InsertionSort;

import java.util.Arrays;


public class Main {

    // WRITE INSERTIONSORT METHOD HERE //
    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int k = i;
            while (true){
                if (k == 0){
                    break;
                }
                if (array[k] < array[k-1]){
                    int temp = array[k-1];
                    array[k-1] = array[k];
                    array[k] = temp;
                    k--;
                }else {
                    break;
                }
            }
        }
return array;
    }



    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        insertionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}