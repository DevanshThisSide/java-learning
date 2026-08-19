package JL03_loops;

import java.util.Scanner;

public class AutomorphicNumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int temp = number;
        int square = (int) Math.pow(number, 2);
        System.out.println("Square of " + number + " is " + square + ".");
        int squareDigits = 0;
        while (temp > 0) {
            squareDigits++;
            temp /= 10;
        }
        if (square % ((int) Math.pow(10, squareDigits)) == number) {
            System.out.print("Automorphic Number.");
        } else {
            System.out.print("Not an Automorphic Number.");
        }
        sc.close();
    }
}