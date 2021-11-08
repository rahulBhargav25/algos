import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {

        String s3 = "(()())";
        String s2 = "(()";
        String s4 = "))((";
        String s1 = "((()()";
        String s6 = "(((())";
        isBalanced(s1);
        isBalancedSecondEdition(s6);

    }

    public static void isBalancedSecondEdition(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < n; i++) {
            if(stk.empty()) {
                stk.push(a[i]);
            } else {
                if(stk.peek() == '(' && stk.peek() != a[i]) {
                    stk.pop();
                    if(stk.peek() == '(') {
                        stk.pop();
                    } else {
                        stk.push('(');
                    }
                } else {
                    stk.push(a[i]);
                }
            }
        }

        if(stk.empty()) {
            System.out.println("Balanced equation");
        } else {
            System.out.println("not balanced");
        }
    }

    public static void isBalanced(String s1) {
        int n = s1.length();
        char[] a = s1.toCharArray();
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < n; i++) {
            if(stk.empty()) {
                stk.push(a[i]);
            } else {
                if(stk.peek() != a[i] && stk.peek() == '(') {
                    stk.pop();
                } else {
                    stk.push(a[i]);
                }
            }
        }

        if(stk.empty()) {
            System.out.println("Balanced equation");
        } else {
            System.out.println("not balanced");
        }
    }
}
