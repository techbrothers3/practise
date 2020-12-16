import java.util.Scanner;

public class RecursivelyPalindromeChecker {
    private static boolean solve(String str) {
//        for (int i = 0 , j = str.length()-1; i<j; i++,j--) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//        }
//        return true;
        if (str.length() == 1) return true;
        if (str.length() == 2) {
            if (str.charAt(0) == str.charAt(1)) return true;
            else return false;
        }
        else if (str.charAt(0) == str.charAt(str.length()-1)) return solve(str.substring(1,str.length()-1));
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(solve(str));
    }
}
