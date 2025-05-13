package library;

public class textbook extends book {
    private String subject;
    private String edition;
    private boolean isAvailable;

    public textbook(String subject, String edition) {
        super();
        this.isAvailable = true; // Initially available
        this.subject = subject;
        this.edition = edition;
    }

    public textbook() {
        super();
        this.subject = "";
        this.edition = "";
       }

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            System.out.println("Textbook lent to " + user.getName());
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
        System.out.println("Textbook returned by " + user.getName());
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public void dispaybookDetails() {
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
    }

}
