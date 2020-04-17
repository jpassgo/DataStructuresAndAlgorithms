package DataStructures.heap;

public class MinHeap<T extends Comparable<? super T>> {

    private T[] heap;
    private int size;

    void insert(T t) {

    }

    private int parent(int index) {
        return index / 2;
    }

    private int leftChild(int index) {
        return index * 2;
    }

    private int rightChild(int index) {
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
