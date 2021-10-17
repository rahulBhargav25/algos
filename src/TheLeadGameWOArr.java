import java.util.Scanner;

public class TheLeadGameWOArr {

	public static void main(String[] args) {
		int L = -1;
		int W = -1;
		int p1=0;
		int p2=0;
		int r;
		Scanner in = new Scanner(System.in);
		r = in.nextInt();
		for(int i = 0 ; i < r; i++) {
			p1=in.nextInt();
			p2=in.nextInt();
			
			if(p1>p2) {
				L=p1-p2;
				W=1;
			} else {
				L=p2-p1;
				W=2;
			}
		}
		System.out.println(W+" "+L);
		

	}

}
