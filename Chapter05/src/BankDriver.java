public class BankDriver {
    public static void main(String[] args) {
        // 사람 선언
        Person p1 = new Person();
        p1.name = "김신의";
        p1.age = 28;
        p1.cashAmount = 30000;

        Person p2 = new Person();
        p2.name = "김보섭";
        p2.age = 32;
        p2.cashAmount = 100000;

        // 은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.balance = 100000;
        p1.account = a1;
        a1.owner = p1;

        BankAccount a2 = new BankAccount();
        a2.balance = 500000;
        p2.account = a2;
        a2.owner = p2;

        p2.account.deposit(30000);
        p2.account.withdraw(170000);
        p2.account.deposit(620000);
        p2.account.withdraw(890000);
    }
}
