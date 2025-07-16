class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = newNode;
    }

    void deleteByValue(int val) {
        if (head == null) return;
        if (head.data == val) {
            head = head.next;
            return;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data != val)
            curr = curr.next;
        if (curr.next != null)
            curr.next = curr.next.next;
    }

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    void sort() {
        if (head == null || head.next == null) return;
        for (Node i = head; i.next != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.data > j.data) {
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }
}
public class Tree {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.insertAtBeginning(25); // Insert at start
        list.insertAtEnd(30);       // Insert at end
        list.insertAtEnd(10);
        list.insertAtBeginning(5);  // Insert at start
        list.insertAtEnd(20);

        list.display();             // 5 -> 25 -> 30 -> 10 -> 20 -> null
        
        list.sort();
 
        //Another way of Easy Sorting is
        //Collections.sort(list);
        //This Is the Easy Way of Sorting Linked Lists

        list.display();             // 5 -> 10 -> 20 -> 25 -> 30 -> null

        list.deleteByValue(20);
        list.display();             // 5 -> 10 -> 25 -> 30 -> null
    }
}
