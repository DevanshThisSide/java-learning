package JL07_oops;

// An interface in Java is a blueprint that defines a set of related methods a class must implement without providing full implementation details.
// An interface can contain abstract methods that must be implemented by the implementing class.
// A class uses the 'implements' keyword to implement an interface.
// A class can implement multiple interfaces, which allows Java to achieve multiple inheritance through interfaces.
// Interface variables are public, static and final by default.
// Interface methods are public and abstract by default unless otherwise specified.
// Interfaces cannot be instantiated directly.
// Interfaces can be used as reference types: This also demonstrates Runtime Polymorphism.

interface Vehicle {

    int SPEED_LIMIT = 120; // Constant

    // public abstract by default
    void start();

    void accelerate(int speed);
}

interface GPS { // A class that implements GPS must provide an implementation of the locate() method.

    void locate();
}

class Bicycle implements Vehicle {  // Bicycle implements Vehicle. Therefore, Bicycle must implement: start(), accelerate()

    private int currentSpeed = 0;

    @Override
    public void start() {
        System.out.println("Bicycle is ready. Start pedaling!");
    }

    @Override
    public void accelerate(int speed) {
        currentSpeed += speed;
        System.out.println("Bicycle speed increased to: "
                + currentSpeed + " km/h");
    }
}

class MotorCar implements Vehicle { // MotorCar also implements Vehicle. It provides its own implementation of the Vehicle methods.

    private int currentSpeed = 0;

    @Override
    public void start() {
        System.out.println("MotorCar engine started with a key.");
    }

    @Override
    public void accelerate(int speed) {

        // SPEED_LIMIT is inherited from the Vehicle interface.
        if (currentSpeed + speed <= SPEED_LIMIT) {
            currentSpeed += speed;

            System.out.println("MotorCar accelerated. Current speed: "
                    + currentSpeed + " km/h");

        } else {
            System.out.println("Cannot exceed the speed limit of "
                    + SPEED_LIMIT + " km/h!");
        }
    }
}


// SmartMotorCar implements TWO interfaces: Vehicle + GPS
// This demonstrates multiple interface implementation.
// The class must implement all abstract methods from both interfaces.
class SmartMotorCar implements Vehicle, GPS { // Can also be extended by a Parent Class using "extends" before implementing syntax

    private int currentSpeed = 0;
    String modelName;

    public SmartMotorCar(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void start() {
        System.out.println(modelName
                + " engine started silently with a button.");
    }

    @Override
    public void accelerate(int speed) {

        if (currentSpeed + speed <= SPEED_LIMIT) {
            currentSpeed += speed;

            System.out.println(modelName
                    + " accelerated to: "
                    + currentSpeed + " km/h");

        } else {
            System.out.println(modelName
                    + " cannot exceed safety limit of "
                    + SPEED_LIMIT + " km/h!");
        }
    }

    @Override
    public void locate() {
        System.out.print(modelName
                + " GPS Tracking: 40.7128° N, 74.0060° W");
    }
}

public class Interfaces {

    public static void main(String[] args) {

//         Interface reference + implementing class object.
//         This is Runtime Polymorphism.
//         Vehicle reference can point to any object implements Vehicle.

        System.out.println("--- Testing Bicycle ---");

        Vehicle bicycle = new Bicycle();

        bicycle.start();
        bicycle.accelerate(15);


        System.out.println("\n--- Testing MotorCar ---");

        Vehicle motorCar = new MotorCar();

        motorCar.start();
        motorCar.accelerate(50);


        System.out.println("\n--- Testing Smart MotorCar ---");

        SmartMotorCar smartMotorCar =
                new SmartMotorCar("Tesla Model S");

        smartMotorCar.start();
        smartMotorCar.accelerate(80);
        smartMotorCar.locate();
    }
}