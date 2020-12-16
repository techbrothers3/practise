import java.util.*;

public class SortArrUsingStacl {
    static int[] solve(int [] A) {
      Stack<Integer> s = new Stack<>();
      for (int i = 0; i<A.length; i++) {
          sort(s,A[i]);
      }
      int []arr = new int[s.size()];
      int i = A.length-1;
      while (s.size() > 0) {
          arr[i] = s.pop();
          i--;
      }
      return arr;

    }

    private static void sort(Stack<Integer> s, int i) {
        if (s.isEmpty()) {
            s.push(i);
            return;
        } else if (s.peek() > i) {
            int top = s.pop();
            sort(s, i);
            s.push(top);
        } else s.push(i);
        return;
    }

    public static void main(String[] args) {
        int []arr = {5,11,17,100};
        System.out.println(Arrays.toString(solve(arr)));
    }
}
