package java_start.IF;

public class Switch4 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 : " + coupon);

        // 이 switch 문은 아직 널리 보급되어있지는 않아서 참고로 알아보자!
    }
}
