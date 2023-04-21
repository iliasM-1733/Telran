package algorithms.lesson4;

public class BinarySearch {
    public static void main(String[] args) {

        // sort - n * log n
        // search - log m
        // O(sort) + O(search) = n * log n + log m

         // log2 1_000_000 ±= 19-20
        int arr[] = new int[1_000_000];
        for(int i = 0; i < 1_000_000; i++){
            arr[i] = i;
        }

        System.out.println(binarySearch(arr, -20_000));


        long ssStart = System.nanoTime();
        simpleSearch(arr, -299_999);
        long ssFinish = System.nanoTime() - ssStart;
        System.out.println(ssFinish);


//        System.out.printf("time for binary search is %d,\ntime for simple search is %d", bsFinish, ssFinish);



    }

    public static int binarySearch (int arr[], int x) { // x = 11
        int counter = 0;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r){ // { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 15} // l = 10, r = 10, m = 10
            counter++;
            int m = l + (r - l) / 2;  // 9 + ((9 - 9) / 2)= 9   m = 9
            if(arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1; // l = 10
            }
            else {
                r = m - 1; // r = 9 l = 10
            }
        }
        return -1;
    }



    // binarySearch (int arr[], int x, int start, int end)  start = 0   end = 9
    // binarySearch (int arr[], int x, int start, int end)  start = 5   end = 9
    // binarySearch (int arr[], int x, int start, int end)  start = 5   end = 7
    // binarySearch (int arr[], int x, int start, int end)  start = 7   end = 7



    // худший случай - O(n), лучший случай  - O(1), усредненный случай - O(n/2)
    static int simpleSearch(int[] nums, int x) {
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
