import java.util.*;
public class longestSubstringWithoutRepeat {
    private static int solve(String A) {
        HashMap<Character,Integer> map = new HashMap<>();
        if (A.length() == 1) return 1;
        int j = 0;
        int len = -1;
        int i = 0;
        for (; i<A.length(); i++) {
            if (map.containsKey(A.charAt(i))) {
                len = Math.max(len, (i-j));

                j = map.get(A.charAt(i))+1;
                map.put(A.charAt(i),i);
            } else {
                map.put(A.charAt(i),i);
            }

        }
        len = Math.max(len, (i-j));
        return len;
    }
    public static void main(String[] args) {
        String A = "dadbc";
        System.out.println(solve(A));
    }
}
