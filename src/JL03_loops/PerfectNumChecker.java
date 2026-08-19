package JL03_loops;

import java.util.Scanner;

public class PerfectNumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.print("Perfect Number.");
        }else{
            System.out.print("Not a Perfect Number.");
        }
        sc.close();
    }
}