public class recursionTuto {
    public static void main(String[] args) {
        int nuber = 17;
        int result = factorial(nuber);
        System.out.println(result);
    }
    static int factorial(int n) {
        if(n!=0) {
            return n * factorial(n-1);
        } else {
            return 1;
        }
    }
}
