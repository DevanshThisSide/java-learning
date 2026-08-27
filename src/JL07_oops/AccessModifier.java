package JL07_oops;

import java.util.Scanner;

// Bank Account Management System
class BankAccount {
    private int accountNumber; // Instance variable
    private String accountHolderName;
    private double accountBalance;

    public void setAccountNumber(int accountNumber) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid Account Number.");
        }
        // 'this.accountNumber' refers to the instance variable above
        // 'accountNumber' refers to the parameter in the Method brackets
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName.isBlank()) {
            System.out.println("Invalid Account Holder Name.");
        } else {
            this.accountHolderName = accountHolderName;
        }
    }

    public void setAccountBalance(double accountBalance) {
        if (accountBalance >= 0) {
            this.accountBalance = accountBalance;
        } else {
            System.out.println("Invalid Account Balance.");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void printAccountDetails() {
        System.out.println("------ Account Details ------");
        System.out.println("Account Number      : " + getAccountNumber());
        System.out.println("Holder Name         : " + getAccountHolderName());
        System.out.printf("Account Balance     : ₹%.2f%n", getAccountBalance());
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Private fields prevent direct access from outside BankAccount.
        // Access is controlled through public getters and setters.
        BankAccount account = new BankAccount();
        System.out.print("Enter Account Number : ");
        account.setAccountNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Account Holder Name : ");
        account.setAccountHolderName(sc.nextLine());
        System.out.print("Enter Account Balance : ");
        account.setAccountBalance(sc.nextDouble());
        account.printAccountDetails();
        sc.close();
    }
}
/*
 1. private
     - Accessible only within the same class.
     - Provides the highest level of data hiding.
     - Commonly used with getters and setters for encapsulation.

 2. default (no modifier) (also called package-private)
     - Accessible within the same package.
     - Not accessible from classes in a different package.

 3. protected
     - Accessible within the same package.
     - Also accessible in subclasses from different packages
       through inheritance.

 4. public
     - Accessible from any class/package, provided the class
       itself is accessible.

  ACCESS LEVEL: private < default < protected < public
 */