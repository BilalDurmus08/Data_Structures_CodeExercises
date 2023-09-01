package U9_3_BST_Traversal.B_3_DFS_InOrder;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("DFS InOrder:");
        System.out.println(myBST.DFSInOrder());

        /*
            EXPECTED OUTPUT:
            ----------------
            DFS InOrder:
            [18, 21, 27, 47, 52, 76, 82]

        */

    }

}