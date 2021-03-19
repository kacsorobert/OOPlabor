package labor5_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        ArrayList<BankAccount> accounts=new ArrayList<>();
        for(int i=0;i<150;i++){
            accounts.add(new BankAccount());
        }

        for(BankAccount account:accounts){
            System.out.println(account);
        }
        System.out.println();

        ArrayList<Customer> customers=new ArrayList<>();
        customers.add(new Customer("John","Black"));
        customers.get(customers.size()-1).addAccount(new BankAccount());

        customers.add(new Customer("Mary","White"));
        customers.get(customers.size()-1).addAccount(new BankAccount());

        customers.add(new Customer("Steve","Brown"));
        customers.get(customers.size()-1).addAccount(new BankAccount());

        for(Customer customer:customers){
            System.out.println(customer);
        }

        Bank bank=new Bank("OTP");
        bank.addCustomer(new Customer("Adam","Green"));
        bank.addCustomer(new Customer("Jack","Grey"));

        bank.getCustomer(1).addAccount(new BankAccount());
        bank.getCustomer(1).addAccount(new BankAccount());
        bank.getCustomer(2).addAccount(new BankAccount());
        bank.getCustomer(2).addAccount(new BankAccount());

        bank.getCustomer(1).toString();

        ArrayList<String> bankAccounts=new ArrayList<>();
        bankAccounts=bank.getCustomer(1).getAccountNumbers();

        for(String account:bankAccounts){
            Random random=new Random();
            bank.getCustomer(1).getAccount(account).deposit(1+ random.nextInt(1000));
        }

        bankAccounts=bank.getCustomer(2).getAccountNumbers();

        for(String account:bankAccounts){
            Random random=new Random();
            bank.getCustomer(2).getAccount(account).deposit(1+ random.nextInt(1000));
        }

        bank.getCustomer(2).toString();

        bank.printCustomersToFile("bank_customers.csv");
    }
}
