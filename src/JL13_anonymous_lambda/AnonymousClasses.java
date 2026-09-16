package JL13_anonymous_lambda;

/*
 * ===================== ANONYMOUS CLASSES IN JAVA =====================
 *
 * An anonymous class is a class without an explicit name.
 * It is declared and instantiated at the same time and is generally
 * used when we need a particular implementation only once.

 *      ParentClass object = new ParentClass() {
 *          // overridden methods
 *      };
 * OR
 *      Interface object = new Interface() {
 *          // implementation of abstract methods
 *      };
 *
 * ===================== ANONYMOUS CLASS WITH A CLASS =====================
 *
 * When an anonymous class is created from a normal class, it creates
 * an anonymous subclass of that class.
 * Example:
 *      Animal animal = new Animal() {
 *          @Override
 *          public void sound() {
 *              System.out.println("Dog Sound");
 *          }
 *      };
 *
 * ===================== ANONYMOUS CLASS WITH AN INTERFACE =====================
 *
 * An anonymous class can provide an implementation of an interface
 * without creating a separate named class.
 * Example:
 *      Greeting greeting = new Greeting() {
 *          @Override
 *          public void greet() {
 *              System.out.println("Hello!");
 *          }
 *      };

 * ===================== WHY USE ANONYMOUS CLASSES? =====================
 *
 * If an implementation is required only once, creating a separate
 * named class may be unnecessary.
 *
 * Anonymous classes allow us to define that implementation directly
 * where the object is created.
 *
 * ===================== ANONYMOUS CLASS AND FUNCTIONAL INTERFACE =====================
 *
 * A functional interface contains exactly ONE abstract method.
 * Before lambda expressions, an anonymous class was commonly used
 * to provide the implementation of a functional interface.
 * Example:
 *      Calculator calculator = new Calculator() {
 *          @Override
 *          public int calculate(int a, int b) {
 *              return a + b;
 *          }
 *      };
 *
 * Lambda expressions provide a shorter way of writing this kind
 * of implementation and will be covered in the next file.
 *
 * ===================== IMPORTANT POINTS =====================
 *
 * 1. An anonymous class has no explicit class name.
 * 2. It is created and instantiated at the same time.
 * 3. It can extend a class.
 * 4. It can implement an interface.
 * 5. It can override methods.
 * 6. It is generally useful for one-time implementations.
 * 7. An anonymous class is still a class.
 * 8. Lambda expressions are NOT anonymous classes.
 *
 * ===================== OUTER LOCAL VARIABLES =====================
 *
 * An anonymous class can access local variables from its surrounding
 * method if those variables are final or effectively final.
 * Example:
 *      int number = 10;
 *      Runnable runnable = new Runnable() {
 *          @Override
 *          public void run() {
 *              System.out.println(number);
 *          }
 *      };
 * Here number is effectively final because its value is not changed.
 */

//  Normal class used to demonstrate an anonymous class extending a class.
class Animal {

    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

//  Interface used to demonstrate an anonymous class implementing an interface.
interface Greeting {
    void greet();
}

//  Functional interface used to demonstrate how anonymous
//   classes were commonly used before lambda expressions.
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class AnonymousClasses {
    public static void main(String[] args) {

        // 1. Anonymous Class Extending a Normal Class
        /*
         * Animal is the reference type.
         * new Animal() creates an object and the following
         * block creates an anonymous subclass of Animal.
         * We override sound() to provide a different implementation.
         */
        Animal animal = new Animal() {
            @Override
            public void sound() {
                System.out.println("Dog makes a sound.");
            }
        };
        animal.sound();

        // 2. Anonymous Class Implementing an Interface
        /*
         * Greeting is an interface, so we cannot directly create
         * an object using:      new Greeting() because greet() has no implementation.
         * The anonymous class provides the implementation here.
         */
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, Devansh!");
            }
        };
        greeting.greet();

        // 3. Anonymous Class with a Functional Interface
        /*
         * Calculator is a functional interface containing one abstract method: calculate().
         * Here we provide its implementation using an anonymous class.
         * This is the longer form that we will replace with a lambda expression in the next file.
         */
        Calculator calculator = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Addition Result : " + calculator.calculate(10, 20));

        // 4. Anonymous Class Accessing an Outer Local Variable
        /*
         * This local variable is effectively final because its
         * value is not changed after initialization.
         */
        int number = 50;
        /*
         * Runnable is a functional interface from java.lang.
         * run() is its single abstract method.
         * The anonymous class provides the implementation of run().
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                /*
                 * The anonymous class can access the outer local
                 * variable 'number' because it is effectively final.
                 */
                System.out.println("Number : " + number);
            }
        };
        runnable.run();

        // 5. Anonymous Class with a Custom Field
        //  An anonymous class can also contain its own fields.
        Animal animalWithField = new Animal() {
            String name = "Bruno";
            @Override
            public void sound() {
                System.out.println(name + " makes a sound.");
            }
        };
        animalWithField.sound();
    }
}