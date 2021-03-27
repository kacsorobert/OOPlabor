package labor6_1;

/**
 * folyoszamla
 */

public class CheckingAccount extends BankAccount{
    private double overdraftLimit; //hitelkeret

    public CheckingAccount(double overdraftLimit) {
        //itt meghivodik az osztaly constructora
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}
