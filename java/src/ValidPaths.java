import java.util.Arrays;

public class ValidPaths {
    static char[][] A ;
    static int [][] pathArr = {{-1,0},{0,1},{1,0},{0,-1}};
    static int findPaths(String [] arr ) {
        char [][] grid = new char[arr.length][arr[0].length()];
        for(int i = 0; i < arr.length; i++) {
            String s = arr[i];
            for(int j = 0; j<s.length(); j++) {
                grid[i][j] =  s.charAt(j);
            }
        }
        A = grid;
        int ans = 0;
        for(int i = 0; i<grid.length; i++) {
            for(int j = 0; j<grid[0].length; j++) {
                if (A[i][j] == 'X') {
                    DFS(i,j);
                    ans++;
                }
            }
        }

        return ans;
    }
    static void DFS(int i,int j) {
        for(int k = 0; k<4; k++) {
            int row = i;
            int col = j;
            row += pathArr[k][0];
            col += pathArr[k][1];
            if(isValid(row,col)) {
                A[row][col] = 'O';
                DFS(row,col);
            }

        }
    }
    static boolean isValid(int i, int j) {
        if (i == -1 || j == -1 || j >= A[0].length || i >= A.length) {
            return false;
        } else if(A[i][j] == 'x') {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String [] arr = {"xo","ox"};
        System.out.println(findPaths(arr));
    }
}
