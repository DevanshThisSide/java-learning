package JL07_oops;

// Book Management System
class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;

    // Constructors are used to initialize object data when an object is created.
    // It has the same name as the class.
    //It has no return type, not even void.
    //It is called automatically when an object is created.
    public Book() {
        // Default constructor
        // Initializes the object with predefined default values.
        bookId = 0;
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        System.out.println("Default Constructor Called.");
    }

    // Parameterized constructor
    // Initializes the object using values provided during object creation.
    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized Constructor Called.");
    }

    public void printBookDetails() {
        System.out.println("------ Book Details ------");
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.printf("Price   : ₹%.2f%n", price);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.printBookDetails();
        System.out.println();
        Book book1 = new Book(101,
                "Atomic Habits",
                "James Clear",
                499);
        book1.printBookDetails();
    }
}
