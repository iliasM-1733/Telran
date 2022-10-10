package algorithms.lesson4;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[1_000_000];
        for(int i = 0; i < 1_000_000; i++){
            arr[i] = i;
        }

        System.out.println(binarySearch(arr, -234_238));


//        long ssStart = System.nanoTime();
//        simpleSearch(arr, 299_999);
//        long ssFinish = System.nanoTime() - ssStart;
        //System.out.println(result);


//        System.out.printf("time for binary search is %d,\ntime for simple search is %d", bsFinish, ssFinish);



    }

    public static int binarySearch (int arr[], int x) { // x = 500
        int counter = 0;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r){ // { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
            counter++;
            int m = l + (r - l) / 2;  // 9 + (9 - 9) / 2 = 9
            if(arr[m] == x) {

                return counter;
            }
            if (arr[m] < x) {
                l = m + 1; // l = 9
            }
            else {
                r = m - 1;
            }
        }
        System.out.println(counter);
        return counter;
    }


    static int simpleSearch(int[] nums, int x) {
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
