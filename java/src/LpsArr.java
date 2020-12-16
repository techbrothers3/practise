import java.util.Arrays;

public class LpsArr {
    private static int[] solve(String s) {
        int[] lps = new int [s.length()];
        lps[0] = 0;
        int i = 1;
        int j = 0;
        while(i<s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
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
        String s = "AACECAAAA$AAAACECAA";
        System.out.println(Arrays.toString(solve(s)));
    }
}
