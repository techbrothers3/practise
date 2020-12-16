import java.util.Arrays;

public class QuickSort {
    private static int[] solve(int[] arr,int i,int j) {
        sort(arr,i, j);
        return arr;

    }

    private static void sort(int[] arr, int i, int j) {
        if(i < j) {

            int pi = partition(arr,i,j);
            sort(arr,i,pi-1);
            sort(arr,pi+1,j);

        }
    }

    private static int partition(int[] arr, int i, int j) {
        int pivot = arr[j];
        int st = i-1;
        for(int k = i; k<j; k++) {
            if(arr[k] <= pivot) {
                st++;
                int temp = arr[k];
                arr[k] = arr[st];
                arr[st] = temp;

            }
        }
        int temp = arr[j];
        arr[j] = arr[st+1];
        arr[st+1] = temp;
        return st+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,6,4,3,4,2,1};
        int i = 0;
        int j = arr.length-1;
        System.out.println(Arrays.toString(solve(arr,i,j)));
    }
}
