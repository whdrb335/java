package java_basic.access.test;

public class BankAccountEx1 {
    private int balance; // 외부에서 balance값을 임의로 정할수 없게 private로만 함


    public void deposit(int amount) {

        balance += amount;

    }

    public void withdraw(int amount){
        if (balance < amount) {
            System.out.println("출금 불가 돈 딸림");
        }
        else{
            balance -= amount;

        }
    }



    public void getBalance() {
        System.out.println("현재 금액은 : " + balance);
    }

}
