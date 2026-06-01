import java.io.*;
import java.util.*;

class BankAccount{
    private String accountHolder;
    private double  balance ;
    
    BankAccount(String accountHolder, double balance ){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposit Successful");
        }
        else{
            System.out.println("Invalid Deposit Amount");
        }
    }
    
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid Withdrawal Amount");
        }
        else if(balance < amount){
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= amount ;
            System.out.println("Withdrawal Successful");
        }
    }
    
    public void display(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
public class contest60_q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        int balance = sc.nextInt();
        int deposit = sc.nextInt();
        int withdraw = sc.nextInt();
        
        BankAccount b = new BankAccount(name, balance);
        
        b.deposit(deposit);
        b.withdraw(withdraw);
        b.display();
        
        sc.close();
    }
}
