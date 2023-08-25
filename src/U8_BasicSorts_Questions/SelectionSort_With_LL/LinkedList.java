package U8_BasicSorts_Questions.SelectionSort_With_LL;

public class LinkedList {

//    Selection Sort of LL ( ** Interview Question)
//    Implement the Selection Sort algorithm on a singly linked list.
//    The linked list has already been defined and contains integer elements.
//    You are required to write a method selectionSort() within the LinkedList class.
//    This method will sort the linked list in ascending order using the Selection Sort algorithm.
//    The Selection Sort algorithm works by dividing the list into a sorted and an unsorted region.
//    The sorted region starts out empty and the unsorted region is initially the entire list.
//    The algorithm repeatedly selects the smallest (or largest, depending on sorting order)
//    element from the unsorted region and moves it into the sorted region. When the unsorted region becomes empty,
//    the algorithm stops and the list is sorted.


    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // WRITE SELECTIONSORT METHOD HERE //
    public void selectionSort() {
        if (length < 2) {
            return;
        }
        Node current = head;

        while (current.next != null) {
            Node smallest = current;
            Node innerCurrent = current.next;
            while (innerCurrent != null) {
                if (innerCurrent.value < smallest.value) {
                    smallest = innerCurrent;
                }
                innerCurrent = innerCurrent.next;
            }
            if (smallest != current) {
                int temp = smallest.value;
                smallest.value = current.value;
                current.value = temp;
            }
            current = current.next;
        }


    }


}