public class ThreadWithInterfaceImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is activated");
    }

    public static void main(String[] args) {
        ThreadWithInterfaceImpl t1 = new ThreadWithInterfaceImpl();
        Thread th1 = new Thread(t1);
        th1.start();

    }
}
