package algorithms.lesson4;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[300_000];
        for(int i = 0; i < 300_000; i++){
            arr[i] = i;
        }

        long bsStart = System.nanoTime();

        int result = binarySearch(arr, 299_999);

        long bsFinish = System.nanoTime() - bsStart;



        long ssStart = System.nanoTime();
        simpleSearch(arr, 9_999);
        long ssFinish = System.nanoTime() - ssStart;
        //System.out.println(result);


        System.out.printf("time for binary search is %d,\n time for dimple search is %d", bsFinish, ssFinish);



//        int x = 10;
//        int result = binarySearch(arr, 400);
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at "
//                    + "index " + result);
    }

    public static int binarySearch (int arr[], int x) { // x = 500
        int l = 0;
        int r = arr.length - 1;
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        while (l <= r){ // { (2, 3, 4,) 10, 4}
            int m = l + (r - l) / 2;  // (4 - 3) / 2 = 0
            if(arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return -1;
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
