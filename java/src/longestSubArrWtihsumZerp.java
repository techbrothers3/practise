import java.util.HashMap;

public class longestSubArrWtihsumZerp {
    private static int solve(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 && ans == 0) {
                ans = 1;
            }
            if (sum == 0 && ans < i) {
                ans = i+1;
            }

            if (map.containsKey(sum)) {
                int prev = map.get(sum);
                ans = Math.max(ans,(i-prev));
            } else map.put(sum,i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(solve(arr));
    }
}
