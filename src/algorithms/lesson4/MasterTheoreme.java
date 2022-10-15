package algorithms.lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MasterTheoreme {
    static int staticCounter = 0;
    static final int ONE_MILLION = 1_000_000;

    public static void main(String[] args) {
        int x = 4;
        System.out.println(Math.pow(2, x));

    }


    //O(1)
    static void simpliest(int[] nums) {
        System.out.println(nums[nums.length - 1]);
    }

    //O(logN)
    public static int binarySearch (int arr[], int x) { // {1, 2, 3, 4, 5 .. n}
        int counter = 0;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r){
            int m = l + (r - l) / 2;
            if(arr[m] == x) {
                return counter;
            }
            if (arr[m] < x) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
            counter++;
        }
        return counter;
    }

    //O(N)
    static int simpleSearch(int[] nums, int x) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++) {
            counter++;
            if (nums[i] == x) {
                return counter;
            }
        }
        return counter;
    }

    //  O (n log n) = n * log n
    static void testhMethod(int[][] nums, int x) {
        for (int i = 0; i < nums.length; i++) { // n
            BinarySearch binarySearch = new BinarySearch();
            binarySearch.binarySearch(nums[i], x); // log n
        }
    }

    //O(N^2)
    static void examplePowN(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i = 0; i< nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                temp[i] = nums[i] * nums[j];
            }
        }
    }

    // O (n!)
    static void method5(int n) { // 5
        for (int i = 0; i < n; i++) { // 5 * 4 * 3 * 2 * 1
            System.out.println(n); // const
            method5(n - 1); // 2
        }
    }
}
