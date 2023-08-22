package U7_Recursive_Binary_Search_Trees.Insert;

public class BinarySearchTree {

//    rBST: Insert
//    Implement the rInsert method in the BinarySearchTree class.
//    The rInsert method is a recursive method designed to insert a specific integer value into the binary search tree (BST).
//    The rInsert method consists of two parts. The public part of the method (provided) public void rInsert(int value)
//    takes the value to be inserted as a parameter. It creates a new Node if the root is null or calls the private part
//    of the method private Node rInsert(Node currentNode, int value) with the root of the BST and the value to be inserted as arguments.



    private Node root;

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


    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false;

        if (currentNode.value == value) return true;

        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }
    public boolean rContains(int value) { return rContains(root, value); }


    // WRITE THE RECURSIVE INSERT METHOD HERE //
    private Node rInsert(Node currentNode, int value){
        if (currentNode == null){
          return new Node(value);
        }
        if (currentNode.value < value){
            currentNode.right = rInsert(currentNode.right, value);
        } else if (currentNode.value > value) {
            currentNode.left = rInsert(currentNode.left, value);
        }

            return currentNode;



    }


    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }


}
