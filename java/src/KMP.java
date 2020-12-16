import java.util.Arrays;

public class KMP {
    private static int solve(String s,String p) {
//        Naive Approach;
//        int n = s.length();
//        int m = p.length();
//        for (int i = 0; i<= n-m; i++) {
//            int j = 0;
//            while(j < m && s.charAt(i+j) == p.charAt(j)) {
//                j++;
//            }
//            if (j == p.length()) return i;
//        }
//        return -1;
        int n = s.length();
        int m = p.length();
        int []lps = new int[m];
        lps[0] = 0;
        computeLps(lps,m,p);
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            if(s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            }
            else if (j != 0) {

                    j = lps[j - 1];
                }

             else if (j == 0) i++;
            if (j == m) return (i-j);

        }
        return -1;

    }

    private static int[] computeLps(int[] lps, int m,String p) {
        int i = 1;
        int len = 0;
        while(i < m) {
            if (p.charAt(i) == p.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else if (len != 0) {
                len = lps[len-1];

            } else {
                lps[i] = len;
                i++;
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String s = "ABABDABACDABABCABAB";
        String p = "ABABCABAB";
        System.out.println(solve(s,p));
    }
}
