package U3_Trees.Insert;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */


        System.out.println("Root: " + myBST.getRoot().value);
        System.out.println("\nRoot->Left: " + myBST.getRoot().left.value);
        System.out.println("\nRoot->Right: " + myBST.getRoot().right.value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 2

            Root->Left: 1

            Root->Right: 3

        */

    }

}