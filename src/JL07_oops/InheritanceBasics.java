package JL07_oops;

// Base is the parent/superclass.
class Base {
    int x;

    // Getter method to return the value of x.
    public int getX() {
        return x;
    }

    // Setter method to assign a value to x.
    public void setX(int x) {
        System.out.println("I am in Base Class And Setting x.");
        this.x = x;
    }
}

// Derived is the child/subclass of Base.
// 'extends' establishes an inheritance relationship.
// Derived inherits accessible members and methods of Base.
class Derived extends Base {
    int y;

    // Getter method for the child class's own variable y.
    public int getY() {
        return y;
    }

    // Setter method to assign a value to y.
    public void setY(int y) {
        System.out.println("I am in Derived Class And Setting y.");
        this.y = y;
    }
}

public class InheritanceBasics {
    public static void main(String[] args) {

        // Creating an object of the Derived class.
        // The Derived object can access inherited methods from Base.
        Derived derived = new Derived();

        // setX() belongs to Base, but can be called using the Derived object
        // because Derived inherits from Base.
        derived.setX(5);

        // getX() is also inherited from Base.
        System.out.println("Now x = " + derived.getX());

        // setY() belongs directly to Derived.
        derived.setY(10);

        // getY() belongs directly to Derived.
        System.out.print("Now y = " + derived.getY());
    }
}