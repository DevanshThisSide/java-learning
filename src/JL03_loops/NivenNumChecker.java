package JL03_loops;

import java.util.Scanner;

public class NivenNumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int temp = number;
        int digitSum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            digitSum += digit;
            temp /= 10;
        }
        if (number % digitSum == 0) {
            System.out.print("Niven Number.");
        } else {
            System.out.print("Not a Niven Number.");
        }
        sc.close();
    }
}