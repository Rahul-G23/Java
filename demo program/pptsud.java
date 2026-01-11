class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount {
    double balance;
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) throw new InsufficientBalanceException("Insufficient balance!");
        balance -= amount;
    }
}
public class pptsud {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.balance = 500;
        try {
            acc.withdraw(700);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
