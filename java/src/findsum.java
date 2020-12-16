public class findsum {
    private static int sum(int [][] arr) {
        int val = 0;
        int sum = 0;
        long start = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                val = arr[i][j];
//                System.out.println(val);
                boolean isPresent = false;
                for (int k = 0; k < arr[0].length; k++) {
                    if (k != j && val == arr[i][k] ) {
                        isPresent = true;
                        break;
                    }
                }
                for (int l = 0; l < arr.length; l++) {
                    if (l != i && val == arr[l][j]) {
                        isPresent = true;
                        break;
                    }
                }
                // topleft;
                for (int m = i-1, n = j-1; m >= 0 && n >= 0; m--,n-- ) {
                    if (arr[m][n] == val) {
                        isPresent = true;
                        break;
                    }
                }
                //bottomright;

                for (int m = i+1,n = j+1; m < arr.length && n < arr[0].length ; m++,n++) {
                    if (arr[m][n] == val) {
                        isPresent = true;
                        break;
                    }
                }

                //topright;
                for (int m = i-1,n = j+1;m >=0 && n <arr[0].length ; m--,n++) {
                    if (arr[m][n] == val) {
                        isPresent = true;
                        break;
                    }
                }
                //bottomleft
                for (int m = i+1, n = j-1; m < arr.length && n >= 0; m++,n-- ) {
                    if (arr[m][n] == val) {
                        isPresent = true;
                        break;
                    }
                }
                if (isPresent == false) {
                    sum += val;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("time :" + (end-start));
        return sum;
    }

    public static void main(String args[]) {
        int [][] arr = {{1,2,3},{5,2,6},{1,5,9}};
        System.out.println(sum(arr));
    }
}
