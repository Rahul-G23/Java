class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class IsAliveDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        System.out.println(t.isAlive()); // false
        t.start();
        System.out.println(t.isAlive()); // true
    }
}