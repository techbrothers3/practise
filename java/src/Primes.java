import java.util.Arrays;
import java.util.Scanner;

public class Primes {
    static int []arr = new int[10000001];
    static int [] pre = new int [arr.length];
    private static void runSeive() {

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 2; i * i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = i; i * j < arr.length; j++) {
                    if (arr[i * j] != 0) {
                        arr[i * j] = 0;
                    }
                }
            }
        }
        for (int i = 2; i< arr.length; i++) {
            if (arr[i] != 0) {
                pre[i] = pre[i-1] + 1;
            } else pre[i] = pre[i-1];
        }

    }

    public static int solve(int st, int end) {

        return pre[end]-pre[st-1];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        runSeive();
        int t = s.nextInt();
        while(t != 0) {
            int st = s.nextInt();
            int end = s.nextInt();
            t--;
            System.out.println(solve(st,end));
        }

//        System.out.println(solve(st,end));
    }
}
