package java_start.array;

public class ArrayDi2 {
    public static void main(String[] args) {

        // 2x3 2차원 배열을 만든다.

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


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
