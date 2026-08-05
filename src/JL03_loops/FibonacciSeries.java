package JL03_loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter the number of terms upto print the Fibonacci Series : ");
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        if (terms <= 0) {
            System.out.print("Enter a valid number of terms.");
            return;
        }
        if (terms == 1) {
            System.out.print(0);
            return;
        }
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");

        for (int i = 2; i < terms; i++) {
            int sum = n1 + n2;
            System.out.print(sum + " ");
            n1 = n2;
            n2 = sum;
        }
        sc.close();
    }
}
