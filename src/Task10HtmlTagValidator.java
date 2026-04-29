import java.util.Stack;

public class Task10HtmlTagValidator {

    public static void main(String[] args) {
        // Test cases: correct and incorrect HTML strings
        // Create 8 different HTML/XML strings to validate
        String[] testCases = {
                " <b>bold text</b> ",       // Valid
                " <b>bold</i> ",            // InValid
                "<b><i>Bold and Italic</i></b>",      // Valid
                " <br/>, <img src=\"...\"/>",         //Handles self-closing tags (Valid)
                " <div class=\"test\">",              // Handles tags with attributes
                "",                                   // Empty string
                "<div><ul><li>Item</li></ul>",        // Unclosed tags
                "<span>Wrong order</p></span>",       // Mismatched tags (InValid)

        };

// Loop through each test case
        for (String html : testCases) { //Using For Each Loop
            System.out.println("Testing HTML: " + (html.isEmpty() ? "[Empty]" : html));

            // Call the validation method
            boolean isValid = validateHtmlTags(html);

            System.out.println("Status: " + (isValid ? "Valid" : "Invalid"));
            System.out.println("-----------------------------------");
        }
    }

    // Define  validateHtmlTags class and test 8 cases
    public static boolean validateHtmlTags(String html) {
        // For now, we just return true to make sure the method works
       // return true
        // ______________________________________________________________________
        // new Add
        // Create Stack
            Stack<String> stack = new Stack<>();
            int i = 0;

            // Loop through the string to find < and >
            while (i < html.length()) {
                if (html.charAt(i) == '<') {
                    int end = html.indexOf('>', i);

                    // Edge case: if there is a < without a >
                    if (end == -1) {
                        System.out.println("Error: Unclosed bracket found.");
                        return false;
                    }

                    // Extract everything inside < >
                    String tagContent = html.substring(i + 1, end);
                    System.out.println("Step: Found tag content: " + tagContent);

                    // Move the index to the end of this tag
                    i = end;
                }
                i++;
            }

            // For now, it still returns true until we add the Stack logic next
            return true;
        }
    }

