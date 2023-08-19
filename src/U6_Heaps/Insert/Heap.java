package U6_Heaps.Insert;

import java.util.ArrayList;
import java.util.List;

//Heap: Insert
//        Implement the insert method in the Heap class.
//        The Heap class represents a max heap,
//        a complete binary tree in which the value in each internal node is greater than or equal to the values in the children of that node.
//        The Heap class currently has several helper methods:
//        getHeap that returns a new list containing all elements of the heap,
//        leftChild that returns the index of the left child of a node at a given index,
//        rightChild that returns the index of the right child of a node at a given index,
//        parent that returns the index of the parent of a node at a given index,
//        swap that swaps the elements at two given indices in the heap.
//        The insert method should add a new integer value to the heap while maintaining the max heap property. In other words,
//        after insertion, each parent node (including the newly inserted element) should be greater than or equal to its child nodes.
//        The insert method should work as follows:
//        Add the new value to the end of the heap (the next available position in the complete binary tree).
//        Compare the inserted element with its parent. If the inserted element is greater than its parent, then swap the element with its parent.
//        Continue this process until the max heap property is restored (i.e., the parent is greater than its children).
//        Utilize the parent and swap helper methods in your implementation.


public class Heap {
    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    // WRITE THE INSERT METHOD HERE //
    public void insert(int num) {
        heap.add(num);

        int current = heap.size() - 1;
        int parentIndex = parent(current);

        while (heap.get(current) > heap.get(parentIndex) && current != 0){
            swap(current, parentIndex);
            current = parentIndex;
        }
    }
}






