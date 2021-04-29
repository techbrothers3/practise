public class Sixlets {
    static int ans;
    static int k;
    static int len;
    static int max = 1000;
    static int solve(int [] A, int B) {
        ans = 0;
        k = B;
        len = A.length;
        findSubsequences(A,0,0,0);
        return ans;
    }
    static void findSubsequences(int [] A, int sum, int sCount, int ind) {
        if (sCount == k && sum <= max) {
            ans++;
            return;
        }
        else if (ind >= len) {
            return;
        }
        // Take the number;
        sum += A[ind];
        sCount++;
        findSubsequences(A,sum,sCount,ind+1);
        sCount--;
        sum -= A[ind];

        //Dont take the number;
        findSubsequences(A,sum,sCount,ind+1);


    }
    public static void main(String[] args) {
        int []A = {1,2,8};
        int B = 2;
        System.out.println(solve(A,B));
    }
}
