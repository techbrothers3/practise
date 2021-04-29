import java.util.ArrayList;

public class TotalPermutations {
    static ArrayList<ArrayList<Integer>> ans;
    static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ans = new ArrayList<>();
        findPerm(A,0);
        return ans;
    }
    static void findPerm(ArrayList<Integer> A, int pos) {
        if (pos == A.size()-1) {
            ans.add(new ArrayList<>(A));
            return;
        }
        int i = pos;
        for( i = pos; i<A.size(); i++) {
            swap(i,pos,A);
            findPerm(A,pos+1);
            swap(i,pos,A);
        }

    }
    static void swap(int i, int j, ArrayList<Integer> inp) {
        int temp = inp.get(j);
        inp.set(j,inp.get(i));
        inp.set(i,temp);

    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        System.out.println(solve(A));

    }
}
