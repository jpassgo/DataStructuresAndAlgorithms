package Algorithms.Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[] {232, 5, 23, 2, 1, 443, 52};

        for(int item : array) System.out.print(String.format("%s ", item));

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array);

        System.out.println("");
        for(int item : array) System.out.print(String.format("%s ", item));
    }

    private void insertionSort(int[] array) {
        int i = 1;
        while(i < array.length) {
            int j = i;
            while(j > 0 && array[j-1] > array[j]) {
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j = j - 1;
            }
            i = i + 1;
        }
    }
}
