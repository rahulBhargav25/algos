
public class BinarySearch {

	public static void main(String[] args) {
		int n = 5;
		int low = 0;
		int high = n - 1;
		int[] arr = {2,3,4,5,6};
		int item = 6;
		while(low<=high) {
			int mid = (low+high)/2;
			int guess = arr[mid];
			if(guess==item) {
				System.out.println("item found at "+mid+" the specified index");
				break;
			}
			else if(guess>item) {
				high = mid-1;
			} 
			else if(guess<item){
				low = mid+ 1;
			}
			else {
				System.out.println("Item doesnt exist");
			}
		}

	}

}
