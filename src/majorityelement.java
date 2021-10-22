import java.util.Arrays;

public class majorityelement {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,1,1,2};
		int n = arr.length;
		
		 //--time complexity nlogn
		//int majoritem = 0;
		int c = 1;
		int dominantElement = -1; 

//Bruteforce approch		
/*		for(int i = 0; i<n;i++) {
			
			for(int j = i+1; j < n; j++) {
				if(arr[i]>=arr[j]) {
					majoritem++;
					if(majoritem==major) {
						System.out.println(arr[i]);
					} else {
						continue;
					}
				} else {
					continue;
				}
			}
		}*/
		// one where array is sorted we can find the dominant element using for loop
/*		for(int i = 1; i < n; i++) {    //--time complexity n
			if(arr[i]==arr[i-1]) {
				c++;
			} else {
				c=1;
			} if(c>=major) {
				System.out.println(arr[i]);
				break;
			}
		}*/
		
		//simplest approach ---also nlogn but no need of for loop
		//we can directly access the mid element after sorting it will be the the dominant element
		
//		System.out.println(arr[n/2]);
		
	/*
	 * mo's algorithm*/
		
		for(int i = 1; i < n-1; i++) {
			if(arr[i]==arr[i-1]) {
				c++;
				
			} else {
				
				if(c==0) {
					dominantElement = arr[i];
					
				} else {
					c--;
					
				}
			} 
		}
		System.out.println(dominantElement);
		
		
		
		
	}
}  //--total time complexity nlogn
