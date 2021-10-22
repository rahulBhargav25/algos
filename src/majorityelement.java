
public class majorityelement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,1,1};
		int n = arr.length;
		int major = n/2;
		int majoritem = 0;
		for(int i = 0; i<n;i++) {
			
			for(int j = i+1; j < n; j++) {
				if(arr[i]>=arr[j]) {
					majoritem++;
					if(majoritem==major) {
						System.out.println(arr[i]);
					} else {
						continue;
					}
				} else {
					continue;
				}
			}
		}
	}
}
