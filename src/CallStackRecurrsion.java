
public class CallStackRecurrsion {

	public static void main(String[] args)  {
		int x =10;
//		String s = "hi";
//		String a = "hi";
//		System.out.println(hey(s, a));
		
		System.out.println(fact(x));
		

	}
	public static int fact(int x) {
		if(x==1) {
			return 1;
		} else {
			return x * fact(x-1);
		}
	}
//	public static String hey(String s, String a) {
//		if(s.equals(a)) {
//			return hey(s, a);
//		} else {
//			return a;
//		}
//	}

}
