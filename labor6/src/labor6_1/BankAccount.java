package labor6_1;

public class BankAccount {
    protected final String accountNumber;
    public static final String PREFIX = "OTP";
    private static int numAccounts = 0;
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    protected double balance;

    protected BankAccount(){
        numAccounts++;
        this.accountNumber = createAccountNumber();
    }

    private static String createAccountNumber(){
        StringBuffer str=new StringBuffer();
        String temp=""+numAccounts;
        str.append(PREFIX);
        for(int i=0;i<ACCOUNT_NUMBER_LENGTH-PREFIX.length()-temp.length();i++){
            str.append('0');
        }
        str.append(numAccounts);
        return str.toString();
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
