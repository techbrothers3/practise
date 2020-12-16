public class validPalindrome {
    private static boolean solve(String s) {
        String str = s.toLowerCase();
        StringBuilder str2 = new StringBuilder();
        for(int i = 0; i<s.length(); i++) {
            if (str.charAt(i)  >= 97 && str.charAt(i)  <= 122 || str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                str2.append(str.charAt(i));
            }
        }
        String newStr = str2+"";
       return isPal(newStr,0,newStr.length()-1);

    }
    private static boolean isPal(String s, int i , int j) {
        if (i >= j) return true;
        else if (s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        } else return false;
        return isPal(s,i,j);
    }
    public static void main(String[] args) {
        String s = "0P";
//        String str = s.toLowerCase();
        System.out.println(solve(s));
    }
}
