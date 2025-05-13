package library;

public abstract class book implements lendable {
    private boolean isavailable;
    private String title;
    private String author;
    private String isbn;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }   
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isavailable = true; // Initially available
    }
    book(){
        this.title = "Unknown Title";
    } 
    book(book other) {
        this.title = other.title;
        this.author = other.author;
        this.isbn = other.isbn;
        this.isavailable = other.isavailable; // Copy availability
    }

    @Override
    public boolean lend(User user) {
        if (isavailable && user.canBorrowBooks()) {
            isavailable = false;
            return true; // Successfully lent
        }
        return false; // Not available or user can't borrow
    }

    @Override
    public void returnBook(User user) {
        isavailable = true; // Mark as available again
        user.returnBook(String .valueOf(this)); // Return the book to the user
    }

    @Override
    public boolean isAvailable() {
        return isavailable;
    }

}
