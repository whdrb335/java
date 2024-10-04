package java_start.loop;

public class Break1Ex {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            if(sum > 10) {
                System.out.println("i = " + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
