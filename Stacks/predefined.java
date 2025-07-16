import java.util.Stack;

public class predefined {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek
        System.out.println("Top element: " + stack.peek());

        // Pop
        System.out.println("Removed: " + stack.pop());

        // Check if empty
        System.out.println("Is Empty? " + stack.isEmpty());

        // Print entire stack
        System.out.println(stack);
    }
}
