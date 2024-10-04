package java_start.scanner.onemore;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;

        while(true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1) {
                System.out.print("상품명을 입력하세요 : ");
                String name = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int qty = scanner.nextInt();

                scanner.nextLine();

                int sum = (price * qty);

                System.out.println("상품명 : " + name + " 가격 : " + price + " 수량 : " + qty + " 합계 : " + sum);
                totalPrice += sum;
                continue;
            }
            else if(option == 2) {
                System.out.println("총 비용 : " + totalPrice);
            }
            else if(option == 3) {
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("잘못된 옵션 번호입니다. 다시 해주세요");
                continue;
            }
        }



    }
}
