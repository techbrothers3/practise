public class GenerateHashValue {
    private static boolean solve(String s , String p) {
        int hp = 0;
        int mul = 1;
        int num = 10;

        for (int i = p.length()-1; i>= 0;i--) {
           hp += mul * p.charAt(i);
            mul *= num;
        }
        int hs = 0;
        int mulp = 1;
        for (int i = s.length()-1; i >= s.length()-p.length(); i--) {
            hs += mulp * s.charAt(i);
            mulp *= num;
        }
        if (hs == hp) {
           boolean isSame = compare( p,s.substring(s.length()-p.length()));
           if (isSame) return true;
        }
        int pow = (int) Math.pow(10,p.length()-1);
        for (int i = s.length()-2; i >= p.length()-1; i-- ) {
            hs -= s.charAt(i+1);
            hs /= 10;
            hs += s.charAt(i-p.length()+1) * pow;
            if (hs == hp) {
               boolean isSame =  compare(p,s.substring(i-p.length()+1,i+1));
                if (isSame) return true;
            }
        }
        return false;
    }
    static boolean  compare(String s1,String s2) {
        if (s2.length() == 0) return true;
        if (s2.charAt(0) == s1.charAt(0)) {
            return compare(s1.substring(1),s2.substring(1));
        } else return false;
    }
    public static void main(String[] args) {
        String s = "ihkdfgdhkfhkdbnkhdfkgljdklhjdfhjdkhjdfkjhdv";
        String p = "";
        System.out.println(solve(s,p));
    }
}
