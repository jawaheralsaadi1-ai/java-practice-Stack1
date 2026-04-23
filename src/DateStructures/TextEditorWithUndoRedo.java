package DateStructures;
import java.util.Stack;

public class TextEditorWithUndoRedo {
    public static void main(String[] args) {
        // undoStack stores our previous versions
        Stack<String> undoStack = new Stack<>();
        // redoStack stores what we just 'undid'
        Stack<String> redoStack = new Stack<>();

        String currentText = "";

        // Action 1: Type something
        undoStack.push(currentText); // Save empty state
        currentText = "Hello";
        System.out.println("Typed: " + currentText);

        // Action 2: Type more
        undoStack.push(currentText); // Save "Hello"
        currentText = "Hello World";
        System.out.println("Typed: " + currentText);

        // Action 3: UNDO (Go back)
        redoStack.push(currentText); // Save "Hello World" to redo later
        currentText = undoStack.pop(); // Take "Hello" back out
        System.out.println("After Undo: " + currentText);

        // Action 4: REDO (Go forward)
        undoStack.push(currentText); // Save "Hello" again
        currentText = redoStack.pop(); // Take "Hello World" back
        System.out.println("After Redo: " + currentText);
    }
}