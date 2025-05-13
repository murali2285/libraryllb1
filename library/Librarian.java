package library;

public class Librarian extends User {
    private String employeeId;
     @Override
     public void displayDashboard() {
          System.out.println("Welcome to the Library Dashboard, " + getName());
          System.out.println("User ID: " + getuserId());
          System.out.println("Contact Info: " + getcontactInfo());
          System.out.println("Employee ID: " + employeeId);
     }
     @Override
     public boolean canBorrowBooks() {
          return true;
     }
     Librarian(String name, String contactInfo, String employeeId) {
          super(name, contactInfo);
          this.employeeId = employeeId; 
     }
    //  void addnewbook(book book){
    //         System.out.println("Book added: " + book.getTitle());
    //  }
    //  void removebook(book book){
    //         System.out.println("Book removed: " + book.getTitle());
    //  }
    @Override
    public void returnBook(String bookTitle) {
            System.out.println("Book returned: " + bookTitle);
    }
}
