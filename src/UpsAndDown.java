public class UpsAndDown {
    public static void main(String[] args) {
        int[] arr = {10,5,2,6,7};
        for(int i =0; i<(arr.length/2);i++) {
            if(arr.length%2==0) {
                if(i%2 == 0) {
                    if(arr[i]<=arr[i+1]) {
                        continue;
                    } else {
                        swap(arr,arr[i],arr[i+1]);
                    }
                } else {
                    if(arr[i]>=arr[i+1]) {
                        continue;
                    } else {
                        swap(arr,arr[i],arr[i+1]);
                    }
                }
            } else {
                if(i%2 == 0) {
                    if(arr[i]<=arr[i+1]) {
                        continue;
                    } else {
                        swap(arr,arr[i],arr[i+1]);
                    }
                } else {
                    if(arr[i]>=arr[i+1]) {
                        continue;
                    } else {
                        swap(arr,arr[i],arr[i+1]);
                    }
                }
            }
        }

//        for(int j = 0; j<arr.length; j++) {
//            System.out.print(arr[j] + " ");
//        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
}
