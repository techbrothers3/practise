import java.util.HashMap;
import java.util.HashSet;

public class IsormorphicOrNot {
    private static boolean solve(String s,String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) == t.charAt(i)) {

                } else {
                    return false;
                }
            } else {
                if(set.contains(t.charAt(i))) {
                    return false;
                } else {
                    map.put(s.charAt(i),t.charAt(i));
                    set.add(t.charAt(i));
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aab";
        String t = "xxzhgh";
        System.out.println(solve(s,t));
    }
}
