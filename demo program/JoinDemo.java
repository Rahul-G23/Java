class MyThread extends Thread {
    public void run() {
        System.out.println("Child thread executing");
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();
        System.out.println("Main thread resumes");
    }
}
