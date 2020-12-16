

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KillSecondNeighbour {

    private static List<Integer> leftPeople(int n) {
        int []arr = new int[n];
        int j = 0;
        List<Integer> L = new ArrayList<>();
        for (int i = 1; i < arr.length + 1; i++) {
            arr[j] = i;
            j++;
        }
        for (int i = 0; i < arr.length; i+=1) {
            L.add(arr[i]);
        }
        System.out.println(L);
            int k = 0;
            while (L.size() > 2) {
                L.remove((k + 2) % L.size());
                k = (k + 1) % (L.size()+ 1);
            }
            return L;
            }

//        System.out.println(Arrays.toString(arr));


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        List<Integer> list = leftPeople(n);
        System.out.println(list);
    }
}