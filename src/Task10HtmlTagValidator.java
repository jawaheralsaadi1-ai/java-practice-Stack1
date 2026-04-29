import java.util.Stack;

public class Task10HtmlTagValidator {

    public static void main(String[] args) {
        // Test cases: correct and incorrect HTML strings
        // Create 8 different HTML/XML strings to validate
        String[] testCases = {
                "<html><body><h1>Title</h1></body></html>",       // Valid
                "<div><p>Hello</div>",                             // Mismatched
                "<b><i>Bold and Italic</i></b>",                   // Valid
                "<span>Wrong order</p></span>",                    // Mismatched
                "<img src='image.jpg' />",                         // Self-closing (Valid)
                "<div id='main'><br></div>",                       // Attributes & single tag
                "",                                                // Empty string
                "<div><ul><li>Item</li></ul>"                      // Unclosed tags
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
        return true;
    }
}
