import java.util.*;
public class stacktest1 {
    public static void main (String[] args) {
        int[] myArray = {1,3,4,7};
        int[] pushArray = {32,45,13};
        int x = myArray.length;
        int y = pushArray.length;
        int finalSize = x + y;
        int[] result = new int [finalSize];
        int i = 0;
        for (; i < x; i++) {
            result[i] = myArray[i];
            System.out.println(Arrays.toString(result));
        }
        Stack<Integer> bucket = new Stack<>();
        for (int j = y-1; j >= 0; j--) {
            bucket.push(pushArray[j]);
        }

        System.out.println(bucket);
        while (bucket.size() != 0) {
            result[i] = bucket.pop();
            i++;
            System.out.println(Arrays.toString(result));
        }
    }

}
