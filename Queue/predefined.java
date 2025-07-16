package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class predefined {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Peek
        System.out.println("Front element: " + queue.peek());

        // Dequeue
        System.out.println("Removed: " + queue.poll());

        // Check if empty
        System.out.println("Is Empty? " + queue.isEmpty());

        // Print entire queue
        System.out.println(queue);
    }
}
