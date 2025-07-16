package Queue;
class DynamicQueue {
    int[] arr;
    int front, rear, size;

    public DynamicQueue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if (size == arr.length) {
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[(front + i) % arr.length];
            }
            front = 0;
            rear = size - 1;
            arr = newArr;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return value;
    }

    public int peek() {
        return isEmpty() ? -1 : arr[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }
        System.out.println();
    }
}

public class DynamicQueueExample {
    public static void main(String[] args) {
        DynamicQueue queue = new DynamicQueue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
    }
}
