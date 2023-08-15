package U2_Stacks_Queues.Sort_Stack;

public class Main {

//    Stack: Sort Stack ( ** Interview Question)
//    The sortStack method takes a single argument, a Stack object.
//    The method should sort the elements in the stack in ascending order
//            (the lowest value will be at the top of the stack) using only one additional stack.
//    The function should use the pop, push, peek, and isEmpty methods of the Stack object.


    // WRITE THE SORTSTACK METHOD HERE //

    public static void sortStack(Stack<Integer> input) {
        Stack<Character> additionalStack = new Stack<>();

        while (!input.isEmpty()) {
      int temp =  input.pop();
            while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
                input.push(Integer.valueOf(additionalStack.pop()));
            }

            additionalStack.push((char) temp);
        }

        while (!additionalStack.isEmpty()){
            input.push(Integer.valueOf(additionalStack.pop()));
        }


    }


    /////////////////////////////////////


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

    }

}




