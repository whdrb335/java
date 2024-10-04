package java_start.IF;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: // break 가 없어서 case 3: 까지 가기때문에 break 를 무조건 써야한다.swich는 무조건 break와 함께!
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 : " + coupon);
    }
}
