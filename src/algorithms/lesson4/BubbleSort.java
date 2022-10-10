package algorithms.lesson4;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {85, 2, 5, 9898, -895,- 5, 0, 15};
        bubbleSort(nums);
    }


    static int[] bubbleSort(int[] nums) {
        if(nums.length <= 1) {
            return nums;
        }

        while (!isSorted(nums)) { // O(n * n) = O(n^2)
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] > nums[i]) { // {3, 2}
                    int temp = nums[i - 1];  // temp = 3
                    nums[i - 1] = nums[i]; // {2, 2}
                    nums[i] = temp; // {2, 3}
                }
            }
        }
        return nums;
    }

    static boolean isSorted(int[] nums) { // O(n)
        if(nums.length <= 1) {
            return true;
        }
        for(int i = 1; i < nums.length; i++) { //{1, 3, 5, 4}
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }
}
