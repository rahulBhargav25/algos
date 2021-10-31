import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        //int[] arr = {1,1,2};
        int win = 0;
        int sum1 = 0;
        int sum2=0;
        int[] arr = {};
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for(int i = 0 ; i < test; i++) {
            int n = scan.nextInt();
            arr = new int[n];
            for(int j = 0; j<n;j++) {
                arr[j] = scan.nextInt();
            }
            even(arr,0,0);
        }

    }

    public static void even(int[] arr, int sum1, int sum2) {
        for(int i = 0; i < arr.length;i++) {
            if(i%2 != 0) {
                arr[i] = arr[i]*-1;
                sum1+=arr[i];
            } else {
                arr[i] = arr[i];
                sum1+=arr[i];
            }


            if(i%2 != 0) {
                arr[i] = arr[i];
                sum2 += arr[i];
            } else {
                arr[i] = arr[i]*1;
                sum2 += arr[i];
            }

        }
        if(sum1 %2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
