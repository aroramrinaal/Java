// Java Practice
// OOPS In Java

public class Main{
    public static void main(String[] args) {
        
    }
}

class BankAccount{
    private String owner;
    private double balance;

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    BankAccount(String owner,double balance){
        this.owner = owner;
        this.balance = balance;
    }
}