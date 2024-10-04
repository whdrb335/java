package java_start.array.test;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("정수 5개를 입력하세요 : ");
        for(int i= numbers.length -1; i > -1 ; i--) {
            numbers[i] = scanner.nextInt();
        }

        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]);
            // 0 1 2 3
            if(i<numbers.length - 1) {
                System.out.print(",");
            }
        }

    }
}
