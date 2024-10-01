import java.util.*;
public class BankMain {
    public static void main(String args[]) {

        System.out.println("-------------------------------------------");
        BankA bankA = new BankA();
        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("BankA interest: $" + bankA.applyInterest());
        System.out.println("------------------------------------------");
        BankB bankB = new BankB();
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println(" BankB interest: $" + bankB.applyInterest());
        System.out.println("-------------------------------------------");
        BankC bankC = new BankC();
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
        System.out.println(" BankC  interest: $" + bankC.applyInterest());
    }
}
/*
-------------------------------------------
Balance in Bank A: $1000
BankA interest: $1100.0
------------------------------------------
Balance in Bank B: $2000
 BankB interest: $2200.0
-------------------------------------------
Balance in Bank C: $3000
 BankC  interest: $3300.0000000000005
 */