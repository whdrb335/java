package method;

public class MethodReturn2 {
    public static void main(String[] args) {

        age(16);

    }
    public static int age(int age) {
        if(age >= 18) {
            System.out.println("입장가능여~");
            return age;
            // return 생략가능~
        }
        else {
            System.out.println("미성년자는 안되용 ㅠㅠ");
            return age;
        }
    }
}
