import java.util.Stack;

public class insertElemAtBottomOfStack {
    static Stack<Integer> solve( Stack<Integer> stk, int x) {
        int t = 0;
        insertAtBottom(stk,t,x);
        return stk;
    }

    private static void insertAtBottom(Stack<Integer> stk, int t, int x) {
        if (stk.isEmpty()) {
            stk.push(x);
            return;
        } else {
            t = stk.pop();
            insertAtBottom(stk,t,x);
            stk.push(t);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(3);
        stk.push(2);
        stk.push(1);
        int x = 9;
        System.out.println(solve(stk, x));






    }
}
