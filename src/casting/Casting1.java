package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = (long) intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = (double) intValue; // 앞의 형변환은 생략이 가능하다 단 큰 그릇에 작은 그릇에 할때!
        System.out.println("doubleValue = " + doubleValue);
        
        doubleValue = 20L;
        System.out.println("doubleValue = " + doubleValue);
    }
}
