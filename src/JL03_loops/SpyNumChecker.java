package JL03_loops;

import java.util.Scanner;

public class SpyNumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int temp = number;
        int digitSum = 0;
        int digitProduct = 1;
        while (temp > 0) {
            int digit = temp % 10;
            digitSum += digit;
            digitProduct *= digit;
            temp /= 10;
        }
        if (digitSum == digitProduct) {
            System.out.print("Spy Number.");
        } else {
            System.out.print("Not a Spy Number.");
        }
        sc.close();
    }
}