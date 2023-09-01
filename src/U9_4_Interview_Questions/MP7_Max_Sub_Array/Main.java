package U9_4_Interview_Questions.MP7_Max_Sub_Array;

import java.util.Arrays;

//Array: Max Sub Array ( ** Interview Question)
//        You have been asked to create a method in Java, maxSubarray,
//        that finds the contiguous subarray (containing at least one number) which has the largest sum and returns its sum.


public class Main {

    // WRITE THE MAXSUBARRAY METHOD HERE //
    public static int maxSubarray(int[] nums) {
        int maxSubArraySum = Integer.MIN_VALUE;

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            int k = 0;
            while (k - 1 < length - i) {
                int total = 0;
                for (int j = i; j < length - k; j++) {
                    total += nums[j];

                    if (total > maxSubArraySum) {
                        maxSubArraySum = total;
                    }
                }
                k++;
            }
        }
        return maxSubArraySum;
    } //When I was writing those codes, Only the god and me knew. Now only the god know that how it works


    //This one is more efficient. And it is easier to understand.
    /*
      public static int maxSubarray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

     */



    public static void main(String[] args) {
        // Example 1: Simple case with positive and negative numbers
        int[] inputCase1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = maxSubarray(inputCase1);
        System.out.println("Example 1: Input: " + Arrays.toString(inputCase1) + "\nResult: " + result1);

        // Example 2: Case with a negative number in the middle
        int[] inputCase2 = {1, 2, 3, -4, 5, 6};
        int result2 = maxSubarray(inputCase2);
        System.out.println("Example 2: Input: " + Arrays.toString(inputCase2) + "\nResult: " + result2);

        // Example 3: Case with all negative numbers
        int[] inputCase3 = {-1, -2, -3, -4, -5};
        int result3 = maxSubarray(inputCase3);
        System.out.println("Example 3: Input: " + Arrays.toString(inputCase3) + "\nResult: " + result3);

        // Example 4: Case with all positive numbers
        int[] inputCase4 = {1, 2, 3, 4, 5};
        int result4 = maxSubarray(inputCase4);
        System.out.println("Example 4: Input: " + Arrays.toString(inputCase4) + "\nResult: " + result4);

        // Example 5: Case with alternating positive and negative numbers
        int[] inputCase5 = {1, -1, 1, -1, 1};
        int result5 = maxSubarray(inputCase5);
        System.out.println("Example 5: Input: " + Arrays.toString(inputCase5) + "\nResult: " + result5);

        /*
            EXPECTED OUTPUT:
            ----------------
            Example 1: Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
            Result: 6
            Example 2: Input: [1, 2, 3, -4, 5, 6]
            Result: 13
            Example 3: Input: [-1, -2, -3, -4, -5]
            Result: -1
            Example 4: Input: [1, 2, 3, 4, 5]
            Result: 15
            Example 5: Input: [1, -1, 1, -1, 1]
            Result: 1
        */

    }

}