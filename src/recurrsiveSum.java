
public class recurrsiveSum {
	static int i = 0;
	static int x;
	public static void main(String[] args) {
		int[] arr= {2,4,6,7};
		int numOfElements = number(arr) -1;
		System.out.println(sum(arr, arr.length));
		System.out.println(numOfElements);

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

}
