public class BankDriver {
    public static void main(String[] args) {
        // 사람 선언
        Person p2 = new Person();
        p2.setName("김보섭");
        p2.setAge(32);
        p2.setCashAmount(100000);

        // 은행 계좌 생성
        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);
        p2.setBankAccount(a2);
        a2.setOwner(p2);

        System.out.println(p2.getBankAccount().deposit(30000));
        System.out.println(p2.getBankAccount().withdraw(170000));
        System.out.println(p2.getBankAccount().deposit(620000));
        System.out.println(p2.getBankAccount().withdraw(890000));
    }
}