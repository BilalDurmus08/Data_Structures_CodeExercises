package U6_Heaps.MinHeap_Remove;
import java.util.ArrayList;
import java.util.List;
//<> Heap: MinHeap Remove
//
//You are to implement the remove method which is responsible for
//        removing the root element (the minimum element in the case of a min heap) from the heap and maintaining the heap property.
//        In other words, after removal, the heap should still hold the min heap property for all elements.
//        The remove method should perform the following steps:
//        If the heap is empty, it should return null.
//        If the heap only has one element, it should remove and return this element.
//        In the case of a heap with more than one element,
//        it should move the last element to the index of 0 then "sink down" the new root element until it is smaller than or equal to its children.
//        Make use of the swap and sinkDown methods in your implementation.
//        Consider edge cases such as when the heap is empty or has only one element when implementing this method.
//        After you implement the remove method, the Heap class should provide a full implementation of a min heap data structure.
//        Validate your solution by inserting several elements, removing them, and verifying the min heap property is preserved.


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

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        while (current > 0 && heap.get(current) < heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private void sinkDown(int index) {
        int minIndex = index;
        while (true) {
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            if (leftIndex < heap.size() && heap.get(leftIndex) < heap.get(minIndex)) {
                minIndex = leftIndex;
            }

            if (rightIndex < heap.size() && heap.get(rightIndex) < heap.get(minIndex)) {
                minIndex = rightIndex;
            }

            if (minIndex != index) {
                swap(index, minIndex);
                index = minIndex;
            } else {
                return;
            }
        }
    }

    // WRITE THE REMOVE METHOD HERE //
    public Integer remove(){
        if (heap.isEmpty()){
            return null;
        }
        if (heap.get(1) == null){
            int temp = heap.get(0);
            heap.set(0, null);
            return temp;
        }
        int lastIndex = heap.size() - 1;
        swap(0,lastIndex);
        int temp = heap.get(lastIndex);
        heap.remove(heap.get(lastIndex));
        sinkDown(0);
        return temp;

    }




}
















