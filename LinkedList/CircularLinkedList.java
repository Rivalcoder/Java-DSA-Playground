class CNode {
    int data;
    CNode next;

    CNode(int data) {
        this.data = data;
    }
}

class CircularLinkedList {
    CNode head = null;
    CNode tail = null;

    void insertAtBeginning(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }



    void insert(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    void display() {
        if (head == null) return;
        CNode temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    void delete(int val) {
        if (head == null) return;
        CNode curr = head, prev = tail;
        do {
            if (curr.data == val) {
                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                    if (curr == tail)
                        tail = prev;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void sort() {
        if (head == null || head.next == head) return;
        CNode i = head;
        do {
            CNode j = i.next;
            while (j != head) {
                if (i.data > j.data) {
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
                j = j.next;
            }
            i = i.next;
        } while (i != head);
    }
}

public class Tree{
    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.insert(50);
        cl.insert(10);
        cl.insert(30);
        cl.display();     // 50 -> 10 -> 30 -> (head)
        cl.sort();

        
        //Another way of Easy Sorting is
        //Collections.sort(list);
        //This Is the Easy Way of Sorting Linked Lists


        cl.display();     // 10 -> 30 -> 50 -> (head)
        cl.delete(30);
        cl.display();     // 10 -> 50 -> (head)
    }
}

