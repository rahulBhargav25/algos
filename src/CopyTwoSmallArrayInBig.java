
public class CopyTwoSmallArrayInBig {
	public static void main(String[] args) {
		int[] arr1 = {2,4,7,9};
		int[] arr2 = {1,3,5,11,13};
		
		int n = arr1.length+arr2.length;
		int[] bigarr = new int[n];
		int i = 0, j =0, k=0;
		while(j<arr2.length) {
			if(i<arr1.length) {
				if(arr1[i]<arr2[j]) {
					bigarr[k]=arr1[i];
					k++;
					i++;
					
				} else if(arr1[i]>arr2[j]) {
					bigarr[k]=arr2[j];
					k++;
					j++;					
				}
			} else {
				 if(j<arr2.length) {
						bigarr[k]=arr2[j];
						k++;
						j++;			
					} else {break;}
			}

		}
		for(int z = 0; z<bigarr.length;z++) {
			System.out.println(bigarr[z]+" ");
		}
	}
}
