package array.test;

import java.util.Scanner;

public class ArrayEx9_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrice = new int[10];
        int cnt = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3.종료");
            System.out.print("메뉴를 선택해주세요 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();



            if(menu == 1) {
                if(cnt >= 10) {
                    System.out.println("더이상 등록할수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[cnt] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요 : ");
                productPrice[cnt] = scanner.nextInt();

                cnt++;

            }
            else if(menu == 2) {
                for(int i=0; i<cnt; i++) {
                    System.out.println(productNames[i] + " : " + productPrice[i] + "원");
                    continue;
                }
            }

            else if(menu == 3) {
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요");
                continue;
            }

        }



    }
}
