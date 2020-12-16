public class booleanmethod {
    public static void main (String[] args) {
        System.out.println(isOdd(12));
        System.out.println(isOdd(17));
        System.out.println(isOdd(15));
        System.out.println(isOdd(13));
    }
    public static Boolean isOdd(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
