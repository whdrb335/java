package IF;

public class EvenOddEx {
    public static void main(String[] args) {
        int a = 2;
        String result = (a % 2 == 0 ) ? "짝수" : "홀수";
        System.out.println(a + "는" + result + "입니다");
    }
}
