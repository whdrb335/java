package java_start.loop;

public class While2_3Ex {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 100;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i = " + i + " sum=" + sum);
            i++;
        }
    }
}
