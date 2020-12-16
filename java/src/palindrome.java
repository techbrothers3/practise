import java.util.*;
public class palindrome {
    private static boolean solve(String s,int i, int j) {
//        Stack<Character> s2 = new Stack<>();
//        int count = 0;
//        while (!s1.isEmpty()) {
//            s2.push(s1.pop());
//            count++;
//        }
//        count = (count / 2);
//       int count1 = count;
//        while (count > 0) {
//            s1.push(s2.pop());
//            count--;
//        }
//        if (count1 % 2 != 0) {
//            s2.pop();
//        }
//        boolean isPalindrome = true;
//        while (!s1.isEmpty()) {
//            if (s1.pop() != s2.pop()) {
//                isPalindrome = false;
//                break;
//            }
//
//        }
//        return isPalindrome;
//        recurive
        if (i>= j) return true;
        else if (s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        } else return false;
        return solve(s,i,j);

    }
    public static void main(String args[]) {
//        Stack <Character> s1 = new Stack<>();
//        Scanner scan = new Scanner(System.in);
//
//        String s = scan.next();
//        for (int i = 0; i < s.length(); i++) {
//            s1.push(s.charAt(i));
//        }
        String s = "aabaaba";
        int i = 0;
        int j = s.length()-1;
        System.out.println(solve(s,i,j));
    }
}
