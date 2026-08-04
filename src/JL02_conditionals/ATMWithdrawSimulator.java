package JL02_conditionals;

import java.util.Scanner;

public class ATMWithdrawSimulator {
    public static void main(String[] args) {
        int remainingBalance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Initial Account Balance : ₹" + remainingBalance);
        while (true) {
            System.out.print("Enter withdrawal amount : ");
            int withdrawAmount = sc.nextInt();
            if (withdrawAmount < 0) {
                System.out.print("Invalid withdrawal amount.");
            } else if (withdrawAmount > remainingBalance) {
                System.out.print("Withdrawal amount exceeds available balance.\n" +
                        "Try Again.");
            } else if (withdrawAmount == 0) {
                System.out.print("Please enter an amount greater than ₹0.");
            } else if ((remainingBalance - withdrawAmount) < 1000) {
                System.out.print("Insufficient balance. Minimum balance of ₹1000 must be maintained.");
            } else {
                System.out.println("Withdrawal Successful.");
                remainingBalance -= withdrawAmount;
                System.out.print("Remaining Balance : ₹" + remainingBalance);
            }
            System.out.print("\nYou want to make another withdrawal (Y/Yes or N/No) : ");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")) {
                System.out.print("Thank You for Visiting.");
                break;
            } else if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("Yes")) {
                // pass
            } else {
                System.out.print("Invalid Choice.\nProgram Ended.");
                break;
            }
        }
        sc.close();
    }
}