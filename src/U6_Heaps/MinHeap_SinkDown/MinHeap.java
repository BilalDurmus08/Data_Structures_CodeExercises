package U6_Heaps.MinHeap_SinkDown;

//<> Heap: MinHeap Sink Down
//        The sinkDown(int index) method should take an integer index as a parameter and restore
//        the min heap property when it is violated by the node at the input index.
//        This can happen when a node's value becomes less than one or both of its children's values, often after a removal operation in a heap.
//        The sinkDown(int index) method should perform as follows:
//        Calculate the indices of the left and right children of the node at the input index using
//        the leftChild(int index) and rightChild(int index) methods.
//        Identify the minimum value among the node and its children.
//        If the minimum value is not at the input index, swap the node at the input index with the node containing the minimum value.
//        Continue this process for the swapped child node until the node is either a leaf node or its value is less than both its children.
//        Your implementation should ensure that after calling the sinkDown(int index) method,
//        the min heap property holds, i.e., the value of each node is less than or
//        equal to the values of its children. Remember to use the provided helper methods to assist in your implementation.


import java.util.ArrayList;
import java.util.List;

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

    // WRITE THE SINKDOWN METHOD HERE //
    public void sinkDown(int index){
        int minIndex = index;
        while (true){
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);


            if (leftIndex < heap.size() && heap.get(leftIndex) < heap.get(minIndex)){
                minIndex = leftIndex;

            }


        if (rightIndex < heap.size() && heap.get(rightIndex) < heap.get(minIndex)){
                minIndex = rightIndex;
            }

            if (minIndex != index){
                swap(minIndex, index);
                index = minIndex;
            }else {
                return;
            }




        }


    }




    public Integer remove() {
        if (heap.size() == 0) {
            return null;
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int minValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);

        return minValue;
    }

}















