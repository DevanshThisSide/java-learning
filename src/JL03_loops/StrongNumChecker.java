package JL03_loops;

import java.util.Scanner;

public class StrongNumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int temp = number;
        long result = 0;
        while (temp > 0) {
            int digit = temp % 10;
            long fact = 1;
            int j = 1;
            while (j <= digit) {
                fact *= j;
                j++;
            }
            result += fact;
            temp /= 10;
        }
        if (result == number) {
            System.out.print("Strong Number.");
        } else {
            System.out.print("Not a Strong Number.");
        }
    }
}