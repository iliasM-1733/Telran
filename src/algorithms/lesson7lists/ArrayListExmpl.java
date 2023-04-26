package algorithms.lesson7lists;

public class ArrayListExmpl {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // {0, 2, 3} -> {2, 0, 3} -> {2, 3, 0} -> {2, 3}
        System.out.println("first link of nums: " + nums);
        int[] temp = new int[nums.length * 2];
        System.out.println("first link of temp: " + temp);
        for(int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }

        // temp = {1, 2, 3, 0, 0, 0}
        nums = increaseSize(nums);
        System.out.println("second link of nums: " + nums);
        int x = 5;
        int y = x;
        x = 6;
    }

    private static int[] increaseSize(int[] nums) {
        int[] temp = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        nums = temp;
        return nums;
    }



}
