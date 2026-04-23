package DateStructures;
import java.util.Stack;

public class EmployeeStackDemo {
    public static void main(String[] args){
        Stack<String> empAction= new Stack<>();

        // Add at least 5 employee action records using the push() method
        empAction.push("Check In\n");
        empAction.push("check Out\n");
        empAction.push("Update System\n");
        empAction.push("Remove Files\n");
        empAction.push("Edit some Project\n");

        //Display all elements in the Stack
        System.out.println(" Original Stack: \n" + empAction);
       // Add one more employee action record
        empAction.push("Add more details to file 1");
        // display the updated Stack
        System.out.println(" Update Stack: \n" + empAction);
    }
}

