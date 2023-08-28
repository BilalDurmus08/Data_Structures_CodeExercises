package U9_3_BST_Traversal.A_Breadth_First_Search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//BST: Breadth First Search (BFS)
//        Create a BFS method within a BinaryTree class that performs a breadth-first
//        search traversal of the tree and returns an ArrayList of the visited nodes' values in the order they were visited.
//        Return type:  ArrayList<Integer>


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

    //// WRITE BFS METHOD HERE ////
    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> myQueue = new LinkedList<>();
        ArrayList<Integer> desired = new ArrayList<>();
        myQueue.add(currentNode);

        while (myQueue.size() > 0) {
            currentNode = myQueue.poll();
            desired.add(currentNode.value);
            if (currentNode.right != null){
                myQueue.add(currentNode.right);
            }
            if (currentNode.left != null){
                myQueue.add(currentNode.left);
            }
        }
    return desired;
    }


}




