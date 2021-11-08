import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QualifyingToPre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for(int i =0;i<test;i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            Integer[] arr = new Integer[n];
            for(int j = 0; j < n; j++) {
                arr[j] = scan.nextInt();
            }
            comp(arr,k);


        }

    }
    public static void comp(Integer[] arr, int k) {
        int count = 0;
        Arrays.sort(arr, Collections.reverseOrder());
        int s = arr[k-1];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>=s) {
                count++;
            }
        }
        System.out.println(count);
    }
}
