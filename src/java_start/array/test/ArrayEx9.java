package java_start.array.test;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {

        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrice = new int[maxProducts];
        int productCnt=0;
        int cnt = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품등록 | 2. 상품 목록 | 3.종료\n 메뉴를 선택하세요 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            if(menu == 1) {
                if (productCnt >= maxProducts) {
                    System.out.println("더이상 상품을 등록할 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCnt] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요 : ");
                productPrice[productCnt] = scanner.nextInt();
                productCnt++;

            }
            else if(menu == 2) {
                if(productCnt == 0) {
                    System.out.println("상품이 없습니다 추가해주세요!");
                    continue;
                }

                    for (int i=0; i<productCnt; i++) {
                        System.out.println(productNames[i] + ": " + productPrice[i] + "원");
                    }

            }
            else if(menu == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else {
                System.out.println("잘못된 번호입니다. 다시. 눌러주세용!");
                continue;
            }
        }
    }
}
