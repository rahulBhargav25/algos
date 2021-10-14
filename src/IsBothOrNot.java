import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//you're given a number N. If N is divisible by 5 or 11 but not both 
//then print "ONE"(without quotes). If N is divisible by both 5 and 11 then 
//print "BOTH"(without quotes). If N is not divisible by 5 or 11 then print "NONE"(without quotes).
public class IsBothOrNot {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String n;
		n = in.readLine();
		int N = Integer.parseInt(n);
		in.close();
		if(N%11==0 && N%5==0) {
			System.out.println("BOTH");
		} else if(N%11==0 || N%5==0) {
			System.out.println("ONE");
		} else {
			System.out.println("NONE");
		}
		
		

	}

}
