package U4_Interview_Questions.MP_5Two_Sum;

import java.util.*;
//HT: Two Sum ( ** Interview Question)
//        twoSum()
//        Problem: Given an array of integers nums and a target integer target,
//        find the indices of two numbers in the array that add up to the target.
//        Input:
//        An array of integers nums .
//        A target integer target.
//        Output:
//        An array of two integers representing the indices of the two numbers in the input array nums that add up to the target.
//        If no two numbers in the input array add up to the target, return an empty array [].
//        Return type:
//        int[]

public class Main {

    // WRITE THE TWOSUM MEHTOD HERE //
        public static int[] twoSum(int[] nums, int target){
            int[] array = new int[2];
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (target == nums[i] + nums[j]){
                        array[0] = i;
                        array[1] = j;

                    }
                }
            }
            return array;

        }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */

    }

}
