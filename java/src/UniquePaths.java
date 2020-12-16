import java.util.*;
public class UniquePaths {
        public int solve(int[][] A) {
            int startX = 0, startY = 0;
            int endX = 0, endY = 0;
            int n = A.length;
            int m = A[0].length;
            int countZ = 0;
            int globSum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (A[i][j] == 0) {
                        countZ++;
                    } else if (A[i][j] == 1) {
                        startX = i;
                        startY = j;
                    } else if (A[i][j] == 2) {
                        endX = i;
                        endY = j;
                    }
                }
            }
            int [][]pos = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            List<Integer> list = new ArrayList<>();
            list.add(0);
            findDistinctPaths(A, countZ, n, m, startX, startY, endX, endY, 0, list, pos, startX, startY);
            return list.get(0);
        }

        private static void findDistinctPaths(int [][]A, int countZ, int n, int m, int startX, int startY, int endX, int endY, int pathZ, List<Integer> list, int pos[][], int stX, int stY) {
            if (A[startX][startY] == 2) {
                if (pathZ-1 == countZ) list.set(0, list.get(0) + 1);
                else return;
            } else {

                for (int i = 0; i < pos.length; i++) {
                    int posX = startX + pos[i][0];
                    int posY = startY + pos[i][1];
                    if (isMovable(A, n, m, posX, posY)) {
                        pathZ++;
                        A[startX][startY] = -1;
                        findDistinctPaths(A, countZ, n, m, posX, posY, endX, endY, pathZ, list, pos, stX, stY);
                        pathZ--;
                        A[startX][startY] = 0;
                        A[stX][stY] = 1;
                        // A[endX][endY] = 2;
                    }
                }

            }
        }

        private static Boolean isMovable(int [][]A, int n, int m, int x, int y) {
            if (x >= n || y >= m || x < 0 || y < 0) return false;
            if (A[x][y] == -1 || A[x][y] == 1) return false;
            return true;
        }

    public static void main(String[] args) {
        int [][]A = {{1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}  };
    }
}



