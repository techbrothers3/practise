import javax.swing.text.AttributeSet;
import java.util.*;
public class Lalindrome {
    private static String solve(String str) {
        int mid = str.length()/ 2 ;
        HashMap<Character, Integer> obj = new HashMap<>();
        for (int i = 0; i<mid; i++) {
            if (!obj.containsKey(str.charAt(i))) {
                obj.put(str.charAt(i),1);
            } else{
                obj.put(str.charAt(i),obj.get(str.charAt(i))+1);
            }
        }
        if (str.length() % 2 != 0) {
            mid = mid +1;
        }
        Stack<Character> bucket = new Stack<>();
        for (int i = str.length()-1; i >= mid; i--) {
            bucket.push(str.charAt(i));
        }
        while(!bucket.isEmpty()) {
            char c = bucket.pop();
            if (obj.containsKey(c)) {
                obj.put(c,obj.get(c)-1);
                if (obj.get(c) == 0) {
                    obj.remove(c);
                }
            } else {
                return "false";
            }
        }
        if (obj.isEmpty()) {
            return "true";
        }
          return "false";


    }
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i< t; i++) {
            String str = s.next();
            System.out.println(solve(str));
        }
    }
}

