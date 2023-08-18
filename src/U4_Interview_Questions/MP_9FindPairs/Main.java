package U4_Interview_Questions.MP_9FindPairs;

import java.util.*;

//Set: Find Pairs ( ** Interview Question)
//        Given two integer arrays arr1 and arr2, and an integer target,
//        write a method named findPairs that finds all pairs of integers such that one integer is from arr1,
//        the other is from arr2, and their sum equals the target value.
//
//        The method should return a list of integer arrays, each containing a pair of integers.


public class Main {

    // WRITE FINDPAIRS METHOD HERE //
    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target){
        Set<Integer> mySey2 = new HashSet<>();
        List<int[]> desired = new ArrayList<>();
        for (int i : arr2){
            mySey2.add(i);
        }
        for (int num : arr1){
           int complement = target - num;
            if (mySey2.contains(complement)){
                desired.add(new int[]{num,complement});
            }

       }
    return desired;

    }




    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]

        */

    }

}

