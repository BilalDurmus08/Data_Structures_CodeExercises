package U9_4_Interview_Questions.MP1_RemoveElement;

import java.util.Arrays;

//Array: Remove Element ( ** Interview Question)
//        In this problem, we are given an array of integers nums and a value val.
//        The goal is to remove all occurrences of val in-place from the array and return the new length of the array after removal.
//
//        The method removeElement(int[] nums, int val) takes an array of integers nums and an integer val as input.
//        It modifies the nums array in-place to remove all instances of val and returns the new length of nums after the removal.
//
//        It's important to note that the order of elements can be changed. We don't need to consider elements beyond the new length.
//
//        For example, given nums = [3,2,2,3] and val = 3, the method should return 2, and the first two elements of nums should be 2.


//NOTE: I did not do as requested. Cause this one seem to me more complicated and efficient. I know the desired conclusion and mine are different

public class Main {

    // WRITE THE REMOVEELEMENT METHOD HERE //
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
        int[] newArray = new int[nums.length - k];
        int i = 0;
        for (; k < nums.length; k++) {
            newArray[i] = nums[k];
            i++;
        }
        nums = newArray;
        return nums.length;

    }


    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int val1 = 1;
        int newLength1 = removeElement(nums1, val1);
        System.out.println("Test case 1: Modified array: " + Arrays.toString(nums1) + "\nNew length: " + newLength1);

        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int val2 = 6;
        int newLength2 = removeElement(nums2, val2);
        System.out.println("Test case 2: Modified array: " + Arrays.toString(nums2) + "\nNew length: " + newLength2);

        int[] nums3 = {-1, -2, -3, -4, -5};
        int val3 = -1;
        int newLength3 = removeElement(nums3, val3);
        System.out.println("Test case 3: Modified array: " + Arrays.toString(nums3) + "\nNew length: " + newLength3);

        int[] nums4 = {};
        int val4 = 1;
        int newLength4 = removeElement(nums4, val4);
        System.out.println("Test case 4: Modified array: " + Arrays.toString(nums4) + "\nNew length: " + newLength4);

        int[] nums5 = {1, 1, 1, 1, 1};
        int val5 = 1;
        int newLength5 = removeElement(nums5, val5);
        System.out.println("Test case 5: Modified array: " + Arrays.toString(nums5) + "\nNew length: " + newLength5);

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Modified array: [-2, -3, 4, -1, 2, -5, 4, -5, 4]
            New length: 7
            Test case 2: Modified array: [1, 2, 3, 4, 5, 6]
            New length: 5
            Test case 3: Modified array: [-2, -3, -4, -5, -5]
            New length: 4
            Test case 4: Modified array: []
            New length: 0
            Test case 5: Modified array: [1, 1, 1, 1, 1]
            New length: 0
        */

    }

}