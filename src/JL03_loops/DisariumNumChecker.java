package JL03_loops;

import java.util.Scanner;

// A number where the sum of its digits raised to their respective positions equals the number itself.
public class DisariumNumChecker {

    static int noOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        int digitPosition = noOfDigits(number);
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digitPosition);
            digitPosition--;
            temp /= 10;
        }
        if (sum == number) {
            System.out.print("Disarium Number.");
        } else {
            System.out.print("Not a Disarium Number.");
        }
        sc.close();
    }
}