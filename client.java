public class client {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        //b.balance = 24;
        b.setBalance(24);
        b.ownerName ="mu";
        b.deposit(24);
        b.withdraw(24);
        b.setOwnerName("murali");
        b.printTransactionhistory();
    }
}
