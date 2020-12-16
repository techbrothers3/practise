import java.util.Arrays;

public class DutchNationalFlagAlgorithm {
    private static int [] solve(int[] arr) {
//        o(N) + o(n); brute force
//        int count0 = 0;
//        int count1 = 0;
//        int count2 = 0;
//        int ans[] = new int[arr.length];
//        for(int i = 0; i<arr.length; i++) {
//            if(arr[i] == 0) count0++;
//            else if (arr[i] == 1) count1++;
//            else count2++;
//        }
//        int i = 0;
//        while(i < arr.length) {
////            int i = 0;
//            while(i < count0) {
//                ans[i] = 0;
//                i++;
//            }
//            while(i < count0+count1) {
//                ans[i] = 1;
//                i++;
//            }
//            while(i<count0+count1+count2) {
//                ans[i] = 2;
//                i++;
//            }
//        }
//        return ans;
        int i = 0;
        int j = 0;
        int k = arr.length-1;
        while(j <= k) {
            if(arr[j] == 2) {
                swap(j,k,arr);
                k--;
            } else if (arr[j] == 0) {
                swap(j,i,arr);
                i++;
                j++;
            } else j++;
        }
        return arr;
    }
    private static void swap(int x,int y, int[] arr) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {   0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
