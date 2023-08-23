package U8_BasicSorts.BubbleSort;

import java.util.Arrays;


public class Main {

    // WRITE BUBBLESORT METHOD HERE //
    public static int[] bubbleSort(int[] array){
        int [] newArray = array;
        while (true){
            int k = 0;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] > newArray[i+1]){
                    int temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    k++;
                }
            }
            if (k == 0){
                break;
            }
        }
        return newArray;
    }


    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        bubbleSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}