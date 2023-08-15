package U3_Trees.Contains;

public class BinarySearchTree {

//    Implement the contains method that checks if a node with a given value exists in the tree.
//    Return type: boolean
//    The method should perform the following tasks:
//    If the root node is null, return false.
//    Create a temporary node called temp and set it to the root node.
//    Use a while loop to traverse the tree:
//    If the given value is less than the temp node value, set temp to its left child.
//    If the given value is greater than the temp node value, set temp to its right child.
//    If the given value is equal to the temp node value, return true.
//    If the loop exits without finding a match, return false.
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

    // WRITE CONTAINS METHOD HERE //
    public boolean contains (int value){
        if (root == null){
            return false;
        }
        Node desired = new Node(value);
        Node temp = root;

        while (temp != null){
            if (temp == desired){
                return true;
            }
            if (desired.value < temp.value){
                temp = temp.left;

            }else if (desired.value > temp.value){
                temp = temp.right;

            } else if (desired.value == temp.value){
            return true;
            }


        }
        return false;


    }






}



