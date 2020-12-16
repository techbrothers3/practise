import java.util.Arrays;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        int []init = {1, 2, 3, 4};
        int []toPush = {10, 19};
        // {1, 2, 3, 4, 10, ,19}

        int x = init.length;
        int y = toPush.length;

        int finalSize = x + y;

        int []result = new int [finalSize];
        System.out.println(Arrays.toString(result));
        int i = 0;
        for (; i < x; i++) {
            result[i] = init[i];
        }

        System.out.println(Arrays.toString(result));

        Stack<Integer> stack = new Stack<>();
        for (int j = y-1; j >= 0; j--) {
            stack.push(toPush[j]);
        }

        System.out.println(stack);

        while (stack.size() != 0) {
            result[i] = stack.pop();
            i++;
        }

        System.out.println(Arrays.toString(result));

    }
}
