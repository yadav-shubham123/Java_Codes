public class BankC extends Bank {
    private int balance = 200;

    @Override
    public void getBalance() {
        System.out.println("Balance in Bank C: $" + balance);
    }
}