import java.math.BigInteger;

public class ComparingVersions {
    private static int solve(String A,String B) {
        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ZERO;
        int j = 0;
        for (int i = 0; i<A.length()|| j<B.length();) {
            while(i<A.length()&& A.charAt(i) != '.') {
                num1 = num1.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(A.charAt(i) - '0'));
                i++;
            }
            while(j<B.length()&&B.charAt(j) != '.') {
                num2 = num2.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(B.charAt(j)-'0'));
                j++;
            }
            if (num1.compareTo(num2) == -1) return -1;
            else if (num1.compareTo(num2) == 1) return 1;
            num1 = BigInteger.ZERO;
            num2 = BigInteger.ZERO;
            i++;
            j++;
        }
        return 0;

    }
    public static void main(String[] args) {
        String s = "3346237295";
        String t = "898195413.2.6243";
        System.out.println(solve(s,t));
    }
}
