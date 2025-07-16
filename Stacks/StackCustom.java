class MyStack {
    int top;
    int[] arr;

    MyStack(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        return top == -1 ? -1 : arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class StackCustom {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        System.out.println("Pushing elements: 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popping element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());

        System.out.println("Popping all elements:");
        stack.pop();
        stack.pop();

        System.out.println("Trying to pop from empty stack:");
        stack.pop();  // Should show underflow

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
