public class CustomQueue {
    int[] arr;
    int front, rear, capacity;

    CustomQueue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = rear = 0;
    }

    void enqueue(int data) {
        if (rear == capacity) return;
        arr[rear++] = data;
    }

    int dequeue() {
        if (front == rear) return -1;
        int x = arr[front];
        for (int i = 0; i < rear - 1; i++)
            arr[i] = arr[i + 1];
        rear--;
        return x;
    }

    void printQueue() {
        for (int i = front; i < rear; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void QueueCustomArray(String[] args) {
        CustomQueue queue = new CustomQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();   // Output: 10 20 30

        queue.dequeue();
        queue.printQueue();   // Output: 20 30

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);    // Won’t be added if full
        queue.printQueue();   // Output: 20 30 40 50
    }
}
