package U9_4_Interview_Questions.MP2_Find_Max_Min;


import java.util.Arrays;

//Array: Find Max Min ( ** Interview Question)
//        In this problem, you are given an array of integers, and the task is to write a method that finds the maximum and minimum numbers in the array.
//
//        The method should return these two numbers as an array with the maximum number at the first index and the minimum number at the second index.
//
//        Additional Notes
//
//        The main method provides some test cases to check the solution's
//        correctness. It is important to note that the method should work correctly with negative numbers and zeros. Also,
//        if the array contains duplicate numbers, the function should still be able to correctly identify the maximum and minimum numbers.


public class Main {

    // WRITE THE FINDMAXMIN METHOD HERE //
    public static int[] findMaxMin(int[] myList) {
        int[] desired = new int[2];
        int max = myList[0];
        int min = myList[0];

        for (int i = 1; i < myList.length; i++) {
            if (max < myList[i]) {
                max = myList[i];
            }
            if (min > myList[i]) {
                min = myList[i];
            }
        }
        desired[0] = max;
        desired[1] = min;
        return desired;
    }


    public static void main(String[] args) {

        int[] myList1 = {5, 3, 8, 1, 6, 9};
        int[] result1 = findMaxMin(myList1);
        System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"

        int[] myList2 = {-5, -3, -8, -1, -6, -9};
        int[] result2 = findMaxMin(myList2);
        System.out.println("Test case 2: MaxMin: " + Arrays.toString(result2)); // prints "[-1, -9]"

        int[] myList3 = {0, 0, 0, 0, 0};
        int[] result3 = findMaxMin(myList3);
        System.out.println("Test case 3: MaxMin: " + Arrays.toString(result3)); // prints "[0, 0]"

        int[] myList4 = {100, 200, 300, 400, 500};
        int[] result4 = findMaxMin(myList4);
        System.out.println("Test case 4: MaxMin: " + Arrays.toString(result4)); // prints "[500, 100]"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: MaxMin: [9, 1]
            Test case 2: MaxMin: [-1, -9]
            Test case 3: MaxMin: [0, 0]
            Test case 4: MaxMin: [500, 100]
        */

    }

}