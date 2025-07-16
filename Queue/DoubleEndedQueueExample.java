package Queue;
class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

class CustomDeque {
    Node front, rear;

    public CustomDeque() {
        front = rear = null;
    }

    public void insertFront(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    }

    public void insertRear(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    public int deleteFront() {
        if (front == null) {
            System.out.println("Deque Underflow (Front)");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front != null) front.prev = null;
        else rear = null;
        return value;
    }

    public int deleteRear() {
        if (rear == null) {
            System.out.println("Deque Underflow (Rear)");
            return -1;
        }
        int value = rear.data;
        rear = rear.prev;
        if (rear != null) rear.next = null;
        else front = null;
        return value;
    }

    public int peekFront() {
        return (front != null) ? front.data : -1;
    }

    public int peekRear() {
        return (rear != null) ? rear.data : -1;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        Node temp = front;
        System.out.print("Deque: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DoubleEndedQueueExample {
    public static void main(String[] args) {
        CustomDeque deque = new CustomDeque();
        deque.insertFront(10);
        deque.insertRear(20);
        deque.insertFront(5);
        deque.insertRear(25);
        deque.display();
        System.out.println("Front: " + deque.peekFront());
        System.out.println("Rear: " + deque.peekRear());
        System.out.println("Deleted Front: " + deque.deleteFront());
        System.out.println("Deleted Rear: " + deque.deleteRear());
        deque.display();
    }
}
