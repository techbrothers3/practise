import java.util.Arrays;

public class BubbleSort {
    private static int [] solve(int arr[]) {
        for(int i = 0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
    int arr[] = {1,23,4,6,2,7,78};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
