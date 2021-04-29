public class LongestPalindromicSubsequence {
    static int solve(String A) {
        int maxLen = 0;
        if (A.length() == 1) return 1;
        else if (A.length() == 0) return 0;
        else {
            if (A.charAt(0) == A.charAt(A.length()-1)) {
                maxLen = Math.max(maxLen,2+solve(A.substring(1,A.length()-1)));
            } else {
                maxLen = Math.max(maxLen,0+solve(A.substring(1,A.length())));
                maxLen = Math.max(maxLen,0+solve(A.substring(0,A.length()-1)));
            }
            return maxLen;
        }
    }
    public static void main(String[] args) {
        String s = "e";
        System.out.println(solve(s));
    }
}
