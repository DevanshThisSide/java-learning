package JL07_oops;

//  - An interface can extend another interface using 'extends'.
//  - A child interface inherits the methods of its parent interface.
//  - An interface can extend multiple interfaces.
//  - A class implementing the child interface must implement all inherited and newly declared methods.

interface BasicProduct {

    void displayProduct();
}

interface SellableProduct extends BasicProduct {

    void calculatePrice(int quantity);
}

interface Trackable {

    void trackOrder();
}

// Multiple Inheritance through Interfaces.
interface OnlineProduct extends SellableProduct, Trackable {

    void addToCart();
}

class Laptop implements OnlineProduct {

    private String productName;
    private double price;

    public Laptop(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public void displayProduct() {
        System.out.println("Product : " + productName);
        System.out.println("Price   : ₹" + price);
    }

    @Override
    public void calculatePrice(int quantity) {
        double total = price * quantity;

        System.out.println("Quantity    : " + quantity);
        System.out.println("Total Price : ₹" + total);
    }

    @Override
    public void trackOrder() {
        System.out.println("Order Status : Your order is being shipped.");
    }

    @Override
    public void addToCart() {
        System.out.println(productName + " added to cart.");
    }
}

public class InterfaceInheritance {

    public static void main(String[] args) {

        Laptop laptop = new Laptop("Gaming Laptop", 75000);

        System.out.println("------ Product Details ------");
        laptop.displayProduct();

        System.out.println("\n------ Shopping Cart ------");
        laptop.addToCart();

        System.out.println("\n------ Price Calculation ------");
        laptop.calculatePrice(2);

        System.out.println("\n------ Order Tracking ------");
        laptop.trackOrder();
    }
}