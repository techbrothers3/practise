public class LongestCommonPrefix {
    private static String solve(String []s) {
        int min = findMinLen(s);
        String res = "";
        char current;
        for (int i = 0; i<min; i++) {
            current = s[0].charAt(i);
            for (int j = 1; j<s.length; j++ ) {
                if (current != s[j].charAt(i)) {
                    return res;
                }
            }
            res += current;
        }
        return res;

    }

    private static int findMinLen(String[] s) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i<s.length; i++) {
            if (s[i].length() < minLen) {
                minLen = s[i].length();
            }
        }
        return minLen;
    }

    public static void main(String[] args) {
        String []s = {"abcdefgh", "aefghijk", "abcefgh"};
        System.out.println(solve(s));
    }
}
