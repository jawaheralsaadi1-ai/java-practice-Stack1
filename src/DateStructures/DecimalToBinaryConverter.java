package DateStructures;
import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        int[] numbers = {0, 10, 25, 128, 255, 1024};

        System.out.printf("%-10s | %-15s | %-15s%n", "Decimal", "Binary (Stack)", "Java Built-in");
        System.out.println("----------------------------------------------------------");

        for (int num : numbers) {
            String binary = decimalToBinary(num);
            String builtIn = Integer.toBinaryString(num);
            System.out.printf("%-10d | %-15s | %-15s%n", num, binary, builtIn);
        }
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) return "0";
        Stack<Integer> stack = new Stack<>();
        int temp = decimal;

        while (temp > 0) {
            stack.push(temp % 2); // Remainder
            temp /= 2;            // Quotient
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop()); // Reverse the remainders
        }
        return binary.toString();
    }
}