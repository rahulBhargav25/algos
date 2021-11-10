import java.util.Stack;

public class StackPractise {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,1,2};
    }

    public static void NoOfStacks(int[] arr) {

        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            if(stk.empty()) {
                stk.push(arr[i]);
            } else {
                if(arr[i] >= stk.peek()) {
                    //Stack<Integer> stk1 =
                }
            }
        }
    }
}
