package labor6_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("OTP");
        bank.addCustomer(new Customer("John","Black"));
        bank.addCustomer(new Customer("Mary","White"));
        bank.getCustomer(1).addAccount(new CheckingAccount(500));
        bank.getCustomer(1).addAccount(new SavingsAccount(0.1));
        bank.getCustomer(2).addAccount(new CheckingAccount(700));
        bank.getCustomer(2).addAccount(new SavingsAccount(0.1));

        Random random=new Random();
        for(int i=1;i<=bank.numCustomers();i++){
            ArrayList<String>accountNumbers=bank.getCustomer(i).getAccountNumbers();
            for(String accountNumber : accountNumbers){
                BankAccount account=bank.getCustomer(i).getAccount(accountNumber);
                account.deposit(random.nextInt(1000));
            }
        }

        bank.printCustomersToStdout();

        for(int i=1;i<=bank.numCustomers();i++){
            ArrayList<String>accountNumbers=bank.getCustomer(i).getAccountNumbers();
            for(String accountNumber : accountNumbers){
                BankAccount account=bank.getCustomer(i).getAccount(accountNumber);
                if(account instanceof SavingsAccount){
                    ((SavingsAccount)account).addInterest();
                }
            }
        }

        bank.printCustomersToStdout();

        for(int i=1;i<=bank.numCustomers();i++){
            ArrayList<String>accountNumbers=bank.getCustomer(i).getAccountNumbers();
            for(String accountNumber : accountNumbers){
                BankAccount account=bank.getCustomer(i).getAccount(accountNumber);
                if(account instanceof CheckingAccount){
                    ((CheckingAccount)account).withdraw(random.nextInt(200));
                }
            }
        }

        bank.printCustomersToStdout();
    }
}
