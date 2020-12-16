import java.util.Deque;
import java.util.LinkedList;

public class SumOfMinMax {
    static int solve(int [] A, int B) {
// brute force order of n sq;
//        if(B > A.length) return -1;
//        long mod = 1000000007;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        int totalSum = 0;
//        for (int i = 0; i<= A.length-B; i++) {
//            min = Integer.MAX_VALUE;
//            max = Integer.MIN_VALUE;
//            for (int j = i; j<i+B; j++) {
//                min = Math.min(min,A[j]);
//                max = Math.max(max,A[j]);
//            }
//            min += max;
//            totalSum += min;
//        }
//        return totalSum % (int) mod;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i<B; i++) {
//            min = Math.min(min,A[i]);
//            max = Math.max(max,A[i]);
//        }
//        int totalSum = 0;
//        totalSum += min;
//        totalSum += max;
//        for(int i = B; i<A.length; i++) {
//            if (A[i] < min) min = A[i];
//            if (A[i] > max) max = A[i];
//            totalSum += min;
//            totalSum += max;
//        }
//        return totalSum;
        int totalSum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Deque<Integer> deq = new LinkedList<>();
        int st = 0;

        for (int i = 0; i<B; i++) {
            if(i == 0) {
                deq.add(i);
            } else {
                int k = deq.peekLast();
                while( k > 0 && A[k] < A[i] ) {
                    deq.removeLast();
                    k = deq.peekLast();

                }
                deq.add(i);
            }
        }
        return deq.peekLast();
    }
    public static void main(String[] args) {
        int []A = {10,1,2,9,7,6,5,11,3};
        int B = 4;
        System.out.println(solve(A,B));
    }
}
