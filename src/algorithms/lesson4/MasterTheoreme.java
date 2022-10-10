package algorithms.lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MasterTheoreme {
    static int staticCounter = 0;
    static final int ONE_MILLION = 1_000_000;

    public static void main(String[] args) {
        int x = 4;
        System.out.println(myRecursion(x)); // { 1, 2, 3, 4, 5, 6, 7}
        System.out.println(Math.pow(2, x));

    }


    //O(1)
    static void simpliest(int[] nums) {
        System.out.println(nums[0]);
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

    //O(N^2)
    static void examplePowN(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i = 0; i< nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                temp[i] = nums[i] * nums[j];
            }
        }
    }

    //O(2^N)
    static int myRecursion(int n) { //3 return 8
        if (n <= 0) {
            return 1;
        } else {
            return myRecursion(n -1) + myRecursion(n - 1);
        }
    }

    // O(N + N + 100) = O (2N) = O(N)
    // при оценке сложности алгоритма константные величины сокращаются
    static void constant(int[] nums1) {
        for (int i = 0; i < nums1.length; i++) {
            nums1[i]= nums1[i] + nums1[i];
        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

        int[] temp = new int[100];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }

    }
}
