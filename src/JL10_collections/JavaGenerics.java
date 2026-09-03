package JL10_collections;

import java.util.ArrayList;

/*
 * Generics allow us to specify the type of data that a class,
 * interface, method, or collection can work with.
 * Generics provide:
 * 1. Type Safety
 * 2. Compile-time error checking
 * 3. Less type casting
 * 4. Reusable code
 * SYNTAX :       ClassName<T>
 * T is called a type parameter.
 * Common type parameter names:
 * T -> Type
 * E -> Element
 * K -> Key
 * V -> Value
 * Example:
 *      ArrayList<String> names = new ArrayList<>();
 * This means the ArrayList can store only String objects.
 *      ArrayList<Integer> numbers = new ArrayList<>();
 * This means the ArrayList can store only Integer objects.

 * A Class can also be made generic:
 *      class Box<T> {
 *          T value;
 *      }
 * T is replaced by the actual type when an object is created.

 * A Method can also have its own type parameter:
 *      static <T> void display(T value) {
 *          System.out.println(value);
 *      }
 * The method can work with different types.

 * Generics work with reference types.
 * Therefore:      ArrayList<Integer>      // Correct
 * not:            ArrayList<int>          // Incorrect

 * Wrapper classes are used for primitive values:
 * int     -> Integer
 * double  -> Double
 * char    -> Character
 * boolean -> Boolean
 */


// T represents an unknown type.
class Box<T> {
    private T value;
//      Stores a value of the generic type T.
    public void setValue(T value) {
        this.value = value;
    }
//      Returns the value of the generic type T.
    public T getValue() {
        return value;
    }
}

public class JavaGenerics {
//  <T> declares the type parameter for this method.
//  T value means the method accepts a value of type T.
    static <T> void display(T value) {
        System.out.println("Value : " + value);
    }

    //  Generic method that accepts and returns the same type.
    static <T> T getValue(T value) {
        return value;
    }

    public static void main(String[] args) {

//      This ArrayList is restricted to String objects.
        ArrayList<String> names = new ArrayList<>();

        names.add("Devansh");
        names.add("Rahul");
        names.add("Aman");

        /*
         * The following would produce a compile-time error
         * because the ArrayList accepts only String values.
         * names.add(100); // ❌
         */

        System.out.println("Names : " + names);

//      Integer is used instead of primitive int because Generics work with reference types.
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers : " + numbers);

        /*
         * Here T becomes String.
         * Therefore:                 setValue(T value)
         * becomes conceptually:      setValue(String value)
         */
        Box<String> stringBox = new Box<>();

        stringBox.setValue("Java Generics");

        String text = stringBox.getValue();

        System.out.println("String Box : " + text);

        //  Here T becomes Integer.
        Box<Integer> integerBox = new Box<>();

        integerBox.setValue(500);

        Integer number = integerBox.getValue();

        System.out.println("Integer Box : " + number);

//      The same Box class can work with different data types.
        Box<Double> doubleBox = new Box<>();

        doubleBox.setValue(25.75);

        System.out.println("Double Box : " + doubleBox.getValue());

        /*
         * The method display() has its own type parameter T.
         * Therefore, it can accept different types of values.
         */
        display("Hello Java");

        display(100);

        display(25.5);

        display(true);

        // The method can also return the same generic type.

        String result1 = getValue("Java");

        Integer result2 = getValue(100);

        System.out.println("Generic String : " + result1);
        System.out.println("Generic Integer : " + result2);
    }

}