package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다");
        printFooter();
    }

    // void는 반환타입이 필요없는 메서드이다.
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return; // return 생략가능!

    }
    // void는 반환타입이 필요없는 메서드이다.
    public static void printFooter() {
        System.out.println("프로그램을 종료합니다.");
        return; // return 생략가능!
    }
}
