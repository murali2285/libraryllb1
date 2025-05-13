import java.util.ArrayList;

public class BankAccount {
    private double balance;
    public String ownerName;
    public ArrayList<Double> transactionlog;
    public BankAccount(){
        System.out.println("constructor 1 called");
        balance = 24;
        ownerName = "sai";
        transactionlog = new ArrayList<>();
    }
    public BankAccount(double balance){
        System.out.println("constructor 2 called");
        balance = 12;
    }
    void deposit(double amount){
        if(amount > 0){
        balance = balance + amount;
        System.out.println(balance);
        transactionlog.add(amount);
        }
        else{
            System.out.println("invaild amount");
        }
    }
    void withdraw(int amount){
        if (balance < amount && amount < 0){
            System.out.println("you can't withdraw that amount");
        }
        else{
            balance = balance - amount;
            System.out.println(amount);
            transactionlog.add(balance);
        }
    }
    void getBalance(){
        System.out.println("balance"+balance);
    }
    void setBalance(double newbalance){
        balance = newbalance;
        System.out.println("new balance "+ newbalance);
    }
    void setOwnerName(String name){
        ownerName = name;
        System.out.println("new name "+ownerName);
    } 
    void printTransactionhistory(){
        System.out.println(transactionlog);
    }

}
