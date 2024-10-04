package java_start.array.testEx;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int num = scanner.nextInt();
        int sum = 0;
        int[] arrays = new int[num];

        System.out.println("3개의 정수를 입력하세요 : ");
        for (int i=0; i< arrays.length; i++) {
            arrays[i] = scanner.nextInt();
            sum += arrays[i];
        }
        double avg = (double) sum / num;
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입ㄹ겨한 정수 의 평균 : " + avg);
    }
}
