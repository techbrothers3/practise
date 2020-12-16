import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//import static org.graalvm.compiler.debug.DebugOptions.Count;

//import static org.graalvm.compiler.debug.DebugOptions.Count;

public class Anagrams {
    private static ArrayList<ArrayList<Integer>> solve(String []s) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        boolean [] isFound = new boolean[s.length];
        for (int i = 0; i<= s.length-1; i++) {
            if (!isFound[i]) {
                isFound[i] = true;
                n = new ArrayList<>();
                char []c1 = s[i].toCharArray();

                for (int j = i + 1; j < s.length; j++) {

                    //                char []c2 = s[j].toCharArray();
                    boolean isTrue = isAnagram(c1, s[j]);
                    if (isTrue) {
                        n.add((j + 1));
                        isFound[j] = true;
                    }


                }
                n.add(0,i+1);
                l.add(n);
//                n.clear();
            }



//            if (n.size() == s.length) break;


        }
        int arr[] = {-1,-2,-3,-4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return l;
    }

    private static boolean isAnagram(char[] c1, String c2) {
//        n sq time complexity
      if (c1.length != c2.length()) return false;
//       int k = 0;
//       for(int i = 0; i<c1.length; i++) {
//           k = 0;
//           int ind = 0;
//           while(k<c2.length()) {
//               if (c1[i] == c2.charAt(k)) {
//                   ind = k;
//                   c2 = c2.substring(0,ind)+c2.substring(ind+1);
//                   break;
//               } else if (k == c2.length()-1) return false;
//               k++;
//           }
//       }
//       return true;
        HashMap <Character,Integer> c11 = new HashMap<>();
        for (int i = 0; i< c1.length; i++) {
            if (c11.containsKey(c1[i])) {
                c11.put(c1[i],c11.get(c1[i])+1);
            } else c11.put(c1[i],1);
        }
        HashMap <Character,Integer> c12 = new HashMap<>();
        for (int i = 0; i< c2.length(); i++) {
            if (c12.containsKey(c2.charAt(i))) {
                c12.put(c2.charAt(i),c12.get(c2.charAt(i))+1);
            } else c12.put(c2.charAt(i),1);
        }
//        for(int i = 0; i<c1.length; i++) {
//            if (c11.get(c1[i]) != c12.get(c1[i])) {
//                return false;
//            }
//        }
//        return true;
        if (c11.equals(c12)) return true;
        return false;
    }


    public static void main(String[] args) {
        String [] s = {"cat","dog","god","tca","cca"};
        System.out.println(solve(s));
    }
}
