import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleElephantandCandies {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(in.readLine());
		
		while(testcases>0) {
			
			int sum = 0;
			
			String str = in.readLine();
			System.out.println();
			String[] splitLine = str.split(" ");
			
			int N = Integer.parseInt(splitLine[0]);
			
			int C = Integer.parseInt(splitLine[1]);
			

			
			for(int j = 0; j<N; j++) {
				String str2 = in.readLine();
				
				String[] splitLine2 = str2.split(" ");
				sum += Integer.parseInt(splitLine2[j]);
				
			}
			if(sum<=C) {
				
				System.out.println("Yes");
				testcases--;
				
			} else {
				
				System.out.println("No");
				testcases--;
			}
			
			
		}
	}
}
