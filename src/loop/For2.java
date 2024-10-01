package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;
        for (int i = 1; i <= endNum; i++) { // for문이 while문 보다 뭔가 한줄에 한방에 해결하는 느낌이 있다!
            sum = sum + i;
            System.out.println("i = " + i + " sum = "+ sum);
        }
    }
}
