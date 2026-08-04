package JL02_conditionals;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter The Year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc. nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.print("Leap Year");
        } else {
            System.out.print("Not a Leap Year");
        }
        sc.close();
    }
}
