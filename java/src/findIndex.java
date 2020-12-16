public class findIndex {
    public static int solve(java.lang.String h, java.lang.String n) {
        if (n.length() == 0) return 0;
        int ci = 0;
        for(int i = 0; i < h.length(); i++) {
            ci = i + n.length();
            if (ci <= h.length()) {
                if (h.substring(i,ci).equalsIgnoreCase(n)) return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        java.lang.String h = "Mississippi";
        java.lang.String n = "issip";
        System.out.println(solve(h,n));
    }
}
