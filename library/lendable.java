package library;

public interface lendable {
    public boolean lend(User user);
    public void returnBook(User user);
    public boolean isAvailable();
    public  abstract void dispaybookDetails();
}
