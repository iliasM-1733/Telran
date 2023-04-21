package algorithms.lesson3;

import java.util.Random;
import java.util.Stack;

public class Recursion {
    static long counter = 0;

    public static void main(String[] args) {
        String str = "";
        recursion(12);

    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int recursion(long x) {
        System.out.println(counter++);
        Random random = new Random();
        String str = new String("hello " + random.nextInt());



        return recursion(x++);
    }

    static int recursionFactorial(int x){
        if (x == 1){
            return 1;
        }
        return x * recursionFactorial(x - 1);
    }

    static int iterationFactorial(int x){
        int result=1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;
        }
        return  result;
    }
}
