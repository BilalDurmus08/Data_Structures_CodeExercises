package U3_Trees.Constructor;

public class BinarySearchTree {

    // CREATE CLASS VARIABLE (ROOT) AND NODE CLASS HERE//
    Node root;
    public class Node {

        int value;
        Node left;
        Node right;
        public Node (int value){
            this.value = value;
        }

    }



    public Node getRoot() {
        return root;
    }

}