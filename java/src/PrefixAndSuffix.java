import java.util.*;

public class PrefixAndSuffix {
    static int count;
    static ArrayList<Integer> l;
    static int[] solve(String[] A,String []B) {
        count = 0;
        l = new ArrayList<>();
        for (String str : B) {
            prefixAndSuffixCount(str,A);
            l.add(count);
            count = 0;
        }
        int []arr = new int[l.size()];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = l.get(i);
        }
        return arr;
    }
    static void prefixAndSuffixCount(String str,String[] A) {

        for (String s: A) {
            if (s.length() >= str.length()) {
                boolean isTrue = checkIsSame(s,str);
                if (isTrue) count++;
            }
        }

    }
    static boolean checkIsSame(String s, String str) {

        for (int i = 0; i < str.length(); i++) {
            if (s.charAt(i) != str.charAt(i)) return false;
        }
        int j = 0;
        for(int i = s.length()-str.length(); i < s.length(); i++) {
            if (s.charAt(i) != str.charAt(j)) return false;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        String A[]= {"ababa","aabbvaab","aecdsaaec","abaaxbqaba"};
        String B[] = {"aba","aec","abb","aab"};
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
