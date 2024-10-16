package java_basic.access.test;

import java_basic.oop1.ex.Account;

public class BackAccountEx {

    private int balance;


    public BackAccountEx() {
        balance  =0;
    }
    public void deposit(int amount) {
        balance += amount;
    }


    public void withdraw(int amount) {
        if (isValidMoney(amount)) {
            balance -= amount;
        }else {
            System.out.println("금액 초과용");
        }
    }

    public int getBalance() {
        return balance;
    }


    private boolean isValidMoney(int amount) {
        return amount > 0;
    }
}
