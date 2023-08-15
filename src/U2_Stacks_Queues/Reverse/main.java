package U2_Stacks_Queues.Reverse;

public class main {

 /*  Stack: Reverse String ( ** Interview Question)
    The reverseString method takes a single parameter String, which is the string you want to reverse.

    Return a new String with the letters in reverse order.

    This method will be written in the same class as the main method so it will be static.*/

    public static String reverseString(String string){

        Stack<Character> stack = new Stack<>();
        String reverseString = "";
        for (char c : string.toCharArray() ){
            stack.push(c);
        }
        while (!stack.isEmpty()){
            reverseString = reverseString + stack.pop();
        }
        return reverseString;

    }




        public static void main(String[] args) {

            String myString = "hello";
            String reversedString = reverseString(myString);
            System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

        }

    }



