package IF;
// 10/1 화요일
public class If3 {
    public static void main(String[] args) {
        int age = 14;

        if(age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }
        if(age >= 14 && age <= 16) {
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        }
        if(age >= 20) {
            System.out.println("성인");
        }

        // 이런 식으로 쓰면 약간 중복 느낌이 난다.
    }
}
