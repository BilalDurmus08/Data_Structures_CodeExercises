package U9_4_Interview_Questions.MP3_Find_Longest_String;

//Array: Find Longest String ( ** Interview Question)
//        Write a method that, given an array of strings, finds and returns the longest string in the array.
//
//        If there are multiple strings with the same maximum length, return the first one encountered.
//
//        Additional Notes
//
//        The implementation needs to consider the case where the string is empty "" as in test case 5. In this case,
//        the empty string has the least length. If all the strings in the array are of the same length,
//        the method will return the first string in the array.
//
//        Please ensure your solution handles these cases correctly.


public class Main {

    // WRITE THE FINDLONGESTSTRING METHOD HERE //
    public static String findLongestString(String[] stringList) {
        int maxNumber = 0;
        String desired = null;


        for (String s : stringList) {
            int i = 0;

            for (char c : s.toCharArray()) {
                i++;
            }
            if (i > maxNumber) {
                maxNumber = i;
                desired = s;
            }
        }
        return desired;

    }


    public static void main(String[] args) {

        String[] stringList1 = {"apple", "banana", "kiwi", "pear"};
        String longest1 = findLongestString(stringList1);
        System.out.println("Test case 1: Longest string: " + longest1);  // prints "banana"

        String[] stringList2 = {"cat", "giraffe", "elephant", "hippopotamus"};
        String longest2 = findLongestString(stringList2);
        System.out.println("Test case 2: Longest string: " + longest2);  // prints "hippopotamus"

        String[] stringList3 = {"sun", "moon", "planet", "universe"};
        String longest3 = findLongestString(stringList3);
        System.out.println("Test case 3: Longest string: " + longest3);  // prints "universe"

        String[] stringList4 = {"java", "python", "javascript", "c"};
        String longest4 = findLongestString(stringList4);
        System.out.println("Test case 4: Longest string: " + longest4);  // prints "javascript"

        String[] stringList5 = {"", "a", "aa", "aaa"};
        String longest5 = findLongestString(stringList5);
        System.out.println("Test case 5: Longest string: " + longest5);  // prints "aaa"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Longest string: banana
            Test case 2: Longest string: hippopotamus
            Test case 3: Longest string: universe
            Test case 4: Longest string: javascript
            Test case 5: Longest string: aaa
        */

    }

}