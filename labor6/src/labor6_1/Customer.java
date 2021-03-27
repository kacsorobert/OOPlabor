package labor6_1;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    //polimorfikus tomb
    private ArrayList<BankAccount>accounts = new ArrayList<>();
    private final int id;
    private static int numCustomers;

    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        numCustomers++;
        this.id=numCustomers;
    }

    public int getId() {
        return id;
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

    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> accountNumbers=new ArrayList<>();
        for(BankAccount account:accounts){
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
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
        System.out.println("ID: " + id + " " + firstName + " " + lastName + " accounts:");
        for(BankAccount account:accounts){
            System.out.print("\t" + "BankAccount{" +
                    "accountNumber='" + account.getAccountNumber() +
                    "', balance=" + account.getBalance() + ", ");
            if(account instanceof SavingsAccount){
                System.out.println("Interest rate=" + ((SavingsAccount)account).getInterestRate() + '}');
            }
            else if(account instanceof CheckingAccount){
                System.out.println("Overdraft limit=" + ((CheckingAccount)account).getOverdraftLimit() + '}');
            }
        }
        return "";
    }
}