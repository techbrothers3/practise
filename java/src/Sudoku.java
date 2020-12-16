import java.util.*;
public class Sudoku {
    static ArrayList<ArrayList<Character>> list;

    public static void solveSudoku(ArrayList<ArrayList<Character>> a) {
        list = a;
        int i = 0;
        int j = 0;
        findNumbers(i, j);
        System.out.println(list);
    }

    private static boolean findNumbers(int i, int j) {
        if (i == 8 && j == 8) {
            System.out.println(list);
            return true;
        } else if (list.get(i).get(j) != '.') {
            if (j == 8) findNumbers(i + 1, 0);
            else findNumbers(i, j + 1);
        } else {
            for (int k = 1; k <= 9; k++) {
                if (isPos(i, j, k)) {
                    list.get(i).set(j, (char) k);
                    if (j == 8) {
                        if (findNumbers(i + 1, 0)) return true;
                    } else {
                        if (findNumbers(i, j + 1)) return true;
                    }
                    list.get(i).set(j, (char) '.');
                }
            }
//            return false;

        }
        return false;

    }

    private static boolean isPos(int x, int y, int z) {
        boolean isTrue = true;
        int sti = x - (x % 3);
        int stj = y - (y % 3);
        for (int l = x, m = 0; m < 9; m++) {
            if (list.get(l).get(m) == z) return false;
        }
        for (int l = 0, m = y; l < 9; l++) {
            if (list.get(l).get(m) == z) return false;
        }
        for (int l = sti; l < sti + 3; l++) {
            for (int m = stj; m < stj + 3; m++) {
                if (list.get(l).get(m) == z) return false;
            }
        }
        return isTrue;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> a = new ArrayList<>();
        char arr[][] = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < arr[0].length; j++) {
                list.add(arr[i][j]);
            }
            a.add(list);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));


            solveSudoku(a);


        }
    }
}
