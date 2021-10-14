
public class QuickSort {
	
	static int[] arr = {10,5,45,34,67,2,34,78,6,4,1,3,4};
	int pivot;
	static int low = 0;
	static int high = arr.length-1;
	static QuickSort QS = new QuickSort();

	public static void main(String[] args) {
//		QuickSort QS = new QuickSort();
		QS.Quickso(arr, low, high);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}
	
	public int Partition(int[] arr, int low, int high) {
		pivot = arr[low];
		int i = low;
		int j = high;
		while(i<=j) {
			do {
				++i;
				
			} while(arr[i]<=pivot && j < high); 
			
			do {
				j--;
			} while(arr[j]>pivot);
			if(i<j) {
				
				int temp = arr[j];
				
				arr[j] = arr[i];
				arr[i] = temp;
				
			}
		}
		int temp = arr[j];
		arr[j] = arr[low];
		arr[low] = temp;
		return j;
	} 
	
	public void Quickso(int[] arr, int low, int high) {
		if(low<high) {
			int k = QS.Partition(arr, low, high);
			QS.Quickso(arr, low, k);
			QS.Quickso(arr, k+1, high);
		}
	}
}