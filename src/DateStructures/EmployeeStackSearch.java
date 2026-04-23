package DateStructures;
import java.util.Iterator;
import java.util.Stack;


public class EmployeeStackSearch {
    public static void main(String[] args) {

        //Create a Stack object
        Stack<String> actions = new Stack<>();
        //Add at least 6 employee action records using push()
        actions.push("System Login\t");      // Button
        actions.push("Database Sync\t");    //
        actions.push("File Upload\t");      //
        actions.push("Code Review\t");      //
        actions.push("Email Sent\t");       //
        actions.push("System Logout\t");    // Top

        //Display current stack with positions
        for (int i = actions.size() - 1; i >= 0; i--) {
            int position = actions.size() - i;
            System.out.println("Position " + position + ": " + actions.get(i));
        }

        // Use search() to find  2 position
        int pos1 = actions.search("Code Review");
        int pos2 = actions.search("System Login");
        System.out.println("\n--- Search Results ---");
        System.out.println("Position of 'Code Review': " + pos1);
        System.out.println("Position of 'System Login': " + pos2);

        // Use contains() to  check if specific actions exist in the stack
        boolean hasCodeReview = actions.contains("Code Review");
        boolean hasLogin = actions.contains("System Login");
        System.out.println("Does stack contain 'Code Review'? " + hasCodeReview);
        System.out.println("Does stack contain 'System Login'? " + hasCodeReview);

        // Iterate using standard for loop (Top to Bottom)
        System.out.println("\n=== REPORT 1: TOP-DOWN HISTORY ");
        for (int i = actions.size() - 1; i >= 0; i--) {
            System.out.println("Entry Index [" + i + "]: " + actions.get(i));
        }
        // Step 7: Iteration B - Enhanced For-Each (Bottom to Top)
        // Best for: Reading the history in the order it happened
        System.out.println("\n=== REPORT 2: CHRONOLOGICAL HISTORY (FOR-EACH) ===");
        for (String action : actions) {
            System.out.println("Action Taken: " + action);
        }

        // Step 8: Iteration C - Using an Iterator
        // Best for: Processing data safely while moving through the collection
        System.out.println("\n=== REPORT 3: SYSTEM TRAVERSAL (ITERATOR) ===");
        Iterator<String> actionIterator = actions.iterator();
        while (actionIterator.hasNext()) {
            System.out.println("Log: " + actionIterator.next());
        }
    }
}