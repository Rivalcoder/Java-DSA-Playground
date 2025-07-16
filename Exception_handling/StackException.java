class SimpleStack {
    int[] stack;
    int top, capacity;

    SimpleStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    void push(int data) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack Overflow");
        }
        stack[++top] = data;
    }

    int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack[top--];
    }

    int peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        return stack[top];
    }
}

public class StackException {
    public static void main(String[] args) {
        SimpleStack s = new SimpleStack(2);

        try {
            s.push(10);
            s.push(20);
            s.push(30);  // Overflow
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.println("Popped: " + s.pop());
            System.out.println("Popped: " + s.pop());
            System.out.println("Popped: " + s.pop()); // Underflow
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
