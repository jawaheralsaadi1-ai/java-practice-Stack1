package DateStructures;
import java.util.Stack;

public class HtmlTagValidator {
    public static void main(String[] args) {
        // A simple HTML string to check
        String html = "<html><body><h1>Hero</h1></body></html>";

        Stack<String> tagStack = new Stack<>();

        // This is a simple way for beginners to find tags:
        // We look for words between < and >
        String[] tags = {"html", "body", "h1", "/h1", "/body", "/html"};

        for (String tag : tags) {
            if (!tag.startsWith("/")) {
                // It's an opening tag, so push it!
                tagStack.push(tag);
                System.out.println("Opened: " + tag);
            } else {
                // It's a closing tag, so check the top of the stack
                String closingTag = tag.substring(1); // removes the '/'
                if (tagStack.peek().equals(closingTag)) {
                    tagStack.pop();
                    System.out.println("Closed: " + closingTag);
                }
            }
        }

        if (tagStack.isEmpty()) {
            System.out.println("HTML is perfect!");
        } else {
            System.out.println("Error: Some tags were left open!");
        }
    }
}