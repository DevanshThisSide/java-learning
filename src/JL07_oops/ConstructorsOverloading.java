package JL07_oops;
// Same method/constructor name + different parameters.
// Compile-time polymorphism : The compiler decides which one to call based on the arguments.

// Car Showroom System
class Car {
    private String brand;
    private String model;
    private double price;
    private String fuelType;

    // Multiple constructors provide different ways to create objects.
    public Car() {
        brand = "Unknown";
        model = "Unknown";
        price = 0.0;
        fuelType = "Unknown";
    }

    public Car(String brand) {
        this(); // Calls the default constructor.
                // Constructor chaining avoids repeated initialization code.
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this();
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, double price) {
        this();
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Car(String brand, String model, double price, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fuelType = fuelType;
    }

    public void printCarDetails() {
        System.out.println("------ Car Details ------");
        System.out.println("Brand     : " + brand);
        System.out.println("Model     : " + model);
        System.out.printf("Price     : ₹%.2f%n", price);
        System.out.println("Fuel Type : " + fuelType);
    }
}

public class ConstructorsOverloading {
    public static void main(String[] args) {
        Car defaultCar = new Car();
        System.out.println("Default Constructor Called.");
        defaultCar.printCarDetails();
        System.out.println();
        System.out.println("Overloaded Constructors Called.");
        Car car1 = new Car("Tata");
        car1.printCarDetails();
        System.out.println();
        Car car2 = new Car("Tata", "Nexon");
        car2.printCarDetails();
        System.out.println();
        Car car3 = new Car("Tata", "Nexon", 1200000);
        car3.printCarDetails();
        System.out.println();
        Car car4 = new Car("Tata", "Nexon", 1200000, "Petrol");
        car4.printCarDetails();
    }
}