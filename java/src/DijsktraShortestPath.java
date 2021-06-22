import java.util.*;
import java.util.PriorityQueue;

public class DijsktraShortestPath {
    static class Pair {
        int i;
        int dist;
        Pair(int i, int dist) {
            this.i = i;
            this.dist = dist;
        }
    }
    static int[] Dijskstra(int [][] grid, int A, int c) {
        HashMap<Integer,ArrayList<Pair>> map = new HashMap<>();
        for(int i = 0; i<grid.length; i++) {
            ArrayList<Pair> l1 = map.getOrDefault(grid[i][0], new ArrayList<>());
            ArrayList<Pair> l2 = map.getOrDefault(grid[i][1], new ArrayList<>());
            l1.add(new Pair(grid[i][1],grid[i][2]));
            l2.add(new Pair(grid[i][0],grid[i][2]));
            map.put(grid[i][0],l1);
            map.put(grid[i][1],l2);
        }
        int []visArr = new int [A];
        int arr[] = new int[A];
        PriorityQueue<Pair> pq = new PriorityQueue<>((i,j) -> i.dist - j.dist);
        pq.add(new Pair(c,0));
        while(!pq.isEmpty()) {
            Pair p = pq.remove();

            if (visArr[p.i] != 1) {
                visArr[p.i] = 1;
                arr[p.i] = p.dist;
                ArrayList<Pair> l = map.getOrDefault(p.i,new ArrayList<>());
                while(l.size() > 0) {
                    Pair pa = l.remove(0);
                    pq.add(new Pair(pa.i,pa.dist+p.dist));
                }
            }
        }
        for(int i = 0; i<arr.length; i++) {
            if (visArr[i] == 0) {
                arr[i] = -1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [][] arr = {{2, 4, 10},{3, 4, 1},{3, 6, 1},{3,4,10},{3,1,8}};
        int A = 5;
        int c = 4;
        System.out.println(Dijskstra(arr,A,c));

    }
}
