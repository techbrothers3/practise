import java.util.Scanner;
import java.util.*;
public class consecutivechar {
    private static StringBuilder solve(String str) {
//        StringBuilder n = new StringBuilder();
//        int j = 0;
//        for (int i = j; i < str.length();  ) {
//            int count = 0;
//            n.append(str.charAt(i)+ "");
//            for (j=i; j<str.length(); j++) {
//                if (n.charAt(i) == str.charAt(j)) {
//                    count++;
//                } else break;
//            }
//            String s2 = count + "";
//            i = i+s2.length()+1;
//            n.append(count+"");
//        }
//        return n;
        char c = str.charAt(0);
        int count = 1;
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            } else{
                ans.append(c+ "" +count + "");
                count = 1;
                c = str.charAt(i);
            }
        }
        ans.append(c+""+count+"");
//        return ans;
        int x = -121;
        int y = -121;
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev == y) {
            System.out.println(true);
        }
//        System.out.println(false);
        return ans;
    }
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(solve(str));
    }
}
