import mypack.MyOperations;

public class packageDemo {

    public static void main(String[] args) {

        MyOperations obj = new MyOperations();

        obj.displayMessage();

        int result = obj.add(10, 20);
        System.out.println("Sum = " + result);
    }
}