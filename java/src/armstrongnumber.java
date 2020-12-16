import java.util.Scanner;

public class armstrongnumber {
    private static boolean solve(int n) {
        int y = n;
        String str = n + "";
        int count = 0;
        while (n>0) {
            count += (int) Math.pow(n%10,str.length());
            n/= 10;
        }
        if (count == y) return true;
        return false;
    }
    public static void main(String args[]) {
        int n = 120;
        System.out.println(solve(n));
    }
}
