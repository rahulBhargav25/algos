import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        String s = "abcde";

        int n = s.length();
        char[] a = s.toCharArray();
//
//        char[] a1 = new char[s.length()];
//
//        for(int i = 0; i < n; i++) {
//            a1[i] = a[(n-1)-i];
//        }
//        System.out.println(a1.getClass());


        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < n; i++) {
            stk.push(a[i]);
        }
        for(int i = 0; i<n; i++) {
            System.out.print(stk.pop() + " ");
        }


    }
}
