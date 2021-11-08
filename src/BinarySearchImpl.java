import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchImpl {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;

        int mid = 0;
        int target = 5;
        int flag = 0;
        while(start<end+1) {
            mid = (start+end)/2;
            if(arr[mid]==target) {
                flag=1;
                System.out.println(mid);
                break;
            } else if(arr[mid]<target) {
                start=mid+1;
            } else {
                end = mid-1;
            }
        }
        if(flag==0) {
            System.out.println("Element doesnt belong to array");
        }
    }
}
