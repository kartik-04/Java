import java.util.*;

public class BankAccount {
    String owner;
    double balance;

    void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Insufficient amount");
        }
    }

    void showBalance(){
        System.out.println(owner + " 's balance is : " + balance);
    }
}
