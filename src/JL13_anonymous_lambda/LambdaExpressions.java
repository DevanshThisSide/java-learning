package JL13_anonymous_lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 * ===================== LAMBDA EXPRESSIONS IN JAVA =====================
 *
 * A lambda expression is a concise way of providing an implementation
 * of the single abstract method of a functional interface.
 * Lambda expressions were introduced in Java 8.
    Syntax :
 *      (parameters) -> expression
 * OR
 *      (parameters) -> {
 *          statements;
 *      }
    Example:
 *      (a, b) -> a + b
 * Here:
 *      (a, b)  -> Parameters
 *      ->      -> Lambda operator
 *      a + b   -> Expression / implementation

 * A lambda expression can be used where Java expects a FUNCTIONAL INTERFACE.
 * A functional interface contains exactly ONE abstract method.
 * Example:
 *      @FunctionalInterface
 *      interface Calculator {
 *          int calculate(int a, int b);
 *      }
 * Lambda implementation:
 *      Calculator calculator = (a, b) -> a + b;
 *
 * ===================== WHY USE LAMBDA? =====================
 *
 * Before lambda expressions, anonymous classes were commonly used
 * to provide implementations of functional interfaces.
 *
 * Anonymous class:
 *      Calculator calculator = new Calculator() {
 *          @Override
 *          public int calculate(int a, int b) {
 *              return a + b;
 *          }
 *      };
 *
 * Lambda:
 *      Calculator calculator = (a, b) -> a + b;
 * Lambda expressions make such code shorter and easier to read.
 *
 * ===================== PARAMETER RULES =====================
 *
 * No parameters:
 *      () -> System.out.println("Hello");
 * One parameter:
 *      message -> System.out.println(message);
 * Multiple parameters:
 *      (a, b) -> a + b;

 * ===================== EXPRESSION BODY =====================
 *
 * If the lambda contains a single expression:      (a, b) -> a + b
 *
 * The result of the expression is automatically returned when
 * the functional interface method has a return value.

 * ===================== BLOCK BODY =====================
 *
 * Multiple statements can be written using braces:
 *      (a, b) -> {
 *          int result = a + b;
 *          return result;
 *      };
 *
 * When using a block body, an explicit return statement is required
 * when the method returns a value.

 * ===================== TYPE INFERENCE =====================
 *
 * Java can determine parameter types from the target functional interface.
 * Therefore:
 *      (a, b) -> a + b
 * is enough when the target type is Calculator.
 * We don't normally need:
 *      (int a, int b) -> a + b

 * ===================== BUILT-IN FUNCTIONAL INTERFACES =====================
 *
 * Java provides commonly used functional interfaces inside:      java.util.function
 * Important interfaces:
 * Each built-in functional interface has a standard abstract method.
 *
 * Predicate<T> -> test(T)
 *      Takes a value and returns boolean.
 *      Predicate<Integer> isEven = n -> n % 2 == 0;

 * Consumer<T>  -> accept(T)
 *      Takes a value and returns nothing.
 *      Consumer<String> print = text -> System.out.println(text);

 * Function<T, R>   -> apply(T)
 *      Takes one type of value and produces another type of value.
 *      Function<Integer, Integer> square = n -> n * n;

 * Supplier<T>  -> get()
 *      Takes no input and supplies a value.
 *      Supplier<String> message = () -> "Hello";

 * ===================== LAMBDA AND LOCAL VARIABLES =====================
 *
 * A lambda can access a local variable if that variable is final or effectively final.
 *
 * An effectively final variable in Java is a local variable whose value is never changed after it is initialized.
 *  Even though it lacks the explicit final keyword,
 *  the Java compiler treats it as if it were final because its value remains constant.
 * Introduced in Java 8, this feature eliminates the need to
 *  explicitly write final before variables used in anonymous inner classes or lambda expressions.
 *
 * Example:
 *      int number = 10;
 *      Runnable runnable = () -> {
 *          System.out.println(number);
 *      };
 *
 * The variable number is effectively final because its value is not changed after initialization.
 *
 * ===================== LAMBDA VS ANONYMOUS CLASS =====================
 *
 * Anonymous class:
 *      Calculator calculator = new Calculator() {
 *          @Override
 *          public int calculate(int a, int b) {
 *              return a + b;
 *          }
 *      };
 *
 * Lambda:
 *      Calculator calculator = (a, b) -> a + b;
 *
 * Lambda is not an anonymous class.
 * Lambda provides the implementation of a functional interface's single abstract method.
 *
 * ===================== LAMBDA AND COLLECTIONS =====================
 *
 * Lambda expressions become especially useful with Collections.
 * Example:
 *      list.forEach(item -> System.out.println(item));
 * They are also heavily used with:
 *      Sorting
 *      Filtering
 *      Comparators
 *      Streams
 * These concepts will be covered further while learning Collections and Streams.
 */

