package algorithms.additionalTask;

import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {

        int[] nums = {3, 7, -12, 0, 6, 0, 33, 5, -2};

        System.out.println(Arrays.toString(maxSumSubArray(nums)));

    }

    public static int[] maxSumSubArray(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE; // максимальная сумма элементов подмассива
        int windowSum = 0; // текущая сумма элементов подмассива
        int windowStart = 0; // начало текущего подмассива
        int windowEnd = 0; // конец текущего подмассива
        int[] result = new int[0]; // инициализация результирующего подмассива

        // проход по массиву
        while (windowEnd < n) {
            windowSum += arr[windowEnd]; // добавление очередного элемента в текущий подмассив

            // если текущая сумма элементов подмассива превышает максимальную сумму,
            // то обновляем максимальную сумму и результирующий подмассив
            if (windowSum > maxSum) {
                maxSum = windowSum;
                result = Arrays.copyOfRange(arr, windowStart, windowEnd + 1);
            }

            // если текущая сумма элементов подмассива отрицательна,
            // то сдвигаем окно на один элемент вправо и сбрасываем сумму в 0
            if (windowSum < 0) {
                windowSum = 0;
                windowStart = windowEnd + 1;
            }

            windowEnd++; // сдвигаем правый конец текущего подмассива на один элемент вправо
        }

        return result; // возвращаем результирующий подмассив с максимальной суммой элементов
    }


}
