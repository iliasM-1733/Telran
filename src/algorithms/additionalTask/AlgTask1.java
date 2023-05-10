package algorithms.additionalTask;

/** дан двумерный массив, каждый ряд которого и каждый столбец которого отсортированы по возрастанию
 *  1   4  7 11 15 16
 *  2   5  6 12 19 22
 *  3   6  9 16 22 24
 *  10 13 14 17 24 27
 *  18 21 23 26 30 36
 *
 *  в этом массиве необходимо определить входит ли число k в этот массив
 *  Массив  может содержать повторяющиеся числа, но не содержит более 1 числа k.
 *  Худший случай - перебор массива O (n^2)
 *
 */

public class AlgTask1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15, 16},
                        {2, 5, 6, 12, 19, 22},
                        {3, 6, 9, 16, 22, 24},
                        {10, 13, 14, 17, 24, 27},
                        {18, 21, 23, 26, 30, 36}};

        search(matrix, 14);

    }


    // O (n^2)
    public static boolean search(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == k) {
                    return true; // Нашли число k,
                }
            }
        }

        return false; // Число k не найдено
    }


    // O(m * log n)
    public static boolean searchBinary(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int l = 0, r = n-1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if(matrix[i][mid] == k) {
                    return  true;
                }
                if (matrix[i][mid] > k) {
                    r = mid- 1;
                } else {
                    l = mid+1;
                }
            }
        }
        return false; // Число k не найдено
    }

    // O (m + n)
    public static boolean searchTwiceBinary(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n - 1;

        while (i < m && j >= 0) {
            if(matrix[i][j] == k) {
                return  true;
            }
            if (matrix[i][j] > k) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