// Custom functional interface used to understand lambda expressions.
@FunctionalInterface
interface CalculatorLambda {
    int calculate(int a, int b);
}

// Functional interface with no parameters.
@FunctionalInterface
interface GreetingLambda {
    void greet();
}

// Functional interface with one parameter.
@FunctionalInterface
interface MessagePrinter {
    void print(String message);
}

public class LambdaExpressions {

    public static void main(String[] args) {

        // 1. Lambda with Multiple Parameters
        /*
         * CalculatorLambda has one abstract method:
         *      calculate(int a, int b)
         * Therefore, a lambda expression can provide its implementation.
         * Java automatically understands that a and b are integers
         * from the method declaration in CalculatorLambda.
         */
        CalculatorLambda addition = (a, b) -> a + b;

        System.out.println("Addition : " + addition.calculate(10, 20));

        // 2. Lambda with Block Body
        /*
         * Multiple statements require a block body using { }.
         * Because calculate() returns int, we explicitly use return.
         */
        CalculatorLambda multiplication = (a, b) -> {
            int result = a * b;
            return result;
        };

        System.out.println("Multiplication : " + multiplication.calculate(10, 20));

        // 3. Lambda with No Parameters
        /*
         * GreetingLambda contains a method with no parameters.
         * Therefore, empty parentheses () are used.
         */
        GreetingLambda greeting = () -> System.out.println("Hello from Lambda!");
        greeting.greet();

        // 4. Lambda with One Parameter
        /*
         * MessagePrinter contains one parameter.
         * Parentheses are optional when there is only one inferred parameter.
         */
        MessagePrinter printer = message -> System.out.println("Message : " + message);
        printer.print("Learning Lambda Expressions");

        // 5. Predicate<T>
        /*
         * Predicate<T> takes one value and returns boolean.
         * Here:
         *      Integer -> input type
         *      boolean -> return type
         * The lambda checks whether the number is even.
         */
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println("Is 20 Even? : " + isEven.test(20));

        System.out.println("Is 15 Even? : " + isEven.test(15));

        // 6. Consumer<T>
        /*
         * Consumer<T> accepts a value but does not return a value.
         * Its main abstract method is accept().
         */
        Consumer<String> printText = text -> System.out.println("Consumer : " + text);

        printText.accept("Hello Java");

        // 7. Function<T, R>
        /*
         * Function<T, R> takes one value and produces another value.
         * Here:
         *      Integer -> input type
         *      Integer -> output type
         * The lambda calculates the square of a number.
         */
        Function<Integer, Integer> square = number -> number * number;

        System.out.println("Square of 7 : " + square.apply(7));

        // 8. Supplier<T>
        /*
         * Supplier<T> takes no input and supplies a value.
         * Its main abstract method is get().
         */
        Supplier<String> messageSupplier = () -> "Java Lambda Expression";

        System.out.println("Supplier : " + messageSupplier.get());

        // 9. Lambda Accessing an Effectively Final Variable
        /*
         * This local variable is effectively final because we
         * don't change its value after initialization.
         */
        int number = 100;  // Effectively final

//          Lambda can access the effectively final local variable.

        Runnable runnable = () -> System.out.println("Outer Variable : " + number);
        runnable.run();

        // number=20; // Not allowed
        // If you try to modify a local variable inside a lambda,
        // or change it outside after the lambda uses it, the compiler will throw an error

        // 10. Lambda with a Condition

//          Lambda expressions can contain normal Java expressions.

        Predicate<Integer> isPositive = value -> value > 0;

        System.out.println("Is 25 Positive? : " + isPositive.test(25));

        // 11. Lambda with Multiple Statements

//          A lambda block can contain multiple statements.
        Function<Integer, Integer> calculateSquare = value -> {
            System.out.println("Calculating square...");
            int result = value * value;
            return result;
        };

        System.out.println("Result : " + calculateSquare.apply(8));
    }
}