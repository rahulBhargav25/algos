import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) throws IOException {
        //int[] arr = {1,1,2};


        int[] arr = {};
        //Scanner scan = new Scanner(System.in);
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
            even(arr,0);
        }

    }

    public static void even(int[] arr, int sum1) {
        for(int l :arr) {
            sum1+=l;
            System.out.println(sum1);

        }
        if(sum1 %2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
