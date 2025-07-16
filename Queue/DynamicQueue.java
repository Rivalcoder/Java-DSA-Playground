public class DynamicQueue {
    int[] arr;
    int front, rear, size;

    DynamicQueue() {
        arr = new int[2];
        front = rear = size = 0;
    }

    void enqueue(int x) {
        if (size == arr.length) resize();
        arr[rear++] = x;
        size++;
    }

    int dequeue() {
        if (size == 0) return -1;
        int x = arr[front++];
        size--;
        return x;
    }

    void resize() {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[front + i];
        }
        arr = newArr;
        rear = size;
        front = 0;
    }

    void printQueue() {
        for (int i = front; i < rear; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicQueue queue = new DynamicQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.printQueue(); // 10 20

        queue.enqueue(30); // triggers resize
        queue.enqueue(40);
        queue.printQueue(); // 10 20 30 40

        queue.dequeue();
        queue.printQueue(); // 20 30 40

        queue.enqueue(50);
        queue.enqueue(60);
        queue.printQueue(); // 20 30 40 50 60
    }
}
