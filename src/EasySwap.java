import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EasySwap {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        int[] arr = {};

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(scan.readLine());

        for(int i = 0 ; i < test; i++) {

            int n = Integer.parseInt(scan.readLine());
            arr = new int[n];
            String line = scan.readLine(); // to read multiple integers line
            String[] strs = line.trim().split("\\s+");
            for(int j = 0; j<n;j++) {
                arr[j] = Integer.parseInt(strs[j]);
            }
            int sol = esort(arr);
            if(sol<0) {
                System.out.println("Case "+(i+1)+": "+0);
            } else {
                System.out.println("Case "+(i+1)+": "+sol);
            }


        }
    }


    public static int esort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1) {
                count = swap(arr[i],arr[arr[i]-1]);
            }
        }
        return count-1;
    }


    public static int swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
        count++;
        return count;
    }
}
