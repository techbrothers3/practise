import java.util.Arrays;

public class Sieve {
    private static int  solve(int x , int[]b) {
        int max = 1000001;
        int []arr = new int[max];
        int [] ans = new int[max];
        for (int i = 1; i < max; i++ ) {
            arr[i] = i;
        }

        for (int i = 2; i * i < max; i++) {
            int countprime = 0;
            if (arr[i] != 0) {
                for (int j = i; i*j < max; j++) {
                    if (arr[i*j] != 0 ) {
                        countprime++;
                        arr[i * j] = 0;
                    }
                }
                ans[i] = countprime+1;
            }
        }
        int count = 0;
        for (int i = 0; i < x; i++) {
            count+= ans[b[i]];

        }
        return count;
    }
    public static void main(String[] args) {
        int x = 1;
        int []b = {11};
        System.out.println(solve(x,b));
    }
}
