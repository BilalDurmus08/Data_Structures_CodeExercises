package U9_3_BST_Traversal.B_1_DFS_PreOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//BST: DFS PreOrder
//        Create a DFSPreOrder method within a BinaryTree class that
//        performs a depth-first search (pre-order traversal) of the
//        tree and returns an ArrayList of the visited nodes' values in the order they were visited.
//
//        Return type: ArrayList<Integer>


public class BinarySearchTree {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    // WRITE DFS_PREORDER METHOD HERE //
    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> desired = new ArrayList<>();

        class Traverse {
            Traverse(Node current) {
                desired.add(current.value);
                if (current.left != null) {
                    new Traverse(current.left);
                }
                if (current.right != null) {
                    new Traverse(current.right);
                }

            }
        }
        new Traverse(root);
        return desired;
    }


}

