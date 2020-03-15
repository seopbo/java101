public class SavingsAccount extends BankAccount{
    private double interest;

    public void setInterest (double interest) {
        this.interest = interest;
    }

    public double getInterest () {
        return this.interest;
    }

    public void addInterest () {
        this.setBalance((int) (this.getBalance() * (1 + this.interest)));
    }
}
