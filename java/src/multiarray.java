public class multiarray {
    private static int solve(int [][]arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int sum = 0;
//        for (int i = 0,j = 0; ; ) {
//            sum += arr[i][j];
//            if (j == cols-1) {
//                i++;
//            } else j++;
//            if (i == rows) {
//                break;
//            }
//        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               if (i == 0) {
                   sum += arr[i][j];
               } else {
                   j = cols-1;
                   sum +=arr[i][j];
               }
            }
        }
        return sum;

    }
    public static void main(String args[]) {
        int [][]arr = {{1,4,5},{6,7,8},{9,11,10}};
        System.out.println(solve(arr));
    }
}
