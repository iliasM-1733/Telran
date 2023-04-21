package algorithms.additionalTask;


//Задача о рюкзаке (Knapsack problem) - дано n предметов, каждый из которых имеет вес w[i] и стоимость c[i], а также
// рюкзак с максимальной вместимостью W. Необходимо выбрать некоторые из этих предметов так, чтобы их суммарный вес не
// превышал W, а суммарная стоимость была максимальной.

public class Knapsack {

    public static void main(String[] args) {
        int[] values = {10, 15, 20, 7, 9, 13, 8, 5, 2, 6};
        int[] weights = {1, 3, 2, 4, 5, 1, 3, 2, 4, 2};
        int capacity = 5;
        int maxVal = knapsack(weights, values, capacity);
        System.out.println("Максимальная стоимость, которую можно унести в рюкзаке: " + maxVal);
    }


    // Метод для решения задачи о рюкзаке
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length; // количество предметов
        int[][] dp = new int[n + 1][capacity + 1]; // двумерный массив для хранения оптимальных решений

        // заполнение массива dp
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], values[i - 1] + dp[i - 1][j - weights[i - 1]]);
                }
            }
        }

        return dp[n][capacity]; // возвращаем максимальную стоимость предметов, которые можно уложить в рюкзак
    }
}

