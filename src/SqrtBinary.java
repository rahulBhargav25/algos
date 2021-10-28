public class SqrtBinary {
    public static void main(String[] args) {
        int target = 2576;


        int start = 0;
        int end = 30000;
        int ans=0;
        int m = (int)(start+end)/2;
        int flag = 0;
        while(start<=end) {
            m=(int)(start+end)/2;
            if(m*m == target) {
               ans=m;
                break;
            } else if(m*m<target) {
                ans=m;
                start=m+1;
            } else {
                end=m-1;
            }

        }
        System.out.println(ans);
    }
}
