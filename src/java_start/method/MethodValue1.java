package java_start.method;

public class MethodValue1 {
    public static void main(String[] args) {

        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1 : " + num1);
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1 : " + num1);
        // 자바의 "대원칙" 항상 변수값은 복제돼서 건네준다!!!!!

    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2 : " + num2);
        num2 *= num2;
        System.out.println("3. changeNumber 변경 후, num2 : " + num2);
    }
}

// 호출 전 : 5
//2. 변경 전 : 5
//3. 변경 후 : 25
