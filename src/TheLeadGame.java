import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TheLeadGame {
static int p1lead=0, p2lead=0;
	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(in.readLine());


		int[] p1 = new int[r];
		int[] p2 = new int[r];
		for(int k=0;k<r;k++) {
			String str = in.readLine();
			String[] splitLine = str.split(" ");
			p1[k] = Integer.parseInt(splitLine[0]);
			p2[k] = Integer.parseInt(splitLine[1]);
			
		}
		in.close();
		int i = 0, j = 0, n=p1.length;
		while(n>0 && i<p1.length) {
			if(p1[i]>p2[j] ) {
				if(p1lead > p1[i]-p2[j]) {
					p1lead = p1lead+0;
					i++;
					j++;	
				} else {
					p1lead = p1[i]-p2[j];
					i++;
					j++;	
				}
				
			} else if(p2[j]>p1[i]){
				if(p2lead > p2[j]-p1[i]) {
					p2lead = p2lead+0;
					i++;
					j++;
				} else {
					p2lead = p2[j]-p1[i];
					i++;
					j++;
				}
			} else {break;}
		}
		if(p1lead>p2lead) {
			System.out.println(p1lead);
		} else {
			System.out.println(p2lead);
		}

	}

}
