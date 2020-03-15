import java.util.ArrayList;

public class BankDriver {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        MinimumBalanceAccount mba = new MinimumBalanceAccount();
        SavingsAccount sa = new SavingsAccount();

        ArrayList<BankAccount> accounts = new ArrayList<>();
        /*
            아래의 코드에서 자식 클래스가 부모 클래스로 업캐스팅이 일어난다. 다만 이 경우 자식 클래스에서 새롭게 정의 메소드를 사용할 수는 없다.
            BankAccount sa2 = new SavingsAccount();

            자식 클래스의 메소드를 사ㅋ용하고 싶다면, 다시 다운캐스팅을 해야한다.
            ((SavingsAccount) sa2).addInterest();
        */
        accounts.add(ba);
        accounts.add(mba);
        accounts.add(sa);

        for (BankAccount account: accounts) {
            account.deposit(1000);
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            }
        }
    }
}
