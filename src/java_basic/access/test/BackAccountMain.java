package java_basic.access.test;

import java_basic.access.BackAccount;

public class BackAccountMain {
    public static void main(String[] args) {

        BackAccountEx account = new BackAccountEx();
        account.deposit(-1000);
        account.withdraw(5000);
        System.out.println("현재 금액은 : " + account.getBalance());

    }
}
