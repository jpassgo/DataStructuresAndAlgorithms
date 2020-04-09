package Algorithms.Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[] {232, 5, 23, 2, 1, 443, 52};

        for(int item : array) System.out.print(String.format("%s ", item));

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, array.length-1);

        System.out.println("");
        for(int item : array) System.out.print(String.format("%s ", item));
    }

    private void quickSort(int[] array, int start, int end) {
        if(start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot-1);
            quickSort(array, pivot + 1, end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for(int j = start; j <= end - 1; j++) {
            if(array[j] < pivot) {
                int temp = array[++i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[++i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
