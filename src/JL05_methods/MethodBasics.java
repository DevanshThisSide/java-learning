package JL05_methods;

import java.util.Scanner;

public class MethodBasics {
    static void tellaJoke() {
        System.out.print(" > > > What do you call a bee that can't make up its mind? A Maybe. < < < ");
    }

    static int sum(int x, int y) { // If the method is non-static, create an object to call it.
        return x + y;
    }

    int mul(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        // Method Invocation Using Object Creation
        MethodBasics obj = new MethodBasics();
        System.out.print("The Sum of the two numbers is : " + sum(a, b));
        System.out.print("\nThe Product of the two numbers is : " + obj.mul(a, b));
        System.out.print("\nYou want a hear a Joke ? Yes Or No : ");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("Yes")) {
            tellaJoke();
        } else if (choice.equalsIgnoreCase("No")) {
            System.out.print("You Choose No.");
        }else{
            System.out.print("Invalid Choice.");
        }
        sc.close();
    }
}
