package Algorithms.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

    }

    private void mergeSort(int[] array, int start, int end) {
        if(start < end) {
            int middle = (end+start)/2;
            mergeSort(array, start, middle);
            mergeSort(array, middle+1, end);
            merge(array, start, middle, end);
        }
    }

    private void merge(int[] array, int start, int middle, int end) {
        int[] left = Arrays.copyOfRange(array, start, middle);
        int[] right = Arrays.copyOfRange(array, middle + 1, end);

        int leftLength = left.length;
        int rightLength = right.length;

        int i = 0, j = 0, k = start;
        while(i < leftLength && j < rightLength) {
            if(left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

    }
}
