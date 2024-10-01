package loop.Test;

public class WhileEx3 {
    public static void main(String[] args) {
        int i = 1;
        int maxNum = 100;
        int sum = 0;

        while (i <= maxNum) {
            sum += i;
            System.out.println("i=" + i + " sum=" +sum);
            i++;
        }
    }
}
