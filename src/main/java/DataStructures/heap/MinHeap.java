package DataStructures.heap;

public class MinHeap<T extends Comparable<? super T>> {

    private T[] heap;
    private int size;
    private static final int CAPACITY = 30;

    public MinHeap(int size) {
        this.size = size;
        this.heap = (T[])new Comparable[CAPACITY];
    }

    void insert(T t) {
        heap[++size] = t;
        bubbleUp();
    }

    void bubbleUp() {
        int index = this.size;
        while(isParentPresent(index) && parent(index).compareTo(heap[index]) > 0) {
            swap(parentIndex(index), index);
            index = parentIndex(index);
        }
    }

    private boolean isParentPresent(int index) {
        return parentIndex(index) >= 0;
    }

    private void bubbleDown() {
        int index = 1;

        while(isLeftChildPresent(index)) {
            if(leftChild(index).compareTo(rightChild(index)) < 0
                && heap[index].compareTo(leftChild(index)) > 0) {
                swap(index, leftChildIndex(index));
                index = leftChildIndex(index);
            } else if(rightChild(index).compareTo(leftChild(index)) < 0
                    && heap[index].compareTo(rightChild(index)) > 0) {
                swap(index, rightChildIndex(index));
                index = rightChildIndex(index);
            }
        }
    }

    private boolean isLeftChildPresent(int index) {
        return leftChildIndex(index) <= this.size;
    }

    private T parent(int index) {
        return heap[parentIndex(index)];
    }

    private int parentIndex(int index) {
        return index / 2;
    }

    private T leftChild(int index) {
        return heap[leftChildIndex(index)];
    }

    private int leftChildIndex(int index) {
        return index * 2;
    }

    private T rightChild(int index) {
        return heap[rightChildIndex(index)];
    }

    private int rightChildIndex(int index) {
        return (index * 2) + 1;
    }



    private void swap(int first, int second) {
        T temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    public Comparable<?> remove() {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public Comparable<?> peak() {
        return null;
    }
}
