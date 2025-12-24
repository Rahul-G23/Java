class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
public class DivisionDemo {
    static void divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.");
        } else {
            int result = a / b;
            System.out.println("Result: " + result);
        }
    }
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            divide(num1, num2);
        } catch (DivisionByZeroException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}