package U6_Heaps.MinHeap_Insert;

import java.util.ArrayList;
import java.util.List;

//<> Heap: MinHeap Insert
//        The insert method should add a new integer value to the heap while maintaining the min heap property.
//        In other words, after insertion, each parent node (including the newly inserted element) should be less than or equal to its child nodes.
//        The insert method should work as follows:
//        Add the new value to the end of the heap (the next available position in the complete binary tree).
//        Compare the inserted element with its parent. If the inserted element is less than its parent, then swap the element with its parent.
//        Continue this process until the min heap property is restored (i.e., the parent is less than its children).
//        Utilize the parent and swap helper methods in your implementation.

public class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
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
    public void insert(int value) {
        if (heap.isEmpty()){
            heap.add(value);
            return;
        }
        heap.add(value);
        int index = heap.size() - 1;

        while (true) {
            int parentIndex = parent(index);
            if (heap.get(index) < heap.get(parentIndex)){
                swap(index, parentIndex);
                 index = parentIndex;
            }else {
                break;
            }


        }

    }


}
