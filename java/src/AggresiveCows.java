
import java.util.*;
        import java.lang.*;
        import java.util.*;

 public class AggresiveCows
{
   private static int solve(int[] A, int B) {
        Arrays.sort(A);
        int n = A.length;
        int min =1;
        int max = A[n-1]-A[0];
        int cur = A[0];
        int count = 1;
        int ans = 0;
        while(min <= max) {
            count = 1;
            cur = A[0];
            int mid = (min + max)/2;
            for (int i = 1; i < n; i++) {
                if(A[i] - cur >= mid){
                    count++;
                    cur = A[i];
                }
            }
            if (count < B) max = mid-1;
            else{
                ans = mid;
                min = mid+1;
            }
        }
        return ans;
    }
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner s = new Scanner (System.in);
        int t = s.nextInt();


        while(t>0) {
            int len = s.nextInt();
            int B = s.nextInt();
            t--;
            int []A = new int [len];
            for (int i = 0; i<len; i++) {
                A[i] = s.nextInt();
            }
            System.out.println(solve(A,B));
        }
    }

//            2
//            5 3
//            1
//            2
//            8
//            4
//            9



}
