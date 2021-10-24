import java.util.Scanner;

public class JudgingDelay {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {


            int c = 0;
            int n = scan.nextInt();
            int k = 2 * n;
            int[] a = new int[k];
            for (int i = 0; i < k; i++) {
                a[i] = scan.nextInt();
            }

            int s = 0;
            int j = 1;
            for (int i = 0; i < k - 1; i++) {
                System.out.println(s + " ");
                if (a[j] - a[s] > 5) {
                    c++;

                }
                s += 2;
                j += 2;
            }
            System.out.println(c);


        }
    }

}
/*
*         for(int i = 0; i<=testcases; i++) {
            int c = 0;
            int n;
            if (scan.hasNextInt()) {
                n = scan.nextInt();
            } else {
                continue;
            }

            for (int j = 0; j < n; j++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                if((b-a)>5) {
                    c++;

                }
            }

            System.out.println(c);


        }
* */