import java.util.Stack;

public class BrowserHistorySimulator {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();

        // 1. Visit 5 pages
        String[] pages = {"google.com", "github.com", "stackoverflow.com", "medium.com", "openai.com"};
        for (String page : pages) {
            history.push(page);
            System.out.println("Visited: " + page + " | Current Top: " + history.peek());
        }

        // 2. Peek at current page
        System.out.println("\nActive Tab: " + (history.isEmpty() ? "None" : history.peek()));

        // 3. Back Button Simulation (2 times)
        for (int i = 0; i < 2; i++) {
            if (!history.isEmpty()) {
                System.out.println("Pressing [BACK]. Leaving: " + history.pop());
                System.out.println("Now at: " + (history.isEmpty() ? "Home" : history.peek()));
            }
        }

        // 4. Add 2 new visits
        history.push("youtube.com");
        history.push("linkedin.com");

        System.out.println("\nFinal Browsing History (Oldest to Newest): " + history);

        // 5. Bonus: Clear history
        history.clear();
        System.out.println("History Cleared. Is empty? " + history.isEmpty());
    }
}