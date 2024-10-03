package array;

public class ArrayDi4 {
    public static void main(String[] args) {

        // 2x3 2차원 배열을 만든다.

        int[][] arr = new int[50][100];

        int i = 1;
        for (int row=0; row<arr.length; row++) {
            for (int column=0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }


                                // arr.length는 행의 개수
        for (int row = 0; row < arr.length; row++) { // 외부는 행을 탐색
                                // arr[row].length가 요소 안의 개수
            for (int column=0; column<arr[row].length; column++) { // 내부는 열을 탐색
                System.out.print(arr[row][column] + " ");

            }
            System.out.println();
        }

    }
}
