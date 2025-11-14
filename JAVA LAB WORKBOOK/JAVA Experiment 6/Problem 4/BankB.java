public class BankB extends Bank {
    private int balance = 150;

    @Override
    public void getBalance() {
        System.out.println("Balance in Bank B: $" + balance);
    }
}
