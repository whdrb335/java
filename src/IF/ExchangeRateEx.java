package IF;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 3;
        int exchangeMoney = dollar * 1300;

        if(dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        }
        else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        }
        else {
            System.out.println("환전 금액은 " + exchangeMoney + "입니다.");
        }
    }
}
