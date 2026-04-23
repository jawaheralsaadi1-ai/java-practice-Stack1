package DateStructures;
import java.util.Stack;

public class StringReversalAndPalindrome {
    public static void main(String[] args) {
        String[] words = {"Level", "Hello", "Racecar", "Java", "A man a plan a canal Panama", ""};

        for (String word : words) {
            String reversed = reverseString(word);
            boolean isPal = isPalindrome(word);
            System.out.printf("Original: [%s] | Reversed: [%s] | Palindrome: %b%n", word, reversed, isPal);
        }
    }

    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) return input;
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return reversed.toString();
    }

    public static boolean isPalindrome(String input) {
        // Clean string: ignore case and remove non-alphanumeric (Bonus Requirement)
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (clean.isEmpty()) return true;
        return clean.equals(reverseString(clean));
    }
}