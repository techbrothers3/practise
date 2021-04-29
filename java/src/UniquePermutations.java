import java.util.ArrayList;

public class UniquePermutations {
    static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        return  findPerm(A);

    }
    static ArrayList<ArrayList<Integer>> findPerm(ArrayList<Integer> l) {
        if (l.size() == 1) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            res.add(l);
            return res;
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0; i< l.size(); i++) {
            boolean isPres =  check(l.get(i), l, i);
            if (!isPres) {

                ArrayList<Integer> inp = new ArrayList<>();

                if(i != 0) {
                    ArrayList<Integer> l1 = new ArrayList<>(l.subList(0,i));
                    ArrayList<Integer> l2 = new ArrayList<>(l.subList(i+1,l.size()));
                    inp.addAll(l1);
                    inp.addAll(l2);
                } else {
                    inp = new ArrayList<>(l.subList(i+1,l.size()));
                }


                ArrayList<ArrayList<Integer>> perms = findPerm(inp);
                for(ArrayList<Integer> perm : perms) {
                    perm.add(0,l.get(i));
                    res.add(perm);
                }
            }
        }
        return res;
    }
    static boolean check(int val, ArrayList<Integer>l, int ind) {
        for (int i = 0; i< ind; i++) {
            if (l.get(i) == val) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        System.out.println(solve(A));
    }
}
