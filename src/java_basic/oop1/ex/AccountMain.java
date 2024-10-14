package java_basic.oop1.ex;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        Account account = new Account();

        int amount = 0;
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);


    }
}
