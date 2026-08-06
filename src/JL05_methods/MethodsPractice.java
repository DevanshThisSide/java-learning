package JL05_methods;

import java.util.Scanner;

public class MethodsPractice {
    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d : %d%n", n, i, n * i);
//            if (i != 10) {
//                System.out.println();
//            }
        }
    }

    static int sumToN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumToN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print its Multiplication Table : ");
        int num1 = sc.nextInt();
        printTable(num1);
        System.out.print("Enter n to print the sum of 1 to n : ");
        int num2 = sc.nextInt();
        System.out.printf("The sum of 1 to %d is : %d ", num2, sumToN(num2));
        sc.close();
    }
}
