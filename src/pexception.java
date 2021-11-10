public class pexception {
    public static void main(String[] args) {
        try {
            hack(40,0);
        } catch(ArithmeticException e) {
            System.out.println("hi");
        }
    }

    static int divide(int h1,int h2) {
        return h1/h2;
    }

    static int hack(int h1,int h2) {
        int hack = 0;
        try {
            hack=divide(h1,h2);
        } catch(ArithmeticException e) {
            System.out.println("hello");
        }
        return hack;
    }
}
