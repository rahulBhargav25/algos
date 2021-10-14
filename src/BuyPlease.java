import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyPlease {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(
			    System.in));
			    
			String[] input = new String[4];
			int a,b,x,y;
			System.out.println("Enter");
			input = in.readLine().split(" ");
			a=Integer.parseInt(input[0]);
			b=Integer.parseInt(input[1]);
			x=Integer.parseInt(input[2]);
			y=Integer.parseInt(input[3]);
			
			int result = a*x+b*y;
			System.out.println(result);

	}

}
