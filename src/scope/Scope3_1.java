package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;   // 이 코드는 temp가 if안에서만 쓰는데 밖에 까지 선언되어있어서 비효율적이다.
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
