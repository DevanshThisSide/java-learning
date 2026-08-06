package JL05_methods;

import java.util.Scanner;

public class FibonacciUsingRecursion {
    static int findFibonacci(int n) {
//        if (n == 1) {
//            return 0;
//        } else if (n == 2) {
//            return 1;
//        }
        if (n == 1 || n == 2) {
            return n - 1;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term number to find its Fibonacci value : ");
        int term = sc.nextInt();
        if (term < 1) {
            System.out.print("Invalid Input.");
        } else {
            System.out.printf("The Fibonacci value at term %d is : %d", term, findFibonacci(term));
        }
        sc.close();
    }
}
//Recursive Fibonacci is easy to understand but inefficient because it calculates the same Fibonacci terms multiple times.
//Time Complexity : O(2^n)
//Space Complexity : O(n)