public class sortedArray {
    private static boolean solve(int[] arr, int x) {
        long open = System.currentTimeMillis();

        int start = 0;

        int end = arr.length-1;

        while (start <= end) {

           int mid = (start + end) / 2;

           if (arr[mid] == x) return true;

            else if (arr[mid] < x) {

               start = mid + 1;

           } else {

               end = mid - 1;


           }

        }
        long close = System.currentTimeMillis();

        System.out.println("time taken: " + (close - open));

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,9,15,20,100,111};
        int x = 1;
        System.out.println((solve(arr,x)));
    }
}
