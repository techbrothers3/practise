public class Packaging {
    static int solve(int [] arr, int items) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = -1;
        for (int i = 0; i<n; i++) {
            if (min > arr[i] ) min = i;
            if (max < arr[i]) max = i;
        }
        int time = 1;
        int  div = items / n;
        if (items % n != 0) {
            for (int i = 0; i<n; i++) {
                if (i == 0) {
                    time += div * arr[i];
                }
                if (i == min) {
                    time = div+(items % n) * arr[i];
                } else {
                    if (time  < (arr[i] * div)) {
                        time += (arr[i]*div) - time;
                    }
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int [] arr = {7,11,13,9};
        int items = 17;
        System.out.println(solve(arr,items));
    }
}
