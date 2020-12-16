import java.util.*;


public class PreSmallerElement {
    private static int[] solve(int[]A) {
        int [] A1 = new int [A.length];
        Stack<Integer> s = new Stack<>();
        s.push(A.length-1);
        for (int i = A.length-2; i>= 0; i--) {
            int k = s.peek();
            while(!s.isEmpty() && A[k] > A[i]) {
                s.pop();
                A1[k] = i;
                if (!s.isEmpty()) k = s.peek();
            }
            s.push(i);
        }
        while(s.size() > 0) {
            A1[s.pop()] = -1;
        }
        return A1;

    }
    public static void main(String[] args) {
        int [] A = {2,1,5,6,2,3};
        System.out.println(Arrays.toString(solve(A)));
    }
}
