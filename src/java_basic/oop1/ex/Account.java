package java_basic.oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금하신 금액은 : " + amount + "원 입니다.");
    }

    void withdraw(int amount) {
        if(balance < amount) {
            System.out.println("잔액이 부족합니다.");
            System.out.println("잔고 : " + balance);
        }
        else {

        balance -= amount;
        System.out.println("출금하신 금액은 : " + amount + "원 입니다.");
        }
    }


}
