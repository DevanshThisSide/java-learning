package JL07_oops;
// Shopping Cart Item
class CartItem {
    private String productName;
    private double price;
    private int quantity;
    private double discountPercentage;
    private double subTotal;
    private double discount;
    private double finalPrice;

    public CartItem() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
        discountPercentage = 0.0;
    }

    public CartItem(String productName) {
        this();
        this.productName = productName;

    }

    public CartItem(String productName, double price) {
        this();
        this.productName = productName;
        this.price = price;

    }

    public CartItem(String productName, double price, int quantity) {
        this();
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

    }

    public CartItem(String productName, double price, int quantity, double discountPercentage) {
        this();
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.discountPercentage = discountPercentage;
    }

    public double calculateSubtotal() {
        subTotal = price * quantity;
        return subTotal;
    }

    public double calculateDiscount() {
        discount = calculateSubtotal() * (discountPercentage / 100);
        return discount;
    }

    public double calculateFinalPrice() {
        finalPrice = calculateSubtotal() - calculateDiscount();
        return finalPrice;
    }

    public void displayCartItem() {
        System.out.println("-------- Cart Item --------");
        System.out.printf("Product      : %s%n", productName);
        System.out.printf("Price        : %.2f%n", price);
        System.out.printf("Quantity     : %d%n", quantity);
        System.out.printf("Subtotal     : %.2f%n", calculateSubtotal());
        System.out.printf("Discount     : %.2f%n", calculateDiscount());
        System.out.printf("Final Price  : %.2f", calculateFinalPrice());
    }
}

public class ShoppingCartItem {
    public static void main(String[] args) {
        CartItem defaultCartItem = new CartItem();
        System.out.println("Default Cart Item.");
        defaultCartItem.displayCartItem();
        System.out.println("\n- - - - - - - - - - - - - - ");
        CartItem cartItem1 = new CartItem("Wireless Mouse");
        System.out.println("Cart Item 1.");
        cartItem1.displayCartItem();
        System.out.println("\n- - - - - - - - - - - - - - ");
        CartItem cartItem2 = new CartItem("Mechanical Keyboard", 2499.00);
        System.out.println("Cart Item 2.");
        cartItem2.displayCartItem();
        System.out.println("\n- - - - - - - - - - - - - - ");
        CartItem cartItem3 = new CartItem("USB-C Cable", 499.00, 3);
        System.out.println("Cart Item 3.");
        cartItem3.displayCartItem();
        System.out.println("\n- - - - - - - - - - - - - - ");
        CartItem cartItem4 = new CartItem("Gaming Headset", 3499.00, 2, 10.0);
        System.out.println("Cart Item 4.");
        cartItem4.displayCartItem();
    }
}
