import java.util.Arrays;

public class BinarySearch {
	static int low = 0;
	public static void main(String[] args) {
		
		
		
		int[] arr = {2,3,4,5,6};
		int n = arr.length;
		int high = n - 1;
		int item = 6;
		
		//Binary search using recursion
		int ans = recurrBinarySearch(arr, high, item);
		System.out.println(ans + " is found at index "+findIndex(arr, ans));
		
		
		
		
		
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
	
    public static int findIndex(int arr[], int t)
    {
 
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }
	
	
	public static int recurrBinarySearch(int[] arr, int high, int item) {
		int mid = (low+high)/2;
		int guess =arr[mid];
		if(guess==item) {
			return guess;
		} else if(guess>item) {
			high = mid-1;
			return recurrBinarySearch(arr, high, item);
		} else if(guess<item) {
			low = mid+1;
			return recurrBinarySearch(arr, high, item);
		} else {
			return 0;
		}
	}

}
