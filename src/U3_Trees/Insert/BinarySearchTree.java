package U3_Trees.Insert;
/*
BST: Insert
Implement the insert method that adds a new node to the tree.
Return type: boolean
The method should perform the following tasks:
Create a new Node object called newNode with the given integer value.
If the root node is null, set the root to the newNode and return true.
Create a temporary node called temp and set it to the root node.
Use a while loop to traverse the tree:
If the newNode value is equal to the temp node value, return false (no duplicates allowed).
If the newNode value is less than the temp node value:
If the left child of temp is null, set the left child to newNode and return true.
Otherwise, set temp to its left child.
If the newNode value is greater than the temp node value:,
If the right child of temp is null, set the right child to newNode and return true.
Otherwise, set temp to its right child.  */

public class BinarySearchTree {

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    // WRITE INSERT METHOD HERE //
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        else{
            Node temp = root;
            while (true){
                if (temp.value == newNode.value){
                    return false;
                }
                if (temp.value > newNode.value) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        return true;
                    } else {
                        temp = temp.left;
                    }
                } else if (temp.value < newNode.value) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        return true;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }
    }
}