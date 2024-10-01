package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true){
            sum = sum + i;
            if(sum > 10) {
                System.out.println("합이 10 보다 크면 종료 : i = " + i + " sum = " + sum);
                break;
            }
            // sum이 10보다 커지는 순간 if 문을 타는것이다.
            i++;
        }
    }
}
