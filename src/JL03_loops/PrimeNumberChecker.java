package JL03_loops;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.print("Enter Any Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = 1;
        if (num < 2) {
            System.out.print("Not a Prime Number.");
            sc.close();
            return;
        }
        for (int i = 2; i*i <= num; i++) { // Stop when i² > num because any remaining factor would already have been found as its smaller pair.
            if (num % i == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 0) {
            System.out.print("Not a Prime Number.");
        } else {
            System.out.print("Prime Number.");
        }
        sc.close();
    }
}
