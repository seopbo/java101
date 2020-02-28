public class Person {
    /*
        private 접근제어자: 변수 또는 메소드는 이 클래스 내에서만 사용 가능하다.
    */
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;
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
    public void setBankAccount (BankAccount newBankAccount) {
        account = newBankAccount;
    }
    public BankAccount getBankAccount () {
        return account;
    }
}
