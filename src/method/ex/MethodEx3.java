package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {

        int balance = 10000;

        System.out.println("현재 잔액은 : " + balance + "원 입니다.");
        balance = dipositAmount(balance,1000);
        balance = withdrawAmount(balance ,2000);
        System.out.println("최종 금액은 : " + balance);


    }

    public static int dipositAmount(int balance, int dipositAmount) {
        balance += dipositAmount;
        System.out.println(dipositAmount+"원을 입금하였습니다. 현재 잔액 : " + balance+"원 입니다.");
        return balance;
    }

    public static int withdrawAmount(int balance, int withdrawAmount){
        balance -=withdrawAmount;
        System.out.println(withdrawAmount+"원을 출금하였습니다. 현재 잔액 : " + balance + "원 입니다.");
        return balance;
    }
}
