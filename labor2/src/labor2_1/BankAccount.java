package labor2_1;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber){
        // shadowing - arnyekolas
        // accountNumber - lokalis valtozo (parameter)
        // this.accountNumber - az aktualis peldany (objektum) referenciaja
        this.accountNumber = accountNumber;
    }

    // getter - lekerdezo tipusu muvelet
    public String getAccountNumber(){
        return accountNumber;
    }

    // getter - lekerdezo tipusu muvelet
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
}
