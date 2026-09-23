class Account {
    String accountHolder;
    int accountNumber;
    Account(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
    void displayAccountDetails() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
    }
}
class SavingsAccount extends Account {
    double interestRate;
    SavingsAccount(String accountHolder, int accountNumber,double interestRate) {
        super(accountHolder, accountNumber);
        this.interestRate = interestRate;
    }
    
    void displaySavingsDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    double minimumBalance;
    CurrentAccount(String accountHolder, int accountNumber,double minimumBalance) {
        super(accountHolder, accountNumber);
        this.minimumBalance = minimumBalance;
    }
    void displayCurrentDetails() {
        displayAccountDetails();
        System.out.println("Minimum Balance : " + minimumBalance);
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    String benefits;
    PremiumSavingsAccount(String accountHolder, int accountNumber,
    double interestRate, String benefits) {
    super(accountHolder, accountNumber, interestRate);
    this.benefits = benefits;
    }
    void displayPremiumDetails() {
    displaySavingsDetails();
    System.out.println("Benefits : " + benefits);
    }
}

public class Account_main {
    public static void main(String[] args) {
    SavingsAccount s = new SavingsAccount("Ajay", 1001, 5.5);
    CurrentAccount c = new CurrentAccount("Dhoni", 1002, 10000);
    PremiumSavingsAccount p = new PremiumSavingsAccount("Kumar", 1003, 7.0, "Free ATM and Insurance");
    System.out.println("----- Savings Account -----");
    s.displaySavingsDetails();
    System.out.println("\n----- Current Account -----");
    c.displayCurrentDetails();
    System.out.println("\n----- Premium Savings Account -----");
    p.displayPremiumDetails();
 }
}
