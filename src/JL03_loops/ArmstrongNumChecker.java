package JL03_loops;

import java.util.Scanner;

public class ArmstrongNumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int result = 0;
        int n = 0;
        int temp1 = number;
        int temp2 = number;
        while (temp1 > 0) {
            temp1/=10;
            n++;
        }
        while (temp2 > 0) {
            int digit = temp2 % 10;
            result = (int) (result + Math.pow(digit, n));
            temp2 /= 10;

        }
        if (result == number) {
            System.out.print("Armstrong Number.");
        } else {
            System.out.print("Not an Armstrong Number.");
        }
    }
}