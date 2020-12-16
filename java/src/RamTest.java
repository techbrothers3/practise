public class RamTest {
    static long fib(int x) {
        if (x <= 1) return 1;
        return fib(x-1) + fib(x-2);
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = 50;
//        for (int i = 0; i < n; i++) {
            System.out.println(fib(n));
//        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
