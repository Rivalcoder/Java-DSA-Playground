class Node {
    int data;
    Node left, right;

    Node(int value) {
        this.data = value;
        left = right = null;
    }
}

class BST {
    Node root;

    Node insert(Node node, int data) {
        if (node == null) return new Node(data);
        if (data < node.data) node.left = insert(node.left, data);
        else node.right = insert(node.right, data);
        return node;
    }

    boolean search(Node node, int key) {
        if (node == null) return false;
        if (key == node.data) return true;
        return key < node.data ? search(node.left, key) : search(node.right, key);
    }

    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
}

public class TreeCreation {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 80);

        System.out.print("Inorder: ");
        bst.inorder(bst.root); // 20 30 40 50 60 70 80
        System.out.println("\nFound 60? " + bst.search(bst.root, 60)); // true
    }
}
