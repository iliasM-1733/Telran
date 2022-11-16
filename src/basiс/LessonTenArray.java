package basiс;

public class LessonTenArray {

    public static void main(String[] args) {

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
        printArray(nums);
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

        char[] chars2 = "hello".toCharArray();
        printArray(chars2);
        System.out.println(chars2[1]);
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
}
