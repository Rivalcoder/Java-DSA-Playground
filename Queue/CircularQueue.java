public class CircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    CircularQueue(int c) {
        capacity = c;
        arr = new int[capacity];
        front = rear = size = 0;
    }

    boolean enqueue(int x) {
        if (size == capacity) return false;
        arr[rear] = x;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    int dequeue() {
        if (size == 0) return -1;
        int x = arr[front];
        front = (front + 1) % capacity;
        size--;
        return x;
    }

    void display() {
        int i = front;
        int count = size;
        while (count-- > 0) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();  // Output: 10 20 30 40 50

        queue.dequeue();
        queue.dequeue();
        queue.display();  // Output: 30 40 50

        queue.enqueue(60);
        queue.enqueue(70);
        queue.display();  // Output: 30 40 50 60 70

        boolean added = queue.enqueue(80);  // Should return false (queue is full)
        System.out.println("Enqueue 80 success: " + added);  // Output: false
    }
}
