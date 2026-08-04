package JL02_conditionals;

import java.util.Scanner;

public class CharTypeChecker {
    public static void main(String[] args) {
        System.out.print("Enter any Character to Check its Type : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // To check for the whitespace as well

        if (!input.isEmpty()) {
            char ch = input.charAt(0);
            if (Character.isUpperCase(ch)) { // When doing it for character put the character inside the function call written like Character.isMethod(ch)
                System.out.print("It is an uppercase letter.");
            } else if (Character.isLowerCase(ch)) {
                System.out.print("It is a lowercase letter.");
            } else if (Character.isDigit(ch)) {
                System.out.print("It is a number/digit.");
            } else if (!Character.isWhitespace(ch)) {
                System.out.print("It is a special character.");
            } else {
                System.out.print("It is a space or whitespace.");
            }
        }
        sc.close();
    }
}
