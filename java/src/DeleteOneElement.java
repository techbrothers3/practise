import java.util.Arrays;

public class DeleteOneElement {

        public static int solve(int[] A) {
            int []pre = new int[A.length];
            int []post = new int[A.length];
            pre[0] = A[0];
            post[A.length-1] = A[A.length-1];
            int preGcd = A[0];
            int posGcd = A[A.length-1];
            for (int i = 1; i< A.length; i++) {
                pre[i] = gcd(preGcd,A[i]);
                preGcd = pre[i];
            }
            System.out.println(Arrays.toString(pre));
            for (int i = A.length-2; i >= 0; i--) {
                post[i] = gcd(posGcd, A[i]);
                posGcd = post[i];
            }
            int []ans = new int[A.length];
            for (int i = 0; i<A.length; i++) {
                if (i != 0 && i < A.length-1) {
                    ans[i] = gcd(pre[i-1],post[i+1]);
                } else if (i == 0 && i < A.length-1) {
                    ans[i] = gcd(pre[i],post[i+1]);
                } else if (i == A.length-1) {
                    ans[i] = gcd(post[i],pre[i-1]);
                }
            }
            int max = 0;
            for (int i = 0; i< ans.length; i++) {
                if (ans[i] > max) {
                    max = ans[i];
                }
            }
            return max;
        }
        private static int gcd(int a, int b) {
            if (a < b) return gcd(b,a);
            if (b == 0) return a;
            else return gcd(a%b,b);
        }

    public static void main(String[] args) {
        int []A = {12,15,18,24};
        System.out.println(solve(A));
    }
}

