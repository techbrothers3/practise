import java.util.*;

public class RotateArray {
    private static int [] solve(int [] a, int d) {
        int i = d - 1;
        Stack<Integer> bucket = new Stack<>();
        for (; i >= 0; i--) {

            bucket.push(a[i]);
        }

        i = d;
        int j = 0;
        int[] output1 = new int[a.length];
        for (; i < a.length; i++, j++) {
            output1[j] = a[i];

        }
        while (bucket.size() != 0) {
            output1[j] = bucket.pop();
            j++;
        }
        // System.out.println(Arrays.toString(output1));
        return output1;
    }
    public static void main (String args[]) {
        int []arr = {1,2,3,4,5};
        int d = 2;
        System.out.println(Arrays.toString(solve(arr,d)));

    }
}
