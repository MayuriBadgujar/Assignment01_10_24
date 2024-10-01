public class BankB extends Bank{
    private int balance = 2000;


    public int getBalance() {
        return balance;
    }

    @Override
    public double applyInterest() {
        return balance * (1 + rate);
    }
}
