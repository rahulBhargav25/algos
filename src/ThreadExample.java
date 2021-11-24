public class ThreadExample extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is activated");
    }

    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        t1.start();
    }
}
