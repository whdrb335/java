package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫번째 숫자를 입력하세요 : ");
            String str1 = scanner.nextLine();

            System.out.print("두번째 숫자를 입력하세요 : ");
            String str2 = scanner.nextLine();

            if(str1.equals("0") && str2.equals("0")) {
                break;
            }
            System.out.println("입력하신 첫번째 숫자는 : " + str1);
            System.out.println("입력하신 두번째 숫자는 : " + str2);


        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
