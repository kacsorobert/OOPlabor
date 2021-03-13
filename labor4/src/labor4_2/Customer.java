package labor4_2;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount>accounts = new ArrayList<>();

    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumAccounts(){
        return accounts.size();
    }

    public BankAccount getAccount(String accountNumber) {
        for(BankAccount account:accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }

        }
        return null;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account) {
        if(account==null){
            return;
        }

        accounts.add(account);
    }

    public void closeAccount(String accountNumber){
        for(BankAccount account:accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                accounts.remove(account);
                return;
            }
        }
        System.out.println("This account doesn't exist!");
    }

    @Override
    public String toString() {
        System.out.println(firstName + " " + lastName + " accounts:");
        for(BankAccount account:accounts){
            System.out.println("\t" + "BankAccount{" + "accountNumber='" + account.getAccountNumber() + "', balance=" + account.getBalance() + '}');
        }
        return "";
    }
}