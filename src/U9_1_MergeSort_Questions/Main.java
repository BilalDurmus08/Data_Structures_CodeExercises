package U9_1_MergeSort_Questions;

public class Main {

//    LL: Merge Two Sorted Lists ( ** Interview Question)
//    Description
//    The merge method takes in another LinkedList as an input and merges it with the current LinkedList. The elements in
//    both lists are assumed to be in ascending order, but the input lists themselves do not need to be sorted.
//            Parameters
//
//    otherList: the other LinkedList to merge with the current list
//    Return Value
//
//    This method does not return a value, but it modifies the current LinkedList to contain the merged list.


    public static void main(String[] args) {

        LinkedList l1 = new LinkedList(1);
        l1.append(3);
        l1.append(5);
        l1.append(7);

        LinkedList l2 = new LinkedList(2);
        l2.append(4);
        l2.append(6);
        l2.append(8);

        l1.merge(l2);

        l1.printAll();


        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 1
            Tail: 8
            Length:8

            Linked List:
            1
            2
            3
            4
            5
            6
            7
            8

        */

    }

}