import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StackArrangeDisks {
    public static void main(String[] args) {

    }



    public static void ArrangeDiskUsingStack(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(stk.empty()) {
                stk.push(arr[i]);
                list.add(arr[i]);
            } else {
                if(stk.peek() < arr[i]) {
                    stk.push(arr[i]);
                    list.add(arr[i]);
                } else {
                    for(int j = 0; j < list.size(); j++) {
                        
                    }
                }
            }
        }
    }




    public static int binarySearch(int[] arr, int low, int high, int target) {
        int mid = 0;
        while(low <= high) {
            mid = (low+high)/2;

            if(arr[mid] == target) {
                target = mid;
            } else {
                if(mid > target) {
                    high = mid-1 ;
                } else {
                    low = mid +1;
                }
            }
        }
        return target;
    }

}
