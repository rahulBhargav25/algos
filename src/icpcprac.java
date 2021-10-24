public class icpcprac {
    static  int index = 0;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = {8,7,6,5,4,3,2,1,8};
        int c = 0;

//        for(int i= 0; i<7;i++) {
//
//            for(int j=0; j<arr2.length;j++) {
//                if(arr2[j]==arr[i]) {
//                    c++;
//                    System.out.println(c);
//                } else {
//
//                }
//            }
//        }
        for(int i = arr2.length-1; i >0; i--) {
            if(arr2[i]<8) {
                index = i;
                break;
            }
        }
        System.out.print(index+1);
    }
}
