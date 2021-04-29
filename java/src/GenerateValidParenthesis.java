import java.util.*;
public class GenerateValidParenthesis {
    static ArrayList<String> ans;
    static int len;
    static int n ;
    static ArrayList<String> solve(int A) {
        ans = new ArrayList<>();
        len = 2*A;
        n = A;
        generateParenthesis(0,"");
        return ans;

    }
    static void generateParenthesis(int c,String s) {
        if (s.length() == len) {
             ans.add(s);
        } else {
            for(int i = 0; i<2; i++) {
                if (i == 0) {
                    if (c < n) {
                        generateParenthesis(c+1,s+"(");
                    }
                } else {
                    if (c > 0) {
                        int closing = s.length()-c;
                        if (c > closing) {
                            generateParenthesis(c, s + ")");
                        }

                    }
                }
            }
        }
    }
    static boolean isValid(String s) {
        int i = 0;
        Stack<Character> stack =  new Stack<>();
        while(i < s.length()) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                i++;
            } else {
                if (stack.isEmpty()) {
                    return false;
                }  else if  (s.charAt(i) != stack.pop()) {
                    i++;
                    continue;
                }
            }
        }
        if (stack.isEmpty()) return true;
        return false;

    }


    public static void main(String[] args) {
        int A = 2;
        System.out.println(solve(A));
    }
}
