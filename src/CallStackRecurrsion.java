
public class CallStackRecurrsion {

	public static void main(String[] args) {
		int x =5;
		
		System.out.println(fact(x));
		

	}
	public static int fact(int x) {
		if(x==1) {
			return 1;
		} else {
			return x * fact(x-1);
		}
	}

}
