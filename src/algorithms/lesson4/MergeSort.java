package algorithms.lesson4;

public class MergeSort {
    // Driver code
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7, 0, 3};

        System.out.println("Given Array");
        printArray(arr);
        sort(arr, 0, arr.length - 1); // ({12, 11, 13, 5, 6, 7, 0, 3}, 0, 7)

        System.out.println("\nSorted array");
        printArray(arr);
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int r) // ({ (11, 12, 5, 13), 6, 7, 0, 3 }, 0, 3, 7}
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1; // 1 - 0 + 1 = 2
        int n2 = r - m; // 3 - 1 = 2

        /* Create temp arrays */
        int L[] = new int[n1]; // [0, 0]
        int R[] = new int[n2]; // [0, 0]

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i]; // [11, 12]
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j]; // R[0] = arr[1 + 1 + 1] = [5, 13]

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l; //{ (11, 12, 5, 13), 6, 7, 0, 3 } k = 0  L[] = [11, 12]; R[] = [5, 13]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { // { (5, 11, 12, 13), 6, 7, 0, 3 } L[] = [11, 12]; R[] = [5, 13]
                arr[k] = L[i];
                i++; // 2
            }
            else {
                arr[k] = R[j]; // { (5, 12, 5, 13), 6, 7, 0, 3 } L[] = [11, 12]; R[] = [5, 13]
                j++; // 1
            }
            k++; // 3
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) { // i = 2
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) { // 1
            arr[k] = R[j]; // { (5, 11, 12, 13), 6, 7, 0, 3 } L[] = [11, 12]; R[] = [5, 13]
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r) { // ({12, 11, 13, 5, 6, 7, 0, 3}, 0, 7)
        if (l < r) { // l = r
            // Find the middle point
            int m = l + (r - l)/2; // 3

            // Sort first and second halves
            sort(arr, l, m); // ({ (12, 11, 13, 5), 6, 7, 0, 3 }, 0, 3}
                // ({ (12, 11), 13, 5, 6, 7, 0, 3 }, 0, 1}
                    // ({ (12), 11, 13, 5, 6, 7, 0, 3 }, 0, 0}
                    // ({ 12, (11), 13, 5, 6, 7, 0, 3 }, 1, 1}

                // ({ 12, 11, (13, 5), 6, 7, 0, 3 }, 2, 3}
                    // ({ 12, 11, (13), 5, 6, 7, 0, 3 }, 2, 2}
                    // ({ 12, 11, 13, (5), 6, 7, 0, 3 }, 3, 3}


            sort(arr, m + 1, r); // ({12, 11, 13, 5, (6, 7, 0, 3)}, 4, 7}

            // Merge the sorted halves
            merge(arr, l, m, r); // ({ 12, 11, 13, 5, 6, 7, 0, 3 }, 0, 0, 1}
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
