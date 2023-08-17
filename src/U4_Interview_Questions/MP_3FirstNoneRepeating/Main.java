package U4_Interview_Questions.MP_3FirstNoneRepeating;

import java.util.*;

//HT: First Non-Repeating Character ( ** Interview Question)
//        You have been given a string of lowercase letters.
//        Write a function called firstNonRepeatingChar(String)
//        that finds the first non-repeating character in the given string using a hash table (HashMap).
//        If there is no non-repeating character in the string, the function should return null.
//        For example, if the input string is "leetcode", the function should return "l" because "l" is the first character
//        that appears only once in the string. Similarly, if the input string is "hello",
//        the function should return "h" because "h" is the first non-repeating character in the string.
//
//        Return type: Character




public class Main {

    // WRITE FIRSTNONREPEATINGCHAR METHOD HERE //
    public static Character firstNonRepeatingChar(String string){
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char c : string.toCharArray()){
            charCounts.put(c, charCounts.getOrDefault(c,0) + 1);
        }
        for (char c : string.toCharArray()){
            if (charCounts.get(c) == 1){
                return c;
            }

        }
return null;

    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }

}
