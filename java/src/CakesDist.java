import java.util.Scanner;

public class CakesDist {
    private static int solve (int len , int brea) {
        int count = 0;

        while (len >= 1 && brea >= 1) {
            if (len <= brea) {
                brea--;
                count++;
            } else {
                len--;
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int brea = scan.nextInt();
        System.out.println(solve(len , brea));
    }
}
