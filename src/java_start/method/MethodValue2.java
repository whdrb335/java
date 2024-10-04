package java_start.method;

public class MethodValue2 {
    public static void main(String[] args) {

        int number = 5;
        System.out.println("1. changeNumber 호출 전, number : " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number : " + number);
        // 자바의 "대원칙" 항상 변수값은 복제돼서 건네준다!!!!!
        // main의 number는 5 changeNumber는 10

    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number : " + number);
        number *= number;
        System.out.println("3. changeNumber 변경 후, number : " + number);
    }
}

// 호출 전 : 5
//2. 변경 전 : 5
//3. 변경 후 : 25
