package library;

public class dummy implements lendable {
    private boolean available;
    private String title;
    private String author;
    private String isbn;
    private String userId;
    void setTitle(String title) {
        this.title = title;
    }
    void setAuthor(String author) {
        this.author = author;
    }
    void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    String getIsbn() {
        return isbn;
    }
    void setUserId(String userId) {
        this.userId = userId;
    }
    String getUserId() {
        return userId;
    }
    public dummy(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true; // Initially available
    }

    @Override
    public boolean lend(User user) {
        if (available && user.canBorrowBooks()) {
            available = false;
            return true; // Successfully lent
        }
        return false; // Not available or user can't borrow
    }

    @Override
    public void returnBook(User user) {
        available = true; // Mark as available again
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
    public void dispaybookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

}
