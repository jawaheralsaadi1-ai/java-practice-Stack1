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

}}
