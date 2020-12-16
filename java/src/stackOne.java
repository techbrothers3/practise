import java.util.*;
public class stackOne {
    private static boolean solve(String str) {
        Stack <Character> bucket = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) =='{' || str.charAt(i) == '[') {
                bucket.push(str.charAt(i));
            } else {
                if (bucket.isEmpty()) {
                    return false;
                }
                char top = bucket.pop();
                char current = str.charAt(i);
                if (!isMatching(top , current)) {
                    return false;
                }
            }


        }
        if (bucket.isEmpty()) {
            return true;
        } else {
            return false;
        }


    }

    private static boolean isMatching(char top, char current) {
        if (top == '(' && current == ')') {
            return true;
        } else if (top == '{' && current == '}') {
            return true;
        } else if (top == '[' && current == ']') {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String str = "({";

        System.out.println(solve(str));
    }
}
