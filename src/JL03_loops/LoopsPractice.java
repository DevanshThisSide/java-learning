package JL03_loops;

import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {
        System.out.print("Enter the range (1 to n) : ");
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        int sum = 0;
        if (n % 2 != 0) {
            n--;
        }
        while (n > 0) {
            sum += n;
            n -= 2;
        }
        System.out.printf("The Sum of all even numbers from 1 to n is : %d", sum);
        sc.close();
    }
}
