package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요 :");
            String str = scanner.nextLine();
            if(str.equals("exit")) {
                break;
            }
            System.out.println("입력한 문자열 : " + str);
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
