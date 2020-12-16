import java.util.*;
public class sortArrayIngivenOrder {
    private static int [] solve(int []A,int []B) {
        Arrays.sort(A);
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i<A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i],map.get(A[i])+1);
            } else map.put(A[i],1);
        }
        for (int i = 0; i<B.length; i++) {
            if (map.containsKey(B[i])) {
                l.add(B[i]);
            }
        }
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i<l.size(); i++) {
            m.put(l.get(i),1);
        }
        for(int i = 0; i<A.length; i++) {
            if (!m.containsKey(A[i])) {
                l.add(A[i]);
            }
        }
        int ans[] = new int [l.size()];
        for (int i = 0; i<ans.length;i++) {
            ans[i] = l.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] A = { 10, 2, 18, 16, 16, 16};
       int[]B = {3, 13, 2, 16, 4, 19 };
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
