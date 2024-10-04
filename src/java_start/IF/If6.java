package java_start.IF;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // 이렇게 독립적인 할인을 하면 if 문을 따로 써줘야 한다.
        if(price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }
        // 나이와 가격할인을 따로 받아야 하기 때문
        else if(age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }
        else {
            System.out.println("할인없음");
        }
        System.out.println("총 할인 금액 : " + discount + "원");

        if(true) System.out.println("if문에서 실행됨");
    }

}
