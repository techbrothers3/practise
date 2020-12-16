import java.util.HashMap;
import java.util.*;

public class RemoveDuplicateLettersLexicographically {
    static String solve(String s) {
        if (s.length() == 1) return s;
        if (s.length() == 0) return "";
        HashMap<Character,Integer> map = new HashMap<>();
        boolean [] a = new boolean[26];
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i = 0; i<s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        a[s.charAt(0)-'a'] = true;
        map.put(s.charAt(0),map.get(s.charAt(0))-1);
        for (int i = 1; i<s.length(); i++) {
            char c = st.peek();
            map.put(s.charAt(i) , map.get(s.charAt(i))-1);
            if (a[s.charAt(i)-'a']) continue;
            else  {
                while (map.get(c) >= 1 && !st.isEmpty() && c>s.charAt(i)) {
                    st.pop();
                    a[c-'a'] = false;
                    if (!st.isEmpty()) c = st.peek();
                }
                st.push(s.charAt(i));
                a[s.charAt(i)-'a'] = true;
            }
        }
        StringBuilder str = new StringBuilder();
        while(st.size() > 0) {
            str.append(st.pop());
        }
        str.reverse();
        return str.toString();


    }

    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(solve(s));
    }
}
