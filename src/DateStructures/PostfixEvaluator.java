package DateStructures;
import java.util.Stack;

public class PostfixEvaluator {
    public static void main(String[] args) {
        // We use a String with spaces to separate our numbers and symbols
        String expression = "10 2 + 3 *"; // This means (10 + 2) * 3

        Stack<Integer> numbers = new Stack<>();

        // .split(" ") breaks the string into an array: ["10", "2", "+", "3", "*"]
        String[] parts = expression.split(" ");

        for (String token : parts) {
            // If the token is a number, put it in the stack
            if (token.matches("\\d+")) {
                numbers.push(Integer.parseInt(token));
            }
            // If it's a symbol, take the last two numbers out and calculate!
            else {
                int second = numbers.pop();
                int first = numbers.pop();

                if (token.equals("+")) numbers.push(first + second);
                else if (token.equals("-")) numbers.push(first - second);
                else if (token.equals("*")) numbers.push(first * second);
                else if (token.equals("/")) numbers.push(first / second);
            }
            System.out.println("Step: " + token + " | Current Stack: " + numbers);
        }
        System.out.println("Final Result: " + numbers.pop());
    }
}