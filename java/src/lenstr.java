public class lenstr {
    private static int solve(String s) {
        int len = 0;

        if (s.isEmpty()) {
            return 0;
        }
        for (int i = 0; i< s.length(); i++) {
            if(s.charAt(i) == ' ') {
                for(int j = i+1; j < s.length(); j++) {
                    len++;
                }
            }
        }
        return len;
    }
    public static void main(String args[]) {
        String s = "Hello world";
        System.out.println(solve(s));
    }
}
