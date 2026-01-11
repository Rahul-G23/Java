class MyRunnable implements Runnable {
    String Name;
    MyRunnable(String name) {
        Name = name;
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Name + " is running : " + i);
                Thread.sleep(500);   // Suspend thread for 500 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println(Name + " interrupted");
        }
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable("Thread-1");
        MyRunnable r2 = new MyRunnable("Thread-2");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}