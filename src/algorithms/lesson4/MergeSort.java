package algorithms.lesson4;

public class MergeSort {
    // Driver code
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};

        System.out.println("Given Array");
        printArray(arr);
        sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int r) { // {11, 12, 13, 5, 6}

        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1]; // {0, 0, 0}
        int R[] = new int[n2]; // {0, 0}

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) // L = {11, 12, 13}
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)  // R = {5, 6}
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0; // i for L, j for R

        // Initial index of merged subarray array
        int k = l; // k for arr
        // n1 = L.length  n2 = R.length()

        // arr = {5, 6, 13, 5, 6}
        // L = {11, 12, 13}
        // R = {5, 6}
        while (i < L.length && j < R.length) { //  i = 0 j = 2  k = 2
            if (L[i] <= R[j]) { //  11   6
                arr[k] = L[i]; //
                i++; // 1
            }
            else {
                arr[k] = R[j]; //
                j++; // 4
            }
            k++; // 5
        }

        /* Copy remaining elements of L[] if any */
        // arr = {5, 6, 11, 12, 13}
        // L = {11, 12, 13}
        while (i < L.length) { // i = 3  k = 5
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        // arr = {5, 6, 11, 12, 13}
        while (j < R.length) { // j = 2 k = 5 // R = {5, 6}
            arr[k] = R[j]; //
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r) { //
        if (l < r) { //
            // Find the middle point
            int m = l + (r - l)/2; //

            // Sort first and second halves
            sort(arr, l, m); //
            sort(arr, m + 1, r); //

            // Merge the sorted halves
            merge(arr, l, m, r); //
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
