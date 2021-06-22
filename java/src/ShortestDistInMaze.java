public class ShortestDistInMaze {
    static int [][] visArr;
    static int [][] inArr;
    static int n;
    static int m;
    static int [][]PathArr = {{-1,0},{0,1},{1,0},{0,-1}};
    static int ans;
    static int rEd;
    static int cEd;
    static int count = 0;

    static int ShortestPath(int [][] grid, int [] B , int [] C) {
        inArr = grid;
        count = 0;
        ans = Integer.MAX_VALUE;
        n = grid.length;
        m = grid[0].length;
        visArr = new int[n][m];
        int rSt = B[0];
        int cSt = B[1];
        rEd = C[0];
        cEd = C[1];
        if(grid[rSt][cSt] == 1) return 0;
        DFS(rSt,cSt,count);
        return ans;
    }
    static void DFS(int rSt, int cSt,int count ) {

//        for(int i = 0; i<4; i++) {
//            int r = rSt;
//            int c = cSt;
//            r += PathArr[i][0];
//            c += PathArr[i][1];
//            if (isValid(r,c)) {
//                count++;
//                DFS(r,c,count);
//            } else {
//                if (r == rEd && c == cEd) {
//                    if (count < ans) {
//                        ans = count;
//                    }
//                }
//            }
//        }
        if (isValid(rSt-1,cSt)) {
            count++;
            top(rSt - 1, cSt);
            if (rSt == rEd && cSt == cEd) {
                if (count < ans) {
                    ans = count;
                }
            }
        }

        if (isValid(rSt,cSt+1)) {
            count++;
            right(rSt, cSt + 1);
        }
        if (rSt == rEd && cSt == cEd) {
            if (count < ans) {
                ans = count;
            }
        }
        if (isValid(rSt+1,cSt)) {
            count++;
            bottom(rSt + 1, cSt);
        }
        if (rSt == rEd && cSt == cEd) {
            if (count < ans) {
                ans = count;
            }
        }
        if (isValid(rSt,cSt-1)) {
            count++;
            left(rSt, cSt - 1);
        }
        if (rSt == rEd && cSt == cEd) {
            if (count < ans) {
                ans = count;
            }
        }

    }
    static void top(int i, int j) {
        if (isValid(i-1,j)) {
            count++;
            top(i-1,j);;
        }
    }
    static void right(int i,int j) {
        if(isValid(i,j+1)) {
            count++;
            top(i,j+1);
        }
    }
    static void bottom(int i,int j) {
        if(isValid(i+1,j)) {
            count++;
            top(i+1,j);
        }
    }
    static void left(int i,int j) {
        if(isValid(i,j-1)) {
            count++;
            top(i,j-1);
        }
    }

    static boolean isValid(int i, int j) {
        if (i < 0 || j < 0 || i == n || j == m || inArr[i][j] == 1) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int [][] grid = {{0,0,1,0},{1,0,0,0},{0,0,0,0}};
        int [] B = {0,0};
        int []C = {2,3};
        System.out.println(ShortestPath(grid,B,C));
    }
}
