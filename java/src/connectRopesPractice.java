//public class connectRopesPractice {
//    static int ans;
//    private static int solve(int []arr) {
//        int n = arr.length;
//        int [] heap = new int [n];
//        for (int i = n-1; i>= 0; i--) {
//            heap[i] = arr[i];
//            downHeap(i,heap,n);
//        }
//        while(n > 1) {
//            int sum = heap[0];
//            swap(arr,0,n-1);
//            n--;
//            downHeap(0,heap,n-1);
//            sum += heap[0];
//            ans += sum;
//            n++;
//            heap[n-1] = sum;
//            upHeap(heap,n-1);
//
//        }
//    }
//
//    private static void downHeap(int i, int[] arr, int n) {
//        int left = 2*i+1;
//        int right = 2*i+2;
//        if (inRange(left,n) && arr[left] < arr[i] && inRange(right,n) && arr[right] < arr[i]) {
//            if (arr[left] < arr[right]) {
//                swap(arr,left,i);
//                downHeap(left,arr,n);
//            }
//            else {
//                swap(arr,right,i);
//                downHeap(right,arr,n);
//            }
//        } else if (inRange(left,n) && arr[left] < arr[i]) {
//            swap(arr,left,i);
//            downHeap(left,arr, n);
//        } else {
//            swap(arr,right,i);
//            downHeap(right,arr,n);
//        }
//    }
//
//    private static void swap(int[] arr, int j, int i) {
//        int greaterNum = arr[i];
//        arr[i] = arr[j];
//        arr[j] = greaterNum;
//    }
//
//    private static boolean inRange(int ind, int n) {
//        if (ind >= n) return false;
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int []arr = {5,17,100,11};
//        System.out.println(solve(arr));
//    }
//}
