import java.util.Stack;

public class minStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(3);
        stk.push(2);
        stk.push(21);
        stk.push(4);
        stk.push(5);
        Min(stk);
    }

    public static void Min(Stack<Integer> stk) {
        Stack<Integer> s = new Stack<>();
        int n = stk.size();
        for(int i =0; i < n;i++) {

            if(s.empty()) {

                s.push(stk.pop());
            } else {
                if(s.peek() >= stk.peek()) {
                    int top = stk.pop();
                    s.pop();
                    s.push(top);
                } else {
                    stk.pop();

                }
            }

        }
        System.out.println("This is our answer -> {} == "+s.peek());
    }
}
