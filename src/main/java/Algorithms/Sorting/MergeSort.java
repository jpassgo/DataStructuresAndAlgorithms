package Algorithms.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[] {232, 5, 23, 2, 1, 443, 52};

        for(int item : array) System.out.print(String.format("%s ", item));

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array, 0, array.length-1);

        System.out.println("");
        for(int item : array) System.out.print(String.format("%s ", item));
    }

    private void mergeSort(int[] array, int start, int end) {
        if(start < end) {
            int middle = start + (end - start) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle+1, end);
            merge(array, start, middle, end);
        }
    }

    private void merge(int[] array, int start, int middle, int end) {
        int length = end - start + 1;
        int[] temp = new int[length];

        int i = start, j = middle + 1, k = 0;
        while(i <= middle && j <= end) {
            if(array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while(i <= middle) {
            temp[k++] = array[i++];
        }
        while(j <= end) {
            temp[k++] = array[j++];
        }
        System.arraycopy(temp, 0, array, start, length);
    }
}
