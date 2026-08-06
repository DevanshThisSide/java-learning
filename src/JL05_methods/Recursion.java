package JL05_methods;

import java.util.Scanner;

//Recursion is a technique where a method calls itself to solve a smaller version of the same problem.

public class Recursion {
    static int facto(int n) { // Every recursive method must have a base case inside itself;
        // otherwise, it will keep calling itself indefinitely and eventually cause a StackOverflowError.
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * facto(n - 1);
    }

    static void printAscending(int n) {
        if (n == 0) {
            return;
        }

        printAscending(n - 1);

        System.out.print(n + " ");
    }

    static void test(int n) {
        if (n == 0) {
            System.out.print("\nBase"); // return does NOT end the whole recursion.
            // It ends only the current method call and returns control to the method that called it.
            return;
        }

        System.out.print("\nStart " + n);

        test(n - 1);

        System.out.print("\nEnd " + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.print("Factorial is not possible for -ve numbers.");
        } else {
            System.out.printf("Factorial of %d is : %d", num, facto(num));
        }

        // printAscending(num); // Print 1 to n natural numbers

        //test(num); // Test to understand the recursive call and base case hit
    }
}