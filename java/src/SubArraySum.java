import java.util.Arrays;

public class SubArraySum {
    private static int[] solve(int []arr,int B) {
        int sum = 0;
        int i = 0;
        int j = 0;
        sum += arr[0];
        while(j < arr.length && i <= j) {
            if (sum < B) {
                j++;
                sum += arr[j];
            } else if (sum > B) {
                sum -= arr[i];
                i++;
            } else if (sum == B){
                int k = 0;
                int[] ans = new int[j-i+1];
                for (int l = i; l<= ans.length; l++ ) {
                    ans[k] = arr[l];
                    k++;
                }
                return ans;
            }
        }

        int[] arr1 = {-1};
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 100, 105};
        int B = 110;
        System.out.println(Arrays.toString(solve(arr,B)));
    }
}
