import java.util.Stack;

public class NextBigElement {
    public static void main(String[] args) {
       int[] arr = {5,9,8,2,1,7};
       //nextBig(arr);
        monotoneStackDesc(arr);

    }
    public static void monotoneStackDesc(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int n = arr.length;
        int i =0 ;
        while(i < n) {
            if(stk.empty()) {
                stk.push(i);
                i++;
            } else {
                if(i<n && arr[i]>arr[stk.peek()]) {
                    int a = stk.pop();
                    stk.push(i);
                    i++;
                    //System.out.println(stk);
                    System.out.println(arr[a]+"<"+arr[i]);



                } else {
                    //System.out.println(stk);
                    stk.push(i);
                    i++;
                }
            }
        }
    }
    public static void nextBig(int[] arr) {
        int n = arr.length;
        for(int i =0; i < n; i++) {
            int j = i+1;
            for(j = i+1;j<n; j++) {
                if(arr[i] < arr[j]) {
                    System.out.println(arr[i]+"<"+arr[j]);
                    break;
                }
            }
        }
    }
}
