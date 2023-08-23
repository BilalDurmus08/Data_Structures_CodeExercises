package U8_BasicSorts_Questions.BubbleSort;


//Bubble Sort of LL ( ** Interview Question)
//        Implement the bubble sort algorithm in a singly linked list.
//        The linked list has already been defined and contains integer elements.
//        You need to write a method bubbleSort() within the LinkedList class.
//        This method will sort the linked list in ascending order using the Bubble Sort algorithm.
//        The Bubble Sort algorithm works by comparing each pair of adjacent elements
//        in the list and swapping them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
//        Please make sure your code follows the above steps to implement the bubble sort method correctly.
//        You may assume that all values in the list are integers. Also,
//        please note that your bubbleSort() method should not return any value;
//        it should sort the linked list in-place. That is, it should modify the original
//        linked list rather than creating and returning a new, sorted list.

import U6_Heaps_Questions.Kth_Smallest_Element.Heap;

public class LinkedList {

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

    // WRITE BUBBLESORT METHOD HERE //

    void bubbleSort() {
        if (this.length < 2)
            return;

        Node sortedUntil = null;
        while (sortedUntil != this.head.next) {
            Node current = this.head;

            while (current.next != sortedUntil) {
                Node nextNode = current.next;

                if (current.value > nextNode.value) {
                    int temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;

                }
                current = current.next;
            }
            sortedUntil = current;
        }
    }



}