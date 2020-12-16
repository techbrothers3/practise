import java.util.*;
public class queue {
    public static void solve(int[][]arr) {
        Queue<Integer> q = new LinkedList<>();
        int head = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i][0] == 1) {
                q.add(arr[i][1]);

            } else if (arr[i][0] == 2) {
                head =  q.peek();
//               System.out.println(head);
            } else if (arr[i][0] == 3){
                q.remove();
            }
        }
        System.out.println(q);
    }


    public static void main(String[] args) {
        int [][]arr = {{1,30},{1,2},{2,4},{2,2},{1,20},{3,0}};
        solve(arr);
    }
}
