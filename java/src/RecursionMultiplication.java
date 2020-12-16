import java.util.Scanner;

public class RecursionMultiplication {
    private static int solve(int a, int b) {
        if(b== 0) return 0;
        if (b == 1) return a;
        else return a*solve(a,b-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(solve( a,b));
    }
}
