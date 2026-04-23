package DateStructures;

import java.util.Stack;


public class ParenthesesValidator {
    public static void main(String[] args) {
        String[] tests = {"{[()]}", "{[(])}", "((()))", "[{}]", "(("};

        for (String test : tests) {
            System.out.println("\nTesting: " + test);
            boolean result = isBalanced(test);
            System.out.println("Result: " + (result ? "VALID" : "INVALID"));
        }
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // Push opening symbols
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // Handle closing symbols
            else {
                if (stack.isEmpty()) return false; // Closing without opening
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false; // Mismatched pair
                }
            }
            System.out.println("Stack: " + stack);
        }
        return stack.isEmpty(); // Balanced if stack is empty at the end
    }
}