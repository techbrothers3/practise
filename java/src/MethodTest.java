public class MethodTest {
    public static void main(String[] args) {
        int x = 6;
        int fact = findFactorial(x);
        System.out.println(fact);

        printFactorial(x);
    }

    public static void printFactorial(int input) {
        int val = 1;
        if (input == 0 || input == 1) {
            val = 1;
        } else {
            for (int i = input; i > 1; i--) {
                val = val * i;
            }
            System.out.println(val);
        }
    }

    public static int findFactorial(int input) {
        if (input == 0 || input == 1) return 1;
        else {
            return (input * findFactorial(input-1));
        }
    }


}
