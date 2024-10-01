public class Bank {
       //10% means 10/100===0.1
     protected static double rate=0.1;
    public int getBalance() {
        return 0;
    }

    public double applyInterest() {
        return getBalance() * (1 + rate);
    }
}
