package JL09_errors_exceptions;

// Demonstrates compile-time errors, logical errors, runtime exceptions and the Throwable hierarchy.
public class ErrorException {

    public static void main(String[] args) {

        // 1. COMPILE-TIME ERROR (Syntax Error)
        // Compile-time errors are detected by the compiler before the program runs.
        // int number = "Hello";  // Compile-time error: incompatible types.
        // The above line is commented out so that this program can compile.

        // 2. LOGICAL ERROR
        int a = 10;
        int b = 20;

        // Incorrect logic: operator precedence makes this 10 + (20 / 2) = 20.
        int wrongAverage = a + b / 2;

        // Correct logic should use parentheses.
        int correctAverage = (a + b) / 2;

        System.out.println("Wrong Average: " + wrongAverage);
        System.out.println("Correct Average: " + correctAverage);

        // Program compiles and runs, but wrongAverage gives an incorrect result.
        // Therefore, this is a logical error, not an exception.

        // 3. RUNTIME EXCEPTION
        int numerator = 10;
        int denominator = 0;

        try {

            // Division by zero causes ArithmeticException at runtime.
            int result = numerator / denominator;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // ArithmeticException is a subclass of RuntimeException.
            System.out.println("Cannot divide by zero.");
            System.out.println("Exception: " + e);
        }

        // 4. CHECKED VS UNCHECKED EXCEPTIONS

        /*
         * Checked Exception:
         * The compiler forces us to handle or declare it.
         *
         * Unchecked Exception:
         * The compiler does not force us to handle it.
         * Unchecked exceptions generally extend RuntimeException.
         */

        // Checked Exception example: InterruptedException is checked.
        try {

            Thread.sleep(500);
            System.out.println("Thread completed sleeping.");

        } catch (InterruptedException e) {

            System.out.println("Thread was interrupted.");
        }

        // Unchecked Exception example: ArithmeticException extends RuntimeException.
        try {

            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException handled.");
        }

        // 5. EXCEPTION HIERARCHY
        /*
         * Throwable
         *     |
         *     |---- Error
         *     |
         *     |---- Exception
         *              |
         *              |---- RuntimeException → Unchecked Exceptions
         *              |
         *              |---- Other Exceptions → Checked Exceptions
         *
         * Throwable is the parent of both Error and Exception.
         * Error represents serious JVM/system-level problems.
         * Exception represents abnormal situations that can generally be handled.
         * RuntimeException is a subclass of Exception and represents unchecked exceptions.
         * Checked exceptions must be handled or declared using throws.
         */

        // 6. CHECKING THE HIERARCHY
        ArithmeticException exception = new ArithmeticException();

        // getClass() shows the actual class of the object.
        System.out.println("\nException Class: " + exception.getClass().getSimpleName());

        // instanceof checks whether an object belongs to a class or its subclasses.
        System.out.println("Is RuntimeException? " + (exception instanceof RuntimeException));

        System.out.println("Is Exception? " + (exception instanceof Exception));

        System.out.println("Is Throwable? " + (exception instanceof Throwable));

        // 7. ERROR EXAMPLE
        // StackOverflowError can occur because of endless recursion.
        // Do NOT call the method below; it would intentionally crash the program.
        // causeStackOverflow();

        System.out.print("\nProgram completed.");
    }

    // Endless recursion can eventually cause StackOverflowError.
    // This is an Error, not an Exception.
    static void causeStackOverflow() {
        causeStackOverflow();
    }
}