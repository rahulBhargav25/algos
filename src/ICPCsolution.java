import java.util.Scanner;

public class ICPCsolution {
	static int index = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcases = Integer.parseInt(scan.next());
		for(int l = 0; l<=testcases+1; l++) {

			int k;
			if (scan.hasNextInt()) {
				k = scan.nextInt();
			} else {
				continue;
			}
			int[] arr = new int[k];
			for (int f = 0; f < k; f++) {
				arr[f] = Integer.parseInt(scan.next());
			}
			System.out.println(run(arr));
		}
	}
	public static int run(int[] a) {
		for(int i = a.length-1; i >0; i--) {
			if(a[i]<8) {
				index = i;
				break;
			}
		}
		return index+1;
	}
}

