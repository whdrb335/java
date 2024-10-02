package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번재 숫자를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하세요 : ");
        int b = scanner.nextInt();

        if(a > b) {
            System.out.println("더 큰 숫자는 : " + a + "입니다");
        }
        else if (a < b) {
            System.out.println("더 큰 숫자는 : " + b + "입니다");
        }
        else {
            System.out.println("두 숫자는 같습니다.");
        }
    }
}
