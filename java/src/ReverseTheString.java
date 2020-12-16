public class ReverseTheString {
    public static String solve(String A) {
        A.trim();
        StringBuilder s = new StringBuilder(A);
        s.reverse();
        StringBuilder str = new StringBuilder();
        int j = 0;
        if (A.contains(" ")) {
            for (int i = 0; i<s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    StringBuilder cur = new StringBuilder(s.substring(j,i));
                    cur.reverse();
                    str.append(cur);
                    str.append(' ');
                    j = i+1;
                } else if (i == s.length()-1) {


                    StringBuilder cur = new StringBuilder(s.substring(j,i+1));
                    cur.reverse();
                    str.append(cur);
                    str.append(' ');
                    j = i+1;

                }
            }

        } else {
            int i = s.length();
            StringBuilder cur = new StringBuilder(s.substring(j,i));
            cur.reverse();
            str.append(cur);


        }

        return str.toString();
    }

    public static void main(String[] args) {
        String A = "fwbpudnbrozzifml osdt ulc jsx kxorifrhubk ouhsuhf sswz qfho dqmy sn myq igjgip iwfcqq";
        System.out.println(solve(A));
    }
}
