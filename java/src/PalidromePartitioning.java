import java.util.*;
public class PalidromePartitioning {
    static ArrayList<ArrayList<String>> res;
    static int len;
    static ArrayList<ArrayList<String>> solve(String a) {

        res = new ArrayList<>();
        len = a.length()-1;
        if (a.length() == 0) return res;
        ArrayList<String> temp = new ArrayList<>();
        findPartitions(0,temp, a,-1);
        return res;

    }
    static void findPartitions(int i, ArrayList<String> temp, String s,int p) {
        if (i == len) {
            if (isPal(s.substring(p+1,i+1))) {
                temp.add(s.substring(p + 1, i + 1));
                res.add(new ArrayList<>(temp));
                temp.remove(temp.size()-1);
            }


        } else {


                    if (isPal((s.substring(p+1,i+1)))) {
                        temp.add(s.substring(p + 1, i + 1));
                        findPartitions(i + 1, temp, s, i);
                        temp.remove(temp.size()-1);
                    } else {
                        temp = new ArrayList<>();
                    }

                    findPartitions(i+1,temp,s,p);



            }
    }





    static boolean isAllPals(ArrayList<String> l) {
        for(int i = 0; i< l.size(); i++) {
            String s = l.get(i);
            if (isPal(s)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    static boolean isPal(String s) {
        if (s.length() == 1 || s.length() == 0) return true;
        else if (s.charAt(0) != s.charAt(s.length()-1)) {
            return false;
        }
        return isPal(s.substring(1,s.length()-1));
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(solve(s));
    }
}
