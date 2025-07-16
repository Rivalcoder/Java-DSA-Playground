package Queue;
import java.util.ArrayDeque;

public class ArrayDeque1{
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addLast(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);
        deque.addFirst(1);

        System.out.println("Deque: " + deque);
        System.out.println("Front: " + deque.getFirst());
        System.out.println("Rear: " + deque.getLast());

        System.out.println("Removed Front: " + deque.removeFirst());
        System.out.println("Removed Rear: " + deque.removeLast());

        System.out.println("Deque after deletions: " + deque);
    }
}
