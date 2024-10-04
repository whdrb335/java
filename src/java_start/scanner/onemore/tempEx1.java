package java_start.scanner.onemore;

public class tempEx1 {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int temp;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        temp = a;
        a = b;
        b = temp;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
