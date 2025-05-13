package library;

public class member extends User {
    private int borrowBookCount;
    private final  static int maxBorrowLimit = 5;
    @Override
    public void displayDashboard() {
        System.out.println("Welcome to the Library Dashboard, " + getName());
        System.out.println("User ID: " + getuserId());
        System.out.println("Contact Info: " + getcontactInfo());
        System.out.println("You have borrowed " + borrowBookCount + " books.");
        System.out.println("You can borrow " + (maxBorrowLimit - borrowBookCount) + " more books.");
    }
    @Override
    public boolean canBorrowBooks() {
        return borrowBookCount < maxBorrowLimit;
    }
    member(String name,String contactInfo) {
        super(name, contactInfo);
        this.borrowBookCount = 0;
    }
    member() {
        super();
        this.borrowBookCount = 0;
    }
    public void returnBook(String bookTitle) {
        // Logic to return a book
        borrowBookCount--;
        System.out.println("Book returned: " + bookTitle);
    }
}
