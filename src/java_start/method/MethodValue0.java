package java_start.method;

public class MethodValue0 {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = num1; // num1의 값을 복사해서 num2에 집어넣는 개념!
        num2 = 10;

        System.out.println("num1 = " +num1);
        System.out.println("num2 = " + num2);
    }
}
