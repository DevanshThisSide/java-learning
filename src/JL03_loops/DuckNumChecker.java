package JL03_loops;

import java.util.Scanner;

public class DuckNumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int temp = Math.abs(number);
        boolean flag = false;
        while (temp > 0) {
            int currentDigit = temp % 10;
            if (currentDigit == 0) {
                flag = true;
                break;
            }
            temp /= 10;
        }
        if (flag) {
            System.out.print("Duck Number.");
        } else {
            System.out.print("Not a Duck Number.");
        }
        sc.close();
    }
}