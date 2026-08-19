package JL03_loops;

import java.util.Scanner;

public class PalindromeNumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int reverseNumber = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            int rem = tempNumber % 10;
            reverseNumber = rem + reverseNumber * 10;
            tempNumber = tempNumber / 10;
        }
        System.out.print("Output : ");
        if (reverseNumber == number) {
            System.out.printf("%d is Palindrome.",number);
        } else {
            System.out.printf("%d is not Palindrome.",number);
        }
    }
}