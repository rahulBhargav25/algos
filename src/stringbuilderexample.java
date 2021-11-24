public class stringbuilderexample {

    static void sum() {
        System.out.println("here");
    }

    class child {
        static void sum(int a, int b) {
            int r = a+b;
            System.out.println(r);
        }
    }

    public static void main(String[] args) {

        sum();
        child.sum(4,5);

    }
}
