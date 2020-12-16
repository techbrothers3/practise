import java.util.*;

public class NextSmallerElement {
    private static int[] solve(int[] A) {
        Stack<Integer> s = new Stack<>();
        int nextMin [] = new int[A.length];
        s.push(0);
        for (int i = 1; i<A.length; i++) {
            int k = s.peek();
            while (!s.isEmpty() && A[k] > A[i]) {
                s.pop();
                nextMin[k] = i;
                if (!s.isEmpty()) k = s.peek();
            }
            s.push(i);
        }
        while(s.size() > 0) {
            nextMin[s.pop()] = -1;
        }
        return nextMin;
    }
    public static void main(String[] args) {
        int[] A = {2,1,5,6,2,3};
        System.out.println(Arrays.toString(solve(A)));
    }
}
