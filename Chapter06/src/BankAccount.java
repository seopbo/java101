public class BankAccount {
    private int balance;
    private Person owner;

    // balance 관련 getter, setter method
    public void setBalance (int newBalance) {
        balance = newBalance;
    }

    public int getBalance () {
        return balance;
    }
    // owner 관련 getter, setter method
    public void setOwner (Person newOwner) {
        owner = newOwner;
    }
    public Person getOwner () {
        return owner;
    }
    // 파라미터: 입금할 액수
    // 리턴: 성공 여부 (불린)
    public boolean deposit (int amount) {
        if (amount < 0 || owner.getCashAmount() < amount) {
            System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원\n", balance, owner.getCashAmount());
            return false;
        } else {
            balance = balance + amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원\n", amount, balance, owner.getCashAmount());
            return true;
        }
    }
    /*
        method overloading: 서로 다른 function signature (자바면 method signature)를 하나의 이름으로 정의하는 것,
        function signature는 해당 function의 parameter type list
     */
    // 파라미터: 출금할 액수
    // example
    public boolean deposit(double amount, double exchangeRate) {
        return deposit((int) (amount * exchangeRate));
    }
    // 리턴: 성공 여부 (불린)
    public boolean withdraw (int amount) {
        if (amount < 0 || amount > balance) {
            System.out.printf("출금 실패입니다. 잔고: %d원, 현금: %d원\n", balance, owner.getCashAmount());
            return false;
        } else {
            balance = balance - amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원\n", amount, balance, owner.getCashAmount());
            return true;
        }
    }

    // 첫 번째 파라미터 : 받는 사람(Person)
    // 두 번째 파라미터 : 이체할 금액(정수)
    // 리턴 : 성공여부(불린)
    // boolean transfer(Person to, int amount) {
    // (다음 과제에서 사용하므로, 우선 skip합니다.)
    // }
}
