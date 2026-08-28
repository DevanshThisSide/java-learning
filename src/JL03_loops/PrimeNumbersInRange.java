package JL03_loops;

import java.util.Scanner;

public class PrimeNumbersInRange {
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Number : ");
        int start = sc.nextInt();
        System.out.print("Enter Ending Number : ");
        int end = sc.nextInt();
        int primeCount = 0;
        int primeSum = 0;
        System.out.print("Prime Numbers : ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                primeCount++;
                primeSum += i;
            }
        }
        System.out.print("\nTotal Prime Numbers in range : " + primeCount);
        System.out.print("\nSum of Prime Numbers in range : " + primeSum);
        sc.close();
    }
}