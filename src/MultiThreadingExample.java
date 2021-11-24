public class MultiThreadingExample extends Thread{
    public void run() {
        System.out.println("Active thread name = "+
                Thread.currentThread().getName());
        System.out.println("Active Thread priority = "+
                Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        MultiThreadingExample m1 = new MultiThreadingExample();
        MultiThreadingExample m2 = new MultiThreadingExample();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}
