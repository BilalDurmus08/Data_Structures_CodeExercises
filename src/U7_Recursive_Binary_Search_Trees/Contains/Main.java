package U7_Recursive_Binary_Search_Trees.Contains;

import U7_Recursive_Binary_Search_Trees.Contains.BinarySearchTree;

public class Main {

    //rBST: Contains
//        Implement the rContains method in the BinarySearchTree class.
//        The rContains method is a recursive method designed to search for
//        a specific integer value in the binary search tree (BST).
//        It checks if the given value exists in the BST and returns a boolean indicating the presence of that value.
//        The rContains method consists of two parts.
//        The public part of the method (provided) public boolean rContains(int value) takes the value to be searched as a parameter.
//        It calls the private part of the method private boolean rContains(Node currentNode, int value)
//        with the root of the BST and the search value as arguments.



    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);


        System.out.println("BST Contains 27:");
        System.out.println(myBST.rContains(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST.rContains(17));


        /*
            EXPECTED OUTPUT:
            ----------------
            BST Contains 27:
            true

            BST Contains 17:
            false

        */

    }

}