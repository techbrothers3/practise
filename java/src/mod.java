public class mod {


    // Complete the findDigits function below.
    static int findDigits(int n) {
        String s =  n + "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((Integer.parseInt(s.charAt(i)+"") % n) != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
//        int n = 2;
//        n = n % 123456789;
//        System.out.println(n);
        System.out.println(findDigits(123456789));
    }
}
