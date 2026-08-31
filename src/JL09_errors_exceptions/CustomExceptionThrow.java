package JL09_errors_exceptions;
import java.util.Scanner;

// Custom exception created for an application-specific situation.
class InvalidMarksException extends Exception {
    // Constructor passes the custom message to the parent Exception class.
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class CustomExceptionThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try {
            // throw is used to manually throw our custom exception
            // when the given condition is invalid.
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException(
                        "Marks must be between 0 and 100."
                );
            }
            System.out.println("Valid Marks: " + marks);

        } catch (InvalidMarksException e) {
            // Handles the custom exception thrown above.
            System.out.println("Invalid Marks.");
            System.out.println("Reason: " + e.getMessage());

        } finally {
            // finally normally executes whether an exception occurs or not.
            System.out.println("Marks validation completed.");
        }

        System.out.print("Program continues after exception handling.");

        sc.close();
    }
}