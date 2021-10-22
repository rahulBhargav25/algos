import java.util.Arrays;

public class majorityelement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,1,1};
		int n = arr.length;
		int major = n/2;
		Arrays.sort(arr);
		//int majoritem = 0;
		int c = 1;
//		for(int i = 0; i<n;i++) {
//			
//			for(int j = i+1; j < n; j++) {
//				if(arr[i]>=arr[j]) {
//					majoritem++;
//					if(majoritem==major) {
//						System.out.println(arr[i]);
//					} else {
//						continue;
//					}
//				} else {
//					continue;
//				}
//			}
//		}
		
		for(int i = 1; i < n; i++) {
			if(arr[i]==arr[i-1]) {
				c++;
			} else {
				c=1;
			} if(c>=major) {
				System.out.println(arr[i]);
				break;
			}
		}
		
	}
}
