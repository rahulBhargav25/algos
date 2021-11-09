public class NextBigElement {
    public static void main(String[] args) {
       int[] arr = {5,9,8,2,1,7};
       nextBig(arr);
    }

    public static void nextBig(int[] arr) {
        int n = arr.length;
        for(int i =0; i < n; i++) {
            int j = i+1;
            for(j = i+1;j<n; j++) {
                if(arr[i] < arr[j]) {
                    System.out.println(arr[i]+"<"+arr[j]);
                    break;
                }
            }
        }
    }
}
