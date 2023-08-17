package U4_Interview_Questions.MP_2FindDuplicates;

import java.util.*;

//HT: Find Duplicates ( ** Interview Question)
//        findDuplicates()
//        Problem: Given an array of integers nums, find all the duplicates in the array using a hash table (HashMap).
//        Input:
//        An array of integers nums.
//        Return Type:
//        List<Integer> implemented as an ArrayList
//        List is an interface and ArrayList is a way of implementing the List interface


public class Main {

    // WRITE THE FINDDUPLICATES METHOD HERE //
    public static ArrayList<Integer> findDuplicates(int[] nums){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        ArrayList<Integer> myArrayList = new ArrayList<>();
        for (int i : nums){
            if (myHashMap.get(i) == null){
                myHashMap.put(i,true);
            }else {
            if (!myArrayList.contains(i)){
                myArrayList.add(i);
            }
            }
        }

return myArrayList;

    }




    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4, 2};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

}
