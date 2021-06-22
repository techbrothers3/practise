import java.util.*;

public class BipartiteOrNot {
    static Pair [] visArr ;
    static class Pair{
        int i;
        int color;
        Pair(int i, int color) {
            this.i = i;
            this.color = color;
        }
    }
    static HashMap<Integer,ArrayList<Integer>> m;
    static int isBipartite(int[][] arr, int A) {
         visArr = new Pair [A];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
            ArrayList<Integer> l1 = map.getOrDefault(arr[i][0],new ArrayList<>());
            ArrayList<Integer> l2 = map.getOrDefault(arr[i][1],new ArrayList<>());
            l1.add(arr[i][1]);
            l2.add(arr[i][0]);
            map.put(arr[i][0],l1);
            map.put(arr[i][1],l2);
        }
        m = map;
        for(int j = 0; j<A; j++) {
            visArr[j] = new Pair(0,0);
        }
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i<visArr.length; i++) {
            q.add(new Pair(i,1));
            visArr[i] = new Pair(1,1);
            int val = BFS(q);
            if (val == 0) {
                return val;
            }
        }
        return 1;



    }
    static int BFS(Queue<Pair> q) {
        while(!q.isEmpty()) {
            Pair p = q.remove();
            ArrayList<Integer> l = m.getOrDefault(p.i,new ArrayList<>());
            while(l.size() != 0) {
                int num = l.remove(0);
                Pair vPair = visArr[num];
                if (vPair.i != 1) {
                    if(p.color == 1) {
                        q.add(new Pair (num,2));
                        visArr[num] = new Pair(1,2);
                    } else {
                        q.add(new Pair(num, 1));
                        visArr[num] = new Pair(1,1);
                    }

                } else {
                    if (vPair.color == p.color) {
                        return 0;
                    }

                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1},{0,3},{1,2},{1,4},{2,3},{2,4}};
        int A = 5;
        System.out.println(isBipartite(arr,A));
    }
}
