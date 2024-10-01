public class BankA extends Bank {
    private int balance = 1000;


    public int getBalance() {
        return balance;
    }

    @Override
    public double applyInterest() {
        return balance * (1 + rate);
    }
}
