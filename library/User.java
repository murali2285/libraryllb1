package library;

public abstract class User {
    String userId;
    String name;
    String contactInfo;
    private static int totalUsers = 0;  
    User(){
        this.userId = generateUserId();
    }
    User(String name, String contactInfo) {
        this.userId = generateUserId();
        this.name = name;
        this.contactInfo = contactInfo;
        
    }
    User(User other){
        this.userId = generateUserId();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
   }
    
     void setUserId(String userId) {
        this.userId = userId;
    }
    void setName(String name) {
        this.name = name;
    }
    void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    String getName() {
        return name;
    }
    String getcontactInfo() {
        return contactInfo;
    }
    String getuserId() {
        return userId;
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void returnBook(String bookTitle);
    static String totalUsers() {
        // Assuming we have a static variable to keep track of total users
        return "Total Users: " + totalUsers;
    }
    static int gettotalusers() {
        return totalUsers;
    }
    public  final String generateUserId() {
        totalUsers++;
        return "User - " + totalUsers; 
    }
    
}
