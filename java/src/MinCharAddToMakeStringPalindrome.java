public class MinCharAddToMakeStringPalindrome {
    private static int solve(String A) {
        StringBuilder s = new StringBuilder(A);
        String rev = s.reverse().toString();
        s.reverse().append('$');
        s.append(rev);
        String str = s+"";
        int len = str.length();
        int[]lps = new int [len];
        computeLps(lps,str);
        return A.length()-lps[s.length()-1];
    }
    private static int[] computeLps(int[] lps, String p) {
        int i = 1;
        int j = 0;
        lps[0] = 0;
        while(i<lps.length) {
            if (p.charAt(i) == p.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            } else if (j != 0) {
                j = lps[j-1];
            } else i++;
        }
        return lps;
    }
    public static void main(String[] args) {
        String A = "badb";
        System.out.println(solve(A));
    }
}
