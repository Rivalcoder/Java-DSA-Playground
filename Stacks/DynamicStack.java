class DynamicStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    DynamicStack() {
        capacity = 2; // initial capacity
        stack = new int[capacity];
        top = -1;
    }

    // Push operation
    public void push(int data) {
        if (top == capacity - 1) {
            resize(); // stack is full
        }
        stack[++top] = data;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Size of stack
    public int size() {
        return top + 1;
    }

    // Resize method
    private void resize() {
        capacity = capacity * 2;
        int[] newStack = new int[capacity];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    // Print stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        DynamicStack ds = new DynamicStack();

        ds.push(10);
        ds.push(20);
        ds.push(30); // triggers resize
        ds.push(40);

        ds.printStack(); // Output: 10 20 30 40

        System.out.println("Popped: " + ds.pop()); // 40
        System.out.println("Top: " + ds.peek());   // 30
        ds.printStack(); // Output: 10 20 30
    }
}
