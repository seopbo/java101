public class Person {
    /*
        private 접근제어자: 변수 또는 메소드는 이 클래스 내에서만 사용 가능하다.
    */
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    /*
        생성자 (constructor)와 생성자 오버로딩
    */
    // 생성자
    public Person(String pName, int pAge) {
        name = pName;
        if (pAge < 0){
            age = 12;
        } else {
            age = pAge;
        }
        cashAmount = 0;
    }
    // 생성자 오버로딩
    public Person(String pName, int pAge, int pCashAmount) {
        name = pName;
        if (pAge < 0){
            age = 12;
        } else {
            age = pAge;
        }
        if (pCashAmount < 0) {
            cashAmount = 0;
        } else {
            cashAmount = pCashAmount;
        }
    }
    /*
        public 접근제어자: 변수 또는 메소드는 공개적으로 사용 가능하다. (해당 클래스 밖에서도)
     */
    // age 관련 getter, setter method
    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }
    public int getAge() {
        return age;
    }

    // name 관련 getter, setter method
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    // cashAmount 관련 getter, setter method
    public void setCashAmount(int newCashAmount) {
        if (newCashAmount >= 0) {
            cashAmount = newCashAmount;
        }
    }
    public int getCashAmount() {
        return cashAmount;
    }

    // account 관련 getter, setter method
    public void setAccount(BankAccount newBankAccount) {
        account = newBankAccount;
    }
    public BankAccount getAccount() {
        return account;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        if (amount < 0 || amount > account.getBalance()) {
            System.out.printf("%b - from: %s, to: %s, amount: %d, balance: %d\n",
                    false, name, to.getName(), amount, account.getBalance());
            return false;
        } else {
            account.setBalance(account.getBalance() - amount);
            to.getAccount().setBalance(to.getAccount().getBalance() + amount);
            System.out.printf("%b - from: %s, to: %s, amount: %d, balance: %d\n",
                    true, name, to.getName(), amount, account.getBalance());
            return true;
        }
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        // insert code here
        if (amount < 0 || amount > account.getBalance()) {
            System.out.printf("%b - from: %s, to: %s, amount: %d, balance: %d\n",
                    false, name, to.getOwner().getName(), amount, account.getBalance());
            return false;
        } else {
            account.setBalance(account.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);
            System.out.printf("%b - from: %s, to: %s, amount: %d, balance: %d\n",
                    true, name, to.getOwner().getName(), amount, account.getBalance());
            return true;
        }

    }
}