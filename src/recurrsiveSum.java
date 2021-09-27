
public class recurrsiveSum {
	static int i = 0;
	static int j=-1;
	static int x;
	public static void main(String[] args) {
		int[] arr= {7,6,50,4,12,25,35,40,5,11};
		int numOfElements = number(arr) -1;
		System.out.println(sum(arr, arr.length));
		System.out.println(numOfElements);
		System.out.println(biggestNumber(arr));

	}
	
	public static int sum(int[] arr, int n) {
		
		if(n<=0) {
			return 0;
		} else {
			return sum(arr, n-1) +arr[n-1];
		}
	}
	
	public static int number(int[] arr) {
		
		if(arr.length!=0 && x<=arr.length) {
			x++;
			number(arr);
			return x;
		} else {
			return 0;
		}
	}
	
	public static int biggestNumber(int[] arr) {
		j++;
		if(j!=arr.length-1 && arr[j]>arr[j+1] ) {
			int temp = arr[j+1];
			arr[j+1] = arr[j];
			arr[j] = temp;
			
			biggestNumber(arr);
			return arr[j];
			
		} else if (j!=arr.length-1 && arr[j]<arr[j+1]){
			biggestNumber(arr);
			return arr[j];
		} else {
			return 0;
		}
	}

}
