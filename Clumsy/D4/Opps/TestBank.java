package Clumsy.D4.Opps;


class BankAccount {
    //Properties
    String Ownername;
    String AccountNumber;
    double balance;

    //Constructor

    BankAccount( String AccountNumber,String Ownername, double initialamount) {
        this.Ownername = Ownername;
        this.AccountNumber = AccountNumber;
        this.balance = initialamount;
        System.out.println("Account Created succesfully for " + Ownername);
    }
    //Methode First to show user's Info
    void displayinfo(){
        System.out.println("====== User Info ======");
        System.out.println("Account Number " + AccountNumber);
        System.out.println("Account Owner Name " + Ownername);
        System.out.println("Account Balance "+ balance);
        System.out.println("========================");
    }

    //Methode to Deposit Money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " Succesfully deposited to Your Account " + AccountNumber);
            System.out.println("Total Balance is " + balance);
        }
        else {
            System.out.println("Invalid Amount X ");
        }
    }

    //Methode to Withdraw Money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            System.out.println(amount + " Withdraw from Your Account " + AccountNumber);
            System.out.println("Your Current Balance is  " + balance);
        }
        else if (amount > balance) {
            System.out.println(" Insufficient Balance ~~~");
            System.out.println("Try Again ~~~");            
        }
        else {
            System.out.println(" Invalid Amount X");
        }
    }


}
public class TestBank {
    
}
