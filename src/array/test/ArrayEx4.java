package array.test;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요 : ");
        for(int i=0; i< numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }
        double avg = (double) total / numbers.length;
        System.out.println("입력한 정수의 합계 ; " + total);
        System.out.println("입력한 정수의 평균 : " + avg);
    }
}
