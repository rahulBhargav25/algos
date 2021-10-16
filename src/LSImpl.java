
public class LSImpl {
	public static void main(String[] args) {
		int[] arr = {2,4,3,1,7,11};
		int findSum = 10;
		for(int i = 0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]+arr[j]==findSum) {
					System.out.println("Two elements are present at index " + i+ "and " + j);
				} else {continue;}
			}
		}
		
	}
}
