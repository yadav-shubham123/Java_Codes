public class BankA extends Bank {
    private int balance = 100;

    @Override
    public void getBalance() {
        System.out.println("Balance in Bank A: $" + balance);
    }
}