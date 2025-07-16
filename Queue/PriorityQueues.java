import java.util.*;
public class PriorityQueues {

    public static void main(String[] args) {
        //Min-Heap Priority Queue
        //Elements are ordered by their natural ordering (ascending order) Shortest comes out first
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());  // Prints in ascending order
        }

        //Max-Heap Priority Queue
        //Elements are ordered by their natural ordering (descending order) Largest comes out first
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(10);
        maxHeap.offer(50);
        maxHeap.offer(30);

        System.out.println(maxHeap.poll());
    }
}


