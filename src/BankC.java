public class BankC extends Bank{
    private int balance = 3000;


    public int getBalance() {
        return balance;
    }

    @Override
    public double applyInterest() {
        return balance * (1 + rate);
    }
}
