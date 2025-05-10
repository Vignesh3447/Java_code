// Java program to demonstrate the
// working of a stack
import java.util.*;
public class GFG {

    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("hii");
        stack.push("java");
        stack.push("how");
        stack.push("are");

        
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + "' ,");
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
