package java_start.scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;

        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m); // 블록 내부에서 외부는 접근 가능
            System.out.println("for i = " + i);
        } // i 생존 종료

        System.out.println("main m = " + m);
        //System.out.println("main i = " + i); i는 for문 내에서 끝나기 때문에 안됌

    }
}
