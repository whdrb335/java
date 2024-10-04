package java_start.method;

public class Method1Ref1 {
    public static void main(String[] args) {
        // 메서드는 한번 정의해두면 재사용 할 수 있다.!

        // 계산 1
        int sum1 = add(5,10); // 메서드를 만나면 메서드를 먼저 수행한다.
        System.out.println("결과 1 출력 : " + sum1);
        System.out.println();


        // 계산 2
        int sum2 = add(15,20);// 인자(아규먼트)
        System.out.println("결과 2 출력: " + sum2);

    }

    //add 메서드 (함수)
    public static int add(int a, int b)/*매개 변수(파라미터)*/ {
        System.out.println("하윙");
        System.out.println(a+ "+" + b + " 연산 수행");
        int sum = a + b;

        return sum; // 결과를 반환한다

    }
}
