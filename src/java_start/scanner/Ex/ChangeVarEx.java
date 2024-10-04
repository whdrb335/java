package java_start.scanner.Ex;

import java.util.Scanner;

public class ChangeVarEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 10;
        int b= 20;
        int temp;

        temp = a;
        a = b; // 둘다 20 이 되어버린다.
        b = temp;

        System.out.println(b);
        System.out.println(a);

    }
}
