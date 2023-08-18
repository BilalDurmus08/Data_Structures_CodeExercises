package U4_Interview_Questions.MP_6SubArray_Sum;

import java.util.HashMap;
import java.util.Map;

//HT: Subarray Sum ( ** Interview Question)
//        Given an array of integers nums and a target integer target,
//        write a method called subarraySum that finds the indices
//        of a contiguous subarray in nums that add up to the target sum using a hash table (HashMap).
//        Your function should take two arguments:
//        nums: an array of integers representing the input array
//        target: an integer representing the target sum
//        Your function should return a list of two integers representing the starting
//        and ending indices of the subarray that adds up to the target sum. If there is no such subarray,
//        your function should return an empty list.


public class Main {

    // WRITE SUBARAYSUM METHOD HERE //
    public static int[] subarraySum(int[] nums, int target) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            myHashMap.put(i, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int a = i;
            while (a < nums.length) {

                sum = sum + myHashMap.get(a);
                if (sum == target) {
                    return new int[]{i, a};
                }
                a++;
            }

        }

            return new int[] {};
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = subarraySum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {-1, 2, 3, -4, 5};
        int target2 = 0;
        int[] result2 = subarraySum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {2, 3, 4, 5, 6};
        int target3 = 3;
        int[] result3 = subarraySum(nums3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        int[] nums4 = {};
        int target4 = 0;
        int[] result4 = subarraySum(nums4, target4);
        System.out.println("[]");

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 3]
            [0, 3]
            [1, 1]
            []

        */

    }

}
