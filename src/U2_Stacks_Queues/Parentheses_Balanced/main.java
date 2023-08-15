package U2_Stacks_Queues.Parentheses_Balanced;

public class main {



    public static boolean isBalancedParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }

        public static void main(String[] args) {
            String s1 = "()()()";
            String s2 = "()(()";
            String s3 = "(()())";
            String s4 = "(()()(";
            System.out.println(isBalancedParentheses(s1)); // true
            System.out.println(isBalancedParentheses(s2)); // false
            System.out.println(isBalancedParentheses(s3)); // true
            System.out.println(isBalancedParentheses(s4)); //false
        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
        */
        }



}
