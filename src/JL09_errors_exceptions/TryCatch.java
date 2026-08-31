package JL09_errors_exceptions;
import java.util.Scanner;

// Demonstrates try-catch, exception handling and the exception object.
public class TryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        try {

            // try contains code that may throw an exception.
            System.out.println("Trying to perform division...");

            int result = numerator / denominator;

            // This statement executes only if no exception occurs above.
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // catch handles the matching exception thrown by the try block.
            System.out.println("Cannot divide by zero.");

            // e refers to the exception object that was thrown.
            System.out.println("Exception: " + e);

            // getMessage() returns the specific message of the exception.
            System.out.println("Message: " + e.getMessage());
        }

//          If an exception occurs inside try:
//           - Remaining statements inside try after the exception hits are skipped .
//           - Matching catch block executes.
//           - Program continues after the catch block.

        System.out.println("Program continues after try-catch.");

        // Multiple catch blocks allow different exception types to be handled separately.
        // Specific exceptions must be caught before their parent exception.
        try {
            // risky code
        }
        catch (ArithmeticException e) {
            // handles arithmetic problems
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // handles array index problems
        }
        catch (Exception e) {
            // handles other exceptions
        }

        // Nested try-catch allows a try-catch block to be placed inside another try or catch block for separate exception handling.
        try {
            System.out.println("Outer try started.");

            try {
                int result = 10 / 0;
                System.out.println(result); // Will not be executed.

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero.");
            }

            System.out.println("Outer try continues.");

        } catch (Exception e) {
            System.out.println("Outer catch executed.");
        }
        // The inner catch handles the ArithmeticException, so the exception doesn't reach the outer catch, to handle any other exception as already found earlier.
        finally {
            // finally normally executes whether an exception occurs or not.
            // It is commonly used for cleanup operations such as closing resources.
            System.out.print("Finally block executed.");
            sc.close();
        }
    }
}