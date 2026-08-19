package JL03_loops;
import java.util.Scanner;

public class HappyNumChecker {
    public static int findDigitSquare(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        boolean flag = false;
        int i = 0;
        // Limit iterations to prevent an infinite loop for unhappy numbers.
        while (i < 100) {
            int digitSquare = findDigitSquare(number);
            // Reaching 1 means the number is a Happy Number.
            if (digitSquare == 1) {
                flag = true;
                break;
            }
            // Continue the process with the newly calculated value.
            number = digitSquare;
            i++;
        }
        if (flag) {
            System.out.print("Happy Number.");
        } else {
            System.out.print("Not a Happy Number.");
        }
        sc.close();
    }
}