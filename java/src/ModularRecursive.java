import java.util.Scanner;

public class ModularRecursive {
    private static int solve(int a , int b,int c) {
        if (b == 1) return a % c;
        if (b == 0) return 1;
        if (b % 2  == 0) {
            a = solve(a,b/2,c);
//            return ()
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(solve( a,b,c));
    }
}
