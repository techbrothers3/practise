public class DivideIntegers {

        public static int divide(int dividend, int divisor) {
            int ans = 0;
            if (dividend < 0 && divisor < 0) {
                while(dividend < divisor) {
                    dividend = (dividend) - (divisor);
                    ans++;
                }
                return ans;
            } else if(dividend > 0 && divisor > 0) {
                while(dividend > divisor) {
                    dividend = (dividend) - (divisor);
                    ans++;
                }
                return ans;
            } else if(dividend < 0 && divisor > 0) {
                while(Math.abs(dividend) > divisor) {
                    dividend = (dividend) - (divisor);
                    ans++;
                }
                return (ans * -1);
            } else if(dividend > 0 && divisor < 0) {
                while(dividend > Math.abs(divisor)) {
                    dividend = (dividend) - Math.abs(divisor);
                    ans++;
                }
                return (ans*-1);
            }
            return ans;
        }
        public static void main(String args[]) {
            int dividend = 7;
            int divisor = -3;
            System.out.println(divide(dividend,divisor));
        }
}

