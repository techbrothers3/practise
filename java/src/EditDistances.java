public class EditDistances {
    static int [][] dpArr;
    static String s1;
    static String s2;
    static int solve(String A,String B) {
        int Alen = A.length();
        s1 = A;
        s2 = B;
        int Blen = B.length();
        dpArr = new int[Alen][Blen];
        for (int i = 0; i<dpArr.length; i++) {
            for(int j = 0; j<dpArr[0].length; j++) {
                dpArr[i][j] = Integer.MIN_VALUE;
            }
        }
        return findMinDist(0,0,Alen,Blen);
    }
    static int findMinDist(int i, int j, int Alen, int Blen) {
        if (i == Alen && j < Blen) {
            return Math.abs(Blen-j);
        } else if (j == Blen && i < Alen) {
            return Math.abs(Alen-i);
        } else if (i == Alen && j == Blen) {
            return 0;
        } else if(dpArr[i][j] != Integer.MIN_VALUE) {
            return dpArr[i][j];
        }
        else {
            int minDist = Integer.MAX_VALUE;
            if (s1.charAt(i) == s2.charAt(j)) {
                minDist = findMinDist(i+1,j+1,Alen,Blen);
            } else {
                minDist = Math.min(minDist, 1 + findMinDist(i + 1, j + 1, Alen, Blen));

                minDist = Math.min(minDist, 1 + findMinDist(i + 1, j, Alen, Blen));
                minDist = Math.min(minDist, 1 + findMinDist(i, j + 1, Alen, Blen));


            }
            dpArr[i][j] = minDist;
            return minDist;
        }
    }
    public static void main(String[] args) {
        String A = "aabbabbabababbababaa";
        String B = "abababb";
        System.out.println(solve(A,B));
    }
}
