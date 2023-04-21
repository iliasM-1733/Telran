package algorithms.lesson4;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array1 = { 12, 6, -45, 56, 2};
        quickSort(array1, 0, array1.length - 1); // ({ 12, 6, -45, 56, 2}, 0, 4)

        System.out.println(Arrays.toString(array1));
    }

    public static void quickSort(int[] array, int left, int right)  {
        if (left < right) {                                     //
            int pivotIndex = partition(array, left, right); // {-45, 2, 6, 12, 56}
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    //n * n
    private static int partition(int[] array, int left, int right) { // ({ 12, 6, -45, 56, 2}, 0, 4)
        int pivot = array[right];  // choose the rightmost element as the pivot //  pivot = 888
        int partitionIndex = left; // the first element greater than the pivot  // 0

        /* move large values into the right side of the array */
        for (int i = left; i < right; i++) { // from 0 to 4
            if (array[i] <= pivot) { // may be used '<' as well   // 2 12
                swap(array, i, partitionIndex); //
                partitionIndex++;
            }
        }
        swap(array, partitionIndex, right); // put the pivot on a suitable position

        return partitionIndex;
    }

    private static void swap(int[] array, int i, int j) { // ({ 12, 6, -45, 56, 2}, 2, 0)
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
