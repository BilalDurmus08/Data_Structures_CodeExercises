package U4_Interview_Questions.MP_5_2_TwoSum;

import java.util.*;


public class Main {

    // WRITE THE TWOSUM MEHTOD HERE //
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            numMap.put(nums[i] , i);
        }

        for (int i = 0; i < nums.length; i++) {
           int num = nums[i];
            int complement = target - num;
            if (numMap.containsKey(complement)){

                return new int[] {i, numMap.get(complement)};
            }

        }

    return new int[]{};
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
