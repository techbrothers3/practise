import java.util.HashMap;

public class longSubarrWithSumEqK {
    private static int solve(int[] arr,int k) {
        int ans = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
            if (sum == k) ans = i+1;
            if (!map.containsKey(sum)) {
                map.put(sum,i);
            }
            if (map.containsKey(sum-k)) {
                ans = Math.max(ans,(i-map.get(sum-k)));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-5, 8, -14, 2, 4, 12};
        int k = -5;
        System.out.println(solve(arr,k));
    }
}
