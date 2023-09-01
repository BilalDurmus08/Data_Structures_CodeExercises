package U9_4_Interview_Questions.MP6_Rotate;

import java.sql.SQLOutput;
import java.util.Arrays;

//Array: Rotate ( ** Interview Question)
//        You are tasked with implementing a method, rotate, that rotates an array to the right by k steps, where k is a non-negative integer.
//
//        Note
//
//        Rotation is performed in steps. For each step, the last element of the array is moved to the front,
//        and all other elements are moved one step to the right.
//
//        The number of rotations is equal to k mod n, where n is the length of the array. This is because after n rotations,
//        the array would return to its original state.
//
//        The rotation should be performed in-place, i.e., without making a copy of the original array (except for temporary variables).
//
//        Your solution should run efficiently, ideally with a linear time complexity and constant space complexity.


public class Main {

    // WRITE THE ROTATE METHOD HERE //
    public static void rotate(int[] nums, int k) {
        while (k != 0) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
                if (i == 1) {
                    nums[0] = temp;
                }
            }
            k--;
        }

    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.println("Test case 1: Rotated array: " + Arrays.toString(nums1));  // prints "Rotated array: [5, 6, 7, 1, 2, 3, 4]"

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.println("Test case 2: Rotated array: " + Arrays.toString(nums2));  // prints "Rotated array: [3, 99, -1, -100]"

        int[] nums3 = {1, 2};
        int k3 = 3;
        rotate(nums3, k3);
        System.out.println("Test case 3: Rotated array: " + Arrays.toString(nums3));  // prints "Rotated array: [2, 1]"

        int[] nums4 = {1};
        int k4 = 0;
        rotate(nums4, k4);
        System.out.println("Test case 4: Rotated array: " + Arrays.toString(nums4));  // prints "Rotated array: [1]"

        int[] nums5 = {1, 2, 3, 4, 5, 6};
        int k5 = 6;
        rotate(nums5, k5);
        System.out.println("Test case 5: Rotated array: " + Arrays.toString(nums5));  // prints "Rotated array: [1, 2, 3, 4, 5, 6]"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Rotated array: [5, 6, 7, 1, 2, 3, 4]
            Test case 2: Rotated array: [3, 99, -1, -100]
            Test case 3: Rotated array: [2, 1]
            Test case 4: Rotated array: [1]
            Test case 5: Rotated array: [1, 2, 3, 4, 5, 6]
        */

    }

}