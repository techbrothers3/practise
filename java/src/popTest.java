import java.util.*;
public class popTest {
    public static void main (String[] args) {
        int[] myArray = {1,2,4,5,8};
        int[] popArray = {3,6,7};
        int x = myArray.length;
        int y = popArray.length;
        int finalSize = x + y;
        int[] result = new int[finalSize];
        int i = 0;
        for (; i < y; i++) {
            result[i] = popArray[i];
            System.out.println(Arrays.toString(result));
        }
        Stack<Integer> bucket = new Stack<>();
        for (int j = x -1; j >= 0; j--) {
            bucket.push(myArray[j]);
            System.out.println(bucket);
        }
        while (bucket.size() != 0) {
            result[i] = bucket.pop();
            i++;
        }
        System.out.println(Arrays.toString(result));
    }
}
