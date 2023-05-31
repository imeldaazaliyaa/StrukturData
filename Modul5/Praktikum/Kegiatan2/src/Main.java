
import java.util.Scanner;

class Node {
    String value;
    Node left;
    Node right;

    Node(String value) {
        this.value = value;
        left = null;
        right = null;
    }
}
public class Main {
    Node root;

    Node insert(Node root, String value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value.compareTo(root.value) <= 0) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    void printTree(Node node) {
        if (node != null) {
            printTree(node.left);
            System.out.println(node.value);
            printTree(node.right);
        }
    }

    void preorderTraversal(Node node) {
        if (node != null) {
            System.out.println(node.value);
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.println(node.value);
            inorderTraversal(node.right);
        }
    }

    void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.println(node.value);
        }
    }

    public static void main(String[] args) {
        Main binaryTree = new Main();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah nilai yang akan dimasukkan: ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
                String value = scanner.next();
                binaryTree.root = binaryTree.insert(binaryTree.root, value);
            }
        }

        System.out.println("Binary Tree:");
        binaryTree.printTree(binaryTree.root);

        System.out.println("\nPreorder Traversal:");
        binaryTree.preorderTraversal(binaryTree.root);

        System.out.println("\nInorder Traversal:");
        binaryTree.inorderTraversal(binaryTree.root);

        System.out.println("\nPostorder Traversal:");
        binaryTree.postorderTraversal(binaryTree.root);
    }
}