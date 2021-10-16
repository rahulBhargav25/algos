import java.util.Arrays;

public class BSImpl {
	public static void main(String[] args) {
		int[] arr = {2,4,3,1,7,11};
		Arrays.sort(arr);
		int findSum = 10;
		int s = 0;
		int e = arr.length-1;
		while(s<e) {
			if(arr[s]+arr[e] > findSum) {
				e--;
				
			} else if(arr[s]+arr[e] < findSum) {
				s++;
				
			} else {
				System.out.println("1st index "+ s+", 2nd index " + e);
				break;
			}
		} 
		if(s==e) {
			System.out.println("element pair doesnt exist");
		}
	}
}
