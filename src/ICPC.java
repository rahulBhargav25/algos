import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ICPC {
	public static void main(String[] args) {
		int[] vibgyor = {1,2,3,4,5,6,7};
		int tikker = 0;
		int tikkerb=0;
		Scanner scan = new Scanner(System.in);
		int testcases = scan.nextInt();
		List<Integer> minimumProblemsToSolve = new ArrayList<Integer>(testcases);
		 for(int i = 0; i <testcases;i++) {
			 tikker=0;
			 tikkerb=0;
			 int n = scan.nextInt();
			 int[] arr = new int[n];
			 for(int j = 0; j<n;j++) {
				 arr[j] = scan.nextInt();
			
			 }
			 for(int k = 0; k <7;k++) {
//				 System.out.println(k);
				 for(int l = 0; l<n;l++) {
					 if(arr[l]==vibgyor[k]) {
						 tikker++;
						 System.out.println("tikker"+tikker);
						 
					 } else {
							 if(arr[k]>7) {
								 tikkerb++;
								 System.out.println("tikker2 "+tikkerb);
							 } else {
								break;
							 }
							 
						 
					 }
				 }
				 continue;
			 }
			 minimumProblemsToSolve.add(tikker);
		 }
		 
		 System.out.println(minimumProblemsToSolve+"\n");
		 
		
		
		
		
	}
}
