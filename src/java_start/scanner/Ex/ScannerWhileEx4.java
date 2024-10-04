package java_start.scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;

        while (true) {
            System.out.print("1 : 상품 입력, 2: 결제, 3: 프로그램 종료 : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            }
            else if (option == 1) {
                System.out.print("상품명을 입력하세요 : ");
                String str1 = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int goodQty = scanner.nextInt();

                totalPrice += (price * goodQty);
                System.out.println("상품명 : " + str1 + " 가격 : " + price + " 수량 : " + goodQty + " 합계 : " + (price * goodQty));
            }
            else if(option == 2) {
                System.out.println("총 비용 : " + totalPrice);
            }
            else {
                System.out.println("올바른 옵션을 선택하세요!");
            }
        }
    }
}
