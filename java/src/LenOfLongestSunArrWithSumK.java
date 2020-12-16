import java.util.*;
public class LenOfLongestSunArrWithSumK {
    private static int solve(int[] A) {
        int ans = Integer.MIN_VALUE;
        int count = 1;
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i<A.length; i++) {
            s.add(A[i]);
        }
        for(int i = 0; i<A.length;) {
            if (s.contains((A[i]-1))) i++;
            else{
                int val = A[i];
                while(true) {
                    val++;
                    if (s.contains(val)) count++;
                    else break;
                }
                ans = Math.max(ans,count);
                count = 1;
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {2,1};
        System.out.println(solve(A));
    }
}
