package JL03_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.print("Enter the number : "); // after 20! behave abnormal due to long overflow
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        if (n < 0) {
            System.out.print("Enter a valid number to perform operation.");
            sc.close();
            return;
        }
        if (n == 0 || n == 1) {
            System.out.printf("Factorial of the given number is : %d", fact);
            sc.close();
            return;
        }
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        // While Loop
//        int j = 1;
//        while (j <= n) {
//            fact *= j;
//            j++;
//        }
        System.out.printf("Factorial of the given number is : %d", fact);
        sc.close();
    }
}
