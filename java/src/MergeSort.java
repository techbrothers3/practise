import java.util.*;

public class MergeSort {
    static int count;
    public static int solve(int arr[]){
        count = 0;
         mergeSort(arr);
        return count;
    }

    private static int[] mergeSort(int[] A) {
        int n = A.length;
        if(n == 1) return A;
        else {
            int mid = (n-1)/2;
            int left[] = new int[mid+1];
            for (int i = 0; i<mid+1; i++ ) {

                left[i] = A[i];
            }
            int m = n-(mid+1);
            int right [] = new int[m];
            for(int i = mid+1; i < n; i++) {
                right[i-(mid+1)] = A[i];
            }
             left=mergeSort(left);
             right =mergeSort(right);
            int ans [] = merge(left,right);
            return ans;
        }
//        return A;
    }
    private static int[] merge(int l [],int r[]) {
        int []arr = new int[l.length+r.length];
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        while (p1 != l.length && p2 != r.length) {
            if(l[p1] < r[p2]) {
                arr[i] = l[p1];


                p1++;
                i++;


            } else if (r[p2] < l[p1]){
                count += l.length-p1;
                arr[i] = r[p2];
                i++;
                p2++;
            } else {
                arr[i] = r[p2];
                i++;
                p2++;
            }
        }
        while (p1 != l.length) {
            arr[i] = l[p1];
            i++;
            p1++;

        }
        while (p2 != r.length) {
            arr[i] = r[p2];
            p2++;
            i++;
        }
        return arr;
    }
    public static void main(String[] args) {

      int arr[] = { 2, 4, 1, 3, 5};
        System.out.println(solve(arr));

    }
}
