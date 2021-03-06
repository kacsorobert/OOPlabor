package labor3_2;

import labor3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount[] accounts=new BankAccount[MAX_ACCOUNTS];
    private int numAccounts;
    public static final int MAX_ACCOUNTS=10;

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

    public BankAccount getAccount(String accountNumber) {
        for(int i=0;i<numAccounts;i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }

        }
        return null;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account) {
        if(account==null){
            return;
        }
        if(numAccounts==MAX_ACCOUNTS){
            System.out.println("Too many accounts!");
            return;
        }
        accounts[numAccounts]=account;
        numAccounts++;
    }

    public void closeAccount(String accountNumber){
        int i;
        for(i=0;i<numAccounts;i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                for(i=i;i<numAccounts-1;i++){
                    accounts[i]=accounts[i+1];
                }
                accounts[i]=null;
                numAccounts--;
                return;
            }
        }
        System.out.println("This account doesn't exist!");
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i].toString() +"\n");
        }
        return result.toString();
    }
}