package JL03_loops;

import java.util.Scanner;

public class NeonNumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int sum = 0;
        int square = (int) Math.pow(number, 2);
        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        if (sum==number){
            System.out.print("Neon Number.");
        }else{
            System.out.print("Not a Neon Number.");
        }
        sc.close();
    }
}