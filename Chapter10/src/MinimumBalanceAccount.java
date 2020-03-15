public class MinimumBalanceAccount extends BankAccount {
    private int minimum;

    public void setMinimum (int minimum) {
        this.minimum = minimum;
    }

    public int getMinimum () {
        return this.minimum;
    }

    @Override
    public boolean withdraw (int amount) {
        // if (this.getBalance() - amount < minimum) {
        if (this.balance - amount < this.minimum) {
            System.out.printf("적어도 %d원은 남겨야합니다.\n", this.minimum);
            return false;
        }
        // this.setBalance(this.getBalance() - amount);
        this.balance -= amount;
        return true;
    }
}