package algorithms.additionalTask;

/**
 * дано двумерное поле координаты 1...n и 1...m, в точке 1,1 находиться робот, который может ходить лишь вверх и вправо,
 * помимо этого дана дверь с координатами (n, m). Найдите количество путей, которыми может двигаться робот.
 *
 *      __ __ __
 *  3  |  | x |🚪|
 *     -- -- -----
 *  2  |  | y | x |
 *     ----------
 *  1  |🤖|  |  |
 *     __ __ __
 *     1  2  3
 */

public class DynamicProgramming {

    public static void main(String[] args) {

        long startDyn = System.nanoTime();

        long finishDyn = System.nanoTime() - startDyn;

        long start = System.nanoTime();
        long finish = System.nanoTime() - start;

        System.out.println("non dynamic time " + finish + " ns");
        System.out.println(paths(5, 5));
        System.out.println("dynamic time " + finishDyn + " ns");

        

        // O(2 ^ (n + m))
    }

    // O(2 ^ (n + m)) -> (100, 100) -> 2^200
    static int paths(int n, int m) {
        // база рекурсии, тк робот не может двигаться влево и вниз
        if(n < 1 || m < 1) {
            return 0;
        }

        //дверь находится в изначальной точке
        if (n == 1 && m == 1) {
            return 1;
        }

        return paths(n-1, m) + paths(n, m - 1);
    }

    //
    static int dynamicPaths(int n, int m) {
        return helper(n, m, new int[n+1][m+1]); // int[n+1][m+1] - потому что начальная точка не 0,0, а 1,1
    }


    // O (n ^ 2)
    static int helper(int n, int m, int[][] arr) {
        // база рекурсии, тк робот не может двигаться влево и вниз
        if(n < 1 || m < 1) {
            return 0;
        }

        //робот находится в изначальной точке
        if (n == 1 && m == 1) {
            return 1;
        }
        if(arr[n][m] != 0) {
            return arr[n][m];
        }
        arr[n][m] = helper(n-1, m, arr) + helper(n, m-1, arr);
        return arr[n][m];
    }
}
