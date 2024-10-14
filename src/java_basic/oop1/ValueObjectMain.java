package java_basic.oop1;

public class ValueObjectMain {
    public static void main(String[] args) {

        ValueData valueData = new ValueData();

        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("숫자 증가 = " + valueData.value);
    }

}
