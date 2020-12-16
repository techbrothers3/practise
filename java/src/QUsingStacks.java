import java.io.*;
import java.util.*;

public class QUsingStacks {

    private static void solve(int [][]queries) {
        System.out.println(Arrays.deepToString(queries));
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        int [][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            int type = s.nextInt();
            if (type == 1) {
                int val = s.nextInt();
                // type, val
                queries[i][0] = type;
                queries[i][1] = val;
            } else {
                // only type
                queries[i][0] = type;
            }
        }

        // all queries in arr
        solve(queries);
    }
}
