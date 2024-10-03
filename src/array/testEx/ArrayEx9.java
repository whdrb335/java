package array.testEx;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] productName = new String[10];
        int[] price = new int[10];
        int productCnt= 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1) {
                if(productCnt > 10) {
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요 : ");
                productName[productCnt] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요 : ");
                price[productCnt] = scanner.nextInt();
                productCnt++;

                continue;

            }
            else if(option == 2) {
                for(int i=0; i<productCnt; i++) {
                    System.out.println(productName[i]+" : " + price[i] + "원");
                }
            }
            else if(option == 3) {
                System.out.println("프로그램을 종료");
                break;
            }
            else {
                System.out.println("잘못된 번호입니다 다시 눌러주세요");
                continue;
            }
        }

    }
}
