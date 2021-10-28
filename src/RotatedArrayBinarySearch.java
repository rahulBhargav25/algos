public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,1,2,3,4};
        int s = 0;
        int e = arr.length-1;
        int target = 10;
        int m = 0;
        int flag = 0;
        while(s<e+1) {
            m = (s+e)/2;
            if(arr[m]==target) {
                flag=1;
                System.out.println("YES");
                break;
            } else if(arr[m]>=arr[0]) {
                if(target<arr[0]) {
                    s = m +1;
                } else if(target<arr[0]) {
                    e=m-1;
                } else {
                    s=m+1;
                }
            } else {
                if(target>=arr[0]) {
                    e=m-1;
                } else if(target<arr[m]) {
                    e=m-1;
                } else {
                    s=m+1;
                }
            }
        }
        if(flag==0) {
            System.out.println("Tagget ot in array");
        }

    }
}
