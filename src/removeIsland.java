import java.util.Arrays;

public class removeIsland {
    public static void main(String[] args) {
        int[][] arr = {
                {1,0,0,0,0,0},
                {0,1,0,1,1,1},
                {0,0,1,0,1,0},
                {1,1,0,0,1,0},
                {1,0,1,1,0,0},
                {1,0,0,0,0,1}
        };

        for(int i = 1; i<5;i++) {
            for(int j =1;j<5;j++) {
                if(arr[i][j] == 1) {
                    if( arr[i][j-1] == 1 && arr[i][j] == 1 ) {
                    } else if(arr[i][j+1] != 1 || arr[i][j-1] != 1) {
                        arr[i][j] = 0;
                    }
                } else {
                    continue;
                }
            }
        }

        for (int[] row : arr)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));

    }
}
