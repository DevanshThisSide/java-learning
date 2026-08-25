package JL07_oops;

// DEFAULT METHOD
//     - An interface can contain a method with a body using the 'default' keyword.
//     - A class implementing the interface inherits the default method.
//     - The implementing class can override it if required.
// STATIC METHOD
//     - A static method belongs to the interface itself.
//     - It is NOT inherited by implementing classes.
//     - It must be called using the interface name.
//PRIVATE METHOD
//     - A private method in an interface can contain common helper logic used by other methods of the same interface.
//     - It cannot be accessed directly by implementing classes.
//     - It is useful for avoiding duplicate code inside interface methods. Example - If logic of default gets larger in size use private in default for readability.

interface Payment {
    // Abstract Method
    void pay(double amount);

    // Default Method
    default void paymentMessage() {
        System.out.println("Payment processing started...");
    }

    // Default Method with Private Helper Method
    default void showReceipt(double amount) {
        System.out.println("------ Payment Receipt ------");
        System.out.println("Amount : ₹" + amount);

        displayStatus();
    }

    // Private Method
    private void displayStatus() {
        System.out.println("Status : Payment Successful.");
    }

    // Static Method
    static void paymentInfo() {
        System.out.println("Payment Interface: Supports secure payment processing.");
    }
}

class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit/Debit Card.");
    }

    // A default method can be overridden when a class needs its own implementation.
    @Override
    public void paymentMessage() {
        System.out.println("Card payment processing started...");
    }
}

public class DefaultStaticPrivateMethod_Interfaces {
    public static void main(String[] args) {

        // Object of UPI implementation.
        UPI upi = new UPI();

        upi.pay(1500);
        upi.paymentMessage();
        upi.showReceipt(1500);

        System.out.println();

        // Object of CardPayment implementation.
        CardPayment card = new CardPayment();

        card.pay(2500);
        card.paymentMessage();
        card.showReceipt(2500);

        System.out.println();


//          Static methods are called using the interface name.
//          NOT:
//          upi.paymentInfo();       // ❌
//          card.paymentInfo();      // ❌

        Payment.paymentInfo();

//          displayStatus() cannot be called here because it is private to the Payment interface.
//          upi.displayStatus();    // ❌

    }
}