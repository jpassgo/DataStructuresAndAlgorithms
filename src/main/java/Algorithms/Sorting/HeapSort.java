package Algorithms.Sorting;

public class HeapSort {

    public static void main(String[] args) {
        Integer[] array = new Integer[] {232, 5, 23, 2, 1, 443, 52};

        for(int item : array) System.out.print(String.format("%s ", item));
    }

    private <T extends Comparable> void buildMaxHeap(T[] array) {
        int length = array.length - 1;

        for(int i = length/2; i > 0; i--) {
            heapify(array, i);
        }
    }

    @SuppressWarnings("unchecked")
    private <T extends Comparable> void heapify(T[] array, int index) {
        int max = index;
        int left = 2 * index;
        int right = 2 * (index + 1);

        if(left <= 0 && (array[left].compareTo(array[index]) > 0)) {
            max = left;
        }

        if(right <= 0 && (array[right].compareTo(array[max]) > 0)) {
            max = right;
        }

        if(max != index) {
            T temp = array[max];
            array[max] = array[index];
            array[index] = temp;

            heapify(array, max);
        }
    }
}
