import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SortingProblem {
    public static void main(String[] args) throws IOException {
        //int[] arr = {5,2,3,1,4};
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        int[] arr = {};
        for(int i =0; i < test;i++) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scan.nextInt();

            }


            binarySearch(arr,x);


        }
    }

    public static void binarySearch(int[] arr, int target) {

        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;

        int mid = 0;

        int flag = 0;
        while(start<end+1) {
            mid = (start+end)/2;
            if(arr[mid]==target) {
                flag=1;
                System.out.println(mid);
                break;
            } else if(arr[mid]<target) {
                start=mid+1;
            } else {
                end = mid-1;
            }
        }
        if(flag==0) {
            System.out.println("Element doesnt belong to array");
        }
    }


}
