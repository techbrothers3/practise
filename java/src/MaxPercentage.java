import java.util.Arrays;

public class MaxPercentage {

    private static int [] solve(int []arr, int []rollNo) {
        long start = System.currentTimeMillis();

        int []val = new int[rollNo.length];
//        HashMap<Integer, Integer> map = new HashMap<>();
        int [] pre = new int[arr.length];


//        for (int j = 0; j < rollNo.length; j++ ) {
            int max = 0;
//            if (map.containsKey(rollNo[j]) == false) {

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    pre[i] = max;
                }
//                map.put(rollNo[j], max);
//            } else {
//                max = map.get(rollNo[j]);
//            }
//            val[j] = max;
//        }
        long end = System.currentTimeMillis();
        System.out.println("time taken: " + (end - start));
        for (int i = 0; i< rollNo.length; i++) {
            val[i] = pre[rollNo[i]];


        }
        return val;
    }

    public static void main(String[] args) {
        int []arr = {10, 15, 10, 90, 80, 40, 30};
        int []inputArr = {3,2,5, 3, 3, 3, 3, 3, 2, 5, 6, 6};
        System.out.println(Arrays.toString(solve(arr, inputArr)));
    }
}
