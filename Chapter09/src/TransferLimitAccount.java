public class TransferLimitAccount extends BankAccount {
    private int transferLimit;

    @Override
    public boolean withdraw (int amount) {
        if (amount > this.transferLimit) {
            return false;
        }
        this.getBalance();
        return super.withdraw(amount);
    }
}
