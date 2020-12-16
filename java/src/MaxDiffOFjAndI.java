import java.util.Arrays;
import java.util.HashMap;

public class MaxDiffOFjAndI {
    private static int solve(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length;i++) {
            map.put(arr[i],i);
        }
        Arrays.sort(arr);
        int minInd = arr.length;
        int ans = 0;
        for(int i = 0; i<arr.length; i++) {
            if (minInd > map.get(arr[i])) {
                minInd = map.get(arr[i]);
            }
            ans = Math.max(ans,(map.get(arr[i])-(minInd)));
        }
        return ans;


    }
    public static void main(String[] args) {
        int arr[]={1,5,7,2,8};
        System.out.println(solve(arr));
    }
}
