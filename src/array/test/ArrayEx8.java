package array.test;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요 : ");
        int count = scanner.nextInt();
        int[][] scores = new int[count][3];

        String[] subjects = {"국어","영어","수학"};

        for (int i=0; i<count; i++) {
            int total = 0;
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");
            for (int j=0; j<3; j++) {
                System.out.print(subjects[j]+" 점수 : ");
                scores[i][j] = scanner.nextInt();


            }
        }

        for(int i=0; i<count; i++) {
            int total = 0;
            for(int j=0; j<3; j++) {
                total += scores[i][j];
            }
            double avg = (double) total / count;
            System.out.println((i+1) + " 번 학생의 총점 : " + total + " , 평균 : " + avg);
        }

    }
}
