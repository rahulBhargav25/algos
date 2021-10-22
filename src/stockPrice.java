
public class stockPrice {
	public static void main(String[] args) {
		int[] arr= {5,2,6,9,8,11};
		int max_profit = 0;
		int min_price=Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			int current_profit = arr[i] - min_price;
			max_profit = Math.max(max_profit, current_profit);
			min_price = Math.min(min_price, arr[i]);
		}
		
		System.out.println(max_profit);
	}
}
