import java.util.*;

public class findNthMagicNumber {
    private static int solve(int A) {
        int []powArr = new int[5];
        int j = 1;
        for (int i = 0; i<powArr.length; i++) {
            powArr[i] = (int)Math.pow(5,j);
            j++;
        }
//        int [] sumArr = new int[5001];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<powArr.length-1;i++) {
            for (int l = i+1; l < powArr.length; l++) {
                list.add(powArr[i] + powArr[l]);
//                System.out.println(list);
            }
        }
        Collections.sort(list);
        return list.get(A+1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        System.out.println(solve(A));
    }
}
