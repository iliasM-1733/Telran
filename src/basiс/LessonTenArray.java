package basiс;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LessonTenArray {
    public static void main(String[] args) {
        tryArraysClass();

    }

    private static void tryRandomClass() {
        Random random = new Random();

        int[] nums = new int[2];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000);
        }
        printArray(nums);
    }


    private static void tryArraysClass() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {1, 2, 3, 4};
        int[] nums4 = {-3, 2, 3};


        System.out.println(nums1);
        System.out.println(nums2);


        System.out.println(nums1 == nums2); // false
        System.out.println(nums1.equals(nums2)); // false
        System.out.println(Arrays.equals(nums1, nums2)); // true

        System.out.println(Arrays.toString(nums1));

        System.out.println(Arrays.compare(nums1, nums2));
        System.out.println(Arrays.compare(nums1, nums4));
        System.out.println(Arrays.compare(nums1, nums3)); // {1, 2, 3} {1, 2, 3, 4}
        System.out.println(Arrays.compare(nums4, nums1));

        int[] nums5 = {45, 20, 303, -23, 456, 12, 0};
        Arrays.sort(nums5);
        System.out.println(Arrays.toString(nums5));

        int[]  nums6 = Arrays.copyOf(nums5, 3);
        System.out.println(Arrays.toString(nums6));

        int[]  nums7 = Arrays.copyOfRange(nums5, 3, 6);
        System.out.println(Arrays.toString(nums7));



    }

    private static void basicInitializingIntArray() {
        int[] nums = new int[10];
        printArray(nums);

        nums[0] = 10;
        printArray(nums);

        try {
            nums[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        nums[9] = 100;
        nums[0] = 1;
        printArray(nums);

        int x = nums[9];
        System.out.println(nums[9] * nums[9]);


    }

    private static void initializingAndFillIntArray() {
        int[] nums = {1, 2, 3, 4};
        printArray(nums);
        nums[2] = 30;
        printArray(nums);
    }

    private static void initializingStringArray(){
        String[] strings = new String[3];
        strings[0] = "hello ";
        strings[1] = "dear ";
        strings[2] = "friends!";
        printArray(strings);

        String[] strings1 = "hello dear friends!".split(" ");
        printArray(strings1);
    }

    private static void initializingCharArray() {
        char[] chars = new char[5];
        chars[0] = 'h';
        chars[1] = 'e';
        chars[2] = 'l';
        chars[3] = 'l';
        chars[4] = 'o';
        printArray(chars);

        char[] chars1 = {104, 101, 108, 108, 111};
        printArray(chars1);

        char[] chars2 = "hello my friends".toCharArray();
        printArray(chars2);
        System.out.println(chars2[chars2.length - 1]);
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printArray(char[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printArray(boolean[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
