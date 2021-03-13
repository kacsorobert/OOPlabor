package labor4_2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount<0){
            return;
        }
        balance+= amount;
    }

    public boolean withdraw(double amount){
        if(amount>balance){
            return false;
        }
        balance-=amount;
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
