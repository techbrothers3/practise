import java.util.Arrays;

import java.util.*;

public class Insertionsort {
    private static int[] solve(int [] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        return arr;
    }


    public static void main(String[] args) {
        int arr[] = {100,2,3,1,6,7,3,5,9,0};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
