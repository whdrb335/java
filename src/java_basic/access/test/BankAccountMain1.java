package java_basic.access.test;

public class BankAccountMain1 {
    public static void main(String[] args) {

        BankAccountEx1 account = new BankAccountEx1();

        account.deposit(10000);
        account.getBalance();

        account.withdraw(5000);
        account.getBalance();

        account.withdraw(6000);
        account.getBalance();
    }
}
