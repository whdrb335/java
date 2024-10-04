package java_start.method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalMoney = 0;




        while (true) {
            System.out.println("=========================");
            System.out.println("1.입금 | 2. 출금 | 3.잔액확인 | 4.종료");
            System.out.println("=========================");
            System.out.print("선택 : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1) {
                System.out.print("입금액을 선택하세요 : ");
                int getMoney = scanner.nextInt();

                totalMoney = getMoney(totalMoney,getMoney);
                scanner.nextLine();
                continue;
            }
            else if(option == 2) {

                System.out.print("출금액을 선택하세요 : ");
                int exitMoney = scanner.nextInt();
                if(totalMoney < exitMoney) {
                    System.out.println(exitMoney+"를 출금하려 했으나 잔액이부족합니다");
                    continue;
                }
                totalMoney = exitMoney(totalMoney, exitMoney);

            }
            else if(option == 3) {
                System.out.println("현재 잔액 : " + totalMoney);
                continue;
            }
            else if(option == 4) {
                System.out.println("시스템 종료");
                break;
            }
            else {
                System.out.println("다른 옵션을선택하세요");
                continue;
            }

        }

    }

    public static int getMoney(int totalMoney, int getMoney) {

        totalMoney += getMoney;
        System.out.println(getMoney+"원을 입금하였습니다. 현재 잔액 : " + totalMoney);
        return totalMoney;
    }

    public static int exitMoney(int totalMoney, int exitMoney) {
        totalMoney -= exitMoney;
        System.out.println(exitMoney+"원을 출금하였습니다. 현재 잔액 : " + totalMoney);
        return totalMoney;
    }
}
