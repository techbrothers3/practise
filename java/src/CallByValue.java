import java.util.ArrayList;
import java.util.Arrays;

public class CallByValue {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> [] arr = new ArrayList[2];

        l.add(0, 1);
        l.add(1, 2);

        arr[0] = new ArrayList<>(l);
        arr[1] = new ArrayList<>(l);

//        System.out.println(Arrays.toString(arr));

        arr[0].set(0,2);

        /*
        l = {1, 2} , (1022)
        arr[2] = {1022, 1022}

        l(1022) = arr[0]
        .set(0, 2)
        l = {2, 2} , (1022)

        arr[2]
        [[2, 2], [2, 2]]

        // 2nd attempt

        l = {1, 2} 1022

        arr[2] = {
            1023{1, 2},
            1024{1, 2}
        }

        [[1, 2], [1, 2]]

        [[2, 2], [1, 2]]






         */

//        System.out.println(Arrays.toString(arr));


        System.out.println(l); // {1, 2}
        solve(new ArrayList<>());
        System.out.println(l);

    }

    static void solve(ArrayList<Integer> list) {
        list.set(0, 2); // {2, 2}
        System.out.println(list); // {2, 2}
    }
}
