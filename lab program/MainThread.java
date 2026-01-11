class MyThread extends Thread {
    MyThread(String name) {
        super(name);
        start();
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + getName() + " - Count: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
    }
}
public class MainThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("MyThread");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread - Count: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread completed");
    }
}
