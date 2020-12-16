import java.util.*;
public class ShuffleString {
    private static StringBuilder shuffle(String str,int [] ind) {
        char []arr = new char[ind.length];
        for (int i = 0; i<ind.length;i++) {
            arr[ind[i]] = str.charAt(i);
        }
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i<arr.length; i++) {
            newStr.append(arr[i]);
        }

        return newStr;
    }
    public static void main(String args[]) {
        String str = "aiohn";
        int []ind = {3,1,4,2,0};
        System.out.println(shuffle(str,ind));
    }
}
