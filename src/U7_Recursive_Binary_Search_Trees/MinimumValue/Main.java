package U7_Recursive_Binary_Search_Trees.MinimumValue;

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


        System.out.println(myBST.minValue( myBST.getRoot() ));

        System.out.println(myBST.minValue( myBST.getRoot().right ));


        /*
            EXPECTED OUTPUT:
            ----------------
			18
			52

        */

    }


}
