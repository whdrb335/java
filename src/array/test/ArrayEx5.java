package array.test;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수의 숫자를 적으시오 : ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        int sum = 0;

        System.out.println(count + "개의 정수를 입력하세요 : ");
        for (int i=0; i< numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        double avg = (double) sum / count;
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + avg);

    }
}
