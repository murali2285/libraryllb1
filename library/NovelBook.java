package library;

public class NovelBook extends book {
    private String genre;
    private String author;
    private boolean isAvailable;

    public NovelBook(String genre, String author) {
        super();
        this.isAvailable = true; // Initially available
        this.genre = genre;
        this.author = author;
    }

    public NovelBook() {
        super();
        this.genre = "";
        this.author = "";
    }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            System.out.println("Novel lent to " + user.getName());
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
        System.out.println("Novel returned by " + user.getName());
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void dispaybookDetails() {
        System.out.println("Genre: " + genre);
        System.out.println("Author: " + author);
    }

}
