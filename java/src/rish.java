public class rish {
    private static int solve(int a) {
//        int b = 130;

        double c = Math.floor(a / 128);
        if (a % 128 == 0) {
            return a / 128;

        }
        int b = (int)c + 0;
        b += 1;
        return b;
    }
    public static void main(String[] args) {
        int a = 256;
        System.out.println(solve(a));
    }
}
