package JL07_oops;

/*
 * Abstract Class:
 * 1. A class declared using the 'abstract' keyword.
 * 2. An abstract class cannot be instantiated directly.
 * 3. It can contain:
 *      - concrete methods
 *      - abstract methods
 *      - constructors
 *      - variables
 * 4. An abstract class can be extended by another class.
 *
 * Abstract Method:
 * 1. A method declared using the 'abstract' keyword.
 * 2. It has no method body in the abstract class.
 * 3. A concrete child class must provide an implementation
 *    for all inherited abstract methods.
 *
 * If a child class does not implement all abstract methods
 * of its parent, the child class must also be declared abstract.
 */

abstract class Greetings {

    //     Abstract classes can have constructors.
//     This constructor executes when an object of a concrete child class is created.
    public Greetings() {
        System.out.println("I am Greetings Class Constructor.");
    }

    // Concrete method
    // An abstract class can contain normal methods.
    public void greetWelcome() {
        System.out.println("WELCOME.....!");
    }

    //     Abstract methods.
//     They provide the required behavior but leave the implementation to the child class.
    abstract public void greetMorning();

    abstract public void greetNight();
}

class Greeting1 extends Greetings {

    public Greeting1() {
        System.out.println("I am Greeting1 Class Constructor.");
    }

//     Greeting1 is a concrete class, so it MUST implement
//     all abstract methods inherited from Greetings.

    @Override
    public void greetMorning() {
        System.out.println("GOOD MORNING.....!");
    }

    @Override
    public void greetNight() {
        System.out.println("GOOD NIGHT.....!");
    }

    // This is a new method specific to Greeting1.
    public void greetAfternoon() {
        System.out.println("GOOD AFTERNOON.....!");
    }
}

// Greeting2 is declared abstract.
// Therefore, it does NOT have to implement the abstract
// methods greetMorning() and greetNight() of Greetings.
// Because Greeting2 is abstract, its objects cannot be created directly.
abstract class Greeting2 extends Greetings {

    public Greeting2() {
        System.out.println("I am Greeting2 Class Constructor.");
    }

    public void greetMSG() {
        System.out.println("Great to see you.....!");
    }
}

public class AbstractClassAndMethod {

    public static void main(String[] args) {
//         NOT POSSIBLE:
//          Greetings greet = new Greetings();
//          Greetings is an abstract class, so it cannot be instantiated directly.

//         Greeting1 is a concrete class.
//         It has implemented all abstract methods of Greetings, so its object can be created.
        Greeting1 greet1 = new Greeting1();

        greet1.greetWelcome();
        greet1.greetMorning();
        greet1.greetAfternoon();
        greet1.greetNight();

//         NOT POSSIBLE:
//          Greeting2 greet2 = new Greeting2();
//          Greeting2 is itself abstract, so it cannot
//          be instantiated directly.

//         Abstract parent reference can refer to a concrete child object.
//         Only methods available through the Greetings reference can be called.
        Greetings greetings = new Greeting1(); // Upcasting

        greetings.greetWelcome();
    }
}