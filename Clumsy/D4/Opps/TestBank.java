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
        System.out.println("Account Created succesfully for " + Ownername + "\n");
    }
    //Method First to show user's Info
    void displayinfo(){
        System.out.println("====== User Info ======");
        System.out.println("Account Number " + AccountNumber);
        System.out.println("Account Owner Name " + Ownername);
        System.out.println("Account Balance "+ balance);
        System.out.println("========================");
    }

    //Method to Deposit Money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " Succesfully deposited to Account of " + Ownername);
            System.out.println("Total Balance is " + balance + "\n");
        }
        else {
            System.out.println("Invalid Amount X   \n ");
        }
    }

    //Method to Withdraw Money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            System.out.println(amount + " Withdraw from Your Account Number " + AccountNumber);
            System.out.println("Your Current Balance is  " + balance +"\n");
        }
        else if (amount > balance) {
            System.out.println(" Insufficient Balance ~~~");
            System.out.println("Try Again ~~~ \n");            
        }
        else {
            System.out.println(" Invalid Amount X \n");
        }
    }

    //Method for Money Transfer:
    void transfer(BankAccount TargetAccount,double amount)   {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            TargetAccount.balance += amount;

            System.out.println(amount + " Amount Transfered to " + TargetAccount.Ownername + "'s Account.");
            System.out.println(" Your Current Bank balance is " + this.balance + "\n");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Fund T-T ");
            System.out.println("Pls try Again :) \n");
        }
        else{
            System.out.println("Invalid Amount X \n");
        }
    }

    // Method to Check Balance: 
    double getbalance() { 
        return balance;
    }


}
public class TestBank {
    public static void main(String[] args) {
        
        System.out.println("");
        //Creating New Objects:
        BankAccount ac1 = new BankAccount("263125489732", "Abhinav Patel", 4500);
        BankAccount ac2 = new BankAccount("263149758246", "Priyanka Pandey", 3570);
        BankAccount ac3 = new BankAccount("263175489654", "Shalini Mishra", 5680);

        //To display all the initial information of Users: 
        ac1.displayinfo();
        ac2.displayinfo();
        ac3.displayinfo();

        //Deposit Test: 
        System.out.println("Deposit Test here: ");
        ac1.deposit(250);
        ac2.deposit(.50);
        ac3.deposit(-30);

        //Withdraw Test & Insufficien Test: 
        System.out.println("Withdraw Test here: ");
        ac1.withdraw(5000);
        ac2.withdraw(-20);
        ac3.withdraw(3000);

        System.out.println("");
        //Transfer Test: 
        ac1.transfer(ac2, 2000);
        ac3.transfer(ac1, -50);
        ac2.transfer(ac3, 5000);

        System.out.println("");
        //Final State Info:
        ac1.displayinfo();
        ac2.displayinfo();
        ac3.displayinfo();

        System.out.println("");
        //Get Balance: 
        ac1.getbalance();
        ac2.getbalance();
        ac3.getbalance();

    }
}
