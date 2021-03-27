package labor6_1;

/**
 * takarekszamla
 */

public class SavingsAccount extends BankAccount{
    private double interestRate;    //kamatlab

    public SavingsAccount(double interestRate) {
        // az osztaly constructora automatikusan hivodik
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest(){
        this.balance+=this.interestRate*this.balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
