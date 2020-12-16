
import java.util.Arrays;

public class MaxArrSumOfBNegations {
    private static int solve(int[]arr,int B) {
        int sum = 0;
        Arrays.sort(arr);
        int i = 0;
        while(B > 0) {
            if (i == 0) {
                arr[i] *= -1;
                i++;
                B--;
            } else {
                if (arr[i-1] < arr[i]) {
                    if (B % 2 != 0) {
                        arr[i-1] *= -1;
                        break;
                    } else break;
                } else {
                    arr[i] *= -1;
                    i++;
                    B--;
                }
            }
        }
        for (int j = 0; j< arr.length; j++) {
            sum += arr[j];
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr= {24, -68, -29, -9, 84};
        int B = 4;
        System.out.println(solve(arr,B));
    }
}