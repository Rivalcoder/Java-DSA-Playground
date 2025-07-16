package Queue;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        //Default Type using Linkedlist and Array Type is Also There
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);
        System.out.println(deque); // [1, 2, 3]

        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque); // [2]
    }
}
