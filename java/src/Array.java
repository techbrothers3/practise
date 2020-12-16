public class Array {
    public static void main(String[] args) {
//        long s = 2;
//        long sq = 3;
////        for (int i = 2; i <=  2; i++) {
//////            sq = (long) Math.pow(i,2);
////        }
//        double i =  (int) Math.sqrt(3);
//        double a = 3;
//
////        System.out.println(Math.floor(Math.sqrt(a)));
//        System.out.println(Math.sqrt(a));
//        System.out.println(a);
        int a = 3;
        int b = 9;
        System.out.println(Math.sqrt(b));
        int  count =  (int)( Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))+1);
        System.out.println(count);
    }
}
