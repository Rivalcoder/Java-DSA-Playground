class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    DNode head;

    void insertAtBeginning(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = newNode;
        newNode.prev = curr;
    }

    void displayForward() {
        DNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    void reverseDisplay() {
        DNode curr = head;
        if (curr == null) return;
        while (curr.next != null)
            curr = curr.next;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.prev;
        }
        System.out.println("null");
    }

    void sort() {
        if (head == null || head.next == null) return;
        for (DNode i = head; i.next != null; i = i.next) {
            for (DNode j = i.next; j != null; j = j.next) {
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
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(40);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.displayForward();    // 40 <-> 20 <-> 30 <-> null
        list.sort();

        //Another way of Easy Sorting is
        //Collections.sort(list);
        //This Is the Easy Way of Sorting Linked Lists

        list.displayForward();    // 20 <-> 30 <-> 40 <-> null
        list.reverseDisplay();    // 40 <-> 30 <-> 20 <-> null
    }
}
