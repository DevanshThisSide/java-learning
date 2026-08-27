package JL07_oops;

// A static member belongs to the class rather than a particular object of the class.
// Static variables are shared among all objects of the class.
// Static members/methods can be accessed/called using the class name without creating an object.
//
// Library Book Tracker
class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isIssued = false;

    static String libraryName;
    static int totalBooks;

    //  A static block executes when the class is loaded, before the main() method executes.
    static { // Initialize static variables.
        libraryName = "Hogwarts Library";
        totalBooks = 0;
        System.out.println("Static Block Executed - Library Name Set to Hogwarts Library And Book Count set to 0.");
    }

    public LibraryBook() {
        this.title = "Not Available";
        this.author = "Unknown";
        this.price = 0.00;
    }

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;
    }

    public void displayBook() {
        System.out.println("---- Book Details ----");
        System.out.println("Title   : " + this.title);
        System.out.println("Author  : " + this.author);
        System.out.println("Price   : " + this.price);
    }

    public void issueBook() {
        this.isIssued = true;
    }

    public String bookIssueStatus() {
        if (this.isIssued) {
            return "Issued.";
        } else {
            return "Not Issued.";
        }
    }

    static void displayLibraryInfo() { // A static method cannot directly access instance variables because instance variables belong to objects.
        System.out.println("---- Library Details ----");
        System.out.println("Library Name : " + libraryName);
        System.out.println("Total Books : " + totalBooks);
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        LibraryBook defaultBook = new LibraryBook();
        defaultBook.displayBook();

        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Colno", 399.00);
        LibraryBook book2 = new LibraryBook("Atomic Habits", "James Clear", 550.00);
        LibraryBook book3 = new LibraryBook("Clean Code", "Robert C. Martin", 699.00);
        LibraryBook book4 = new LibraryBook("Head First Java", "Kathy Sierra", 799.00);

        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
        book4.displayBook();

        book2.issueBook();
        book4.issueBook();

        System.out.println("Book 2 Status : " + book2.bookIssueStatus());
        System.out.println("Book 3 Status : " + book3.bookIssueStatus());

        LibraryBook.displayLibraryInfo();

        // libraryName is static, so changing it through the class changes the shared value for all LibraryBook objects
        System.out.println("Library Name Changed to Central Knowledge Library");
        LibraryBook.libraryName = "Central Knowledge Library";
        LibraryBook.displayLibraryInfo();
    }
}