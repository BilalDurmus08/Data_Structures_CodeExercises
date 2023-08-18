package U4_Interview_Questions.MP_91_Longest_ConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

//Set: Longest Consecutive Sequence ( ** Interview Question)
//        Given an unsorted array of integers, write a function that finds the length of the  longestConsecutiveSequence (i.e.,
//        a sequence of integers in which each element is one greater than the previous element).
//        Use sets to optimize the runtime of your solution.
//        Input: An unsorted array of integers, nums.
//        Output: An integer representing the length of the longest consecutive sequence in nums.


public class Main {

    // WRITE LONGESTCONSECUTIVESEQUENCE METOHOD HERE //

    public static int longestConsecutiveSequence(int[] nums){
        Set<Integer> mySet = new HashSet<>();
        int longestConsecutive = 0;
        for (int num : nums){
            mySet.add(num);
        }
        for (int num : nums){
            int temp = 1;
            int i = 1;
            while (mySet.contains(num-i)){
                temp++;
                i++;
                if (longestConsecutive < temp){
                    longestConsecutive = temp;
                }
            }

        }
        return longestConsecutive;

    }



    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int longest = longestConsecutiveSequence(nums);
        System.out.println(longest);

        /*
            EXPECTED OUTPUT:
            ----------------
            4

        */

    }

}
