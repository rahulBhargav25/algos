import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargest {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String A,B,C;
		A=in.readLine();
		B=in.readLine();
		C=in.readLine();
		
		int a = Integer.parseInt(A);
		int b = Integer.parseInt(B);
		int c = Integer.parseInt(C);
		if(a>b&&a>c) {
			if(b>c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		} else if(b>a && b>c) {
			if(a>c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else {
			if(a>b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}

	}

}
