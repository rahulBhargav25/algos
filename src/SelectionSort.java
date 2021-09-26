
public class SelectionSort {

	public static void main(String[] args) {
		
		
		int[] arr = {1,4,3,6,2,5};
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			
			
			System.out.println(arr[i]+"  ");
			
		}		
		findSmallest(arr);
		for(int i = 0; i < n; i++) {
			
			
			System.out.print(arr[i]+"  ");
			
		}
		

	}
	
	public static void findSmallest(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int index = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

}
